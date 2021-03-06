// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SyncEventsCommand.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class SyncEventsCommandProtocol {
  private SyncEventsCommandProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class SyncEventsCommand extends
      com.google.protobuf.GeneratedMessage {
    // Use SyncEventsCommand.newBuilder() to construct.
    private SyncEventsCommand() {
      initFields();
    }
    private SyncEventsCommand(boolean noInit) {}
    
    private static final SyncEventsCommand defaultInstance;
    public static SyncEventsCommand getDefaultInstance() {
      return defaultInstance;
    }
    
    public SyncEventsCommand getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_SyncEventsCommand_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_SyncEventsCommand_fieldAccessorTable;
    }
    
    // optional int64 requestId = 1;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    private boolean hasRequestId;
    private long requestId_ = 0L;
    public boolean hasRequestId() { return hasRequestId; }
    public long getRequestId() { return requestId_; }
    
    // repeated .com.alachisoft.tayzgrid.common.protobuf.EventIdCommand eventIds = 2;
    public static final int EVENTIDS_FIELD_NUMBER = 2;
    private java.util.List<com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand> eventIds_ =
      java.util.Collections.emptyList();
    public java.util.List<com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand> getEventIdsList() {
      return eventIds_;
    }
    public int getEventIdsCount() { return eventIds_.size(); }
    public com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand getEventIds(int index) {
      return eventIds_.get(index);
    }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasRequestId()) {
        output.writeInt64(1, getRequestId());
      }
      for (com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand element : getEventIdsList()) {
        output.writeMessage(2, element);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasRequestId()) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, getRequestId());
      }
      for (com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand element : getEventIdsList()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, element);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        if (result.eventIds_ != java.util.Collections.EMPTY_LIST) {
          result.eventIds_ =
            java.util.Collections.unmodifiableList(result.eventIds_);
        }
        com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (!other.eventIds_.isEmpty()) {
          if (result.eventIds_.isEmpty()) {
            result.eventIds_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand>();
          }
          result.eventIds_.addAll(other.eventIds_);
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
            case 8: {
              setRequestId(input.readInt64());
              break;
            }
            case 18: {
              com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addEventIds(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional int64 requestId = 1;
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
      
      // repeated .com.alachisoft.tayzgrid.common.protobuf.EventIdCommand eventIds = 2;
      public java.util.List<com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand> getEventIdsList() {
        return java.util.Collections.unmodifiableList(result.eventIds_);
      }
      public int getEventIdsCount() {
        return result.getEventIdsCount();
      }
      public com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand getEventIds(int index) {
        return result.getEventIds(index);
      }
      public Builder setEventIds(int index, com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.eventIds_.set(index, value);
        return this;
      }
      public Builder setEventIds(int index, com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand.Builder builderForValue) {
        result.eventIds_.set(index, builderForValue.build());
        return this;
      }
      public Builder addEventIds(com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand value) {
        if (value == null) {
          throw new NullPointerException();
        }
        if (result.eventIds_.isEmpty()) {
          result.eventIds_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand>();
        }
        result.eventIds_.add(value);
        return this;
      }
      public Builder addEventIds(com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand.Builder builderForValue) {
        if (result.eventIds_.isEmpty()) {
          result.eventIds_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand>();
        }
        result.eventIds_.add(builderForValue.build());
        return this;
      }
      public Builder addAllEventIds(
          java.lang.Iterable<? extends com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand> values) {
        if (result.eventIds_.isEmpty()) {
          result.eventIds_ = new java.util.ArrayList<com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.EventIdCommand>();
        }
        super.addAll(values, result.eventIds_);
        return this;
      }
      public Builder clearEventIds() {
        result.eventIds_ = java.util.Collections.emptyList();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommand)
    }
    
    static {
      defaultInstance = new SyncEventsCommand(true);
      com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommand)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_SyncEventsCommand_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_SyncEventsCommand_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027SyncEventsCommand.proto\022\'com.alachisof" +
      "t.tayzgrid.common.protobuf\032\024EventIdComma" +
      "nd.proto\"q\n\021SyncEventsCommand\022\021\n\trequest" +
      "Id\030\001 \001(\003\022I\n\010eventIds\030\002 \003(\01327.com.alachis" +
      "oft.tayzgrid.common.protobuf.EventIdComm" +
      "andB\033B\031SyncEventsCommandProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_SyncEventsCommand_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_SyncEventsCommand_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_SyncEventsCommand_descriptor,
              new java.lang.String[] { "RequestId", "EventIds", },
              com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand.class,
              com.alachisoft.tayzgrid.common.protobuf.SyncEventsCommandProtocol.SyncEventsCommand.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.EventIdCommandProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}
