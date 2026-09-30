package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getNodeExtensionMap;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeFullTooltipKt$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getNodeExtensionMap.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
