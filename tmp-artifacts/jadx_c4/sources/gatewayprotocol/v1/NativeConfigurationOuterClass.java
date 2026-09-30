package gatewayprotocol.v1;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class NativeConfigurationOuterClass {

    public interface RequestPolicyOrBuilder extends MessageLiteOrBuilder {
        RequestRetryPolicy getRetryPolicy();

        RequestTimeoutPolicy getTimeoutPolicy();

        boolean hasRetryPolicy();

        boolean hasTimeoutPolicy();
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    private NativeConfigurationOuterClass() {
    }

    /* renamed from: gatewayprotocol.v1.NativeConfigurationOuterClass$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallbackWithResult[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallbackWithResult[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onExtraCallbackWithResult[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class RequestPolicy extends GeneratedMessageLite<RequestPolicy, Builder> implements RequestPolicyOrBuilder {
        private static final RequestPolicy DEFAULT_INSTANCE;
        private static volatile Parser<RequestPolicy> PARSER = null;
        public static final int RETRY_POLICY_FIELD_NUMBER = 1;
        public static final int TIMEOUT_POLICY_FIELD_NUMBER = 2;
        private int bitField0_;
        private RequestRetryPolicy retryPolicy_;
        private RequestTimeoutPolicy timeoutPolicy_;

        private RequestPolicy() {
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasRetryPolicy() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public RequestRetryPolicy getRetryPolicy() {
            RequestRetryPolicy requestRetryPolicy = this.retryPolicy_;
            return requestRetryPolicy == null ? RequestRetryPolicy.getDefaultInstance() : requestRetryPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
            this.retryPolicy_ = requestRetryPolicy;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
            RequestRetryPolicy requestRetryPolicy2 = this.retryPolicy_;
            if (requestRetryPolicy2 != null && requestRetryPolicy2 != RequestRetryPolicy.getDefaultInstance()) {
                this.retryPolicy_ = RequestRetryPolicy.newBuilder(this.retryPolicy_).mergeFrom(requestRetryPolicy).buildPartial();
            } else {
                this.retryPolicy_ = requestRetryPolicy;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryPolicy() {
            this.retryPolicy_ = null;
            this.bitField0_ &= -2;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public boolean hasTimeoutPolicy() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
        public RequestTimeoutPolicy getTimeoutPolicy() {
            RequestTimeoutPolicy requestTimeoutPolicy = this.timeoutPolicy_;
            return requestTimeoutPolicy == null ? RequestTimeoutPolicy.getDefaultInstance() : requestTimeoutPolicy;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
            this.timeoutPolicy_ = requestTimeoutPolicy;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
            RequestTimeoutPolicy requestTimeoutPolicy2 = this.timeoutPolicy_;
            if (requestTimeoutPolicy2 != null && requestTimeoutPolicy2 != RequestTimeoutPolicy.getDefaultInstance()) {
                this.timeoutPolicy_ = RequestTimeoutPolicy.newBuilder(this.timeoutPolicy_).mergeFrom(requestTimeoutPolicy).buildPartial();
            } else {
                this.timeoutPolicy_ = requestTimeoutPolicy;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeoutPolicy() {
            this.timeoutPolicy_ = null;
            this.bitField0_ &= -3;
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RequestPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(InputStream inputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RequestPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RequestPolicy requestPolicy) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(requestPolicy);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RequestPolicy, Builder> implements RequestPolicyOrBuilder {
            public static int onExtraCallbackWithResult;
            public static int onNavigationEvent;

            /* synthetic */ Builder(AnonymousClass2 anonymousClass2) {
                this();
            }

            private Builder() {
                super(RequestPolicy.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasRetryPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).hasRetryPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public RequestRetryPolicy getRetryPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryPolicy();
            }

            public Builder setRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).setRetryPolicy(requestRetryPolicy);
                return this;
            }

            public Builder setRetryPolicy(RequestRetryPolicy.Builder builder) {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).setRetryPolicy(builder.build());
                return this;
            }

            public Builder mergeRetryPolicy(RequestRetryPolicy requestRetryPolicy) {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).mergeRetryPolicy(requestRetryPolicy);
                return this;
            }

            public Builder clearRetryPolicy() {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).clearRetryPolicy();
                return this;
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public boolean hasTimeoutPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).hasTimeoutPolicy();
            }

            @Override // gatewayprotocol.v1.NativeConfigurationOuterClass.RequestPolicyOrBuilder
            public RequestTimeoutPolicy getTimeoutPolicy() {
                return ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).getTimeoutPolicy();
            }

            public Builder setTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).setTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public Builder setTimeoutPolicy(RequestTimeoutPolicy.Builder builder) {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).setTimeoutPolicy(builder.build());
                return this;
            }

            public Builder mergeTimeoutPolicy(RequestTimeoutPolicy requestTimeoutPolicy) {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).mergeTimeoutPolicy(requestTimeoutPolicy);
                return this;
            }

            public Builder clearTimeoutPolicy() {
                copyOnWrite();
                ((RequestPolicy) ((GeneratedMessageLite.Builder) this).instance).clearTimeoutPolicy();
                return this;
            }

            public static int onWarmupCompleted() {
                int i = onNavigationEvent;
                int i2 = i % 7726480;
                onNavigationEvent = i + 1;
                if (i2 != 0) {
                    return onExtraCallbackWithResult;
                }
                int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
                onExtraCallbackWithResult = i3;
                return i3;
            }
        }

        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
            AnonymousClass2 anonymousClass2 = null;
            switch (AnonymousClass2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestPolicy();
                case 2:
                    return new Builder(anonymousClass2);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "retryPolicy_", "timeoutPolicy_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RequestPolicy> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RequestPolicy.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            RequestPolicy requestPolicy = new RequestPolicy();
            DEFAULT_INSTANCE = requestPolicy;
            GeneratedMessageLite.registerDefaultInstance(RequestPolicy.class, requestPolicy);
        }

        public static RequestPolicy getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RequestPolicy> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
