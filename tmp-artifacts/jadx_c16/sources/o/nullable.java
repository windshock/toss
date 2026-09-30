package o;

import im.toss.features.home.core.ui.compose.dst.personal_activity.ComposableSingletons$PersonalActivityCloseButtonKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class nullable {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    public static final nullable onExtraCallbackWithResult = new nullable();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1465838030, false, new ComposableSingletons$PersonalActivityCloseButtonKt$.ExternalSyntheticLambda1());
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 91 / 0;
        }
        int i6 = onExtraCallback + 13;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = onExtraCallback + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 33;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i4 = i2 + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }

    static {
        int i = IAuthTabCallback + 67;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1465838030, i, -1, "im.toss.features.home.core.ui.compose.dst.personal_activity.ComposableSingletons$PersonalActivityCloseButtonKt.lambda$1465838030.<anonymous> (PersonalActivityCloseButton.kt:38)");
            }
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new ComposableSingletons$PersonalActivityCloseButtonKt$.ExternalSyntheticLambda0();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                int i3 = onWarmupCompleted + 19;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
            }
            when.onWarmupCompleted((Function0) objOnMinimized, (QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = onExtraCallback + 71;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }
}
