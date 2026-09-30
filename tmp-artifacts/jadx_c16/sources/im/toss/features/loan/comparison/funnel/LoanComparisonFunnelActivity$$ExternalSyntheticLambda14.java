package im.toss.features.loan.comparison.funnel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonFunnelActivity$$ExternalSyntheticLambda14 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonFunnelActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            LoanComparisonFunnelActivity.IAuthTabCallback(this.f$0, (Unit) obj);
            throw null;
        }
        Unit unitIAuthTabCallback = LoanComparisonFunnelActivity.IAuthTabCallback(this.f$0, (Unit) obj);
        int i3 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }
}
