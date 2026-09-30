package im.toss.features.loan.comparison;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonCreditActivity$$ExternalSyntheticLambda8 implements Function0 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonCreditActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = LoanComparisonCreditActivity.asBinder(this.f$0);
        int i4 = onWarmupCompleted + 57;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unitAsBinder;
        }
        throw null;
    }
}
