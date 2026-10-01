package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeConfigurationOuterClass$RequestTimeoutPolicy extends GeneratedMessageLite<NativeConfigurationOuterClass$RequestTimeoutPolicy, Builder> implements NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder {
    public static final int CONNECT_TIMEOUT_MS_FIELD_NUMBER = 1;
    private static final NativeConfigurationOuterClass$RequestTimeoutPolicy DEFAULT_INSTANCE;
    public static final int OVERALL_TIMEOUT_MS_FIELD_NUMBER = 4;
    private static volatile Parser<NativeConfigurationOuterClass$RequestTimeoutPolicy> PARSER = null;
    public static final int READ_TIMEOUT_MS_FIELD_NUMBER = 2;
    public static final int WRITE_TIMEOUT_MS_FIELD_NUMBER = 3;
    private int connectTimeoutMs_;
    private int overallTimeoutMs_;
    private int readTimeoutMs_;
    private int writeTimeoutMs_;

    private NativeConfigurationOuterClass$RequestTimeoutPolicy() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
    public int getConnectTimeoutMs() {
        return this.connectTimeoutMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectTimeoutMs(int i) {
        this.connectTimeoutMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectTimeoutMs() {
        this.connectTimeoutMs_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
    public int getReadTimeoutMs() {
        return this.readTimeoutMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTimeoutMs(int i) {
        this.readTimeoutMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTimeoutMs() {
        this.readTimeoutMs_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
    public int getWriteTimeoutMs() {
        return this.writeTimeoutMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWriteTimeoutMs(int i) {
        this.writeTimeoutMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWriteTimeoutMs() {
        this.writeTimeoutMs_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
    public int getOverallTimeoutMs() {
        return this.overallTimeoutMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverallTimeoutMs(int i) {
        this.overallTimeoutMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverallTimeoutMs() {
        this.overallTimeoutMs_ = 0;
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$RequestTimeoutPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$RequestTimeoutPolicy);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NativeConfigurationOuterClass$RequestTimeoutPolicy, Builder> implements NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder {
        private Builder() {
            super(NativeConfigurationOuterClass$RequestTimeoutPolicy.DEFAULT_INSTANCE);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getConnectTimeoutMs() {
            return ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getConnectTimeoutMs();
        }

        public Builder setConnectTimeoutMs(int i) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).setConnectTimeoutMs(i);
            return this;
        }

        public Builder clearConnectTimeoutMs() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).clearConnectTimeoutMs();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getReadTimeoutMs() {
            return ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getReadTimeoutMs();
        }

        public Builder setReadTimeoutMs(int i) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).setReadTimeoutMs(i);
            return this;
        }

        public Builder clearReadTimeoutMs() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).clearReadTimeoutMs();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getWriteTimeoutMs() {
            return ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getWriteTimeoutMs();
        }

        public Builder setWriteTimeoutMs(int i) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).setWriteTimeoutMs(i);
            return this;
        }

        public Builder clearWriteTimeoutMs() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).clearWriteTimeoutMs();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestTimeoutPolicyOrBuilder
        public int getOverallTimeoutMs() {
            return ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).getOverallTimeoutMs();
        }

        public Builder setOverallTimeoutMs(int i) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).setOverallTimeoutMs(i);
            return this;
        }

        public Builder clearOverallTimeoutMs() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestTimeoutPolicy) ((GeneratedMessageLite.Builder) this).instance).clearOverallTimeoutMs();
            return this;
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$RequestTimeoutPolicy();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"connectTimeoutMs_", "readTimeoutMs_", "writeTimeoutMs_", "overallTimeoutMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$RequestTimeoutPolicy> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$RequestTimeoutPolicy.class) {
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
        NativeConfigurationOuterClass$RequestTimeoutPolicy nativeConfigurationOuterClass$RequestTimeoutPolicy = new NativeConfigurationOuterClass$RequestTimeoutPolicy();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$RequestTimeoutPolicy;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$RequestTimeoutPolicy.class, nativeConfigurationOuterClass$RequestTimeoutPolicy);
    }

    public static NativeConfigurationOuterClass$RequestTimeoutPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$RequestTimeoutPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
