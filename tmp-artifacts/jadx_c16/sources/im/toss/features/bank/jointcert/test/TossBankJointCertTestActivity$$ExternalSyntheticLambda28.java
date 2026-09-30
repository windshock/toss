package im.toss.features.bank.jointcert.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TossBankJointCertTestActivity$$ExternalSyntheticLambda28 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TossBankJointCertTestActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TossBankJointCertTestActivity$$ExternalSyntheticLambda28(TossBankJointCertTestActivity tossBankJointCertTestActivity, int i) {
        this.f$0 = tossBankJointCertTestActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 101;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return (Unit) TossBankJointCertTestActivity.onNavigationEvent(new Object[]{this.f$0, Integer.valueOf(this.f$1), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -345881904, 345881904);
        }
        Object[] objArr = {this.f$0, Integer.valueOf(this.f$1), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())};
        int i3 = 73 / 0;
        return (Unit) TossBankJointCertTestActivity.onNavigationEvent(objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -345881904, 345881904);
    }
}
