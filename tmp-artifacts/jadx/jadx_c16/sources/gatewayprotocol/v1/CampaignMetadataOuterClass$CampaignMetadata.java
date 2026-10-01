package gatewayprotocol.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CampaignMetadataOuterClass$CampaignMetadata extends GeneratedMessageLite<CampaignMetadataOuterClass$CampaignMetadata, Builder> implements CampaignMetadataOuterClass$CampaignMetadataOrBuilder {
    public static final int AD_DATA_REFRESH_DELAY_MS_FIELD_NUMBER = 4;
    public static final int ASSETS_TO_CACHE_FIELD_NUMBER = 3;
    public static final int CAMPAIGN_STATE_DATA_FIELD_NUMBER = 2;
    public static final int CAMPAIGN_STATE_DATA_VERSION_FIELD_NUMBER = 1;
    private static final CampaignMetadataOuterClass$CampaignMetadata DEFAULT_INSTANCE;
    private static volatile Parser<CampaignMetadataOuterClass$CampaignMetadata> PARSER = null;
    public static final int TTL_SECONDS_FIELD_NUMBER = 5;
    private int adDataRefreshDelayMs_;
    private int campaignStateDataVersion_;
    private int ttlSeconds_;
    private ByteString campaignStateData_ = ByteString.EMPTY;
    private Internal.ProtobufList<CampaignMetadataOuterClass.CampaignAsset> assetsToCache_ = GeneratedMessageLite.emptyProtobufList();

    private CampaignMetadataOuterClass$CampaignMetadata() {
    }

    @Override // gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadataOrBuilder
    public int getCampaignStateDataVersion() {
        return this.campaignStateDataVersion_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignStateDataVersion(int i) {
        this.campaignStateDataVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignStateDataVersion() {
        this.campaignStateDataVersion_ = 0;
    }

    @Override // gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadataOrBuilder
    public ByteString getCampaignStateData() {
        return this.campaignStateData_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignStateData(ByteString byteString) {
        this.campaignStateData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignStateData() {
        this.campaignStateData_ = getDefaultInstance().getCampaignStateData();
    }

    @Override // gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadataOrBuilder
    public List<CampaignMetadataOuterClass.CampaignAsset> getAssetsToCacheList() {
        return this.assetsToCache_;
    }

    public List<? extends CampaignMetadataOuterClass.CampaignAssetOrBuilder> getAssetsToCacheOrBuilderList() {
        return this.assetsToCache_;
    }

    @Override // gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadataOrBuilder
    public int getAssetsToCacheCount() {
        return this.assetsToCache_.size();
    }

    @Override // gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadataOrBuilder
    public CampaignMetadataOuterClass.CampaignAsset getAssetsToCache(int i) {
        return (CampaignMetadataOuterClass.CampaignAsset) this.assetsToCache_.get(i);
    }

    public CampaignMetadataOuterClass.CampaignAssetOrBuilder getAssetsToCacheOrBuilder(int i) {
        return (CampaignMetadataOuterClass.CampaignAssetOrBuilder) this.assetsToCache_.get(i);
    }

    private void ensureAssetsToCacheIsMutable() {
        Internal.ProtobufList<CampaignMetadataOuterClass.CampaignAsset> protobufList = this.assetsToCache_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.assetsToCache_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetsToCache(int i, CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
        ensureAssetsToCacheIsMutable();
        this.assetsToCache_.set(i, campaignAsset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssetsToCache(CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
        ensureAssetsToCacheIsMutable();
        this.assetsToCache_.add(campaignAsset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAssetsToCache(int i, CampaignMetadataOuterClass.CampaignAsset campaignAsset) {
        ensureAssetsToCacheIsMutable();
        this.assetsToCache_.add(i, campaignAsset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAssetsToCache(Iterable<? extends CampaignMetadataOuterClass.CampaignAsset> iterable) {
        ensureAssetsToCacheIsMutable();
        AbstractMessageLite.addAll(iterable, this.assetsToCache_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAssetsToCache() {
        this.assetsToCache_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAssetsToCache(int i) {
        ensureAssetsToCacheIsMutable();
        this.assetsToCache_.remove(i);
    }

    @Override // gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadataOrBuilder
    public int getAdDataRefreshDelayMs() {
        return this.adDataRefreshDelayMs_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDataRefreshDelayMs(int i) {
        this.adDataRefreshDelayMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDataRefreshDelayMs() {
        this.adDataRefreshDelayMs_ = 0;
    }

    @Override // gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadataOrBuilder
    public int getTtlSeconds() {
        return this.ttlSeconds_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtlSeconds(int i) {
        this.ttlSeconds_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtlSeconds() {
        this.ttlSeconds_ = 0;
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(InputStream inputStream) throws IOException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CampaignMetadataOuterClass$CampaignMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata) {
        return DEFAULT_INSTANCE.createBuilder(campaignMetadataOuterClass$CampaignMetadata);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (CampaignMetadataOuterClass.3.onExtraCallbackWithResult[methodToInvoke.ordinal()]) {
            case 1:
                return new CampaignMetadataOuterClass$CampaignMetadata();
            case 2:
                return new Builder((CampaignMetadataOuterClass.3) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0002\n\u0003\u001b\u0004\u0004\u0005\u0004", new Object[]{"campaignStateDataVersion_", "campaignStateData_", "assetsToCache_", CampaignMetadataOuterClass.CampaignAsset.class, "adDataRefreshDelayMs_", "ttlSeconds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CampaignMetadataOuterClass$CampaignMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (CampaignMetadataOuterClass$CampaignMetadata.class) {
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
        CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata = new CampaignMetadataOuterClass$CampaignMetadata();
        DEFAULT_INSTANCE = campaignMetadataOuterClass$CampaignMetadata;
        GeneratedMessageLite.registerDefaultInstance(CampaignMetadataOuterClass$CampaignMetadata.class, campaignMetadataOuterClass$CampaignMetadata);
    }

    public static CampaignMetadataOuterClass$CampaignMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<CampaignMetadataOuterClass$CampaignMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
