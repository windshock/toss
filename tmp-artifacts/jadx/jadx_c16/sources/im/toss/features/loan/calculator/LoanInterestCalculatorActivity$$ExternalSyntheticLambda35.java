package im.toss.features.loan.calculator;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda35 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda35(LoanInterestCalculatorActivity loanInterestCalculatorActivity, String str) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = str;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LoanInterestCalculatorActivity.onExtraCallback(this.f$0, this.f$1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = LoanInterestCalculatorActivity.onExtraCallback(this.f$0, this.f$1);
        int i3 = onExtraCallbackWithResult + 83;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
