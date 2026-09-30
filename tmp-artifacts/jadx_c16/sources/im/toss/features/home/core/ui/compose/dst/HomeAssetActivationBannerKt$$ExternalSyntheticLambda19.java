package im.toss.features.home.core.ui.compose.dst;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.ActionCallback2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAssetActivationBannerKt$$ExternalSyntheticLambda19 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        Unit unitOnExtraCallback;
        int i = 2 % 2;
        int i2 = onExtraCallback + 83;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnExtraCallback = ActionCallback2.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i3 = 90 / 0;
        } else {
            unitOnExtraCallback = ActionCallback2.onExtraCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
        int i4 = onExtraCallback + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
