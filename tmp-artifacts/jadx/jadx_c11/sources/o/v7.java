package o;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class v7 {
    private static int IAuthTabCallback = 0;
    public static final v7 onExtraCallback = new v7();
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 25;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private v7() {
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 30 / 0;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2094212456, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1Defaults.<get-containerColor> (TdsDialogV1Defaults.kt:15)");
            }
        } else if (CameraConfigExternalSyntheticLambda0.asBinder()) {
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.BackgroundFloated100, cameraCaptureResultEmptyCameraCaptureResult, 6);
        Object obj = null;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 83;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i7 = IAuthTabCallback + 37;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return jOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final long onWarmupCompleted(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(316035802, i, -1, "im.toss.tds.compose.component.compound.dialog.TdsDialogV1Defaults.<get-textButtonTextColor> (TdsDialogV1Defaults.kt:19)");
        }
        long jOnExtraCallback = r8lambda0mXP1lARJCGaK_2UHpQyAqAQ.onExtraCallback(authParams.TextBrand, cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onWarmupCompleted + 91;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i7 = onWarmupCompleted + 49;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
        return jOnExtraCallback;
    }
}
