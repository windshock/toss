package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetCardHomeEditViewModel;
import kotlin.jvm.functions.Function1;
import o.getPBRpcProxy;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda34 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetCardHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda34(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetCardHomeEditViewModel assetCardHomeEditViewModel) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetCardHomeEditViewModel;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AssetHomeEditNavActivity assetHomeEditNavActivity = this.f$0;
        if (i3 == 0) {
            return AssetHomeEditNavActivity.onWarmupCompleted(assetHomeEditNavActivity, this.f$1, (getPBRpcProxy.onWarmupCompleted) obj);
        }
        AssetHomeEditNavActivity.onWarmupCompleted(assetHomeEditNavActivity, this.f$1, (getPBRpcProxy.onWarmupCompleted) obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
