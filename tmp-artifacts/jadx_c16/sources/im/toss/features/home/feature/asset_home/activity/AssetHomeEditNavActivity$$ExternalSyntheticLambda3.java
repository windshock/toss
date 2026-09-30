package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.getPBRpcProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda3(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetDepositHomeEditViewModel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = AssetHomeEditNavActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (getPBRpcProxy.onWarmupCompleted) obj);
        int i4 = onWarmupCompleted + 9;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
