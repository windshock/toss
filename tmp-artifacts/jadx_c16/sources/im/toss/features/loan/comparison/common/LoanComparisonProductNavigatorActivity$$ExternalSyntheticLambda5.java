package im.toss.features.loan.comparison.common;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonProductNavigatorActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonProductNavigatorActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonProductNavigatorActivity loanComparisonProductNavigatorActivity = this.f$0;
        Throwable th = (Throwable) obj;
        if (i3 != 0) {
            return LoanComparisonProductNavigatorActivity.onWarmupCompleted(loanComparisonProductNavigatorActivity, th);
        }
        LoanComparisonProductNavigatorActivity.onWarmupCompleted(loanComparisonProductNavigatorActivity, th);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
