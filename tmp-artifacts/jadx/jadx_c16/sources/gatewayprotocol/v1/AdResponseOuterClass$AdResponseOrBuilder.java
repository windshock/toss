package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface AdResponseOuterClass$AdResponseOrBuilder extends MessageLiteOrBuilder {
    ByteString getAdData();

    ByteString getAdDataRefreshToken();

    int getAdDataVersion();

    CampaignMetadataOuterClass$CampaignMetadata getCampaignMetadata();

    ErrorOuterClass$Error getError();

    ByteString getImpressionConfiguration();

    int getImpressionConfigurationVersion();

    ByteString getTrackingToken();

    WebviewConfiguration$WebViewConfiguration getWebviewConfiguration();

    boolean hasCampaignMetadata();

    boolean hasError();

    boolean hasWebviewConfiguration();
}
