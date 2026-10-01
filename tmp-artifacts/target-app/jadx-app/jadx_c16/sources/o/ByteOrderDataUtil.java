package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.home.core.ui.compose.HomeGraphicKt$;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AccessControllerApplyCallback;
import o.getViewTypeCount;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ByteOrderDataUtil {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    private static final Unit IAuthTabCallback(w3b w3bVar, AccessControllerApplyCallback accessControllerApplyCallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        IAuthTabCallback(w3bVar, accessControllerApplyCallback, cameraCaptureResultEmptyCameraCaptureResult, i4 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(i) : RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onNavigationEvent(w3b w3bVar, AccessControllerApplyCallback accessControllerApplyCallback, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws NoWhenBranchMatchedException {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 43;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return IAuthTabCallback(w3bVar, accessControllerApplyCallback, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        IAuthTabCallback(w3bVar, accessControllerApplyCallback, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[PHI: r0
      0x0047: PHI (r0v11 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v12 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0039, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[PHI: r0
      0x003b: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v12 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x0039, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@NotNull w3b w3bVar, @NotNull AccessControllerApplyCallback accessControllerApplyCallback, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i2;
        boolean z;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int iOnNavigationEvent;
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            Intrinsics.checkNotNullParameter(accessControllerApplyCallback, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1741583597);
            if ((i & 91) == 0) {
                i2 = (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(w3bVar) ? 2 : 4) | i;
            } else {
                int i5 = onExtraCallbackWithResult + 65;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(w3bVar, "");
            Intrinsics.checkNotNullParameter(accessControllerApplyCallback, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1741583597);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            int i7 = onExtraCallback + 73;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            i2 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(accessControllerApplyCallback) ? 32 : 16;
        }
        int i9 = i2;
        if ((i9 & 19) != 18) {
            z = true;
        } else {
            int i10 = onExtraCallback + 67;
            onExtraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i9 & 1)) {
            int i12 = onExtraCallbackWithResult + 97;
            onExtraCallback = i12 % 128;
            int i13 = i12 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1741583597, i9, -1, "im.toss.features.home.core.ui.compose.HomeLeftIconCircle (HomeGraphic.kt:14)");
            }
            String strOnExtraCallback = accessControllerApplyCallback.onExtraCallback();
            getViewTypeCount.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallback onextracallback = getViewTypeCount.onExtraCallbackWithResult.IAuthTabCallback.onExtraCallback.Masking;
            if (accessControllerApplyCallback instanceof AccessControllerApplyCallback.onNavigationEvent) {
                iOnNavigationEvent = 1;
            } else {
                if (!(accessControllerApplyCallback instanceof AccessControllerApplyCallback.IAuthTabCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = onExtraCallbackWithResult + 51;
                onExtraCallback = i14 % 128;
                int i15 = i14 % 2;
                iOnNavigationEvent = ((AccessControllerApplyCallback.IAuthTabCallback) accessControllerApplyCallback).onNavigationEvent();
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            w3bVar.onExtraCallbackWithResult(strOnExtraCallback, onextracallback, (QuirksExternalSyntheticBackport0) null, 0L, 0L, iOnNavigationEvent, 0.0f, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult2, 48, (i9 << 6) & 896, 4060);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i16 = onExtraCallback + 23;
                onExtraCallbackWithResult = i16 % 128;
                int i17 = i16 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new HomeGraphicKt$.ExternalSyntheticLambda0(w3bVar, accessControllerApplyCallback, i));
        }
    }
}
