package im.toss.features.home.feature.asset_home.activity;

import im.toss.features.home.feature.asset_home.viewmodel.edit.AssetLoanHomeEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class AssetHomeEditNavActivity$$ExternalSyntheticLambda88 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ AssetLoanHomeEditViewModel f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = AssetHomeEditNavActivity.IAuthTabCallback(this.f$0);
        if (i3 != 0) {
            int i4 = 11 / 0;
        }
        return unitIAuthTabCallback;
    }
}
