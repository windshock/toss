package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1pSDK;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.HighSpeedResolverExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1pSDK {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    public static final AFg1pSDK onWarmupCompleted = new AFg1pSDK();
    private static getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(1606675083, false, new getBacktraceNote() { // from class: im.toss.tosssecurities.uikit.extension.ComposableSingletons$NoticeIconKt$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // o.getBacktraceNote
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 33;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = AFg1pSDK.onNavigationEvent((HighSpeedResolverExternalSyntheticLambda2) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onWarmupCompleted + 79;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 48 / 0;
            }
            return unitOnNavigationEvent;
        }
    });

    public static /* synthetic */ Unit onNavigationEvent(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(highSpeedResolverExternalSyntheticLambda2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public final getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        getBacktraceNote<HighSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 83;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            getbacktracenote = onExtraCallback;
            int i4 = 80 / 0;
        } else {
            getbacktracenote = onExtraCallback;
        }
        int i5 = i2 + 95;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 85 / 0;
        }
        return getbacktracenote;
    }

    static {
        int i = IAuthTabCallback + 15;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
            if ((i & 51) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2) ? 4 : 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(highSpeedResolverExternalSyntheticLambda2, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i & 19) != 18) {
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 59;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1606675083, i, -1, "im.toss.tosssecurities.uikit.extension.ComposableSingletons$NoticeIconKt.lambda$1606675083.<anonymous> (NoticeIcon.kt:35)");
                    int i7 = 89 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1606675083, i, -1, "im.toss.tosssecurities.uikit.extension.ComposableSingletons$NoticeIconKt.lambda$1606675083.<anonymous> (NoticeIcon.kt:35)");
                }
            }
            AFg1vSDK.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(QuirksExternalSyntheticBackport0.Companion, QuirkSettingsLoader.Companion.IAuthTabCallback()), 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i8 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 5;
            }
        }
        return Unit.INSTANCE;
    }
}
