package viva.republica.toss.main.more;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zziea;
import im.toss.base.BaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.sf.scuba.smartcards.BuildConfig;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.ContainerHelpers;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DERTaggedObject;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.QuirksExternalSyntheticBackport0;
import o.canExtendToken;
import o.clearValueCallback;
import o.getBacktraceNote;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.Nullable;

@DERTaggedObject
/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class CalendarWebMessageTestActivity extends BaseActivity {
    public long getScreenId() {
        return -1L;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(-282393110, true, new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivity$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return CalendarWebMessageTestActivity.onNavigationEvent(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
            }
        })), 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(final CalendarWebMessageTestActivity calendarWebMessageTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-282393110, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestActivity.onCreate.<anonymous> (CalendarWebMessageTestActivity.kt:61)");
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(-241767022, true, new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivity$$ExternalSyntheticLambda1
                public final Object invoke(Object obj, Object obj2) {
                    return CalendarWebMessageTestActivity.onWarmupCompleted(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final CalendarWebMessageTestActivity calendarWebMessageTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-241767022, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestActivity.onCreate.<anonymous>.<anonymous> (CalendarWebMessageTestActivity.kt:62)");
            }
            clearValueCallback.onWarmupCompleted(new Object[]{ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), null, ForwardingCameraControl.onExtraCallback(-191613250, true, new Function2() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivity$$ExternalSyntheticLambda3
                public final Object invoke(Object obj, Object obj2) {
                    return CalendarWebMessageTestActivity.IAuthTabCallbackStub(this.f$0, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(1219011307, true, new getBacktraceNote() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivity$$ExternalSyntheticLambda4
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CalendarWebMessageTestActivity.onNavigationEvent(this.f$0, (DeviceQuirksExternalSyntheticLambda0) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 390, 48, 2042}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IAuthTabCallback(CalendarWebMessageTestActivity calendarWebMessageTestActivity) {
        calendarWebMessageTestActivity.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit IAuthTabCallbackStub(final CalendarWebMessageTestActivity calendarWebMessageTestActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-191613250, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CalendarWebMessageTestActivity.kt:65)");
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(calendarWebMessageTestActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    Function0 function0 = new Function0() { // from class: viva.republica.toss.main.more.CalendarWebMessageTestActivity$$ExternalSyntheticLambda2
                        public final Object invoke() {
                            return CalendarWebMessageTestActivity.IAuthTabCallback(this.f$0);
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0);
                    obj = function0;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, ContainerHelpers.onNavigationEvent.onExtraCallback(), cameraCaptureResultEmptyCameraCaptureResult, 12582912, 126);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onNavigationEvent(CalendarWebMessageTestActivity calendarWebMessageTestActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, BuildConfig.FLAVOR);
        if ((i & 6) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1219011307, i, -1, "viva.republica.toss.main.more.CalendarWebMessageTestActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (CalendarWebMessageTestActivity.kt:71)");
            }
            canExtendToken.IAuthTabCallback(calendarWebMessageTestActivity, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), deviceQuirksExternalSyntheticLambda0), cameraCaptureResultEmptyCameraCaptureResult, 0, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    public String getScreenName() {
        return "CalendarWebMessageTestActivity";
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
