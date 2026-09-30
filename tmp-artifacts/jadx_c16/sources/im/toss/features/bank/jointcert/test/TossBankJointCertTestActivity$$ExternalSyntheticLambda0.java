package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.w5a;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda0 implements getBacktraceNote {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TossBankJointCertTestActivity tossBankJointCertTestActivity = this.f$0;
        w5a w5aVar = (w5a) obj;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
        Integer numValueOf = Integer.valueOf(((Integer) obj3).intValue());
        if (i3 != 0) {
            int iIAuthTabCallback = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
            return (Unit) TossBankJointCertTestActivity.onNavigationEvent(new Object[]{tossBankJointCertTestActivity, w5aVar, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback, -1001017340, 1001017344);
        }
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback();
        throw null;
    }
}
