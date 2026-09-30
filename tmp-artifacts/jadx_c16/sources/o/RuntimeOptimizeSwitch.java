package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.feature.credit.ui.history.detail.latest.CreditHistoryLoanDisclaimerActivityKt$;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RuntimeOptimizeSwitch {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;

    public static /* synthetic */ Unit onExtraCallback(String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onNavigationEvent + 103;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 21;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static final /* synthetic */ void onWarmupCompleted(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 30 / 0;
        }
        int i6 = IAuthTabCallback + 123;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        int i3 = 2 % 2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(624164220);
        if ((i & 6) == 0) {
            i2 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i2 & 3) != 2, i2 & 1)) {
            int i4 = IAuthTabCallback + 113;
            onNavigationEvent = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(624164220, i2, -1, "im.toss.feature.credit.ui.history.detail.latest.DisclaimerContent (CreditHistoryLoanDisclaimerActivity.kt:67)");
            }
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            AppLovinVastMediaVieweExternalSyntheticLambda0.onNavigationEvent(AppLovinCmpErrorCode.onNavigationEvent(str, (Function1) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i2 & 14, 2), CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(setContentInsetsAbsolute.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), setContentInsetsAbsolute.IAuthTabCallback(0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1), false, (Camera2CameraControlImplExternalSyntheticLambda2) null, false, 14, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f)), AppLovinPostbackService.onExtraCallbackWithResult.IAuthTabCallback_Parcel(), 0L, 0L, 0L, (handshake) null, (Integer) null, (createCameraCaptureCallback) null, 0.0f, (Map) null, (bindChildren) null, (use) null, 0L, 0, false, (GraphicDeviceInfo) null, (Function1) null, cameraCaptureResultEmptyCameraCaptureResult2, 0, 0, 262136);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            int i5 = onNavigationEvent + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new CreditHistoryLoanDisclaimerActivityKt$.ExternalSyntheticLambda0(str, i));
        }
        int i7 = IAuthTabCallback + 9;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }
}
