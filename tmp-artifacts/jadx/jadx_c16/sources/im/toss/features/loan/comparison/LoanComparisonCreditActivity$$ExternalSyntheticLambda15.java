package im.toss.features.loan.comparison;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonCreditActivity$$ExternalSyntheticLambda15 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonCreditActivity f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnWarmupCompleted = LoanComparisonCreditActivity.onWarmupCompleted(this.f$0, (Throwable) obj);
            int i3 = 48 / 0;
        } else {
            unitOnWarmupCompleted = LoanComparisonCreditActivity.onWarmupCompleted(this.f$0, (Throwable) obj);
        }
        int i4 = onNavigationEvent + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
