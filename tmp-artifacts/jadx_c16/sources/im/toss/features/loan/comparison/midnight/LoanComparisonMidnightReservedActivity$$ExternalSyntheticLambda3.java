package im.toss.features.loan.comparison.midnight;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonMidnightReservedActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanComparisonMidnightReservedActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanComparisonMidnightReservedActivity$$ExternalSyntheticLambda3(LoanComparisonMidnightReservedActivity loanComparisonMidnightReservedActivity, int i) {
        this.f$0 = loanComparisonMidnightReservedActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonMidnightReservedActivity loanComparisonMidnightReservedActivity = this.f$0;
        if (i3 != 0) {
            return LoanComparisonMidnightReservedActivity.onExtraCallbackWithResult(loanComparisonMidnightReservedActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        LoanComparisonMidnightReservedActivity.onExtraCallbackWithResult(loanComparisonMidnightReservedActivity, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        throw null;
    }
}
