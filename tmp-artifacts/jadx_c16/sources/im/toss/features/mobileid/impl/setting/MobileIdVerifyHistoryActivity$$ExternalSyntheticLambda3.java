package im.toss.features.mobileid.impl.setting;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdVerifyHistoryActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MobileIdVerifyHistoryActivity mobileIdVerifyHistoryActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 != 0) {
            Object[] objArr = {mobileIdVerifyHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj2).intValue())};
            return (Unit) MobileIdVerifyHistoryActivity.onWarmupCompleted(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, -768768305, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 768768306);
        }
        Object[] objArr2 = {mobileIdVerifyHistoryActivity, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((Integer) obj2).intValue())};
        throw null;
    }
}
