package im.toss.features.loan.comparison.result;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonPreScreeningResultFragment$$ExternalSyntheticLambda22 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonPreScreeningResultFragment f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = LoanComparisonPreScreeningResultFragment.onExtraCallback(this.f$0);
        int i4 = onNavigationEvent + 9;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
