// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LightUserDTO.proto

// Protobuf Java Version: 3.25.3
package com.iftc.tickets.model.proto;

public final class LightUserDTOOuterClass {
  private LightUserDTOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LightUserDTOOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.iftc.tickets.model.proto.LightUserDTO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    java.lang.String getUsername();
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    com.google.protobuf.ByteString
        getUsernameBytes();
  }
  /**
   * Protobuf type {@code com.iftc.tickets.model.proto.LightUserDTO}
   */
  public static final class LightUserDTO extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.iftc.tickets.model.proto.LightUserDTO)
      LightUserDTOOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LightUserDTO.newBuilder() to construct.
    private LightUserDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LightUserDTO() {
      username_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LightUserDTO();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.iftc.tickets.model.proto.LightUserDTOOuterClass.internal_static_com_iftc_tickets_model_proto_LightUserDTO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.iftc.tickets.model.proto.LightUserDTOOuterClass.internal_static_com_iftc_tickets_model_proto_LightUserDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO.class, com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int USERNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object username_ = "";
    /**
     * <code>string username = 2;</code>
     * @return The username.
     */
    @java.lang.Override
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      }
    }
    /**
     * <code>string username = 2;</code>
     * @return The bytes for username.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO)) {
        return super.equals(obj);
      }
      com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO other = (com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO) obj;

      if (getId()
          != other.getId()) return false;
      if (!getUsername()
          .equals(other.getUsername())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + USERNAME_FIELD_NUMBER;
      hash = (53 * hash) + getUsername().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO parseFrom(
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
    public static Builder newBuilder(com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO prototype) {
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
     * Protobuf type {@code com.iftc.tickets.model.proto.LightUserDTO}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.iftc.tickets.model.proto.LightUserDTO)
        com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTOOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.iftc.tickets.model.proto.LightUserDTOOuterClass.internal_static_com_iftc_tickets_model_proto_LightUserDTO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.iftc.tickets.model.proto.LightUserDTOOuterClass.internal_static_com_iftc_tickets_model_proto_LightUserDTO_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO.class, com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO.Builder.class);
      }

      // Construct using com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        id_ = 0;
        username_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.iftc.tickets.model.proto.LightUserDTOOuterClass.internal_static_com_iftc_tickets_model_proto_LightUserDTO_descriptor;
      }

      @java.lang.Override
      public com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO getDefaultInstanceForType() {
        return com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO.getDefaultInstance();
      }

      @java.lang.Override
      public com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO build() {
        com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO buildPartial() {
        com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO result = new com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.username_ = username_;
        }
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
        if (other instanceof com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO) {
          return mergeFrom((com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO other) {
        if (other == com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getUsername().isEmpty()) {
          username_ = other.username_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                id_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                username_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object username_ = "";
      /**
       * <code>string username = 2;</code>
       * @return The username.
       */
      public java.lang.String getUsername() {
        java.lang.Object ref = username_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          username_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       * @return The bytes for username.
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        java.lang.Object ref = username_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          username_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string username = 2;</code>
       * @param value The username to set.
       * @return This builder for chaining.
       */
      public Builder setUsername(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        username_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUsername() {
        username_ = getDefaultInstance().getUsername();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string username = 2;</code>
       * @param value The bytes for username to set.
       * @return This builder for chaining.
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        username_ = value;
        bitField0_ |= 0x00000002;
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


      // @@protoc_insertion_point(builder_scope:com.iftc.tickets.model.proto.LightUserDTO)
    }

    // @@protoc_insertion_point(class_scope:com.iftc.tickets.model.proto.LightUserDTO)
    private static final com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO();
    }

    public static com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LightUserDTO>
        PARSER = new com.google.protobuf.AbstractParser<LightUserDTO>() {
      @java.lang.Override
      public LightUserDTO parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LightUserDTO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LightUserDTO> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.iftc.tickets.model.proto.LightUserDTOOuterClass.LightUserDTO getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_iftc_tickets_model_proto_LightUserDTO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_iftc_tickets_model_proto_LightUserDTO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022LightUserDTO.proto\022\034com.iftc.tickets.m" +
      "odel.proto\",\n\014LightUserDTO\022\n\n\002id\030\001 \001(\005\022\020" +
      "\n\010username\030\002 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_iftc_tickets_model_proto_LightUserDTO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_iftc_tickets_model_proto_LightUserDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_iftc_tickets_model_proto_LightUserDTO_descriptor,
        new java.lang.String[] { "Id", "Username", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
