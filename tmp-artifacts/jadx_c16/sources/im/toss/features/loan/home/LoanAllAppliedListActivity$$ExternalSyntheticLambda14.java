package im.toss.features.loan.home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllAppliedListActivity$$ExternalSyntheticLambda14 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanAllAppliedListActivity f$0;
    public final /* synthetic */ LoanAllAppliedListActivity$IAuthTabCallbackDefault f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LoanAllAppliedListActivity$$ExternalSyntheticLambda14(LoanAllAppliedListActivity loanAllAppliedListActivity, LoanAllAppliedListActivity$IAuthTabCallbackDefault loanAllAppliedListActivity$IAuthTabCallbackDefault, int i) {
        this.f$0 = loanAllAppliedListActivity;
        this.f$1 = loanAllAppliedListActivity$IAuthTabCallbackDefault;
        this.f$2 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = LoanAllAppliedListActivity.onExtraCallback(this.f$0, this.f$1, this.f$2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
