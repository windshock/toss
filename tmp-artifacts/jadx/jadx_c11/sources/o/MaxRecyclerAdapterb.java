package o;

import com.google.android.gms.internal.ads.zzgc;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxRecyclerAdapterb {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    public static final MaxRecyclerAdapterb onExtraCallbackWithResult = new MaxRecyclerAdapterb();
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onNavigationEvent + 11;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 98 / 0;
        }
    }

    private MaxRecyclerAdapterb() {
    }

    public final MaxRecyclerAdaptera IAuthTabCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = IAuthTabCallback + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(990574129, i, -1, "im.toss.tds.compose.foundation.graphics.shadow.TdsShadows.<get-current> (TdsShadows.kt:32)");
        }
        MaxRecyclerAdaptera maxRecyclerAdapteraOnWarmupCompleted = y3ExternalSyntheticLambda0.onExtraCallback.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, 6);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = IAuthTabCallback + 61;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            int i7 = onWarmupCompleted + 103;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return maxRecyclerAdapteraOnWarmupCompleted;
    }

    public final MappingRedirectableLiveDataExternalSyntheticLambda1 onExtraCallback(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            CameraConfigExternalSyntheticLambda0.asBinder();
            throw null;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1197854785, i, -1, "im.toss.tds.compose.foundation.graphics.shadow.TdsShadows.<get-weakDown> (TdsShadows.kt:72)");
        }
        Object[] objArr = {IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i & 14)};
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        MappingRedirectableLiveDataExternalSyntheticLambda1 mappingRedirectableLiveDataExternalSyntheticLambda1 = (MappingRedirectableLiveDataExternalSyntheticLambda1) MaxRecyclerAdaptera.onNavigationEvent(objArr, 125729606, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -125729606, zzgc.onExtraCallbackWithResult());
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = IAuthTabCallback + 89;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i5 == 0) {
                throw null;
            }
        }
        return mappingRedirectableLiveDataExternalSyntheticLambda1;
    }
}
