package im.toss.features.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ LoanComposeBaseActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanComposeBaseActivity$$ExternalSyntheticLambda2(LoanComposeBaseActivity loanComposeBaseActivity, int i) {
        this.f$0 = loanComposeBaseActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        LoanComposeBaseActivity loanComposeBaseActivity = this.f$0;
        if (i3 != 0) {
            return LoanComposeBaseActivity.onExtraCallbackWithResult(loanComposeBaseActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        Unit unitOnExtraCallbackWithResult = LoanComposeBaseActivity.onExtraCallbackWithResult(loanComposeBaseActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = 47 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
