package im.toss.features.bank.jointcert.test;

import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda30 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossBankJointCertTestActivity tossBankJointCertTestActivity = this.f$0;
        w5a w5aVar = (w5a) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i3 == 0) {
            return TossBankJointCertTestActivity.IAuthTabCallbackDefault(tossBankJointCertTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        TossBankJointCertTestActivity.IAuthTabCallbackDefault(tossBankJointCertTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
