package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda10 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ TotalServiceMiniHomeInvestmentActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda10(TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity, int i) {
        this.f$0 = totalServiceMiniHomeInvestmentActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceMiniHomeInvestmentActivity totalServiceMiniHomeInvestmentActivity = this.f$0;
        int i4 = this.f$1;
        int iIntValue = ((Integer) obj2).intValue();
        Object[] objArr = {totalServiceMiniHomeInvestmentActivity, Integer.valueOf(i4), (CameraCaptureResultEmptyCameraCaptureResult) obj, Integer.valueOf(iIntValue)};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) TotalServiceMiniHomeInvestmentActivity.onNavigationEvent(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1692931988, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1692931979, iOnNavigationEvent);
        int i5 = onNavigationEvent + 47;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }
}
