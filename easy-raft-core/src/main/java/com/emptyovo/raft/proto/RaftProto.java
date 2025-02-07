/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emptyovo.raft.proto;

public final class RaftProto {

    private RaftProto() {
    }
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    /**
     * Protobuf enum {@code raft.ResCode}
     */
    public enum ResCode
            implements
                com.google.protobuf.ProtocolMessageEnum {

        /**
         * <code>RES_CODE_SUCCESS = 0;</code>
         */
        RES_CODE_SUCCESS(0, 0),
        /**
         * <code>RES_CODE_FAIL = 1;</code>
         */
        RES_CODE_FAIL(1, 1),
        /**
         * <code>RES_CODE_NOT_LEADER = 2;</code>
         */
        RES_CODE_NOT_LEADER(2, 2),
        ;

        /**
         * <code>RES_CODE_SUCCESS = 0;</code>
         */
        public static final int RES_CODE_SUCCESS_VALUE = 0;
        /**
         * <code>RES_CODE_FAIL = 1;</code>
         */
        public static final int RES_CODE_FAIL_VALUE = 1;
        /**
         * <code>RES_CODE_NOT_LEADER = 2;</code>
         */
        public static final int RES_CODE_NOT_LEADER_VALUE = 2;

        public final int getNumber() {
            return value;
        }

        public static ResCode valueOf(int value) {
            switch (value) {
                case 0:
                    return RES_CODE_SUCCESS;
                case 1:
                    return RES_CODE_FAIL;
                case 2:
                    return RES_CODE_NOT_LEADER;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<ResCode> internalGetValueMap() {
            return internalValueMap;
        }
        private static com.google.protobuf.Internal.EnumLiteMap<ResCode> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<ResCode>() {

                    public ResCode findValueByNumber(int number) {
                        return ResCode.valueOf(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(index);
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.getDescriptor().getEnumTypes().get(0);
        }

        private static final ResCode[] VALUES = values();

        public static ResCode valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private final int index;
        private final int value;

        private ResCode(int index, int value) {
            this.index = index;
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:raft.ResCode)
    }

    /**
     * Protobuf enum {@code raft.EntryType}
     */
    public enum EntryType
            implements
                com.google.protobuf.ProtocolMessageEnum {

        /**
         * <code>ENTRY_TYPE_DATA = 0;</code>
         */
        ENTRY_TYPE_DATA(0, 0),
        /**
         * <code>ENTRY_TYPE_CONFIGURATION = 1;</code>
         */
        ENTRY_TYPE_CONFIGURATION(1, 1),
        ;

        /**
         * <code>ENTRY_TYPE_DATA = 0;</code>
         */
        public static final int ENTRY_TYPE_DATA_VALUE = 0;
        /**
         * <code>ENTRY_TYPE_CONFIGURATION = 1;</code>
         */
        public static final int ENTRY_TYPE_CONFIGURATION_VALUE = 1;

        public final int getNumber() {
            return value;
        }

        public static EntryType valueOf(int value) {
            switch (value) {
                case 0:
                    return ENTRY_TYPE_DATA;
                case 1:
                    return ENTRY_TYPE_CONFIGURATION;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<EntryType> internalGetValueMap() {
            return internalValueMap;
        }
        private static com.google.protobuf.Internal.EnumLiteMap<EntryType> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<EntryType>() {

                    public EntryType findValueByNumber(int number) {
                        return EntryType.valueOf(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(index);
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.getDescriptor().getEnumTypes().get(1);
        }

        private static final EntryType[] VALUES = values();

        public static EntryType valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private final int index;
        private final int value;

        private EntryType(int index, int value) {
            this.index = index;
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:raft.EntryType)
    }

    public interface EndpointOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional string host = 1;
        /**
         * <code>optional string host = 1;</code>
         */
        boolean hasHost();
        /**
         * <code>optional string host = 1;</code>
         */
        String getHost();
        /**
         * <code>optional string host = 1;</code>
         */
        com.google.protobuf.ByteString getHostBytes();

        // optional uint32 port = 2;
        /**
         * <code>optional uint32 port = 2;</code>
         */
        boolean hasPort();
        /**
         * <code>optional uint32 port = 2;</code>
         */
        int getPort();
    }
    /**
     * Protobuf type {@code raft.Endpoint}
     */
    public static final class Endpoint
            extends
                com.google.protobuf.GeneratedMessage
            implements
                EndpointOrBuilder {

        // Use Endpoint.newBuilder() to construct.
        private Endpoint(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Endpoint(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final Endpoint defaultInstance;
        public static Endpoint getDefaultInstance() {
            return defaultInstance;
        }

        public Endpoint getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private Endpoint(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            bitField0_ |= 0x00000001;
                            host_ = input.readBytes();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            port_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Endpoint_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Endpoint_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.Endpoint.class,
                            com.emptyovo.raft.proto.RaftProto.Endpoint.Builder.class);
        }

        public static com.google.protobuf.Parser<Endpoint> PARSER =
                new com.google.protobuf.AbstractParser<Endpoint>() {

                    public Endpoint parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Endpoint(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<Endpoint> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional string host = 1;
        public static final int HOST_FIELD_NUMBER = 1;
        private Object host_;
        /**
         * <code>optional string host = 1;</code>
         */
        public boolean hasHost() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string host = 1;</code>
         */
        public String getHost() {
            Object ref = host_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    host_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string host = 1;</code>
         */
        public com.google.protobuf.ByteString getHostBytes() {
            Object ref = host_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                host_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional uint32 port = 2;
        public static final int PORT_FIELD_NUMBER = 2;
        private int port_;
        /**
         * <code>optional uint32 port = 2;</code>
         */
        public boolean hasPort() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 port = 2;</code>
         */
        public int getPort() {
            return port_;
        }

        private void initFields() {
            host_ = "";
            port_ = 0;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeBytes(1, getHostBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt32(2, port_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(1, getHostBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, port_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Endpoint parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.Endpoint prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.Endpoint}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Endpoint_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Endpoint_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.Endpoint.class,
                                com.emptyovo.raft.proto.RaftProto.Endpoint.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.Endpoint.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                host_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                port_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Endpoint_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.Endpoint getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.Endpoint build() {
                com.emptyovo.raft.proto.RaftProto.Endpoint result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.Endpoint buildPartial() {
                com.emptyovo.raft.proto.RaftProto.Endpoint result =
                        new com.emptyovo.raft.proto.RaftProto.Endpoint(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.host_ = host_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.port_ = port_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.Endpoint) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.Endpoint) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.Endpoint other) {
                if (other == com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance())
                    return this;
                if (other.hasHost()) {
                    bitField0_ |= 0x00000001;
                    host_ = other.host_;
                    onChanged();
                }
                if (other.hasPort()) {
                    setPort(other.getPort());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.Endpoint parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.Endpoint) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional string host = 1;
            private Object host_ = "";
            /**
             * <code>optional string host = 1;</code>
             */
            public boolean hasHost() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional string host = 1;</code>
             */
            public String getHost() {
                Object ref = host_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    host_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string host = 1;</code>
             */
            public com.google.protobuf.ByteString getHostBytes() {
                Object ref = host_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    host_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string host = 1;</code>
             */
            public Builder setHost(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                host_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string host = 1;</code>
             */
            public Builder clearHost() {
                bitField0_ = (bitField0_ & ~0x00000001);
                host_ = getDefaultInstance().getHost();
                onChanged();
                return this;
            }
            /**
             * <code>optional string host = 1;</code>
             */
            public Builder setHostBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                host_ = value;
                onChanged();
                return this;
            }

            // optional uint32 port = 2;
            private int port_;
            /**
             * <code>optional uint32 port = 2;</code>
             */
            public boolean hasPort() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint32 port = 2;</code>
             */
            public int getPort() {
                return port_;
            }
            /**
             * <code>optional uint32 port = 2;</code>
             */
            public Builder setPort(int value) {
                bitField0_ |= 0x00000002;
                port_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 port = 2;</code>
             */
            public Builder clearPort() {
                bitField0_ = (bitField0_ & ~0x00000002);
                port_ = 0;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.Endpoint)
        }

        static {
            defaultInstance = new Endpoint(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.Endpoint)
    }

    public interface ServerOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint32 server_id = 1;
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        boolean hasServerId();
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        int getServerId();

        // optional .raft.Endpoint endpoint = 2;
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        boolean hasEndpoint();
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Endpoint getEndpoint();
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder getEndpointOrBuilder();
    }
    /**
     * Protobuf type {@code raft.Server}
     */
    public static final class Server
            extends
                com.google.protobuf.GeneratedMessage
            implements
                ServerOrBuilder {

        // Use Server.newBuilder() to construct.
        private Server(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Server(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final Server defaultInstance;
        public static Server getDefaultInstance() {
            return defaultInstance;
        }

        public Server getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private Server(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            serverId_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            com.emptyovo.raft.proto.RaftProto.Endpoint.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                subBuilder = endpoint_.toBuilder();
                            }
                            endpoint_ = input.readMessage(com.emptyovo.raft.proto.RaftProto.Endpoint.PARSER,
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(endpoint_);
                                endpoint_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000002;
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Server_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Server_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.Server.class,
                            com.emptyovo.raft.proto.RaftProto.Server.Builder.class);
        }

        public static com.google.protobuf.Parser<Server> PARSER =
                new com.google.protobuf.AbstractParser<Server>() {

                    public Server parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Server(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<Server> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint32 server_id = 1;
        public static final int SERVER_ID_FIELD_NUMBER = 1;
        private int serverId_;
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public boolean hasServerId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public int getServerId() {
            return serverId_;
        }

        // optional .raft.Endpoint endpoint = 2;
        public static final int ENDPOINT_FIELD_NUMBER = 2;
        private com.emptyovo.raft.proto.RaftProto.Endpoint endpoint_;
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public boolean hasEndpoint() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Endpoint getEndpoint() {
            return endpoint_;
        }
        /**
         * <code>optional .raft.Endpoint endpoint = 2;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder getEndpointOrBuilder() {
            return endpoint_;
        }

        private void initFields() {
            serverId_ = 0;
            endpoint_ = com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, endpoint_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, endpoint_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Server parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.Server prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.Server}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.ServerOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Server_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Server_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.Server.class,
                                com.emptyovo.raft.proto.RaftProto.Server.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.Server.newBuilder()
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
                    getEndpointFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                serverId_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                if (endpointBuilder_ == null) {
                    endpoint_ = com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
                } else {
                    endpointBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Server_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.Server getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.Server build() {
                com.emptyovo.raft.proto.RaftProto.Server result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.Server buildPartial() {
                com.emptyovo.raft.proto.RaftProto.Server result = new com.emptyovo.raft.proto.RaftProto.Server(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.serverId_ = serverId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                if (endpointBuilder_ == null) {
                    result.endpoint_ = endpoint_;
                } else {
                    result.endpoint_ = endpointBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.Server) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.Server) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.Server other) {
                if (other == com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance())
                    return this;
                if (other.hasServerId()) {
                    setServerId(other.getServerId());
                }
                if (other.hasEndpoint()) {
                    mergeEndpoint(other.getEndpoint());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.Server parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.Server) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint32 server_id = 1;
            private int serverId_;
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public boolean hasServerId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public int getServerId() {
                return serverId_;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public Builder setServerId(int value) {
                bitField0_ |= 0x00000001;
                serverId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public Builder clearServerId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                serverId_ = 0;
                onChanged();
                return this;
            }

            // optional .raft.Endpoint endpoint = 2;
            private com.emptyovo.raft.proto.RaftProto.Endpoint endpoint_ =
                    com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Endpoint, com.emptyovo.raft.proto.RaftProto.Endpoint.Builder, com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder> endpointBuilder_;
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public boolean hasEndpoint() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Endpoint getEndpoint() {
                if (endpointBuilder_ == null) {
                    return endpoint_;
                } else {
                    return endpointBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public Builder setEndpoint(com.emptyovo.raft.proto.RaftProto.Endpoint value) {
                if (endpointBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    endpoint_ = value;
                    onChanged();
                } else {
                    endpointBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public Builder setEndpoint(
                    com.emptyovo.raft.proto.RaftProto.Endpoint.Builder builderForValue) {
                if (endpointBuilder_ == null) {
                    endpoint_ = builderForValue.build();
                    onChanged();
                } else {
                    endpointBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public Builder mergeEndpoint(com.emptyovo.raft.proto.RaftProto.Endpoint value) {
                if (endpointBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002) &&
                            endpoint_ != com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance()) {
                        endpoint_ =
                                com.emptyovo.raft.proto.RaftProto.Endpoint.newBuilder(endpoint_).mergeFrom(value)
                                        .buildPartial();
                    } else {
                        endpoint_ = value;
                    }
                    onChanged();
                } else {
                    endpointBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public Builder clearEndpoint() {
                if (endpointBuilder_ == null) {
                    endpoint_ = com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
                    onChanged();
                } else {
                    endpointBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Endpoint.Builder getEndpointBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getEndpointFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder getEndpointOrBuilder() {
                if (endpointBuilder_ != null) {
                    return endpointBuilder_.getMessageOrBuilder();
                } else {
                    return endpoint_;
                }
            }
            /**
             * <code>optional .raft.Endpoint endpoint = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Endpoint, com.emptyovo.raft.proto.RaftProto.Endpoint.Builder, com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder> getEndpointFieldBuilder() {
                if (endpointBuilder_ == null) {
                    endpointBuilder_ =
                            new com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Endpoint, com.emptyovo.raft.proto.RaftProto.Endpoint.Builder, com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder>(
                                    endpoint_,
                                    getParentForChildren(),
                                    isClean());
                    endpoint_ = null;
                }
                return endpointBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.Server)
        }

        static {
            defaultInstance = new Server(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.Server)
    }

    public interface ConfigurationOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // repeated .raft.Server servers = 1;
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Server getServers(int index);
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        int getServersCount();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code raft.Configuration}
     */
    public static final class Configuration
            extends
                com.google.protobuf.GeneratedMessage
            implements
                ConfigurationOrBuilder {

        // Use Configuration.newBuilder() to construct.
        private Configuration(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private Configuration(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final Configuration defaultInstance;
        public static Configuration getDefaultInstance() {
            return defaultInstance;
        }

        public Configuration getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private Configuration(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            servers_.add(input.readMessage(com.emptyovo.raft.proto.RaftProto.Server.PARSER,
                                    extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = java.util.Collections.unmodifiableList(servers_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Configuration_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Configuration_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.Configuration.class,
                            com.emptyovo.raft.proto.RaftProto.Configuration.Builder.class);
        }

        public static com.google.protobuf.Parser<Configuration> PARSER =
                new com.google.protobuf.AbstractParser<Configuration>() {

                    public Configuration parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new Configuration(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<Configuration> getParserForType() {
            return PARSER;
        }

        // repeated .raft.Server servers = 1;
        public static final int SERVERS_FIELD_NUMBER = 1;
        private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_;
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public int getServersCount() {
            return servers_.size();
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
            return servers_.get(index);
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index) {
            return servers_.get(index);
        }

        private void initFields() {
            servers_ = java.util.Collections.emptyList();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < servers_.size(); i++) {
                output.writeMessage(1, servers_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            for (int i = 0; i < servers_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, servers_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.Configuration parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.Configuration prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.Configuration}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.ConfigurationOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Configuration_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Configuration_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.Configuration.class,
                                com.emptyovo.raft.proto.RaftProto.Configuration.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.Configuration.newBuilder()
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
                    getServersFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_Configuration_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.Configuration getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.Configuration.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.Configuration build() {
                com.emptyovo.raft.proto.RaftProto.Configuration result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.Configuration buildPartial() {
                com.emptyovo.raft.proto.RaftProto.Configuration result =
                        new com.emptyovo.raft.proto.RaftProto.Configuration(this);
                int from_bitField0_ = bitField0_;
                if (serversBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        servers_ = java.util.Collections.unmodifiableList(servers_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.servers_ = servers_;
                } else {
                    result.servers_ = serversBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.Configuration) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.Configuration) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.Configuration other) {
                if (other == com.emptyovo.raft.proto.RaftProto.Configuration.getDefaultInstance())
                    return this;
                if (serversBuilder_ == null) {
                    if (!other.servers_.isEmpty()) {
                        if (servers_.isEmpty()) {
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureServersIsMutable();
                            servers_.addAll(other.servers_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.servers_.isEmpty()) {
                        if (serversBuilder_.isEmpty()) {
                            serversBuilder_.dispose();
                            serversBuilder_ = null;
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            serversBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                                            ? getServersFieldBuilder()
                                            : null;
                        } else {
                            serversBuilder_.addAllMessages(other.servers_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.Configuration parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.Configuration) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // repeated .raft.Server servers = 1;
            private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_ =
                    java.util.Collections.emptyList();
            private void ensureServersIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>(servers_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> serversBuilder_;

            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
                if (serversBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(servers_);
                } else {
                    return serversBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public int getServersCount() {
                if (serversBuilder_ == null) {
                    return servers_.size();
                } else {
                    return serversBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.set(index, value);
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(index, value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addAllServers(
                    Iterable<? extends com.emptyovo.raft.proto.RaftProto.Server> values) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    super.addAll(values, servers_);
                    onChanged();
                } else {
                    serversBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder clearServers() {
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder removeServers(int index) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.remove(index);
                    onChanged();
                } else {
                    serversBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder getServersBuilder(
                    int index) {
                return getServersFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                    int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
                if (serversBuilder_ != null) {
                    return serversBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(servers_);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder() {
                return getServersFieldBuilder().addBuilder(
                        com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder(
                    int index) {
                return getServersFieldBuilder().addBuilder(
                        index, com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server.Builder> getServersBuilderList() {
                return getServersFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersFieldBuilder() {
                if (serversBuilder_ == null) {
                    serversBuilder_ =
                            new com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder>(
                                    servers_,
                                    ((bitField0_ & 0x00000001) == 0x00000001),
                                    getParentForChildren(),
                                    isClean());
                    servers_ = null;
                }
                return serversBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.Configuration)
        }

        static {
            defaultInstance = new Configuration(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.Configuration)
    }

    public interface LogMetaDataOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint64 current_term = 1;
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        boolean hasCurrentTerm();
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        long getCurrentTerm();

        // optional uint32 voted_for = 2;
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        boolean hasVotedFor();
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        int getVotedFor();

        // optional uint64 first_log_index = 3;
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        boolean hasFirstLogIndex();
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        long getFirstLogIndex();

        // optional uint64 commit_index = 4;
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        boolean hasCommitIndex();
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        long getCommitIndex();
    }
    /**
     * Protobuf type {@code raft.LogMetaData}
     */
    public static final class LogMetaData
            extends
                com.google.protobuf.GeneratedMessage
            implements
                LogMetaDataOrBuilder {

        // Use LogMetaData.newBuilder() to construct.
        private LogMetaData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private LogMetaData(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final LogMetaData defaultInstance;
        public static LogMetaData getDefaultInstance() {
            return defaultInstance;
        }

        public LogMetaData getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private LogMetaData(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            currentTerm_ = input.readUInt64();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            votedFor_ = input.readUInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            firstLogIndex_ = input.readUInt64();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            commitIndex_ = input.readUInt64();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogMetaData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogMetaData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.LogMetaData.class,
                            com.emptyovo.raft.proto.RaftProto.LogMetaData.Builder.class);
        }

        public static com.google.protobuf.Parser<LogMetaData> PARSER =
                new com.google.protobuf.AbstractParser<LogMetaData>() {

                    public LogMetaData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new LogMetaData(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<LogMetaData> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint64 current_term = 1;
        public static final int CURRENT_TERM_FIELD_NUMBER = 1;
        private long currentTerm_;
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        public boolean hasCurrentTerm() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 current_term = 1;</code>
         */
        public long getCurrentTerm() {
            return currentTerm_;
        }

        // optional uint32 voted_for = 2;
        public static final int VOTED_FOR_FIELD_NUMBER = 2;
        private int votedFor_;
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        public boolean hasVotedFor() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint32 voted_for = 2;</code>
         */
        public int getVotedFor() {
            return votedFor_;
        }

        // optional uint64 first_log_index = 3;
        public static final int FIRST_LOG_INDEX_FIELD_NUMBER = 3;
        private long firstLogIndex_;
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        public boolean hasFirstLogIndex() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 first_log_index = 3;</code>
         */
        public long getFirstLogIndex() {
            return firstLogIndex_;
        }

        // optional uint64 commit_index = 4;
        public static final int COMMIT_INDEX_FIELD_NUMBER = 4;
        private long commitIndex_;
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        public boolean hasCommitIndex() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint64 commit_index = 4;</code>
         */
        public long getCommitIndex() {
            return commitIndex_;
        }

        private void initFields() {
            currentTerm_ = 0L;
            votedFor_ = 0;
            firstLogIndex_ = 0L;
            commitIndex_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt64(1, currentTerm_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt32(2, votedFor_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt64(3, firstLogIndex_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeUInt64(4, commitIndex_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, currentTerm_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(2, votedFor_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(3, firstLogIndex_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(4, commitIndex_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogMetaData parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.LogMetaData prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.LogMetaData}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.LogMetaDataOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogMetaData_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogMetaData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.LogMetaData.class,
                                com.emptyovo.raft.proto.RaftProto.LogMetaData.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.LogMetaData.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                currentTerm_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                votedFor_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                firstLogIndex_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000004);
                commitIndex_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogMetaData_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.LogMetaData getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.LogMetaData.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.LogMetaData build() {
                com.emptyovo.raft.proto.RaftProto.LogMetaData result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.LogMetaData buildPartial() {
                com.emptyovo.raft.proto.RaftProto.LogMetaData result =
                        new com.emptyovo.raft.proto.RaftProto.LogMetaData(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.currentTerm_ = currentTerm_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.votedFor_ = votedFor_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.firstLogIndex_ = firstLogIndex_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.commitIndex_ = commitIndex_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.LogMetaData) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.LogMetaData) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.LogMetaData other) {
                if (other == com.emptyovo.raft.proto.RaftProto.LogMetaData.getDefaultInstance())
                    return this;
                if (other.hasCurrentTerm()) {
                    setCurrentTerm(other.getCurrentTerm());
                }
                if (other.hasVotedFor()) {
                    setVotedFor(other.getVotedFor());
                }
                if (other.hasFirstLogIndex()) {
                    setFirstLogIndex(other.getFirstLogIndex());
                }
                if (other.hasCommitIndex()) {
                    setCommitIndex(other.getCommitIndex());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.LogMetaData parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.LogMetaData) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint64 current_term = 1;
            private long currentTerm_;
            /**
             * <code>optional uint64 current_term = 1;</code>
             */
            public boolean hasCurrentTerm() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint64 current_term = 1;</code>
             */
            public long getCurrentTerm() {
                return currentTerm_;
            }
            /**
             * <code>optional uint64 current_term = 1;</code>
             */
            public Builder setCurrentTerm(long value) {
                bitField0_ |= 0x00000001;
                currentTerm_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 current_term = 1;</code>
             */
            public Builder clearCurrentTerm() {
                bitField0_ = (bitField0_ & ~0x00000001);
                currentTerm_ = 0L;
                onChanged();
                return this;
            }

            // optional uint32 voted_for = 2;
            private int votedFor_;
            /**
             * <code>optional uint32 voted_for = 2;</code>
             */
            public boolean hasVotedFor() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint32 voted_for = 2;</code>
             */
            public int getVotedFor() {
                return votedFor_;
            }
            /**
             * <code>optional uint32 voted_for = 2;</code>
             */
            public Builder setVotedFor(int value) {
                bitField0_ |= 0x00000002;
                votedFor_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 voted_for = 2;</code>
             */
            public Builder clearVotedFor() {
                bitField0_ = (bitField0_ & ~0x00000002);
                votedFor_ = 0;
                onChanged();
                return this;
            }

            // optional uint64 first_log_index = 3;
            private long firstLogIndex_;
            /**
             * <code>optional uint64 first_log_index = 3;</code>
             */
            public boolean hasFirstLogIndex() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint64 first_log_index = 3;</code>
             */
            public long getFirstLogIndex() {
                return firstLogIndex_;
            }
            /**
             * <code>optional uint64 first_log_index = 3;</code>
             */
            public Builder setFirstLogIndex(long value) {
                bitField0_ |= 0x00000004;
                firstLogIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 first_log_index = 3;</code>
             */
            public Builder clearFirstLogIndex() {
                bitField0_ = (bitField0_ & ~0x00000004);
                firstLogIndex_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 commit_index = 4;
            private long commitIndex_;
            /**
             * <code>optional uint64 commit_index = 4;</code>
             */
            public boolean hasCommitIndex() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional uint64 commit_index = 4;</code>
             */
            public long getCommitIndex() {
                return commitIndex_;
            }
            /**
             * <code>optional uint64 commit_index = 4;</code>
             */
            public Builder setCommitIndex(long value) {
                bitField0_ |= 0x00000008;
                commitIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 commit_index = 4;</code>
             */
            public Builder clearCommitIndex() {
                bitField0_ = (bitField0_ & ~0x00000008);
                commitIndex_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.LogMetaData)
        }

        static {
            defaultInstance = new LogMetaData(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.LogMetaData)
    }

    public interface SnapshotMetaDataOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint64 last_included_index = 1;
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        boolean hasLastIncludedIndex();
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        long getLastIncludedIndex();

        // optional uint64 last_included_term = 2;
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        boolean hasLastIncludedTerm();
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        long getLastIncludedTerm();

        // optional .raft.Configuration configuration = 3;
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        boolean hasConfiguration();
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Configuration getConfiguration();
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ConfigurationOrBuilder getConfigurationOrBuilder();
    }
    /**
     * Protobuf type {@code raft.SnapshotMetaData}
     */
    public static final class SnapshotMetaData
            extends
                com.google.protobuf.GeneratedMessage
            implements
                SnapshotMetaDataOrBuilder {

        // Use SnapshotMetaData.newBuilder() to construct.
        private SnapshotMetaData(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private SnapshotMetaData(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final SnapshotMetaData defaultInstance;
        public static SnapshotMetaData getDefaultInstance() {
            return defaultInstance;
        }

        public SnapshotMetaData getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private SnapshotMetaData(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            lastIncludedIndex_ = input.readUInt64();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            lastIncludedTerm_ = input.readUInt64();
                            break;
                        }
                        case 26: {
                            com.emptyovo.raft.proto.RaftProto.Configuration.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = configuration_.toBuilder();
                            }
                            configuration_ = input.readMessage(com.emptyovo.raft.proto.RaftProto.Configuration.PARSER,
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(configuration_);
                                configuration_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_SnapshotMetaData_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_SnapshotMetaData_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.class,
                            com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder.class);
        }

        public static com.google.protobuf.Parser<SnapshotMetaData> PARSER =
                new com.google.protobuf.AbstractParser<SnapshotMetaData>() {

                    public SnapshotMetaData parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SnapshotMetaData(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<SnapshotMetaData> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint64 last_included_index = 1;
        public static final int LAST_INCLUDED_INDEX_FIELD_NUMBER = 1;
        private long lastIncludedIndex_;
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        public boolean hasLastIncludedIndex() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 last_included_index = 1;</code>
         */
        public long getLastIncludedIndex() {
            return lastIncludedIndex_;
        }

        // optional uint64 last_included_term = 2;
        public static final int LAST_INCLUDED_TERM_FIELD_NUMBER = 2;
        private long lastIncludedTerm_;
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        public boolean hasLastIncludedTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 last_included_term = 2;</code>
         */
        public long getLastIncludedTerm() {
            return lastIncludedTerm_;
        }

        // optional .raft.Configuration configuration = 3;
        public static final int CONFIGURATION_FIELD_NUMBER = 3;
        private com.emptyovo.raft.proto.RaftProto.Configuration configuration_;
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public boolean hasConfiguration() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Configuration getConfiguration() {
            return configuration_;
        }
        /**
         * <code>optional .raft.Configuration configuration = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ConfigurationOrBuilder getConfigurationOrBuilder() {
            return configuration_;
        }

        private void initFields() {
            lastIncludedIndex_ = 0L;
            lastIncludedTerm_ = 0L;
            configuration_ = com.emptyovo.raft.proto.RaftProto.Configuration.getDefaultInstance();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt64(1, lastIncludedIndex_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt64(2, lastIncludedTerm_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(3, configuration_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, lastIncludedIndex_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, lastIncludedTerm_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, configuration_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.SnapshotMetaData prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.SnapshotMetaData}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.SnapshotMetaDataOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_SnapshotMetaData_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_SnapshotMetaData_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.class,
                                com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.newBuilder()
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
                    getConfigurationFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                lastIncludedIndex_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                lastIncludedTerm_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                if (configurationBuilder_ == null) {
                    configuration_ = com.emptyovo.raft.proto.RaftProto.Configuration.getDefaultInstance();
                } else {
                    configurationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_SnapshotMetaData_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.SnapshotMetaData getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.SnapshotMetaData build() {
                com.emptyovo.raft.proto.RaftProto.SnapshotMetaData result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.SnapshotMetaData buildPartial() {
                com.emptyovo.raft.proto.RaftProto.SnapshotMetaData result =
                        new com.emptyovo.raft.proto.RaftProto.SnapshotMetaData(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.lastIncludedIndex_ = lastIncludedIndex_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.lastIncludedTerm_ = lastIncludedTerm_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (configurationBuilder_ == null) {
                    result.configuration_ = configuration_;
                } else {
                    result.configuration_ = configurationBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.SnapshotMetaData) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.SnapshotMetaData) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.SnapshotMetaData other) {
                if (other == com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.getDefaultInstance())
                    return this;
                if (other.hasLastIncludedIndex()) {
                    setLastIncludedIndex(other.getLastIncludedIndex());
                }
                if (other.hasLastIncludedTerm()) {
                    setLastIncludedTerm(other.getLastIncludedTerm());
                }
                if (other.hasConfiguration()) {
                    mergeConfiguration(other.getConfiguration());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.SnapshotMetaData parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.SnapshotMetaData) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint64 last_included_index = 1;
            private long lastIncludedIndex_;
            /**
             * <code>optional uint64 last_included_index = 1;</code>
             */
            public boolean hasLastIncludedIndex() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint64 last_included_index = 1;</code>
             */
            public long getLastIncludedIndex() {
                return lastIncludedIndex_;
            }
            /**
             * <code>optional uint64 last_included_index = 1;</code>
             */
            public Builder setLastIncludedIndex(long value) {
                bitField0_ |= 0x00000001;
                lastIncludedIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 last_included_index = 1;</code>
             */
            public Builder clearLastIncludedIndex() {
                bitField0_ = (bitField0_ & ~0x00000001);
                lastIncludedIndex_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 last_included_term = 2;
            private long lastIncludedTerm_;
            /**
             * <code>optional uint64 last_included_term = 2;</code>
             */
            public boolean hasLastIncludedTerm() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 last_included_term = 2;</code>
             */
            public long getLastIncludedTerm() {
                return lastIncludedTerm_;
            }
            /**
             * <code>optional uint64 last_included_term = 2;</code>
             */
            public Builder setLastIncludedTerm(long value) {
                bitField0_ |= 0x00000002;
                lastIncludedTerm_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 last_included_term = 2;</code>
             */
            public Builder clearLastIncludedTerm() {
                bitField0_ = (bitField0_ & ~0x00000002);
                lastIncludedTerm_ = 0L;
                onChanged();
                return this;
            }

            // optional .raft.Configuration configuration = 3;
            private com.emptyovo.raft.proto.RaftProto.Configuration configuration_ =
                    com.emptyovo.raft.proto.RaftProto.Configuration.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Configuration, com.emptyovo.raft.proto.RaftProto.Configuration.Builder, com.emptyovo.raft.proto.RaftProto.ConfigurationOrBuilder> configurationBuilder_;
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public boolean hasConfiguration() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Configuration getConfiguration() {
                if (configurationBuilder_ == null) {
                    return configuration_;
                } else {
                    return configurationBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public Builder setConfiguration(com.emptyovo.raft.proto.RaftProto.Configuration value) {
                if (configurationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    configuration_ = value;
                    onChanged();
                } else {
                    configurationBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public Builder setConfiguration(
                    com.emptyovo.raft.proto.RaftProto.Configuration.Builder builderForValue) {
                if (configurationBuilder_ == null) {
                    configuration_ = builderForValue.build();
                    onChanged();
                } else {
                    configurationBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public Builder mergeConfiguration(com.emptyovo.raft.proto.RaftProto.Configuration value) {
                if (configurationBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004) &&
                            configuration_ != com.emptyovo.raft.proto.RaftProto.Configuration.getDefaultInstance()) {
                        configuration_ =
                                com.emptyovo.raft.proto.RaftProto.Configuration.newBuilder(configuration_)
                                        .mergeFrom(value).buildPartial();
                    } else {
                        configuration_ = value;
                    }
                    onChanged();
                } else {
                    configurationBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public Builder clearConfiguration() {
                if (configurationBuilder_ == null) {
                    configuration_ = com.emptyovo.raft.proto.RaftProto.Configuration.getDefaultInstance();
                    onChanged();
                } else {
                    configurationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Configuration.Builder getConfigurationBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getConfigurationFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ConfigurationOrBuilder getConfigurationOrBuilder() {
                if (configurationBuilder_ != null) {
                    return configurationBuilder_.getMessageOrBuilder();
                } else {
                    return configuration_;
                }
            }
            /**
             * <code>optional .raft.Configuration configuration = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Configuration, com.emptyovo.raft.proto.RaftProto.Configuration.Builder, com.emptyovo.raft.proto.RaftProto.ConfigurationOrBuilder> getConfigurationFieldBuilder() {
                if (configurationBuilder_ == null) {
                    configurationBuilder_ =
                            new com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Configuration, com.emptyovo.raft.proto.RaftProto.Configuration.Builder, com.emptyovo.raft.proto.RaftProto.ConfigurationOrBuilder>(
                                    configuration_,
                                    getParentForChildren(),
                                    isClean());
                    configuration_ = null;
                }
                return configurationBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.SnapshotMetaData)
        }

        static {
            defaultInstance = new SnapshotMetaData(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.SnapshotMetaData)
    }

    public interface LogEntryOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint64 term = 1;
        /**
         * <code>optional uint64 term = 1;</code>
         */
        boolean hasTerm();
        /**
         * <code>optional uint64 term = 1;</code>
         */
        long getTerm();

        // optional uint64 index = 2;
        /**
         * <code>optional uint64 index = 2;</code>
         */
        boolean hasIndex();
        /**
         * <code>optional uint64 index = 2;</code>
         */
        long getIndex();

        // optional .raft.EntryType type = 3;
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        boolean hasType();
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.EntryType getType();

        // optional bytes data = 4;
        /**
         * <code>optional bytes data = 4;</code>
         */
        boolean hasData();
        /**
         * <code>optional bytes data = 4;</code>
         */
        com.google.protobuf.ByteString getData();
    }
    /**
     * Protobuf type {@code raft.LogEntry}
     */
    public static final class LogEntry
            extends
                com.google.protobuf.GeneratedMessage
            implements
                LogEntryOrBuilder {

        // Use LogEntry.newBuilder() to construct.
        private LogEntry(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private LogEntry(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final LogEntry defaultInstance;
        public static LogEntry getDefaultInstance() {
            return defaultInstance;
        }

        public LogEntry getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private LogEntry(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            term_ = input.readUInt64();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            index_ = input.readUInt64();
                            break;
                        }
                        case 24: {
                            int rawValue = input.readEnum();
                            com.emptyovo.raft.proto.RaftProto.EntryType value =
                                    com.emptyovo.raft.proto.RaftProto.EntryType.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(3, rawValue);
                            } else {
                                bitField0_ |= 0x00000004;
                                type_ = value;
                            }
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            data_ = input.readBytes();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogEntry_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogEntry_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.LogEntry.class,
                            com.emptyovo.raft.proto.RaftProto.LogEntry.Builder.class);
        }

        public static com.google.protobuf.Parser<LogEntry> PARSER =
                new com.google.protobuf.AbstractParser<LogEntry>() {

                    public LogEntry parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new LogEntry(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<LogEntry> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint64 term = 1;
        public static final int TERM_FIELD_NUMBER = 1;
        private long term_;
        /**
         * <code>optional uint64 term = 1;</code>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 term = 1;</code>
         */
        public long getTerm() {
            return term_;
        }

        // optional uint64 index = 2;
        public static final int INDEX_FIELD_NUMBER = 2;
        private long index_;
        /**
         * <code>optional uint64 index = 2;</code>
         */
        public boolean hasIndex() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 index = 2;</code>
         */
        public long getIndex() {
            return index_;
        }

        // optional .raft.EntryType type = 3;
        public static final int TYPE_FIELD_NUMBER = 3;
        private com.emptyovo.raft.proto.RaftProto.EntryType type_;
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        public boolean hasType() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.EntryType type = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.EntryType getType() {
            return type_;
        }

        // optional bytes data = 4;
        public static final int DATA_FIELD_NUMBER = 4;
        private com.google.protobuf.ByteString data_;
        /**
         * <code>optional bytes data = 4;</code>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional bytes data = 4;</code>
         */
        public com.google.protobuf.ByteString getData() {
            return data_;
        }

        private void initFields() {
            term_ = 0L;
            index_ = 0L;
            type_ = com.emptyovo.raft.proto.RaftProto.EntryType.ENTRY_TYPE_DATA;
            data_ = com.google.protobuf.ByteString.EMPTY;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt64(1, term_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt64(2, index_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeEnum(3, type_.getNumber());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, data_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, term_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, index_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(3, type_.getNumber());
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, data_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.LogEntry parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.LogEntry prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.LogEntry}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogEntry_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogEntry_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.LogEntry.class,
                                com.emptyovo.raft.proto.RaftProto.LogEntry.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.LogEntry.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                term_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                index_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                type_ = com.emptyovo.raft.proto.RaftProto.EntryType.ENTRY_TYPE_DATA;
                bitField0_ = (bitField0_ & ~0x00000004);
                data_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_LogEntry_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.LogEntry getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.LogEntry.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.LogEntry build() {
                com.emptyovo.raft.proto.RaftProto.LogEntry result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.LogEntry buildPartial() {
                com.emptyovo.raft.proto.RaftProto.LogEntry result =
                        new com.emptyovo.raft.proto.RaftProto.LogEntry(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.term_ = term_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.index_ = index_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.type_ = type_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.data_ = data_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.LogEntry) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.LogEntry) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.LogEntry other) {
                if (other == com.emptyovo.raft.proto.RaftProto.LogEntry.getDefaultInstance())
                    return this;
                if (other.hasTerm()) {
                    setTerm(other.getTerm());
                }
                if (other.hasIndex()) {
                    setIndex(other.getIndex());
                }
                if (other.hasType()) {
                    setType(other.getType());
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.LogEntry parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.LogEntry) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint64 term = 1;
            private long term_;
            /**
             * <code>optional uint64 term = 1;</code>
             */
            public boolean hasTerm() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint64 term = 1;</code>
             */
            public long getTerm() {
                return term_;
            }
            /**
             * <code>optional uint64 term = 1;</code>
             */
            public Builder setTerm(long value) {
                bitField0_ |= 0x00000001;
                term_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 term = 1;</code>
             */
            public Builder clearTerm() {
                bitField0_ = (bitField0_ & ~0x00000001);
                term_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 index = 2;
            private long index_;
            /**
             * <code>optional uint64 index = 2;</code>
             */
            public boolean hasIndex() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 index = 2;</code>
             */
            public long getIndex() {
                return index_;
            }
            /**
             * <code>optional uint64 index = 2;</code>
             */
            public Builder setIndex(long value) {
                bitField0_ |= 0x00000002;
                index_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 index = 2;</code>
             */
            public Builder clearIndex() {
                bitField0_ = (bitField0_ & ~0x00000002);
                index_ = 0L;
                onChanged();
                return this;
            }

            // optional .raft.EntryType type = 3;
            private com.emptyovo.raft.proto.RaftProto.EntryType type_ =
                    com.emptyovo.raft.proto.RaftProto.EntryType.ENTRY_TYPE_DATA;
            /**
             * <code>optional .raft.EntryType type = 3;</code>
             */
            public boolean hasType() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .raft.EntryType type = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.EntryType getType() {
                return type_;
            }
            /**
             * <code>optional .raft.EntryType type = 3;</code>
             */
            public Builder setType(com.emptyovo.raft.proto.RaftProto.EntryType value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                type_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .raft.EntryType type = 3;</code>
             */
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000004);
                type_ = com.emptyovo.raft.proto.RaftProto.EntryType.ENTRY_TYPE_DATA;
                onChanged();
                return this;
            }

            // optional bytes data = 4;
            private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes data = 4;</code>
             */
            public boolean hasData() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional bytes data = 4;</code>
             */
            public com.google.protobuf.ByteString getData() {
                return data_;
            }
            /**
             * <code>optional bytes data = 4;</code>
             */
            public Builder setData(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                data_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes data = 4;</code>
             */
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000008);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.LogEntry)
        }

        static {
            defaultInstance = new LogEntry(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.LogEntry)
    }

    public interface VoteRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint32 server_id = 1;
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        boolean hasServerId();
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        int getServerId();

        // optional uint64 term = 2;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        boolean hasTerm();
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        long getTerm();

        // optional uint64 last_log_term = 3;
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        boolean hasLastLogTerm();
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        long getLastLogTerm();

        // optional uint64 last_log_index = 4;
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        boolean hasLastLogIndex();
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        long getLastLogIndex();
    }
    /**
     * Protobuf type {@code raft.VoteRequest}
     */
    public static final class VoteRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                VoteRequestOrBuilder {

        // Use VoteRequest.newBuilder() to construct.
        private VoteRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private VoteRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final VoteRequest defaultInstance;
        public static VoteRequest getDefaultInstance() {
            return defaultInstance;
        }

        public VoteRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private VoteRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            serverId_ = input.readUInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            term_ = input.readUInt64();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            lastLogTerm_ = input.readUInt64();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            lastLogIndex_ = input.readUInt64();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.VoteRequest.class,
                            com.emptyovo.raft.proto.RaftProto.VoteRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<VoteRequest> PARSER =
                new com.google.protobuf.AbstractParser<VoteRequest>() {

                    public VoteRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new VoteRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<VoteRequest> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint32 server_id = 1;
        public static final int SERVER_ID_FIELD_NUMBER = 1;
        private int serverId_;
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        public boolean hasServerId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 请求选票的候选人的 Id
         * </pre>
         */
        public int getServerId() {
            return serverId_;
        }

        // optional uint64 term = 2;
        public static final int TERM_FIELD_NUMBER = 2;
        private long term_;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 候选人的任期号
         * </pre>
         */
        public long getTerm() {
            return term_;
        }

        // optional uint64 last_log_term = 3;
        public static final int LAST_LOG_TERM_FIELD_NUMBER = 3;
        private long lastLogTerm_;
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        public boolean hasLastLogTerm() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 last_log_term = 3;</code>
         *
         * <pre>
         * 候选人的最后日志条目的任期号
         * </pre>
         */
        public long getLastLogTerm() {
            return lastLogTerm_;
        }

        // optional uint64 last_log_index = 4;
        public static final int LAST_LOG_INDEX_FIELD_NUMBER = 4;
        private long lastLogIndex_;
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        public boolean hasLastLogIndex() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint64 last_log_index = 4;</code>
         *
         * <pre>
         * 候选人最后日志条目的索引值
         * </pre>
         */
        public long getLastLogIndex() {
            return lastLogIndex_;
        }

        private void initFields() {
            serverId_ = 0;
            term_ = 0L;
            lastLogTerm_ = 0L;
            lastLogIndex_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt64(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt64(3, lastLogTerm_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeUInt64(4, lastLogIndex_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(3, lastLogTerm_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(4, lastLogIndex_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.VoteRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.VoteRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.VoteRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.VoteRequest.class,
                                com.emptyovo.raft.proto.RaftProto.VoteRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.VoteRequest.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                serverId_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                term_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                lastLogTerm_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000004);
                lastLogIndex_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteRequest_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.VoteRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.VoteRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.VoteRequest build() {
                com.emptyovo.raft.proto.RaftProto.VoteRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.VoteRequest buildPartial() {
                com.emptyovo.raft.proto.RaftProto.VoteRequest result =
                        new com.emptyovo.raft.proto.RaftProto.VoteRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.serverId_ = serverId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.term_ = term_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.lastLogTerm_ = lastLogTerm_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.lastLogIndex_ = lastLogIndex_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.VoteRequest) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.VoteRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.VoteRequest other) {
                if (other == com.emptyovo.raft.proto.RaftProto.VoteRequest.getDefaultInstance())
                    return this;
                if (other.hasServerId()) {
                    setServerId(other.getServerId());
                }
                if (other.hasTerm()) {
                    setTerm(other.getTerm());
                }
                if (other.hasLastLogTerm()) {
                    setLastLogTerm(other.getLastLogTerm());
                }
                if (other.hasLastLogIndex()) {
                    setLastLogIndex(other.getLastLogIndex());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.VoteRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.VoteRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint32 server_id = 1;
            private int serverId_;
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 请求选票的候选人的 Id
             * </pre>
             */
            public boolean hasServerId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 请求选票的候选人的 Id
             * </pre>
             */
            public int getServerId() {
                return serverId_;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 请求选票的候选人的 Id
             * </pre>
             */
            public Builder setServerId(int value) {
                bitField0_ |= 0x00000001;
                serverId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 请求选票的候选人的 Id
             * </pre>
             */
            public Builder clearServerId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                serverId_ = 0;
                onChanged();
                return this;
            }

            // optional uint64 term = 2;
            private long term_;
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 候选人的任期号
             * </pre>
             */
            public boolean hasTerm() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 候选人的任期号
             * </pre>
             */
            public long getTerm() {
                return term_;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 候选人的任期号
             * </pre>
             */
            public Builder setTerm(long value) {
                bitField0_ |= 0x00000002;
                term_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 候选人的任期号
             * </pre>
             */
            public Builder clearTerm() {
                bitField0_ = (bitField0_ & ~0x00000002);
                term_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 last_log_term = 3;
            private long lastLogTerm_;
            /**
             * <code>optional uint64 last_log_term = 3;</code>
             *
             * <pre>
             * 候选人的最后日志条目的任期号
             * </pre>
             */
            public boolean hasLastLogTerm() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint64 last_log_term = 3;</code>
             *
             * <pre>
             * 候选人的最后日志条目的任期号
             * </pre>
             */
            public long getLastLogTerm() {
                return lastLogTerm_;
            }
            /**
             * <code>optional uint64 last_log_term = 3;</code>
             *
             * <pre>
             * 候选人的最后日志条目的任期号
             * </pre>
             */
            public Builder setLastLogTerm(long value) {
                bitField0_ |= 0x00000004;
                lastLogTerm_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 last_log_term = 3;</code>
             *
             * <pre>
             * 候选人的最后日志条目的任期号
             * </pre>
             */
            public Builder clearLastLogTerm() {
                bitField0_ = (bitField0_ & ~0x00000004);
                lastLogTerm_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 last_log_index = 4;
            private long lastLogIndex_;
            /**
             * <code>optional uint64 last_log_index = 4;</code>
             *
             * <pre>
             * 候选人最后日志条目的索引值
             * </pre>
             */
            public boolean hasLastLogIndex() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional uint64 last_log_index = 4;</code>
             *
             * <pre>
             * 候选人最后日志条目的索引值
             * </pre>
             */
            public long getLastLogIndex() {
                return lastLogIndex_;
            }
            /**
             * <code>optional uint64 last_log_index = 4;</code>
             *
             * <pre>
             * 候选人最后日志条目的索引值
             * </pre>
             */
            public Builder setLastLogIndex(long value) {
                bitField0_ |= 0x00000008;
                lastLogIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 last_log_index = 4;</code>
             *
             * <pre>
             * 候选人最后日志条目的索引值
             * </pre>
             */
            public Builder clearLastLogIndex() {
                bitField0_ = (bitField0_ & ~0x00000008);
                lastLogIndex_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.VoteRequest)
        }

        static {
            defaultInstance = new VoteRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.VoteRequest)
    }

    public interface VoteResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint64 term = 1;
        /**
         * <code>optional uint64 term = 1;</code>
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        boolean hasTerm();
        /**
         * <code>optional uint64 term = 1;</code>
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        long getTerm();

        // optional bool granted = 2;
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        boolean hasGranted();
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        boolean getGranted();
    }
    /**
     * Protobuf type {@code raft.VoteResponse}
     */
    public static final class VoteResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                VoteResponseOrBuilder {

        // Use VoteResponse.newBuilder() to construct.
        private VoteResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private VoteResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final VoteResponse defaultInstance;
        public static VoteResponse getDefaultInstance() {
            return defaultInstance;
        }

        public VoteResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private VoteResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            term_ = input.readUInt64();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            granted_ = input.readBool();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.VoteResponse.class,
                            com.emptyovo.raft.proto.RaftProto.VoteResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<VoteResponse> PARSER =
                new com.google.protobuf.AbstractParser<VoteResponse>() {

                    public VoteResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new VoteResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<VoteResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint64 term = 1;
        public static final int TERM_FIELD_NUMBER = 1;
        private long term_;
        /**
         * <code>optional uint64 term = 1;</code>
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint64 term = 1;</code>
         *
         * <pre>
         * 当前任期号，以便于候选人去更新自己的任期号
         * </pre>
         */
        public long getTerm() {
            return term_;
        }

        // optional bool granted = 2;
        public static final int GRANTED_FIELD_NUMBER = 2;
        private boolean granted_;
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        public boolean hasGranted() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional bool granted = 2;</code>
         *
         * <pre>
         * 候选人赢得了此张选票时为真
         * </pre>
         */
        public boolean getGranted() {
            return granted_;
        }

        private void initFields() {
            term_ = 0L;
            granted_ = false;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt64(1, term_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBool(2, granted_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(1, term_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(2, granted_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.VoteResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.VoteResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.VoteResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.VoteResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.VoteResponse.class,
                                com.emptyovo.raft.proto.RaftProto.VoteResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.VoteResponse.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                term_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                granted_ = false;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_VoteResponse_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.VoteResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.VoteResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.VoteResponse build() {
                com.emptyovo.raft.proto.RaftProto.VoteResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.VoteResponse buildPartial() {
                com.emptyovo.raft.proto.RaftProto.VoteResponse result =
                        new com.emptyovo.raft.proto.RaftProto.VoteResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.term_ = term_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.granted_ = granted_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.VoteResponse) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.VoteResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.VoteResponse other) {
                if (other == com.emptyovo.raft.proto.RaftProto.VoteResponse.getDefaultInstance())
                    return this;
                if (other.hasTerm()) {
                    setTerm(other.getTerm());
                }
                if (other.hasGranted()) {
                    setGranted(other.getGranted());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.VoteResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.VoteResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint64 term = 1;
            private long term_;
            /**
             * <code>optional uint64 term = 1;</code>
             *
             * <pre>
             * 当前任期号，以便于候选人去更新自己的任期号
             * </pre>
             */
            public boolean hasTerm() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint64 term = 1;</code>
             *
             * <pre>
             * 当前任期号，以便于候选人去更新自己的任期号
             * </pre>
             */
            public long getTerm() {
                return term_;
            }
            /**
             * <code>optional uint64 term = 1;</code>
             *
             * <pre>
             * 当前任期号，以便于候选人去更新自己的任期号
             * </pre>
             */
            public Builder setTerm(long value) {
                bitField0_ |= 0x00000001;
                term_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 term = 1;</code>
             *
             * <pre>
             * 当前任期号，以便于候选人去更新自己的任期号
             * </pre>
             */
            public Builder clearTerm() {
                bitField0_ = (bitField0_ & ~0x00000001);
                term_ = 0L;
                onChanged();
                return this;
            }

            // optional bool granted = 2;
            private boolean granted_;
            /**
             * <code>optional bool granted = 2;</code>
             *
             * <pre>
             * 候选人赢得了此张选票时为真
             * </pre>
             */
            public boolean hasGranted() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional bool granted = 2;</code>
             *
             * <pre>
             * 候选人赢得了此张选票时为真
             * </pre>
             */
            public boolean getGranted() {
                return granted_;
            }
            /**
             * <code>optional bool granted = 2;</code>
             *
             * <pre>
             * 候选人赢得了此张选票时为真
             * </pre>
             */
            public Builder setGranted(boolean value) {
                bitField0_ |= 0x00000002;
                granted_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool granted = 2;</code>
             *
             * <pre>
             * 候选人赢得了此张选票时为真
             * </pre>
             */
            public Builder clearGranted() {
                bitField0_ = (bitField0_ & ~0x00000002);
                granted_ = false;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.VoteResponse)
        }

        static {
            defaultInstance = new VoteResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.VoteResponse)
    }

    public interface AppendEntriesRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint32 server_id = 1;
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 领导人的Id
         * </pre>
         */
        boolean hasServerId();
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 领导人的Id
         * </pre>
         */
        int getServerId();

        // optional uint64 term = 2;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 领导人的任期号
         * </pre>
         */
        boolean hasTerm();
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 领导人的任期号
         * </pre>
         */
        long getTerm();

        // optional uint64 prev_log_index = 3;
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        boolean hasPrevLogIndex();
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        long getPrevLogIndex();

        // optional uint64 prev_log_term = 4;
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        boolean hasPrevLogTerm();
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        long getPrevLogTerm();

        // optional uint64 commit_index = 5;
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        boolean hasCommitIndex();
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        long getCommitIndex();

        // repeated .raft.LogEntry entries = 6;
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        java.util.List<com.emptyovo.raft.proto.RaftProto.LogEntry> getEntriesList();
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        com.emptyovo.raft.proto.RaftProto.LogEntry getEntries(int index);
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        int getEntriesCount();
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        java.util.List<? extends com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder> getEntriesOrBuilderList();
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder getEntriesOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code raft.AppendEntriesRequest}
     */
    public static final class AppendEntriesRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                AppendEntriesRequestOrBuilder {

        // Use AppendEntriesRequest.newBuilder() to construct.
        private AppendEntriesRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private AppendEntriesRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final AppendEntriesRequest defaultInstance;
        public static AppendEntriesRequest getDefaultInstance() {
            return defaultInstance;
        }

        public AppendEntriesRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private AppendEntriesRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            serverId_ = input.readUInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            term_ = input.readUInt64();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            prevLogIndex_ = input.readUInt64();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000008;
                            prevLogTerm_ = input.readUInt64();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            commitIndex_ = input.readUInt64();
                            break;
                        }
                        case 50: {
                            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                                entries_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.LogEntry>();
                                mutable_bitField0_ |= 0x00000020;
                            }
                            entries_.add(input.readMessage(com.emptyovo.raft.proto.RaftProto.LogEntry.PARSER,
                                    extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                    entries_ = java.util.Collections.unmodifiableList(entries_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest.class,
                            com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<AppendEntriesRequest> PARSER =
                new com.google.protobuf.AbstractParser<AppendEntriesRequest>() {

                    public AppendEntriesRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new AppendEntriesRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<AppendEntriesRequest> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint32 server_id = 1;
        public static final int SERVER_ID_FIELD_NUMBER = 1;
        private int serverId_;
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 领导人的Id
         * </pre>
         */
        public boolean hasServerId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         *
         * <pre>
         * 领导人的Id
         * </pre>
         */
        public int getServerId() {
            return serverId_;
        }

        // optional uint64 term = 2;
        public static final int TERM_FIELD_NUMBER = 2;
        private long term_;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 领导人的任期号
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 领导人的任期号
         * </pre>
         */
        public long getTerm() {
            return term_;
        }

        // optional uint64 prev_log_index = 3;
        public static final int PREV_LOG_INDEX_FIELD_NUMBER = 3;
        private long prevLogIndex_;
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        public boolean hasPrevLogIndex() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 prev_log_index = 3;</code>
         *
         * <pre>
         * 新的日志条目紧随之前的索引值
         * </pre>
         */
        public long getPrevLogIndex() {
            return prevLogIndex_;
        }

        // optional uint64 prev_log_term = 4;
        public static final int PREV_LOG_TERM_FIELD_NUMBER = 4;
        private long prevLogTerm_;
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        public boolean hasPrevLogTerm() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional uint64 prev_log_term = 4;</code>
         *
         * <pre>
         * prev_log_index条目的任期号
         * </pre>
         */
        public long getPrevLogTerm() {
            return prevLogTerm_;
        }

        // optional uint64 commit_index = 5;
        public static final int COMMIT_INDEX_FIELD_NUMBER = 5;
        private long commitIndex_;
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        public boolean hasCommitIndex() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional uint64 commit_index = 5;</code>
         *
         * <pre>
         * 领导人已经提交的日志的索引值
         * </pre>
         */
        public long getCommitIndex() {
            return commitIndex_;
        }

        // repeated .raft.LogEntry entries = 6;
        public static final int ENTRIES_FIELD_NUMBER = 6;
        private java.util.List<com.emptyovo.raft.proto.RaftProto.LogEntry> entries_;
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public java.util.List<com.emptyovo.raft.proto.RaftProto.LogEntry> getEntriesList() {
            return entries_;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder> getEntriesOrBuilderList() {
            return entries_;
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public int getEntriesCount() {
            return entries_.size();
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public com.emptyovo.raft.proto.RaftProto.LogEntry getEntries(int index) {
            return entries_.get(index);
        }
        /**
         * <code>repeated .raft.LogEntry entries = 6;</code>
         *
         * <pre>
         * 准备存储的日志条目（表示心跳时为空）
         * </pre>
         */
        public com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder getEntriesOrBuilder(
                int index) {
            return entries_.get(index);
        }

        private void initFields() {
            serverId_ = 0;
            term_ = 0L;
            prevLogIndex_ = 0L;
            prevLogTerm_ = 0L;
            commitIndex_ = 0L;
            entries_ = java.util.Collections.emptyList();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt64(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt64(3, prevLogIndex_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeUInt64(4, prevLogTerm_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeUInt64(5, commitIndex_);
            }
            for (int i = 0; i < entries_.size(); i++) {
                output.writeMessage(6, entries_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(3, prevLogIndex_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(4, prevLogTerm_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(5, commitIndex_);
            }
            for (int i = 0; i < entries_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(6, entries_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.AppendEntriesRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.AppendEntriesRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest.class,
                                com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest.newBuilder()
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
                    getEntriesFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                serverId_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                term_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                prevLogIndex_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000004);
                prevLogTerm_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000008);
                commitIndex_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000010);
                if (entriesBuilder_ == null) {
                    entries_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                } else {
                    entriesBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesRequest_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest build() {
                com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest buildPartial() {
                com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest result =
                        new com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.serverId_ = serverId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.term_ = term_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.prevLogIndex_ = prevLogIndex_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.prevLogTerm_ = prevLogTerm_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.commitIndex_ = commitIndex_;
                if (entriesBuilder_ == null) {
                    if (((bitField0_ & 0x00000020) == 0x00000020)) {
                        entries_ = java.util.Collections.unmodifiableList(entries_);
                        bitField0_ = (bitField0_ & ~0x00000020);
                    }
                    result.entries_ = entries_;
                } else {
                    result.entries_ = entriesBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest other) {
                if (other == com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest.getDefaultInstance())
                    return this;
                if (other.hasServerId()) {
                    setServerId(other.getServerId());
                }
                if (other.hasTerm()) {
                    setTerm(other.getTerm());
                }
                if (other.hasPrevLogIndex()) {
                    setPrevLogIndex(other.getPrevLogIndex());
                }
                if (other.hasPrevLogTerm()) {
                    setPrevLogTerm(other.getPrevLogTerm());
                }
                if (other.hasCommitIndex()) {
                    setCommitIndex(other.getCommitIndex());
                }
                if (entriesBuilder_ == null) {
                    if (!other.entries_.isEmpty()) {
                        if (entries_.isEmpty()) {
                            entries_ = other.entries_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                        } else {
                            ensureEntriesIsMutable();
                            entries_.addAll(other.entries_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.entries_.isEmpty()) {
                        if (entriesBuilder_.isEmpty()) {
                            entriesBuilder_.dispose();
                            entriesBuilder_ = null;
                            entries_ = other.entries_;
                            bitField0_ = (bitField0_ & ~0x00000020);
                            entriesBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                                            ? getEntriesFieldBuilder()
                                            : null;
                        } else {
                            entriesBuilder_.addAllMessages(other.entries_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.AppendEntriesRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint32 server_id = 1;
            private int serverId_;
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 领导人的Id
             * </pre>
             */
            public boolean hasServerId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 领导人的Id
             * </pre>
             */
            public int getServerId() {
                return serverId_;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 领导人的Id
             * </pre>
             */
            public Builder setServerId(int value) {
                bitField0_ |= 0x00000001;
                serverId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             *
             * <pre>
             * 领导人的Id
             * </pre>
             */
            public Builder clearServerId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                serverId_ = 0;
                onChanged();
                return this;
            }

            // optional uint64 term = 2;
            private long term_;
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 领导人的任期号
             * </pre>
             */
            public boolean hasTerm() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 领导人的任期号
             * </pre>
             */
            public long getTerm() {
                return term_;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 领导人的任期号
             * </pre>
             */
            public Builder setTerm(long value) {
                bitField0_ |= 0x00000002;
                term_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 领导人的任期号
             * </pre>
             */
            public Builder clearTerm() {
                bitField0_ = (bitField0_ & ~0x00000002);
                term_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 prev_log_index = 3;
            private long prevLogIndex_;
            /**
             * <code>optional uint64 prev_log_index = 3;</code>
             *
             * <pre>
             * 新的日志条目紧随之前的索引值
             * </pre>
             */
            public boolean hasPrevLogIndex() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint64 prev_log_index = 3;</code>
             *
             * <pre>
             * 新的日志条目紧随之前的索引值
             * </pre>
             */
            public long getPrevLogIndex() {
                return prevLogIndex_;
            }
            /**
             * <code>optional uint64 prev_log_index = 3;</code>
             *
             * <pre>
             * 新的日志条目紧随之前的索引值
             * </pre>
             */
            public Builder setPrevLogIndex(long value) {
                bitField0_ |= 0x00000004;
                prevLogIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 prev_log_index = 3;</code>
             *
             * <pre>
             * 新的日志条目紧随之前的索引值
             * </pre>
             */
            public Builder clearPrevLogIndex() {
                bitField0_ = (bitField0_ & ~0x00000004);
                prevLogIndex_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 prev_log_term = 4;
            private long prevLogTerm_;
            /**
             * <code>optional uint64 prev_log_term = 4;</code>
             *
             * <pre>
             * prev_log_index条目的任期号
             * </pre>
             */
            public boolean hasPrevLogTerm() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional uint64 prev_log_term = 4;</code>
             *
             * <pre>
             * prev_log_index条目的任期号
             * </pre>
             */
            public long getPrevLogTerm() {
                return prevLogTerm_;
            }
            /**
             * <code>optional uint64 prev_log_term = 4;</code>
             *
             * <pre>
             * prev_log_index条目的任期号
             * </pre>
             */
            public Builder setPrevLogTerm(long value) {
                bitField0_ |= 0x00000008;
                prevLogTerm_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 prev_log_term = 4;</code>
             *
             * <pre>
             * prev_log_index条目的任期号
             * </pre>
             */
            public Builder clearPrevLogTerm() {
                bitField0_ = (bitField0_ & ~0x00000008);
                prevLogTerm_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 commit_index = 5;
            private long commitIndex_;
            /**
             * <code>optional uint64 commit_index = 5;</code>
             *
             * <pre>
             * 领导人已经提交的日志的索引值
             * </pre>
             */
            public boolean hasCommitIndex() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional uint64 commit_index = 5;</code>
             *
             * <pre>
             * 领导人已经提交的日志的索引值
             * </pre>
             */
            public long getCommitIndex() {
                return commitIndex_;
            }
            /**
             * <code>optional uint64 commit_index = 5;</code>
             *
             * <pre>
             * 领导人已经提交的日志的索引值
             * </pre>
             */
            public Builder setCommitIndex(long value) {
                bitField0_ |= 0x00000010;
                commitIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 commit_index = 5;</code>
             *
             * <pre>
             * 领导人已经提交的日志的索引值
             * </pre>
             */
            public Builder clearCommitIndex() {
                bitField0_ = (bitField0_ & ~0x00000010);
                commitIndex_ = 0L;
                onChanged();
                return this;
            }

            // repeated .raft.LogEntry entries = 6;
            private java.util.List<com.emptyovo.raft.proto.RaftProto.LogEntry> entries_ =
                    java.util.Collections.emptyList();
            private void ensureEntriesIsMutable() {
                if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                    entries_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.LogEntry>(entries_);
                    bitField0_ |= 0x00000020;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.LogEntry, com.emptyovo.raft.proto.RaftProto.LogEntry.Builder, com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder> entriesBuilder_;

            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.LogEntry> getEntriesList() {
                if (entriesBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(entries_);
                } else {
                    return entriesBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public int getEntriesCount() {
                if (entriesBuilder_ == null) {
                    return entries_.size();
                } else {
                    return entriesBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public com.emptyovo.raft.proto.RaftProto.LogEntry getEntries(int index) {
                if (entriesBuilder_ == null) {
                    return entries_.get(index);
                } else {
                    return entriesBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder setEntries(
                    int index, com.emptyovo.raft.proto.RaftProto.LogEntry value) {
                if (entriesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEntriesIsMutable();
                    entries_.set(index, value);
                    onChanged();
                } else {
                    entriesBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder setEntries(
                    int index, com.emptyovo.raft.proto.RaftProto.LogEntry.Builder builderForValue) {
                if (entriesBuilder_ == null) {
                    ensureEntriesIsMutable();
                    entries_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    entriesBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder addEntries(com.emptyovo.raft.proto.RaftProto.LogEntry value) {
                if (entriesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEntriesIsMutable();
                    entries_.add(value);
                    onChanged();
                } else {
                    entriesBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder addEntries(
                    int index, com.emptyovo.raft.proto.RaftProto.LogEntry value) {
                if (entriesBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureEntriesIsMutable();
                    entries_.add(index, value);
                    onChanged();
                } else {
                    entriesBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder addEntries(
                    com.emptyovo.raft.proto.RaftProto.LogEntry.Builder builderForValue) {
                if (entriesBuilder_ == null) {
                    ensureEntriesIsMutable();
                    entries_.add(builderForValue.build());
                    onChanged();
                } else {
                    entriesBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder addEntries(
                    int index, com.emptyovo.raft.proto.RaftProto.LogEntry.Builder builderForValue) {
                if (entriesBuilder_ == null) {
                    ensureEntriesIsMutable();
                    entries_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    entriesBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder addAllEntries(
                    Iterable<? extends com.emptyovo.raft.proto.RaftProto.LogEntry> values) {
                if (entriesBuilder_ == null) {
                    ensureEntriesIsMutable();
                    super.addAll(values, entries_);
                    onChanged();
                } else {
                    entriesBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder clearEntries() {
                if (entriesBuilder_ == null) {
                    entries_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000020);
                    onChanged();
                } else {
                    entriesBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public Builder removeEntries(int index) {
                if (entriesBuilder_ == null) {
                    ensureEntriesIsMutable();
                    entries_.remove(index);
                    onChanged();
                } else {
                    entriesBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public com.emptyovo.raft.proto.RaftProto.LogEntry.Builder getEntriesBuilder(
                    int index) {
                return getEntriesFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder getEntriesOrBuilder(
                    int index) {
                if (entriesBuilder_ == null) {
                    return entries_.get(index);
                } else {
                    return entriesBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder> getEntriesOrBuilderList() {
                if (entriesBuilder_ != null) {
                    return entriesBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(entries_);
                }
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public com.emptyovo.raft.proto.RaftProto.LogEntry.Builder addEntriesBuilder() {
                return getEntriesFieldBuilder().addBuilder(
                        com.emptyovo.raft.proto.RaftProto.LogEntry.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public com.emptyovo.raft.proto.RaftProto.LogEntry.Builder addEntriesBuilder(
                    int index) {
                return getEntriesFieldBuilder().addBuilder(
                        index, com.emptyovo.raft.proto.RaftProto.LogEntry.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.LogEntry entries = 6;</code>
             *
             * <pre>
             * 准备存储的日志条目（表示心跳时为空）
             * </pre>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.LogEntry.Builder> getEntriesBuilderList() {
                return getEntriesFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.LogEntry, com.emptyovo.raft.proto.RaftProto.LogEntry.Builder, com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder> getEntriesFieldBuilder() {
                if (entriesBuilder_ == null) {
                    entriesBuilder_ =
                            new com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.LogEntry, com.emptyovo.raft.proto.RaftProto.LogEntry.Builder, com.emptyovo.raft.proto.RaftProto.LogEntryOrBuilder>(
                                    entries_,
                                    ((bitField0_ & 0x00000020) == 0x00000020),
                                    getParentForChildren(),
                                    isClean());
                    entries_ = null;
                }
                return entriesBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.AppendEntriesRequest)
        }

        static {
            defaultInstance = new AppendEntriesRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.AppendEntriesRequest)
    }

    public interface AppendEntriesResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional .raft.ResCode res_code = 1;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
         */
        boolean hasResCode();
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
         */
        com.emptyovo.raft.proto.RaftProto.ResCode getResCode();

        // optional uint64 term = 2;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 当前的任期号，用于领导人去更新自己
         * </pre>
         */
        boolean hasTerm();
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 当前的任期号，用于领导人去更新自己
         * </pre>
         */
        long getTerm();

        // optional uint64 last_log_index = 3;
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        boolean hasLastLogIndex();
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        long getLastLogIndex();
    }
    /**
     * Protobuf type {@code raft.AppendEntriesResponse}
     */
    public static final class AppendEntriesResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                AppendEntriesResponseOrBuilder {

        // Use AppendEntriesResponse.newBuilder() to construct.
        private AppendEntriesResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private AppendEntriesResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final AppendEntriesResponse defaultInstance;
        public static AppendEntriesResponse getDefaultInstance() {
            return defaultInstance;
        }

        public AppendEntriesResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private AppendEntriesResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            com.emptyovo.raft.proto.RaftProto.ResCode value =
                                    com.emptyovo.raft.proto.RaftProto.ResCode.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                resCode_ = value;
                            }
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            term_ = input.readUInt64();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            lastLogIndex_ = input.readUInt64();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse.class,
                            com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<AppendEntriesResponse> PARSER =
                new com.google.protobuf.AbstractParser<AppendEntriesResponse>() {

                    public AppendEntriesResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new AppendEntriesResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<AppendEntriesResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional .raft.ResCode res_code = 1;
        public static final int RES_CODE_FIELD_NUMBER = 1;
        private com.emptyovo.raft.proto.RaftProto.ResCode resCode_;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         *
         * <pre>
         * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
         * </pre>
         */
        public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
            return resCode_;
        }

        // optional uint64 term = 2;
        public static final int TERM_FIELD_NUMBER = 2;
        private long term_;
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 当前的任期号，用于领导人去更新自己
         * </pre>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         *
         * <pre>
         * 当前的任期号，用于领导人去更新自己
         * </pre>
         */
        public long getTerm() {
            return term_;
        }

        // optional uint64 last_log_index = 3;
        public static final int LAST_LOG_INDEX_FIELD_NUMBER = 3;
        private long lastLogIndex_;
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        public boolean hasLastLogIndex() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional uint64 last_log_index = 3;</code>
         */
        public long getLastLogIndex() {
            return lastLogIndex_;
        }

        private void initFields() {
            resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            term_ = 0L;
            lastLogIndex_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt64(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt64(3, lastLogIndex_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(3, lastLogIndex_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.AppendEntriesResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.AppendEntriesResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse.class,
                                com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                bitField0_ = (bitField0_ & ~0x00000001);
                term_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                lastLogIndex_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AppendEntriesResponse_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse build() {
                com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse buildPartial() {
                com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse result =
                        new com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.resCode_ = resCode_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.term_ = term_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.lastLogIndex_ = lastLogIndex_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse other) {
                if (other == com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse.getDefaultInstance())
                    return this;
                if (other.hasResCode()) {
                    setResCode(other.getResCode());
                }
                if (other.hasTerm()) {
                    setTerm(other.getTerm());
                }
                if (other.hasLastLogIndex()) {
                    setLastLogIndex(other.getLastLogIndex());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.AppendEntriesResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional .raft.ResCode res_code = 1;
            private com.emptyovo.raft.proto.RaftProto.ResCode resCode_ =
                    com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             *
             * <pre>
             * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
             * </pre>
             */
            public boolean hasResCode() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             *
             * <pre>
             * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
             * </pre>
             */
            public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
                return resCode_;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             *
             * <pre>
             * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
             * </pre>
             */
            public Builder setResCode(com.emptyovo.raft.proto.RaftProto.ResCode value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                resCode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             *
             * <pre>
             * 跟随者包含了匹配上 prevLogIndex 和 prevLogTerm 的日志时为真
             * </pre>
             */
            public Builder clearResCode() {
                bitField0_ = (bitField0_ & ~0x00000001);
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                onChanged();
                return this;
            }

            // optional uint64 term = 2;
            private long term_;
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 当前的任期号，用于领导人去更新自己
             * </pre>
             */
            public boolean hasTerm() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 当前的任期号，用于领导人去更新自己
             * </pre>
             */
            public long getTerm() {
                return term_;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 当前的任期号，用于领导人去更新自己
             * </pre>
             */
            public Builder setTerm(long value) {
                bitField0_ |= 0x00000002;
                term_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             *
             * <pre>
             * 当前的任期号，用于领导人去更新自己
             * </pre>
             */
            public Builder clearTerm() {
                bitField0_ = (bitField0_ & ~0x00000002);
                term_ = 0L;
                onChanged();
                return this;
            }

            // optional uint64 last_log_index = 3;
            private long lastLogIndex_;
            /**
             * <code>optional uint64 last_log_index = 3;</code>
             */
            public boolean hasLastLogIndex() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional uint64 last_log_index = 3;</code>
             */
            public long getLastLogIndex() {
                return lastLogIndex_;
            }
            /**
             * <code>optional uint64 last_log_index = 3;</code>
             */
            public Builder setLastLogIndex(long value) {
                bitField0_ |= 0x00000004;
                lastLogIndex_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 last_log_index = 3;</code>
             */
            public Builder clearLastLogIndex() {
                bitField0_ = (bitField0_ & ~0x00000004);
                lastLogIndex_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.AppendEntriesResponse)
        }

        static {
            defaultInstance = new AppendEntriesResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.AppendEntriesResponse)
    }

    public interface InstallSnapshotRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional uint32 server_id = 1;
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        boolean hasServerId();
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        int getServerId();

        // optional uint64 term = 2;
        /**
         * <code>optional uint64 term = 2;</code>
         */
        boolean hasTerm();
        /**
         * <code>optional uint64 term = 2;</code>
         */
        long getTerm();

        // optional .raft.SnapshotMetaData snapshot_meta_data = 3;
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        boolean hasSnapshotMetaData();
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.SnapshotMetaData getSnapshotMetaData();
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.SnapshotMetaDataOrBuilder getSnapshotMetaDataOrBuilder();

        // optional string file_name = 4;
        /**
         * <code>optional string file_name = 4;</code>
         */
        boolean hasFileName();
        /**
         * <code>optional string file_name = 4;</code>
         */
        String getFileName();
        /**
         * <code>optional string file_name = 4;</code>
         */
        com.google.protobuf.ByteString getFileNameBytes();

        // optional uint64 offset = 5;
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        boolean hasOffset();
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        long getOffset();

        // optional bytes data = 6;
        /**
         * <code>optional bytes data = 6;</code>
         */
        boolean hasData();
        /**
         * <code>optional bytes data = 6;</code>
         */
        com.google.protobuf.ByteString getData();

        // optional bool is_first = 7;
        /**
         * <code>optional bool is_first = 7;</code>
         */
        boolean hasIsFirst();
        /**
         * <code>optional bool is_first = 7;</code>
         */
        boolean getIsFirst();

        // optional bool is_last = 8;
        /**
         * <code>optional bool is_last = 8;</code>
         */
        boolean hasIsLast();
        /**
         * <code>optional bool is_last = 8;</code>
         */
        boolean getIsLast();
    }
    /**
     * Protobuf type {@code raft.InstallSnapshotRequest}
     */
    public static final class InstallSnapshotRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                InstallSnapshotRequestOrBuilder {

        // Use InstallSnapshotRequest.newBuilder() to construct.
        private InstallSnapshotRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private InstallSnapshotRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final InstallSnapshotRequest defaultInstance;
        public static InstallSnapshotRequest getDefaultInstance() {
            return defaultInstance;
        }

        public InstallSnapshotRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private InstallSnapshotRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            serverId_ = input.readUInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            term_ = input.readUInt64();
                            break;
                        }
                        case 26: {
                            com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = snapshotMetaData_.toBuilder();
                            }
                            snapshotMetaData_ = input.readMessage(
                                    com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(snapshotMetaData_);
                                snapshotMetaData_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        case 34: {
                            bitField0_ |= 0x00000008;
                            fileName_ = input.readBytes();
                            break;
                        }
                        case 40: {
                            bitField0_ |= 0x00000010;
                            offset_ = input.readUInt64();
                            break;
                        }
                        case 50: {
                            bitField0_ |= 0x00000020;
                            data_ = input.readBytes();
                            break;
                        }
                        case 56: {
                            bitField0_ |= 0x00000040;
                            isFirst_ = input.readBool();
                            break;
                        }
                        case 64: {
                            bitField0_ |= 0x00000080;
                            isLast_ = input.readBool();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest.class,
                            com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<InstallSnapshotRequest> PARSER =
                new com.google.protobuf.AbstractParser<InstallSnapshotRequest>() {

                    public InstallSnapshotRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new InstallSnapshotRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<InstallSnapshotRequest> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional uint32 server_id = 1;
        public static final int SERVER_ID_FIELD_NUMBER = 1;
        private int serverId_;
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public boolean hasServerId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional uint32 server_id = 1;</code>
         */
        public int getServerId() {
            return serverId_;
        }

        // optional uint64 term = 2;
        public static final int TERM_FIELD_NUMBER = 2;
        private long term_;
        /**
         * <code>optional uint64 term = 2;</code>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         */
        public long getTerm() {
            return term_;
        }

        // optional .raft.SnapshotMetaData snapshot_meta_data = 3;
        public static final int SNAPSHOT_META_DATA_FIELD_NUMBER = 3;
        private com.emptyovo.raft.proto.RaftProto.SnapshotMetaData snapshotMetaData_;
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public boolean hasSnapshotMetaData() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.SnapshotMetaData getSnapshotMetaData() {
            return snapshotMetaData_;
        }
        /**
         * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.SnapshotMetaDataOrBuilder getSnapshotMetaDataOrBuilder() {
            return snapshotMetaData_;
        }

        // optional string file_name = 4;
        public static final int FILE_NAME_FIELD_NUMBER = 4;
        private Object fileName_;
        /**
         * <code>optional string file_name = 4;</code>
         */
        public boolean hasFileName() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <code>optional string file_name = 4;</code>
         */
        public String getFileName() {
            Object ref = fileName_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    fileName_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string file_name = 4;</code>
         */
        public com.google.protobuf.ByteString getFileNameBytes() {
            Object ref = fileName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                fileName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional uint64 offset = 5;
        public static final int OFFSET_FIELD_NUMBER = 5;
        private long offset_;
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        public boolean hasOffset() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <code>optional uint64 offset = 5;</code>
         */
        public long getOffset() {
            return offset_;
        }

        // optional bytes data = 6;
        public static final int DATA_FIELD_NUMBER = 6;
        private com.google.protobuf.ByteString data_;
        /**
         * <code>optional bytes data = 6;</code>
         */
        public boolean hasData() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <code>optional bytes data = 6;</code>
         */
        public com.google.protobuf.ByteString getData() {
            return data_;
        }

        // optional bool is_first = 7;
        public static final int IS_FIRST_FIELD_NUMBER = 7;
        private boolean isFirst_;
        /**
         * <code>optional bool is_first = 7;</code>
         */
        public boolean hasIsFirst() {
            return ((bitField0_ & 0x00000040) == 0x00000040);
        }
        /**
         * <code>optional bool is_first = 7;</code>
         */
        public boolean getIsFirst() {
            return isFirst_;
        }

        // optional bool is_last = 8;
        public static final int IS_LAST_FIELD_NUMBER = 8;
        private boolean isLast_;
        /**
         * <code>optional bool is_last = 8;</code>
         */
        public boolean hasIsLast() {
            return ((bitField0_ & 0x00000080) == 0x00000080);
        }
        /**
         * <code>optional bool is_last = 8;</code>
         */
        public boolean getIsLast() {
            return isLast_;
        }

        private void initFields() {
            serverId_ = 0;
            term_ = 0L;
            snapshotMetaData_ = com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.getDefaultInstance();
            fileName_ = "";
            offset_ = 0L;
            data_ = com.google.protobuf.ByteString.EMPTY;
            isFirst_ = false;
            isLast_ = false;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt64(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(3, snapshotMetaData_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeBytes(4, getFileNameBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeUInt64(5, offset_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeBytes(6, data_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                output.writeBool(7, isFirst_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                output.writeBool(8, isLast_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, serverId_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, term_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, snapshotMetaData_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(4, getFileNameBytes());
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(5, offset_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(6, data_);
            }
            if (((bitField0_ & 0x00000040) == 0x00000040)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(7, isFirst_);
            }
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(8, isLast_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.InstallSnapshotRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest.class,
                                com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest.newBuilder()
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
                    getSnapshotMetaDataFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                serverId_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                term_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                if (snapshotMetaDataBuilder_ == null) {
                    snapshotMetaData_ = com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.getDefaultInstance();
                } else {
                    snapshotMetaDataBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                fileName_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                offset_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000010);
                data_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000020);
                isFirst_ = false;
                bitField0_ = (bitField0_ & ~0x00000040);
                isLast_ = false;
                bitField0_ = (bitField0_ & ~0x00000080);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotRequest_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest build() {
                com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest buildPartial() {
                com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest result =
                        new com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.serverId_ = serverId_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.term_ = term_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (snapshotMetaDataBuilder_ == null) {
                    result.snapshotMetaData_ = snapshotMetaData_;
                } else {
                    result.snapshotMetaData_ = snapshotMetaDataBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.fileName_ = fileName_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.offset_ = offset_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.data_ = data_;
                if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
                    to_bitField0_ |= 0x00000040;
                }
                result.isFirst_ = isFirst_;
                if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
                    to_bitField0_ |= 0x00000080;
                }
                result.isLast_ = isLast_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest other) {
                if (other == com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest.getDefaultInstance())
                    return this;
                if (other.hasServerId()) {
                    setServerId(other.getServerId());
                }
                if (other.hasTerm()) {
                    setTerm(other.getTerm());
                }
                if (other.hasSnapshotMetaData()) {
                    mergeSnapshotMetaData(other.getSnapshotMetaData());
                }
                if (other.hasFileName()) {
                    bitField0_ |= 0x00000008;
                    fileName_ = other.fileName_;
                    onChanged();
                }
                if (other.hasOffset()) {
                    setOffset(other.getOffset());
                }
                if (other.hasData()) {
                    setData(other.getData());
                }
                if (other.hasIsFirst()) {
                    setIsFirst(other.getIsFirst());
                }
                if (other.hasIsLast()) {
                    setIsLast(other.getIsLast());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.InstallSnapshotRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional uint32 server_id = 1;
            private int serverId_;
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public boolean hasServerId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public int getServerId() {
                return serverId_;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public Builder setServerId(int value) {
                bitField0_ |= 0x00000001;
                serverId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint32 server_id = 1;</code>
             */
            public Builder clearServerId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                serverId_ = 0;
                onChanged();
                return this;
            }

            // optional uint64 term = 2;
            private long term_;
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public boolean hasTerm() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public long getTerm() {
                return term_;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public Builder setTerm(long value) {
                bitField0_ |= 0x00000002;
                term_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public Builder clearTerm() {
                bitField0_ = (bitField0_ & ~0x00000002);
                term_ = 0L;
                onChanged();
                return this;
            }

            // optional .raft.SnapshotMetaData snapshot_meta_data = 3;
            private com.emptyovo.raft.proto.RaftProto.SnapshotMetaData snapshotMetaData_ =
                    com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.SnapshotMetaData, com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder, com.emptyovo.raft.proto.RaftProto.SnapshotMetaDataOrBuilder> snapshotMetaDataBuilder_;
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public boolean hasSnapshotMetaData() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.SnapshotMetaData getSnapshotMetaData() {
                if (snapshotMetaDataBuilder_ == null) {
                    return snapshotMetaData_;
                } else {
                    return snapshotMetaDataBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public Builder setSnapshotMetaData(com.emptyovo.raft.proto.RaftProto.SnapshotMetaData value) {
                if (snapshotMetaDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    snapshotMetaData_ = value;
                    onChanged();
                } else {
                    snapshotMetaDataBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public Builder setSnapshotMetaData(
                    com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder builderForValue) {
                if (snapshotMetaDataBuilder_ == null) {
                    snapshotMetaData_ = builderForValue.build();
                    onChanged();
                } else {
                    snapshotMetaDataBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public Builder mergeSnapshotMetaData(com.emptyovo.raft.proto.RaftProto.SnapshotMetaData value) {
                if (snapshotMetaDataBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004) &&
                            snapshotMetaData_ != com.emptyovo.raft.proto.RaftProto.SnapshotMetaData
                                    .getDefaultInstance()) {
                        snapshotMetaData_ =
                                com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.newBuilder(snapshotMetaData_)
                                        .mergeFrom(value).buildPartial();
                    } else {
                        snapshotMetaData_ = value;
                    }
                    onChanged();
                } else {
                    snapshotMetaDataBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public Builder clearSnapshotMetaData() {
                if (snapshotMetaDataBuilder_ == null) {
                    snapshotMetaData_ = com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.getDefaultInstance();
                    onChanged();
                } else {
                    snapshotMetaDataBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder getSnapshotMetaDataBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getSnapshotMetaDataFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.SnapshotMetaDataOrBuilder getSnapshotMetaDataOrBuilder() {
                if (snapshotMetaDataBuilder_ != null) {
                    return snapshotMetaDataBuilder_.getMessageOrBuilder();
                } else {
                    return snapshotMetaData_;
                }
            }
            /**
             * <code>optional .raft.SnapshotMetaData snapshot_meta_data = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.SnapshotMetaData, com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder, com.emptyovo.raft.proto.RaftProto.SnapshotMetaDataOrBuilder> getSnapshotMetaDataFieldBuilder() {
                if (snapshotMetaDataBuilder_ == null) {
                    snapshotMetaDataBuilder_ =
                            new com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.SnapshotMetaData, com.emptyovo.raft.proto.RaftProto.SnapshotMetaData.Builder, com.emptyovo.raft.proto.RaftProto.SnapshotMetaDataOrBuilder>(
                                    snapshotMetaData_,
                                    getParentForChildren(),
                                    isClean());
                    snapshotMetaData_ = null;
                }
                return snapshotMetaDataBuilder_;
            }

            // optional string file_name = 4;
            private Object fileName_ = "";
            /**
             * <code>optional string file_name = 4;</code>
             */
            public boolean hasFileName() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <code>optional string file_name = 4;</code>
             */
            public String getFileName() {
                Object ref = fileName_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    fileName_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string file_name = 4;</code>
             */
            public com.google.protobuf.ByteString getFileNameBytes() {
                Object ref = fileName_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    fileName_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string file_name = 4;</code>
             */
            public Builder setFileName(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                fileName_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string file_name = 4;</code>
             */
            public Builder clearFileName() {
                bitField0_ = (bitField0_ & ~0x00000008);
                fileName_ = getDefaultInstance().getFileName();
                onChanged();
                return this;
            }
            /**
             * <code>optional string file_name = 4;</code>
             */
            public Builder setFileNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                fileName_ = value;
                onChanged();
                return this;
            }

            // optional uint64 offset = 5;
            private long offset_;
            /**
             * <code>optional uint64 offset = 5;</code>
             */
            public boolean hasOffset() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <code>optional uint64 offset = 5;</code>
             */
            public long getOffset() {
                return offset_;
            }
            /**
             * <code>optional uint64 offset = 5;</code>
             */
            public Builder setOffset(long value) {
                bitField0_ |= 0x00000010;
                offset_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 offset = 5;</code>
             */
            public Builder clearOffset() {
                bitField0_ = (bitField0_ & ~0x00000010);
                offset_ = 0L;
                onChanged();
                return this;
            }

            // optional bytes data = 6;
            private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>optional bytes data = 6;</code>
             */
            public boolean hasData() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <code>optional bytes data = 6;</code>
             */
            public com.google.protobuf.ByteString getData() {
                return data_;
            }
            /**
             * <code>optional bytes data = 6;</code>
             */
            public Builder setData(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000020;
                data_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bytes data = 6;</code>
             */
            public Builder clearData() {
                bitField0_ = (bitField0_ & ~0x00000020);
                data_ = getDefaultInstance().getData();
                onChanged();
                return this;
            }

            // optional bool is_first = 7;
            private boolean isFirst_;
            /**
             * <code>optional bool is_first = 7;</code>
             */
            public boolean hasIsFirst() {
                return ((bitField0_ & 0x00000040) == 0x00000040);
            }
            /**
             * <code>optional bool is_first = 7;</code>
             */
            public boolean getIsFirst() {
                return isFirst_;
            }
            /**
             * <code>optional bool is_first = 7;</code>
             */
            public Builder setIsFirst(boolean value) {
                bitField0_ |= 0x00000040;
                isFirst_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool is_first = 7;</code>
             */
            public Builder clearIsFirst() {
                bitField0_ = (bitField0_ & ~0x00000040);
                isFirst_ = false;
                onChanged();
                return this;
            }

            // optional bool is_last = 8;
            private boolean isLast_;
            /**
             * <code>optional bool is_last = 8;</code>
             */
            public boolean hasIsLast() {
                return ((bitField0_ & 0x00000080) == 0x00000080);
            }
            /**
             * <code>optional bool is_last = 8;</code>
             */
            public boolean getIsLast() {
                return isLast_;
            }
            /**
             * <code>optional bool is_last = 8;</code>
             */
            public Builder setIsLast(boolean value) {
                bitField0_ |= 0x00000080;
                isLast_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool is_last = 8;</code>
             */
            public Builder clearIsLast() {
                bitField0_ = (bitField0_ & ~0x00000080);
                isLast_ = false;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.InstallSnapshotRequest)
        }

        static {
            defaultInstance = new InstallSnapshotRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.InstallSnapshotRequest)
    }

    public interface InstallSnapshotResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional .raft.ResCode res_code = 1;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        boolean hasResCode();
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ResCode getResCode();

        // optional uint64 term = 2;
        /**
         * <code>optional uint64 term = 2;</code>
         */
        boolean hasTerm();
        /**
         * <code>optional uint64 term = 2;</code>
         */
        long getTerm();
    }
    /**
     * Protobuf type {@code raft.InstallSnapshotResponse}
     */
    public static final class InstallSnapshotResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                InstallSnapshotResponseOrBuilder {

        // Use InstallSnapshotResponse.newBuilder() to construct.
        private InstallSnapshotResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private InstallSnapshotResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final InstallSnapshotResponse defaultInstance;
        public static InstallSnapshotResponse getDefaultInstance() {
            return defaultInstance;
        }

        public InstallSnapshotResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private InstallSnapshotResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            com.emptyovo.raft.proto.RaftProto.ResCode value =
                                    com.emptyovo.raft.proto.RaftProto.ResCode.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                resCode_ = value;
                            }
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            term_ = input.readUInt64();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse.class,
                            com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<InstallSnapshotResponse> PARSER =
                new com.google.protobuf.AbstractParser<InstallSnapshotResponse>() {

                    public InstallSnapshotResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new InstallSnapshotResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<InstallSnapshotResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional .raft.ResCode res_code = 1;
        public static final int RES_CODE_FIELD_NUMBER = 1;
        private com.emptyovo.raft.proto.RaftProto.ResCode resCode_;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
            return resCode_;
        }

        // optional uint64 term = 2;
        public static final int TERM_FIELD_NUMBER = 2;
        private long term_;
        /**
         * <code>optional uint64 term = 2;</code>
         */
        public boolean hasTerm() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional uint64 term = 2;</code>
         */
        public long getTerm() {
            return term_;
        }

        private void initFields() {
            resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            term_ = 0L;
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt64(2, term_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt64Size(2, term_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.InstallSnapshotResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse.class,
                                com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                bitField0_ = (bitField0_ & ~0x00000001);
                term_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_InstallSnapshotResponse_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse build() {
                com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse buildPartial() {
                com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse result =
                        new com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.resCode_ = resCode_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.term_ = term_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse other) {
                if (other == com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse.getDefaultInstance())
                    return this;
                if (other.hasResCode()) {
                    setResCode(other.getResCode());
                }
                if (other.hasTerm()) {
                    setTerm(other.getTerm());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (com.emptyovo.raft.proto.RaftProto.InstallSnapshotResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional .raft.ResCode res_code = 1;
            private com.emptyovo.raft.proto.RaftProto.ResCode resCode_ =
                    com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public boolean hasResCode() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
                return resCode_;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder setResCode(com.emptyovo.raft.proto.RaftProto.ResCode value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                resCode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder clearResCode() {
                bitField0_ = (bitField0_ & ~0x00000001);
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                onChanged();
                return this;
            }

            // optional uint64 term = 2;
            private long term_;
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public boolean hasTerm() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public long getTerm() {
                return term_;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public Builder setTerm(long value) {
                bitField0_ |= 0x00000002;
                term_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional uint64 term = 2;</code>
             */
            public Builder clearTerm() {
                bitField0_ = (bitField0_ & ~0x00000002);
                term_ = 0L;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.InstallSnapshotResponse)
        }

        static {
            defaultInstance = new InstallSnapshotResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.InstallSnapshotResponse)
    }

    public interface GetLeaderRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code raft.GetLeaderRequest}
     */
    public static final class GetLeaderRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                GetLeaderRequestOrBuilder {

        // Use GetLeaderRequest.newBuilder() to construct.
        private GetLeaderRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private GetLeaderRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final GetLeaderRequest defaultInstance;
        public static GetLeaderRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetLeaderRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private GetLeaderRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.GetLeaderRequest.class,
                            com.emptyovo.raft.proto.RaftProto.GetLeaderRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<GetLeaderRequest> PARSER =
                new com.google.protobuf.AbstractParser<GetLeaderRequest>() {

                    public GetLeaderRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GetLeaderRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<GetLeaderRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.GetLeaderRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.GetLeaderRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.GetLeaderRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.GetLeaderRequest.class,
                                com.emptyovo.raft.proto.RaftProto.GetLeaderRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.GetLeaderRequest.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderRequest_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.GetLeaderRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.GetLeaderRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.GetLeaderRequest build() {
                com.emptyovo.raft.proto.RaftProto.GetLeaderRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.GetLeaderRequest buildPartial() {
                com.emptyovo.raft.proto.RaftProto.GetLeaderRequest result =
                        new com.emptyovo.raft.proto.RaftProto.GetLeaderRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.GetLeaderRequest) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.GetLeaderRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.GetLeaderRequest other) {
                if (other == com.emptyovo.raft.proto.RaftProto.GetLeaderRequest.getDefaultInstance())
                    return this;
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.GetLeaderRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.GetLeaderRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.GetLeaderRequest)
        }

        static {
            defaultInstance = new GetLeaderRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.GetLeaderRequest)
    }

    public interface GetLeaderResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional .raft.ResCode res_code = 1;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        boolean hasResCode();
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ResCode getResCode();

        // optional string res_msg = 2;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        boolean hasResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        String getResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        com.google.protobuf.ByteString getResMsgBytes();

        // optional .raft.Endpoint leader = 3;
        /**
         * <code>optional .raft.Endpoint leader = 3;</code>
         */
        boolean hasLeader();
        /**
         * <code>optional .raft.Endpoint leader = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Endpoint getLeader();
        /**
         * <code>optional .raft.Endpoint leader = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder getLeaderOrBuilder();
    }
    /**
     * Protobuf type {@code raft.GetLeaderResponse}
     */
    public static final class GetLeaderResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                GetLeaderResponseOrBuilder {

        // Use GetLeaderResponse.newBuilder() to construct.
        private GetLeaderResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private GetLeaderResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final GetLeaderResponse defaultInstance;
        public static GetLeaderResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetLeaderResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private GetLeaderResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            com.emptyovo.raft.proto.RaftProto.ResCode value =
                                    com.emptyovo.raft.proto.RaftProto.ResCode.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                resCode_ = value;
                            }
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            resMsg_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            com.emptyovo.raft.proto.RaftProto.Endpoint.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = leader_.toBuilder();
                            }
                            leader_ = input.readMessage(com.emptyovo.raft.proto.RaftProto.Endpoint.PARSER,
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(leader_);
                                leader_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.GetLeaderResponse.class,
                            com.emptyovo.raft.proto.RaftProto.GetLeaderResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<GetLeaderResponse> PARSER =
                new com.google.protobuf.AbstractParser<GetLeaderResponse>() {

                    public GetLeaderResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GetLeaderResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<GetLeaderResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional .raft.ResCode res_code = 1;
        public static final int RES_CODE_FIELD_NUMBER = 1;
        private com.emptyovo.raft.proto.RaftProto.ResCode resCode_;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
            return resCode_;
        }

        // optional string res_msg = 2;
        public static final int RES_MSG_FIELD_NUMBER = 2;
        private Object resMsg_;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public boolean hasResMsg() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public String getResMsg() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    resMsg_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public com.google.protobuf.ByteString getResMsgBytes() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                resMsg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional .raft.Endpoint leader = 3;
        public static final int LEADER_FIELD_NUMBER = 3;
        private com.emptyovo.raft.proto.RaftProto.Endpoint leader_;
        /**
         * <code>optional .raft.Endpoint leader = 3;</code>
         */
        public boolean hasLeader() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.Endpoint leader = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Endpoint getLeader() {
            return leader_;
        }
        /**
         * <code>optional .raft.Endpoint leader = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder getLeaderOrBuilder() {
            return leader_;
        }

        private void initFields() {
            resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            resMsg_ = "";
            leader_ = com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getResMsgBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(3, leader_);
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getResMsgBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, leader_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.GetLeaderResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.GetLeaderResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.GetLeaderResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.GetLeaderResponse.class,
                                com.emptyovo.raft.proto.RaftProto.GetLeaderResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.GetLeaderResponse.newBuilder()
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
                    getLeaderFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                bitField0_ = (bitField0_ & ~0x00000001);
                resMsg_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                if (leaderBuilder_ == null) {
                    leader_ = com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
                } else {
                    leaderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetLeaderResponse_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.GetLeaderResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.GetLeaderResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.GetLeaderResponse build() {
                com.emptyovo.raft.proto.RaftProto.GetLeaderResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.GetLeaderResponse buildPartial() {
                com.emptyovo.raft.proto.RaftProto.GetLeaderResponse result =
                        new com.emptyovo.raft.proto.RaftProto.GetLeaderResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.resCode_ = resCode_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.resMsg_ = resMsg_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (leaderBuilder_ == null) {
                    result.leader_ = leader_;
                } else {
                    result.leader_ = leaderBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.GetLeaderResponse) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.GetLeaderResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.GetLeaderResponse other) {
                if (other == com.emptyovo.raft.proto.RaftProto.GetLeaderResponse.getDefaultInstance())
                    return this;
                if (other.hasResCode()) {
                    setResCode(other.getResCode());
                }
                if (other.hasResMsg()) {
                    bitField0_ |= 0x00000002;
                    resMsg_ = other.resMsg_;
                    onChanged();
                }
                if (other.hasLeader()) {
                    mergeLeader(other.getLeader());
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.GetLeaderResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.GetLeaderResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional .raft.ResCode res_code = 1;
            private com.emptyovo.raft.proto.RaftProto.ResCode resCode_ =
                    com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public boolean hasResCode() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
                return resCode_;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder setResCode(com.emptyovo.raft.proto.RaftProto.ResCode value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                resCode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder clearResCode() {
                bitField0_ = (bitField0_ & ~0x00000001);
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                onChanged();
                return this;
            }

            // optional string res_msg = 2;
            private Object resMsg_ = "";
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public boolean hasResMsg() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public String getResMsg() {
                Object ref = resMsg_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    resMsg_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public com.google.protobuf.ByteString getResMsgBytes() {
                Object ref = resMsg_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    resMsg_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsg(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder clearResMsg() {
                bitField0_ = (bitField0_ & ~0x00000002);
                resMsg_ = getDefaultInstance().getResMsg();
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsgBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }

            // optional .raft.Endpoint leader = 3;
            private com.emptyovo.raft.proto.RaftProto.Endpoint leader_ =
                    com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Endpoint, com.emptyovo.raft.proto.RaftProto.Endpoint.Builder, com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder> leaderBuilder_;
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public boolean hasLeader() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Endpoint getLeader() {
                if (leaderBuilder_ == null) {
                    return leader_;
                } else {
                    return leaderBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public Builder setLeader(com.emptyovo.raft.proto.RaftProto.Endpoint value) {
                if (leaderBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    leader_ = value;
                    onChanged();
                } else {
                    leaderBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public Builder setLeader(
                    com.emptyovo.raft.proto.RaftProto.Endpoint.Builder builderForValue) {
                if (leaderBuilder_ == null) {
                    leader_ = builderForValue.build();
                    onChanged();
                } else {
                    leaderBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public Builder mergeLeader(com.emptyovo.raft.proto.RaftProto.Endpoint value) {
                if (leaderBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004) &&
                            leader_ != com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance()) {
                        leader_ =
                                com.emptyovo.raft.proto.RaftProto.Endpoint.newBuilder(leader_).mergeFrom(value)
                                        .buildPartial();
                    } else {
                        leader_ = value;
                    }
                    onChanged();
                } else {
                    leaderBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public Builder clearLeader() {
                if (leaderBuilder_ == null) {
                    leader_ = com.emptyovo.raft.proto.RaftProto.Endpoint.getDefaultInstance();
                    onChanged();
                } else {
                    leaderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Endpoint.Builder getLeaderBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getLeaderFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder getLeaderOrBuilder() {
                if (leaderBuilder_ != null) {
                    return leaderBuilder_.getMessageOrBuilder();
                } else {
                    return leader_;
                }
            }
            /**
             * <code>optional .raft.Endpoint leader = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Endpoint, com.emptyovo.raft.proto.RaftProto.Endpoint.Builder, com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder> getLeaderFieldBuilder() {
                if (leaderBuilder_ == null) {
                    leaderBuilder_ =
                            new com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Endpoint, com.emptyovo.raft.proto.RaftProto.Endpoint.Builder, com.emptyovo.raft.proto.RaftProto.EndpointOrBuilder>(
                                    leader_,
                                    getParentForChildren(),
                                    isClean());
                    leader_ = null;
                }
                return leaderBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.GetLeaderResponse)
        }

        static {
            defaultInstance = new GetLeaderResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.GetLeaderResponse)
    }

    public interface AddPeersRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // repeated .raft.Server servers = 1;
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Server getServers(int index);
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        int getServersCount();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code raft.AddPeersRequest}
     */
    public static final class AddPeersRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                AddPeersRequestOrBuilder {

        // Use AddPeersRequest.newBuilder() to construct.
        private AddPeersRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private AddPeersRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final AddPeersRequest defaultInstance;
        public static AddPeersRequest getDefaultInstance() {
            return defaultInstance;
        }

        public AddPeersRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private AddPeersRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            servers_.add(input.readMessage(com.emptyovo.raft.proto.RaftProto.Server.PARSER,
                                    extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = java.util.Collections.unmodifiableList(servers_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.AddPeersRequest.class,
                            com.emptyovo.raft.proto.RaftProto.AddPeersRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<AddPeersRequest> PARSER =
                new com.google.protobuf.AbstractParser<AddPeersRequest>() {

                    public AddPeersRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new AddPeersRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<AddPeersRequest> getParserForType() {
            return PARSER;
        }

        // repeated .raft.Server servers = 1;
        public static final int SERVERS_FIELD_NUMBER = 1;
        private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_;
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public int getServersCount() {
            return servers_.size();
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
            return servers_.get(index);
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index) {
            return servers_.get(index);
        }

        private void initFields() {
            servers_ = java.util.Collections.emptyList();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < servers_.size(); i++) {
                output.writeMessage(1, servers_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            for (int i = 0; i < servers_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, servers_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.AddPeersRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.AddPeersRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.AddPeersRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.AddPeersRequest.class,
                                com.emptyovo.raft.proto.RaftProto.AddPeersRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.AddPeersRequest.newBuilder()
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
                    getServersFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersRequest_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.AddPeersRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.AddPeersRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.AddPeersRequest build() {
                com.emptyovo.raft.proto.RaftProto.AddPeersRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.AddPeersRequest buildPartial() {
                com.emptyovo.raft.proto.RaftProto.AddPeersRequest result =
                        new com.emptyovo.raft.proto.RaftProto.AddPeersRequest(this);
                int from_bitField0_ = bitField0_;
                if (serversBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        servers_ = java.util.Collections.unmodifiableList(servers_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.servers_ = servers_;
                } else {
                    result.servers_ = serversBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.AddPeersRequest) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.AddPeersRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.AddPeersRequest other) {
                if (other == com.emptyovo.raft.proto.RaftProto.AddPeersRequest.getDefaultInstance())
                    return this;
                if (serversBuilder_ == null) {
                    if (!other.servers_.isEmpty()) {
                        if (servers_.isEmpty()) {
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureServersIsMutable();
                            servers_.addAll(other.servers_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.servers_.isEmpty()) {
                        if (serversBuilder_.isEmpty()) {
                            serversBuilder_.dispose();
                            serversBuilder_ = null;
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            serversBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                                            ? getServersFieldBuilder()
                                            : null;
                        } else {
                            serversBuilder_.addAllMessages(other.servers_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.AddPeersRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.AddPeersRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // repeated .raft.Server servers = 1;
            private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_ =
                    java.util.Collections.emptyList();
            private void ensureServersIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>(servers_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> serversBuilder_;

            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
                if (serversBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(servers_);
                } else {
                    return serversBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public int getServersCount() {
                if (serversBuilder_ == null) {
                    return servers_.size();
                } else {
                    return serversBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.set(index, value);
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(index, value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addAllServers(
                    Iterable<? extends com.emptyovo.raft.proto.RaftProto.Server> values) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    super.addAll(values, servers_);
                    onChanged();
                } else {
                    serversBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder clearServers() {
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder removeServers(int index) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.remove(index);
                    onChanged();
                } else {
                    serversBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder getServersBuilder(
                    int index) {
                return getServersFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                    int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
                if (serversBuilder_ != null) {
                    return serversBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(servers_);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder() {
                return getServersFieldBuilder().addBuilder(
                        com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder(
                    int index) {
                return getServersFieldBuilder().addBuilder(
                        index, com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server.Builder> getServersBuilderList() {
                return getServersFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersFieldBuilder() {
                if (serversBuilder_ == null) {
                    serversBuilder_ =
                            new com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder>(
                                    servers_,
                                    ((bitField0_ & 0x00000001) == 0x00000001),
                                    getParentForChildren(),
                                    isClean());
                    servers_ = null;
                }
                return serversBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.AddPeersRequest)
        }

        static {
            defaultInstance = new AddPeersRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.AddPeersRequest)
    }

    public interface AddPeersResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional .raft.ResCode res_code = 1;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        boolean hasResCode();
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ResCode getResCode();

        // optional string res_msg = 2;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        boolean hasResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        String getResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        com.google.protobuf.ByteString getResMsgBytes();
    }
    /**
     * Protobuf type {@code raft.AddPeersResponse}
     */
    public static final class AddPeersResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                AddPeersResponseOrBuilder {

        // Use AddPeersResponse.newBuilder() to construct.
        private AddPeersResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private AddPeersResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final AddPeersResponse defaultInstance;
        public static AddPeersResponse getDefaultInstance() {
            return defaultInstance;
        }

        public AddPeersResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private AddPeersResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            com.emptyovo.raft.proto.RaftProto.ResCode value =
                                    com.emptyovo.raft.proto.RaftProto.ResCode.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                resCode_ = value;
                            }
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            resMsg_ = input.readBytes();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.AddPeersResponse.class,
                            com.emptyovo.raft.proto.RaftProto.AddPeersResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<AddPeersResponse> PARSER =
                new com.google.protobuf.AbstractParser<AddPeersResponse>() {

                    public AddPeersResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new AddPeersResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<AddPeersResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional .raft.ResCode res_code = 1;
        public static final int RES_CODE_FIELD_NUMBER = 1;
        private com.emptyovo.raft.proto.RaftProto.ResCode resCode_;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
            return resCode_;
        }

        // optional string res_msg = 2;
        public static final int RES_MSG_FIELD_NUMBER = 2;
        private Object resMsg_;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public boolean hasResMsg() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public String getResMsg() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    resMsg_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public com.google.protobuf.ByteString getResMsgBytes() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                resMsg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            resMsg_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getResMsgBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getResMsgBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.AddPeersResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.AddPeersResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.AddPeersResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.AddPeersResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.AddPeersResponse.class,
                                com.emptyovo.raft.proto.RaftProto.AddPeersResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.AddPeersResponse.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                bitField0_ = (bitField0_ & ~0x00000001);
                resMsg_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_AddPeersResponse_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.AddPeersResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.AddPeersResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.AddPeersResponse build() {
                com.emptyovo.raft.proto.RaftProto.AddPeersResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.AddPeersResponse buildPartial() {
                com.emptyovo.raft.proto.RaftProto.AddPeersResponse result =
                        new com.emptyovo.raft.proto.RaftProto.AddPeersResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.resCode_ = resCode_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.resMsg_ = resMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.AddPeersResponse) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.AddPeersResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.AddPeersResponse other) {
                if (other == com.emptyovo.raft.proto.RaftProto.AddPeersResponse.getDefaultInstance())
                    return this;
                if (other.hasResCode()) {
                    setResCode(other.getResCode());
                }
                if (other.hasResMsg()) {
                    bitField0_ |= 0x00000002;
                    resMsg_ = other.resMsg_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.AddPeersResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.AddPeersResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional .raft.ResCode res_code = 1;
            private com.emptyovo.raft.proto.RaftProto.ResCode resCode_ =
                    com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public boolean hasResCode() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
                return resCode_;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder setResCode(com.emptyovo.raft.proto.RaftProto.ResCode value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                resCode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder clearResCode() {
                bitField0_ = (bitField0_ & ~0x00000001);
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                onChanged();
                return this;
            }

            // optional string res_msg = 2;
            private Object resMsg_ = "";
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public boolean hasResMsg() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public String getResMsg() {
                Object ref = resMsg_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    resMsg_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public com.google.protobuf.ByteString getResMsgBytes() {
                Object ref = resMsg_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    resMsg_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsg(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder clearResMsg() {
                bitField0_ = (bitField0_ & ~0x00000002);
                resMsg_ = getDefaultInstance().getResMsg();
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsgBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.AddPeersResponse)
        }

        static {
            defaultInstance = new AddPeersResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.AddPeersResponse)
    }

    public interface RemovePeersRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // repeated .raft.Server servers = 1;
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Server getServers(int index);
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        int getServersCount();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList();
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code raft.RemovePeersRequest}
     */
    public static final class RemovePeersRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                RemovePeersRequestOrBuilder {

        // Use RemovePeersRequest.newBuilder() to construct.
        private RemovePeersRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private RemovePeersRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final RemovePeersRequest defaultInstance;
        public static RemovePeersRequest getDefaultInstance() {
            return defaultInstance;
        }

        public RemovePeersRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private RemovePeersRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                                servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            servers_.add(input.readMessage(com.emptyovo.raft.proto.RaftProto.Server.PARSER,
                                    extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = java.util.Collections.unmodifiableList(servers_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.RemovePeersRequest.class,
                            com.emptyovo.raft.proto.RaftProto.RemovePeersRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<RemovePeersRequest> PARSER =
                new com.google.protobuf.AbstractParser<RemovePeersRequest>() {

                    public RemovePeersRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new RemovePeersRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<RemovePeersRequest> getParserForType() {
            return PARSER;
        }

        // repeated .raft.Server servers = 1;
        public static final int SERVERS_FIELD_NUMBER = 1;
        private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_;
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public int getServersCount() {
            return servers_.size();
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
            return servers_.get(index);
        }
        /**
         * <code>repeated .raft.Server servers = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index) {
            return servers_.get(index);
        }

        private void initFields() {
            servers_ = java.util.Collections.emptyList();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            for (int i = 0; i < servers_.size(); i++) {
                output.writeMessage(1, servers_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            for (int i = 0; i < servers_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, servers_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.RemovePeersRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.RemovePeersRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.RemovePeersRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.RemovePeersRequest.class,
                                com.emptyovo.raft.proto.RaftProto.RemovePeersRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.RemovePeersRequest.newBuilder()
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
                    getServersFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersRequest_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.RemovePeersRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.RemovePeersRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.RemovePeersRequest build() {
                com.emptyovo.raft.proto.RaftProto.RemovePeersRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.RemovePeersRequest buildPartial() {
                com.emptyovo.raft.proto.RaftProto.RemovePeersRequest result =
                        new com.emptyovo.raft.proto.RaftProto.RemovePeersRequest(this);
                int from_bitField0_ = bitField0_;
                if (serversBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001)) {
                        servers_ = java.util.Collections.unmodifiableList(servers_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.servers_ = servers_;
                } else {
                    result.servers_ = serversBuilder_.build();
                }
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.RemovePeersRequest) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.RemovePeersRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.RemovePeersRequest other) {
                if (other == com.emptyovo.raft.proto.RaftProto.RemovePeersRequest.getDefaultInstance())
                    return this;
                if (serversBuilder_ == null) {
                    if (!other.servers_.isEmpty()) {
                        if (servers_.isEmpty()) {
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureServersIsMutable();
                            servers_.addAll(other.servers_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.servers_.isEmpty()) {
                        if (serversBuilder_.isEmpty()) {
                            serversBuilder_.dispose();
                            serversBuilder_ = null;
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            serversBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                                            ? getServersFieldBuilder()
                                            : null;
                        } else {
                            serversBuilder_.addAllMessages(other.servers_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.RemovePeersRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.RemovePeersRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // repeated .raft.Server servers = 1;
            private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_ =
                    java.util.Collections.emptyList();
            private void ensureServersIsMutable() {
                if (!((bitField0_ & 0x00000001) == 0x00000001)) {
                    servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>(servers_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> serversBuilder_;

            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
                if (serversBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(servers_);
                } else {
                    return serversBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public int getServersCount() {
                if (serversBuilder_ == null) {
                    return servers_.size();
                } else {
                    return serversBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.set(index, value);
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(index, value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder addAllServers(
                    Iterable<? extends com.emptyovo.raft.proto.RaftProto.Server> values) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    super.addAll(values, servers_);
                    onChanged();
                } else {
                    serversBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder clearServers() {
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public Builder removeServers(int index) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.remove(index);
                    onChanged();
                } else {
                    serversBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder getServersBuilder(
                    int index) {
                return getServersFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                    int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
                if (serversBuilder_ != null) {
                    return serversBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(servers_);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder() {
                return getServersFieldBuilder().addBuilder(
                        com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder(
                    int index) {
                return getServersFieldBuilder().addBuilder(
                        index, com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 1;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server.Builder> getServersBuilderList() {
                return getServersFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersFieldBuilder() {
                if (serversBuilder_ == null) {
                    serversBuilder_ =
                            new com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder>(
                                    servers_,
                                    ((bitField0_ & 0x00000001) == 0x00000001),
                                    getParentForChildren(),
                                    isClean());
                    servers_ = null;
                }
                return serversBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.RemovePeersRequest)
        }

        static {
            defaultInstance = new RemovePeersRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.RemovePeersRequest)
    }

    public interface RemovePeersResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional .raft.ResCode res_code = 1;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        boolean hasResCode();
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ResCode getResCode();

        // optional string res_msg = 2;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        boolean hasResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        String getResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        com.google.protobuf.ByteString getResMsgBytes();
    }
    /**
     * Protobuf type {@code raft.RemovePeersResponse}
     */
    public static final class RemovePeersResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                RemovePeersResponseOrBuilder {

        // Use RemovePeersResponse.newBuilder() to construct.
        private RemovePeersResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private RemovePeersResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final RemovePeersResponse defaultInstance;
        public static RemovePeersResponse getDefaultInstance() {
            return defaultInstance;
        }

        public RemovePeersResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private RemovePeersResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            com.emptyovo.raft.proto.RaftProto.ResCode value =
                                    com.emptyovo.raft.proto.RaftProto.ResCode.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                resCode_ = value;
                            }
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            resMsg_ = input.readBytes();
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.RemovePeersResponse.class,
                            com.emptyovo.raft.proto.RaftProto.RemovePeersResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<RemovePeersResponse> PARSER =
                new com.google.protobuf.AbstractParser<RemovePeersResponse>() {

                    public RemovePeersResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new RemovePeersResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<RemovePeersResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional .raft.ResCode res_code = 1;
        public static final int RES_CODE_FIELD_NUMBER = 1;
        private com.emptyovo.raft.proto.RaftProto.ResCode resCode_;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
            return resCode_;
        }

        // optional string res_msg = 2;
        public static final int RES_MSG_FIELD_NUMBER = 2;
        private Object resMsg_;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public boolean hasResMsg() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public String getResMsg() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    resMsg_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public com.google.protobuf.ByteString getResMsgBytes() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                resMsg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            resMsg_ = "";
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getResMsgBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getResMsgBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.RemovePeersResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.RemovePeersResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.RemovePeersResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.RemovePeersResponse.class,
                                com.emptyovo.raft.proto.RaftProto.RemovePeersResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.RemovePeersResponse.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                bitField0_ = (bitField0_ & ~0x00000001);
                resMsg_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_RemovePeersResponse_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.RemovePeersResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.RemovePeersResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.RemovePeersResponse build() {
                com.emptyovo.raft.proto.RaftProto.RemovePeersResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.RemovePeersResponse buildPartial() {
                com.emptyovo.raft.proto.RaftProto.RemovePeersResponse result =
                        new com.emptyovo.raft.proto.RaftProto.RemovePeersResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.resCode_ = resCode_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.resMsg_ = resMsg_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.RemovePeersResponse) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.RemovePeersResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.RemovePeersResponse other) {
                if (other == com.emptyovo.raft.proto.RaftProto.RemovePeersResponse.getDefaultInstance())
                    return this;
                if (other.hasResCode()) {
                    setResCode(other.getResCode());
                }
                if (other.hasResMsg()) {
                    bitField0_ |= 0x00000002;
                    resMsg_ = other.resMsg_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.RemovePeersResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.proto.RaftProto.RemovePeersResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional .raft.ResCode res_code = 1;
            private com.emptyovo.raft.proto.RaftProto.ResCode resCode_ =
                    com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public boolean hasResCode() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
                return resCode_;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder setResCode(com.emptyovo.raft.proto.RaftProto.ResCode value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                resCode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder clearResCode() {
                bitField0_ = (bitField0_ & ~0x00000001);
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                onChanged();
                return this;
            }

            // optional string res_msg = 2;
            private Object resMsg_ = "";
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public boolean hasResMsg() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public String getResMsg() {
                Object ref = resMsg_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    resMsg_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public com.google.protobuf.ByteString getResMsgBytes() {
                Object ref = resMsg_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    resMsg_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsg(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder clearResMsg() {
                bitField0_ = (bitField0_ & ~0x00000002);
                resMsg_ = getDefaultInstance().getResMsg();
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsgBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.RemovePeersResponse)
        }

        static {
            defaultInstance = new RemovePeersResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.RemovePeersResponse)
    }

    public interface GetConfigurationRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {
    }
    /**
     * Protobuf type {@code raft.GetConfigurationRequest}
     */
    public static final class GetConfigurationRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                GetConfigurationRequestOrBuilder {

        // Use GetConfigurationRequest.newBuilder() to construct.
        private GetConfigurationRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private GetConfigurationRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final GetConfigurationRequest defaultInstance;
        public static GetConfigurationRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetConfigurationRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private GetConfigurationRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
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
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest.class,
                            com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<GetConfigurationRequest> PARSER =
                new com.google.protobuf.AbstractParser<GetConfigurationRequest>() {

                    public GetConfigurationRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GetConfigurationRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<GetConfigurationRequest> getParserForType() {
            return PARSER;
        }

        private void initFields() {
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.GetConfigurationRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.GetConfigurationRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest.class,
                                com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest.newBuilder()
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
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationRequest_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest build() {
                com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest buildPartial() {
                com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest result =
                        new com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest(this);
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest other) {
                if (other == com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest.getDefaultInstance())
                    return this;
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (com.emptyovo.raft.proto.RaftProto.GetConfigurationRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            // @@protoc_insertion_point(builder_scope:raft.GetConfigurationRequest)
        }

        static {
            defaultInstance = new GetConfigurationRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.GetConfigurationRequest)
    }

    public interface GetConfigurationResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional .raft.ResCode res_code = 1;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        boolean hasResCode();
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ResCode getResCode();

        // optional string res_msg = 2;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        boolean hasResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        String getResMsg();
        /**
         * <code>optional string res_msg = 2;</code>
         */
        com.google.protobuf.ByteString getResMsgBytes();

        // optional .raft.Server leader = 3;
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        boolean hasLeader();
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Server getLeader();
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getLeaderOrBuilder();

        // repeated .raft.Server servers = 4;
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList();
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        com.emptyovo.raft.proto.RaftProto.Server getServers(int index);
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        int getServersCount();
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList();
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code raft.GetConfigurationResponse}
     */
    public static final class GetConfigurationResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                GetConfigurationResponseOrBuilder {

        // Use GetConfigurationResponse.newBuilder() to construct.
        private GetConfigurationResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private GetConfigurationResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final GetConfigurationResponse defaultInstance;
        public static GetConfigurationResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetConfigurationResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private GetConfigurationResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            int rawValue = input.readEnum();
                            com.emptyovo.raft.proto.RaftProto.ResCode value =
                                    com.emptyovo.raft.proto.RaftProto.ResCode.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(1, rawValue);
                            } else {
                                bitField0_ |= 0x00000001;
                                resCode_ = value;
                            }
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            resMsg_ = input.readBytes();
                            break;
                        }
                        case 26: {
                            com.emptyovo.raft.proto.RaftProto.Server.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                                subBuilder = leader_.toBuilder();
                            }
                            leader_ = input.readMessage(com.emptyovo.raft.proto.RaftProto.Server.PARSER,
                                    extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(leader_);
                                leader_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000004;
                            break;
                        }
                        case 34: {
                            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                                servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>();
                                mutable_bitField0_ |= 0x00000008;
                            }
                            servers_.add(input.readMessage(com.emptyovo.raft.proto.RaftProto.Server.PARSER,
                                    extensionRegistry));
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
                if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                    servers_ = java.util.Collections.unmodifiableList(servers_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse.class,
                            com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<GetConfigurationResponse> PARSER =
                new com.google.protobuf.AbstractParser<GetConfigurationResponse>() {

                    public GetConfigurationResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GetConfigurationResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<GetConfigurationResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional .raft.ResCode res_code = 1;
        public static final int RES_CODE_FIELD_NUMBER = 1;
        private com.emptyovo.raft.proto.RaftProto.ResCode resCode_;
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public boolean hasResCode() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional .raft.ResCode res_code = 1;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
            return resCode_;
        }

        // optional string res_msg = 2;
        public static final int RES_MSG_FIELD_NUMBER = 2;
        private Object resMsg_;
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public boolean hasResMsg() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public String getResMsg() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    resMsg_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string res_msg = 2;</code>
         */
        public com.google.protobuf.ByteString getResMsgBytes() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                resMsg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional .raft.Server leader = 3;
        public static final int LEADER_FIELD_NUMBER = 3;
        private com.emptyovo.raft.proto.RaftProto.Server leader_;
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public boolean hasLeader() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Server getLeader() {
            return leader_;
        }
        /**
         * <code>optional .raft.Server leader = 3;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getLeaderOrBuilder() {
            return leader_;
        }

        // repeated .raft.Server servers = 4;
        public static final int SERVERS_FIELD_NUMBER = 4;
        private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_;
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
            return servers_;
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public int getServersCount() {
            return servers_.size();
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
            return servers_.get(index);
        }
        /**
         * <code>repeated .raft.Server servers = 4;</code>
         */
        public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                int index) {
            return servers_.get(index);
        }

        private void initFields() {
            resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            resMsg_ = "";
            leader_ = com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance();
            servers_ = java.util.Collections.emptyList();
        }
        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1)
                return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeEnum(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getResMsgBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeMessage(3, leader_);
            }
            for (int i = 0; i < servers_.size(); i++) {
                output.writeMessage(4, servers_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;
        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1)
                return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, resCode_.getNumber());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getResMsgBytes());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, leader_);
            }
            for (int i = 0; i < servers_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, servers_.get(i));
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        protected Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }
        public Builder newBuilderForType() {
            return newBuilder();
        }
        public static Builder newBuilder(com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse prototype) {
            return newBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return newBuilder(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code raft.GetConfigurationResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.proto.RaftProto.GetConfigurationResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse.class,
                                com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse.newBuilder()
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
                    getLeaderFieldBuilder();
                    getServersFieldBuilder();
                }
            }
            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                bitField0_ = (bitField0_ & ~0x00000001);
                resMsg_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                if (leaderBuilder_ == null) {
                    leader_ = com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance();
                } else {
                    leaderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.proto.RaftProto.internal_static_raft_GetConfigurationResponse_descriptor;
            }

            public com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse build() {
                com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse buildPartial() {
                com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse result =
                        new com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.resCode_ = resCode_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.resMsg_ = resMsg_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                if (leaderBuilder_ == null) {
                    result.leader_ = leader_;
                } else {
                    result.leader_ = leaderBuilder_.build();
                }
                if (serversBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) == 0x00000008)) {
                        servers_ = java.util.Collections.unmodifiableList(servers_);
                        bitField0_ = (bitField0_ & ~0x00000008);
                    }
                    result.servers_ = servers_;
                } else {
                    result.servers_ = serversBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse) {
                    return mergeFrom((com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse other) {
                if (other == com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse.getDefaultInstance())
                    return this;
                if (other.hasResCode()) {
                    setResCode(other.getResCode());
                }
                if (other.hasResMsg()) {
                    bitField0_ |= 0x00000002;
                    resMsg_ = other.resMsg_;
                    onChanged();
                }
                if (other.hasLeader()) {
                    mergeLeader(other.getLeader());
                }
                if (serversBuilder_ == null) {
                    if (!other.servers_.isEmpty()) {
                        if (servers_.isEmpty()) {
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                        } else {
                            ensureServersIsMutable();
                            servers_.addAll(other.servers_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.servers_.isEmpty()) {
                        if (serversBuilder_.isEmpty()) {
                            serversBuilder_.dispose();
                            serversBuilder_ = null;
                            servers_ = other.servers_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                            serversBuilder_ =
                                    com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                                            ? getServersFieldBuilder()
                                            : null;
                        } else {
                            serversBuilder_.addAllMessages(other.servers_);
                        }
                    }
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (com.emptyovo.raft.proto.RaftProto.GetConfigurationResponse) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional .raft.ResCode res_code = 1;
            private com.emptyovo.raft.proto.RaftProto.ResCode resCode_ =
                    com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public boolean hasResCode() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ResCode getResCode() {
                return resCode_;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder setResCode(com.emptyovo.raft.proto.RaftProto.ResCode value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                resCode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional .raft.ResCode res_code = 1;</code>
             */
            public Builder clearResCode() {
                bitField0_ = (bitField0_ & ~0x00000001);
                resCode_ = com.emptyovo.raft.proto.RaftProto.ResCode.RES_CODE_SUCCESS;
                onChanged();
                return this;
            }

            // optional string res_msg = 2;
            private Object resMsg_ = "";
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public boolean hasResMsg() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public String getResMsg() {
                Object ref = resMsg_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    resMsg_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public com.google.protobuf.ByteString getResMsgBytes() {
                Object ref = resMsg_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    resMsg_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsg(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder clearResMsg() {
                bitField0_ = (bitField0_ & ~0x00000002);
                resMsg_ = getDefaultInstance().getResMsg();
                onChanged();
                return this;
            }
            /**
             * <code>optional string res_msg = 2;</code>
             */
            public Builder setResMsgBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                resMsg_ = value;
                onChanged();
                return this;
            }

            // optional .raft.Server leader = 3;
            private com.emptyovo.raft.proto.RaftProto.Server leader_ =
                    com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance();
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> leaderBuilder_;
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public boolean hasLeader() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server getLeader() {
                if (leaderBuilder_ == null) {
                    return leader_;
                } else {
                    return leaderBuilder_.getMessage();
                }
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public Builder setLeader(com.emptyovo.raft.proto.RaftProto.Server value) {
                if (leaderBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    leader_ = value;
                    onChanged();
                } else {
                    leaderBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public Builder setLeader(
                    com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (leaderBuilder_ == null) {
                    leader_ = builderForValue.build();
                    onChanged();
                } else {
                    leaderBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public Builder mergeLeader(com.emptyovo.raft.proto.RaftProto.Server value) {
                if (leaderBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004) &&
                            leader_ != com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance()) {
                        leader_ =
                                com.emptyovo.raft.proto.RaftProto.Server.newBuilder(leader_).mergeFrom(value)
                                        .buildPartial();
                    } else {
                        leader_ = value;
                    }
                    onChanged();
                } else {
                    leaderBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000004;
                return this;
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public Builder clearLeader() {
                if (leaderBuilder_ == null) {
                    leader_ = com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance();
                    onChanged();
                } else {
                    leaderBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder getLeaderBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getLeaderFieldBuilder().getBuilder();
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getLeaderOrBuilder() {
                if (leaderBuilder_ != null) {
                    return leaderBuilder_.getMessageOrBuilder();
                } else {
                    return leader_;
                }
            }
            /**
             * <code>optional .raft.Server leader = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getLeaderFieldBuilder() {
                if (leaderBuilder_ == null) {
                    leaderBuilder_ =
                            new com.google.protobuf.SingleFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder>(
                                    leader_,
                                    getParentForChildren(),
                                    isClean());
                    leader_ = null;
                }
                return leaderBuilder_;
            }

            // repeated .raft.Server servers = 4;
            private java.util.List<com.emptyovo.raft.proto.RaftProto.Server> servers_ =
                    java.util.Collections.emptyList();
            private void ensureServersIsMutable() {
                if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                    servers_ = new java.util.ArrayList<com.emptyovo.raft.proto.RaftProto.Server>(servers_);
                    bitField0_ |= 0x00000008;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> serversBuilder_;

            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server> getServersList() {
                if (serversBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(servers_);
                } else {
                    return serversBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public int getServersCount() {
                if (serversBuilder_ == null) {
                    return servers_.size();
                } else {
                    return serversBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server getServers(int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.set(index, value);
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder setServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder addServers(com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server value) {
                if (serversBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureServersIsMutable();
                    servers_.add(index, value);
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder addServers(
                    com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder addServers(
                    int index, com.emptyovo.raft.proto.RaftProto.Server.Builder builderForValue) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    serversBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder addAllServers(
                    Iterable<? extends com.emptyovo.raft.proto.RaftProto.Server> values) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    super.addAll(values, servers_);
                    onChanged();
                } else {
                    serversBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder clearServers() {
                if (serversBuilder_ == null) {
                    servers_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                    onChanged();
                } else {
                    serversBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public Builder removeServers(int index) {
                if (serversBuilder_ == null) {
                    ensureServersIsMutable();
                    servers_.remove(index);
                    onChanged();
                } else {
                    serversBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder getServersBuilder(
                    int index) {
                return getServersFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.ServerOrBuilder getServersOrBuilder(
                    int index) {
                if (serversBuilder_ == null) {
                    return servers_.get(index);
                } else {
                    return serversBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public java.util.List<? extends com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersOrBuilderList() {
                if (serversBuilder_ != null) {
                    return serversBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(servers_);
                }
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder() {
                return getServersFieldBuilder().addBuilder(
                        com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public com.emptyovo.raft.proto.RaftProto.Server.Builder addServersBuilder(
                    int index) {
                return getServersFieldBuilder().addBuilder(
                        index, com.emptyovo.raft.proto.RaftProto.Server.getDefaultInstance());
            }
            /**
             * <code>repeated .raft.Server servers = 4;</code>
             */
            public java.util.List<com.emptyovo.raft.proto.RaftProto.Server.Builder> getServersBuilderList() {
                return getServersFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder> getServersFieldBuilder() {
                if (serversBuilder_ == null) {
                    serversBuilder_ =
                            new com.google.protobuf.RepeatedFieldBuilder<com.emptyovo.raft.proto.RaftProto.Server, com.emptyovo.raft.proto.RaftProto.Server.Builder, com.emptyovo.raft.proto.RaftProto.ServerOrBuilder>(
                                    servers_,
                                    ((bitField0_ & 0x00000008) == 0x00000008),
                                    getParentForChildren(),
                                    isClean());
                    servers_ = null;
                }
                return serversBuilder_;
            }

            // @@protoc_insertion_point(builder_scope:raft.GetConfigurationResponse)
        }

        static {
            defaultInstance = new GetConfigurationResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:raft.GetConfigurationResponse)
    }

    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_Endpoint_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_Endpoint_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_Server_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_Server_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_Configuration_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_Configuration_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_LogMetaData_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_LogMetaData_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_SnapshotMetaData_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_SnapshotMetaData_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_LogEntry_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_LogEntry_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_VoteRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_VoteRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_VoteResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_VoteResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_AppendEntriesRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_AppendEntriesRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_AppendEntriesResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_AppendEntriesResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_InstallSnapshotRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_InstallSnapshotRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_InstallSnapshotResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_InstallSnapshotResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_GetLeaderRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_GetLeaderRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_GetLeaderResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_GetLeaderResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_AddPeersRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_AddPeersRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_AddPeersResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_AddPeersResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_RemovePeersRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_RemovePeersRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_RemovePeersResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_RemovePeersResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_GetConfigurationRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_GetConfigurationRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_raft_GetConfigurationResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_raft_GetConfigurationResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        String[] descriptorData = {
                "\n+com.emptyovo/raft/proto/raft." +
                        "proto\022\004raft\"&\n\010Endpoint\022\014\n\004host\030\001 \001(\t\022\014\n" +
                        "\004port\030\002 \001(\r\"=\n\006Server\022\021\n\tserver_id\030\001 \001(\r" +
                        "\022 \n\010endpoint\030\002 \001(\0132\016.raft.Endpoint\".\n\rCo" +
                        "nfiguration\022\035\n\007servers\030\001 \003(\0132\014.raft.Serv" +
                        "er\"e\n\013LogMetaData\022\024\n\014current_term\030\001 \001(\004\022" +
                        "\021\n\tvoted_for\030\002 \001(\r\022\027\n\017first_log_index\030\003 " +
                        "\001(\004\022\024\n\014commit_index\030\004 \001(\004\"w\n\020SnapshotMet" +
                        "aData\022\033\n\023last_included_index\030\001 \001(\004\022\032\n\022la" +
                        "st_included_term\030\002 \001(\004\022*\n\rconfiguration\030",
                "\003 \001(\0132\023.raft.Configuration\"T\n\010LogEntry\022\014" +
                        "\n\004term\030\001 \001(\004\022\r\n\005index\030\002 \001(\004\022\035\n\004type\030\003 \001("
                        +
                        "\0162\017.raft.EntryType\022\014\n\004data\030\004 \001(\014\"]\n\013Vote" +
                        "Request\022\021\n\tserver_id\030\001 \001(\r\022\014\n\004term\030\002 \001(\004" +
                        "\022\025\n\rlast_log_term\030\003 \001(\004\022\026\n\016last_log_inde" +
                        "x\030\004 \001(\004\"-\n\014VoteResponse\022\014\n\004term\030\001 \001(\004\022\017\n" +
                        "\007granted\030\002 \001(\010\"\235\001\n\024AppendEntriesRequest\022" +
                        "\021\n\tserver_id\030\001 \001(\r\022\014\n\004term\030\002 \001(\004\022\026\n\016prev" +
                        "_log_index\030\003 \001(\004\022\025\n\rprev_log_term\030\004 \001(\004\022" +
                        "\024\n\014commit_index\030\005 \001(\004\022\037\n\007entries\030\006 \003(\0132\016",
                ".raft.LogEntry\"^\n\025AppendEntriesResponse\022" +
                        "\037\n\010res_code\030\001 \001(\0162\r.raft.ResCode\022\014\n\004term" +
                        "\030\002 \001(\004\022\026\n\016last_log_index\030\003 \001(\004\"\301\001\n\026Insta" +
                        "llSnapshotRequest\022\021\n\tserver_id\030\001 \001(\r\022\014\n\004" +
                        "term\030\002 \001(\004\0222\n\022snapshot_meta_data\030\003 \001(\0132\026" +
                        ".raft.SnapshotMetaData\022\021\n\tfile_name\030\004 \001(" +
                        "\t\022\016\n\006offset\030\005 \001(\004\022\014\n\004data\030\006 \001(\014\022\020\n\010is_fi"
                        +
                        "rst\030\007 \001(\010\022\017\n\007is_last\030\010 \001(\010\"H\n\027InstallSna" +
                        "pshotResponse\022\037\n\010res_code\030\001 \001(\0162\r.raft.R" +
                        "esCode\022\014\n\004term\030\002 \001(\004\"\022\n\020GetLeaderRequest",
                "\"e\n\021GetLeaderResponse\022\037\n\010res_code\030\001 \001(\0162" +
                        "\r.raft.ResCode\022\017\n\007res_msg\030\002 \001(\t\022\036\n\006leade" +
                        "r\030\003 \001(\0132\016.raft.Endpoint\"0\n\017AddPeersReque" +
                        "st\022\035\n\007servers\030\001 \003(\0132\014.raft.Server\"D\n\020Add" +
                        "PeersResponse\022\037\n\010res_code\030\001 \001(\0162\r.raft.R" +
                        "esCode\022\017\n\007res_msg\030\002 \001(\t\"3\n\022RemovePeersRe" +
                        "quest\022\035\n\007servers\030\001 \003(\0132\014.raft.Server\"G\n\023" +
                        "RemovePeersResponse\022\037\n\010res_code\030\001 \001(\0162\r." +
                        "raft.ResCode\022\017\n\007res_msg\030\002 \001(\t\"\031\n\027GetConf" +
                        "igurationRequest\"\211\001\n\030GetConfigurationRes",
                "ponse\022\037\n\010res_code\030\001 \001(\0162\r.raft.ResCode\022\017" +
                        "\n\007res_msg\030\002 \001(\t\022\034\n\006leader\030\003 \001(\0132\014.raft.S" +
                        "erver\022\035\n\007servers\030\004 \003(\0132\014.raft.Server*K\n\007" +
                        "ResCode\022\024\n\020RES_CODE_SUCCESS\020\000\022\021\n\rRES_COD" +
                        "E_FAIL\020\001\022\027\n\023RES_CODE_NOT_LEADER\020\002*>\n\tEnt" +
                        "ryType\022\023\n\017ENTRY_TYPE_DATA\020\000\022\034\n\030ENTRY_TYP" +
                        "E_CONFIGURATION\020\001B-\n com.github.wenweihu" +
                        "86.raft.protoB\tRaftProto"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {

                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_raft_Endpoint_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_raft_Endpoint_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_Endpoint_descriptor,
                                        new String[]{"Host", "Port",});
                        internal_static_raft_Server_descriptor =
                                getDescriptor().getMessageTypes().get(1);
                        internal_static_raft_Server_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_Server_descriptor,
                                        new String[]{"ServerId", "Endpoint",});
                        internal_static_raft_Configuration_descriptor =
                                getDescriptor().getMessageTypes().get(2);
                        internal_static_raft_Configuration_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_Configuration_descriptor,
                                        new String[]{"Servers",});
                        internal_static_raft_LogMetaData_descriptor =
                                getDescriptor().getMessageTypes().get(3);
                        internal_static_raft_LogMetaData_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_LogMetaData_descriptor,
                                        new String[]{"CurrentTerm", "VotedFor", "FirstLogIndex", "CommitIndex",});
                        internal_static_raft_SnapshotMetaData_descriptor =
                                getDescriptor().getMessageTypes().get(4);
                        internal_static_raft_SnapshotMetaData_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_SnapshotMetaData_descriptor,
                                        new String[]{"LastIncludedIndex", "LastIncludedTerm", "Configuration",});
                        internal_static_raft_LogEntry_descriptor =
                                getDescriptor().getMessageTypes().get(5);
                        internal_static_raft_LogEntry_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_LogEntry_descriptor,
                                        new String[]{"Term", "Index", "Type", "Data",});
                        internal_static_raft_VoteRequest_descriptor =
                                getDescriptor().getMessageTypes().get(6);
                        internal_static_raft_VoteRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_VoteRequest_descriptor,
                                        new String[]{"ServerId", "Term", "LastLogTerm", "LastLogIndex",});
                        internal_static_raft_VoteResponse_descriptor =
                                getDescriptor().getMessageTypes().get(7);
                        internal_static_raft_VoteResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_VoteResponse_descriptor,
                                        new String[]{"Term", "Granted",});
                        internal_static_raft_AppendEntriesRequest_descriptor =
                                getDescriptor().getMessageTypes().get(8);
                        internal_static_raft_AppendEntriesRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_AppendEntriesRequest_descriptor,
                                        new String[]{"ServerId", "Term", "PrevLogIndex", "PrevLogTerm", "CommitIndex",
                                                "Entries",});
                        internal_static_raft_AppendEntriesResponse_descriptor =
                                getDescriptor().getMessageTypes().get(9);
                        internal_static_raft_AppendEntriesResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_AppendEntriesResponse_descriptor,
                                        new String[]{"ResCode", "Term", "LastLogIndex",});
                        internal_static_raft_InstallSnapshotRequest_descriptor =
                                getDescriptor().getMessageTypes().get(10);
                        internal_static_raft_InstallSnapshotRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_InstallSnapshotRequest_descriptor,
                                        new String[]{"ServerId", "Term", "SnapshotMetaData", "FileName", "Offset",
                                                "Data", "IsFirst", "IsLast",});
                        internal_static_raft_InstallSnapshotResponse_descriptor =
                                getDescriptor().getMessageTypes().get(11);
                        internal_static_raft_InstallSnapshotResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_InstallSnapshotResponse_descriptor,
                                        new String[]{"ResCode", "Term",});
                        internal_static_raft_GetLeaderRequest_descriptor =
                                getDescriptor().getMessageTypes().get(12);
                        internal_static_raft_GetLeaderRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_GetLeaderRequest_descriptor,
                                        new String[]{});
                        internal_static_raft_GetLeaderResponse_descriptor =
                                getDescriptor().getMessageTypes().get(13);
                        internal_static_raft_GetLeaderResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_GetLeaderResponse_descriptor,
                                        new String[]{"ResCode", "ResMsg", "Leader",});
                        internal_static_raft_AddPeersRequest_descriptor =
                                getDescriptor().getMessageTypes().get(14);
                        internal_static_raft_AddPeersRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_AddPeersRequest_descriptor,
                                        new String[]{"Servers",});
                        internal_static_raft_AddPeersResponse_descriptor =
                                getDescriptor().getMessageTypes().get(15);
                        internal_static_raft_AddPeersResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_AddPeersResponse_descriptor,
                                        new String[]{"ResCode", "ResMsg",});
                        internal_static_raft_RemovePeersRequest_descriptor =
                                getDescriptor().getMessageTypes().get(16);
                        internal_static_raft_RemovePeersRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_RemovePeersRequest_descriptor,
                                        new String[]{"Servers",});
                        internal_static_raft_RemovePeersResponse_descriptor =
                                getDescriptor().getMessageTypes().get(17);
                        internal_static_raft_RemovePeersResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_RemovePeersResponse_descriptor,
                                        new String[]{"ResCode", "ResMsg",});
                        internal_static_raft_GetConfigurationRequest_descriptor =
                                getDescriptor().getMessageTypes().get(18);
                        internal_static_raft_GetConfigurationRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_GetConfigurationRequest_descriptor,
                                        new String[]{});
                        internal_static_raft_GetConfigurationResponse_descriptor =
                                getDescriptor().getMessageTypes().get(19);
                        internal_static_raft_GetConfigurationResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_raft_GetConfigurationResponse_descriptor,
                                        new String[]{"ResCode", "ResMsg", "Leader", "Servers",});
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}
