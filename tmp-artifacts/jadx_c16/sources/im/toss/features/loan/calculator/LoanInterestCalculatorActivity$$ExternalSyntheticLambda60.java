package im.toss.features.loan.calculator;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda60 implements Function1 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda60(LoanInterestCalculatorActivity loanInterestCalculatorActivity, String str) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            LoanInterestCalculatorActivity.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
            throw null;
        }
        Unit unitOnWarmupCompleted = LoanInterestCalculatorActivity.onWarmupCompleted(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i3 = onExtraCallback + 119;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
