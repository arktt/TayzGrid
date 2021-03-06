// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KeyValuePackageResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class KeyValuePackageResponseProtocol {
  private KeyValuePackageResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class KeyValuePackageResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use KeyValuePackageResponse.newBuilder() to construct.
    private KeyValuePackageResponse() {
      initFields();
    }
    private KeyValuePackageResponse(boolean noInit) {}
    
    private static final KeyValuePackageResponse defaultInstance;
    public static KeyValuePackageResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public KeyValuePackageResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_KeyValuePackageResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_KeyValuePackageResponse_fieldAccessorTable;
    }
    
    // repeated bytes keys = 1;
    public static final int KEYS_FIELD_NUMBER = 1;
    private java.util.List<com.google.protobuf.ByteString> keys_ =
      java.util.Collections.emptyList();
    public java.util.List<com.google.protobuf.ByteString> getKeysList() {
      return keys_;
    }
    public int getKeysCount() { return keys_.size(); }
    public com.google.protobuf.ByteString getKeys(int index) {
      return keys_.get(index);
    }
    
    // repeated .com.alachisoft.tayzgrid.common.protobuf.Value values = 2;
    public static final int VALUES_FIELD_NUMBER = 2;
    private java.util.List<com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value> values_ =
      java.util.Collections.emptyList();
    public java.util.List<com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value> getValuesList() {
      return values_;
    }
    public int getValuesCount() { return values_.size(); }
    public com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value getValues(int index) {
      return values_.get(index);
    }
    
    // repeated int32 flag = 3;
    public static final int FLAG_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> flag_ =
      java.util.Collections.emptyList();
    public java.util.List<java.lang.Integer> getFlagList() {
      return flag_;
    }
    public int getFlagCount() { return flag_.size(); }
    public int getFlag(int index) {
      return flag_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (com.google.protobuf.ByteString element : getKeysList()) {
        output.writeBytes(1, element);
      }
      for (com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value element : getValuesList()) {
        output.writeMessage(2, element);
      }
      for (int element : getFlagList()) {
        output.writeInt32(3, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      {
        int dataSize = 0;
        for (com.google.protobuf.ByteString element : getKeysList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getKeysList().size();
      }
      for (com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value element : getValuesList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      {
        int dataSize = 0;
        for (int element : getFlagList()) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(element);
        }
        size += dataSize;
        size += 1 * getFlagList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.keys_ != java.util.Collections.EMPTY_LIST) {
          result.keys_ =
            java.util.Collections.unmodifiableList(result.keys_);
        }
        if (result.values_ != java.util.Collections.EMPTY_LIST) {
          result.values_ =
            java.util.Collections.unmodifiableList(result.values_);
        }
        if (result.flag_ != java.util.Collections.EMPTY_LIST) {
          result.flag_ =
            java.util.Collections.unmodifiableList(result.flag_);
        }
        com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.getDefaultInstance()) return this;
        if (!other.keys_.isEmpty()) {
          if (result.keys_.isEmpty()) {
            result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
          }
          result.keys_.addAll(other.keys_);
        }
        if (!other.values_.isEmpty()) {
          if (result.values_.isEmpty()) {
            result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value>();
          }
          result.values_.addAll(other.values_);
        }
        if (!other.flag_.isEmpty()) {
          if (result.flag_.isEmpty()) {
            result.flag_ = new java.util.ArrayList<java.lang.Integer>();
          }
          result.flag_.addAll(other.flag_);
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              addKeys(input.readBytes());
              break;
            }
            case 18: {
              com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addValues(subBuilder.buildPartial());
              break;
            }
            case 24: {
              addFlag(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addFlag(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      }
      
      
      // repeated bytes keys = 1;
      public java.util.List<com.google.protobuf.ByteString> getKeysList() {
        return java.util.Collections.unmodifiableList(result.keys_);
      }
      public int getKeysCount() {
        return result.getKeysCount();
      }
      public com.google.protobuf.ByteString getKeys(int index) {
        return result.getKeys(index);
      }
      public Builder setKeys(int index, com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.keys_.set(index, value);
        return this;
      }
      public Builder addKeys(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        result.keys_.add(value);
        return this;
      }
      public Builder addAllKeys(
          java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
        if (result.keys_.isEmpty()) {
          result.keys_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
        }
        super.addAll(values, result.keys_);
        return this;
      }
      public Builder clearKeys() {
        result.keys_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated .com.alachisoft.tayzgrid.common.protobuf.Value values = 2;
      public java.util.List<com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value> getValuesList() {
        return java.util.Collections.unmodifiableList(result.values_);
      }
      public int getValuesCount() {
        return result.getValuesCount();
      }
      public com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value getValues(int index) {
        return result.getValues(index);
      }
      public Builder setValues(int index, com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.values_.set(index, value);
        return this;
      }
      public Builder setValues(int index, com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value.Builder builderForValue) {
        result.values_.set(index, builderForValue.build());
        return this;
      }
      public Builder addValues(com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.values_.isEmpty()) {
          result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value>();
        }
        result.values_.add(value);
        return this;
      }
      public Builder addValues(com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value.Builder builderForValue) {
        if (result.values_.isEmpty()) {
          result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value>();
        }
        result.values_.add(builderForValue.build());
        return this;
      }
      public Builder addAllValues(
          java.lang.Iterable<? extends com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value> values) {
        if (result.values_.isEmpty()) {
          result.values_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.Value>();
        }
        super.addAll(values, result.values_);
        return this;
      }
      public Builder clearValues() {
        result.values_ = java.util.Collections.emptyList();
        return this;
      }
      
      // repeated int32 flag = 3;
      public java.util.List<java.lang.Integer> getFlagList() {
        return java.util.Collections.unmodifiableList(result.flag_);
      }
      public int getFlagCount() {
        return result.getFlagCount();
      }
      public int getFlag(int index) {
        return result.getFlag(index);
      }
      public Builder setFlag(int index, int value) {
        result.flag_.set(index, value);
        return this;
      }
      public Builder addFlag(int value) {
        if (result.flag_.isEmpty()) {
          result.flag_ = new java.util.ArrayList<java.lang.Integer>();
        }
        result.flag_.add(value);
        return this;
      }
      public Builder addAllFlag(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        if (result.flag_.isEmpty()) {
          result.flag_ = new java.util.ArrayList<java.lang.Integer>();
        }
        super.addAll(values, result.flag_);
        return this;
      }
      public Builder clearFlag() {
        result.flag_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponse)
    }
    
    static {
      defaultInstance = new KeyValuePackageResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_KeyValuePackageResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_KeyValuePackageResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035KeyValuePackageResponse.proto\022\'com.ala" +
      "chisoft.tayzgrid.common.protobuf\032\013Value." +
      "proto\"u\n\027KeyValuePackageResponse\022\014\n\004keys" +
      "\030\001 \003(\014\022>\n\006values\030\002 \003(\0132..com.alachisoft." +
      "tayzgrid.common.protobuf.Value\022\014\n\004flag\030\003" +
      " \003(\005B!B\037KeyValuePackageResponseProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_KeyValuePackageResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_KeyValuePackageResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_KeyValuePackageResponse_descriptor,
              new java.lang.String[] { "Keys", "Values", "Flag", },
              com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.KeyValuePackageResponseProtocol.KeyValuePackageResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.ValueProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
