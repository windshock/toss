package o;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zziea;
import im.toss.activitydelegate.DelegateActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.addTestDevice;
import o.getViewTypeCount;
import o.setMediationProvider;
import o.toPreviewOnlyRange;
import viva.republica.toss.R;
import viva.republica.toss.main.update.UpdateGuideActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class addTestDevice {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final DelegateActivity delegateActivity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(delegateActivity, BuildConfig.FLAVOR);
        requestPostMessageChannelWithExtras.onExtraCallback(delegateActivity, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1927183319, true, new Function2() { // from class: viva.republica.toss.main.update.UpdateGuideTestActivityKt$$ExternalSyntheticLambda4
            public final Object invoke(Object obj, Object obj2) {
                return addTestDevice.onExtraCallbackWithResult(delegateActivity, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })), 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(final DelegateActivity delegateActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1927183319, i, -1, "viva.republica.toss.main.update.startUpdateGuideActivity.<anonymous>.<anonymous> (UpdateGuideTestActivity.kt:23)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1043569535, true, new Function2() { // from class: viva.republica.toss.main.update.UpdateGuideTestActivityKt$$ExternalSyntheticLambda0
                public final Object invoke(Object obj, Object obj2) {
                    return addTestDevice.onExtraCallback(delegateActivity, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(final DelegateActivity delegateActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1043569535, i, -1, "viva.republica.toss.main.update.startUpdateGuideActivity.<anonymous>.<anonymous>.<anonymous> (UpdateGuideTestActivity.kt:24)");
            }
            clearValueCallback.onWarmupCompleted(new Object[]{null, null, null, false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(-1839512616, true, new getBacktraceNote() { // from class: viva.republica.toss.main.update.UpdateGuideTestActivityKt$$ExternalSyntheticLambda2
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return addTestDevice.onExtraCallbackWithResult(delegateActivity, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 0, 48, 2047}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onExtraCallbackWithResult(final DelegateActivity delegateActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1839512616, i2, -1, "viva.republica.toss.main.update.startUpdateGuideActivity.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UpdateGuideTestActivity.kt:25)");
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(QuirksExternalSyntheticBackport0.Companion, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null);
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), QuirkSettingsLoader.Companion.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenoteOnExtraCallback = addTestDevices.onExtraCallbackWithResult.onExtraCallback();
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(delegateActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnExtraCallback) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: viva.republica.toss.main.update.UpdateGuideTestActivityKt$$ExternalSyntheticLambda1
                        public final Object invoke() {
                            return addTestDevice.onWarmupCompleted(delegateActivity);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                w4.onExtraCallbackWithResult(getbacktracenoteOnExtraCallback, (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getBacktraceNote) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.onExtraCallback) null, (getViewTypeCount.IAuthTabCallback) null, (getViewTypeCount.IAuthTabCallbackStub) null, (getViewTypeCount.asInterface) null, (getViewTypeCount.onNavigationEvent) null, (getViewTypeCount.onTransact) null, (String) null, (Function0) obj, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, (getSubtitle) null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 114686);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(DelegateActivity delegateActivity) {
        setMediationProvider.onWarmupCompleted onwarmupcompleted = setMediationProvider.Companion;
        String string = delegateActivity.getString(R.string.check_version_update_message);
        Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
        String string2 = delegateActivity.getString(R.string.app_check_version_update_subtitle);
        Intrinsics.checkNotNullExpressionValue(string2, BuildConfig.FLAVOR);
        delegateActivity.startActivity(UpdateGuideActivity.Companion.IAuthTabCallback(delegateActivity, onwarmupcompleted.onExtraCallbackWithResult(string, string2)));
        return Unit.INSTANCE;
    }
}
