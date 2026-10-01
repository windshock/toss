package im.toss.ads_sdk.ui.v2.view;

import android.view.MotionEvent;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class NativeAdsThumbnailVideoV2View$$ExternalSyntheticLambda7 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ NativeAdsThumbnailVideoV2View f$0;

    public final Object invoke(Object obj) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {this.f$0, (MotionEvent) obj};
            int iOnWarmupCompleted = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            unit = (Unit) NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr, iOnWarmupCompleted, 1877678589, -1877678587, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i3 = 70 / 0;
        } else {
            Object[] objArr2 = {this.f$0, (MotionEvent) obj};
            int iOnWarmupCompleted2 = GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted();
            unit = (Unit) NativeAdsThumbnailVideoV2View.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), objArr2, iOnWarmupCompleted2, 1877678589, -1877678587, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        int i4 = onExtraCallbackWithResult + 67;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }
}
