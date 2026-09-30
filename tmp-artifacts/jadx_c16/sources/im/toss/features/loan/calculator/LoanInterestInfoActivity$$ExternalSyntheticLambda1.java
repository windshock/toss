package im.toss.features.loan.calculator;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestInfoActivity$$ExternalSyntheticLambda1 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanInterestInfoActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanInterestInfoActivity$$ExternalSyntheticLambda1(LoanInterestInfoActivity loanInterestInfoActivity, int i) {
        this.f$0 = loanInterestInfoActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            LoanInterestInfoActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = LoanInterestInfoActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
