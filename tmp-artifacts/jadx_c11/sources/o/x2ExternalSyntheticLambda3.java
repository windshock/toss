package o;

import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class x2ExternalSyntheticLambda3 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final x2ExternalSyntheticLambda28 onExtraCallbackWithResult(boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback;
        int i5 = i4 + 123;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 11;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i9 = IAuthTabCallback + 95;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-321231929, i, -1, "im.toss.tds.compose.component.compound.skeleton.rememberTdsSkeletonState (TdsSkeletonState.kt:32)");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-321231929, i, -1, "im.toss.tds.compose.component.compound.skeleton.rememberTdsSkeletonState (TdsSkeletonState.kt:32)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new x2ExternalSyntheticLambda26(z);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            int i10 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
        }
        x2ExternalSyntheticLambda26 x2externalsyntheticlambda26 = (x2ExternalSyntheticLambda26) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i12 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i12 % 128;
            int i13 = i12 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i13 == 0) {
                int i14 = 91 / 0;
            }
        }
        int i15 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i15 % 128;
        int i16 = i15 % 2;
        return x2externalsyntheticlambda26;
    }
}
