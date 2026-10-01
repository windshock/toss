package im.toss.features.loan.comparison.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonFunnelActivity loanComparisonFunnelActivity = this.f$0;
        Unit unit = (Unit) obj;
        if (i3 != 0) {
            return LoanComparisonFunnelActivity.onExtraCallbackWithResult(loanComparisonFunnelActivity, unit);
        }
        LoanComparisonFunnelActivity.onExtraCallbackWithResult(loanComparisonFunnelActivity, unit);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
