package o;

import im.toss.features.home.feature.consumption_hidden.ComposableSingletons$ConsumptionHiddenActivityKt$;
import im.toss.features.home.feature.consumption_hidden.ConsumptionHiddenViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class parseJsApiPermission {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public static final parseJsApiPermission IAuthTabCallback = new parseJsApiPermission();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(615725325, false, new ComposableSingletons$ConsumptionHiddenActivityKt$.ExternalSyntheticLambda0());
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(158925749, false, new ComposableSingletons$ConsumptionHiddenActivityKt$.ExternalSyntheticLambda1());

    public static /* synthetic */ Unit onExtraCallbackWithResult(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 79;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 45;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 115;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 103;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 41;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i5 = i2 + 9;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 3) != 2) {
            int i6 = i3 + 35;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onExtraCallback + 15;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onExtraCallback + 57;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(615725325, i, -1, "im.toss.features.home.feature.consumption_hidden.ComposableSingletons$ConsumptionHiddenActivityKt.lambda$615725325.<anonymous> (ConsumptionHiddenActivity.kt:27)");
            }
            PermissionConstant.onNavigationEvent((ConsumptionHiddenViewModel) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 23;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onExtraCallback + 117;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(158925749, i, -1, "im.toss.features.home.feature.consumption_hidden.ComposableSingletons$ConsumptionHiddenActivityKt.lambda$158925749.<anonymous> (ConsumptionHiddenActivity.kt:26)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(onWarmupCompleted, cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
