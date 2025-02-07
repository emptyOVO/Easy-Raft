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

package com.emptyovo.raft.example.server.service;

public final class ExampleProto {

    private ExampleProto() {
    }
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }
    public interface SetRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional string key = 1;
        /**
         * <code>optional string key = 1;</code>
         */
        boolean hasKey();
        /**
         * <code>optional string key = 1;</code>
         */
        String getKey();
        /**
         * <code>optional string key = 1;</code>
         */
        com.google.protobuf.ByteString getKeyBytes();

        // optional string value = 2;
        /**
         * <code>optional string value = 2;</code>
         */
        boolean hasValue();
        /**
         * <code>optional string value = 2;</code>
         */
        String getValue();
        /**
         * <code>optional string value = 2;</code>
         */
        com.google.protobuf.ByteString getValueBytes();
    }
    /**
     * Protobuf type {@code service.SetRequest}
     */
    public static final class SetRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                SetRequestOrBuilder {

        // Use SetRequest.newBuilder() to construct.
        private SetRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private SetRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final SetRequest defaultInstance;
        public static SetRequest getDefaultInstance() {
            return defaultInstance;
        }

        public SetRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private SetRequest(
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
                            key_ = input.readBytes();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            value_ = input.readBytes();
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
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.example.server.service.ExampleProto.SetRequest.class,
                            com.emptyovo.raft.example.server.service.ExampleProto.SetRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<SetRequest> PARSER =
                new com.google.protobuf.AbstractParser<SetRequest>() {

                    public SetRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SetRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<SetRequest> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional string key = 1;
        public static final int KEY_FIELD_NUMBER = 1;
        private Object key_;
        /**
         * <code>optional string key = 1;</code>
         */
        public boolean hasKey() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string key = 1;</code>
         */
        public String getKey() {
            Object ref = key_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    key_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string key = 1;</code>
         */
        public com.google.protobuf.ByteString getKeyBytes() {
            Object ref = key_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                key_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        // optional string value = 2;
        public static final int VALUE_FIELD_NUMBER = 2;
        private Object value_;
        /**
         * <code>optional string value = 2;</code>
         */
        public boolean hasValue() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <code>optional string value = 2;</code>
         */
        public String getValue() {
            Object ref = value_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    value_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string value = 2;</code>
         */
        public com.google.protobuf.ByteString getValueBytes() {
            Object ref = value_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                value_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            key_ = "";
            value_ = "";
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
                output.writeBytes(1, getKeyBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getValueBytes());
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
                        .computeBytesSize(1, getKeyBytes());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getValueBytes());
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

        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parseFrom(
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
        public static Builder newBuilder(com.emptyovo.raft.example.server.service.ExampleProto.SetRequest prototype) {
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
         * Protobuf type {@code service.SetRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.example.server.service.ExampleProto.SetRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.example.server.service.ExampleProto.SetRequest.class,
                                com.emptyovo.raft.example.server.service.ExampleProto.SetRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.example.server.service.ExampleProto.SetRequest.newBuilder()
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
                key_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                value_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetRequest_descriptor;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.SetRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.SetRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.SetRequest build() {
                com.emptyovo.raft.example.server.service.ExampleProto.SetRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.SetRequest buildPartial() {
                com.emptyovo.raft.example.server.service.ExampleProto.SetRequest result =
                        new com.emptyovo.raft.example.server.service.ExampleProto.SetRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.key_ = key_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.value_ = value_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.example.server.service.ExampleProto.SetRequest) {
                    return mergeFrom((com.emptyovo.raft.example.server.service.ExampleProto.SetRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.example.server.service.ExampleProto.SetRequest other) {
                if (other == com.emptyovo.raft.example.server.service.ExampleProto.SetRequest.getDefaultInstance())
                    return this;
                if (other.hasKey()) {
                    bitField0_ |= 0x00000001;
                    key_ = other.key_;
                    onChanged();
                }
                if (other.hasValue()) {
                    bitField0_ |= 0x00000002;
                    value_ = other.value_;
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
                com.emptyovo.raft.example.server.service.ExampleProto.SetRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (com.emptyovo.raft.example.server.service.ExampleProto.SetRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional string key = 1;
            private Object key_ = "";
            /**
             * <code>optional string key = 1;</code>
             */
            public boolean hasKey() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public String getKey() {
                Object ref = key_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    key_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public com.google.protobuf.ByteString getKeyBytes() {
                Object ref = key_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    key_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public Builder setKey(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public Builder clearKey() {
                bitField0_ = (bitField0_ & ~0x00000001);
                key_ = getDefaultInstance().getKey();
                onChanged();
                return this;
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public Builder setKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }

            // optional string value = 2;
            private Object value_ = "";
            /**
             * <code>optional string value = 2;</code>
             */
            public boolean hasValue() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <code>optional string value = 2;</code>
             */
            public String getValue() {
                Object ref = value_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    value_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string value = 2;</code>
             */
            public com.google.protobuf.ByteString getValueBytes() {
                Object ref = value_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string value = 2;</code>
             */
            public Builder setValue(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                value_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string value = 2;</code>
             */
            public Builder clearValue() {
                bitField0_ = (bitField0_ & ~0x00000002);
                value_ = getDefaultInstance().getValue();
                onChanged();
                return this;
            }
            /**
             * <code>optional string value = 2;</code>
             */
            public Builder setValueBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                value_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:service.SetRequest)
        }

        static {
            defaultInstance = new SetRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:service.SetRequest)
    }

    public interface SetResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional bool success = 1;
        /**
         * <code>optional bool success = 1;</code>
         */
        boolean hasSuccess();
        /**
         * <code>optional bool success = 1;</code>
         */
        boolean getSuccess();
    }
    /**
     * Protobuf type {@code service.SetResponse}
     */
    public static final class SetResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                SetResponseOrBuilder {

        // Use SetResponse.newBuilder() to construct.
        private SetResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private SetResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final SetResponse defaultInstance;
        public static SetResponse getDefaultInstance() {
            return defaultInstance;
        }

        public SetResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private SetResponse(
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
                            success_ = input.readBool();
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
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.example.server.service.ExampleProto.SetResponse.class,
                            com.emptyovo.raft.example.server.service.ExampleProto.SetResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<SetResponse> PARSER =
                new com.google.protobuf.AbstractParser<SetResponse>() {

                    public SetResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SetResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<SetResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional bool success = 1;
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private boolean success_;
        /**
         * <code>optional bool success = 1;</code>
         */
        public boolean hasSuccess() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional bool success = 1;</code>
         */
        public boolean getSuccess() {
            return success_;
        }

        private void initFields() {
            success_ = false;
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
                output.writeBool(1, success_);
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
                        .computeBoolSize(1, success_);
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

        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parseFrom(
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
        public static Builder newBuilder(com.emptyovo.raft.example.server.service.ExampleProto.SetResponse prototype) {
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
         * Protobuf type {@code service.SetResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.example.server.service.ExampleProto.SetResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.example.server.service.ExampleProto.SetResponse.class,
                                com.emptyovo.raft.example.server.service.ExampleProto.SetResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.example.server.service.ExampleProto.SetResponse.newBuilder()
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
                success_ = false;
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_SetResponse_descriptor;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.SetResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.SetResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.SetResponse build() {
                com.emptyovo.raft.example.server.service.ExampleProto.SetResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.SetResponse buildPartial() {
                com.emptyovo.raft.example.server.service.ExampleProto.SetResponse result =
                        new com.emptyovo.raft.example.server.service.ExampleProto.SetResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.success_ = success_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.example.server.service.ExampleProto.SetResponse) {
                    return mergeFrom((com.emptyovo.raft.example.server.service.ExampleProto.SetResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.example.server.service.ExampleProto.SetResponse other) {
                if (other == com.emptyovo.raft.example.server.service.ExampleProto.SetResponse.getDefaultInstance())
                    return this;
                if (other.hasSuccess()) {
                    setSuccess(other.getSuccess());
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
                com.emptyovo.raft.example.server.service.ExampleProto.SetResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.example.server.service.ExampleProto.SetResponse) e
                            .getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional bool success = 1;
            private boolean success_;
            /**
             * <code>optional bool success = 1;</code>
             */
            public boolean hasSuccess() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional bool success = 1;</code>
             */
            public boolean getSuccess() {
                return success_;
            }
            /**
             * <code>optional bool success = 1;</code>
             */
            public Builder setSuccess(boolean value) {
                bitField0_ |= 0x00000001;
                success_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional bool success = 1;</code>
             */
            public Builder clearSuccess() {
                bitField0_ = (bitField0_ & ~0x00000001);
                success_ = false;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:service.SetResponse)
        }

        static {
            defaultInstance = new SetResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:service.SetResponse)
    }

    public interface GetRequestOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional string key = 1;
        /**
         * <code>optional string key = 1;</code>
         */
        boolean hasKey();
        /**
         * <code>optional string key = 1;</code>
         */
        String getKey();
        /**
         * <code>optional string key = 1;</code>
         */
        com.google.protobuf.ByteString getKeyBytes();
    }
    /**
     * Protobuf type {@code service.GetRequest}
     */
    public static final class GetRequest
            extends
                com.google.protobuf.GeneratedMessage
            implements
                GetRequestOrBuilder {

        // Use GetRequest.newBuilder() to construct.
        private GetRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private GetRequest(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final GetRequest defaultInstance;
        public static GetRequest getDefaultInstance() {
            return defaultInstance;
        }

        public GetRequest getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private GetRequest(
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
                            key_ = input.readBytes();
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
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetRequest_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.example.server.service.ExampleProto.GetRequest.class,
                            com.emptyovo.raft.example.server.service.ExampleProto.GetRequest.Builder.class);
        }

        public static com.google.protobuf.Parser<GetRequest> PARSER =
                new com.google.protobuf.AbstractParser<GetRequest>() {

                    public GetRequest parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GetRequest(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<GetRequest> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional string key = 1;
        public static final int KEY_FIELD_NUMBER = 1;
        private Object key_;
        /**
         * <code>optional string key = 1;</code>
         */
        public boolean hasKey() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string key = 1;</code>
         */
        public String getKey() {
            Object ref = key_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    key_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string key = 1;</code>
         */
        public com.google.protobuf.ByteString getKeyBytes() {
            Object ref = key_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                key_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            key_ = "";
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
                output.writeBytes(1, getKeyBytes());
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
                        .computeBytesSize(1, getKeyBytes());
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

        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parseFrom(
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
        public static Builder newBuilder(com.emptyovo.raft.example.server.service.ExampleProto.GetRequest prototype) {
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
         * Protobuf type {@code service.GetRequest}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.example.server.service.ExampleProto.GetRequestOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetRequest_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.example.server.service.ExampleProto.GetRequest.class,
                                com.emptyovo.raft.example.server.service.ExampleProto.GetRequest.Builder.class);
            }

            // Construct using com.emptyovo.raft.example.server.service.ExampleProto.GetRequest.newBuilder()
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
                key_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetRequest_descriptor;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.GetRequest getDefaultInstanceForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.GetRequest.getDefaultInstance();
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.GetRequest build() {
                com.emptyovo.raft.example.server.service.ExampleProto.GetRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.GetRequest buildPartial() {
                com.emptyovo.raft.example.server.service.ExampleProto.GetRequest result =
                        new com.emptyovo.raft.example.server.service.ExampleProto.GetRequest(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.key_ = key_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.example.server.service.ExampleProto.GetRequest) {
                    return mergeFrom((com.emptyovo.raft.example.server.service.ExampleProto.GetRequest) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.example.server.service.ExampleProto.GetRequest other) {
                if (other == com.emptyovo.raft.example.server.service.ExampleProto.GetRequest.getDefaultInstance())
                    return this;
                if (other.hasKey()) {
                    bitField0_ |= 0x00000001;
                    key_ = other.key_;
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
                com.emptyovo.raft.example.server.service.ExampleProto.GetRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (com.emptyovo.raft.example.server.service.ExampleProto.GetRequest) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional string key = 1;
            private Object key_ = "";
            /**
             * <code>optional string key = 1;</code>
             */
            public boolean hasKey() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public String getKey() {
                Object ref = key_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    key_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public com.google.protobuf.ByteString getKeyBytes() {
                Object ref = key_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    key_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public Builder setKey(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public Builder clearKey() {
                bitField0_ = (bitField0_ & ~0x00000001);
                key_ = getDefaultInstance().getKey();
                onChanged();
                return this;
            }
            /**
             * <code>optional string key = 1;</code>
             */
            public Builder setKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:service.GetRequest)
        }

        static {
            defaultInstance = new GetRequest(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:service.GetRequest)
    }

    public interface GetResponseOrBuilder
            extends
                com.google.protobuf.MessageOrBuilder {

        // optional string value = 1;
        /**
         * <code>optional string value = 1;</code>
         */
        boolean hasValue();
        /**
         * <code>optional string value = 1;</code>
         */
        String getValue();
        /**
         * <code>optional string value = 1;</code>
         */
        com.google.protobuf.ByteString getValueBytes();
    }
    /**
     * Protobuf type {@code service.GetResponse}
     */
    public static final class GetResponse
            extends
                com.google.protobuf.GeneratedMessage
            implements
                GetResponseOrBuilder {

        // Use GetResponse.newBuilder() to construct.
        private GetResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }
        private GetResponse(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final GetResponse defaultInstance;
        public static GetResponse getDefaultInstance() {
            return defaultInstance;
        }

        public GetResponse getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;
        @Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        private GetResponse(
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
                            value_ = input.readBytes();
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
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetResponse_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.emptyovo.raft.example.server.service.ExampleProto.GetResponse.class,
                            com.emptyovo.raft.example.server.service.ExampleProto.GetResponse.Builder.class);
        }

        public static com.google.protobuf.Parser<GetResponse> PARSER =
                new com.google.protobuf.AbstractParser<GetResponse>() {

                    public GetResponse parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GetResponse(input, extensionRegistry);
                    }
                };

        @Override
        public com.google.protobuf.Parser<GetResponse> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional string value = 1;
        public static final int VALUE_FIELD_NUMBER = 1;
        private Object value_;
        /**
         * <code>optional string value = 1;</code>
         */
        public boolean hasValue() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <code>optional string value = 1;</code>
         */
        public String getValue() {
            Object ref = value_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    value_ = s;
                }
                return s;
            }
        }
        /**
         * <code>optional string value = 1;</code>
         */
        public com.google.protobuf.ByteString getValueBytes() {
            Object ref = value_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                value_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            value_ = "";
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
                output.writeBytes(1, getValueBytes());
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
                        .computeBytesSize(1, getValueBytes());
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

        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseDelimitedFrom(
                java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }
        public static com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parseFrom(
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
        public static Builder newBuilder(com.emptyovo.raft.example.server.service.ExampleProto.GetResponse prototype) {
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
         * Protobuf type {@code service.GetResponse}
         */
        public static final class Builder
                extends
                    com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements
                    com.emptyovo.raft.example.server.service.ExampleProto.GetResponseOrBuilder {

            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetResponse_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.emptyovo.raft.example.server.service.ExampleProto.GetResponse.class,
                                com.emptyovo.raft.example.server.service.ExampleProto.GetResponse.Builder.class);
            }

            // Construct using com.emptyovo.raft.example.server.service.ExampleProto.GetResponse.newBuilder()
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
                value_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.internal_static_service_GetResponse_descriptor;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.GetResponse getDefaultInstanceForType() {
                return com.emptyovo.raft.example.server.service.ExampleProto.GetResponse.getDefaultInstance();
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.GetResponse build() {
                com.emptyovo.raft.example.server.service.ExampleProto.GetResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.emptyovo.raft.example.server.service.ExampleProto.GetResponse buildPartial() {
                com.emptyovo.raft.example.server.service.ExampleProto.GetResponse result =
                        new com.emptyovo.raft.example.server.service.ExampleProto.GetResponse(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.value_ = value_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.emptyovo.raft.example.server.service.ExampleProto.GetResponse) {
                    return mergeFrom((com.emptyovo.raft.example.server.service.ExampleProto.GetResponse) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.emptyovo.raft.example.server.service.ExampleProto.GetResponse other) {
                if (other == com.emptyovo.raft.example.server.service.ExampleProto.GetResponse.getDefaultInstance())
                    return this;
                if (other.hasValue()) {
                    bitField0_ |= 0x00000001;
                    value_ = other.value_;
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
                com.emptyovo.raft.example.server.service.ExampleProto.GetResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.emptyovo.raft.example.server.service.ExampleProto.GetResponse) e
                            .getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            // optional string value = 1;
            private Object value_ = "";
            /**
             * <code>optional string value = 1;</code>
             */
            public boolean hasValue() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <code>optional string value = 1;</code>
             */
            public String getValue() {
                Object ref = value_;
                if (!(ref instanceof String)) {
                    String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    value_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>optional string value = 1;</code>
             */
            public com.google.protobuf.ByteString getValueBytes() {
                Object ref = value_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>optional string value = 1;</code>
             */
            public Builder setValue(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                value_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>optional string value = 1;</code>
             */
            public Builder clearValue() {
                bitField0_ = (bitField0_ & ~0x00000001);
                value_ = getDefaultInstance().getValue();
                onChanged();
                return this;
            }
            /**
             * <code>optional string value = 1;</code>
             */
            public Builder setValueBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                value_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:service.GetResponse)
        }

        static {
            defaultInstance = new GetResponse(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:service.GetResponse)
    }

    private static com.google.protobuf.Descriptors.Descriptor internal_static_service_SetRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_service_SetRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_service_SetResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_service_SetResponse_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_service_GetRequest_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_service_GetRequest_fieldAccessorTable;
    private static com.google.protobuf.Descriptors.Descriptor internal_static_service_GetResponse_descriptor;
    private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_service_GetResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }
    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        String[] descriptorData = {
                "\n\rexample.proto\022\007service\"(\n\nSetRequest\022\013" +
                        "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t\"\036\n\013SetRespons" +
                        "e\022\017\n\007success\030\001 \001(\010\"\031\n\nGetRequest\022\013\n\003key\030" +
                        "\001 \001(\t\"\034\n\013GetResponse\022\r\n\005value\030\001 \001(\tBA\n1c" +
                        "om.github.wenweihu86.raft.example.server" +
                        ".serviceB\014ExampleProto"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {

                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_service_SetRequest_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_service_SetRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_service_SetRequest_descriptor,
                                        new String[]{"Key", "Value",});
                        internal_static_service_SetResponse_descriptor =
                                getDescriptor().getMessageTypes().get(1);
                        internal_static_service_SetResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_service_SetResponse_descriptor,
                                        new String[]{"Success",});
                        internal_static_service_GetRequest_descriptor =
                                getDescriptor().getMessageTypes().get(2);
                        internal_static_service_GetRequest_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_service_GetRequest_descriptor,
                                        new String[]{"Key",});
                        internal_static_service_GetResponse_descriptor =
                                getDescriptor().getMessageTypes().get(3);
                        internal_static_service_GetResponse_fieldAccessorTable =
                                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                        internal_static_service_GetResponse_descriptor,
                                        new String[]{"Value",});
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
