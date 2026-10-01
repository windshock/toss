package im.toss.components.compose.extensions;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.ImageLoaderBuilderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ImpressionKt$$ExternalSyntheticLambda8 implements Function2 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 f$1;
    public final /* synthetic */ Function0 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ ImpressionKt$$ExternalSyntheticLambda8(Object obj, Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Function0 function0, int i) {
        this.f$0 = obj;
        this.f$1 = camera2CameraMetadataExternalSyntheticLambda1;
        this.f$2 = function0;
        this.f$3 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = ImageLoaderBuilderExternalSyntheticLambda1.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        int i4 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
