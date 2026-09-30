package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda20 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanAllAppliedListActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda20(LoanAllAppliedListActivity loanAllAppliedListActivity, int i) {
        this.f$0 = loanAllAppliedListActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanAllAppliedListActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
