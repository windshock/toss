package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AFg1hSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1hSDK {
    private static int IAuthTabCallback = 1;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    public static final AFg1hSDK onWarmupCompleted = new AFg1hSDK();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1812367207, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.internal.ComposableSingletons$ModalBottomSheetKt$$ExternalSyntheticLambda0
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Unit unitOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 41;
            onExtraCallback = i2 % 128;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj;
            Integer num = (Integer) obj2;
            if (i2 % 2 != 0) {
                unitOnWarmupCompleted = AFg1hSDK.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
                int i3 = 32 / 0;
            } else {
                unitOnWarmupCompleted = AFg1hSDK.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, num.intValue());
            }
            int i4 = onExtraCallback + 51;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        int i3 = i2 % 128;
        IAuthTabCallback = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i4 = i3 + 91;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    static {
        int i = onExtraCallback + 47;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallback + 9;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1812367207, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.internal.ComposableSingletons$ModalBottomSheetKt.lambda$1812367207.<anonymous> (ModalBottomSheet.kt:187)");
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i9 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallbackWithResult = i9 % 128;
                int i10 = i9 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i11 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback = i11 % 128;
        int i12 = i11 % 2;
        return unit;
    }
}
