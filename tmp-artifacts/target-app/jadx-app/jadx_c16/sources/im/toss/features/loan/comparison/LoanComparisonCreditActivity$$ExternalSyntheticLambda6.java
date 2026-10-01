package im.toss.features.loan.comparison;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonCreditActivity$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanComparisonCreditActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonCreditActivity loanComparisonCreditActivity = this.f$0;
        if (i3 == 0) {
            return LoanComparisonCreditActivity.IAuthTabCallbackStub(loanComparisonCreditActivity);
        }
        LoanComparisonCreditActivity.IAuthTabCallbackStub(loanComparisonCreditActivity);
        throw null;
    }
}
