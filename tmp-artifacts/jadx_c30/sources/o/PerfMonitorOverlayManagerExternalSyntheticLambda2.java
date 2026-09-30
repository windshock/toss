package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.PerfMonitorOverlayManagerExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PerfMonitorOverlayManagerExternalSyntheticLambda2 {
    public static final PerfMonitorOverlayManagerExternalSyntheticLambda2 onWarmupCompleted = new PerfMonitorOverlayManagerExternalSyntheticLambda2();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(1621244498, false, new Function2() { // from class: viva.republica.toss.tosspaymoney.ui.composable.ComposableSingletons$OverlayLayoutKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return PerfMonitorOverlayManagerExternalSyntheticLambda2.onExtraCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(2052161299, false, new Function2() { // from class: viva.republica.toss.tosspaymoney.ui.composable.ComposableSingletons$OverlayLayoutKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2) {
            return PerfMonitorOverlayManagerExternalSyntheticLambda2.onExtraCallbackWithResult((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        return onExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        return onExtraCallbackWithResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1621244498, i, -1, "viva.republica.toss.tosspaymoney.ui.composable.ComposableSingletons$OverlayLayoutKt.lambda$1621244498.<anonymous> (OverlayLayout.kt:41)");
            }
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("Base Text", (QuirksExternalSyntheticBackport0) null, 0L, 0L, (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2052161299, i, -1, "viva.republica.toss.tosspaymoney.ui.composable.ComposableSingletons$OverlayLayoutKt.lambda$2052161299.<anonymous> (OverlayLayout.kt:46)");
            }
            PreviewExternalSyntheticLambda3.onExtraCallbackWithResult("Overlay BigText", ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(300.0f)), 0L, RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(30), (use) null, (GraphicDeviceInfo) null, (getSurfaceSize) null, 0L, (bindChildren) null, (createCameraCaptureCallback) null, 0L, 0, false, 0, 0, (Function1) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, 3126, 0, 131060);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
