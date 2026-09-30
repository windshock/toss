package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.CampaignMetadataOuterClass$CampaignMetadata;
import gatewayprotocol.v1.ErrorOuterClass$Error;
import gatewayprotocol.v1.WebviewConfiguration$WebViewConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AdResponseOuterClass$AdResponse extends GeneratedMessageLite<AdResponseOuterClass$AdResponse, Builder> implements AdResponseOuterClass$AdResponseOrBuilder {
    public static final int AD_DATA_FIELD_NUMBER = 6;
    public static final int AD_DATA_REFRESH_TOKEN_FIELD_NUMBER = 5;
    public static final int AD_DATA_VERSION_FIELD_NUMBER = 7;
    public static final int CAMPAIGN_METADATA_FIELD_NUMBER = 9;
    private static final AdResponseOuterClass$AdResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 8;
    public static final int IMPRESSION_CONFIGURATION_FIELD_NUMBER = 2;
    public static final int IMPRESSION_CONFIGURATION_VERSION_FIELD_NUMBER = 3;
    private static volatile Parser<AdResponseOuterClass$AdResponse> PARSER = null;
    public static final int TRACKING_TOKEN_FIELD_NUMBER = 1;
    public static final int WEBVIEW_CONFIGURATION_FIELD_NUMBER = 4;
    private ByteString adDataRefreshToken_;
    private int adDataVersion_;
    private ByteString adData_;
    private int bitField0_;
    private CampaignMetadataOuterClass$CampaignMetadata campaignMetadata_;
    private ErrorOuterClass$Error error_;
    private int impressionConfigurationVersion_;
    private ByteString impressionConfiguration_;
    private ByteString trackingToken_;
    private WebviewConfiguration$WebViewConfiguration webviewConfiguration_;

    private AdResponseOuterClass$AdResponse() {
        ByteString byteString = ByteString.EMPTY;
        this.trackingToken_ = byteString;
        this.impressionConfiguration_ = byteString;
        this.adDataRefreshToken_ = byteString;
        this.adData_ = byteString;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public ByteString getTrackingToken() {
        return this.trackingToken_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackingToken(ByteString byteString) {
        this.trackingToken_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackingToken() {
        this.trackingToken_ = getDefaultInstance().getTrackingToken();
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public ByteString getImpressionConfiguration() {
        return this.impressionConfiguration_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionConfiguration(ByteString byteString) {
        this.impressionConfiguration_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressionConfiguration() {
        this.impressionConfiguration_ = getDefaultInstance().getImpressionConfiguration();
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public int getImpressionConfigurationVersion() {
        return this.impressionConfigurationVersion_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionConfigurationVersion(int i) {
        this.impressionConfigurationVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressionConfigurationVersion() {
        this.impressionConfigurationVersion_ = 0;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public boolean hasWebviewConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public WebviewConfiguration$WebViewConfiguration getWebviewConfiguration() {
        WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration = this.webviewConfiguration_;
        return webviewConfiguration$WebViewConfiguration == null ? WebviewConfiguration$WebViewConfiguration.getDefaultInstance() : webviewConfiguration$WebViewConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewConfiguration(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
        this.webviewConfiguration_ = webviewConfiguration$WebViewConfiguration;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWebviewConfiguration(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
        WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration2 = this.webviewConfiguration_;
        if (webviewConfiguration$WebViewConfiguration2 != null && webviewConfiguration$WebViewConfiguration2 != WebviewConfiguration$WebViewConfiguration.getDefaultInstance()) {
            this.webviewConfiguration_ = (WebviewConfiguration$WebViewConfiguration) WebviewConfiguration$WebViewConfiguration.newBuilder(this.webviewConfiguration_).mergeFrom(webviewConfiguration$WebViewConfiguration).buildPartial();
        } else {
            this.webviewConfiguration_ = webviewConfiguration$WebViewConfiguration;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewConfiguration() {
        this.webviewConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public ByteString getAdDataRefreshToken() {
        return this.adDataRefreshToken_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDataRefreshToken(ByteString byteString) {
        this.adDataRefreshToken_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDataRefreshToken() {
        this.adDataRefreshToken_ = getDefaultInstance().getAdDataRefreshToken();
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public ByteString getAdData() {
        return this.adData_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdData(ByteString byteString) {
        this.adData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdData() {
        this.adData_ = getDefaultInstance().getAdData();
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public int getAdDataVersion() {
        return this.adDataVersion_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdDataVersion(int i) {
        this.adDataVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdDataVersion() {
        this.adDataVersion_ = 0;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public boolean hasError() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public ErrorOuterClass$Error getError() {
        ErrorOuterClass$Error errorOuterClass$Error = this.error_;
        return errorOuterClass$Error == null ? ErrorOuterClass$Error.getDefaultInstance() : errorOuterClass$Error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setError(ErrorOuterClass$Error errorOuterClass$Error) {
        this.error_ = errorOuterClass$Error;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeError(ErrorOuterClass$Error errorOuterClass$Error) {
        ErrorOuterClass$Error errorOuterClass$Error2 = this.error_;
        if (errorOuterClass$Error2 != null && errorOuterClass$Error2 != ErrorOuterClass$Error.getDefaultInstance()) {
            this.error_ = (ErrorOuterClass$Error) ErrorOuterClass$Error.newBuilder(this.error_).mergeFrom(errorOuterClass$Error).buildPartial();
        } else {
            this.error_ = errorOuterClass$Error;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearError() {
        this.error_ = null;
        this.bitField0_ &= -3;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public boolean hasCampaignMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
    public CampaignMetadataOuterClass$CampaignMetadata getCampaignMetadata() {
        CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata = this.campaignMetadata_;
        return campaignMetadataOuterClass$CampaignMetadata == null ? CampaignMetadataOuterClass$CampaignMetadata.getDefaultInstance() : campaignMetadataOuterClass$CampaignMetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignMetadata(CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata) {
        this.campaignMetadata_ = campaignMetadataOuterClass$CampaignMetadata;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCampaignMetadata(CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata) {
        CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata2 = this.campaignMetadata_;
        if (campaignMetadataOuterClass$CampaignMetadata2 != null && campaignMetadataOuterClass$CampaignMetadata2 != CampaignMetadataOuterClass$CampaignMetadata.getDefaultInstance()) {
            this.campaignMetadata_ = (CampaignMetadataOuterClass$CampaignMetadata) CampaignMetadataOuterClass$CampaignMetadata.newBuilder(this.campaignMetadata_).mergeFrom(campaignMetadataOuterClass$CampaignMetadata).buildPartial();
        } else {
            this.campaignMetadata_ = campaignMetadataOuterClass$CampaignMetadata;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignMetadata() {
        this.campaignMetadata_ = null;
        this.bitField0_ &= -5;
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(InputStream inputStream) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdResponseOuterClass$AdResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AdResponseOuterClass$AdResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdResponseOuterClass$AdResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(AdResponseOuterClass$AdResponse adResponseOuterClass$AdResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(adResponseOuterClass$AdResponse);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<AdResponseOuterClass$AdResponse, Builder> implements AdResponseOuterClass$AdResponseOrBuilder {
        private Builder() {
            super(AdResponseOuterClass$AdResponse.DEFAULT_INSTANCE);
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getTrackingToken() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getTrackingToken();
        }

        public Builder setTrackingToken(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setTrackingToken(byteString);
            return this;
        }

        public Builder clearTrackingToken() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearTrackingToken();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getImpressionConfiguration() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getImpressionConfiguration();
        }

        public Builder setImpressionConfiguration(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setImpressionConfiguration(byteString);
            return this;
        }

        public Builder clearImpressionConfiguration() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearImpressionConfiguration();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public int getImpressionConfigurationVersion() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getImpressionConfigurationVersion();
        }

        public Builder setImpressionConfigurationVersion(int i) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setImpressionConfigurationVersion(i);
            return this;
        }

        public Builder clearImpressionConfigurationVersion() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearImpressionConfigurationVersion();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public boolean hasWebviewConfiguration() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).hasWebviewConfiguration();
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public WebviewConfiguration$WebViewConfiguration getWebviewConfiguration() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getWebviewConfiguration();
        }

        public Builder setWebviewConfiguration(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setWebviewConfiguration(webviewConfiguration$WebViewConfiguration);
            return this;
        }

        public Builder setWebviewConfiguration(WebviewConfiguration$WebViewConfiguration.Builder builder) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setWebviewConfiguration((WebviewConfiguration$WebViewConfiguration) builder.build());
            return this;
        }

        public Builder mergeWebviewConfiguration(WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).mergeWebviewConfiguration(webviewConfiguration$WebViewConfiguration);
            return this;
        }

        public Builder clearWebviewConfiguration() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearWebviewConfiguration();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getAdDataRefreshToken() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getAdDataRefreshToken();
        }

        public Builder setAdDataRefreshToken(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setAdDataRefreshToken(byteString);
            return this;
        }

        public Builder clearAdDataRefreshToken() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearAdDataRefreshToken();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ByteString getAdData() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getAdData();
        }

        public Builder setAdData(ByteString byteString) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setAdData(byteString);
            return this;
        }

        public Builder clearAdData() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearAdData();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public int getAdDataVersion() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getAdDataVersion();
        }

        public Builder setAdDataVersion(int i) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setAdDataVersion(i);
            return this;
        }

        public Builder clearAdDataVersion() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearAdDataVersion();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public boolean hasError() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).hasError();
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public ErrorOuterClass$Error getError() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getError();
        }

        public Builder setError(ErrorOuterClass$Error errorOuterClass$Error) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setError(errorOuterClass$Error);
            return this;
        }

        public Builder setError(ErrorOuterClass$Error.Builder builder) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setError((ErrorOuterClass$Error) builder.build());
            return this;
        }

        public Builder mergeError(ErrorOuterClass$Error errorOuterClass$Error) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).mergeError(errorOuterClass$Error);
            return this;
        }

        public Builder clearError() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearError();
            return this;
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public boolean hasCampaignMetadata() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).hasCampaignMetadata();
        }

        @Override // gatewayprotocol.v1.AdResponseOuterClass$AdResponseOrBuilder
        public CampaignMetadataOuterClass$CampaignMetadata getCampaignMetadata() {
            return ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).getCampaignMetadata();
        }

        public Builder setCampaignMetadata(CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setCampaignMetadata(campaignMetadataOuterClass$CampaignMetadata);
            return this;
        }

        public Builder setCampaignMetadata(CampaignMetadataOuterClass$CampaignMetadata.Builder builder) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).setCampaignMetadata((CampaignMetadataOuterClass$CampaignMetadata) builder.build());
            return this;
        }

        public Builder mergeCampaignMetadata(CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata) {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).mergeCampaignMetadata(campaignMetadataOuterClass$CampaignMetadata);
            return this;
        }

        public Builder clearCampaignMetadata() {
            copyOnWrite();
            ((AdResponseOuterClass$AdResponse) ((GeneratedMessageLite.Builder) this).instance).clearCampaignMetadata();
            return this;
        }
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (AdResponseOuterClass.4.IAuthTabCallback[methodToInvoke.ordinal()]) {
            case 1:
                return new AdResponseOuterClass$AdResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0004\u0004ဉ\u0000\u0005\n\u0006\n\u0007\u0004\bဉ\u0001\tဉ\u0002", new Object[]{"bitField0_", "trackingToken_", "impressionConfiguration_", "impressionConfigurationVersion_", "webviewConfiguration_", "adDataRefreshToken_", "adData_", "adDataVersion_", "error_", "campaignMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AdResponseOuterClass$AdResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AdResponseOuterClass$AdResponse.class) {
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
        AdResponseOuterClass$AdResponse adResponseOuterClass$AdResponse = new AdResponseOuterClass$AdResponse();
        DEFAULT_INSTANCE = adResponseOuterClass$AdResponse;
        GeneratedMessageLite.registerDefaultInstance(AdResponseOuterClass$AdResponse.class, adResponseOuterClass$AdResponse);
    }

    public static AdResponseOuterClass$AdResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AdResponseOuterClass$AdResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
