package im.toss.components.compose.extensions;

import kotlin.jvm.functions.Function0;
import o.Camera2CameraMetadataExternalSyntheticLambda1;
import o.ImageLoaderBuilderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ImpressionKt$$ExternalSyntheticLambda6 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ Camera2CameraMetadataExternalSyntheticLambda1 f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ImpressionKt$$ExternalSyntheticLambda6(Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1, Object obj) {
        this.f$0 = camera2CameraMetadataExternalSyntheticLambda1;
        this.f$1 = obj;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Camera2CameraMetadataExternalSyntheticLambda1 camera2CameraMetadataExternalSyntheticLambda1 = this.f$0;
        if (i3 == 0) {
            return Boolean.valueOf(ImageLoaderBuilderExternalSyntheticLambda1.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, this.f$1));
        }
        int i4 = 3 / 0;
        return Boolean.valueOf(ImageLoaderBuilderExternalSyntheticLambda1.onNavigationEvent(camera2CameraMetadataExternalSyntheticLambda1, this.f$1));
    }
}
