package o;

import im.toss.tds.compose.component.compound.listheader.v3.RightPreset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.WebViewProviderAdapterExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewProviderAdapterExternalSyntheticLambda1 {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public static final WebViewProviderAdapterExternalSyntheticLambda1 onExtraCallback = new WebViewProviderAdapterExternalSyntheticLambda1();
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(144995378, false, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.ComposableSingletons$NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 63;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitIAuthTabCallback = WebViewProviderAdapterExternalSyntheticLambda1.IAuthTabCallback((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onNavigationEvent + 31;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitIAuthTabCallback;
        }
    });
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-887017586, false, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.ComposableSingletons$NativeAdsBpsLeadFormCardKt$$ExternalSyntheticLambda1
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 85;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = WebViewProviderAdapterExternalSyntheticLambda1.onWarmupCompleted((RightPreset) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
            int i4 = onExtraCallbackWithResult + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }
    });

    public static /* synthetic */ Unit IAuthTabCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 17;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i2 + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 47;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        int i4 = i2 + 103;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    static {
        int i = IAuthTabCallbackDefault + 27;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 17) != 16, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 47;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(144995378, i, -1, "im.toss.ads_sdk.ui.compose.bps.ComposableSingletons$NativeAdsBpsLeadFormCardKt.lambda$144995378.<anonymous> (NativeAdsBpsLeadFormCard.kt:71)");
            }
            WebViewProviderAdapterExternalSyntheticLambda3.IAuthTabCallback(null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            z = (i & 115) != 0;
        } else {
            Intrinsics.checkNotNullParameter(rightPreset, "");
            if ((i & 17) != 16) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onWarmupCompleted + 111;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-887017586, i, -1, "im.toss.ads_sdk.ui.compose.bps.ComposableSingletons$NativeAdsBpsLeadFormCardKt.lambda$-887017586.<anonymous> (NativeAdsBpsLeadFormCard.kt:155)");
                    int i5 = 45 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-887017586, i, -1, "im.toss.ads_sdk.ui.compose.bps.ComposableSingletons$NativeAdsBpsLeadFormCardKt.lambda$-887017586.<anonymous> (NativeAdsBpsLeadFormCard.kt:155)");
                }
            }
            WebViewProviderAdapterExternalSyntheticLambda3.IAuthTabCallback(null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i6 = onNavigationEvent + 39;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }
}
