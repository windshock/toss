package im.toss.features.loan.comparison.alarm;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanAllRejectedAlarmRequestActivity$$ExternalSyntheticLambda2 implements Function2 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ LoanAllRejectedAlarmRequestActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            LoanAllRejectedAlarmRequestActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LoanAllRejectedAlarmRequestActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnNavigationEvent;
    }
}
