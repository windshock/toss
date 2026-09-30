package im.toss.features.loan.comparison.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda10 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanComparisonFunnelActivity.onNavigationEvent(this.f$0, (Boolean) obj);
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return unitOnNavigationEvent;
    }
}
