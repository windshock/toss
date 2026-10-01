package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda21 implements Function2 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;
    public final /* synthetic */ DeviceQuirksExternalSyntheticLambda0 f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ TossBankJointCertTestActivity$$ExternalSyntheticLambda21(TossBankJointCertTestActivity tossBankJointCertTestActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, int i) {
        this.f$0 = tossBankJointCertTestActivity;
        this.f$1 = deviceQuirksExternalSyntheticLambda0;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = TossBankJointCertTestActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onNavigationEvent + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
