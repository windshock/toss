package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class p8 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final getCmpMessage onWarmupCompleted(long j, @NotNull Function2<? super p6, ? super o7d, Unit> function2, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            j = 500;
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1242579345, i, -1, "im.toss.securities.core.exposure.v2.tracker.rememberExposureTrackerV2 (DelayedExposureTrackerV2.kt:37)");
        }
        if (((i & 112) ^ 48) > 32) {
            int i4 = onExtraCallbackWithResult + 113;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2);
                throw null;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function2)) {
                z = (i & 48) == 32;
            }
        }
        if (((i & 14) ^ 6) > 4) {
            int i5 = onExtraCallbackWithResult + 107;
            onExtraCallback = i5 % 128;
            if (i5 % 2 != 0 ? !cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j) : !cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j)) {
                if ((i & 6) == 4) {
                    int i6 = onExtraCallback + 15;
                    onExtraCallbackWithResult = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    int i8 = onExtraCallback + 99;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 4 / 2;
                    }
                    z2 = false;
                }
            }
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (!(z | z2)) {
            int i10 = onExtraCallbackWithResult + 21;
            onExtraCallback = i10 % 128;
            int i11 = i10 % 2;
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new getCmpCode(j, function2);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
        }
        getCmpCode getcmpcode = (getCmpCode) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i12 = onExtraCallback + 15;
        onExtraCallbackWithResult = i12 % 128;
        if (i12 % 2 == 0) {
            return getcmpcode;
        }
        throw null;
    }
}
