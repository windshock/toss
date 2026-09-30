package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.getKekid;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda82 implements Function0 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetInvestmentHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda82(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetInvestmentHomeEditViewModel;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        if (i3 == 0) {
            Object[] objArr = {assetHomeEditNavActivity, this.f$1};
            return (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, -467354306, getKekid.onExtraCallback(), getKekid.onExtraCallback(), 467354326);
        }
        Object[] objArr2 = {assetHomeEditNavActivity, this.f$1};
        int i4 = 30 / 0;
        return (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr2, -467354306, getKekid.onExtraCallback(), getKekid.onExtraCallback(), 467354326);
    }
}
