package o;

import androidx.compose.foundation.layout.RowScope;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.addTestDevices;
import o.w5a;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class addTestDevices {
    public static final addTestDevices onExtraCallbackWithResult = new addTestDevices();
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-418858025, false, new getBacktraceNote() { // from class: viva.republica.toss.main.update.ComposableSingletons$UpdateGuideTestActivityKt$$ExternalSyntheticLambda0
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return addTestDevices.onWarmupCompleted((RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
    });
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-53486305, false, new getBacktraceNote() { // from class: viva.republica.toss.main.update.ComposableSingletons$UpdateGuideTestActivityKt$$ExternalSyntheticLambda1
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return addTestDevices.onWarmupCompleted((w5a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
        }
    });

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        return onWarmupCompleted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(rowScope, BuildConfig.FLAVOR);
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-418858025, i, -1, "viva.republica.toss.main.update.ComposableSingletons$UpdateGuideTestActivityKt.lambda$-418858025.<anonymous> (UpdateGuideTestActivity.kt:33)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"강제업데이트 화면 띄우기", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Intrinsics.checkNotNullParameter(w5aVar, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-53486305, i, -1, "viva.republica.toss.main.update.ComposableSingletons$UpdateGuideTestActivityKt.lambda$-53486305.<anonymous> (UpdateGuideTestActivity.kt:33)");
            }
            w5aVar.onExtraCallback(IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }
}
