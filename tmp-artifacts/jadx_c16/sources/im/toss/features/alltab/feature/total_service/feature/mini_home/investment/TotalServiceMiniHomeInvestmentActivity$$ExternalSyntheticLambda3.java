package im.toss.features.alltab.feature.total_service.feature.mini_home.investment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AuthenticatorCompanion;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeInvestmentActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 107;
        onExtraCallback = i2 % 128;
        AuthenticatorCompanion.onWarmupCompleted onwarmupcompleted = (AuthenticatorCompanion.onWarmupCompleted) obj;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        Unit unit = (Unit) TotalServiceMiniHomeInvestmentActivity.onNavigationEvent(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1009404574, iOnNavigationEvent4, new Object[]{onwarmupcompleted}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1009404578, iOnNavigationEvent3);
        int i3 = onExtraCallback + 51;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }
}
