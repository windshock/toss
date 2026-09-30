package im.toss.features.home.core.ui.compose.dst;

import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.exitNode;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeBpsBannerKt$$ExternalSyntheticLambda4 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i3 != 0) {
            return exitNode.IAuthTabCallback(i4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        exitNode.IAuthTabCallback(i4, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }
}
