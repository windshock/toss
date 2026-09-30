package im.toss.features.kyc.cdd.email;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class InputEmailActivity$$ExternalSyntheticLambda6 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ InputEmailActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i2 % 128;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            InputEmailActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnNavigationEvent = InputEmailActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        obj3.hashCode();
        throw null;
    }
}
