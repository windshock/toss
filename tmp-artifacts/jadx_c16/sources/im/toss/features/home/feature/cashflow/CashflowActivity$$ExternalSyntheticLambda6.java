package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ CashflowActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 93;
        onNavigationEvent = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            CashflowActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            obj3.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = CashflowActivity.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }
}
