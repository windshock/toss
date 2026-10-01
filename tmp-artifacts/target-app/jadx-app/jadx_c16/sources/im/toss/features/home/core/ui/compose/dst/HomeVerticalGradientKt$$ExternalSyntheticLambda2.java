package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ExtensionOptMethodInvokeOptimizer;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeVerticalGradientKt$$ExternalSyntheticLambda2 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnExtraCallback = ExtensionOptMethodInvokeOptimizer.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 27 / 0;
        } else {
            unitOnExtraCallback = ExtensionOptMethodInvokeOptimizer.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onNavigationEvent + 21;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return unitOnExtraCallback;
    }
}
