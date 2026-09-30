package im.toss.features.loan.comparison.result;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonPreScreeningResultFragment$$ExternalSyntheticLambda25 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LoanComparisonPreScreeningResultFragment f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = LoanComparisonPreScreeningResultFragment.asBinder(this.f$0);
        int i4 = IAuthTabCallback + 19;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        throw null;
    }
}
