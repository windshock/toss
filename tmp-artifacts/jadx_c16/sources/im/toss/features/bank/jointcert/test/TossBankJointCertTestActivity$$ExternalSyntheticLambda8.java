package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TossBankJointCertTestActivity$$ExternalSyntheticLambda8(TossBankJointCertTestActivity tossBankJointCertTestActivity, int i) {
        this.f$0 = tossBankJointCertTestActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = TossBankJointCertTestActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
