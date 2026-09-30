package im.toss.features.loan.comparison.midnight;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonMidnightReservedActivity$$ExternalSyntheticLambda0 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonMidnightReservedActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoanComparisonMidnightReservedActivity$$ExternalSyntheticLambda0(LoanComparisonMidnightReservedActivity loanComparisonMidnightReservedActivity, String str) {
        this.f$0 = loanComparisonMidnightReservedActivity;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonMidnightReservedActivity loanComparisonMidnightReservedActivity = this.f$0;
        if (i3 != 0) {
            return LoanComparisonMidnightReservedActivity.onWarmupCompleted(loanComparisonMidnightReservedActivity, this.f$1);
        }
        LoanComparisonMidnightReservedActivity.onWarmupCompleted(loanComparisonMidnightReservedActivity, this.f$1);
        throw null;
    }
}
