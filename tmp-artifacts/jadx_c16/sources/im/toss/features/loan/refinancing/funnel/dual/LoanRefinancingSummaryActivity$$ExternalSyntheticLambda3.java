package im.toss.features.loan.refinancing.funnel.dual;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanRefinancingSummaryActivity$$ExternalSyntheticLambda3 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public final /* synthetic */ LoanRefinancingSummaryActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanRefinancingSummaryActivity.onExtraCallbackWithResult(this.f$0);
        int i4 = onExtraCallback + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
