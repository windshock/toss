package o;

import im.toss.features.edoc.ComposableSingletons$EDocIssueCandidatesActivityKt$;
import im.toss.features.edoc.R;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.QuirkSettingsLoader;
import o.y1ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isNIOEnabled {
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 1;
    private static int onTransact;
    private static int onWarmupCompleted;
    public static final isNIOEnabled onExtraCallbackWithResult = new isNIOEnabled();
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1852164375, false, new ComposableSingletons$EDocIssueCandidatesActivityKt$.ExternalSyntheticLambda0());
    private static getBacktraceNote<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(1191724901, false, new ComposableSingletons$EDocIssueCandidatesActivityKt$.ExternalSyntheticLambda1());
    private static getBacktraceNote<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1389118436, false, new ComposableSingletons$EDocIssueCandidatesActivityKt$.ExternalSyntheticLambda2());

    public static /* synthetic */ Unit onExtraCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 29 / 0;
        }
        int i6 = asInterface + 125;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 69;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asInterface + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = asInterface + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public final getBacktraceNote<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i5 = i2 + 117;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<RequestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i4 = i3 + 67;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return getbacktracenote;
    }

    static {
        int i = IAuthTabCallbackDefault + 39;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1852164375, i, -1, "im.toss.features.edoc.ComposableSingletons$EDocIssueCandidatesActivityKt.lambda$-1852164375.<anonymous> (EDocIssueCandidatesActivity.kt:61)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.document_candidates_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 21;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onWarmupCompleted + 105;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface + 67;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            z = (i & 24) != 7;
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1191724901, i, -1, "im.toss.features.edoc.ComposableSingletons$EDocIssueCandidatesActivityKt.lambda$1191724901.<anonymous> (EDocIssueCandidatesActivity.kt:59)");
                int i4 = onWarmupCompleted + 69;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            y1ExternalSyntheticLambda6.onExtraCallbackWithResult(onExtraCallback, (QuirksExternalSyntheticBackport0) null, (y1ExternalSyntheticLambda0.onNavigationEvent) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, (getBacktraceNote) null, (getBacktraceNote) null, 0.0f, 0.0f, (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 16382);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onWarmupCompleted + 91;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(RequestMonitorRequestCompleteListenerExternalSyntheticLambda0 requestMonitorRequestCompleteListenerExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = asInterface + 105;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            z = (i & 106) != 116;
        } else {
            Intrinsics.checkNotNullParameter(requestMonitorRequestCompleteListenerExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 49;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1389118436, i, -1, "im.toss.features.edoc.ComposableSingletons$EDocIssueCandidatesActivityKt.lambda$-1389118436.<anonymous> (EDocIssueCandidatesActivity.kt:66)");
                int i6 = asInterface + 9;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
            ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(QuirksExternalSyntheticBackport0.Companion, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asInterface + 111;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
