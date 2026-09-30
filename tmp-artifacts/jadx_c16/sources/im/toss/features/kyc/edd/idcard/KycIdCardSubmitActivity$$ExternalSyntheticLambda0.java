package im.toss.features.kyc.edd.idcard;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class KycIdCardSubmitActivity$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ KycIdCardSubmitActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        KycIdCardSubmitActivity kycIdCardSubmitActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 == 0) {
            return KycIdCardSubmitActivity.onWarmupCompleted(kycIdCardSubmitActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        KycIdCardSubmitActivity.onWarmupCompleted(kycIdCardSubmitActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
