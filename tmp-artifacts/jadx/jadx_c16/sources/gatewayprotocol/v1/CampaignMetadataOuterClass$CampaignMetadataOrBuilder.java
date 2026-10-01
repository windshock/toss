package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface CampaignMetadataOuterClass$CampaignMetadataOrBuilder extends MessageLiteOrBuilder {
    int getAdDataRefreshDelayMs();

    CampaignMetadataOuterClass.CampaignAsset getAssetsToCache(int i);

    int getAssetsToCacheCount();

    List<CampaignMetadataOuterClass.CampaignAsset> getAssetsToCacheList();

    ByteString getCampaignStateData();

    int getCampaignStateDataVersion();

    int getTtlSeconds();
}
