package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.getMHybridDataannotations;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getMHybridDataannotations {
    public static final getMHybridDataannotations onExtraCallbackWithResult = new getMHybridDataannotations();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1278174504, false, new Function2() { // from class: viva.republica.toss.tosssecurities.ComposableSingletons$TossSecuritiesMultiImageViewerActivityKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2) {
            return getMHybridDataannotations.IAuthTabCallback((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        return onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1278174504, i, -1, "viva.republica.toss.tosssecurities.ComposableSingletons$TossSecuritiesMultiImageViewerActivityKt.lambda$1278174504.<anonymous> (TossSecuritiesMultiImageViewerActivity.kt:235)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
