package im.toss.features.benefit.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.TinyAppHostApduService1;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitLogManager$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {Boolean.valueOf(((Boolean) obj).booleanValue())};
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent4 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        if (i3 == 0) {
            return (Unit) TinyAppHostApduService1.IAuthTabCallback(iOnNavigationEvent3, -303516944, iOnNavigationEvent, 303516946, iOnNavigationEvent4, objArr, iOnNavigationEvent2);
        }
        Unit unit = (Unit) TinyAppHostApduService1.IAuthTabCallback(iOnNavigationEvent3, -303516944, iOnNavigationEvent, 303516946, iOnNavigationEvent4, objArr, iOnNavigationEvent2);
        int i4 = 44 / 0;
        return unit;
    }
}
