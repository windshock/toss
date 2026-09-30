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
public final class NativeConfigurationOuterClass$CachedAssetsConfiguration extends GeneratedMessageLite<NativeConfigurationOuterClass$CachedAssetsConfiguration, Builder> implements NativeConfigurationOuterClass$CachedAssetsConfigurationOrBuilder {
    private static final NativeConfigurationOuterClass$CachedAssetsConfiguration DEFAULT_INSTANCE;
    public static final int MAX_CACHED_ASSET_AGE_MS_FIELD_NUMBER = 1;
    public static final int MAX_CACHED_ASSET_SIZE_MB_FIELD_NUMBER = 2;
    private static volatile Parser<NativeConfigurationOuterClass$CachedAssetsConfiguration> PARSER;
    private long maxCachedAssetAgeMs_;
    private int maxCachedAssetSizeMb_;

    private NativeConfigurationOuterClass$CachedAssetsConfiguration() {
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfigurationOrBuilder
    public long getMaxCachedAssetAgeMs() {
        return this.maxCachedAssetAgeMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxCachedAssetAgeMs(long j) {
        this.maxCachedAssetAgeMs_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxCachedAssetAgeMs() {
        this.maxCachedAssetAgeMs_ = 0L;
    }

    @Override // gatewayprotocol.v1.NativeConfigurationOuterClass$CachedAssetsConfigurationOrBuilder
    public int getMaxCachedAssetSizeMb() {
        return this.maxCachedAssetSizeMb_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxCachedAssetSizeMb(int i) {
        this.maxCachedAssetSizeMb_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxCachedAssetSizeMb() {
        this.maxCachedAssetSizeMb_ = 0;
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NativeConfigurationOuterClass$CachedAssetsConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(nativeConfigurationOuterClass$CachedAssetsConfiguration);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (NativeConfigurationOuterClass.2.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new NativeConfigurationOuterClass$CachedAssetsConfiguration();
            case 2:
                return new Builder((NativeConfigurationOuterClass.2) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"maxCachedAssetAgeMs_", "maxCachedAssetSizeMb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NativeConfigurationOuterClass$CachedAssetsConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (NativeConfigurationOuterClass$CachedAssetsConfiguration.class) {
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
        NativeConfigurationOuterClass$CachedAssetsConfiguration nativeConfigurationOuterClass$CachedAssetsConfiguration = new NativeConfigurationOuterClass$CachedAssetsConfiguration();
        DEFAULT_INSTANCE = nativeConfigurationOuterClass$CachedAssetsConfiguration;
        GeneratedMessageLite.registerDefaultInstance(NativeConfigurationOuterClass$CachedAssetsConfiguration.class, nativeConfigurationOuterClass$CachedAssetsConfiguration);
    }

    public static NativeConfigurationOuterClass$CachedAssetsConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<NativeConfigurationOuterClass$CachedAssetsConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
