package im.toss.features.loan.comparison.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanFunnelNavigatorViewModel$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanFunnelNavigatorViewModel f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanFunnelNavigatorViewModel.onNavigationEvent(this.f$0, (Throwable) obj);
        int i4 = onExtraCallbackWithResult + 41;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return unitOnNavigationEvent;
    }
}
