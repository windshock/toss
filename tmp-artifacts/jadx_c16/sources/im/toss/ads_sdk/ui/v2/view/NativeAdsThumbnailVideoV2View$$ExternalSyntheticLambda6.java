package im.toss.ads_sdk.ui.v2.view;

import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0};
        int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
        if (i3 == 0) {
            return (Unit) NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted2, objArr, iOnWarmupCompleted, 952862823, -952862818, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        throw null;
    }
}
