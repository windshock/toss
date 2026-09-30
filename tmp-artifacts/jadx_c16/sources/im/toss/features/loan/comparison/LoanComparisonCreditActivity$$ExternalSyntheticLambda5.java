package im.toss.features.loan.comparison;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonCreditActivity$$ExternalSyntheticLambda5 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonCreditActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanComparisonCreditActivity.IAuthTabCallback(this.f$0);
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
