package im.toss.features.loan.calculator;

import java.util.Locale;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.adaptAppModel;
import o.getBacktraceNote;
import o.getMaxSupportedFrameRate;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda0 implements getBacktraceNote {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ Locale f$1;
    public final /* synthetic */ adaptAppModel f$2;
    public final /* synthetic */ getMaxSupportedFrameRate f$3;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda0(LoanInterestCalculatorActivity loanInterestCalculatorActivity, Locale locale, adaptAppModel adaptappmodel, getMaxSupportedFrameRate getmaxsupportedframerate) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = locale;
        this.f$2 = adaptappmodel;
        this.f$3 = getmaxsupportedframerate;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            return LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
