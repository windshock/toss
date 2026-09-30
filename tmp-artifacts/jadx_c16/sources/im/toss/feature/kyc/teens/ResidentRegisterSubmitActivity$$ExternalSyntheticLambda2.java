package im.toss.feature.kyc.teens;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ResidentRegisterSubmitActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ ResidentRegisterSubmitActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        ResidentRegisterSubmitActivity residentRegisterSubmitActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 == 0) {
            return ResidentRegisterSubmitActivity.onNavigationEvent(residentRegisterSubmitActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        ResidentRegisterSubmitActivity.onNavigationEvent(residentRegisterSubmitActivity, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
