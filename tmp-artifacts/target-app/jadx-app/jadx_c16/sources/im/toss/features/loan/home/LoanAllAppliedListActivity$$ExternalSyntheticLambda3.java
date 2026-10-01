package im.toss.features.loan.home;

import androidx.compose.foundation.layout.RowScope;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda3 implements getBacktraceNote {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ AppliedLoan f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        AppliedLoan appliedLoan = this.f$0;
        RowScope rowScope = (RowScope) obj;
        if (i3 != 0) {
            return LoanAllAppliedListActivity.onExtraCallback(appliedLoan, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        LoanAllAppliedListActivity.onExtraCallback(appliedLoan, rowScope, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        throw null;
    }
}
