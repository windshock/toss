package im.toss.features.loan.calculator;

import java.util.Locale;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.getBacktraceNote;
import o.getMaxSupportedFrameRate;
import o.getSupportedHighSpeedResolutionsFor;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;
    public final /* synthetic */ Locale f$1;
    public final /* synthetic */ getMaxSupportedFrameRate f$2;
    public final /* synthetic */ getSupportedHighSpeedResolutionsFor f$3;

    public /* synthetic */ LoanInterestCalculatorActivity$$ExternalSyntheticLambda2(LoanInterestCalculatorActivity loanInterestCalculatorActivity, Locale locale, getMaxSupportedFrameRate getmaxsupportedframerate, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        this.f$0 = loanInterestCalculatorActivity;
        this.f$1 = locale;
        this.f$2 = getmaxsupportedframerate;
        this.f$3 = getsupportedhighspeedresolutionsfor;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            LoanInterestCalculatorActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = LoanInterestCalculatorActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, this.f$3, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
