package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda32 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetCardHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda32(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetCardHomeEditViewModel assetCardHomeEditViewModel) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetCardHomeEditViewModel;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        if (i3 != 0) {
            return AssetHomeEditNavActivity.onNavigationEvent(assetHomeEditNavActivity, this.f$1);
        }
        AssetHomeEditNavActivity.onNavigationEvent(assetHomeEditNavActivity, this.f$1);
        throw null;
    }
}
