package o;

import im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeAssetFooterLookAndFeelKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class writeLong {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public static final writeLong IAuthTabCallback = new writeLong();
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1998709864, false, new ComposableSingletons$HomeAssetFooterLookAndFeelKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 123;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = onNavigationEvent;
        int i5 = i2 + 113;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        int i = onExtraCallback + 5;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = onExtraCallbackWithResult + 27;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 41;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1998709864, i, -1, "im.toss.features.home.core.ui.compose.dst.ComposableSingletons$HomeAssetFooterLookAndFeelKt.lambda$1998709864.<anonymous> (HomeAssetFooterLookAndFeel.kt:32)");
            }
            createExtensionInstance.IAuthTabCallback((QuirksExternalSyntheticBackport0) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
