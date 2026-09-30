package im.toss.features.loan.comparison.midnight;

import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.u4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonMidnightAlarmActivity$$ExternalSyntheticLambda2 implements getBacktraceNote {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ LoanComparisonMidnightAlarmActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        LoanComparisonMidnightAlarmActivity loanComparisonMidnightAlarmActivity = this.f$0;
        u4 u4Var = (u4) obj;
        if (i3 != 0) {
            return LoanComparisonMidnightAlarmActivity.onNavigationEvent(loanComparisonMidnightAlarmActivity, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
        Unit unitOnNavigationEvent = LoanComparisonMidnightAlarmActivity.onNavigationEvent(loanComparisonMidnightAlarmActivity, u4Var, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        int i4 = 31 / 0;
        return unitOnNavigationEvent;
    }
}
