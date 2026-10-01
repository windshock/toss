package im.toss.features.loan.calculator;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.RequestMonitorRequestCompleteListenerExternalSyntheticLambda0;
import o.getBacktraceNote;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanInterestCalculatorActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanInterestCalculatorActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanInterestCalculatorActivity.onNavigationEvent(this.f$0, (RequestMonitorRequestCompleteListenerExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        if (i3 != 0) {
            int i4 = 55 / 0;
        }
        return unitOnNavigationEvent;
    }
}
