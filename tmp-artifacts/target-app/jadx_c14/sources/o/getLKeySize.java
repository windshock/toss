package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.areCachedAdResourcesMissing;
import o.getLKeySize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getLKeySize {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(areCachedAdResourcesMissing arecachedadresourcesmissing, int i, hasProvider hasprovider, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        onExtraCallback(arecachedadresourcesmissing, i, hasprovider, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void onExtraCallback(@NotNull final areCachedAdResourcesMissing arecachedadresourcesmissing, final int i, @NotNull final hasProvider hasprovider, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i2) {
        int i3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        Intrinsics.checkNotNullParameter(hasprovider, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2073904523);
        if ((i2 & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(hasprovider) ? 256 : 128;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2073904523, i3, -1, "viva.republica.toss.cardrecommend.issuev2.ui.NestedUnorderedList (CardIssueFreeformFragment.kt:319)");
            }
            if (i > 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(585195926);
                arecachedadresourcesmissing.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, 0, 0.0f, 0L, (GraphicDeviceInfo) null, (DeviceQuirksExternalSyntheticLambda0) null, ForwardingCameraControl.onExtraCallback(137851341, true, new getBacktraceNote() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragmentKt$$ExternalSyntheticLambda0
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return getLKeySize.onExtraCallbackWithResult(i, hasprovider, (areCachedAdResourcesMissing) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 << 21) & 29360128) | 1572864, 63);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(585296428);
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                arecachedadresourcesmissing.onExtraCallback(hasprovider, (QuirksExternalSyntheticBackport0) null, 0L, (GraphicDeviceInfo) null, 0L, (GraphicDeviceInfo) null, (handshake) null, (Integer) null, 0, 0.0f, cameraCaptureResultEmptyCameraCaptureResult2, (i3 >> 6) & 14, i3 & 14, 1022);
                cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: viva.republica.toss.cardrecommend.issuev2.ui.CardIssueFreeformFragmentKt$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return getLKeySize.onExtraCallbackWithResult(arecachedadresourcesmissing, i, hasprovider, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(int i, hasProvider hasprovider, areCachedAdResourcesMissing arecachedadresourcesmissing, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Intrinsics.checkNotNullParameter(arecachedadresourcesmissing, "");
        if ((i2 & 6) == 0) {
            i2 |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(arecachedadresourcesmissing) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(137851341, i2, -1, "viva.republica.toss.cardrecommend.issuev2.ui.NestedUnorderedList.<anonymous> (CardIssueFreeformFragment.kt:322)");
            }
            onExtraCallback(arecachedadresourcesmissing, i - 1, hasprovider, cameraCaptureResultEmptyCameraCaptureResult, i2 & 14);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
