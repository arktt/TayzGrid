// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetNextRecordResponse.proto

package com.alachisoft.tayzgrid.common.protobuf;

public final class GetNextRecordResponseProtocol {
  private GetNextRecordResponseProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class GetNextRecordResponse extends
      com.google.protobuf.GeneratedMessage {
    // Use GetNextRecordResponse.newBuilder() to construct.
    private GetNextRecordResponse() {
      initFields();
    }
    private GetNextRecordResponse(boolean noInit) {}
    
    private static final GetNextRecordResponse defaultInstance;
    public static GetNextRecordResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public GetNextRecordResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetNextRecordResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.internal_static_com_alachisoft_tayzgrid_common_protobuf_GetNextRecordResponse_fieldAccessorTable;
    }
    
    // optional .com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResult taskEnumeratorResult = 1;
    public static final int TASKENUMERATORRESULT_FIELD_NUMBER = 1;
    private boolean hasTaskEnumeratorResult;
    private com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult taskEnumeratorResult_;
    public boolean hasTaskEnumeratorResult() { return hasTaskEnumeratorResult; }
    public com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult getTaskEnumeratorResult() { return taskEnumeratorResult_; }
    
    private void initFields() {
      taskEnumeratorResult_ = com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult.getDefaultInstance();
    }
    public final boolean isInitialized() {
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasTaskEnumeratorResult()) {
        output.writeMessage(1, getTaskEnumeratorResult());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasTaskEnumeratorResult()) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getTaskEnumeratorResult());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseDelimitedFrom(
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
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse result;
      
      // Construct using com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse();
        return builder;
      }
      
      protected com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse.getDescriptor();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse getDefaultInstanceForType() {
        return com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse) {
          return mergeFrom((com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse other) {
        if (other == com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse.getDefaultInstance()) return this;
        if (other.hasTaskEnumeratorResult()) {
          mergeTaskEnumeratorResult(other.getTaskEnumeratorResult());
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
              com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult.Builder subBuilder = com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult.newBuilder();
              if (hasTaskEnumeratorResult()) {
                subBuilder.mergeFrom(getTaskEnumeratorResult());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setTaskEnumeratorResult(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      
      // optional .com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResult taskEnumeratorResult = 1;
      public boolean hasTaskEnumeratorResult() {
        return result.hasTaskEnumeratorResult();
      }
      public com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult getTaskEnumeratorResult() {
        return result.getTaskEnumeratorResult();
      }
      public Builder setTaskEnumeratorResult(com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasTaskEnumeratorResult = true;
        result.taskEnumeratorResult_ = value;
        return this;
      }
      public Builder setTaskEnumeratorResult(com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult.Builder builderForValue) {
        result.hasTaskEnumeratorResult = true;
        result.taskEnumeratorResult_ = builderForValue.build();
        return this;
      }
      public Builder mergeTaskEnumeratorResult(com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult value) {
        if (result.hasTaskEnumeratorResult() &&
            result.taskEnumeratorResult_ != com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult.getDefaultInstance()) {
          result.taskEnumeratorResult_ =
            com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult.newBuilder(result.taskEnumeratorResult_).mergeFrom(value).buildPartial();
        } else {
          result.taskEnumeratorResult_ = value;
        }
        result.hasTaskEnumeratorResult = true;
        return this;
      }
      public Builder clearTaskEnumeratorResult() {
        result.hasTaskEnumeratorResult = false;
        result.taskEnumeratorResult_ = com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.TaskEnumeratorResult.getDefaultInstance();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponse)
    }
    
    static {
      defaultInstance = new GetNextRecordResponse(true);
      com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alachisoft_tayzgrid_common_protobuf_GetNextRecordResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_alachisoft_tayzgrid_common_protobuf_GetNextRecordResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GetNextRecordResponse.proto\022\'com.alach" +
      "isoft.tayzgrid.common.protobuf\032\032TaskEnum" +
      "eratorResult.proto\"t\n\025GetNextRecordRespo" +
      "nse\022[\n\024taskEnumeratorResult\030\001 \001(\0132=.com." +
      "alachisoft.tayzgrid.common.protobuf.Task" +
      "EnumeratorResultB\037B\035GetNextRecordRespons" +
      "eProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetNextRecordResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_alachisoft_tayzgrid_common_protobuf_GetNextRecordResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_alachisoft_tayzgrid_common_protobuf_GetNextRecordResponse_descriptor,
              new java.lang.String[] { "TaskEnumeratorResult", },
              com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse.class,
              com.alachisoft.tayzgrid.common.protobuf.GetNextRecordResponseProtocol.GetNextRecordResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.alachisoft.tayzgrid.common.protobuf.TaskEnumeratorResultProtocol.getDescriptor(),
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}