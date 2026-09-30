package o;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda4 {
    public static final x2ExternalSyntheticLambda4 IAuthTabCallback = new x2ExternalSyntheticLambda4();
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private x2ExternalSyntheticLambda4() {
    }

    public final long onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onExtraCallback + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1372553927, i, -1, "im.toss.tds.compose.component.compound.stepperrow.TdsStepperRowV1Defaults.<get-titleColor> (TdsStepperRowV1Defaults.kt:16)");
            if (i5 == 0) {
                int i6 = 23 / 0;
            }
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextPrimary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return jOnExtraCallback;
    }

    public final long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            int i3 = onExtraCallback + 73;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2101810499, i, -1, "im.toss.tds.compose.component.compound.stepperrow.TdsStepperRowV1Defaults.<get-subtitleColor> (TdsStepperRowV1Defaults.kt:21)");
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextTertiary, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onNavigationEvent + 65;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return jOnExtraCallback;
    }
}
