package im.toss.features.credit.ui.plus.insurance;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusInsuranceActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditPlusInsuranceActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditPlusInsuranceActivity creditPlusInsuranceActivity = this.f$0;
        String str = (String) obj;
        if (i3 == 0) {
            return CreditPlusInsuranceActivity.onWarmupCompleted(creditPlusInsuranceActivity, str);
        }
        CreditPlusInsuranceActivity.onWarmupCompleted(creditPlusInsuranceActivity, str);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
