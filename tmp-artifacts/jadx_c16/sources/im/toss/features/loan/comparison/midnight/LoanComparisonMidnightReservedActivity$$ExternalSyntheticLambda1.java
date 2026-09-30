package im.toss.features.loan.comparison.midnight;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonMidnightReservedActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonMidnightReservedActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoanComparisonMidnightReservedActivity$$ExternalSyntheticLambda1(LoanComparisonMidnightReservedActivity loanComparisonMidnightReservedActivity, String str) {
        this.f$0 = loanComparisonMidnightReservedActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonMidnightReservedActivity loanComparisonMidnightReservedActivity = this.f$0;
        if (i3 != 0) {
            return LoanComparisonMidnightReservedActivity.onNavigationEvent(loanComparisonMidnightReservedActivity, this.f$1, (SetDetectableSize) obj);
        }
        Unit unitOnNavigationEvent = LoanComparisonMidnightReservedActivity.onNavigationEvent(loanComparisonMidnightReservedActivity, this.f$1, (SetDetectableSize) obj);
        int i4 = 41 / 0;
        return unitOnNavigationEvent;
    }
}
