package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.GlobalInfoRecorderUtils;
import o.getKekid;
import o.toJSONObject$onWarmupCompleted;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetInvestmentHomeEditViewModel f$1;
    public final /* synthetic */ GlobalInfoRecorderUtils f$2;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda15(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel, GlobalInfoRecorderUtils globalInfoRecorderUtils) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetInvestmentHomeEditViewModel;
        this.f$2 = globalInfoRecorderUtils;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        if (i3 == 0) {
            Object[] objArr = {assetHomeEditNavActivity, this.f$1, this.f$2, (toJSONObject$onWarmupCompleted) obj};
            return (Unit) AssetHomeEditNavActivity.onExtraCallbackWithResult(getKekid.onExtraCallback(), getKekid.onExtraCallback(), objArr, 760095800, getKekid.onExtraCallback(), getKekid.onExtraCallback(), -760095770);
        }
        Object[] objArr2 = {assetHomeEditNavActivity, this.f$1, this.f$2, (toJSONObject$onWarmupCompleted) obj};
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
