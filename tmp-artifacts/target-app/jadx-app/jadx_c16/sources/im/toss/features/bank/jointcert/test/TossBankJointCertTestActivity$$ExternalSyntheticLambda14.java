package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda14 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 69;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            TossBankJointCertTestActivity.IAuthTabCallback(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = TossBankJointCertTestActivity.IAuthTabCallback(this.f$0, (w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onNavigationEvent + 75;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
        return unitIAuthTabCallback;
    }
}
