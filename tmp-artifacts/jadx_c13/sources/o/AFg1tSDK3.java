package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1tSDK3;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.HighSpeedResolverExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1tSDK3 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onTransact = 1;
    private static int onWarmupCompleted;
    public static final AFg1tSDK3 IAuthTabCallback = new AFg1tSDK3();
    private static getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(516606115, false, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.extension.ComposableSingletons$FlagIconKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        @Override // o.getBacktraceNote
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = AFg1tSDK3.onExtraCallback((HighSpeedResolverExternalSyntheticLambda2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallback + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }
    });

    public static /* synthetic */ Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public final getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 99;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i5 = i3 + 123;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = onTransact + 111;
        onExtraCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
        if ((i & 6) == 0) {
            int i4 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2)) {
                i2 = 4;
            } else {
                int i6 = onExtraCallbackWithResult + 125;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(516606115, i, -1, "im.toss.tosssecurities.uikit.extension.ComposableSingletons$FlagIconKt.lambda$516606115.<anonymous> (FlagIcon.kt:43)");
            }
            AFg1uSDKAFa1zSDK.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.IAuthTabCallback()), null, 0.0f, cameraCaptureResultEmptyCameraCaptureResult, 0, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i8 % 128;
                if (i8 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
