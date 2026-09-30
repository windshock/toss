package im.toss.features.loan.comparison.automobile;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda13 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanAllRejectedAutomobileInputActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanAllRejectedAutomobileInputActivity$$ExternalSyntheticLambda13(LoanAllRejectedAutomobileInputActivity loanAllRejectedAutomobileInputActivity, int i) {
        this.f$0 = loanAllRejectedAutomobileInputActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            LoanAllRejectedAutomobileInputActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LoanAllRejectedAutomobileInputActivity.onNavigationEvent(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
