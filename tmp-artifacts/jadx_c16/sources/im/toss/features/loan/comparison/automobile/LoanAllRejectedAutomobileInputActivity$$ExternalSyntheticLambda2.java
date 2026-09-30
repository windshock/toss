package im.toss.features.loan.comparison.automobile;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.u4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanAllRejectedAutomobileInputActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 37;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = LoanAllRejectedAutomobileInputActivity.onExtraCallback(this.f$0, (u4) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = onExtraCallbackWithResult + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 47 / 0;
        }
        return unitOnExtraCallback;
    }
}
