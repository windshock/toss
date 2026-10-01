package im.toss.features.loan.comparison.alarm;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAlarmRequestActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ LoanAllRejectedAlarmRequestActivity f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ LoanAllRejectedAlarmRequestActivity$$ExternalSyntheticLambda3(LoanAllRejectedAlarmRequestActivity loanAllRejectedAlarmRequestActivity, int i) {
        this.f$0 = loanAllRejectedAlarmRequestActivity;
        this.f$1 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = LoanAllRejectedAlarmRequestActivity.onExtraCallbackWithResult(this.f$0, this.f$1, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
