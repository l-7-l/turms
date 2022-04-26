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

import ResponseStatusCode from '../model/response-status-code';
import { TurmsNotification } from '../model/proto/notification/turms_notification';

export default class ResponseError extends Error {
    private readonly _code: number;
    private readonly _reason: string;

    private constructor(code: number, reason: string) {
        super(`${code}:${reason}`);
        this._code = code;
        this._reason = reason;
    }

    get isResponseError(): boolean {
        return true;
    }

    get code(): number {
        return this._code;
    }

    get reason(): string {
        return this._reason;
    }

    override toString(): string {
        return `${this._code}:${this._reason}`;
    }

    static fromNotification(notification: TurmsNotification): ResponseError {
        return new ResponseError(notification.code, notification.reason);
    }

    static from(code: number, reason?: string): ResponseError {
        return new ResponseError(code, reason);
    }

    static fromCode(code: number): ResponseError {
        return new ResponseError(code, null);
    }

    static illegalParam(reason: string): never {
        throw new ResponseError(ResponseStatusCode.ILLEGAL_ARGUMENT, reason);
    }

    static notFalsy(name: string, notEmpty = false): never {
        const emptyPlaceholder = notEmpty ? ' or empty' : '';
        ResponseError.illegalParam(`${name} must not be null${emptyPlaceholder} or an invalid param`);
    }

    static illegalParamPromise<T = never>(reason: string): Promise<T> {
        const exception = new ResponseError(ResponseStatusCode.ILLEGAL_ARGUMENT, reason);
        return Promise.reject(exception);
    }

    static notFalsyPromise<T = never>(name: string, notEmpty = false): Promise<T> {
        const emptyPlaceholder = notEmpty ? ' or empty' : '';
        return ResponseError.illegalParamPromise(`${name} must not be null${emptyPlaceholder} or an invalid param`);
    }
}