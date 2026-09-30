package im.toss.features.loan.comparison.funnel;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda9 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonFunnelActivity loanComparisonFunnelActivity = this.f$0;
        Boolean bool = (Boolean) obj;
        if (i3 == 0) {
            return LoanComparisonFunnelActivity.onWarmupCompleted(loanComparisonFunnelActivity, bool);
        }
        LoanComparisonFunnelActivity.onWarmupCompleted(loanComparisonFunnelActivity, bool);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
