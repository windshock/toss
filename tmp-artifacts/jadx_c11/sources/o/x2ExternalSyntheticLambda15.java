package o;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda15 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    public static final x2ExternalSyntheticLambda15 onExtraCallback = new x2ExternalSyntheticLambda15();
    private static final float onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(313.0f);
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    private x2ExternalSyntheticLambda15() {
    }

    public final float onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 73;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        float f = onExtraCallbackWithResult;
        int i4 = i3 + 105;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 35;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 29;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1871106451, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1Defaults.<get-titleColor> (TdsResultV1Defaults.kt:19)");
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextStrong, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }

    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Object obj = null;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = IAuthTabCallbackDefault + 45;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1224997513, i, -1, "im.toss.tds.compose.component.compound.result.TdsResultV1Defaults.<get-subtitleColor> (TdsResultV1Defaults.kt:24)");
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = IAuthTabCallbackDefault + 117;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextSecondary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallback + 77;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        return jOnExtraCallback;
    }

    static {
        int i = onWarmupCompleted + 97;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }
}
