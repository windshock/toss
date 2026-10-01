package im.toss.features.loan.calculator;

import java.util.Locale;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.getMaxSupportedFrameRate;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ Locale f$1;
    public final /* synthetic */ getMaxSupportedFrameRate f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda1(LoanInterestCalculatorActivity loanInterestCalculatorActivity, Locale locale, getMaxSupportedFrameRate getmaxsupportedframerate, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = locale;
        this.f$2 = getmaxsupportedframerate;
        this.f$3 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitOnNavigationEvent = LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = 4 / 0;
        return unitOnNavigationEvent;
    }
}
