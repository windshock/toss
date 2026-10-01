package im.toss.features.loan.comparison.midnight;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonMidnightAlarmActivity$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanComparisonMidnightAlarmActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanComparisonMidnightAlarmActivity$$ExternalSyntheticLambda4(LoanComparisonMidnightAlarmActivity loanComparisonMidnightAlarmActivity, int i) {
        this.f$0 = loanComparisonMidnightAlarmActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = LoanComparisonMidnightAlarmActivity.onWarmupCompleted(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
