package im.toss.features.alltab.feature.total_service.feature.common;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.ButtonBoundingClientRect;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceImageSourceKt$$ExternalSyntheticLambda0 implements Function2 {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ int f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 33;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ButtonBoundingClientRect.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitIAuthTabCallback = ButtonBoundingClientRect.IAuthTabCallback(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i3 = onExtraCallback + 57;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 58 / 0;
        }
        return unitIAuthTabCallback;
    }
}
