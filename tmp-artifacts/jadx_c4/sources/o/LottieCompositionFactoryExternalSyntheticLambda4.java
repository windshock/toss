package o;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class LottieCompositionFactoryExternalSyntheticLambda4 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final LottieCompositionFactoryExternalSyntheticLambda17 onExtraCallback(@NotNull LottieCompositionFactoryExternalSyntheticLambda7 lottieCompositionFactoryExternalSyntheticLambda7, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(lottieCompositionFactoryExternalSyntheticLambda7, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallbackWithResult + 37;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(52202417, i, -1, "im.toss.compose.widget.point.overlay.rememberPointComponentOverlayGradientGroupState (PointComponentOverlayGradientGroupState.kt:24)");
        }
        Configuration configuration = (Configuration) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult());
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
        float fOnExtraCallback = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(configuration.screenWidthDp));
        if ((((i & 14) ^ 6) <= 4 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(lottieCompositionFactoryExternalSyntheticLambda7)) && (i & 6) != 4) {
            z = false;
        } else {
            int i5 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(!z) || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new LottieCompositionFactoryExternalSyntheticLambda6(lottieCompositionFactoryExternalSyntheticLambda7, r8lambdanm9dm2eewl4vrptnjmesfjqky4, fOnExtraCallback);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        LottieCompositionFactoryExternalSyntheticLambda6 lottieCompositionFactoryExternalSyntheticLambda6 = (LottieCompositionFactoryExternalSyntheticLambda6) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return lottieCompositionFactoryExternalSyntheticLambda6;
    }
}
