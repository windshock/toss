package o;

import im.toss.features.mobileid.impl.glance.ComposableSingletons$MobileIdAppWidgetKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class handleResovleTask {
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onTransact = 1;
    public static final handleResovleTask onNavigationEvent = new handleResovleTask();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-1064631490, false, new ComposableSingletons$MobileIdAppWidgetKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(161474718, false, new ComposableSingletons$MobileIdAppWidgetKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        return unitIAuthTabCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 13;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            function2 = onWarmupCompleted;
            int i4 = 53 / 0;
        } else {
            function2 = onWarmupCompleted;
        }
        int i5 = i2 + 49;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onExtraCallback;
        int i5 = i2 + 101;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = IAuthTabCallbackStub + 101;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1064631490, i, -1, "im.toss.features.mobileid.impl.glance.ComposableSingletons$MobileIdAppWidgetKt.lambda$-1064631490.<anonymous> (MobileIdAppWidget.kt:17)");
                }
                toJSONStringZ.onExtraCallbackWithResult((RulerAlignmentKtExternalSyntheticLambda5) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                toJSONStringZ.onExtraCallbackWithResult((RulerAlignmentKtExternalSyntheticLambda5) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallbackWithResult + 11;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(161474718, i, -1, "im.toss.features.mobileid.impl.glance.ComposableSingletons$MobileIdAppWidgetKt.lambda$161474718.<anonymous> (MobileIdAppWidget.kt:35)");
            }
            toJSONStringZ.onExtraCallbackWithResult((RulerAlignmentKtExternalSyntheticLambda5) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i5 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
