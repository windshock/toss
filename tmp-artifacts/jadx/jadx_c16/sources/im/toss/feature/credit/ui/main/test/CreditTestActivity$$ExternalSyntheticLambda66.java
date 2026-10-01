package im.toss.feature.credit.ui.main.test;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditTestActivity$$ExternalSyntheticLambda66 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CreditTestActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 35;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        CreditTestActivity creditTestActivity = this.f$0;
        if (i3 == 0) {
            return CreditTestActivity.onMinimized(creditTestActivity);
        }
        CreditTestActivity.onMinimized(creditTestActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
