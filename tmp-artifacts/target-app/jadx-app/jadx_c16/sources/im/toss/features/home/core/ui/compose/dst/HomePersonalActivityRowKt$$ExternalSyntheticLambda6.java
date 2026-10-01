package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.clearAllMethodInvokeOptimizer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomePersonalActivityRowKt$$ExternalSyntheticLambda6 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            clearAllMethodInvokeOptimizer.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = clearAllMethodInvokeOptimizer.onExtraCallbackWithResult(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallback + 55;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 38 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }
}
