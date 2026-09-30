package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda19 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = TossBankJointCertTestActivity.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 30 / 0;
        } else {
            unitOnWarmupCompleted = TossBankJointCertTestActivity.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = IAuthTabCallback + 61;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
