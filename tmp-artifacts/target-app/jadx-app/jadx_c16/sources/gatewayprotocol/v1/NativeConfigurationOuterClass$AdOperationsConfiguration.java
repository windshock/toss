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
public final class NativeConfigurationOuterClass$AdOperationsConfiguration extends GeneratedMessageLite<NativeConfigurationOuterClass$AdOperationsConfiguration, Builder> implements NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder {
    private static final NativeConfigurationOuterClass$AdOperationsConfiguration DEFAULT_INSTANCE;
    public static final int GET_TOKEN_TIMEOUT_MS_FIELD_NUMBER = 3;
    public static final int LOAD_TIMEOUT_MS_FIELD_NUMBER = 1;
    private static volatile Parser<NativeConfigurationOuterClass$AdOperationsConfiguration> PARSER = null;
    public static final int SHOW_TIMEOUT_MS_FIELD_NUMBER = 2;
    private int getTokenTimeoutMs_;
    private int loadTimeoutMs_;
    private int showTimeoutMs_;

    private NativeConfigurationOuterClass$AdOperationsConfiguration() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
    public int getLoadTimeoutMs() {
        return this.loadTimeoutMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadTimeoutMs(int i) {
        this.loadTimeoutMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadTimeoutMs() {
        this.loadTimeoutMs_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
    public int getShowTimeoutMs() {
        return this.showTimeoutMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowTimeoutMs() {
        this.showTimeoutMs_ = 0;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfigurationOrBuilder
    public int getGetTokenTimeoutMs() {
        return this.getTokenTimeoutMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetTokenTimeoutMs(int i) {
        this.getTokenTimeoutMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGetTokenTimeoutMs() {
        this.getTokenTimeoutMs_ = 0;
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$AdOperationsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$AdOperationsConfiguration);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$AdOperationsConfiguration();
            case 2:
                return new Builder((NativeConfigurationOuterClass.2) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"loadTimeoutMs_", "showTimeoutMs_", "getTokenTimeoutMs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$AdOperationsConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$AdOperationsConfiguration.class) {
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
        NativeConfigurationOuterClass$AdOperationsConfiguration nativeConfigurationOuterClass$AdOperationsConfiguration = new NativeConfigurationOuterClass$AdOperationsConfiguration();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$AdOperationsConfiguration;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$AdOperationsConfiguration.class, nativeConfigurationOuterClass$AdOperationsConfiguration);
    }

    public static NativeConfigurationOuterClass$AdOperationsConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$AdOperationsConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
