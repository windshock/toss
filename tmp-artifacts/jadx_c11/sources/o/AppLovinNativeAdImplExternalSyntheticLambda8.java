package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinNativeAdImplExternalSyntheticLambda7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AppLovinNativeAdImplExternalSyntheticLambda8 {
    public static final AppLovinNativeAdImplExternalSyntheticLambda8 IAuthTabCallback = new AppLovinNativeAdImplExternalSyntheticLambda8();
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    static {
        int i = onExtraCallback + 67;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private AppLovinNativeAdImplExternalSyntheticLambda8() {
    }

    public final long IAuthTabCallback(@NotNull AppLovinNativeAdImplExternalSyntheticLambda7.onExtraCallbackWithResult onextracallbackwithresult, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1524668364, i, -1, "im.toss.tds.compose.component.atom.border.TdsBorderV1Defaults.color (TdsBorderV1Defaults.kt:17)");
            int i3 = onWarmupCompleted + 27;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
        }
        long jIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, i & 112);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onNavigationEvent + 7;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 != 0) {
                throw null;
            }
        }
        return jIAuthTabCallback;
    }

    public final long IAuthTabCallback(float f, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        long jOnExtraCallback;
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onWarmupCompleted + 75;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1245542342, i, -1, "im.toss.tds.compose.component.atom.border.TdsBorderV1Defaults.color (TdsBorderV1Defaults.kt:21)");
            if (i4 == 0) {
                throw null;
            }
        }
        if (VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f)) > 0) {
            int i5 = onWarmupCompleted + 107;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1729497823);
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BackgroundLower, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1729564225);
            jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BorderDefault, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onWarmupCompleted + 109;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
        }
        return jOnExtraCallback;
    }
}
