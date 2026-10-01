package im.toss.features.loan.calculator;

import java.util.Locale;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.adaptAppModel;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda3 implements getBacktraceNote {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ Locale f$1;
    public final /* synthetic */ adaptAppModel f$2;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda3(LoanInterestCalculatorActivity loanInterestCalculatorActivity, Locale locale, adaptAppModel adaptappmodel) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = locale;
        this.f$2 = adaptappmodel;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanInterestCalculatorActivity.onExtraCallbackWithResult(this.f$0, this.f$1, this.f$2, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onWarmupCompleted + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
