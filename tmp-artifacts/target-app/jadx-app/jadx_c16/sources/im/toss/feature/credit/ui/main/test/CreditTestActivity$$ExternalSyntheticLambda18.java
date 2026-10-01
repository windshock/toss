package im.toss.feature.credit.ui.main.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda18 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity creditTestActivity = this.f$0;
        if (i3 != 0) {
            return CreditTestActivity.onWarmupCompleted(creditTestActivity);
        }
        CreditTestActivity.onWarmupCompleted(creditTestActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
