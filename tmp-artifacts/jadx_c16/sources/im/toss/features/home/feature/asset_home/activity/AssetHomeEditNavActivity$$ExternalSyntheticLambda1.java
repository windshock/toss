package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetDepositHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetHomeEditNavActivity f$0;
    public final /* synthetic */ AssetDepositHomeEditViewModel f$1;

    public /* synthetic */ AssetHomeEditNavActivity$$ExternalSyntheticLambda1(AssetHomeEditNavActivity assetHomeEditNavActivity, AssetDepositHomeEditViewModel assetDepositHomeEditViewModel) {
        this.f$0 = assetHomeEditNavActivity;
        this.f$1 = assetDepositHomeEditViewModel;
    }

    public final Object invoke() {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 109;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, this.f$1);
            int i3 = 9 / 0;
        } else {
            unitIAuthTabCallback = AssetHomeEditNavActivity.IAuthTabCallback(this.f$0, this.f$1);
        }
        int i4 = IAuthTabCallback + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return unitIAuthTabCallback;
    }
}
