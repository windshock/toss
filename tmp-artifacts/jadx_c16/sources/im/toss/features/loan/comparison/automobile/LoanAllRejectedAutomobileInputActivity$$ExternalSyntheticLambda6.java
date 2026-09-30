package im.toss.features.loan.comparison.automobile;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanAllRejectedAutomobileInputActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda6(LoanAllRejectedAutomobileInputActivity loanAllRejectedAutomobileInputActivity, int i) {
        this.f$0 = loanAllRejectedAutomobileInputActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanAllRejectedAutomobileInputActivity.IAuthTabCallback(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
