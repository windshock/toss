package im.toss.features.kyc.cdd;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycUserVerificationActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ KycUserVerificationActivity f$0;
    public final /* synthetic */ Lazy f$1;

    public /* synthetic */ KycUserVerificationActivity$$ExternalSyntheticLambda3(KycUserVerificationActivity kycUserVerificationActivity, Lazy lazy) {
        this.f$0 = kycUserVerificationActivity;
        this.f$1 = lazy;
    }

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnNavigationEvent = KycUserVerificationActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 21 / 0;
        } else {
            unitOnNavigationEvent = KycUserVerificationActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
