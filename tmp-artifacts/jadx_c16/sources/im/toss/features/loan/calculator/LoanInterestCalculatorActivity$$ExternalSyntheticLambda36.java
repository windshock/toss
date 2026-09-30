package im.toss.features.loan.calculator;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda36 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda36(LoanInterestCalculatorActivity loanInterestCalculatorActivity, int i) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 7;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
