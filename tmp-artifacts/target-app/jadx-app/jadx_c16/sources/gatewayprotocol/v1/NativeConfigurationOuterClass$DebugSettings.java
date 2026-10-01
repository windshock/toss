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
public final class NativeConfigurationOuterClass$DebugSettings extends GeneratedMessageLite<NativeConfigurationOuterClass$DebugSettings, Builder> implements NativeConfigurationOuterClass$DebugSettingsOrBuilder {
    public static final int CLEAN_CACHE_FIELD_NUMBER = 3;
    private static final NativeConfigurationOuterClass$DebugSettings DEFAULT_INSTANCE;
    public static final int ENABLE_TRACING_FIELD_NUMBER = 2;
    private static volatile Parser<NativeConfigurationOuterClass$DebugSettings> PARSER = null;
    public static final int WEBVIEW_INSPECTABLE_FIELD_NUMBER = 1;
    private boolean cleanCache_;
    private boolean enableTracing_;
    private boolean webviewInspectable_;

    private NativeConfigurationOuterClass$DebugSettings() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DebugSettingsOrBuilder
    public boolean getWebviewInspectable() {
        return this.webviewInspectable_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewInspectable(boolean z) {
        this.webviewInspectable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewInspectable() {
        this.webviewInspectable_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DebugSettingsOrBuilder
    public boolean getEnableTracing() {
        return this.enableTracing_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableTracing(boolean z) {
        this.enableTracing_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnableTracing() {
        this.enableTracing_ = false;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$DebugSettingsOrBuilder
    public boolean getCleanCache() {
        return this.cleanCache_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCleanCache(boolean z) {
        this.cleanCache_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCleanCache() {
        this.cleanCache_ = false;
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$DebugSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$DebugSettings) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$DebugSettings nativeConfigurationOuterClass$DebugSettings) {
        return DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$DebugSettings);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$DebugSettings();
            case 2:
                return new Builder((NativeConfigurationOuterClass.2) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"webviewInspectable_", "enableTracing_", "cleanCache_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$DebugSettings> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$DebugSettings.class) {
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
        NativeConfigurationOuterClass$DebugSettings nativeConfigurationOuterClass$DebugSettings = new NativeConfigurationOuterClass$DebugSettings();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$DebugSettings;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$DebugSettings.class, nativeConfigurationOuterClass$DebugSettings);
    }

    public static NativeConfigurationOuterClass$DebugSettings getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$DebugSettings> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
