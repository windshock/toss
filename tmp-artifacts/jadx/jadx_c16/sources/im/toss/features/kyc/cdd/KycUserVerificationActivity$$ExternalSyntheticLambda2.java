package im.toss.features.kyc.cdd;

import kotlin.Lazy;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycUserVerificationActivity$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ KycUserVerificationActivity f$0;
    public final /* synthetic */ Lazy f$1;

    public /* synthetic */ KycUserVerificationActivity$$ExternalSyntheticLambda2(KycUserVerificationActivity kycUserVerificationActivity, Lazy lazy) {
        this.f$0 = kycUserVerificationActivity;
        this.f$1 = lazy;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        KycUserVerificationActivity kycUserVerificationActivity = this.f$0;
        if (i3 == 0) {
            return KycUserVerificationActivity.onExtraCallback(kycUserVerificationActivity, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitOnExtraCallback = KycUserVerificationActivity.onExtraCallback(kycUserVerificationActivity, this.f$1, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 15 / 0;
        return unitOnExtraCallback;
    }
}
