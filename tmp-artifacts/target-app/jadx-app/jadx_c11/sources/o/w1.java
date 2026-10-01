package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.w1;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class w1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final w1 onExtraCallback = new w1();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(992599748, false, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomsheet.internal.ComposableSingletons$ModalBottomSheetKt$$ExternalSyntheticLambda0
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;

        public final Object invoke(Object obj, Object obj2) {
            Unit unitOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 != 0) {
                unitOnWarmupCompleted = w1.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                int i3 = 69 / 0;
            } else {
                unitOnWarmupCompleted = w1.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            }
            int i4 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 1;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onWarmupCompleted;
        int i5 = i2 + 27;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 3;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 91;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(992599748, i, -1, "im.toss.tds.compose.component.compound.bottomsheet.internal.ComposableSingletons$ModalBottomSheetKt.lambda$992599748.<anonymous> (ModalBottomSheet.kt:194)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 13;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
