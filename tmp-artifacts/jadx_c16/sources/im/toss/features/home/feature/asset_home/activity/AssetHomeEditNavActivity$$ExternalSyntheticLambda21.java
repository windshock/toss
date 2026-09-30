package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda21 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ AssetInvestmentHomeEditViewModel f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel = this.f$0;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.onWarmupCompleted(assetInvestmentHomeEditViewModel);
        }
        AssetHomeEditNavActivity.onWarmupCompleted(assetInvestmentHomeEditViewModel);
        throw null;
    }
}
