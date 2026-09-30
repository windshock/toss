package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetInvestmentHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getPBRpcProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda84 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetInvestmentHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda84(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetInvestmentHomeEditViewModel assetInvestmentHomeEditViewModel) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetInvestmentHomeEditViewModel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        onWarmupCompleted = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, this.f$1, (getPBRpcProxy.onWarmupCompleted) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, this.f$1, (getPBRpcProxy.onWarmupCompleted) obj);
        int i3 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        obj2.hashCode();
        throw null;
    }
}
