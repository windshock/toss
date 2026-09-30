package im.toss.appsintoss.iap;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tmoney.a;
import im.toss.appsintoss.iap.InAppPurchaseHistoryDisclaimerActivity$;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.LowLightBoostControlExternalSyntheticLambda0;
import o.LowLightBoostControlExternalSyntheticLambda1;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.RuleParser;
import o.component5;
import o.dequeImageProxy;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.getMidpointBetweenPoints;
import o.requestPostMessageChannelWithExtras;
import o.resolveQuirkNames;
import o.setAdVideoPlaybackListener;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.verifyDrawable;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InAppPurchaseHistoryDisclaimerActivity extends Hilt_InAppPurchaseHistoryDisclaimerActivity {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 1;
    private static int onTransact;

    static {
        int i = asBinder + 57;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(inAppPurchaseHistoryDisclaimerActivity);
        int i4 = IAuthTabCallbackStub + 103;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(inAppPurchaseHistoryDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(inAppPurchaseHistoryDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 69;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(inAppPurchaseHistoryDisclaimerActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onTransact + 33;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 99;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(inAppPurchaseHistoryDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(inAppPurchaseHistoryDisclaimerActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 111;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return -1L;
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDisclaimerActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(1514670855, true, new InAppPurchaseHistoryDisclaimerActivity$.ExternalSyntheticLambda2(this))), 1, (Object) null);
        int i2 = onTransact + 93;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity) {
        int i = 2 % 2;
        int i2 = onTransact + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        inAppPurchaseHistoryDisclaimerActivity.onBackPressed();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
            int i4 = onTransact + 75;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onTransact + 63;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(195092321, i2, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryDisclaimerActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (InAppPurchaseHistoryDisclaimerActivity.kt:36)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            Object obj = null;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null), y3ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 6).onNavigationEvent(), (toMetersPerSecond) null, 2, (Object) null);
            QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i8 = onTransact + 107;
                IAuthTabCallbackStub = i8 % 128;
                int i9 = i8 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i10 = IAuthTabCallbackStub + 65;
                onTransact = i10 % 128;
                if (i10 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    obj.hashCode();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                int i11 = IAuthTabCallbackStub + 119;
                onTransact = i11 % 128;
                int i12 = i11 % 2;
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
            int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, onextracallback);
            Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i13 = onTransact + 73;
                IAuthTabCallbackStub = i13 % 128;
                int i14 = i13 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
            LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(inAppPurchaseHistoryDisclaimerActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i15 = IAuthTabCallbackStub + 21;
                onTransact = i15 % 128;
                int i16 = i15 % 2;
                Object obj2 = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    InAppPurchaseHistoryDisclaimerActivity$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new InAppPurchaseHistoryDisclaimerActivity$.ExternalSyntheticLambda0(inAppPurchaseHistoryDisclaimerActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    obj2 = externalSyntheticLambda0;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj2, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                getMidpointBetweenPoints.onWarmupCompleted(a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), 1636332776, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), new Object[]{null, 0L, 0L, null, null, RuleParser.onExtraCallbackWithResult.IAuthTabCallback(), cameraCaptureResultEmptyCameraCaptureResult, 196608, 31}, -1636332773);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 51;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i5 = IAuthTabCallbackStub + 119;
            onTransact = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1971470431, i, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryDisclaimerActivity.onCreate.<anonymous>.<anonymous> (InAppPurchaseHistoryDisclaimerActivity.kt:32)");
            }
            getCameraCaptureCallback.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), (dequeImageProxy) null, (Function2) null, (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(195092321, true, new InAppPurchaseHistoryDisclaimerActivity$.ExternalSyntheticLambda1(inAppPurchaseHistoryDisclaimerActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6, 12582912, 131070);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i6 = onTransact + 53;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(InAppPurchaseHistoryDisclaimerActivity inAppPurchaseHistoryDisclaimerActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = IAuthTabCallbackStub + 39;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1514670855, i, -1, "im.toss.appsintoss.iap.InAppPurchaseHistoryDisclaimerActivity.onCreate.<anonymous> (InAppPurchaseHistoryDisclaimerActivity.kt:31)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(1971470431, true, new InAppPurchaseHistoryDisclaimerActivity$.ExternalSyntheticLambda3(inAppPurchaseHistoryDisclaimerActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i5 = onTransact + 23;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final Intent IAuthTabCallback(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intent intent = new Intent(context, (Class<?>) InAppPurchaseHistoryDisclaimerActivity.class);
            int i2 = onExtraCallbackWithResult + 39;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            return intent;
        }
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDisclaimerActivity
    public void onStart() {
        super.onStart();
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDisclaimerActivity
    public void onResume() {
        super.onResume();
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDisclaimerActivity
    public void onPause() {
        super.onPause();
    }

    @Override // im.toss.appsintoss.iap.Hilt_InAppPurchaseHistoryDisclaimerActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
