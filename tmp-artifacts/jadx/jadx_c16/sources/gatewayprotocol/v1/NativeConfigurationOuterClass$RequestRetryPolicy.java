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
public final class NativeConfigurationOuterClass$RequestRetryPolicy extends GeneratedMessageLite<NativeConfigurationOuterClass$RequestRetryPolicy, Builder> implements NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder {
    private static final NativeConfigurationOuterClass$RequestRetryPolicy DEFAULT_INSTANCE;
    public static final int MAX_DURATION_FIELD_NUMBER = 1;
    private static volatile Parser<NativeConfigurationOuterClass$RequestRetryPolicy> PARSER = null;
    public static final int RETRY_JITTER_PCT_FIELD_NUMBER = 4;
    public static final int RETRY_MAX_INTERVAL_FIELD_NUMBER = 3;
    public static final int RETRY_SCALING_FACTOR_FIELD_NUMBER = 5;
    public static final int RETRY_WAIT_BASE_FIELD_NUMBER = 2;
    public static final int SHOULD_STORE_LOCALLY_FIELD_NUMBER = 6;
    private int maxDuration_;
    private float retryJitterPct_;
    private int retryMaxInterval_;
    private float retryScalingFactor_;
    private int retryWaitBase_;
    private boolean shouldStoreLocally_;

    private NativeConfigurationOuterClass$RequestRetryPolicy() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
    public int getMaxDuration() {
        return this.maxDuration_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDuration(int i) {
        this.maxDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDuration() {
        this.maxDuration_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
    public int getRetryWaitBase() {
        return this.retryWaitBase_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryWaitBase(int i) {
        this.retryWaitBase_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryWaitBase() {
        this.retryWaitBase_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
    public int getRetryMaxInterval() {
        return this.retryMaxInterval_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryMaxInterval(int i) {
        this.retryMaxInterval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryMaxInterval() {
        this.retryMaxInterval_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
    public float getRetryJitterPct() {
        return this.retryJitterPct_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryJitterPct(float f) {
        this.retryJitterPct_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryJitterPct() {
        this.retryJitterPct_ = 0.0f;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
    public float getRetryScalingFactor() {
        return this.retryScalingFactor_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryScalingFactor(float f) {
        this.retryScalingFactor_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryScalingFactor() {
        this.retryScalingFactor_ = 0.0f;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
    public boolean getShouldStoreLocally() {
        return this.shouldStoreLocally_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShouldStoreLocally(boolean z) {
        this.shouldStoreLocally_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShouldStoreLocally() {
        this.shouldStoreLocally_ = false;
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$RequestRetryPolicy) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$RequestRetryPolicy);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<NativeConfigurationOuterClass$RequestRetryPolicy, Builder> implements NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder {
        private Builder() {
            super(NativeConfigurationOuterClass$RequestRetryPolicy.DEFAULT_INSTANCE);
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public int getMaxDuration() {
            return ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getMaxDuration();
        }

        public Builder setMaxDuration(int i) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).setMaxDuration(i);
            return this;
        }

        public Builder clearMaxDuration() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).clearMaxDuration();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public int getRetryWaitBase() {
            return ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryWaitBase();
        }

        public Builder setRetryWaitBase(int i) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).setRetryWaitBase(i);
            return this;
        }

        public Builder clearRetryWaitBase() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).clearRetryWaitBase();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public int getRetryMaxInterval() {
            return ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryMaxInterval();
        }

        public Builder setRetryMaxInterval(int i) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).setRetryMaxInterval(i);
            return this;
        }

        public Builder clearRetryMaxInterval() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).clearRetryMaxInterval();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public float getRetryJitterPct() {
            return ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryJitterPct();
        }

        public Builder setRetryJitterPct(float f) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).setRetryJitterPct(f);
            return this;
        }

        public Builder clearRetryJitterPct() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).clearRetryJitterPct();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public float getRetryScalingFactor() {
            return ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getRetryScalingFactor();
        }

        public Builder setRetryScalingFactor(float f) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).setRetryScalingFactor(f);
            return this;
        }

        public Builder clearRetryScalingFactor() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).clearRetryScalingFactor();
            return this;
        }

        @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$RequestRetryPolicyOrBuilder
        public boolean getShouldStoreLocally() {
            return ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).getShouldStoreLocally();
        }

        public Builder setShouldStoreLocally(boolean z) {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).setShouldStoreLocally(z);
            return this;
        }

        public Builder clearShouldStoreLocally() {
            copyOnWrite();
            ((NativeConfigurationOuterClass$RequestRetryPolicy) ((GeneratedMessageLite.Builder) this).instance).clearShouldStoreLocally();
            return this;
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$RequestRetryPolicy();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0001\u0005\u0001\u0006\u0007", new Object[]{"maxDuration_", "retryWaitBase_", "retryMaxInterval_", "retryJitterPct_", "retryScalingFactor_", "shouldStoreLocally_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$RequestRetryPolicy> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$RequestRetryPolicy.class) {
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
        NativeConfigurationOuterClass$RequestRetryPolicy nativeConfigurationOuterClass$RequestRetryPolicy = new NativeConfigurationOuterClass$RequestRetryPolicy();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$RequestRetryPolicy;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$RequestRetryPolicy.class, nativeConfigurationOuterClass$RequestRetryPolicy);
    }

    public static NativeConfigurationOuterClass$RequestRetryPolicy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$RequestRetryPolicy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
