// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: qpstest.proto

package io.grpc.testing;

/**
 * Protobuf type {@code grpc.testing.ServerStatus}
 */
public  final class ServerStatus extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:grpc.testing.ServerStatus)
    ServerStatusOrBuilder {
  // Use ServerStatus.newBuilder() to construct.
  private ServerStatus(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private ServerStatus() {
    port_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServerStatus(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            io.grpc.testing.ServerStats.Builder subBuilder = null;
            if (stats_ != null) {
              subBuilder = stats_.toBuilder();
            }
            stats_ = input.readMessage(io.grpc.testing.ServerStats.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stats_);
              stats_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            port_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ServerStatus_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ServerStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.testing.ServerStatus.class, io.grpc.testing.ServerStatus.Builder.class);
  }

  public static final com.google.protobuf.Parser<ServerStatus> PARSER =
      new com.google.protobuf.AbstractParser<ServerStatus>() {
    public ServerStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ServerStatus(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<ServerStatus> getParserForType() {
    return PARSER;
  }

  public static final int STATS_FIELD_NUMBER = 1;
  private io.grpc.testing.ServerStats stats_;
  /**
   * <code>optional .grpc.testing.ServerStats stats = 1;</code>
   */
  public boolean hasStats() {
    return stats_ != null;
  }
  /**
   * <code>optional .grpc.testing.ServerStats stats = 1;</code>
   */
  public io.grpc.testing.ServerStats getStats() {
    return stats_ == null ? io.grpc.testing.ServerStats.getDefaultInstance() : stats_;
  }
  /**
   * <code>optional .grpc.testing.ServerStats stats = 1;</code>
   */
  public io.grpc.testing.ServerStatsOrBuilder getStatsOrBuilder() {
    return getStats();
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_;
  /**
   * <code>optional int32 port = 2;</code>
   */
  public int getPort() {
    return port_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (stats_ != null) {
      output.writeMessage(1, getStats());
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (stats_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStats());
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, port_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.testing.ServerStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.ServerStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.ServerStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.testing.ServerStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.testing.ServerStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.ServerStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.ServerStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.testing.ServerStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.testing.ServerStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.testing.ServerStatus parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(io.grpc.testing.ServerStatus prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.testing.ServerStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.testing.ServerStatus)
      io.grpc.testing.ServerStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ServerStatus_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ServerStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.testing.ServerStatus.class, io.grpc.testing.ServerStatus.Builder.class);
    }

    // Construct using io.grpc.testing.ServerStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (statsBuilder_ == null) {
        stats_ = null;
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }
      port_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.testing.QpsTestProto.internal_static_grpc_testing_ServerStatus_descriptor;
    }

    public io.grpc.testing.ServerStatus getDefaultInstanceForType() {
      return io.grpc.testing.ServerStatus.getDefaultInstance();
    }

    public io.grpc.testing.ServerStatus build() {
      io.grpc.testing.ServerStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.testing.ServerStatus buildPartial() {
      io.grpc.testing.ServerStatus result = new io.grpc.testing.ServerStatus(this);
      if (statsBuilder_ == null) {
        result.stats_ = stats_;
      } else {
        result.stats_ = statsBuilder_.build();
      }
      result.port_ = port_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.testing.ServerStatus) {
        return mergeFrom((io.grpc.testing.ServerStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.testing.ServerStatus other) {
      if (other == io.grpc.testing.ServerStatus.getDefaultInstance()) return this;
      if (other.hasStats()) {
        mergeStats(other.getStats());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.testing.ServerStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.testing.ServerStatus) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grpc.testing.ServerStats stats_ = null;
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.ServerStats, io.grpc.testing.ServerStats.Builder, io.grpc.testing.ServerStatsOrBuilder> statsBuilder_;
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public boolean hasStats() {
      return statsBuilder_ != null || stats_ != null;
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public io.grpc.testing.ServerStats getStats() {
      if (statsBuilder_ == null) {
        return stats_ == null ? io.grpc.testing.ServerStats.getDefaultInstance() : stats_;
      } else {
        return statsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public Builder setStats(io.grpc.testing.ServerStats value) {
      if (statsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stats_ = value;
        onChanged();
      } else {
        statsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public Builder setStats(
        io.grpc.testing.ServerStats.Builder builderForValue) {
      if (statsBuilder_ == null) {
        stats_ = builderForValue.build();
        onChanged();
      } else {
        statsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public Builder mergeStats(io.grpc.testing.ServerStats value) {
      if (statsBuilder_ == null) {
        if (stats_ != null) {
          stats_ =
            io.grpc.testing.ServerStats.newBuilder(stats_).mergeFrom(value).buildPartial();
        } else {
          stats_ = value;
        }
        onChanged();
      } else {
        statsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public Builder clearStats() {
      if (statsBuilder_ == null) {
        stats_ = null;
        onChanged();
      } else {
        stats_ = null;
        statsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public io.grpc.testing.ServerStats.Builder getStatsBuilder() {
      
      onChanged();
      return getStatsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    public io.grpc.testing.ServerStatsOrBuilder getStatsOrBuilder() {
      if (statsBuilder_ != null) {
        return statsBuilder_.getMessageOrBuilder();
      } else {
        return stats_ == null ?
            io.grpc.testing.ServerStats.getDefaultInstance() : stats_;
      }
    }
    /**
     * <code>optional .grpc.testing.ServerStats stats = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        io.grpc.testing.ServerStats, io.grpc.testing.ServerStats.Builder, io.grpc.testing.ServerStatsOrBuilder> 
        getStatsFieldBuilder() {
      if (statsBuilder_ == null) {
        statsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            io.grpc.testing.ServerStats, io.grpc.testing.ServerStats.Builder, io.grpc.testing.ServerStatsOrBuilder>(
                getStats(),
                getParentForChildren(),
                isClean());
        stats_ = null;
      }
      return statsBuilder_;
    }

    private int port_ ;
    /**
     * <code>optional int32 port = 2;</code>
     */
    public int getPort() {
      return port_;
    }
    /**
     * <code>optional int32 port = 2;</code>
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 port = 2;</code>
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.testing.ServerStatus)
  }

  // @@protoc_insertion_point(class_scope:grpc.testing.ServerStatus)
  private static final io.grpc.testing.ServerStatus defaultInstance;static {
    defaultInstance = new io.grpc.testing.ServerStatus();
  }

  public static io.grpc.testing.ServerStatus getDefaultInstance() {
    return defaultInstance;
  }

  public io.grpc.testing.ServerStatus getDefaultInstanceForType() {
    return defaultInstance;
  }

}

