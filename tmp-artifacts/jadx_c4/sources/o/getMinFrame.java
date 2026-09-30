package o;

import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getMinFrame {
    private static int asInterface = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final getMinFrame IAuthTabCallback = new getMinFrame();
    private static getBacktraceNote<removeAnimatorListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1342602060, false, new ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onExtraCallbackWithResult(removeAnimatorListener removeanimatorlistener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(removeanimatorlistener, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(removeanimatorlistener, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<removeAnimatorListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        getBacktraceNote<removeAnimatorListener, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i5 = i3 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        int i = asInterface + 113;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onNavigationEvent(removeAnimatorListener removeanimatorlistener, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(removeanimatorlistener, "");
        if ((i & 17) != 16) {
            int i3 = onNavigationEvent + 49;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onWarmupCompleted + 69;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1342602060, i, -1, "im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt.lambda$-1342602060.<anonymous> (TdsTopV1.kt:19)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onNavigationEvent + 39;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
