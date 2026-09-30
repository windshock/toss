package im.toss.features.home.feature.asset_home.activity;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda22 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        if (i3 != 0) {
            return AssetHomeEditNavActivity.onNavigationEvent(assetHomeEditNavActivity);
        }
        AssetHomeEditNavActivity.onNavigationEvent(assetHomeEditNavActivity);
        throw null;
    }
}
