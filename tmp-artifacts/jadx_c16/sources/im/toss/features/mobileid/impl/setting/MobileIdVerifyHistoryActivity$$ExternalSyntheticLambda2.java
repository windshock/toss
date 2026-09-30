package im.toss.features.mobileid.impl.setting;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ MobileIdVerifyHistoryActivity f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ MobileIdVerifyHistoryActivity$$ExternalSyntheticLambda2(MobileIdVerifyHistoryActivity mobileIdVerifyHistoryActivity, List list) {
        this.f$0 = mobileIdVerifyHistoryActivity;
        this.f$1 = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = (Unit) MobileIdVerifyHistoryActivity.onWarmupCompleted(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(((Integer) obj2).intValue())}, 1178278369, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1178278366);
        int i4 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
