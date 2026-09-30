package im.toss.features.loan.comparison.midnight;

import im.toss.TossApplication;
import kotlin.Unit;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBacktraceNote;
import o.y1a;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComparisonMidnightAlarmActivity$$ExternalSyntheticLambda1 implements getBacktraceNote {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanComparisonMidnightAlarmActivity f$0;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this.f$0, (y1a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())};
        int iOnExtraCallback = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback2 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback3 = TossApplication.onSessionEnded.onExtraCallback();
        int iOnExtraCallback4 = TossApplication.onSessionEnded.onExtraCallback();
        if (i3 != 0) {
            return (Unit) LoanComparisonMidnightAlarmActivity.onWarmupCompleted(-2035365306, 2035365315, iOnExtraCallback, iOnExtraCallback4, iOnExtraCallback2, iOnExtraCallback3, objArr);
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }
}
