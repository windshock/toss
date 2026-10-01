package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AFg1eSDKAFa1uSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1eSDKAFa1uSDK {
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public static final AFg1eSDKAFa1uSDK onNavigationEvent = new AFg1eSDKAFa1uSDK();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(662883402, false, new Function2() { // from class: im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$TossSecTopSheetKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 33;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = AFg1eSDKAFa1uSDK.onWarmupCompleted((CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            int i4 = IAuthTabCallback + 59;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnWarmupCompleted;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    });

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallback + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onWarmupCompleted + 91;
        asInterface = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 69;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(662883402, i, -1, "im.toss.tosssecurities.uikit.compound.topsheet.ComposableSingletons$TossSecTopSheetKt.lambda$662883402.<anonymous> (TossSecTopSheet.kt:45)");
            }
            AFg1hSDKCompanion.onNavigationEvent.IAuthTabCallback(null, 0.0f, 0.0f, null, 0L, cameraCaptureResultEmptyCameraCaptureResult, 196608, 31);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onExtraCallbackWithResult + 65;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }
}
