package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TossBankJointCertTestActivity$$ExternalSyntheticLambda2(TossBankJointCertTestActivity tossBankJointCertTestActivity, int i) {
        this.f$0 = tossBankJointCertTestActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TossBankJointCertTestActivity tossBankJointCertTestActivity = this.f$0;
        if (i3 == 0) {
            return TossBankJointCertTestActivity.onWarmupCompleted(tossBankJointCertTestActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnWarmupCompleted = TossBankJointCertTestActivity.onWarmupCompleted(tossBankJointCertTestActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = 44 / 0;
        return unitOnWarmupCompleted;
    }
}
