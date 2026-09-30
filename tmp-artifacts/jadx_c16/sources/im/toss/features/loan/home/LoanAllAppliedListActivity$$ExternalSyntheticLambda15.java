package im.toss.features.loan.home;

import androidx.compose.foundation.layout.RowScope;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda15 implements getBacktraceNote {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ AppliedLoan.LoanText f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i3 = 30 / 0;
        } else {
            unitOnWarmupCompleted = LoanAllAppliedListActivity.onWarmupCompleted(this.f$0, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
