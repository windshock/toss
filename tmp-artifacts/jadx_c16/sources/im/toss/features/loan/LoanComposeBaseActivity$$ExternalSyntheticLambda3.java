package im.toss.features.loan;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class LoanComposeBaseActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ Function2 f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            LoanComposeBaseActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = LoanComposeBaseActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
        return unitOnNavigationEvent;
    }
}
