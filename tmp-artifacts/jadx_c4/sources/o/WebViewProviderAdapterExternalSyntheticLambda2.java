package o;

import im.toss.tds.compose.component.compound.listheader.v3.RightPreset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.WebViewProviderAdapterExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewProviderAdapterExternalSyntheticLambda2 {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent;
    public static final WebViewProviderAdapterExternalSyntheticLambda2 onExtraCallback = new WebViewProviderAdapterExternalSyntheticLambda2();
    private static getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1979289618, false, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.bps.ComposableSingletons$NativeAdsBpsMultiImageCardKt$$ExternalSyntheticLambda0
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public final Object invoke(Object obj, Object obj2, Object obj3) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 83;
            IAuthTabCallback = i2 % 128;
            RightPreset rightPreset = (RightPreset) obj;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
            if (i2 % 2 != 0) {
                return WebViewProviderAdapterExternalSyntheticLambda2.onWarmupCompleted(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
            }
            int i3 = 2 / 0;
            return WebViewProviderAdapterExternalSyntheticLambda2.onWarmupCompleted(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
        }
    });

    public static /* synthetic */ Unit onWarmupCompleted(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(rightPreset, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    public final getBacktraceNote<RightPreset, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallbackStub + 63;
        onNavigationEvent = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(RightPreset rightPreset, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rightPreset, "");
        if ((i & 17) != 16) {
            int i3 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1979289618, i, -1, "im.toss.ads_sdk.ui.compose.bps.ComposableSingletons$NativeAdsBpsMultiImageCardKt.lambda$1979289618.<anonymous> (NativeAdsBpsMultiImageCard.kt:59)");
            }
            WebViewProviderAdapterExternalSyntheticLambda3.IAuthTabCallback(null, cameraCaptureResultEmptyCameraCaptureResult, 0, 1);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i6 = onExtraCallbackWithResult + 27;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        return Unit.INSTANCE;
    }
}
