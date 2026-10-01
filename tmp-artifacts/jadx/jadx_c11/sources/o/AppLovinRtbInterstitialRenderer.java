package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinRtbInterstitialRenderer {
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;

    public static final long onExtraCallback(@NotNull Cacheurls1 cacheurls1, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(cacheurls1, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(472300985, i, -1, "im.toss.tds.compose.foundation.graphics.shadow.<get-color> (Shadows.kt:9)");
            int i3 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
        long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(addChildrenForExpandedActionView.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0) ? cacheurls1.onNavigationEvent() : cacheurls1.onWarmupCompleted());
        int i5 = onExtraCallbackWithResult;
        int i6 = i5 + 65;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 101;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }
}
