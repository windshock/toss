package im.toss.features.loan.calculator;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.adaptAppModel;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda4 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ adaptAppModel f$1;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda4(LoanInterestCalculatorActivity loanInterestCalculatorActivity, adaptAppModel adaptappmodel) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = adaptappmodel;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            LoanInterestCalculatorActivity.onWarmupCompleted(this.f$0, this.f$1, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitOnWarmupCompleted = LoanInterestCalculatorActivity.onWarmupCompleted(this.f$0, this.f$1, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
