package o;

import androidx.compose.foundation.layout.RowScope;
import im.toss.uikit.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.setClipTextToBoundingBox;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setClipTextToBoundingBox {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final setClipTextToBoundingBox onNavigationEvent = new setClipTextToBoundingBox();
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1249335529, false, new getBacktraceNote() { // from class: im.toss.compose.v3.textfield.split.ComposableSingletons$SplitTextFieldKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 31;
            onWarmupCompleted = i3 % 128;
            RowScope rowScope = (RowScope) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i3 % 2 != 0) {
                return setClipTextToBoundingBox.onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            Unit unitOnWarmupCompleted = setClipTextToBoundingBox.onWarmupCompleted(rowScope, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            int i4 = 44 / 0;
            return unitOnWarmupCompleted;
        }
    });

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = onExtraCallbackWithResult + 89;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return unitOnNavigationEvent;
    }

    public final getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted;
        }
        throw null;
    }

    static {
        int i2 = IAuthTabCallbackStub + 41;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
    }

    private static final Unit onNavigationEvent(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1))) {
            int i4 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1249335529, i2, -1, "im.toss.compose.v3.textfield.split.ComposableSingletons$SplitTextFieldKt.lambda$-1249335529.<anonymous> (SplitTextField.kt:473)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.uikit_last_digits, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 / 4;
            }
        }
        return Unit.INSTANCE;
    }
}
