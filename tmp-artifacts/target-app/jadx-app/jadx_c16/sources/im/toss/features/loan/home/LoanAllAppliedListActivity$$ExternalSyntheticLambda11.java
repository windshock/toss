package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import viva.republica.toss.network.model.loan.AppliedLoan;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanAllAppliedListActivity f$0;
    public final /* synthetic */ AppliedLoan f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda11(LoanAllAppliedListActivity loanAllAppliedListActivity, AppliedLoan appliedLoan, int i) {
        this.f$0 = loanAllAppliedListActivity;
        this.f$1 = appliedLoan;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = LoanAllAppliedListActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }
}
