package im.toss.features.mobileid.impl.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdVerifyHistoryActivity f$0;
    public final /* synthetic */ MobileIdVerifyHistoryActivity$IAuthTabCallback f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda8(MobileIdVerifyHistoryActivity mobileIdVerifyHistoryActivity, MobileIdVerifyHistoryActivity$IAuthTabCallback mobileIdVerifyHistoryActivity$IAuthTabCallback, int i) {
        this.f$0 = mobileIdVerifyHistoryActivity;
        this.f$1 = mobileIdVerifyHistoryActivity$IAuthTabCallback;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) MobileIdVerifyHistoryActivity.onWarmupCompleted(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this.f$0, this.f$1, Integer.valueOf(this.f$2), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, 1348968641, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1348968639);
        int i4 = onExtraCallbackWithResult + 71;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }
}
