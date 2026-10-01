package o;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class u5ExternalSyntheticLambda0 {
    private static int asBinder = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final u5ExternalSyntheticLambda0 onNavigationEvent = new u5ExternalSyntheticLambda0();
    private static final float IAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(160.0f);

    private u5ExternalSyntheticLambda0() {
    }

    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = asBinder + 25;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(236417991, i, -1, "im.toss.tds.compose.component.compound.bottominfo.TdsBottomInfoV1Defaults.<get-backgroundColor> (TdsBottomInfoV1Defaults.kt:24)");
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BackgroundLower, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i5 = onExtraCallback + 31;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return jOnExtraCallback;
    }

    public final float onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 113;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        float f = IAuthTabCallback;
        int i5 = i2 + 39;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return f;
    }

    public static /* synthetic */ DeviceQuirksExternalSyntheticLambda0 IAuthTabCallback(u5ExternalSyntheticLambda0 u5externalsyntheticlambda0, float f, float f2, float f3, float f4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            f = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        if ((i & 2) != 0) {
            int i3 = asBinder + 7;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            f2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
        }
        if ((i & 4) != 0) {
            f3 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
            int i5 = asBinder + 67;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 8) != 0) {
            int i7 = onExtraCallback + 69;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            f4 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.0f);
        }
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult = u5externalsyntheticlambda0.onExtraCallbackWithResult(f, f2, f3, f4);
        int i9 = onExtraCallback + 71;
        asBinder = i9 % 128;
        if (i9 % 2 != 0) {
            return deviceQuirksExternalSyntheticLambda0OnExtraCallbackWithResult;
        }
        throw null;
    }

    public final DeviceQuirksExternalSyntheticLambda0 onExtraCallbackWithResult(float f, float f2, float f3, float f4) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0IAuthTabCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.IAuthTabCallback(f, f2, f3, f4);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        int i5 = asBinder + 115;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return deviceQuirksExternalSyntheticLambda0IAuthTabCallback;
    }

    static {
        int i = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
