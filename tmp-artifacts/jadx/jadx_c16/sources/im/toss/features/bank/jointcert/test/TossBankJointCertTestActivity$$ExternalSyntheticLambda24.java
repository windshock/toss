package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda24 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TossBankJointCertTestActivity$$ExternalSyntheticLambda24(TossBankJointCertTestActivity tossBankJointCertTestActivity, int i) {
        this.f$0 = tossBankJointCertTestActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        TossBankJointCertTestActivity tossBankJointCertTestActivity = this.f$0;
        if (i3 != 0) {
            return TossBankJointCertTestActivity.onExtraCallback(tossBankJointCertTestActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnExtraCallback = TossBankJointCertTestActivity.onExtraCallback(tossBankJointCertTestActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = 51 / 0;
        return unitOnExtraCallback;
    }
}
