package im.toss.features.bank.jointcert.test;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda32 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TossBankJointCertTestActivity$$ExternalSyntheticLambda32(TossBankJointCertTestActivity tossBankJointCertTestActivity, int i) {
        this.f$0 = tossBankJointCertTestActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TossBankJointCertTestActivity tossBankJointCertTestActivity = this.f$0;
        if (i3 == 0) {
            return TossBankJointCertTestActivity.IAuthTabCallbackDefault(tossBankJointCertTestActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        TossBankJointCertTestActivity.IAuthTabCallbackDefault(tossBankJointCertTestActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
