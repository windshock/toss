package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdResponseOuterClass$AdResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class AdResponseKt$Dsl {
    public static final Companion Companion = new Companion(null);
    private final AdResponseOuterClass$AdResponse.Builder _builder;

    public /* synthetic */ AdResponseKt$Dsl(AdResponseOuterClass$AdResponse.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private AdResponseKt$Dsl(AdResponseOuterClass$AdResponse.Builder builder) {
        this._builder = builder;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ AdResponseKt$Dsl _create(AdResponseOuterClass$AdResponse.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "");
            return new AdResponseKt$Dsl(builder, null);
        }
    }

    public final /* synthetic */ AdResponseOuterClass$AdResponse _build() {
        GeneratedMessageLite generatedMessageLiteBuild = this._builder.build();
        Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "");
        return (AdResponseOuterClass$AdResponse) generatedMessageLiteBuild;
    }

    public final ByteString getTrackingToken() {
        ByteString trackingToken = this._builder.getTrackingToken();
        Intrinsics.checkNotNullExpressionValue(trackingToken, "");
        return trackingToken;
    }

    public final void setTrackingToken(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        this._builder.setTrackingToken(byteString);
    }

    public final void clearTrackingToken() {
        this._builder.clearTrackingToken();
    }

    public final ByteString getImpressionConfiguration() {
        ByteString impressionConfiguration = this._builder.getImpressionConfiguration();
        Intrinsics.checkNotNullExpressionValue(impressionConfiguration, "");
        return impressionConfiguration;
    }

    public final void setImpressionConfiguration(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        this._builder.setImpressionConfiguration(byteString);
    }

    public final void clearImpressionConfiguration() {
        this._builder.clearImpressionConfiguration();
    }

    public final int getImpressionConfigurationVersion() {
        return this._builder.getImpressionConfigurationVersion();
    }

    public final void setImpressionConfigurationVersion(int i) {
        this._builder.setImpressionConfigurationVersion(i);
    }

    public final void clearImpressionConfigurationVersion() {
        this._builder.clearImpressionConfigurationVersion();
    }

    public final WebviewConfiguration$WebViewConfiguration getWebviewConfiguration() {
        WebviewConfiguration$WebViewConfiguration webviewConfiguration = this._builder.getWebviewConfiguration();
        Intrinsics.checkNotNullExpressionValue(webviewConfiguration, "");
        return webviewConfiguration;
    }

    public final void setWebviewConfiguration(@NotNull WebviewConfiguration$WebViewConfiguration webviewConfiguration$WebViewConfiguration) {
        Intrinsics.checkNotNullParameter(webviewConfiguration$WebViewConfiguration, "");
        this._builder.setWebviewConfiguration(webviewConfiguration$WebViewConfiguration);
    }

    public final void clearWebviewConfiguration() {
        this._builder.clearWebviewConfiguration();
    }

    public final boolean hasWebviewConfiguration() {
        return this._builder.hasWebviewConfiguration();
    }

    public final WebviewConfiguration$WebViewConfiguration getWebviewConfigurationOrNull(@NotNull AdResponseKt$Dsl adResponseKt$Dsl) {
        Intrinsics.checkNotNullParameter(adResponseKt$Dsl, "");
        return AdResponseKtKt.getWebviewConfigurationOrNull(adResponseKt$Dsl._builder);
    }

    public final ByteString getAdDataRefreshToken() {
        ByteString adDataRefreshToken = this._builder.getAdDataRefreshToken();
        Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "");
        return adDataRefreshToken;
    }

    public final void setAdDataRefreshToken(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        this._builder.setAdDataRefreshToken(byteString);
    }

    public final void clearAdDataRefreshToken() {
        this._builder.clearAdDataRefreshToken();
    }

    public final ByteString getAdData() {
        ByteString adData = this._builder.getAdData();
        Intrinsics.checkNotNullExpressionValue(adData, "");
        return adData;
    }

    public final void setAdData(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        this._builder.setAdData(byteString);
    }

    public final void clearAdData() {
        this._builder.clearAdData();
    }

    public final int getAdDataVersion() {
        return this._builder.getAdDataVersion();
    }

    public final void setAdDataVersion(int i) {
        this._builder.setAdDataVersion(i);
    }

    public final void clearAdDataVersion() {
        this._builder.clearAdDataVersion();
    }

    public final ErrorOuterClass$Error getError() {
        ErrorOuterClass$Error error = this._builder.getError();
        Intrinsics.checkNotNullExpressionValue(error, "");
        return error;
    }

    public final void setError(@NotNull ErrorOuterClass$Error errorOuterClass$Error) {
        Intrinsics.checkNotNullParameter(errorOuterClass$Error, "");
        this._builder.setError(errorOuterClass$Error);
    }

    public final void clearError() {
        this._builder.clearError();
    }

    public final boolean hasError() {
        return this._builder.hasError();
    }

    public final ErrorOuterClass$Error getErrorOrNull(@NotNull AdResponseKt$Dsl adResponseKt$Dsl) {
        Intrinsics.checkNotNullParameter(adResponseKt$Dsl, "");
        return AdResponseKtKt.getErrorOrNull(adResponseKt$Dsl._builder);
    }

    public final CampaignMetadataOuterClass$CampaignMetadata getCampaignMetadata() {
        CampaignMetadataOuterClass$CampaignMetadata campaignMetadata = this._builder.getCampaignMetadata();
        Intrinsics.checkNotNullExpressionValue(campaignMetadata, "");
        return campaignMetadata;
    }

    public final void setCampaignMetadata(@NotNull CampaignMetadataOuterClass$CampaignMetadata campaignMetadataOuterClass$CampaignMetadata) {
        Intrinsics.checkNotNullParameter(campaignMetadataOuterClass$CampaignMetadata, "");
        this._builder.setCampaignMetadata(campaignMetadataOuterClass$CampaignMetadata);
    }

    public final void clearCampaignMetadata() {
        this._builder.clearCampaignMetadata();
    }

    public final boolean hasCampaignMetadata() {
        return this._builder.hasCampaignMetadata();
    }

    public final CampaignMetadataOuterClass$CampaignMetadata getCampaignMetadataOrNull(@NotNull AdResponseKt$Dsl adResponseKt$Dsl) {
        Intrinsics.checkNotNullParameter(adResponseKt$Dsl, "");
        return AdResponseKtKt.getCampaignMetadataOrNull(adResponseKt$Dsl._builder);
    }
}
