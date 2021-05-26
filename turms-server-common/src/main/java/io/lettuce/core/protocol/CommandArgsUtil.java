/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.lettuce.core.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;

import java.nio.charset.StandardCharsets;

/**
 * @author James Chen
 * @see CommandArgs
 */
public final class CommandArgsUtil {

    public static final int ARG_BYTEBUF_COMPONENT_COUNT = 5;

    public static final ByteBuf BULK_STRINGS_FLAG;
    public static final ByteBuf COMMAND_TYPE_FLAG;
    public static final ByteBuf CRLF;

    private static final int ARGUMENT_LENGTH_CACHE_SIZE = 64;
    private static final ByteBuf[] ARGUMENT_LENGTH_CACHE;


    static {
        BULK_STRINGS_FLAG = Unpooled.unreleasableBuffer(Unpooled.directBuffer(1).writeByte('$'));
        COMMAND_TYPE_FLAG = Unpooled.unreleasableBuffer(Unpooled.directBuffer(1).writeByte('*'));
        byte[] crlf = "\r\n".getBytes(StandardCharsets.US_ASCII);
        CRLF = Unpooled.unreleasableBuffer(Unpooled.directBuffer(crlf.length).writeBytes(crlf));

        ARGUMENT_LENGTH_CACHE = new ByteBuf[ARGUMENT_LENGTH_CACHE_SIZE];
        for (int i = 0; i < ARGUMENT_LENGTH_CACHE_SIZE; i++) {
            ARGUMENT_LENGTH_CACHE[i] = Unpooled.unreleasableBuffer(CommandArgsUtil.writeArgLength(i));
        }
    }

    private CommandArgsUtil() {
    }

    public static void encodeArgs(CompositeByteBuf out, CommandArgs<?, ?> args) {
        if (args == null) {
            return;
        }
        for (CommandArgs.SingularArgument arg : args.singularArguments) {
            if (arg instanceof CommandArgs.IntegerArgument argument) {
                writeStringArg(out, Long.toString(argument.val));
            } else if (arg instanceof CommandArgs.KeyArgument<?, ?> argument) {
                ByteBuf key = (ByteBuf) argument.key;
                writeByteBuf(out, key);
            } else if (arg instanceof CommandArgs.DoubleArgument argument) {
                writeStringArg(out, Double.toString(argument.val));
            } else if (arg instanceof CommandArgs.CharArrayArgument argument) {
                writeCharsArg(out, argument.val);
            } else if (arg instanceof CommandArgs.BytesArgument argument) {
                writeBytesArg(out, argument.val);
            } else if (arg instanceof CommandArgs.StringArgument argument) {
                writeStringArg(out, argument.val);
            } else if (arg instanceof CommandArgs.ValueArgument<?, ?> argument) {
                ByteBuf val = (ByteBuf) argument.val;
                writeByteBuf(out, val);
            }
        }
    }

    // Argument Meta Data Encoding

    public static ByteBuf getArgLength(int value) {
        if (value < ARGUMENT_LENGTH_CACHE_SIZE) {
            return ARGUMENT_LENGTH_CACHE[value];
        }
        return writeArgLength(value);
    }

    public static ByteBuf writeArgLength(int value) {
        if (value < 10) {
            return Unpooled.directBuffer(1)
                    .writeByte((byte) ('0' + value));
        }
        byte[] bytes = Long.toString(value).getBytes(StandardCharsets.US_ASCII);
        return Unpooled.directBuffer(bytes.length).writeBytes(bytes);
    }

    // Argument Encoding

    public static void writeBytesArg(CompositeByteBuf out, byte[] value) {
        int charLength = value.length;
        out.addComponent(true, BULK_STRINGS_FLAG)
                .addComponent(true, getArgLength(charLength))
                .addComponent(true, CRLF)
                .addComponent(true, Unpooled.directBuffer(charLength).writeBytes(value))
                .addComponent(true, CRLF);
    }

    public static ByteBuf writeBytesArg(byte[] value) {
        int charLength = value.length;
        return UnpooledByteBufAllocator.DEFAULT.compositeBuffer(5)
                .addComponent(true, BULK_STRINGS_FLAG)
                .addComponent(true, getArgLength(charLength))
                .addComponent(true, CRLF)
                .addComponent(true, Unpooled.directBuffer(charLength).writeBytes(value))
                .addComponent(true, CRLF);
    }

    public static void writeByteBuf(CompositeByteBuf out, ByteBuf value) {
        out.addComponent(true, BULK_STRINGS_FLAG)
                .addComponent(true, getArgLength(value.readableBytes()))
                .addComponent(true, CRLF)
                .addComponent(true, value)
                .addComponent(true, CRLF);
    }

    private static void writeCharsArg(CompositeByteBuf out, char[] value) {
        int charLength = value.length;
        ByteBuf buf = Unpooled.directBuffer(charLength);
        for (char c : value) {
            // We cast char to byte the same way as
            // io.lettuce.core.protocol.CommandArgs.CharArrayArgument.writeString
            // and we think Lettuce uses char[] because String uses char[] internally
            // before. Reference: https://openjdk.java.net/jeps/254
            buf.writeByte(c);
        }
        out.addComponent(true, BULK_STRINGS_FLAG)
                .addComponent(true, getArgLength(charLength))
                .addComponent(true, CRLF)
                .addComponent(true, buf)
                .addComponent(true, CRLF);
    }

    private static void writeStringArg(CompositeByteBuf out, String value) {
        writeBytesArg(out, value.getBytes(StandardCharsets.US_ASCII));
    }

}