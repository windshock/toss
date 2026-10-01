package o;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class maybeHandlePause {
    public static final maybeHandlePause IAuthTabCallback = new maybeHandlePause();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 83;
        onExtraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private maybeHandlePause() {
    }

    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 45;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2043395594, i, -1, "im.toss.tds.compose.component.atom.progressbar.TdsProgressBarV1Defaults.<get-trackColor> (TdsProgressBarV1Defaults.kt:17)");
            int i5 = onWarmupCompleted + 15;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.FillBrand, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = onExtraCallback + 1;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 83 / 0;
        }
        return jOnExtraCallback;
    }

    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 9;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(458899350, i, -1, "im.toss.tds.compose.component.atom.progressbar.TdsProgressBarV1Defaults.<get-trackFillColor> (TdsProgressBarV1Defaults.kt:22)");
        }
        long jOnWarmupCompleted = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onWarmupCompleted(eExternalSyntheticLambda0.ProgressBarTrackFill, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = onExtraCallback + 1;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i9 = onExtraCallback + 89;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
        return jOnWarmupCompleted;
    }
}
