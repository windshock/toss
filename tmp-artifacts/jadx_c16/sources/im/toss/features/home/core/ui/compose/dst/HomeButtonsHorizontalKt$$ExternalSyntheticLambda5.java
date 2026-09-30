package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getBridgeDSLRegistry;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeButtonsHorizontalKt$$ExternalSyntheticLambda5 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = getBridgeDSLRegistry.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return unitOnExtraCallback;
    }
}
