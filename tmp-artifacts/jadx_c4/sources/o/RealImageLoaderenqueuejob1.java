package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealImageLoaderenqueuejob1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public static final getSupportedHighSpeedResolutionsFor<selectParentResolutions> IAuthTabCallback(@NotNull String str, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if ((i2 & 2) != 0) {
            z = true;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(516521089, i, -1, "im.toss.components.compose.extensions.rememberInitTextFieldValueState (TextFieldValue.kt:13)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            int i4 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            objOnMinimized = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new selectParentResolutions(str, !z ? getNumberOfTargets.Companion.onNavigationEvent() : TargetUtils.onExtraCallback(str.length(), str.length()), (getNumberOfTargets) null, 4, (DefaultConstructorMarker) null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i5 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        getSupportedHighSpeedResolutionsFor<selectParentResolutions> getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return getsupportedhighspeedresolutionsfor;
    }
}
