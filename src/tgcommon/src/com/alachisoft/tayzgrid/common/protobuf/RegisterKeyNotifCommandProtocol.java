// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RegisterKeyNotifCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class RegisterKeyNotifCommandProtocol {
  private RegisterKeyNotifCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class RegisterKeyNotifCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use RegisterKeyNotifCommand.newBuilder() to construct.
    private RegisterKeyNotifCommand() {
      initFields();
    }
    private RegisterKeyNotifCommand(boolean noInit) {}
    
    private static final RegisterKeyNotifCommand defaultInstance;
    public static RegisterKeyNotifCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public RegisterKeyNotifCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RegisterKeyNotifCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_RegisterKeyNotifCommand_fieldAccessorTable;
    }
    
    // optional bytes key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private boolean hasKey;
    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    public boolean hasKey() { return hasKey; }
    public com.google.protobuf.ByteString getKey() { return key_; }
    
    // optional int64 requestId = 2;
    public static final int REQUESTID_FIELD_NUMBER = 2;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // optional sint32 updateCallbackId = 3;
    public static final int UPDATECALLBACKID_FIELD_NUMBER = 3;
    private boolean hasUpdateCallbackId;
    private int updateCallbackId_ = 0;
    public boolean hasUpdateCallbackId() { return hasUpdateCallbackId; }
    public int getUpdateCallbackId() { return updateCallbackId_; }
    
    // optional sint32 removeCallbackId = 4;
    public static final int REMOVECALLBACKID_FIELD_NUMBER = 4;
    private boolean hasRemoveCallbackId;
    private int removeCallbackId_ = 0;
    public boolean hasRemoveCallbackId() { return hasRemoveCallbackId; }
    public int getRemoveCallbackId() { return removeCallbackId_; }
    
    // optional bool notifyOnExpiration = 5 [default = true];
    public static final int NOTIFYONEXPIRATION_FIELD_NUMBER = 5;
    private boolean hasNotifyOnExpiration;
    private boolean notifyOnExpiration_ = true;
    public boolean hasNotifyOnExpiration() { return hasNotifyOnExpiration; }
    public boolean getNotifyOnExpiration() { return notifyOnExpiration_; }
    
    // optional int32 datafilter = 6 [default = -1];
    public static final int DATAFILTER_FIELD_NUMBER = 6;
    private boolean hasDatafilter;
    private int datafilter_ = -1;
    public boolean hasDatafilter() { return hasDatafilter; }
    public int getDatafilter() { return datafilter_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasKey()) {
        output.writeBytes(1, getKey());
      }
      if (hasRequestId()) {
        output.writeInt64(2, getRequestId());
      }
      if (hasUpdateCallbackId()) {
        output.writeSInt32(3, getUpdateCallbackId());
      }
      if (hasRemoveCallbackId()) {
        output.writeSInt32(4, getRemoveCallbackId());
      }
      if (hasNotifyOnExpiration()) {
        output.writeBool(5, getNotifyOnExpiration());
      }
      if (hasDatafilter()) {
        output.writeInt32(6, getDatafilter());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasKey()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getKey());
      }
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, getRequestId());
      }
      if (hasUpdateCallbackId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(3, getUpdateCallbackId());
      }
      if (hasRemoveCallbackId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeSInt32Size(4, getRemoveCallbackId());
      }
      if (hasNotifyOnExpiration()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, getNotifyOnExpiration());
      }
      if (hasDatafilter()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, getDatafilter());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasUpdateCallbackId()) {
          setUpdateCallbackId(other.getUpdateCallbackId());
        }
        if (other.hasRemoveCallbackId()) {
          setRemoveCallbackId(other.getRemoveCallbackId());
        }
        if (other.hasNotifyOnExpiration()) {
          setNotifyOnExpiration(other.getNotifyOnExpiration());
        }
        if (other.hasDatafilter()) {
          setDatafilter(other.getDatafilter());
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
              setKey(input.readBytes());
              break;
            }
            case 16: {
              setRequestId(input.readInt64());
              break;
            }
            case 24: {
              setUpdateCallbackId(input.readSInt32());
              break;
            }
            case 32: {
              setRemoveCallbackId(input.readSInt32());
              break;
            }
            case 40: {
              setNotifyOnExpiration(input.readBool());
              break;
            }
            case 48: {
              setDatafilter(input.readInt32());
              break;
            }
          }
        }
      }
      
      
      // optional bytes key = 1;
      public boolean hasKey() {
        return result.hasKey();
      }
      public com.google.protobuf.ByteString getKey() {
        return result.getKey();
      }
      public Builder setKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasKey = true;
        result.key_ = value;
        return this;
      }
      public Builder clearKey() {
        result.hasKey = false;
        result.key_ = getDefaultInstance().getKey();
        return this;
      }
      
      // optional int64 requestId = 2;
      public boolean hasRequestId() {
        return result.hasRequestId();
      }
      public long getRequestId() {
        return result.getRequestId();
      }
      public Builder setRequestId(long value) {
        result.hasRequestId = true;
        result.requestId_ = value;
        return this;
      }
      public Builder clearRequestId() {
        result.hasRequestId = false;
        result.requestId_ = 0L;
        return this;
      }
      
      // optional sint32 updateCallbackId = 3;
      public boolean hasUpdateCallbackId() {
        return result.hasUpdateCallbackId();
      }
      public int getUpdateCallbackId() {
        return result.getUpdateCallbackId();
      }
      public Builder setUpdateCallbackId(int value) {
        result.hasUpdateCallbackId = true;
        result.updateCallbackId_ = value;
        return this;
      }
      public Builder clearUpdateCallbackId() {
        result.hasUpdateCallbackId = false;
        result.updateCallbackId_ = 0;
        return this;
      }
      
      // optional sint32 removeCallbackId = 4;
      public boolean hasRemoveCallbackId() {
        return result.hasRemoveCallbackId();
      }
      public int getRemoveCallbackId() {
        return result.getRemoveCallbackId();
      }
      public Builder setRemoveCallbackId(int value) {
        result.hasRemoveCallbackId = true;
        result.removeCallbackId_ = value;
        return this;
      }
      public Builder clearRemoveCallbackId() {
        result.hasRemoveCallbackId = false;
        result.removeCallbackId_ = 0;
        return this;
      }
      
      // optional bool notifyOnExpiration = 5 [default = true];
      public boolean hasNotifyOnExpiration() {
        return result.hasNotifyOnExpiration();
      }
      public boolean getNotifyOnExpiration() {
        return result.getNotifyOnExpiration();
      }
      public Builder setNotifyOnExpiration(boolean value) {
        result.hasNotifyOnExpiration = true;
        result.notifyOnExpiration_ = value;
        return this;
      }
      public Builder clearNotifyOnExpiration() {
        result.hasNotifyOnExpiration = false;
        result.notifyOnExpiration_ = true;
        return this;
      }
      
      // optional int32 datafilter = 6 [default = -1];
      public boolean hasDatafilter() {
        return result.hasDatafilter();
      }
      public int getDatafilter() {
        return result.getDatafilter();
      }
      public Builder setDatafilter(int value) {
        result.hasDatafilter = true;
        result.datafilter_ = value;
        return this;
      }
      public Builder clearDatafilter() {
        result.hasDatafilter = false;
        result.datafilter_ = -1;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommand)
    }
    
    static {
      defaultInstance = new RegisterKeyNotifCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_RegisterKeyNotifCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_RegisterKeyNotifCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035RegisterKeyNotifCommand.proto\022\'com.ala" +
      "chisoft.tayzgrid.common.protobuf\"\247\001\n\027Reg" +
      "isterKeyNotifCommand\022\013\n\003key\030\001 \001(\014\022\021\n\treq" +
      "uestId\030\002 \001(\003\022\030\n\020updateCallbackId\030\003 \001(\021\022\030" +
      "\n\020removeCallbackId\030\004 \001(\021\022 \n\022notifyOnExpi" +
      "ration\030\005 \001(\010:\004true\022\026\n\ndatafilter\030\006 \001(\005:\002" +
      "-1B!B\037RegisterKeyNotifCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RegisterKeyNotifCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_RegisterKeyNotifCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_RegisterKeyNotifCommand_descriptor,
              new java.lang.String[] { "Key", "RequestId", "UpdateCallbackId", "RemoveCallbackId", "NotifyOnExpiration", "Datafilter", },
              com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.RegisterKeyNotifCommandProtocol.RegisterKeyNotifCommand.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
