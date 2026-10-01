package im.toss.features.alltab.feature.total_service.feature.mini_home;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TotalServiceMiniHomeActivity$$ExternalSyntheticLambda11 implements Function2 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ TotalServiceMiniHomeActivity f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        TotalServiceMiniHomeActivity totalServiceMiniHomeActivity = this.f$0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
        if (i3 == 0) {
            return TotalServiceMiniHomeActivity.onExtraCallbackWithResult(totalServiceMiniHomeActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        }
        Unit unitOnExtraCallbackWithResult = TotalServiceMiniHomeActivity.onExtraCallbackWithResult(totalServiceMiniHomeActivity, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj2).intValue());
        int i4 = 90 / 0;
        return unitOnExtraCallbackWithResult;
    }
}
