package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSearchActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CashflowSearchActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 57;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallbackWithResult = CashflowSearchActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 54 / 0;
        } else {
            unitOnExtraCallbackWithResult = CashflowSearchActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onWarmupCompleted + 27;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
