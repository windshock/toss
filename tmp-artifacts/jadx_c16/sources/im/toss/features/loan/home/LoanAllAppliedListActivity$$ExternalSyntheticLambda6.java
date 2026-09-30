package im.toss.features.loan.home;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.w3b;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda6 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AppliedLoan f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, (w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            throw null;
        }
        Unit unitOnWarmupCompleted = LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, (w3b) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i3 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
