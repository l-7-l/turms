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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: request/user/relationship/query_friend_requests_request.proto

package im.turms.server.common.access.client.dto.request.user.relationship;

/**
 * Protobuf type {@code im.turms.proto.QueryFriendRequestsRequest}
 */
public final class QueryFriendRequestsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.QueryFriendRequestsRequest)
    QueryFriendRequestsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryFriendRequestsRequest.newBuilder() to construct.
  private QueryFriendRequestsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryFriendRequestsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryFriendRequestsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryFriendRequestsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            areSentByMe_ = input.readBool();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000001;
            lastUpdatedDate_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequestOuterClass.internal_static_im_turms_proto_QueryFriendRequestsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequestOuterClass.internal_static_im_turms_proto_QueryFriendRequestsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest.class, im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ARE_SENT_BY_ME_FIELD_NUMBER = 1;
  private boolean areSentByMe_;
  /**
   * <code>bool are_sent_by_me = 1;</code>
   * @return The areSentByMe.
   */
  @java.lang.Override
  public boolean getAreSentByMe() {
    return areSentByMe_;
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private long lastUpdatedDate_;
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdatedDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  @java.lang.Override
  public long getLastUpdatedDate() {
    return lastUpdatedDate_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (areSentByMe_ != false) {
      output.writeBool(1, areSentByMe_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, lastUpdatedDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (areSentByMe_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, areSentByMe_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, lastUpdatedDate_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest)) {
      return super.equals(obj);
    }
    im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest other = (im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest) obj;

    if (getAreSentByMe()
        != other.getAreSentByMe()) return false;
    if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) return false;
    if (hasLastUpdatedDate()) {
      if (getLastUpdatedDate()
          != other.getLastUpdatedDate()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ARE_SENT_BY_ME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAreSentByMe());
    if (hasLastUpdatedDate()) {
      hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastUpdatedDate());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code im.turms.proto.QueryFriendRequestsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.QueryFriendRequestsRequest)
      im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequestOuterClass.internal_static_im_turms_proto_QueryFriendRequestsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequestOuterClass.internal_static_im_turms_proto_QueryFriendRequestsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest.class, im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest.Builder.class);
    }

    // Construct using im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      areSentByMe_ = false;

      lastUpdatedDate_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequestOuterClass.internal_static_im_turms_proto_QueryFriendRequestsRequest_descriptor;
    }

    @java.lang.Override
    public im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest getDefaultInstanceForType() {
      return im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest build() {
      im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest buildPartial() {
      im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest result = new im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.areSentByMe_ = areSentByMe_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.lastUpdatedDate_ = lastUpdatedDate_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest) {
        return mergeFrom((im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest other) {
      if (other == im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest.getDefaultInstance()) return this;
      if (other.getAreSentByMe() != false) {
        setAreSentByMe(other.getAreSentByMe());
      }
      if (other.hasLastUpdatedDate()) {
        setLastUpdatedDate(other.getLastUpdatedDate());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean areSentByMe_ ;
    /**
     * <code>bool are_sent_by_me = 1;</code>
     * @return The areSentByMe.
     */
    @java.lang.Override
    public boolean getAreSentByMe() {
      return areSentByMe_;
    }
    /**
     * <code>bool are_sent_by_me = 1;</code>
     * @param value The areSentByMe to set.
     * @return This builder for chaining.
     */
    public Builder setAreSentByMe(boolean value) {
      
      areSentByMe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool are_sent_by_me = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAreSentByMe() {
      
      areSentByMe_ = false;
      onChanged();
      return this;
    }

    private long lastUpdatedDate_ ;
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    @java.lang.Override
    public boolean hasLastUpdatedDate() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    @java.lang.Override
    public long getLastUpdatedDate() {
      return lastUpdatedDate_;
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @param value The lastUpdatedDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastUpdatedDate(long value) {
      bitField0_ |= 0x00000001;
      lastUpdatedDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastUpdatedDate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lastUpdatedDate_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:im.turms.proto.QueryFriendRequestsRequest)
  }

  // @@protoc_insertion_point(class_scope:im.turms.proto.QueryFriendRequestsRequest)
  private static final im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest();
  }

  public static im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryFriendRequestsRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryFriendRequestsRequest>() {
    @java.lang.Override
    public QueryFriendRequestsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryFriendRequestsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryFriendRequestsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryFriendRequestsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public im.turms.server.common.access.client.dto.request.user.relationship.QueryFriendRequestsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
