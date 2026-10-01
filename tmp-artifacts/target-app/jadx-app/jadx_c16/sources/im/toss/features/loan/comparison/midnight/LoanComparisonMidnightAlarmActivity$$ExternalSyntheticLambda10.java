package im.toss.features.loan.comparison.midnight;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonMidnightAlarmActivity$$ExternalSyntheticLambda10 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonMidnightAlarmActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoanComparisonMidnightAlarmActivity$$ExternalSyntheticLambda10(LoanComparisonMidnightAlarmActivity loanComparisonMidnightAlarmActivity, String str) {
        this.f$0 = loanComparisonMidnightAlarmActivity;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 71;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanComparisonMidnightAlarmActivity.IAuthTabCallback(this.f$0, this.f$1);
        int i4 = onWarmupCompleted + 53;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return unitIAuthTabCallback;
    }
}
