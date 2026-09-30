package o;

import im.toss.features.home.feature.asset_home.R;
import im.toss.features.home.feature.asset_home.activity.ComposableSingletons$AssetHomeEditNavActivityKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.getPrivacyDestinationUri;
import o.setCallToAction;
import o.toPreviewOnlyRange;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVRpcResponse {
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public static final RVRpcResponse onExtraCallbackWithResult = new RVRpcResponse();
    private static getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-598110081, false, new ComposableSingletons$AssetHomeEditNavActivityKt$.ExternalSyntheticLambda0());

    public static /* synthetic */ Unit onNavigationEvent(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallback + 65;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public final getBacktraceNote<DeviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 3;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = IAuthTabCallbackDefault + 71;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        Throwable th;
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 53;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            z = (i & 2) != 64;
        } else {
            Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i4 = onNavigationEvent + 77;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 86 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-598110081, i, -1, "im.toss.features.home.feature.asset_home.activity.ComposableSingletons$AssetHomeEditNavActivityKt.lambda$-598110081.<anonymous> (AssetHomeEditNavActivity.kt:230)");
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i6 = onNavigationEvent + 57;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        getAwbState.onExtraCallback();
                        int i7 = 31 / 0;
                    } else {
                        getAwbState.onExtraCallback();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                th = null;
                x2ExternalSyntheticLambda13.onNavigationEvent((QuirksExternalSyntheticBackport0) null, 0L, 0.0f, (getPrivacyDestinationUri.onExtraCallbackWithResult) null, 0L, (String) null, (deprecated_followRedirects) null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_unsupported_type_error_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), (Function0) null, (String) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 3967);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i8 = onNavigationEvent + 69;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null);
                component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.onExtraCallback(), false);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent2);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda12 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                th = null;
                x2ExternalSyntheticLambda13.onNavigationEvent((QuirksExternalSyntheticBackport0) null, 0L, 0.0f, (getPrivacyDestinationUri.onExtraCallbackWithResult) null, 0L, (String) null, (deprecated_followRedirects) null, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.home_v2_feature_asset_home_unsupported_type_error_subtitle, cameraCaptureResultEmptyCameraCaptureResult, 0), (Function0) null, (String) null, (setCallToAction.onWarmupCompleted) null, (setCallToAction.onExtraCallback) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 3967);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                }
            }
        } else {
            th = null;
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i10 = onNavigationEvent + 49;
        onExtraCallback = i10 % 128;
        if (i10 % 2 == 0) {
            return unit;
        }
        throw th;
    }
}
