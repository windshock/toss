package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.javaName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinAdDisplayListener {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float onWarmupCompleted(@NotNull javaName javaname, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        float fC_;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(javaname, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1565954981, i, -1, "im.toss.tds.compose.foundation.token.<get-value> (TdsBorderWidthExtensions.kt:12)");
        }
        if (javaname instanceof javaName.onWarmupCompleted) {
            int i3 = IAuthTabCallback + 3;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1644179907);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            fC_ = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(((javaName.onWarmupCompleted) javaname).onExtraCallback());
        } else {
            if (!(javaname instanceof javaName.IAuthTabCallback)) {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1644181463);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                throw new NoWhenBranchMatchedException();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-1644178493);
            fC_ = ((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).c_(((javaName.IAuthTabCallback) javaname).onExtraCallback());
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            int i5 = onWarmupCompleted + 103;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 5;
            }
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return fC_;
    }
}
