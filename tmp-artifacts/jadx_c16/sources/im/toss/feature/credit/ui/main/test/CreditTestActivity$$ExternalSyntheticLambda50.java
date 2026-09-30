package im.toss.feature.credit.ui.main.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda50 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity creditTestActivity = this.f$0;
        if (i3 == 0) {
            return CreditTestActivity.onNavigationEvent(creditTestActivity);
        }
        CreditTestActivity.onNavigationEvent(creditTestActivity);
        throw null;
    }
}
