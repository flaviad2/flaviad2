package protobuffprotocol;


public final class TriatlonProtobufs {
    private TriatlonProtobufs() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface ArbitruProtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ArbitruProto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         */
        long getId();

        /**
         * <code>string username = 2;</code>
         */
        java.lang.String getUsername();
        /**
         * <code>string username = 2;</code>
         */
        com.google.protobuf.ByteString
        getUsernameBytes();

        /**
         * <code>string pasword = 3;</code>
         */
        java.lang.String getPasword();
        /**
         * <code>string pasword = 3;</code>
         */
        com.google.protobuf.ByteString
        getPaswordBytes();

        /**
         * <code>string name = 4;</code>
         */
        java.lang.String getName();
        /**
         * <code>string name = 4;</code>
         */
        com.google.protobuf.ByteString
        getNameBytes();
    }
    /**
     * Protobuf type {@code ArbitruProto}
     */
    public  static final class ArbitruProto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ArbitruProto)
            ArbitruProtoOrBuilder {
        // Use ArbitruProto.newBuilder() to construct.
        private ArbitruProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ArbitruProto() {
            id_ = 0L;
            username_ = "";
            pasword_ = "";
            name_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ArbitruProto(
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
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            username_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            pasword_ = s;
                            break;
                        }
                        case 34: {
                            java.lang.String s = input.readStringRequireUtf8();

                            name_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_ArbitruProto_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_ArbitruProto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.ArbitruProto.class, TriatlonProtobufs.ArbitruProto.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         */
        public long getId() {
            return id_;
        }

        public static final int USERNAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object username_;
        /**
         * <code>string username = 2;</code>
         */
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
         */
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

        public static final int PASWORD_FIELD_NUMBER = 3;
        private volatile java.lang.Object pasword_;
        /**
         * <code>string pasword = 3;</code>
         */
        public java.lang.String getPasword() {
            java.lang.Object ref = pasword_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                pasword_ = s;
                return s;
            }
        }
        /**
         * <code>string pasword = 3;</code>
         */
        public com.google.protobuf.ByteString
        getPaswordBytes() {
            java.lang.Object ref = pasword_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                pasword_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int NAME_FIELD_NUMBER = 4;
        private volatile java.lang.Object name_;
        /**
         * <code>string name = 4;</code>
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            }
        }
        /**
         * <code>string name = 4;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
            if (!getUsernameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, username_);
            }
            if (!getPaswordBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, pasword_);
            }
            if (!getNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (!getUsernameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, username_);
            }
            if (!getPaswordBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, pasword_);
            }
            if (!getNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.ArbitruProto)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.ArbitruProto other = (TriatlonProtobufs.ArbitruProto) obj;

            boolean result = true;
            result = result && (getId()
                    == other.getId());
            result = result && getUsername()
                    .equals(other.getUsername());
            result = result && getPasword()
                    .equals(other.getPasword());
            result = result && getName()
                    .equals(other.getName());
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + USERNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUsername().hashCode();
            hash = (37 * hash) + PASWORD_FIELD_NUMBER;
            hash = (53 * hash) + getPasword().hashCode();
            hash = (37 * hash) + NAME_FIELD_NUMBER;
            hash = (53 * hash) + getName().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.ArbitruProto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ArbitruProto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ArbitruProto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ArbitruProto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.ArbitruProto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code ArbitruProto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ArbitruProto)
                TriatlonProtobufs.ArbitruProtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_ArbitruProto_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_ArbitruProto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.ArbitruProto.class, TriatlonProtobufs.ArbitruProto.Builder.class);
            }

            // Construct using TriatlonProtobufs.ArbitruProto.newBuilder()
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
            public Builder clear() {
                super.clear();
                id_ = 0L;

                username_ = "";

                pasword_ = "";

                name_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_ArbitruProto_descriptor;
            }

            public TriatlonProtobufs.ArbitruProto getDefaultInstanceForType() {
                return TriatlonProtobufs.ArbitruProto.getDefaultInstance();
            }

            public TriatlonProtobufs.ArbitruProto build() {
                TriatlonProtobufs.ArbitruProto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.ArbitruProto buildPartial() {
                TriatlonProtobufs.ArbitruProto result = new TriatlonProtobufs.ArbitruProto(this);
                result.id_ = id_;
                result.username_ = username_;
                result.pasword_ = pasword_;
                result.name_ = name_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.ArbitruProto) {
                    return mergeFrom((TriatlonProtobufs.ArbitruProto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.ArbitruProto other) {
                if (other == TriatlonProtobufs.ArbitruProto.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getUsername().isEmpty()) {
                    username_ = other.username_;
                    onChanged();
                }
                if (!other.getPasword().isEmpty()) {
                    pasword_ = other.pasword_;
                    onChanged();
                }
                if (!other.getName().isEmpty()) {
                    name_ = other.name_;
                    onChanged();
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
                TriatlonProtobufs.ArbitruProto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.ArbitruProto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object username_ = "";
            /**
             * <code>string username = 2;</code>
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
             */
            public Builder setUsername(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                username_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string username = 2;</code>
             */
            public Builder clearUsername() {

                username_ = getDefaultInstance().getUsername();
                onChanged();
                return this;
            }
            /**
             * <code>string username = 2;</code>
             */
            public Builder setUsernameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                username_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object pasword_ = "";
            /**
             * <code>string pasword = 3;</code>
             */
            public java.lang.String getPasword() {
                java.lang.Object ref = pasword_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    pasword_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string pasword = 3;</code>
             */
            public com.google.protobuf.ByteString
            getPaswordBytes() {
                java.lang.Object ref = pasword_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    pasword_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string pasword = 3;</code>
             */
            public Builder setPasword(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                pasword_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string pasword = 3;</code>
             */
            public Builder clearPasword() {

                pasword_ = getDefaultInstance().getPasword();
                onChanged();
                return this;
            }
            /**
             * <code>string pasword = 3;</code>
             */
            public Builder setPaswordBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                pasword_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object name_ = "";
            /**
             * <code>string name = 4;</code>
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string name = 4;</code>
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string name = 4;</code>
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                name_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string name = 4;</code>
             */
            public Builder clearName() {

                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }
            /**
             * <code>string name = 4;</code>
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                name_ = value;
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


            // @@protoc_insertion_point(builder_scope:ArbitruProto)
        }

        // @@protoc_insertion_point(class_scope:ArbitruProto)
        private static final TriatlonProtobufs.ArbitruProto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.ArbitruProto();
        }

        public static TriatlonProtobufs.ArbitruProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ArbitruProto>
                PARSER = new com.google.protobuf.AbstractParser<ArbitruProto>() {
            public ArbitruProto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ArbitruProto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ArbitruProto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ArbitruProto> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.ArbitruProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ParticipantProtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ParticipantProto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         */
        long getId();

        /**
         * <code>string firstName = 2;</code>
         */
        java.lang.String getFirstName();
        /**
         * <code>string firstName = 2;</code>
         */
        com.google.protobuf.ByteString
        getFirstNameBytes();

        /**
         * <code>string lastName = 3;</code>
         */
        java.lang.String getLastName();
        /**
         * <code>string lastName = 3;</code>
         */
        com.google.protobuf.ByteString
        getLastNameBytes();
    }
    /**
     * Protobuf type {@code ParticipantProto}
     */
    public  static final class ParticipantProto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ParticipantProto)
            ParticipantProtoOrBuilder {
        // Use ParticipantProto.newBuilder() to construct.
        private ParticipantProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ParticipantProto() {
            id_ = 0L;
            firstName_ = "";
            lastName_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ParticipantProto(
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
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            firstName_ = s;
                            break;
                        }
                        case 26: {
                            java.lang.String s = input.readStringRequireUtf8();

                            lastName_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_ParticipantProto_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_ParticipantProto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.ParticipantProto.class, TriatlonProtobufs.ParticipantProto.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         */
        public long getId() {
            return id_;
        }

        public static final int FIRSTNAME_FIELD_NUMBER = 2;
        private volatile java.lang.Object firstName_;
        /**
         * <code>string firstName = 2;</code>
         */
        public java.lang.String getFirstName() {
            java.lang.Object ref = firstName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                firstName_ = s;
                return s;
            }
        }
        /**
         * <code>string firstName = 2;</code>
         */
        public com.google.protobuf.ByteString
        getFirstNameBytes() {
            java.lang.Object ref = firstName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                firstName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LASTNAME_FIELD_NUMBER = 3;
        private volatile java.lang.Object lastName_;
        /**
         * <code>string lastName = 3;</code>
         */
        public java.lang.String getLastName() {
            java.lang.Object ref = lastName_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                lastName_ = s;
                return s;
            }
        }
        /**
         * <code>string lastName = 3;</code>
         */
        public com.google.protobuf.ByteString
        getLastNameBytes() {
            java.lang.Object ref = lastName_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                lastName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
            if (!getFirstNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
            }
            if (!getLastNameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (!getFirstNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
            }
            if (!getLastNameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.ParticipantProto)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.ParticipantProto other = (TriatlonProtobufs.ParticipantProto) obj;

            boolean result = true;
            result = result && (getId()
                    == other.getId());
            result = result && getFirstName()
                    .equals(other.getFirstName());
            result = result && getLastName()
                    .equals(other.getLastName());
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getFirstName().hashCode();
            hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
            hash = (53 * hash) + getLastName().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.ParticipantProto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantProto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ParticipantProto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ParticipantProto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.ParticipantProto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code ParticipantProto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ParticipantProto)
                TriatlonProtobufs.ParticipantProtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_ParticipantProto_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_ParticipantProto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.ParticipantProto.class, TriatlonProtobufs.ParticipantProto.Builder.class);
            }

            // Construct using TriatlonProtobufs.ParticipantProto.newBuilder()
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
            public Builder clear() {
                super.clear();
                id_ = 0L;

                firstName_ = "";

                lastName_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_ParticipantProto_descriptor;
            }

            public TriatlonProtobufs.ParticipantProto getDefaultInstanceForType() {
                return TriatlonProtobufs.ParticipantProto.getDefaultInstance();
            }

            public TriatlonProtobufs.ParticipantProto build() {
                TriatlonProtobufs.ParticipantProto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.ParticipantProto buildPartial() {
                TriatlonProtobufs.ParticipantProto result = new TriatlonProtobufs.ParticipantProto(this);
                result.id_ = id_;
                result.firstName_ = firstName_;
                result.lastName_ = lastName_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.ParticipantProto) {
                    return mergeFrom((TriatlonProtobufs.ParticipantProto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.ParticipantProto other) {
                if (other == TriatlonProtobufs.ParticipantProto.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getFirstName().isEmpty()) {
                    firstName_ = other.firstName_;
                    onChanged();
                }
                if (!other.getLastName().isEmpty()) {
                    lastName_ = other.lastName_;
                    onChanged();
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
                TriatlonProtobufs.ParticipantProto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.ParticipantProto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object firstName_ = "";
            /**
             * <code>string firstName = 2;</code>
             */
            public java.lang.String getFirstName() {
                java.lang.Object ref = firstName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    firstName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string firstName = 2;</code>
             */
            public com.google.protobuf.ByteString
            getFirstNameBytes() {
                java.lang.Object ref = firstName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    firstName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string firstName = 2;</code>
             */
            public Builder setFirstName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                firstName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string firstName = 2;</code>
             */
            public Builder clearFirstName() {

                firstName_ = getDefaultInstance().getFirstName();
                onChanged();
                return this;
            }
            /**
             * <code>string firstName = 2;</code>
             */
            public Builder setFirstNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                firstName_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object lastName_ = "";
            /**
             * <code>string lastName = 3;</code>
             */
            public java.lang.String getLastName() {
                java.lang.Object ref = lastName_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    lastName_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string lastName = 3;</code>
             */
            public com.google.protobuf.ByteString
            getLastNameBytes() {
                java.lang.Object ref = lastName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    lastName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string lastName = 3;</code>
             */
            public Builder setLastName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                lastName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string lastName = 3;</code>
             */
            public Builder clearLastName() {

                lastName_ = getDefaultInstance().getLastName();
                onChanged();
                return this;
            }
            /**
             * <code>string lastName = 3;</code>
             */
            public Builder setLastNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                lastName_ = value;
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


            // @@protoc_insertion_point(builder_scope:ParticipantProto)
        }

        // @@protoc_insertion_point(class_scope:ParticipantProto)
        private static final TriatlonProtobufs.ParticipantProto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.ParticipantProto();
        }

        public static TriatlonProtobufs.ParticipantProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ParticipantProto>
                PARSER = new com.google.protobuf.AbstractParser<ParticipantProto>() {
            public ParticipantProto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ParticipantProto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ParticipantProto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ParticipantProto> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.ParticipantProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ParticipantPointsDTOProtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ParticipantPointsDTOProto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         */
        long getId();

        /**
         * <code>.ParticipantProto participant = 2;</code>
         */
        boolean hasParticipant();
        /**
         * <code>.ParticipantProto participant = 2;</code>
         */
        TriatlonProtobufs.ParticipantProto getParticipant();
        /**
         * <code>.ParticipantProto participant = 2;</code>
         */
        TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantOrBuilder();

        /**
         * <code>float points = 3;</code>
         */
        float getPoints();
    }
    /**
     * Protobuf type {@code ParticipantPointsDTOProto}
     */
    public  static final class ParticipantPointsDTOProto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ParticipantPointsDTOProto)
            ParticipantPointsDTOProtoOrBuilder {
        // Use ParticipantPointsDTOProto.newBuilder() to construct.
        private ParticipantPointsDTOProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ParticipantPointsDTOProto() {
            id_ = 0L;
            points_ = 0F;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ParticipantPointsDTOProto(
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
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            TriatlonProtobufs.ParticipantProto.Builder subBuilder = null;
                            if (participant_ != null) {
                                subBuilder = participant_.toBuilder();
                            }
                            participant_ = input.readMessage(TriatlonProtobufs.ParticipantProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(participant_);
                                participant_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 29: {

                            points_ = input.readFloat();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_ParticipantPointsDTOProto_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_ParticipantPointsDTOProto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.ParticipantPointsDTOProto.class, TriatlonProtobufs.ParticipantPointsDTOProto.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         */
        public long getId() {
            return id_;
        }

        public static final int PARTICIPANT_FIELD_NUMBER = 2;
        private TriatlonProtobufs.ParticipantProto participant_;
        /**
         * <code>.ParticipantProto participant = 2;</code>
         */
        public boolean hasParticipant() {
            return participant_ != null;
        }
        /**
         * <code>.ParticipantProto participant = 2;</code>
         */
        public TriatlonProtobufs.ParticipantProto getParticipant() {
            return participant_ == null ? TriatlonProtobufs.ParticipantProto.getDefaultInstance() : participant_;
        }
        /**
         * <code>.ParticipantProto participant = 2;</code>
         */
        public TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantOrBuilder() {
            return getParticipant();
        }

        public static final int POINTS_FIELD_NUMBER = 3;
        private float points_;
        /**
         * <code>float points = 3;</code>
         */
        public float getPoints() {
            return points_;
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
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
            if (participant_ != null) {
                output.writeMessage(2, getParticipant());
            }
            if (points_ != 0F) {
                output.writeFloat(3, points_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (participant_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getParticipant());
            }
            if (points_ != 0F) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFloatSize(3, points_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.ParticipantPointsDTOProto)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.ParticipantPointsDTOProto other = (TriatlonProtobufs.ParticipantPointsDTOProto) obj;

            boolean result = true;
            result = result && (getId()
                    == other.getId());
            result = result && (hasParticipant() == other.hasParticipant());
            if (hasParticipant()) {
                result = result && getParticipant()
                        .equals(other.getParticipant());
            }
            result = result && (
                    java.lang.Float.floatToIntBits(getPoints())
                            == java.lang.Float.floatToIntBits(
                            other.getPoints()));
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            if (hasParticipant()) {
                hash = (37 * hash) + PARTICIPANT_FIELD_NUMBER;
                hash = (53 * hash) + getParticipant().hashCode();
            }
            hash = (37 * hash) + POINTS_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(
                    getPoints());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ParticipantPointsDTOProto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.ParticipantPointsDTOProto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code ParticipantPointsDTOProto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ParticipantPointsDTOProto)
                TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_ParticipantPointsDTOProto_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_ParticipantPointsDTOProto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.ParticipantPointsDTOProto.class, TriatlonProtobufs.ParticipantPointsDTOProto.Builder.class);
            }

            // Construct using TriatlonProtobufs.ParticipantPointsDTOProto.newBuilder()
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
            public Builder clear() {
                super.clear();
                id_ = 0L;

                if (participantBuilder_ == null) {
                    participant_ = null;
                } else {
                    participant_ = null;
                    participantBuilder_ = null;
                }
                points_ = 0F;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_ParticipantPointsDTOProto_descriptor;
            }

            public TriatlonProtobufs.ParticipantPointsDTOProto getDefaultInstanceForType() {
                return TriatlonProtobufs.ParticipantPointsDTOProto.getDefaultInstance();
            }

            public TriatlonProtobufs.ParticipantPointsDTOProto build() {
                TriatlonProtobufs.ParticipantPointsDTOProto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.ParticipantPointsDTOProto buildPartial() {
                TriatlonProtobufs.ParticipantPointsDTOProto result = new TriatlonProtobufs.ParticipantPointsDTOProto(this);
                result.id_ = id_;
                if (participantBuilder_ == null) {
                    result.participant_ = participant_;
                } else {
                    result.participant_ = participantBuilder_.build();
                }
                result.points_ = points_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.ParticipantPointsDTOProto) {
                    return mergeFrom((TriatlonProtobufs.ParticipantPointsDTOProto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.ParticipantPointsDTOProto other) {
                if (other == TriatlonProtobufs.ParticipantPointsDTOProto.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (other.hasParticipant()) {
                    mergeParticipant(other.getParticipant());
                }
                if (other.getPoints() != 0F) {
                    setPoints(other.getPoints());
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
                TriatlonProtobufs.ParticipantPointsDTOProto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.ParticipantPointsDTOProto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            private TriatlonProtobufs.ParticipantProto participant_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder> participantBuilder_;
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public boolean hasParticipant() {
                return participantBuilder_ != null || participant_ != null;
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public TriatlonProtobufs.ParticipantProto getParticipant() {
                if (participantBuilder_ == null) {
                    return participant_ == null ? TriatlonProtobufs.ParticipantProto.getDefaultInstance() : participant_;
                } else {
                    return participantBuilder_.getMessage();
                }
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public Builder setParticipant(TriatlonProtobufs.ParticipantProto value) {
                if (participantBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    participant_ = value;
                    onChanged();
                } else {
                    participantBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public Builder setParticipant(
                    TriatlonProtobufs.ParticipantProto.Builder builderForValue) {
                if (participantBuilder_ == null) {
                    participant_ = builderForValue.build();
                    onChanged();
                } else {
                    participantBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public Builder mergeParticipant(TriatlonProtobufs.ParticipantProto value) {
                if (participantBuilder_ == null) {
                    if (participant_ != null) {
                        participant_ =
                                TriatlonProtobufs.ParticipantProto.newBuilder(participant_).mergeFrom(value).buildPartial();
                    } else {
                        participant_ = value;
                    }
                    onChanged();
                } else {
                    participantBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public Builder clearParticipant() {
                if (participantBuilder_ == null) {
                    participant_ = null;
                    onChanged();
                } else {
                    participant_ = null;
                    participantBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public TriatlonProtobufs.ParticipantProto.Builder getParticipantBuilder() {

                onChanged();
                return getParticipantFieldBuilder().getBuilder();
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            public TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantOrBuilder() {
                if (participantBuilder_ != null) {
                    return participantBuilder_.getMessageOrBuilder();
                } else {
                    return participant_ == null ?
                            TriatlonProtobufs.ParticipantProto.getDefaultInstance() : participant_;
                }
            }
            /**
             * <code>.ParticipantProto participant = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder>
            getParticipantFieldBuilder() {
                if (participantBuilder_ == null) {
                    participantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder>(
                            getParticipant(),
                            getParentForChildren(),
                            isClean());
                    participant_ = null;
                }
                return participantBuilder_;
            }

            private float points_ ;
            /**
             * <code>float points = 3;</code>
             */
            public float getPoints() {
                return points_;
            }
            /**
             * <code>float points = 3;</code>
             */
            public Builder setPoints(float value) {

                points_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>float points = 3;</code>
             */
            public Builder clearPoints() {

                points_ = 0F;
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


            // @@protoc_insertion_point(builder_scope:ParticipantPointsDTOProto)
        }

        // @@protoc_insertion_point(class_scope:ParticipantPointsDTOProto)
        private static final TriatlonProtobufs.ParticipantPointsDTOProto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.ParticipantPointsDTOProto();
        }

        public static TriatlonProtobufs.ParticipantPointsDTOProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ParticipantPointsDTOProto>
                PARSER = new com.google.protobuf.AbstractParser<ParticipantPointsDTOProto>() {
            public ParticipantPointsDTOProto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ParticipantPointsDTOProto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ParticipantPointsDTOProto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ParticipantPointsDTOProto> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.ParticipantPointsDTOProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ProbaProtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ProbaProto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         */
        long getId();

        /**
         * <code>string discipline = 2;</code>
         */
        java.lang.String getDiscipline();
        /**
         * <code>string discipline = 2;</code>
         */
        com.google.protobuf.ByteString
        getDisciplineBytes();

        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        boolean hasArbitru();
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        TriatlonProtobufs.ArbitruProto getArbitru();
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder();
    }
    /**
     * Protobuf type {@code ProbaProto}
     */
    public  static final class ProbaProto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ProbaProto)
            ProbaProtoOrBuilder {
        // Use ProbaProto.newBuilder() to construct.
        private ProbaProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ProbaProto() {
            id_ = 0L;
            discipline_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ProbaProto(
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
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            discipline_ = s;
                            break;
                        }
                        case 26: {
                            TriatlonProtobufs.ArbitruProto.Builder subBuilder = null;
                            if (arbitru_ != null) {
                                subBuilder = arbitru_.toBuilder();
                            }
                            arbitru_ = input.readMessage(TriatlonProtobufs.ArbitruProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(arbitru_);
                                arbitru_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_ProbaProto_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_ProbaProto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.ProbaProto.class, TriatlonProtobufs.ProbaProto.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         */
        public long getId() {
            return id_;
        }

        public static final int DISCIPLINE_FIELD_NUMBER = 2;
        private volatile java.lang.Object discipline_;
        /**
         * <code>string discipline = 2;</code>
         */
        public java.lang.String getDiscipline() {
            java.lang.Object ref = discipline_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                discipline_ = s;
                return s;
            }
        }
        /**
         * <code>string discipline = 2;</code>
         */
        public com.google.protobuf.ByteString
        getDisciplineBytes() {
            java.lang.Object ref = discipline_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                discipline_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ARBITRU_FIELD_NUMBER = 3;
        private TriatlonProtobufs.ArbitruProto arbitru_;
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        public boolean hasArbitru() {
            return arbitru_ != null;
        }
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        public TriatlonProtobufs.ArbitruProto getArbitru() {
            return arbitru_ == null ? TriatlonProtobufs.ArbitruProto.getDefaultInstance() : arbitru_;
        }
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        public TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder() {
            return getArbitru();
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
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
            if (!getDisciplineBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, discipline_);
            }
            if (arbitru_ != null) {
                output.writeMessage(3, getArbitru());
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (!getDisciplineBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, discipline_);
            }
            if (arbitru_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getArbitru());
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.ProbaProto)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.ProbaProto other = (TriatlonProtobufs.ProbaProto) obj;

            boolean result = true;
            result = result && (getId()
                    == other.getId());
            result = result && getDiscipline()
                    .equals(other.getDiscipline());
            result = result && (hasArbitru() == other.hasArbitru());
            if (hasArbitru()) {
                result = result && getArbitru()
                        .equals(other.getArbitru());
            }
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (37 * hash) + DISCIPLINE_FIELD_NUMBER;
            hash = (53 * hash) + getDiscipline().hashCode();
            if (hasArbitru()) {
                hash = (37 * hash) + ARBITRU_FIELD_NUMBER;
                hash = (53 * hash) + getArbitru().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.ProbaProto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ProbaProto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ProbaProto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ProbaProto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.ProbaProto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code ProbaProto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ProbaProto)
                TriatlonProtobufs.ProbaProtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_ProbaProto_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_ProbaProto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.ProbaProto.class, TriatlonProtobufs.ProbaProto.Builder.class);
            }

            // Construct using TriatlonProtobufs.ProbaProto.newBuilder()
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
            public Builder clear() {
                super.clear();
                id_ = 0L;

                discipline_ = "";

                if (arbitruBuilder_ == null) {
                    arbitru_ = null;
                } else {
                    arbitru_ = null;
                    arbitruBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_ProbaProto_descriptor;
            }

            public TriatlonProtobufs.ProbaProto getDefaultInstanceForType() {
                return TriatlonProtobufs.ProbaProto.getDefaultInstance();
            }

            public TriatlonProtobufs.ProbaProto build() {
                TriatlonProtobufs.ProbaProto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.ProbaProto buildPartial() {
                TriatlonProtobufs.ProbaProto result = new TriatlonProtobufs.ProbaProto(this);
                result.id_ = id_;
                result.discipline_ = discipline_;
                if (arbitruBuilder_ == null) {
                    result.arbitru_ = arbitru_;
                } else {
                    result.arbitru_ = arbitruBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.ProbaProto) {
                    return mergeFrom((TriatlonProtobufs.ProbaProto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.ProbaProto other) {
                if (other == TriatlonProtobufs.ProbaProto.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (!other.getDiscipline().isEmpty()) {
                    discipline_ = other.discipline_;
                    onChanged();
                }
                if (other.hasArbitru()) {
                    mergeArbitru(other.getArbitru());
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
                TriatlonProtobufs.ProbaProto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.ProbaProto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            private java.lang.Object discipline_ = "";
            /**
             * <code>string discipline = 2;</code>
             */
            public java.lang.String getDiscipline() {
                java.lang.Object ref = discipline_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    discipline_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string discipline = 2;</code>
             */
            public com.google.protobuf.ByteString
            getDisciplineBytes() {
                java.lang.Object ref = discipline_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    discipline_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string discipline = 2;</code>
             */
            public Builder setDiscipline(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                discipline_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string discipline = 2;</code>
             */
            public Builder clearDiscipline() {

                discipline_ = getDefaultInstance().getDiscipline();
                onChanged();
                return this;
            }
            /**
             * <code>string discipline = 2;</code>
             */
            public Builder setDisciplineBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                discipline_ = value;
                onChanged();
                return this;
            }

            private TriatlonProtobufs.ArbitruProto arbitru_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder> arbitruBuilder_;
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public boolean hasArbitru() {
                return arbitruBuilder_ != null || arbitru_ != null;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public TriatlonProtobufs.ArbitruProto getArbitru() {
                if (arbitruBuilder_ == null) {
                    return arbitru_ == null ? TriatlonProtobufs.ArbitruProto.getDefaultInstance() : arbitru_;
                } else {
                    return arbitruBuilder_.getMessage();
                }
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder setArbitru(TriatlonProtobufs.ArbitruProto value) {
                if (arbitruBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    arbitru_ = value;
                    onChanged();
                } else {
                    arbitruBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder setArbitru(
                    TriatlonProtobufs.ArbitruProto.Builder builderForValue) {
                if (arbitruBuilder_ == null) {
                    arbitru_ = builderForValue.build();
                    onChanged();
                } else {
                    arbitruBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder mergeArbitru(TriatlonProtobufs.ArbitruProto value) {
                if (arbitruBuilder_ == null) {
                    if (arbitru_ != null) {
                        arbitru_ =
                                TriatlonProtobufs.ArbitruProto.newBuilder(arbitru_).mergeFrom(value).buildPartial();
                    } else {
                        arbitru_ = value;
                    }
                    onChanged();
                } else {
                    arbitruBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder clearArbitru() {
                if (arbitruBuilder_ == null) {
                    arbitru_ = null;
                    onChanged();
                } else {
                    arbitru_ = null;
                    arbitruBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public TriatlonProtobufs.ArbitruProto.Builder getArbitruBuilder() {

                onChanged();
                return getArbitruFieldBuilder().getBuilder();
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder() {
                if (arbitruBuilder_ != null) {
                    return arbitruBuilder_.getMessageOrBuilder();
                } else {
                    return arbitru_ == null ?
                            TriatlonProtobufs.ArbitruProto.getDefaultInstance() : arbitru_;
                }
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder>
            getArbitruFieldBuilder() {
                if (arbitruBuilder_ == null) {
                    arbitruBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder>(
                            getArbitru(),
                            getParentForChildren(),
                            isClean());
                    arbitru_ = null;
                }
                return arbitruBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:ProbaProto)
        }

        // @@protoc_insertion_point(class_scope:ProbaProto)
        private static final TriatlonProtobufs.ProbaProto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.ProbaProto();
        }

        public static TriatlonProtobufs.ProbaProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ProbaProto>
                PARSER = new com.google.protobuf.AbstractParser<ProbaProto>() {
            public ProbaProto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ProbaProto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ProbaProto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ProbaProto> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.ProbaProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface RezultatProtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:RezultatProto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         */
        long getId();

        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        boolean hasProba();
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        TriatlonProtobufs.ProbaProto getProba();
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder();

        /**
         * <code>.ParticipantProto participant = 3;</code>
         */
        boolean hasParticipant();
        /**
         * <code>.ParticipantProto participant = 3;</code>
         */
        TriatlonProtobufs.ParticipantProto getParticipant();
        /**
         * <code>.ParticipantProto participant = 3;</code>
         */
        TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantOrBuilder();

        /**
         * <code>float points = 4;</code>
         */
        float getPoints();
    }
    /**
     * Protobuf type {@code RezultatProto}
     */
    public  static final class RezultatProto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:RezultatProto)
            RezultatProtoOrBuilder {
        // Use RezultatProto.newBuilder() to construct.
        private RezultatProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private RezultatProto() {
            id_ = 0L;
            points_ = 0F;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private RezultatProto(
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
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            TriatlonProtobufs.ProbaProto.Builder subBuilder = null;
                            if (proba_ != null) {
                                subBuilder = proba_.toBuilder();
                            }
                            proba_ = input.readMessage(TriatlonProtobufs.ProbaProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(proba_);
                                proba_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 26: {
                            TriatlonProtobufs.ParticipantProto.Builder subBuilder = null;
                            if (participant_ != null) {
                                subBuilder = participant_.toBuilder();
                            }
                            participant_ = input.readMessage(TriatlonProtobufs.ParticipantProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(participant_);
                                participant_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 37: {

                            points_ = input.readFloat();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_RezultatProto_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_RezultatProto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.RezultatProto.class, TriatlonProtobufs.RezultatProto.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         */
        public long getId() {
            return id_;
        }

        public static final int PROBA_FIELD_NUMBER = 2;
        private TriatlonProtobufs.ProbaProto proba_;
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        public boolean hasProba() {
            return proba_ != null;
        }
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        public TriatlonProtobufs.ProbaProto getProba() {
            return proba_ == null ? TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
        }
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
            return getProba();
        }

        public static final int PARTICIPANT_FIELD_NUMBER = 3;
        private TriatlonProtobufs.ParticipantProto participant_;
        /**
         * <code>.ParticipantProto participant = 3;</code>
         */
        public boolean hasParticipant() {
            return participant_ != null;
        }
        /**
         * <code>.ParticipantProto participant = 3;</code>
         */
        public TriatlonProtobufs.ParticipantProto getParticipant() {
            return participant_ == null ? TriatlonProtobufs.ParticipantProto.getDefaultInstance() : participant_;
        }
        /**
         * <code>.ParticipantProto participant = 3;</code>
         */
        public TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantOrBuilder() {
            return getParticipant();
        }

        public static final int POINTS_FIELD_NUMBER = 4;
        private float points_;
        /**
         * <code>float points = 4;</code>
         */
        public float getPoints() {
            return points_;
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
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
            if (proba_ != null) {
                output.writeMessage(2, getProba());
            }
            if (participant_ != null) {
                output.writeMessage(3, getParticipant());
            }
            if (points_ != 0F) {
                output.writeFloat(4, points_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (proba_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getProba());
            }
            if (participant_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getParticipant());
            }
            if (points_ != 0F) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFloatSize(4, points_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.RezultatProto)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.RezultatProto other = (TriatlonProtobufs.RezultatProto) obj;

            boolean result = true;
            result = result && (getId()
                    == other.getId());
            result = result && (hasProba() == other.hasProba());
            if (hasProba()) {
                result = result && getProba()
                        .equals(other.getProba());
            }
            result = result && (hasParticipant() == other.hasParticipant());
            if (hasParticipant()) {
                result = result && getParticipant()
                        .equals(other.getParticipant());
            }
            result = result && (
                    java.lang.Float.floatToIntBits(getPoints())
                            == java.lang.Float.floatToIntBits(
                            other.getPoints()));
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            if (hasProba()) {
                hash = (37 * hash) + PROBA_FIELD_NUMBER;
                hash = (53 * hash) + getProba().hashCode();
            }
            if (hasParticipant()) {
                hash = (37 * hash) + PARTICIPANT_FIELD_NUMBER;
                hash = (53 * hash) + getParticipant().hashCode();
            }
            hash = (37 * hash) + POINTS_FIELD_NUMBER;
            hash = (53 * hash) + java.lang.Float.floatToIntBits(
                    getPoints());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.RezultatProto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.RezultatProto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.RezultatProto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.RezultatProto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.RezultatProto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code RezultatProto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:RezultatProto)
                TriatlonProtobufs.RezultatProtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_RezultatProto_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_RezultatProto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.RezultatProto.class, TriatlonProtobufs.RezultatProto.Builder.class);
            }

            // Construct using TriatlonProtobufs.RezultatProto.newBuilder()
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
            public Builder clear() {
                super.clear();
                id_ = 0L;

                if (probaBuilder_ == null) {
                    proba_ = null;
                } else {
                    proba_ = null;
                    probaBuilder_ = null;
                }
                if (participantBuilder_ == null) {
                    participant_ = null;
                } else {
                    participant_ = null;
                    participantBuilder_ = null;
                }
                points_ = 0F;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_RezultatProto_descriptor;
            }

            public TriatlonProtobufs.RezultatProto getDefaultInstanceForType() {
                return TriatlonProtobufs.RezultatProto.getDefaultInstance();
            }

            public TriatlonProtobufs.RezultatProto build() {
                TriatlonProtobufs.RezultatProto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.RezultatProto buildPartial() {
                TriatlonProtobufs.RezultatProto result = new TriatlonProtobufs.RezultatProto(this);
                result.id_ = id_;
                if (probaBuilder_ == null) {
                    result.proba_ = proba_;
                } else {
                    result.proba_ = probaBuilder_.build();
                }
                if (participantBuilder_ == null) {
                    result.participant_ = participant_;
                } else {
                    result.participant_ = participantBuilder_.build();
                }
                result.points_ = points_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.RezultatProto) {
                    return mergeFrom((TriatlonProtobufs.RezultatProto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.RezultatProto other) {
                if (other == TriatlonProtobufs.RezultatProto.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
                }
                if (other.hasProba()) {
                    mergeProba(other.getProba());
                }
                if (other.hasParticipant()) {
                    mergeParticipant(other.getParticipant());
                }
                if (other.getPoints() != 0F) {
                    setPoints(other.getPoints());
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
                TriatlonProtobufs.RezultatProto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.RezultatProto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0L;
                onChanged();
                return this;
            }

            private TriatlonProtobufs.ProbaProto proba_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder> probaBuilder_;
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public boolean hasProba() {
                return probaBuilder_ != null || proba_ != null;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public TriatlonProtobufs.ProbaProto getProba() {
                if (probaBuilder_ == null) {
                    return proba_ == null ? TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
                } else {
                    return probaBuilder_.getMessage();
                }
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder setProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    proba_ = value;
                    onChanged();
                } else {
                    probaBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder setProba(
                    TriatlonProtobufs.ProbaProto.Builder builderForValue) {
                if (probaBuilder_ == null) {
                    proba_ = builderForValue.build();
                    onChanged();
                } else {
                    probaBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder mergeProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (proba_ != null) {
                        proba_ =
                                TriatlonProtobufs.ProbaProto.newBuilder(proba_).mergeFrom(value).buildPartial();
                    } else {
                        proba_ = value;
                    }
                    onChanged();
                } else {
                    probaBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder clearProba() {
                if (probaBuilder_ == null) {
                    proba_ = null;
                    onChanged();
                } else {
                    proba_ = null;
                    probaBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public TriatlonProtobufs.ProbaProto.Builder getProbaBuilder() {

                onChanged();
                return getProbaFieldBuilder().getBuilder();
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
                if (probaBuilder_ != null) {
                    return probaBuilder_.getMessageOrBuilder();
                } else {
                    return proba_ == null ?
                            TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
                }
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>
            getProbaFieldBuilder() {
                if (probaBuilder_ == null) {
                    probaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>(
                            getProba(),
                            getParentForChildren(),
                            isClean());
                    proba_ = null;
                }
                return probaBuilder_;
            }

            private TriatlonProtobufs.ParticipantProto participant_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder> participantBuilder_;
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public boolean hasParticipant() {
                return participantBuilder_ != null || participant_ != null;
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public TriatlonProtobufs.ParticipantProto getParticipant() {
                if (participantBuilder_ == null) {
                    return participant_ == null ? TriatlonProtobufs.ParticipantProto.getDefaultInstance() : participant_;
                } else {
                    return participantBuilder_.getMessage();
                }
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public Builder setParticipant(TriatlonProtobufs.ParticipantProto value) {
                if (participantBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    participant_ = value;
                    onChanged();
                } else {
                    participantBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public Builder setParticipant(
                    TriatlonProtobufs.ParticipantProto.Builder builderForValue) {
                if (participantBuilder_ == null) {
                    participant_ = builderForValue.build();
                    onChanged();
                } else {
                    participantBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public Builder mergeParticipant(TriatlonProtobufs.ParticipantProto value) {
                if (participantBuilder_ == null) {
                    if (participant_ != null) {
                        participant_ =
                                TriatlonProtobufs.ParticipantProto.newBuilder(participant_).mergeFrom(value).buildPartial();
                    } else {
                        participant_ = value;
                    }
                    onChanged();
                } else {
                    participantBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public Builder clearParticipant() {
                if (participantBuilder_ == null) {
                    participant_ = null;
                    onChanged();
                } else {
                    participant_ = null;
                    participantBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public TriatlonProtobufs.ParticipantProto.Builder getParticipantBuilder() {

                onChanged();
                return getParticipantFieldBuilder().getBuilder();
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            public TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantOrBuilder() {
                if (participantBuilder_ != null) {
                    return participantBuilder_.getMessageOrBuilder();
                } else {
                    return participant_ == null ?
                            TriatlonProtobufs.ParticipantProto.getDefaultInstance() : participant_;
                }
            }
            /**
             * <code>.ParticipantProto participant = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder>
            getParticipantFieldBuilder() {
                if (participantBuilder_ == null) {
                    participantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder>(
                            getParticipant(),
                            getParentForChildren(),
                            isClean());
                    participant_ = null;
                }
                return participantBuilder_;
            }

            private float points_ ;
            /**
             * <code>float points = 4;</code>
             */
            public float getPoints() {
                return points_;
            }
            /**
             * <code>float points = 4;</code>
             */
            public Builder setPoints(float value) {

                points_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>float points = 4;</code>
             */
            public Builder clearPoints() {

                points_ = 0F;
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


            // @@protoc_insertion_point(builder_scope:RezultatProto)
        }

        // @@protoc_insertion_point(class_scope:RezultatProto)
        private static final TriatlonProtobufs.RezultatProto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.RezultatProto();
        }

        public static TriatlonProtobufs.RezultatProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RezultatProto>
                PARSER = new com.google.protobuf.AbstractParser<RezultatProto>() {
            public RezultatProto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new RezultatProto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<RezultatProto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RezultatProto> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.RezultatProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface IDOrBuilder extends
            // @@protoc_insertion_point(interface_extends:ID)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int64 id = 1;</code>
         */
        long getId();
    }
    /**
     * Protobuf type {@code ID}
     */
    public  static final class ID extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:ID)
            IDOrBuilder {
        // Use ID.newBuilder() to construct.
        private ID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ID() {
            id_ = 0L;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private ID(
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
                        case 8: {

                            id_ = input.readInt64();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_ID_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_ID_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.ID.class, TriatlonProtobufs.ID.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private long id_;
        /**
         * <code>int64 id = 1;</code>
         */
        public long getId() {
            return id_;
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
            if (id_ != 0L) {
                output.writeInt64(1, id_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.ID)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.ID other = (TriatlonProtobufs.ID) obj;

            boolean result = true;
            result = result && (getId()
                    == other.getId());
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getId());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.ID parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ID parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ID parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ID parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ID parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.ID parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.ID parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ID parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ID parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ID parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.ID parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.ID parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.ID prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code ID}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:ID)
                TriatlonProtobufs.IDOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_ID_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_ID_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.ID.class, TriatlonProtobufs.ID.Builder.class);
            }

            // Construct using TriatlonProtobufs.ID.newBuilder()
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
            public Builder clear() {
                super.clear();
                id_ = 0L;

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_ID_descriptor;
            }

            public TriatlonProtobufs.ID getDefaultInstanceForType() {
                return TriatlonProtobufs.ID.getDefaultInstance();
            }

            public TriatlonProtobufs.ID build() {
                TriatlonProtobufs.ID result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.ID buildPartial() {
                TriatlonProtobufs.ID result = new TriatlonProtobufs.ID(this);
                result.id_ = id_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.ID) {
                    return mergeFrom((TriatlonProtobufs.ID)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.ID other) {
                if (other == TriatlonProtobufs.ID.getDefaultInstance()) return this;
                if (other.getId() != 0L) {
                    setId(other.getId());
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
                TriatlonProtobufs.ID parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.ID) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long id_ ;
            /**
             * <code>int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder setId(long value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 id = 1;</code>
             */
            public Builder clearId() {

                id_ = 0L;
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


            // @@protoc_insertion_point(builder_scope:ID)
        }

        // @@protoc_insertion_point(class_scope:ID)
        private static final TriatlonProtobufs.ID DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.ID();
        }

        public static TriatlonProtobufs.ID getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ID>
                PARSER = new com.google.protobuf.AbstractParser<ID>() {
            public ID parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new ID(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ID> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ID> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.ID getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DTOArbitruProtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:DTOArbitruProto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string username = 1;</code>
         */
        java.lang.String getUsername();
        /**
         * <code>string username = 1;</code>
         */
        com.google.protobuf.ByteString
        getUsernameBytes();

        /**
         * <code>string password = 2;</code>
         */
        java.lang.String getPassword();
        /**
         * <code>string password = 2;</code>
         */
        com.google.protobuf.ByteString
        getPasswordBytes();
    }
    /**
     * Protobuf type {@code DTOArbitruProto}
     */
    public  static final class DTOArbitruProto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:DTOArbitruProto)
            DTOArbitruProtoOrBuilder {
        // Use DTOArbitruProto.newBuilder() to construct.
        private DTOArbitruProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private DTOArbitruProto() {
            username_ = "";
            password_ = "";
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private DTOArbitruProto(
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
                            java.lang.String s = input.readStringRequireUtf8();

                            username_ = s;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            password_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_DTOArbitruProto_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_DTOArbitruProto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.DTOArbitruProto.class, TriatlonProtobufs.DTOArbitruProto.Builder.class);
        }

        public static final int USERNAME_FIELD_NUMBER = 1;
        private volatile java.lang.Object username_;
        /**
         * <code>string username = 1;</code>
         */
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
         * <code>string username = 1;</code>
         */
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

        public static final int PASSWORD_FIELD_NUMBER = 2;
        private volatile java.lang.Object password_;
        /**
         * <code>string password = 2;</code>
         */
        public java.lang.String getPassword() {
            java.lang.Object ref = password_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                password_ = s;
                return s;
            }
        }
        /**
         * <code>string password = 2;</code>
         */
        public com.google.protobuf.ByteString
        getPasswordBytes() {
            java.lang.Object ref = password_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                password_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
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
            if (!getUsernameBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
            }
            if (!getPasswordBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, password_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getUsernameBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
            }
            if (!getPasswordBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, password_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.DTOArbitruProto)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.DTOArbitruProto other = (TriatlonProtobufs.DTOArbitruProto) obj;

            boolean result = true;
            result = result && getUsername()
                    .equals(other.getUsername());
            result = result && getPassword()
                    .equals(other.getPassword());
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + USERNAME_FIELD_NUMBER;
            hash = (53 * hash) + getUsername().hashCode();
            hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
            hash = (53 * hash) + getPassword().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.DTOArbitruProto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.DTOArbitruProto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code DTOArbitruProto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:DTOArbitruProto)
                TriatlonProtobufs.DTOArbitruProtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_DTOArbitruProto_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_DTOArbitruProto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.DTOArbitruProto.class, TriatlonProtobufs.DTOArbitruProto.Builder.class);
            }

            // Construct using TriatlonProtobufs.DTOArbitruProto.newBuilder()
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
            public Builder clear() {
                super.clear();
                username_ = "";

                password_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_DTOArbitruProto_descriptor;
            }

            public TriatlonProtobufs.DTOArbitruProto getDefaultInstanceForType() {
                return TriatlonProtobufs.DTOArbitruProto.getDefaultInstance();
            }

            public TriatlonProtobufs.DTOArbitruProto build() {
                TriatlonProtobufs.DTOArbitruProto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.DTOArbitruProto buildPartial() {
                TriatlonProtobufs.DTOArbitruProto result = new TriatlonProtobufs.DTOArbitruProto(this);
                result.username_ = username_;
                result.password_ = password_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.DTOArbitruProto) {
                    return mergeFrom((TriatlonProtobufs.DTOArbitruProto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.DTOArbitruProto other) {
                if (other == TriatlonProtobufs.DTOArbitruProto.getDefaultInstance()) return this;
                if (!other.getUsername().isEmpty()) {
                    username_ = other.username_;
                    onChanged();
                }
                if (!other.getPassword().isEmpty()) {
                    password_ = other.password_;
                    onChanged();
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
                TriatlonProtobufs.DTOArbitruProto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.DTOArbitruProto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private java.lang.Object username_ = "";
            /**
             * <code>string username = 1;</code>
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
             * <code>string username = 1;</code>
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
             * <code>string username = 1;</code>
             */
            public Builder setUsername(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                username_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string username = 1;</code>
             */
            public Builder clearUsername() {

                username_ = getDefaultInstance().getUsername();
                onChanged();
                return this;
            }
            /**
             * <code>string username = 1;</code>
             */
            public Builder setUsernameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                username_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object password_ = "";
            /**
             * <code>string password = 2;</code>
             */
            public java.lang.String getPassword() {
                java.lang.Object ref = password_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    password_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string password = 2;</code>
             */
            public com.google.protobuf.ByteString
            getPasswordBytes() {
                java.lang.Object ref = password_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    password_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string password = 2;</code>
             */
            public Builder setPassword(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                password_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string password = 2;</code>
             */
            public Builder clearPassword() {

                password_ = getDefaultInstance().getPassword();
                onChanged();
                return this;
            }
            /**
             * <code>string password = 2;</code>
             */
            public Builder setPasswordBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                password_ = value;
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


            // @@protoc_insertion_point(builder_scope:DTOArbitruProto)
        }

        // @@protoc_insertion_point(class_scope:DTOArbitruProto)
        private static final TriatlonProtobufs.DTOArbitruProto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.DTOArbitruProto();
        }

        public static TriatlonProtobufs.DTOArbitruProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DTOArbitruProto>
                PARSER = new com.google.protobuf.AbstractParser<DTOArbitruProto>() {
            public DTOArbitruProto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new DTOArbitruProto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<DTOArbitruProto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DTOArbitruProto> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.DTOArbitruProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface DTORezultatProbaProtoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:DTORezultatProbaProto)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.RezultatProto rezultat = 1;</code>
         */
        boolean hasRezultat();
        /**
         * <code>.RezultatProto rezultat = 1;</code>
         */
        TriatlonProtobufs.RezultatProto getRezultat();
        /**
         * <code>.RezultatProto rezultat = 1;</code>
         */
        TriatlonProtobufs.RezultatProtoOrBuilder getRezultatOrBuilder();

        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        boolean hasProba();
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        TriatlonProtobufs.ProbaProto getProba();
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder();
    }
    /**
     * Protobuf type {@code DTORezultatProbaProto}
     */
    public  static final class DTORezultatProbaProto extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:DTORezultatProbaProto)
            DTORezultatProbaProtoOrBuilder {
        // Use DTORezultatProbaProto.newBuilder() to construct.
        private DTORezultatProbaProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private DTORezultatProbaProto() {
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private DTORezultatProbaProto(
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
                            TriatlonProtobufs.RezultatProto.Builder subBuilder = null;
                            if (rezultat_ != null) {
                                subBuilder = rezultat_.toBuilder();
                            }
                            rezultat_ = input.readMessage(TriatlonProtobufs.RezultatProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(rezultat_);
                                rezultat_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 18: {
                            TriatlonProtobufs.ProbaProto.Builder subBuilder = null;
                            if (proba_ != null) {
                                subBuilder = proba_.toBuilder();
                            }
                            proba_ = input.readMessage(TriatlonProtobufs.ProbaProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(proba_);
                                proba_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_DTORezultatProbaProto_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_DTORezultatProbaProto_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.DTORezultatProbaProto.class, TriatlonProtobufs.DTORezultatProbaProto.Builder.class);
        }

        public static final int REZULTAT_FIELD_NUMBER = 1;
        private TriatlonProtobufs.RezultatProto rezultat_;
        /**
         * <code>.RezultatProto rezultat = 1;</code>
         */
        public boolean hasRezultat() {
            return rezultat_ != null;
        }
        /**
         * <code>.RezultatProto rezultat = 1;</code>
         */
        public TriatlonProtobufs.RezultatProto getRezultat() {
            return rezultat_ == null ? TriatlonProtobufs.RezultatProto.getDefaultInstance() : rezultat_;
        }
        /**
         * <code>.RezultatProto rezultat = 1;</code>
         */
        public TriatlonProtobufs.RezultatProtoOrBuilder getRezultatOrBuilder() {
            return getRezultat();
        }

        public static final int PROBA_FIELD_NUMBER = 2;
        private TriatlonProtobufs.ProbaProto proba_;
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        public boolean hasProba() {
            return proba_ != null;
        }
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        public TriatlonProtobufs.ProbaProto getProba() {
            return proba_ == null ? TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
        }
        /**
         * <code>.ProbaProto proba = 2;</code>
         */
        public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
            return getProba();
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
            if (rezultat_ != null) {
                output.writeMessage(1, getRezultat());
            }
            if (proba_ != null) {
                output.writeMessage(2, getProba());
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (rezultat_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getRezultat());
            }
            if (proba_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getProba());
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.DTORezultatProbaProto)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.DTORezultatProbaProto other = (TriatlonProtobufs.DTORezultatProbaProto) obj;

            boolean result = true;
            result = result && (hasRezultat() == other.hasRezultat());
            if (hasRezultat()) {
                result = result && getRezultat()
                        .equals(other.getRezultat());
            }
            result = result && (hasProba() == other.hasProba());
            if (hasProba()) {
                result = result && getProba()
                        .equals(other.getProba());
            }
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasRezultat()) {
                hash = (37 * hash) + REZULTAT_FIELD_NUMBER;
                hash = (53 * hash) + getRezultat().hashCode();
            }
            if (hasProba()) {
                hash = (37 * hash) + PROBA_FIELD_NUMBER;
                hash = (53 * hash) + getProba().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.DTORezultatProbaProto parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.DTORezultatProbaProto prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code DTORezultatProbaProto}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:DTORezultatProbaProto)
                TriatlonProtobufs.DTORezultatProbaProtoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_DTORezultatProbaProto_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_DTORezultatProbaProto_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.DTORezultatProbaProto.class, TriatlonProtobufs.DTORezultatProbaProto.Builder.class);
            }

            // Construct using TriatlonProtobufs.DTORezultatProbaProto.newBuilder()
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
            public Builder clear() {
                super.clear();
                if (rezultatBuilder_ == null) {
                    rezultat_ = null;
                } else {
                    rezultat_ = null;
                    rezultatBuilder_ = null;
                }
                if (probaBuilder_ == null) {
                    proba_ = null;
                } else {
                    proba_ = null;
                    probaBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_DTORezultatProbaProto_descriptor;
            }

            public TriatlonProtobufs.DTORezultatProbaProto getDefaultInstanceForType() {
                return TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance();
            }

            public TriatlonProtobufs.DTORezultatProbaProto build() {
                TriatlonProtobufs.DTORezultatProbaProto result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.DTORezultatProbaProto buildPartial() {
                TriatlonProtobufs.DTORezultatProbaProto result = new TriatlonProtobufs.DTORezultatProbaProto(this);
                if (rezultatBuilder_ == null) {
                    result.rezultat_ = rezultat_;
                } else {
                    result.rezultat_ = rezultatBuilder_.build();
                }
                if (probaBuilder_ == null) {
                    result.proba_ = proba_;
                } else {
                    result.proba_ = probaBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.DTORezultatProbaProto) {
                    return mergeFrom((TriatlonProtobufs.DTORezultatProbaProto)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.DTORezultatProbaProto other) {
                if (other == TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance()) return this;
                if (other.hasRezultat()) {
                    mergeRezultat(other.getRezultat());
                }
                if (other.hasProba()) {
                    mergeProba(other.getProba());
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
                TriatlonProtobufs.DTORezultatProbaProto parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.DTORezultatProbaProto) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private TriatlonProtobufs.RezultatProto rezultat_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.RezultatProto, TriatlonProtobufs.RezultatProto.Builder, TriatlonProtobufs.RezultatProtoOrBuilder> rezultatBuilder_;
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public boolean hasRezultat() {
                return rezultatBuilder_ != null || rezultat_ != null;
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public TriatlonProtobufs.RezultatProto getRezultat() {
                if (rezultatBuilder_ == null) {
                    return rezultat_ == null ? TriatlonProtobufs.RezultatProto.getDefaultInstance() : rezultat_;
                } else {
                    return rezultatBuilder_.getMessage();
                }
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public Builder setRezultat(TriatlonProtobufs.RezultatProto value) {
                if (rezultatBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    rezultat_ = value;
                    onChanged();
                } else {
                    rezultatBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public Builder setRezultat(
                    TriatlonProtobufs.RezultatProto.Builder builderForValue) {
                if (rezultatBuilder_ == null) {
                    rezultat_ = builderForValue.build();
                    onChanged();
                } else {
                    rezultatBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public Builder mergeRezultat(TriatlonProtobufs.RezultatProto value) {
                if (rezultatBuilder_ == null) {
                    if (rezultat_ != null) {
                        rezultat_ =
                                TriatlonProtobufs.RezultatProto.newBuilder(rezultat_).mergeFrom(value).buildPartial();
                    } else {
                        rezultat_ = value;
                    }
                    onChanged();
                } else {
                    rezultatBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public Builder clearRezultat() {
                if (rezultatBuilder_ == null) {
                    rezultat_ = null;
                    onChanged();
                } else {
                    rezultat_ = null;
                    rezultatBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public TriatlonProtobufs.RezultatProto.Builder getRezultatBuilder() {

                onChanged();
                return getRezultatFieldBuilder().getBuilder();
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            public TriatlonProtobufs.RezultatProtoOrBuilder getRezultatOrBuilder() {
                if (rezultatBuilder_ != null) {
                    return rezultatBuilder_.getMessageOrBuilder();
                } else {
                    return rezultat_ == null ?
                            TriatlonProtobufs.RezultatProto.getDefaultInstance() : rezultat_;
                }
            }
            /**
             * <code>.RezultatProto rezultat = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.RezultatProto, TriatlonProtobufs.RezultatProto.Builder, TriatlonProtobufs.RezultatProtoOrBuilder>
            getRezultatFieldBuilder() {
                if (rezultatBuilder_ == null) {
                    rezultatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.RezultatProto, TriatlonProtobufs.RezultatProto.Builder, TriatlonProtobufs.RezultatProtoOrBuilder>(
                            getRezultat(),
                            getParentForChildren(),
                            isClean());
                    rezultat_ = null;
                }
                return rezultatBuilder_;
            }

            private TriatlonProtobufs.ProbaProto proba_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder> probaBuilder_;
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public boolean hasProba() {
                return probaBuilder_ != null || proba_ != null;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public TriatlonProtobufs.ProbaProto getProba() {
                if (probaBuilder_ == null) {
                    return proba_ == null ? TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
                } else {
                    return probaBuilder_.getMessage();
                }
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder setProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    proba_ = value;
                    onChanged();
                } else {
                    probaBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder setProba(
                    TriatlonProtobufs.ProbaProto.Builder builderForValue) {
                if (probaBuilder_ == null) {
                    proba_ = builderForValue.build();
                    onChanged();
                } else {
                    probaBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder mergeProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (proba_ != null) {
                        proba_ =
                                TriatlonProtobufs.ProbaProto.newBuilder(proba_).mergeFrom(value).buildPartial();
                    } else {
                        proba_ = value;
                    }
                    onChanged();
                } else {
                    probaBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public Builder clearProba() {
                if (probaBuilder_ == null) {
                    proba_ = null;
                    onChanged();
                } else {
                    proba_ = null;
                    probaBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public TriatlonProtobufs.ProbaProto.Builder getProbaBuilder() {

                onChanged();
                return getProbaFieldBuilder().getBuilder();
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
                if (probaBuilder_ != null) {
                    return probaBuilder_.getMessageOrBuilder();
                } else {
                    return proba_ == null ?
                            TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
                }
            }
            /**
             * <code>.ProbaProto proba = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>
            getProbaFieldBuilder() {
                if (probaBuilder_ == null) {
                    probaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>(
                            getProba(),
                            getParentForChildren(),
                            isClean());
                    proba_ = null;
                }
                return probaBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:DTORezultatProbaProto)
        }

        // @@protoc_insertion_point(class_scope:DTORezultatProbaProto)
        private static final TriatlonProtobufs.DTORezultatProbaProto DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.DTORezultatProbaProto();
        }

        public static TriatlonProtobufs.DTORezultatProbaProto getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DTORezultatProbaProto>
                PARSER = new com.google.protobuf.AbstractParser<DTORezultatProbaProto>() {
            public DTORezultatProbaProto parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new DTORezultatProbaProto(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<DTORezultatProbaProto> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DTORezultatProbaProto> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.DTORezultatProbaProto getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TriatlonRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:TriatlonRequest)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.TriatlonRequest.Type type = 1;</code>
         */
        int getTypeValue();
        /**
         * <code>.TriatlonRequest.Type type = 1;</code>
         */
        TriatlonProtobufs.TriatlonRequest.Type getType();

        /**
         * <code>.DTOArbitruProto arbitruDTO = 2;</code>
         */
        TriatlonProtobufs.DTOArbitruProto getArbitruDTO();
        /**
         * <code>.DTOArbitruProto arbitruDTO = 2;</code>
         */
        TriatlonProtobufs.DTOArbitruProtoOrBuilder getArbitruDTOOrBuilder();

        /**
         * <code>.ProbaProto proba = 3;</code>
         */
        TriatlonProtobufs.ProbaProto getProba();
        /**
         * <code>.ProbaProto proba = 3;</code>
         */
        TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder();

        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
         */
        TriatlonProtobufs.DTORezultatProbaProto getRezultatProbaDTO();
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
         */
        TriatlonProtobufs.DTORezultatProbaProtoOrBuilder getRezultatProbaDTOOrBuilder();

        /**
         * <code>.ArbitruProto arbitru = 5;</code>
         */
        TriatlonProtobufs.ArbitruProto getArbitru();
        /**
         * <code>.ArbitruProto arbitru = 5;</code>
         */
        TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder();

        /**
         * <code>.ID id = 6;</code>
         */
        TriatlonProtobufs.ID getId();
        /**
         * <code>.ID id = 6;</code>
         */
        TriatlonProtobufs.IDOrBuilder getIdOrBuilder();

        public TriatlonProtobufs.TriatlonRequest.DataCase getDataCase();
    }
    /**
     * Protobuf type {@code TriatlonRequest}
     */
    public  static final class TriatlonRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:TriatlonRequest)
            TriatlonRequestOrBuilder {
        // Use TriatlonRequest.newBuilder() to construct.
        private TriatlonRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TriatlonRequest() {
            type_ = 0;
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private TriatlonRequest(
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
                        case 8: {
                            int rawValue = input.readEnum();

                            type_ = rawValue;
                            break;
                        }
                        case 18: {
                            TriatlonProtobufs.DTOArbitruProto.Builder subBuilder = null;
                            if (dataCase_ == 2) {
                                subBuilder = ((TriatlonProtobufs.DTOArbitruProto) data_).toBuilder();
                            }
                            data_ =
                                    input.readMessage(TriatlonProtobufs.DTOArbitruProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((TriatlonProtobufs.DTOArbitruProto) data_);
                                data_ = subBuilder.buildPartial();
                            }
                            dataCase_ = 2;
                            break;
                        }
                        case 26: {
                            TriatlonProtobufs.ProbaProto.Builder subBuilder = null;
                            if (dataCase_ == 3) {
                                subBuilder = ((TriatlonProtobufs.ProbaProto) data_).toBuilder();
                            }
                            data_ =
                                    input.readMessage(TriatlonProtobufs.ProbaProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((TriatlonProtobufs.ProbaProto) data_);
                                data_ = subBuilder.buildPartial();
                            }
                            dataCase_ = 3;
                            break;
                        }
                        case 34: {
                            TriatlonProtobufs.DTORezultatProbaProto.Builder subBuilder = null;
                            if (dataCase_ == 4) {
                                subBuilder = ((TriatlonProtobufs.DTORezultatProbaProto) data_).toBuilder();
                            }
                            data_ =
                                    input.readMessage(TriatlonProtobufs.DTORezultatProbaProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((TriatlonProtobufs.DTORezultatProbaProto) data_);
                                data_ = subBuilder.buildPartial();
                            }
                            dataCase_ = 4;
                            break;
                        }
                        case 42: {
                            TriatlonProtobufs.ArbitruProto.Builder subBuilder = null;
                            if (dataCase_ == 5) {
                                subBuilder = ((TriatlonProtobufs.ArbitruProto) data_).toBuilder();
                            }
                            data_ =
                                    input.readMessage(TriatlonProtobufs.ArbitruProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((TriatlonProtobufs.ArbitruProto) data_);
                                data_ = subBuilder.buildPartial();
                            }
                            dataCase_ = 5;
                            break;
                        }
                        case 50: {
                            TriatlonProtobufs.ID.Builder subBuilder = null;
                            if (dataCase_ == 6) {
                                subBuilder = ((TriatlonProtobufs.ID) data_).toBuilder();
                            }
                            data_ =
                                    input.readMessage(TriatlonProtobufs.ID.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom((TriatlonProtobufs.ID) data_);
                                data_ = subBuilder.buildPartial();
                            }
                            dataCase_ = 6;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_TriatlonRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_TriatlonRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.TriatlonRequest.class, TriatlonProtobufs.TriatlonRequest.Builder.class);
        }

        /**
         * Protobuf enum {@code TriatlonRequest.Type}
         */
        public enum Type
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>Unknown = 0;</code>
             */
            Unknown(0),
            /**
             * <code>LOGIN = 1;</code>
             */
            LOGIN(1),
            /**
             * <code>LOGOUT = 2;</code>
             */
            LOGOUT(2),
            /**
             * <code>ADD_POINTS = 3;</code>
             */
            ADD_POINTS(3),
            /**
             * <code>GET_ALL_PARTICIPANTS = 4;</code>
             */
            GET_ALL_PARTICIPANTS(4),
            /**
             * <code>PROBA_BY_ARBITRU = 5;</code>
             */
            PROBA_BY_ARBITRU(5),
            /**
             * <code>PARTICIPANTS_NOT_FROM_PROBA = 6;</code>
             */
            PARTICIPANTS_NOT_FROM_PROBA(6),
            /**
             * <code>PARTICIPANTS_FROM_PROBA = 7;</code>
             */
            PARTICIPANTS_FROM_PROBA(7),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>Unknown = 0;</code>
             */
            public static final int Unknown_VALUE = 0;
            /**
             * <code>LOGIN = 1;</code>
             */
            public static final int LOGIN_VALUE = 1;
            /**
             * <code>LOGOUT = 2;</code>
             */
            public static final int LOGOUT_VALUE = 2;
            /**
             * <code>ADD_POINTS = 3;</code>
             */
            public static final int ADD_POINTS_VALUE = 3;
            /**
             * <code>GET_ALL_PARTICIPANTS = 4;</code>
             */
            public static final int GET_ALL_PARTICIPANTS_VALUE = 4;
            /**
             * <code>PROBA_BY_ARBITRU = 5;</code>
             */
            public static final int PROBA_BY_ARBITRU_VALUE = 5;
            /**
             * <code>PARTICIPANTS_NOT_FROM_PROBA = 6;</code>
             */
            public static final int PARTICIPANTS_NOT_FROM_PROBA_VALUE = 6;
            /**
             * <code>PARTICIPANTS_FROM_PROBA = 7;</code>
             */
            public static final int PARTICIPANTS_FROM_PROBA_VALUE = 7;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static Type valueOf(int value) {
                return forNumber(value);
            }

            public static Type forNumber(int value) {
                switch (value) {
                    case 0: return Unknown;
                    case 1: return LOGIN;
                    case 2: return LOGOUT;
                    case 3: return ADD_POINTS;
                    case 4: return GET_ALL_PARTICIPANTS;
                    case 5: return PROBA_BY_ARBITRU;
                    case 6: return PARTICIPANTS_NOT_FROM_PROBA;
                    case 7: return PARTICIPANTS_FROM_PROBA;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Type>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    Type> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                        public Type findValueByNumber(int number) {
                            return Type.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return TriatlonProtobufs.TriatlonRequest.getDescriptor().getEnumTypes().get(0);
            }

            private static final Type[] VALUES = values();

            public static Type valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private Type(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:TriatlonRequest.Type)
        }

        private int dataCase_ = 0;
        private java.lang.Object data_;
        public enum DataCase
                implements com.google.protobuf.Internal.EnumLite {
            ARBITRUDTO(2),
            PROBA(3),
            REZULTATPROBADTO(4),
            ARBITRU(5),
            ID(6),
            DATA_NOT_SET(0);
            private final int value;
            private DataCase(int value) {
                this.value = value;
            }
            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static DataCase valueOf(int value) {
                return forNumber(value);
            }

            public static DataCase forNumber(int value) {
                switch (value) {
                    case 2: return ARBITRUDTO;
                    case 3: return PROBA;
                    case 4: return REZULTATPROBADTO;
                    case 5: return ARBITRU;
                    case 6: return ID;
                    case 0: return DATA_NOT_SET;
                    default: return null;
                }
            }
            public int getNumber() {
                return this.value;
            }
        };

        public DataCase
        getDataCase() {
            return DataCase.forNumber(
                    dataCase_);
        }

        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        /**
         * <code>.TriatlonRequest.Type type = 1;</code>
         */
        public int getTypeValue() {
            return type_;
        }
        /**
         * <code>.TriatlonRequest.Type type = 1;</code>
         */
        public TriatlonProtobufs.TriatlonRequest.Type getType() {
            TriatlonProtobufs.TriatlonRequest.Type result = TriatlonProtobufs.TriatlonRequest.Type.valueOf(type_);
            return result == null ? TriatlonProtobufs.TriatlonRequest.Type.UNRECOGNIZED : result;
        }

        public static final int ARBITRUDTO_FIELD_NUMBER = 2;
        /**
         * <code>.DTOArbitruProto arbitruDTO = 2;</code>
         */
        public TriatlonProtobufs.DTOArbitruProto getArbitruDTO() {
            if (dataCase_ == 2) {
                return (TriatlonProtobufs.DTOArbitruProto) data_;
            }
            return TriatlonProtobufs.DTOArbitruProto.getDefaultInstance();
        }
        /**
         * <code>.DTOArbitruProto arbitruDTO = 2;</code>
         */
        public TriatlonProtobufs.DTOArbitruProtoOrBuilder getArbitruDTOOrBuilder() {
            if (dataCase_ == 2) {
                return (TriatlonProtobufs.DTOArbitruProto) data_;
            }
            return TriatlonProtobufs.DTOArbitruProto.getDefaultInstance();
        }

        public static final int PROBA_FIELD_NUMBER = 3;
        /**
         * <code>.ProbaProto proba = 3;</code>
         */
        public TriatlonProtobufs.ProbaProto getProba() {
            if (dataCase_ == 3) {
                return (TriatlonProtobufs.ProbaProto) data_;
            }
            return TriatlonProtobufs.ProbaProto.getDefaultInstance();
        }
        /**
         * <code>.ProbaProto proba = 3;</code>
         */
        public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
            if (dataCase_ == 3) {
                return (TriatlonProtobufs.ProbaProto) data_;
            }
            return TriatlonProtobufs.ProbaProto.getDefaultInstance();
        }

        public static final int REZULTATPROBADTO_FIELD_NUMBER = 4;
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
         */
        public TriatlonProtobufs.DTORezultatProbaProto getRezultatProbaDTO() {
            if (dataCase_ == 4) {
                return (TriatlonProtobufs.DTORezultatProbaProto) data_;
            }
            return TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance();
        }
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
         */
        public TriatlonProtobufs.DTORezultatProbaProtoOrBuilder getRezultatProbaDTOOrBuilder() {
            if (dataCase_ == 4) {
                return (TriatlonProtobufs.DTORezultatProbaProto) data_;
            }
            return TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance();
        }

        public static final int ARBITRU_FIELD_NUMBER = 5;
        /**
         * <code>.ArbitruProto arbitru = 5;</code>
         */
        public TriatlonProtobufs.ArbitruProto getArbitru() {
            if (dataCase_ == 5) {
                return (TriatlonProtobufs.ArbitruProto) data_;
            }
            return TriatlonProtobufs.ArbitruProto.getDefaultInstance();
        }
        /**
         * <code>.ArbitruProto arbitru = 5;</code>
         */
        public TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder() {
            if (dataCase_ == 5) {
                return (TriatlonProtobufs.ArbitruProto) data_;
            }
            return TriatlonProtobufs.ArbitruProto.getDefaultInstance();
        }

        public static final int ID_FIELD_NUMBER = 6;
        /**
         * <code>.ID id = 6;</code>
         */
        public TriatlonProtobufs.ID getId() {
            if (dataCase_ == 6) {
                return (TriatlonProtobufs.ID) data_;
            }
            return TriatlonProtobufs.ID.getDefaultInstance();
        }
        /**
         * <code>.ID id = 6;</code>
         */
        public TriatlonProtobufs.IDOrBuilder getIdOrBuilder() {
            if (dataCase_ == 6) {
                return (TriatlonProtobufs.ID) data_;
            }
            return TriatlonProtobufs.ID.getDefaultInstance();
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
            if (type_ != TriatlonProtobufs.TriatlonRequest.Type.Unknown.getNumber()) {
                output.writeEnum(1, type_);
            }
            if (dataCase_ == 2) {
                output.writeMessage(2, (TriatlonProtobufs.DTOArbitruProto) data_);
            }
            if (dataCase_ == 3) {
                output.writeMessage(3, (TriatlonProtobufs.ProbaProto) data_);
            }
            if (dataCase_ == 4) {
                output.writeMessage(4, (TriatlonProtobufs.DTORezultatProbaProto) data_);
            }
            if (dataCase_ == 5) {
                output.writeMessage(5, (TriatlonProtobufs.ArbitruProto) data_);
            }
            if (dataCase_ == 6) {
                output.writeMessage(6, (TriatlonProtobufs.ID) data_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (type_ != TriatlonProtobufs.TriatlonRequest.Type.Unknown.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, type_);
            }
            if (dataCase_ == 2) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, (TriatlonProtobufs.DTOArbitruProto) data_);
            }
            if (dataCase_ == 3) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, (TriatlonProtobufs.ProbaProto) data_);
            }
            if (dataCase_ == 4) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, (TriatlonProtobufs.DTORezultatProbaProto) data_);
            }
            if (dataCase_ == 5) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, (TriatlonProtobufs.ArbitruProto) data_);
            }
            if (dataCase_ == 6) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, (TriatlonProtobufs.ID) data_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.TriatlonRequest)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.TriatlonRequest other = (TriatlonProtobufs.TriatlonRequest) obj;

            boolean result = true;
            result = result && type_ == other.type_;
            result = result && getDataCase().equals(
                    other.getDataCase());
            if (!result) return false;
            switch (dataCase_) {
                case 2:
                    result = result && getArbitruDTO()
                            .equals(other.getArbitruDTO());
                    break;
                case 3:
                    result = result && getProba()
                            .equals(other.getProba());
                    break;
                case 4:
                    result = result && getRezultatProbaDTO()
                            .equals(other.getRezultatProbaDTO());
                    break;
                case 5:
                    result = result && getArbitru()
                            .equals(other.getArbitru());
                    break;
                case 6:
                    result = result && getId()
                            .equals(other.getId());
                    break;
                case 0:
                default:
            }
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + type_;
            switch (dataCase_) {
                case 2:
                    hash = (37 * hash) + ARBITRUDTO_FIELD_NUMBER;
                    hash = (53 * hash) + getArbitruDTO().hashCode();
                    break;
                case 3:
                    hash = (37 * hash) + PROBA_FIELD_NUMBER;
                    hash = (53 * hash) + getProba().hashCode();
                    break;
                case 4:
                    hash = (37 * hash) + REZULTATPROBADTO_FIELD_NUMBER;
                    hash = (53 * hash) + getRezultatProbaDTO().hashCode();
                    break;
                case 5:
                    hash = (37 * hash) + ARBITRU_FIELD_NUMBER;
                    hash = (53 * hash) + getArbitru().hashCode();
                    break;
                case 6:
                    hash = (37 * hash) + ID_FIELD_NUMBER;
                    hash = (53 * hash) + getId().hashCode();
                    break;
                case 0:
                default:
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.TriatlonRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.TriatlonRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.TriatlonRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code TriatlonRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:TriatlonRequest)
                TriatlonProtobufs.TriatlonRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_TriatlonRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_TriatlonRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.TriatlonRequest.class, TriatlonProtobufs.TriatlonRequest.Builder.class);
            }

            // Construct using TriatlonProtobufs.TriatlonRequest.newBuilder()
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
            public Builder clear() {
                super.clear();
                type_ = 0;

                dataCase_ = 0;
                data_ = null;
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_TriatlonRequest_descriptor;
            }

            public TriatlonProtobufs.TriatlonRequest getDefaultInstanceForType() {
                return TriatlonProtobufs.TriatlonRequest.getDefaultInstance();
            }

            public TriatlonProtobufs.TriatlonRequest build() {
                TriatlonProtobufs.TriatlonRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.TriatlonRequest buildPartial() {
                TriatlonProtobufs.TriatlonRequest result = new TriatlonProtobufs.TriatlonRequest(this);
                result.type_ = type_;
                if (dataCase_ == 2) {
                    if (arbitruDTOBuilder_ == null) {
                        result.data_ = data_;
                    } else {
                        result.data_ = arbitruDTOBuilder_.build();
                    }
                }
                if (dataCase_ == 3) {
                    if (probaBuilder_ == null) {
                        result.data_ = data_;
                    } else {
                        result.data_ = probaBuilder_.build();
                    }
                }
                if (dataCase_ == 4) {
                    if (rezultatProbaDTOBuilder_ == null) {
                        result.data_ = data_;
                    } else {
                        result.data_ = rezultatProbaDTOBuilder_.build();
                    }
                }
                if (dataCase_ == 5) {
                    if (arbitruBuilder_ == null) {
                        result.data_ = data_;
                    } else {
                        result.data_ = arbitruBuilder_.build();
                    }
                }
                if (dataCase_ == 6) {
                    if (idBuilder_ == null) {
                        result.data_ = data_;
                    } else {
                        result.data_ = idBuilder_.build();
                    }
                }
                result.dataCase_ = dataCase_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.TriatlonRequest) {
                    return mergeFrom((TriatlonProtobufs.TriatlonRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.TriatlonRequest other) {
                if (other == TriatlonProtobufs.TriatlonRequest.getDefaultInstance()) return this;
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                switch (other.getDataCase()) {
                    case ARBITRUDTO: {
                        mergeArbitruDTO(other.getArbitruDTO());
                        break;
                    }
                    case PROBA: {
                        mergeProba(other.getProba());
                        break;
                    }
                    case REZULTATPROBADTO: {
                        mergeRezultatProbaDTO(other.getRezultatProbaDTO());
                        break;
                    }
                    case ARBITRU: {
                        mergeArbitru(other.getArbitru());
                        break;
                    }
                    case ID: {
                        mergeId(other.getId());
                        break;
                    }
                    case DATA_NOT_SET: {
                        break;
                    }
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
                TriatlonProtobufs.TriatlonRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.TriatlonRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int dataCase_ = 0;
            private java.lang.Object data_;
            public DataCase
            getDataCase() {
                return DataCase.forNumber(
                        dataCase_);
            }

            public Builder clearData() {
                dataCase_ = 0;
                data_ = null;
                onChanged();
                return this;
            }


            private int type_ = 0;
            /**
             * <code>.TriatlonRequest.Type type = 1;</code>
             */
            public int getTypeValue() {
                return type_;
            }
            /**
             * <code>.TriatlonRequest.Type type = 1;</code>
             */
            public Builder setTypeValue(int value) {
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.TriatlonRequest.Type type = 1;</code>
             */
            public TriatlonProtobufs.TriatlonRequest.Type getType() {
                TriatlonProtobufs.TriatlonRequest.Type result = TriatlonProtobufs.TriatlonRequest.Type.valueOf(type_);
                return result == null ? TriatlonProtobufs.TriatlonRequest.Type.UNRECOGNIZED : result;
            }
            /**
             * <code>.TriatlonRequest.Type type = 1;</code>
             */
            public Builder setType(TriatlonProtobufs.TriatlonRequest.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                type_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.TriatlonRequest.Type type = 1;</code>
             */
            public Builder clearType() {

                type_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.DTOArbitruProto, TriatlonProtobufs.DTOArbitruProto.Builder, TriatlonProtobufs.DTOArbitruProtoOrBuilder> arbitruDTOBuilder_;
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            public TriatlonProtobufs.DTOArbitruProto getArbitruDTO() {
                if (arbitruDTOBuilder_ == null) {
                    if (dataCase_ == 2) {
                        return (TriatlonProtobufs.DTOArbitruProto) data_;
                    }
                    return TriatlonProtobufs.DTOArbitruProto.getDefaultInstance();
                } else {
                    if (dataCase_ == 2) {
                        return arbitruDTOBuilder_.getMessage();
                    }
                    return TriatlonProtobufs.DTOArbitruProto.getDefaultInstance();
                }
            }
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            public Builder setArbitruDTO(TriatlonProtobufs.DTOArbitruProto value) {
                if (arbitruDTOBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    data_ = value;
                    onChanged();
                } else {
                    arbitruDTOBuilder_.setMessage(value);
                }
                dataCase_ = 2;
                return this;
            }
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            public Builder setArbitruDTO(
                    TriatlonProtobufs.DTOArbitruProto.Builder builderForValue) {
                if (arbitruDTOBuilder_ == null) {
                    data_ = builderForValue.build();
                    onChanged();
                } else {
                    arbitruDTOBuilder_.setMessage(builderForValue.build());
                }
                dataCase_ = 2;
                return this;
            }
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            public Builder mergeArbitruDTO(TriatlonProtobufs.DTOArbitruProto value) {
                if (arbitruDTOBuilder_ == null) {
                    if (dataCase_ == 2 &&
                            data_ != TriatlonProtobufs.DTOArbitruProto.getDefaultInstance()) {
                        data_ = TriatlonProtobufs.DTOArbitruProto.newBuilder((TriatlonProtobufs.DTOArbitruProto) data_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        data_ = value;
                    }
                    onChanged();
                } else {
                    if (dataCase_ == 2) {
                        arbitruDTOBuilder_.mergeFrom(value);
                    }
                    arbitruDTOBuilder_.setMessage(value);
                }
                dataCase_ = 2;
                return this;
            }
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            public Builder clearArbitruDTO() {
                if (arbitruDTOBuilder_ == null) {
                    if (dataCase_ == 2) {
                        dataCase_ = 0;
                        data_ = null;
                        onChanged();
                    }
                } else {
                    if (dataCase_ == 2) {
                        dataCase_ = 0;
                        data_ = null;
                    }
                    arbitruDTOBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            public TriatlonProtobufs.DTOArbitruProto.Builder getArbitruDTOBuilder() {
                return getArbitruDTOFieldBuilder().getBuilder();
            }
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            public TriatlonProtobufs.DTOArbitruProtoOrBuilder getArbitruDTOOrBuilder() {
                if ((dataCase_ == 2) && (arbitruDTOBuilder_ != null)) {
                    return arbitruDTOBuilder_.getMessageOrBuilder();
                } else {
                    if (dataCase_ == 2) {
                        return (TriatlonProtobufs.DTOArbitruProto) data_;
                    }
                    return TriatlonProtobufs.DTOArbitruProto.getDefaultInstance();
                }
            }
            /**
             * <code>.DTOArbitruProto arbitruDTO = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.DTOArbitruProto, TriatlonProtobufs.DTOArbitruProto.Builder, TriatlonProtobufs.DTOArbitruProtoOrBuilder>
            getArbitruDTOFieldBuilder() {
                if (arbitruDTOBuilder_ == null) {
                    if (!(dataCase_ == 2)) {
                        data_ = TriatlonProtobufs.DTOArbitruProto.getDefaultInstance();
                    }
                    arbitruDTOBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.DTOArbitruProto, TriatlonProtobufs.DTOArbitruProto.Builder, TriatlonProtobufs.DTOArbitruProtoOrBuilder>(
                            (TriatlonProtobufs.DTOArbitruProto) data_,
                            getParentForChildren(),
                            isClean());
                    data_ = null;
                }
                dataCase_ = 2;
                onChanged();;
                return arbitruDTOBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder> probaBuilder_;
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            public TriatlonProtobufs.ProbaProto getProba() {
                if (probaBuilder_ == null) {
                    if (dataCase_ == 3) {
                        return (TriatlonProtobufs.ProbaProto) data_;
                    }
                    return TriatlonProtobufs.ProbaProto.getDefaultInstance();
                } else {
                    if (dataCase_ == 3) {
                        return probaBuilder_.getMessage();
                    }
                    return TriatlonProtobufs.ProbaProto.getDefaultInstance();
                }
            }
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            public Builder setProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    data_ = value;
                    onChanged();
                } else {
                    probaBuilder_.setMessage(value);
                }
                dataCase_ = 3;
                return this;
            }
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            public Builder setProba(
                    TriatlonProtobufs.ProbaProto.Builder builderForValue) {
                if (probaBuilder_ == null) {
                    data_ = builderForValue.build();
                    onChanged();
                } else {
                    probaBuilder_.setMessage(builderForValue.build());
                }
                dataCase_ = 3;
                return this;
            }
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            public Builder mergeProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (dataCase_ == 3 &&
                            data_ != TriatlonProtobufs.ProbaProto.getDefaultInstance()) {
                        data_ = TriatlonProtobufs.ProbaProto.newBuilder((TriatlonProtobufs.ProbaProto) data_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        data_ = value;
                    }
                    onChanged();
                } else {
                    if (dataCase_ == 3) {
                        probaBuilder_.mergeFrom(value);
                    }
                    probaBuilder_.setMessage(value);
                }
                dataCase_ = 3;
                return this;
            }
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            public Builder clearProba() {
                if (probaBuilder_ == null) {
                    if (dataCase_ == 3) {
                        dataCase_ = 0;
                        data_ = null;
                        onChanged();
                    }
                } else {
                    if (dataCase_ == 3) {
                        dataCase_ = 0;
                        data_ = null;
                    }
                    probaBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            public TriatlonProtobufs.ProbaProto.Builder getProbaBuilder() {
                return getProbaFieldBuilder().getBuilder();
            }
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
                if ((dataCase_ == 3) && (probaBuilder_ != null)) {
                    return probaBuilder_.getMessageOrBuilder();
                } else {
                    if (dataCase_ == 3) {
                        return (TriatlonProtobufs.ProbaProto) data_;
                    }
                    return TriatlonProtobufs.ProbaProto.getDefaultInstance();
                }
            }
            /**
             * <code>.ProbaProto proba = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>
            getProbaFieldBuilder() {
                if (probaBuilder_ == null) {
                    if (!(dataCase_ == 3)) {
                        data_ = TriatlonProtobufs.ProbaProto.getDefaultInstance();
                    }
                    probaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>(
                            (TriatlonProtobufs.ProbaProto) data_,
                            getParentForChildren(),
                            isClean());
                    data_ = null;
                }
                dataCase_ = 3;
                onChanged();;
                return probaBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.DTORezultatProbaProto, TriatlonProtobufs.DTORezultatProbaProto.Builder, TriatlonProtobufs.DTORezultatProbaProtoOrBuilder> rezultatProbaDTOBuilder_;
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            public TriatlonProtobufs.DTORezultatProbaProto getRezultatProbaDTO() {
                if (rezultatProbaDTOBuilder_ == null) {
                    if (dataCase_ == 4) {
                        return (TriatlonProtobufs.DTORezultatProbaProto) data_;
                    }
                    return TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance();
                } else {
                    if (dataCase_ == 4) {
                        return rezultatProbaDTOBuilder_.getMessage();
                    }
                    return TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance();
                }
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            public Builder setRezultatProbaDTO(TriatlonProtobufs.DTORezultatProbaProto value) {
                if (rezultatProbaDTOBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    data_ = value;
                    onChanged();
                } else {
                    rezultatProbaDTOBuilder_.setMessage(value);
                }
                dataCase_ = 4;
                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            public Builder setRezultatProbaDTO(
                    TriatlonProtobufs.DTORezultatProbaProto.Builder builderForValue) {
                if (rezultatProbaDTOBuilder_ == null) {
                    data_ = builderForValue.build();
                    onChanged();
                } else {
                    rezultatProbaDTOBuilder_.setMessage(builderForValue.build());
                }
                dataCase_ = 4;
                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            public Builder mergeRezultatProbaDTO(TriatlonProtobufs.DTORezultatProbaProto value) {
                if (rezultatProbaDTOBuilder_ == null) {
                    if (dataCase_ == 4 &&
                            data_ != TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance()) {
                        data_ = TriatlonProtobufs.DTORezultatProbaProto.newBuilder((TriatlonProtobufs.DTORezultatProbaProto) data_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        data_ = value;
                    }
                    onChanged();
                } else {
                    if (dataCase_ == 4) {
                        rezultatProbaDTOBuilder_.mergeFrom(value);
                    }
                    rezultatProbaDTOBuilder_.setMessage(value);
                }
                dataCase_ = 4;
                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            public Builder clearRezultatProbaDTO() {
                if (rezultatProbaDTOBuilder_ == null) {
                    if (dataCase_ == 4) {
                        dataCase_ = 0;
                        data_ = null;
                        onChanged();
                    }
                } else {
                    if (dataCase_ == 4) {
                        dataCase_ = 0;
                        data_ = null;
                    }
                    rezultatProbaDTOBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            public TriatlonProtobufs.DTORezultatProbaProto.Builder getRezultatProbaDTOBuilder() {
                return getRezultatProbaDTOFieldBuilder().getBuilder();
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            public TriatlonProtobufs.DTORezultatProbaProtoOrBuilder getRezultatProbaDTOOrBuilder() {
                if ((dataCase_ == 4) && (rezultatProbaDTOBuilder_ != null)) {
                    return rezultatProbaDTOBuilder_.getMessageOrBuilder();
                } else {
                    if (dataCase_ == 4) {
                        return (TriatlonProtobufs.DTORezultatProbaProto) data_;
                    }
                    return TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance();
                }
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.DTORezultatProbaProto, TriatlonProtobufs.DTORezultatProbaProto.Builder, TriatlonProtobufs.DTORezultatProbaProtoOrBuilder>
            getRezultatProbaDTOFieldBuilder() {
                if (rezultatProbaDTOBuilder_ == null) {
                    if (!(dataCase_ == 4)) {
                        data_ = TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance();
                    }
                    rezultatProbaDTOBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.DTORezultatProbaProto, TriatlonProtobufs.DTORezultatProbaProto.Builder, TriatlonProtobufs.DTORezultatProbaProtoOrBuilder>(
                            (TriatlonProtobufs.DTORezultatProbaProto) data_,
                            getParentForChildren(),
                            isClean());
                    data_ = null;
                }
                dataCase_ = 4;
                onChanged();;
                return rezultatProbaDTOBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder> arbitruBuilder_;
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            public TriatlonProtobufs.ArbitruProto getArbitru() {
                if (arbitruBuilder_ == null) {
                    if (dataCase_ == 5) {
                        return (TriatlonProtobufs.ArbitruProto) data_;
                    }
                    return TriatlonProtobufs.ArbitruProto.getDefaultInstance();
                } else {
                    if (dataCase_ == 5) {
                        return arbitruBuilder_.getMessage();
                    }
                    return TriatlonProtobufs.ArbitruProto.getDefaultInstance();
                }
            }
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            public Builder setArbitru(TriatlonProtobufs.ArbitruProto value) {
                if (arbitruBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    data_ = value;
                    onChanged();
                } else {
                    arbitruBuilder_.setMessage(value);
                }
                dataCase_ = 5;
                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            public Builder setArbitru(
                    TriatlonProtobufs.ArbitruProto.Builder builderForValue) {
                if (arbitruBuilder_ == null) {
                    data_ = builderForValue.build();
                    onChanged();
                } else {
                    arbitruBuilder_.setMessage(builderForValue.build());
                }
                dataCase_ = 5;
                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            public Builder mergeArbitru(TriatlonProtobufs.ArbitruProto value) {
                if (arbitruBuilder_ == null) {
                    if (dataCase_ == 5 &&
                            data_ != TriatlonProtobufs.ArbitruProto.getDefaultInstance()) {
                        data_ = TriatlonProtobufs.ArbitruProto.newBuilder((TriatlonProtobufs.ArbitruProto) data_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        data_ = value;
                    }
                    onChanged();
                } else {
                    if (dataCase_ == 5) {
                        arbitruBuilder_.mergeFrom(value);
                    }
                    arbitruBuilder_.setMessage(value);
                }
                dataCase_ = 5;
                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            public Builder clearArbitru() {
                if (arbitruBuilder_ == null) {
                    if (dataCase_ == 5) {
                        dataCase_ = 0;
                        data_ = null;
                        onChanged();
                    }
                } else {
                    if (dataCase_ == 5) {
                        dataCase_ = 0;
                        data_ = null;
                    }
                    arbitruBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            public TriatlonProtobufs.ArbitruProto.Builder getArbitruBuilder() {
                return getArbitruFieldBuilder().getBuilder();
            }
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            public TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder() {
                if ((dataCase_ == 5) && (arbitruBuilder_ != null)) {
                    return arbitruBuilder_.getMessageOrBuilder();
                } else {
                    if (dataCase_ == 5) {
                        return (TriatlonProtobufs.ArbitruProto) data_;
                    }
                    return TriatlonProtobufs.ArbitruProto.getDefaultInstance();
                }
            }
            /**
             * <code>.ArbitruProto arbitru = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder>
            getArbitruFieldBuilder() {
                if (arbitruBuilder_ == null) {
                    if (!(dataCase_ == 5)) {
                        data_ = TriatlonProtobufs.ArbitruProto.getDefaultInstance();
                    }
                    arbitruBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder>(
                            (TriatlonProtobufs.ArbitruProto) data_,
                            getParentForChildren(),
                            isClean());
                    data_ = null;
                }
                dataCase_ = 5;
                onChanged();;
                return arbitruBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ID, TriatlonProtobufs.ID.Builder, TriatlonProtobufs.IDOrBuilder> idBuilder_;
            /**
             * <code>.ID id = 6;</code>
             */
            public TriatlonProtobufs.ID getId() {
                if (idBuilder_ == null) {
                    if (dataCase_ == 6) {
                        return (TriatlonProtobufs.ID) data_;
                    }
                    return TriatlonProtobufs.ID.getDefaultInstance();
                } else {
                    if (dataCase_ == 6) {
                        return idBuilder_.getMessage();
                    }
                    return TriatlonProtobufs.ID.getDefaultInstance();
                }
            }
            /**
             * <code>.ID id = 6;</code>
             */
            public Builder setId(TriatlonProtobufs.ID value) {
                if (idBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    data_ = value;
                    onChanged();
                } else {
                    idBuilder_.setMessage(value);
                }
                dataCase_ = 6;
                return this;
            }
            /**
             * <code>.ID id = 6;</code>
             */
            public Builder setId(
                    TriatlonProtobufs.ID.Builder builderForValue) {
                if (idBuilder_ == null) {
                    data_ = builderForValue.build();
                    onChanged();
                } else {
                    idBuilder_.setMessage(builderForValue.build());
                }
                dataCase_ = 6;
                return this;
            }
            /**
             * <code>.ID id = 6;</code>
             */
            public Builder mergeId(TriatlonProtobufs.ID value) {
                if (idBuilder_ == null) {
                    if (dataCase_ == 6 &&
                            data_ != TriatlonProtobufs.ID.getDefaultInstance()) {
                        data_ = TriatlonProtobufs.ID.newBuilder((TriatlonProtobufs.ID) data_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        data_ = value;
                    }
                    onChanged();
                } else {
                    if (dataCase_ == 6) {
                        idBuilder_.mergeFrom(value);
                    }
                    idBuilder_.setMessage(value);
                }
                dataCase_ = 6;
                return this;
            }
            /**
             * <code>.ID id = 6;</code>
             */
            public Builder clearId() {
                if (idBuilder_ == null) {
                    if (dataCase_ == 6) {
                        dataCase_ = 0;
                        data_ = null;
                        onChanged();
                    }
                } else {
                    if (dataCase_ == 6) {
                        dataCase_ = 0;
                        data_ = null;
                    }
                    idBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.ID id = 6;</code>
             */
            public TriatlonProtobufs.ID.Builder getIdBuilder() {
                return getIdFieldBuilder().getBuilder();
            }
            /**
             * <code>.ID id = 6;</code>
             */
            public TriatlonProtobufs.IDOrBuilder getIdOrBuilder() {
                if ((dataCase_ == 6) && (idBuilder_ != null)) {
                    return idBuilder_.getMessageOrBuilder();
                } else {
                    if (dataCase_ == 6) {
                        return (TriatlonProtobufs.ID) data_;
                    }
                    return TriatlonProtobufs.ID.getDefaultInstance();
                }
            }
            /**
             * <code>.ID id = 6;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ID, TriatlonProtobufs.ID.Builder, TriatlonProtobufs.IDOrBuilder>
            getIdFieldBuilder() {
                if (idBuilder_ == null) {
                    if (!(dataCase_ == 6)) {
                        data_ = TriatlonProtobufs.ID.getDefaultInstance();
                    }
                    idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ID, TriatlonProtobufs.ID.Builder, TriatlonProtobufs.IDOrBuilder>(
                            (TriatlonProtobufs.ID) data_,
                            getParentForChildren(),
                            isClean());
                    data_ = null;
                }
                dataCase_ = 6;
                onChanged();;
                return idBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:TriatlonRequest)
        }

        // @@protoc_insertion_point(class_scope:TriatlonRequest)
        private static final TriatlonProtobufs.TriatlonRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.TriatlonRequest();
        }

        public static TriatlonProtobufs.TriatlonRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TriatlonRequest>
                PARSER = new com.google.protobuf.AbstractParser<TriatlonRequest>() {
            public TriatlonRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TriatlonRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TriatlonRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TriatlonRequest> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.TriatlonRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TriatlonResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:TriatlonResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.TriatlonResponse.Type type = 1;</code>
         */
        int getTypeValue();
        /**
         * <code>.TriatlonResponse.Type type = 1;</code>
         */
        TriatlonProtobufs.TriatlonResponse.Type getType();

        /**
         * <code>string error = 2;</code>
         */
        java.lang.String getError();
        /**
         * <code>string error = 2;</code>
         */
        com.google.protobuf.ByteString
        getErrorBytes();

        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        boolean hasArbitru();
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        TriatlonProtobufs.ArbitruProto getArbitru();
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder();

        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        java.util.List<TriatlonProtobufs.ParticipantPointsDTOProto>
        getParticipantsList();
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        TriatlonProtobufs.ParticipantPointsDTOProto getParticipants(int index);
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        int getParticipantsCount();
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        java.util.List<? extends TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder>
        getParticipantsOrBuilderList();
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder getParticipantsOrBuilder(
                int index);

        /**
         * <code>.ProbaProto proba = 5;</code>
         */
        boolean hasProba();
        /**
         * <code>.ProbaProto proba = 5;</code>
         */
        TriatlonProtobufs.ProbaProto getProba();
        /**
         * <code>.ProbaProto proba = 5;</code>
         */
        TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder();

        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        java.util.List<TriatlonProtobufs.ParticipantProto>
        getParticipantsNotFromProbaList();
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        TriatlonProtobufs.ParticipantProto getParticipantsNotFromProba(int index);
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        int getParticipantsNotFromProbaCount();
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        java.util.List<? extends TriatlonProtobufs.ParticipantProtoOrBuilder>
        getParticipantsNotFromProbaOrBuilderList();
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantsNotFromProbaOrBuilder(
                int index);

        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
         */
        boolean hasRezultatProbaDTO();
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
         */
        TriatlonProtobufs.DTORezultatProbaProto getRezultatProbaDTO();
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
         */
        TriatlonProtobufs.DTORezultatProbaProtoOrBuilder getRezultatProbaDTOOrBuilder();
    }
    /**
     * Protobuf type {@code TriatlonResponse}
     */
    public  static final class TriatlonResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:TriatlonResponse)
            TriatlonResponseOrBuilder {
        // Use TriatlonResponse.newBuilder() to construct.
        private TriatlonResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TriatlonResponse() {
            type_ = 0;
            error_ = "";
            participants_ = java.util.Collections.emptyList();
            participantsNotFromProba_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }
        private TriatlonResponse(
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
                        case 8: {
                            int rawValue = input.readEnum();

                            type_ = rawValue;
                            break;
                        }
                        case 18: {
                            java.lang.String s = input.readStringRequireUtf8();

                            error_ = s;
                            break;
                        }
                        case 26: {
                            TriatlonProtobufs.ArbitruProto.Builder subBuilder = null;
                            if (arbitru_ != null) {
                                subBuilder = arbitru_.toBuilder();
                            }
                            arbitru_ = input.readMessage(TriatlonProtobufs.ArbitruProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(arbitru_);
                                arbitru_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 34: {
                            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                                participants_ = new java.util.ArrayList<TriatlonProtobufs.ParticipantPointsDTOProto>();
                                mutable_bitField0_ |= 0x00000008;
                            }
                            participants_.add(
                                    input.readMessage(TriatlonProtobufs.ParticipantPointsDTOProto.parser(), extensionRegistry));
                            break;
                        }
                        case 42: {
                            TriatlonProtobufs.ProbaProto.Builder subBuilder = null;
                            if (proba_ != null) {
                                subBuilder = proba_.toBuilder();
                            }
                            proba_ = input.readMessage(TriatlonProtobufs.ProbaProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(proba_);
                                proba_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                        case 50: {
                            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                participantsNotFromProba_ = new java.util.ArrayList<TriatlonProtobufs.ParticipantProto>();
                                mutable_bitField0_ |= 0x00000020;
                            }
                            participantsNotFromProba_.add(
                                    input.readMessage(TriatlonProtobufs.ParticipantProto.parser(), extensionRegistry));
                            break;
                        }
                        case 58: {
                            TriatlonProtobufs.DTORezultatProbaProto.Builder subBuilder = null;
                            if (rezultatProbaDTO_ != null) {
                                subBuilder = rezultatProbaDTO_.toBuilder();
                            }
                            rezultatProbaDTO_ = input.readMessage(TriatlonProtobufs.DTORezultatProbaProto.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(rezultatProbaDTO_);
                                rezultatProbaDTO_ = subBuilder.buildPartial();
                            }

                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                    participants_ = java.util.Collections.unmodifiableList(participants_);
                }
                if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                    participantsNotFromProba_ = java.util.Collections.unmodifiableList(participantsNotFromProba_);
                }
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return TriatlonProtobufs.internal_static_TriatlonResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return TriatlonProtobufs.internal_static_TriatlonResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TriatlonProtobufs.TriatlonResponse.class, TriatlonProtobufs.TriatlonResponse.Builder.class);
        }

        /**
         * Protobuf enum {@code TriatlonResponse.Type}
         */
        public enum Type
                implements com.google.protobuf.ProtocolMessageEnum {
            /**
             * <code>Unknown = 0;</code>
             */
            Unknown(0),
            /**
             * <code>OK = 1;</code>
             */
            OK(1),
            /**
             * <code>ERROR = 2;</code>
             */
            ERROR(2),
            /**
             * <code>ADDED_POINTS = 3;</code>
             */
            ADDED_POINTS(3),
            UNRECOGNIZED(-1),
            ;

            /**
             * <code>Unknown = 0;</code>
             */
            public static final int Unknown_VALUE = 0;
            /**
             * <code>OK = 1;</code>
             */
            public static final int OK_VALUE = 1;
            /**
             * <code>ERROR = 2;</code>
             */
            public static final int ERROR_VALUE = 2;
            /**
             * <code>ADDED_POINTS = 3;</code>
             */
            public static final int ADDED_POINTS_VALUE = 3;


            public final int getNumber() {
                if (this == UNRECOGNIZED) {
                    throw new java.lang.IllegalArgumentException(
                            "Can't get the number of an unknown enum value.");
                }
                return value;
            }

            /**
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static Type valueOf(int value) {
                return forNumber(value);
            }

            public static Type forNumber(int value) {
                switch (value) {
                    case 0: return Unknown;
                    case 1: return OK;
                    case 2: return ERROR;
                    case 3: return ADDED_POINTS;
                    default: return null;
                }
            }

            public static com.google.protobuf.Internal.EnumLiteMap<Type>
            internalGetValueMap() {
                return internalValueMap;
            }
            private static final com.google.protobuf.Internal.EnumLiteMap<
                    Type> internalValueMap =
                    new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                        public Type findValueByNumber(int number) {
                            return Type.forNumber(number);
                        }
                    };

            public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }
            public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
                return getDescriptor();
            }
            public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
                return TriatlonProtobufs.TriatlonResponse.getDescriptor().getEnumTypes().get(0);
            }

            private static final Type[] VALUES = values();

            public static Type valueOf(
                    com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
                if (desc.getType() != getDescriptor()) {
                    throw new java.lang.IllegalArgumentException(
                            "EnumValueDescriptor is not for this type.");
                }
                if (desc.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[desc.getIndex()];
            }

            private final int value;

            private Type(int value) {
                this.value = value;
            }

            // @@protoc_insertion_point(enum_scope:TriatlonResponse.Type)
        }

        private int bitField0_;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_;
        /**
         * <code>.TriatlonResponse.Type type = 1;</code>
         */
        public int getTypeValue() {
            return type_;
        }
        /**
         * <code>.TriatlonResponse.Type type = 1;</code>
         */
        public TriatlonProtobufs.TriatlonResponse.Type getType() {
            TriatlonProtobufs.TriatlonResponse.Type result = TriatlonProtobufs.TriatlonResponse.Type.valueOf(type_);
            return result == null ? TriatlonProtobufs.TriatlonResponse.Type.UNRECOGNIZED : result;
        }

        public static final int ERROR_FIELD_NUMBER = 2;
        private volatile java.lang.Object error_;
        /**
         * <code>string error = 2;</code>
         */
        public java.lang.String getError() {
            java.lang.Object ref = error_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                error_ = s;
                return s;
            }
        }
        /**
         * <code>string error = 2;</code>
         */
        public com.google.protobuf.ByteString
        getErrorBytes() {
            java.lang.Object ref = error_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                error_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int ARBITRU_FIELD_NUMBER = 3;
        private TriatlonProtobufs.ArbitruProto arbitru_;
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        public boolean hasArbitru() {
            return arbitru_ != null;
        }
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        public TriatlonProtobufs.ArbitruProto getArbitru() {
            return arbitru_ == null ? TriatlonProtobufs.ArbitruProto.getDefaultInstance() : arbitru_;
        }
        /**
         * <code>.ArbitruProto arbitru = 3;</code>
         */
        public TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder() {
            return getArbitru();
        }

        public static final int PARTICIPANTS_FIELD_NUMBER = 4;
        private java.util.List<TriatlonProtobufs.ParticipantPointsDTOProto> participants_;
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        public java.util.List<TriatlonProtobufs.ParticipantPointsDTOProto> getParticipantsList() {
            return participants_;
        }
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        public java.util.List<? extends TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder>
        getParticipantsOrBuilderList() {
            return participants_;
        }
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        public int getParticipantsCount() {
            return participants_.size();
        }
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        public TriatlonProtobufs.ParticipantPointsDTOProto getParticipants(int index) {
            return participants_.get(index);
        }
        /**
         * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
         */
        public TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder getParticipantsOrBuilder(
                int index) {
            return participants_.get(index);
        }

        public static final int PROBA_FIELD_NUMBER = 5;
        private TriatlonProtobufs.ProbaProto proba_;
        /**
         * <code>.ProbaProto proba = 5;</code>
         */
        public boolean hasProba() {
            return proba_ != null;
        }
        /**
         * <code>.ProbaProto proba = 5;</code>
         */
        public TriatlonProtobufs.ProbaProto getProba() {
            return proba_ == null ? TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
        }
        /**
         * <code>.ProbaProto proba = 5;</code>
         */
        public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
            return getProba();
        }

        public static final int PARTICIPANTSNOTFROMPROBA_FIELD_NUMBER = 6;
        private java.util.List<TriatlonProtobufs.ParticipantProto> participantsNotFromProba_;
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        public java.util.List<TriatlonProtobufs.ParticipantProto> getParticipantsNotFromProbaList() {
            return participantsNotFromProba_;
        }
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        public java.util.List<? extends TriatlonProtobufs.ParticipantProtoOrBuilder>
        getParticipantsNotFromProbaOrBuilderList() {
            return participantsNotFromProba_;
        }
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        public int getParticipantsNotFromProbaCount() {
            return participantsNotFromProba_.size();
        }
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        public TriatlonProtobufs.ParticipantProto getParticipantsNotFromProba(int index) {
            return participantsNotFromProba_.get(index);
        }
        /**
         * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
         */
        public TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantsNotFromProbaOrBuilder(
                int index) {
            return participantsNotFromProba_.get(index);
        }

        public static final int REZULTATPROBADTO_FIELD_NUMBER = 7;
        private TriatlonProtobufs.DTORezultatProbaProto rezultatProbaDTO_;
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
         */
        public boolean hasRezultatProbaDTO() {
            return rezultatProbaDTO_ != null;
        }
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
         */
        public TriatlonProtobufs.DTORezultatProbaProto getRezultatProbaDTO() {
            return rezultatProbaDTO_ == null ? TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance() : rezultatProbaDTO_;
        }
        /**
         * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
         */
        public TriatlonProtobufs.DTORezultatProbaProtoOrBuilder getRezultatProbaDTOOrBuilder() {
            return getRezultatProbaDTO();
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
            if (type_ != TriatlonProtobufs.TriatlonResponse.Type.Unknown.getNumber()) {
                output.writeEnum(1, type_);
            }
            if (!getErrorBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
            }
            if (arbitru_ != null) {
                output.writeMessage(3, getArbitru());
            }
            for (int i = 0; i < participants_.size(); i++) {
                output.writeMessage(4, participants_.get(i));
            }
            if (proba_ != null) {
                output.writeMessage(5, getProba());
            }
            for (int i = 0; i < participantsNotFromProba_.size(); i++) {
                output.writeMessage(6, participantsNotFromProba_.get(i));
            }
            if (rezultatProbaDTO_ != null) {
                output.writeMessage(7, getRezultatProbaDTO());
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (type_ != TriatlonProtobufs.TriatlonResponse.Type.Unknown.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, type_);
            }
            if (!getErrorBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
            }
            if (arbitru_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getArbitru());
            }
            for (int i = 0; i < participants_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, participants_.get(i));
            }
            if (proba_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, getProba());
            }
            for (int i = 0; i < participantsNotFromProba_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, participantsNotFromProba_.get(i));
            }
            if (rezultatProbaDTO_ != null) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(7, getRezultatProbaDTO());
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriatlonProtobufs.TriatlonResponse)) {
                return super.equals(obj);
            }
            TriatlonProtobufs.TriatlonResponse other = (TriatlonProtobufs.TriatlonResponse) obj;

            boolean result = true;
            result = result && type_ == other.type_;
            result = result && getError()
                    .equals(other.getError());
            result = result && (hasArbitru() == other.hasArbitru());
            if (hasArbitru()) {
                result = result && getArbitru()
                        .equals(other.getArbitru());
            }
            result = result && getParticipantsList()
                    .equals(other.getParticipantsList());
            result = result && (hasProba() == other.hasProba());
            if (hasProba()) {
                result = result && getProba()
                        .equals(other.getProba());
            }
            result = result && getParticipantsNotFromProbaList()
                    .equals(other.getParticipantsNotFromProbaList());
            result = result && (hasRezultatProbaDTO() == other.hasRezultatProbaDTO());
            if (hasRezultatProbaDTO()) {
                result = result && getRezultatProbaDTO()
                        .equals(other.getRezultatProbaDTO());
            }
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + type_;
            hash = (37 * hash) + ERROR_FIELD_NUMBER;
            hash = (53 * hash) + getError().hashCode();
            if (hasArbitru()) {
                hash = (37 * hash) + ARBITRU_FIELD_NUMBER;
                hash = (53 * hash) + getArbitru().hashCode();
            }
            if (getParticipantsCount() > 0) {
                hash = (37 * hash) + PARTICIPANTS_FIELD_NUMBER;
                hash = (53 * hash) + getParticipantsList().hashCode();
            }
            if (hasProba()) {
                hash = (37 * hash) + PROBA_FIELD_NUMBER;
                hash = (53 * hash) + getProba().hashCode();
            }
            if (getParticipantsNotFromProbaCount() > 0) {
                hash = (37 * hash) + PARTICIPANTSNOTFROMPROBA_FIELD_NUMBER;
                hash = (53 * hash) + getParticipantsNotFromProbaList().hashCode();
            }
            if (hasRezultatProbaDTO()) {
                hash = (37 * hash) + REZULTATPROBADTO_FIELD_NUMBER;
                hash = (53 * hash) + getRezultatProbaDTO().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.TriatlonResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TriatlonProtobufs.TriatlonResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TriatlonProtobufs.TriatlonResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
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
         * Protobuf type {@code TriatlonResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:TriatlonResponse)
                TriatlonProtobufs.TriatlonResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return TriatlonProtobufs.internal_static_TriatlonResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return TriatlonProtobufs.internal_static_TriatlonResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TriatlonProtobufs.TriatlonResponse.class, TriatlonProtobufs.TriatlonResponse.Builder.class);
            }

            // Construct using TriatlonProtobufs.TriatlonResponse.newBuilder()
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
                    getParticipantsFieldBuilder();
                    getParticipantsNotFromProbaFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                type_ = 0;

                error_ = "";

                if (arbitruBuilder_ == null) {
                    arbitru_ = null;
                } else {
                    arbitru_ = null;
                    arbitruBuilder_ = null;
                }
                if (participantsBuilder_ == null) {
                    participants_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                } else {
                    participantsBuilder_.clear();
                }
                if (probaBuilder_ == null) {
                    proba_ = null;
                } else {
                    proba_ = null;
                    probaBuilder_ = null;
                }
                if (participantsNotFromProbaBuilder_ == null) {
                    participantsNotFromProba_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                } else {
                    participantsNotFromProbaBuilder_.clear();
                }
                if (rezultatProbaDTOBuilder_ == null) {
                    rezultatProbaDTO_ = null;
                } else {
                    rezultatProbaDTO_ = null;
                    rezultatProbaDTOBuilder_ = null;
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return TriatlonProtobufs.internal_static_TriatlonResponse_descriptor;
            }

            public TriatlonProtobufs.TriatlonResponse getDefaultInstanceForType() {
                return TriatlonProtobufs.TriatlonResponse.getDefaultInstance();
            }

            public TriatlonProtobufs.TriatlonResponse build() {
                TriatlonProtobufs.TriatlonResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TriatlonProtobufs.TriatlonResponse buildPartial() {
                TriatlonProtobufs.TriatlonResponse result = new TriatlonProtobufs.TriatlonResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                result.type_ = type_;
                result.error_ = error_;
                if (arbitruBuilder_ == null) {
                    result.arbitru_ = arbitru_;
                } else {
                    result.arbitru_ = arbitruBuilder_.build();
                }
                if (participantsBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) == 0x00000008)) {
                        participants_ = java.util.Collections.unmodifiableList(participants_);
                        bitField0_ = (bitField0_ & ~0x00000008);
                    }
                    result.participants_ = participants_;
                } else {
                    result.participants_ = participantsBuilder_.build();
                }
                if (probaBuilder_ == null) {
                    result.proba_ = proba_;
                } else {
                    result.proba_ = probaBuilder_.build();
                }
                if (participantsNotFromProbaBuilder_ == null) {
                    if (((bitField0_ & 0x00000020) == 0x00000020)) {
                        participantsNotFromProba_ = java.util.Collections.unmodifiableList(participantsNotFromProba_);
                        bitField0_ = (bitField0_ & ~0x00000020);
                    }
                    result.participantsNotFromProba_ = participantsNotFromProba_;
                } else {
                    result.participantsNotFromProba_ = participantsNotFromProbaBuilder_.build();
                }
                if (rezultatProbaDTOBuilder_ == null) {
                    result.rezultatProbaDTO_ = rezultatProbaDTO_;
                } else {
                    result.rezultatProbaDTO_ = rezultatProbaDTOBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TriatlonProtobufs.TriatlonResponse) {
                    return mergeFrom((TriatlonProtobufs.TriatlonResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TriatlonProtobufs.TriatlonResponse other) {
                if (other == TriatlonProtobufs.TriatlonResponse.getDefaultInstance()) return this;
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                if (!other.getError().isEmpty()) {
                    error_ = other.error_;
                    onChanged();
                }
                if (other.hasArbitru()) {
                    mergeArbitru(other.getArbitru());
                }
                if (participantsBuilder_ == null) {
                    if (!other.participants_.isEmpty()) {
                        if (participants_.isEmpty()) {
                            participants_ = other.participants_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                        } else {
                            ensureParticipantsIsMutable();
                            participants_.addAll(other.participants_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.participants_.isEmpty()) {
                        if (participantsBuilder_.isEmpty()) {
                            participantsBuilder_.dispose();
                            participantsBuilder_ = null;
                            participants_ = other.participants_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                            participantsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getParticipantsFieldBuilder() : null;
                        } else {
                            participantsBuilder_.addAllMessages(other.participants_);
                        }
                    }
                }
                if (other.hasProba()) {
                    mergeProba(other.getProba());
                }
                if (participantsNotFromProbaBuilder_ == null) {
                    if (!other.participantsNotFromProba_.isEmpty()) {
                        if (participantsNotFromProba_.isEmpty()) {
                            participantsNotFromProba_ = other.participantsNotFromProba_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                        } else {
                            ensureParticipantsNotFromProbaIsMutable();
                            participantsNotFromProba_.addAll(other.participantsNotFromProba_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.participantsNotFromProba_.isEmpty()) {
                        if (participantsNotFromProbaBuilder_.isEmpty()) {
                            participantsNotFromProbaBuilder_.dispose();
                            participantsNotFromProbaBuilder_ = null;
                            participantsNotFromProba_ = other.participantsNotFromProba_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                            participantsNotFromProbaBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getParticipantsNotFromProbaFieldBuilder() : null;
                        } else {
                            participantsNotFromProbaBuilder_.addAllMessages(other.participantsNotFromProba_);
                        }
                    }
                }
                if (other.hasRezultatProbaDTO()) {
                    mergeRezultatProbaDTO(other.getRezultatProbaDTO());
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
                TriatlonProtobufs.TriatlonResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TriatlonProtobufs.TriatlonResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int type_ = 0;
            /**
             * <code>.TriatlonResponse.Type type = 1;</code>
             */
            public int getTypeValue() {
                return type_;
            }
            /**
             * <code>.TriatlonResponse.Type type = 1;</code>
             */
            public Builder setTypeValue(int value) {
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.TriatlonResponse.Type type = 1;</code>
             */
            public TriatlonProtobufs.TriatlonResponse.Type getType() {
                TriatlonProtobufs.TriatlonResponse.Type result = TriatlonProtobufs.TriatlonResponse.Type.valueOf(type_);
                return result == null ? TriatlonProtobufs.TriatlonResponse.Type.UNRECOGNIZED : result;
            }
            /**
             * <code>.TriatlonResponse.Type type = 1;</code>
             */
            public Builder setType(TriatlonProtobufs.TriatlonResponse.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                type_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.TriatlonResponse.Type type = 1;</code>
             */
            public Builder clearType() {

                type_ = 0;
                onChanged();
                return this;
            }

            private java.lang.Object error_ = "";
            /**
             * <code>string error = 2;</code>
             */
            public java.lang.String getError() {
                java.lang.Object ref = error_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    error_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string error = 2;</code>
             */
            public com.google.protobuf.ByteString
            getErrorBytes() {
                java.lang.Object ref = error_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    error_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string error = 2;</code>
             */
            public Builder setError(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                error_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>string error = 2;</code>
             */
            public Builder clearError() {

                error_ = getDefaultInstance().getError();
                onChanged();
                return this;
            }
            /**
             * <code>string error = 2;</code>
             */
            public Builder setErrorBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                error_ = value;
                onChanged();
                return this;
            }

            private TriatlonProtobufs.ArbitruProto arbitru_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder> arbitruBuilder_;
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public boolean hasArbitru() {
                return arbitruBuilder_ != null || arbitru_ != null;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public TriatlonProtobufs.ArbitruProto getArbitru() {
                if (arbitruBuilder_ == null) {
                    return arbitru_ == null ? TriatlonProtobufs.ArbitruProto.getDefaultInstance() : arbitru_;
                } else {
                    return arbitruBuilder_.getMessage();
                }
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder setArbitru(TriatlonProtobufs.ArbitruProto value) {
                if (arbitruBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    arbitru_ = value;
                    onChanged();
                } else {
                    arbitruBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder setArbitru(
                    TriatlonProtobufs.ArbitruProto.Builder builderForValue) {
                if (arbitruBuilder_ == null) {
                    arbitru_ = builderForValue.build();
                    onChanged();
                } else {
                    arbitruBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder mergeArbitru(TriatlonProtobufs.ArbitruProto value) {
                if (arbitruBuilder_ == null) {
                    if (arbitru_ != null) {
                        arbitru_ =
                                TriatlonProtobufs.ArbitruProto.newBuilder(arbitru_).mergeFrom(value).buildPartial();
                    } else {
                        arbitru_ = value;
                    }
                    onChanged();
                } else {
                    arbitruBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public Builder clearArbitru() {
                if (arbitruBuilder_ == null) {
                    arbitru_ = null;
                    onChanged();
                } else {
                    arbitru_ = null;
                    arbitruBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public TriatlonProtobufs.ArbitruProto.Builder getArbitruBuilder() {

                onChanged();
                return getArbitruFieldBuilder().getBuilder();
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            public TriatlonProtobufs.ArbitruProtoOrBuilder getArbitruOrBuilder() {
                if (arbitruBuilder_ != null) {
                    return arbitruBuilder_.getMessageOrBuilder();
                } else {
                    return arbitru_ == null ?
                            TriatlonProtobufs.ArbitruProto.getDefaultInstance() : arbitru_;
                }
            }
            /**
             * <code>.ArbitruProto arbitru = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder>
            getArbitruFieldBuilder() {
                if (arbitruBuilder_ == null) {
                    arbitruBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ArbitruProto, TriatlonProtobufs.ArbitruProto.Builder, TriatlonProtobufs.ArbitruProtoOrBuilder>(
                            getArbitru(),
                            getParentForChildren(),
                            isClean());
                    arbitru_ = null;
                }
                return arbitruBuilder_;
            }

            private java.util.List<TriatlonProtobufs.ParticipantPointsDTOProto> participants_ =
                    java.util.Collections.emptyList();
            private void ensureParticipantsIsMutable() {
                if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                    participants_ = new java.util.ArrayList<TriatlonProtobufs.ParticipantPointsDTOProto>(participants_);
                    bitField0_ |= 0x00000008;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TriatlonProtobufs.ParticipantPointsDTOProto, TriatlonProtobufs.ParticipantPointsDTOProto.Builder, TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder> participantsBuilder_;

            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public java.util.List<TriatlonProtobufs.ParticipantPointsDTOProto> getParticipantsList() {
                if (participantsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(participants_);
                } else {
                    return participantsBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public int getParticipantsCount() {
                if (participantsBuilder_ == null) {
                    return participants_.size();
                } else {
                    return participantsBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public TriatlonProtobufs.ParticipantPointsDTOProto getParticipants(int index) {
                if (participantsBuilder_ == null) {
                    return participants_.get(index);
                } else {
                    return participantsBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder setParticipants(
                    int index, TriatlonProtobufs.ParticipantPointsDTOProto value) {
                if (participantsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParticipantsIsMutable();
                    participants_.set(index, value);
                    onChanged();
                } else {
                    participantsBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder setParticipants(
                    int index, TriatlonProtobufs.ParticipantPointsDTOProto.Builder builderForValue) {
                if (participantsBuilder_ == null) {
                    ensureParticipantsIsMutable();
                    participants_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    participantsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder addParticipants(TriatlonProtobufs.ParticipantPointsDTOProto value) {
                if (participantsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParticipantsIsMutable();
                    participants_.add(value);
                    onChanged();
                } else {
                    participantsBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder addParticipants(
                    int index, TriatlonProtobufs.ParticipantPointsDTOProto value) {
                if (participantsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParticipantsIsMutable();
                    participants_.add(index, value);
                    onChanged();
                } else {
                    participantsBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder addParticipants(
                    TriatlonProtobufs.ParticipantPointsDTOProto.Builder builderForValue) {
                if (participantsBuilder_ == null) {
                    ensureParticipantsIsMutable();
                    participants_.add(builderForValue.build());
                    onChanged();
                } else {
                    participantsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder addParticipants(
                    int index, TriatlonProtobufs.ParticipantPointsDTOProto.Builder builderForValue) {
                if (participantsBuilder_ == null) {
                    ensureParticipantsIsMutable();
                    participants_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    participantsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder addAllParticipants(
                    java.lang.Iterable<? extends TriatlonProtobufs.ParticipantPointsDTOProto> values) {
                if (participantsBuilder_ == null) {
                    ensureParticipantsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, participants_);
                    onChanged();
                } else {
                    participantsBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder clearParticipants() {
                if (participantsBuilder_ == null) {
                    participants_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                    onChanged();
                } else {
                    participantsBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public Builder removeParticipants(int index) {
                if (participantsBuilder_ == null) {
                    ensureParticipantsIsMutable();
                    participants_.remove(index);
                    onChanged();
                } else {
                    participantsBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public TriatlonProtobufs.ParticipantPointsDTOProto.Builder getParticipantsBuilder(
                    int index) {
                return getParticipantsFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder getParticipantsOrBuilder(
                    int index) {
                if (participantsBuilder_ == null) {
                    return participants_.get(index);  } else {
                    return participantsBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public java.util.List<? extends TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder>
            getParticipantsOrBuilderList() {
                if (participantsBuilder_ != null) {
                    return participantsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(participants_);
                }
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public TriatlonProtobufs.ParticipantPointsDTOProto.Builder addParticipantsBuilder() {
                return getParticipantsFieldBuilder().addBuilder(
                        TriatlonProtobufs.ParticipantPointsDTOProto.getDefaultInstance());
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public TriatlonProtobufs.ParticipantPointsDTOProto.Builder addParticipantsBuilder(
                    int index) {
                return getParticipantsFieldBuilder().addBuilder(
                        index, TriatlonProtobufs.ParticipantPointsDTOProto.getDefaultInstance());
            }
            /**
             * <code>repeated .ParticipantPointsDTOProto participants = 4;</code>
             */
            public java.util.List<TriatlonProtobufs.ParticipantPointsDTOProto.Builder>
            getParticipantsBuilderList() {
                return getParticipantsFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TriatlonProtobufs.ParticipantPointsDTOProto, TriatlonProtobufs.ParticipantPointsDTOProto.Builder, TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder>
            getParticipantsFieldBuilder() {
                if (participantsBuilder_ == null) {
                    participantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            TriatlonProtobufs.ParticipantPointsDTOProto, TriatlonProtobufs.ParticipantPointsDTOProto.Builder, TriatlonProtobufs.ParticipantPointsDTOProtoOrBuilder>(
                            participants_,
                            ((bitField0_ & 0x00000008) == 0x00000008),
                            getParentForChildren(),
                            isClean());
                    participants_ = null;
                }
                return participantsBuilder_;
            }

            private TriatlonProtobufs.ProbaProto proba_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder> probaBuilder_;
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public boolean hasProba() {
                return probaBuilder_ != null || proba_ != null;
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public TriatlonProtobufs.ProbaProto getProba() {
                if (probaBuilder_ == null) {
                    return proba_ == null ? TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
                } else {
                    return probaBuilder_.getMessage();
                }
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public Builder setProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    proba_ = value;
                    onChanged();
                } else {
                    probaBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public Builder setProba(
                    TriatlonProtobufs.ProbaProto.Builder builderForValue) {
                if (probaBuilder_ == null) {
                    proba_ = builderForValue.build();
                    onChanged();
                } else {
                    probaBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public Builder mergeProba(TriatlonProtobufs.ProbaProto value) {
                if (probaBuilder_ == null) {
                    if (proba_ != null) {
                        proba_ =
                                TriatlonProtobufs.ProbaProto.newBuilder(proba_).mergeFrom(value).buildPartial();
                    } else {
                        proba_ = value;
                    }
                    onChanged();
                } else {
                    probaBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public Builder clearProba() {
                if (probaBuilder_ == null) {
                    proba_ = null;
                    onChanged();
                } else {
                    proba_ = null;
                    probaBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public TriatlonProtobufs.ProbaProto.Builder getProbaBuilder() {

                onChanged();
                return getProbaFieldBuilder().getBuilder();
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            public TriatlonProtobufs.ProbaProtoOrBuilder getProbaOrBuilder() {
                if (probaBuilder_ != null) {
                    return probaBuilder_.getMessageOrBuilder();
                } else {
                    return proba_ == null ?
                            TriatlonProtobufs.ProbaProto.getDefaultInstance() : proba_;
                }
            }
            /**
             * <code>.ProbaProto proba = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>
            getProbaFieldBuilder() {
                if (probaBuilder_ == null) {
                    probaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.ProbaProto, TriatlonProtobufs.ProbaProto.Builder, TriatlonProtobufs.ProbaProtoOrBuilder>(
                            getProba(),
                            getParentForChildren(),
                            isClean());
                    proba_ = null;
                }
                return probaBuilder_;
            }

            private java.util.List<TriatlonProtobufs.ParticipantProto> participantsNotFromProba_ =
                    java.util.Collections.emptyList();
            private void ensureParticipantsNotFromProbaIsMutable() {
                if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                    participantsNotFromProba_ = new java.util.ArrayList<TriatlonProtobufs.ParticipantProto>(participantsNotFromProba_);
                    bitField0_ |= 0x00000020;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder> participantsNotFromProbaBuilder_;

            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public java.util.List<TriatlonProtobufs.ParticipantProto> getParticipantsNotFromProbaList() {
                if (participantsNotFromProbaBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(participantsNotFromProba_);
                } else {
                    return participantsNotFromProbaBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public int getParticipantsNotFromProbaCount() {
                if (participantsNotFromProbaBuilder_ == null) {
                    return participantsNotFromProba_.size();
                } else {
                    return participantsNotFromProbaBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public TriatlonProtobufs.ParticipantProto getParticipantsNotFromProba(int index) {
                if (participantsNotFromProbaBuilder_ == null) {
                    return participantsNotFromProba_.get(index);
                } else {
                    return participantsNotFromProbaBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder setParticipantsNotFromProba(
                    int index, TriatlonProtobufs.ParticipantProto value) {
                if (participantsNotFromProbaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParticipantsNotFromProbaIsMutable();
                    participantsNotFromProba_.set(index, value);
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder setParticipantsNotFromProba(
                    int index, TriatlonProtobufs.ParticipantProto.Builder builderForValue) {
                if (participantsNotFromProbaBuilder_ == null) {
                    ensureParticipantsNotFromProbaIsMutable();
                    participantsNotFromProba_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder addParticipantsNotFromProba(TriatlonProtobufs.ParticipantProto value) {
                if (participantsNotFromProbaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParticipantsNotFromProbaIsMutable();
                    participantsNotFromProba_.add(value);
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder addParticipantsNotFromProba(
                    int index, TriatlonProtobufs.ParticipantProto value) {
                if (participantsNotFromProbaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureParticipantsNotFromProbaIsMutable();
                    participantsNotFromProba_.add(index, value);
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder addParticipantsNotFromProba(
                    TriatlonProtobufs.ParticipantProto.Builder builderForValue) {
                if (participantsNotFromProbaBuilder_ == null) {
                    ensureParticipantsNotFromProbaIsMutable();
                    participantsNotFromProba_.add(builderForValue.build());
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder addParticipantsNotFromProba(
                    int index, TriatlonProtobufs.ParticipantProto.Builder builderForValue) {
                if (participantsNotFromProbaBuilder_ == null) {
                    ensureParticipantsNotFromProbaIsMutable();
                    participantsNotFromProba_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder addAllParticipantsNotFromProba(
                    java.lang.Iterable<? extends TriatlonProtobufs.ParticipantProto> values) {
                if (participantsNotFromProbaBuilder_ == null) {
                    ensureParticipantsNotFromProbaIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, participantsNotFromProba_);
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder clearParticipantsNotFromProba() {
                if (participantsNotFromProbaBuilder_ == null) {
                    participantsNotFromProba_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public Builder removeParticipantsNotFromProba(int index) {
                if (participantsNotFromProbaBuilder_ == null) {
                    ensureParticipantsNotFromProbaIsMutable();
                    participantsNotFromProba_.remove(index);
                    onChanged();
                } else {
                    participantsNotFromProbaBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public TriatlonProtobufs.ParticipantProto.Builder getParticipantsNotFromProbaBuilder(
                    int index) {
                return getParticipantsNotFromProbaFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public TriatlonProtobufs.ParticipantProtoOrBuilder getParticipantsNotFromProbaOrBuilder(
                    int index) {
                if (participantsNotFromProbaBuilder_ == null) {
                    return participantsNotFromProba_.get(index);  } else {
                    return participantsNotFromProbaBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public java.util.List<? extends TriatlonProtobufs.ParticipantProtoOrBuilder>
            getParticipantsNotFromProbaOrBuilderList() {
                if (participantsNotFromProbaBuilder_ != null) {
                    return participantsNotFromProbaBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(participantsNotFromProba_);
                }
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public TriatlonProtobufs.ParticipantProto.Builder addParticipantsNotFromProbaBuilder() {
                return getParticipantsNotFromProbaFieldBuilder().addBuilder(
                        TriatlonProtobufs.ParticipantProto.getDefaultInstance());
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public TriatlonProtobufs.ParticipantProto.Builder addParticipantsNotFromProbaBuilder(
                    int index) {
                return getParticipantsNotFromProbaFieldBuilder().addBuilder(
                        index, TriatlonProtobufs.ParticipantProto.getDefaultInstance());
            }
            /**
             * <code>repeated .ParticipantProto participantsNotFromProba = 6;</code>
             */
            public java.util.List<TriatlonProtobufs.ParticipantProto.Builder>
            getParticipantsNotFromProbaBuilderList() {
                return getParticipantsNotFromProbaFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder>
            getParticipantsNotFromProbaFieldBuilder() {
                if (participantsNotFromProbaBuilder_ == null) {
                    participantsNotFromProbaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            TriatlonProtobufs.ParticipantProto, TriatlonProtobufs.ParticipantProto.Builder, TriatlonProtobufs.ParticipantProtoOrBuilder>(
                            participantsNotFromProba_,
                            ((bitField0_ & 0x00000020) == 0x00000020),
                            getParentForChildren(),
                            isClean());
                    participantsNotFromProba_ = null;
                }
                return participantsNotFromProbaBuilder_;
            }

            private TriatlonProtobufs.DTORezultatProbaProto rezultatProbaDTO_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.DTORezultatProbaProto, TriatlonProtobufs.DTORezultatProbaProto.Builder, TriatlonProtobufs.DTORezultatProbaProtoOrBuilder> rezultatProbaDTOBuilder_;
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public boolean hasRezultatProbaDTO() {
                return rezultatProbaDTOBuilder_ != null || rezultatProbaDTO_ != null;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public TriatlonProtobufs.DTORezultatProbaProto getRezultatProbaDTO() {
                if (rezultatProbaDTOBuilder_ == null) {
                    return rezultatProbaDTO_ == null ? TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance() : rezultatProbaDTO_;
                } else {
                    return rezultatProbaDTOBuilder_.getMessage();
                }
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public Builder setRezultatProbaDTO(TriatlonProtobufs.DTORezultatProbaProto value) {
                if (rezultatProbaDTOBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    rezultatProbaDTO_ = value;
                    onChanged();
                } else {
                    rezultatProbaDTOBuilder_.setMessage(value);
                }

                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public Builder setRezultatProbaDTO(
                    TriatlonProtobufs.DTORezultatProbaProto.Builder builderForValue) {
                if (rezultatProbaDTOBuilder_ == null) {
                    rezultatProbaDTO_ = builderForValue.build();
                    onChanged();
                } else {
                    rezultatProbaDTOBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public Builder mergeRezultatProbaDTO(TriatlonProtobufs.DTORezultatProbaProto value) {
                if (rezultatProbaDTOBuilder_ == null) {
                    if (rezultatProbaDTO_ != null) {
                        rezultatProbaDTO_ =
                                TriatlonProtobufs.DTORezultatProbaProto.newBuilder(rezultatProbaDTO_).mergeFrom(value).buildPartial();
                    } else {
                        rezultatProbaDTO_ = value;
                    }
                    onChanged();
                } else {
                    rezultatProbaDTOBuilder_.mergeFrom(value);
                }

                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public Builder clearRezultatProbaDTO() {
                if (rezultatProbaDTOBuilder_ == null) {
                    rezultatProbaDTO_ = null;
                    onChanged();
                } else {
                    rezultatProbaDTO_ = null;
                    rezultatProbaDTOBuilder_ = null;
                }

                return this;
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public TriatlonProtobufs.DTORezultatProbaProto.Builder getRezultatProbaDTOBuilder() {

                onChanged();
                return getRezultatProbaDTOFieldBuilder().getBuilder();
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            public TriatlonProtobufs.DTORezultatProbaProtoOrBuilder getRezultatProbaDTOOrBuilder() {
                if (rezultatProbaDTOBuilder_ != null) {
                    return rezultatProbaDTOBuilder_.getMessageOrBuilder();
                } else {
                    return rezultatProbaDTO_ == null ?
                            TriatlonProtobufs.DTORezultatProbaProto.getDefaultInstance() : rezultatProbaDTO_;
                }
            }
            /**
             * <code>.DTORezultatProbaProto rezultatProbaDTO = 7;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    TriatlonProtobufs.DTORezultatProbaProto, TriatlonProtobufs.DTORezultatProbaProto.Builder, TriatlonProtobufs.DTORezultatProbaProtoOrBuilder>
            getRezultatProbaDTOFieldBuilder() {
                if (rezultatProbaDTOBuilder_ == null) {
                    rezultatProbaDTOBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            TriatlonProtobufs.DTORezultatProbaProto, TriatlonProtobufs.DTORezultatProbaProto.Builder, TriatlonProtobufs.DTORezultatProbaProtoOrBuilder>(
                            getRezultatProbaDTO(),
                            getParentForChildren(),
                            isClean());
                    rezultatProbaDTO_ = null;
                }
                return rezultatProbaDTOBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:TriatlonResponse)
        }

        // @@protoc_insertion_point(class_scope:TriatlonResponse)
        private static final TriatlonProtobufs.TriatlonResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TriatlonProtobufs.TriatlonResponse();
        }

        public static TriatlonProtobufs.TriatlonResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TriatlonResponse>
                PARSER = new com.google.protobuf.AbstractParser<TriatlonResponse>() {
            public TriatlonResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TriatlonResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TriatlonResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TriatlonResponse> getParserForType() {
            return PARSER;
        }

        public TriatlonProtobufs.TriatlonResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ArbitruProto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ArbitruProto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ParticipantProto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ParticipantProto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ParticipantPointsDTOProto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ParticipantPointsDTOProto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ProbaProto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ProbaProto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_RezultatProto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_RezultatProto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ID_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ID_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DTOArbitruProto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DTOArbitruProto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DTORezultatProbaProto_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DTORezultatProbaProto_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TriatlonRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TriatlonRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TriatlonResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TriatlonResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\027TriatlonProtobufs.proto\"K\n\014ArbitruProt" +
                        "o\022\n\n\002id\030\001 \001(\003\022\020\n\010username\030\002 \001(\t\022\017\n\007paswo" +
                        "rd\030\003 \001(\t\022\014\n\004name\030\004 \001(\t\"C\n\020ParticipantPro" +
                        "to\022\n\n\002id\030\001 \001(\003\022\021\n\tfirstName\030\002 \001(\t\022\020\n\010las" +
                        "tName\030\003 \001(\t\"_\n\031ParticipantPointsDTOProto" +
                        "\022\n\n\002id\030\001 \001(\003\022&\n\013participant\030\002 \001(\0132\021.Part" +
                        "icipantProto\022\016\n\006points\030\003 \001(\002\"L\n\nProbaPro" +
                        "to\022\n\n\002id\030\001 \001(\003\022\022\n\ndiscipline\030\002 \001(\t\022\036\n\007ar" +
                        "bitru\030\003 \001(\0132\r.ArbitruProto\"o\n\rRezultatPr" +
                        "oto\022\n\n\002id\030\001 \001(\003\022\032\n\005proba\030\002 \001(\0132\013.ProbaPr",
                "oto\022&\n\013participant\030\003 \001(\0132\021.ParticipantPr" +
                        "oto\022\016\n\006points\030\004 \001(\002\"\020\n\002ID\022\n\n\002id\030\001 \001(\003\"5\n" +
                        "\017DTOArbitruProto\022\020\n\010username\030\001 \001(\t\022\020\n\010pa" +
                        "ssword\030\002 \001(\t\"U\n\025DTORezultatProbaProto\022 \n" +
                        "\010rezultat\030\001 \001(\0132\016.RezultatProto\022\032\n\005proba" +
                        "\030\002 \001(\0132\013.ProbaProto\"\230\003\n\017TriatlonRequest\022" +
                        "#\n\004type\030\001 \001(\0162\025.TriatlonRequest.Type\022&\n\n" +
                        "arbitruDTO\030\002 \001(\0132\020.DTOArbitruProtoH\000\022\034\n\005" +
                        "proba\030\003 \001(\0132\013.ProbaProtoH\000\0222\n\020rezultatPr" +
                        "obaDTO\030\004 \001(\0132\026.DTORezultatProbaProtoH\000\022 ",
                "\n\007arbitru\030\005 \001(\0132\r.ArbitruProtoH\000\022\021\n\002id\030\006" +
                        " \001(\0132\003.IDH\000\"\250\001\n\004Type\022\013\n\007Unknown\020\000\022\t\n\005LOG" +
                        "IN\020\001\022\n\n\006LOGOUT\020\002\022\016\n\nADD_POINTS\020\003\022\030\n\024GET_" +
                        "ALL_PARTICIPANTS\020\004\022\024\n\020PROBA_BY_ARBITRU\020\005" +
                        "\022\037\n\033PARTICIPANTS_NOT_FROM_PROBA\020\006\022\033\n\027PAR" +
                        "TICIPANTS_FROM_PROBA\020\007B\006\n\004data\"\326\002\n\020Triat" +
                        "lonResponse\022$\n\004type\030\001 \001(\0162\026.TriatlonResp" +
                        "onse.Type\022\r\n\005error\030\002 \001(\t\022\036\n\007arbitru\030\003 \001(" +
                        "\0132\r.ArbitruProto\0220\n\014participants\030\004 \003(\0132\032" +
                        ".ParticipantPointsDTOProto\022\032\n\005proba\030\005 \001(",
                "\0132\013.ProbaProto\0223\n\030participantsNotFromPro" +
                        "ba\030\006 \003(\0132\021.ParticipantProto\0220\n\020rezultatP" +
                        "robaDTO\030\007 \001(\0132\026.DTORezultatProbaProto\"8\n" +
                        "\004Type\022\013\n\007Unknown\020\000\022\006\n\002OK\020\001\022\t\n\005ERROR\020\002\022\020\n" +
                        "\014ADDED_POINTS\020\003b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        internal_static_ArbitruProto_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_ArbitruProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_ArbitruProto_descriptor,
                new java.lang.String[] { "Id", "Username", "Pasword", "Name", });
        internal_static_ParticipantProto_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_ParticipantProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_ParticipantProto_descriptor,
                new java.lang.String[] { "Id", "FirstName", "LastName", });
        internal_static_ParticipantPointsDTOProto_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_ParticipantPointsDTOProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_ParticipantPointsDTOProto_descriptor,
                new java.lang.String[] { "Id", "Participant", "Points", });
        internal_static_ProbaProto_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_ProbaProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_ProbaProto_descriptor,
                new java.lang.String[] { "Id", "Discipline", "Arbitru", });
        internal_static_RezultatProto_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_RezultatProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_RezultatProto_descriptor,
                new java.lang.String[] { "Id", "Proba", "Participant", "Points", });
        internal_static_ID_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_ID_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_ID_descriptor,
                new java.lang.String[] { "Id", });
        internal_static_DTOArbitruProto_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_DTOArbitruProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_DTOArbitruProto_descriptor,
                new java.lang.String[] { "Username", "Password", });
        internal_static_DTORezultatProbaProto_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_DTORezultatProbaProto_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_DTORezultatProbaProto_descriptor,
                new java.lang.String[] { "Rezultat", "Proba", });
        internal_static_TriatlonRequest_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_TriatlonRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_TriatlonRequest_descriptor,
                new java.lang.String[] { "Type", "ArbitruDTO", "Proba", "RezultatProbaDTO", "Arbitru", "Id", "Data", });
        internal_static_TriatlonResponse_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_TriatlonResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_TriatlonResponse_descriptor,
                new java.lang.String[] { "Type", "Error", "Arbitru", "Participants", "Proba", "ParticipantsNotFromProba", "RezultatProbaDTO", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}