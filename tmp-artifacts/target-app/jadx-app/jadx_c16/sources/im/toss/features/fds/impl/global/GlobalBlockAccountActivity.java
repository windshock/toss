package im.toss.features.fds.impl.global;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.zziea;
import im.toss.base.BaseActivity;
import im.toss.features.fds.impl.global.GlobalBlockAccountActivity$;
import im.toss.features.teens.cvscash.CvsCashTransactionActivity$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigBuilder;
import o.CameraConfigExternalSyntheticLambda0;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.ForwardingCameraControl;
import o.IConsoleView;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.MaxAdViewAdapterListener;
import o.MaxRewardedInterstitialAdapter;
import o.PreviewOrientationIncorrectQuirk;
import o.QuirksExternalSyntheticBackport0;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.TorchIsClosedAfterImageCapturingQuirk;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import o.UseTorchAsFlashQuirk;
import o.ZslDisablerQuirk;
import o.clearValueCallback;
import o.getBacktraceNote;
import o.requestPostMessageChannelWithExtras;
import o.setAdVideoPlaybackListener;
import o.y1hExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class GlobalBlockAccountActivity extends BaseActivity {
    public static final onNavigationEvent Companion;
    private static short[] IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub;
    private static int asBinder;
    private static int asInterface;
    private static int getInterfaceDescriptor;
    private static byte[] onTransact;
    private static final byte[] $$a = {111, -53, -88, 102};
    private static final int $$b = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int access100 = 1;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i) {
        int i2;
        int i3;
        int i4 = 115 - (b * 4);
        int i5 = (i * 4) + 1;
        byte[] bArr = $$a;
        int i6 = 3 - (s * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            int i8 = i6;
            int i9 = (-i6) + i7;
            i2 = i3;
            int i10 = i8;
            i4 = i9;
            i6 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            int i11 = i6 + 1;
            int i12 = i4;
            i8 = i11;
            i6 = bArr[i11];
            i7 = i12;
            int i92 = (-i6) + i7;
            i2 = i3;
            int i102 = i8;
            i4 = i92;
            i6 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    static {
        getInterfaceDescriptor = 0;
        onNavigationEvent();
        Companion = new onNavigationEvent(null);
        int i = access100 + 123;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit IAuthTabCallback(GlobalBlockAccountActivity globalBlockAccountActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 119;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(globalBlockAccountActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 88 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallback(GlobalBlockAccountActivity globalBlockAccountActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 87;
        access000 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            IAuthTabCallbackDefault(globalBlockAccountActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(globalBlockAccountActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = IAuthTabCallbackStubProxy + 49;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackDefault;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalBlockAccountActivity globalBlockAccountActivity) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        Unit unit = (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted3, 1687482817, new Object[]{globalBlockAccountActivity}, iOnWarmupCompleted, iOnWarmupCompleted2, -1687482817);
        int i4 = IAuthTabCallbackStubProxy + 19;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GlobalBlockAccountActivity globalBlockAccountActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access000 + 85;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(globalBlockAccountActivity, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallbackStubProxy + 25;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~(i3 | i6);
        int i10 = i7 | (~i6);
        int i11 = i9 | (~(i10 | i4));
        int i12 = (~i4) | i10;
        int i13 = i3 + i6 + i5 + (770105990 * i2) + ((-157043368) * i);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i3) - 1432092672) + ((-1000312294) * i6) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i5) + ((-2121269248) * i2) + (1950351360 * i) + ((-66846720) * i14);
        int i16 = (i3 * 105828664) + 1394048361 + (i6 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i5 * 105828275) + (i2 * (-227623502)) + (i * 619312264) + (i14 * 1925971968);
        return i15 + ((i16 * i16) * 261881856) != 1 ? onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(GlobalBlockAccountActivity globalBlockAccountActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access000 + 69;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallbackWithResult(globalBlockAccountActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(globalBlockAccountActivity, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 77;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 99;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public boolean postMessage() {
        int i = 2 % 2;
        int i2 = access000 + 23;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 1;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = access000 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("EXTRA_SERVICE_REFERRER");
        int i4 = access000 + 87;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 109;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = getIntent().getStringExtra("EXTRA_REFERRER");
        int i4 = IAuthTabCallbackStubProxy + 55;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        BaseActivity baseActivity = (GlobalBlockAccountActivity) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String stringExtra = baseActivity.getIntent().getStringExtra("unblock-type");
        int i4 = access000 + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return stringExtra;
    }

    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        requestPostMessageChannelWithExtras.onExtraCallback(this, (CameraConfigBuilder) null, setAdVideoPlaybackListener.onWarmupCompleted(ForwardingCameraControl.onExtraCallbackWithResult(983121756, true, new GlobalBlockAccountActivity$.ExternalSyntheticLambda4(this))), 1, (Object) null);
        int i2 = IAuthTabCallbackStubProxy + 111;
        access000 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackDefault(GlobalBlockAccountActivity globalBlockAccountActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = access000 + 123;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 4) != 3, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a((short) (40 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (byte) (107 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (-885468320) - Color.red(0), (-1059695347) - TextUtils.getOffsetBefore("", 0), (-1810900212) - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(100784648, i, -1, ((String) objArr[0]).intern());
                int i4 = IAuthTabCallbackStubProxy + 35;
                access000 = i4 % 128;
                int i5 = i4 % 2;
            }
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(globalBlockAccountActivity);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                Object obj = objOnMinimized;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    GlobalBlockAccountActivity$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new GlobalBlockAccountActivity$.ExternalSyntheticLambda0(globalBlockAccountActivity);
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(externalSyntheticLambda0);
                    obj = externalSyntheticLambda0;
                }
                MaxAdViewAdapterListener.onWarmupCompleted((Function0) obj, (QuirksExternalSyntheticBackport0) null, (MaxRewardedInterstitialAdapter.onExtraCallback) null, 0L, 0L, (DeviceQuirksExternalSyntheticLambda0) null, (getBacktraceNote) null, (getBacktraceNote) null, cameraCaptureResultEmptyCameraCaptureResult, 0, 254);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BaseActivity baseActivity = (GlobalBlockAccountActivity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 59;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        baseActivity.finishAffinity();
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(GlobalBlockAccountActivity globalBlockAccountActivity, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = access000 + 65;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(deviceQuirksExternalSyntheticLambda0, "");
        if ((i & 17) != 16) {
            int i5 = access000 + 73;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = access000 + 45;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = new Object[1];
                a((short) (98 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (byte) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 72), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 885468182, (-1059695347) - (ViewConfiguration.getWindowTouchSlop() >> 8), (-1810900212) - TextUtils.indexOf("", "", 0, 0), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-438581829, i, -1, ((String) objArr[0]).intern());
            }
            String strICustomTabsServiceStub = globalBlockAccountActivity.ICustomTabsServiceStub();
            String engagementSignalsCallback = globalBlockAccountActivity.setEngagementSignalsCallback();
            int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
            IConsoleView.IAuthTabCallback(engagementSignalsCallback, strICustomTabsServiceStub, (String) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), 1572597379, new Object[]{globalBlockAccountActivity}, iOnWarmupCompleted, iOnWarmupCompleted2, -1572597378), cameraCaptureResultEmptyCameraCaptureResult, 0);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(GlobalBlockAccountActivity globalBlockAccountActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            int i3 = access000 + 53;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i5 = access000 + 19;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStubProxy + 17;
                access000 = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr = new Object[1];
                a((short) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 88), (byte) ((-86) - ImageFormat.getBitsPerPixel(0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 885468447, ImageFormat.getBitsPerPixel(0) - 1059695346, (ViewConfiguration.getTouchSlop() >> 8) - 1810900224, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(896872116, i, -1, ((String) objArr[0]).intern());
            }
            clearValueCallback.onWarmupCompleted(new Object[]{UseTorchAsFlashQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), StillCaptureFlashStopRepeatingQuirk.onExtraCallback(ZslDisablerQuirk.onExtraCallback(PreviewOrientationIncorrectQuirk.Companion, cameraCaptureResultEmptyCameraCaptureResult, 6), TorchIsClosedAfterImageCapturingQuirk.Companion.access100())), null, ForwardingCameraControl.onExtraCallback(100784648, true, new GlobalBlockAccountActivity$.ExternalSyntheticLambda2(globalBlockAccountActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), false, null, null, null, 0, false, 0L, 0L, ForwardingCameraControl.onExtraCallback(-438581829, true, new GlobalBlockAccountActivity$.ExternalSyntheticLambda3(globalBlockAccountActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 48, 2042}, zziea.IAuthTabCallback(), zziea.IAuthTabCallback(), -274372088, zziea.IAuthTabCallback(), 274372088, zziea.IAuthTabCallback());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i8 = IAuthTabCallbackStubProxy + 107;
                access000 = i8 % 128;
                int i9 = i8 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onWarmupCompleted(GlobalBlockAccountActivity globalBlockAccountActivity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = IAuthTabCallbackStubProxy + 101;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                Object[] objArr = new Object[1];
                a((short) (-(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (byte) (127 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) - 885468560, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1059695347, (-1810900236) - TextUtils.getOffsetAfter("", 0), objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(983121756, i, -1, ((String) objArr[0]).intern());
            }
            y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(896872116, true, new GlobalBlockAccountActivity$.ExternalSyntheticLambda1(globalBlockAccountActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i5 = IAuthTabCallbackStubProxy + 51;
            access000 = i5 % 128;
            int i6 = i5 % 2;
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;

        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }

        public final Intent onExtraCallback(@NotNull Context context, @Nullable String str, @NotNull String str2, @NotNull String str3) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) GlobalBlockAccountActivity.class).putExtra("EXTRA_SERVICE_REFERRER", str2).putExtra("unblock-type", str3);
            if (str != null) {
                int i2 = onExtraCallbackWithResult + 79;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                intentPutExtra.putExtra("EXTRA_REFERRER", str);
                int i4 = onNavigationEvent + 21;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 % 4;
                }
            }
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        char c;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43423), 42 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 22439 - Color.alpha(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            float f = 0.0f;
            if (i5 != 0) {
                int i6 = $11 + 117;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = onTransact;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char mode = (char) (View.MeasureSpec.getMode(0) + 12843);
                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 56;
                                int i8 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 2167;
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(mode, bitsPerPixel, i8, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i7++;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onTransact;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, 22439 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackDefault[i + ((int) (asInterface ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (asInterface ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(asBinder), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getTrimmedLength("") + 86, MotionEvent.axisFromString("") + 9568, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onTransact;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr5[i9] = (byte) (bArr4[i9] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i10 = $11;
                    int i11 = i10 + 67;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    if (z) {
                        int i13 = i10 + 49;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            byte[] bArr6 = onTransact;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback << (((byte) (((byte) (bArr6[r7] - 4629411779493505016L)) - s)) ^ b));
                        } else {
                            byte[] bArr7 = onTransact;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                    } else {
                        short[] sArr = IAuthTabCallbackDefault;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i14 = $10 + 89;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    private final String IAuthTabCallback() {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (String) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted3, 1572597379, new Object[]{this}, iOnWarmupCompleted, iOnWarmupCompleted2, -1572597378);
    }

    private static final Unit onWarmupCompleted(GlobalBlockAccountActivity globalBlockAccountActivity) {
        int iOnWarmupCompleted = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted2 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        int iOnWarmupCompleted3 = CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted();
        return (Unit) onNavigationEvent(CvsCashTransactionActivity$.ExternalSyntheticLambda45.onWarmupCompleted(), iOnWarmupCompleted3, 1687482817, new Object[]{globalBlockAccountActivity}, iOnWarmupCompleted, iOnWarmupCompleted2, -1687482817);
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = access000 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        int i4 = IAuthTabCallbackStubProxy + 65;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        int i2 = access000 + 95;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
    }

    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access000 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = access000 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void onNavigationEvent() {
        asInterface = -1870596712;
        IAuthTabCallbackStub = -810025609;
        asBinder = -1687260332;
        byte[] bArr = new byte[516];
        System.arraycopy("\u0084\u0088\u0080±pLÄt~\u0086|\u0084xU¼q\u0080q{wU¡\u007f\u0083v]¡~\u008a\u0086vTj\u007f\u0095¾\u0089qu\u0083~\u008a\u0088|Ty°\u0098f\u008b\u0086Z¤\u008aHÄt~\u0086|\u0084xU¼q\u0080q{wU¡\u007f\u0083v]¡~\u008a\u0086vT`µ~\u008a\u0086vt@µ\u008bvsNÎz\u0089OÎy\u0086\u008c\u0088f\u008b\u008aOÎws\u008e1Ès\u000eXñ\u001cA5Í]O÷E\ri8\u0005\\ñ\\FZ8,B\u000eG ,Oó÷G=SBø\u000fô\\X\u000eOóYE=D\n\u000fô\\X\u000eOóYE=D\u0001\tWö÷#-ó\u0099Í]O÷E\ri8\u0005\\ñ\\FZ8,B\u000eG ,Oó÷G=Q\u0018Oó÷G]1\u0018öG^?¿Cô2¿D÷õYWöó2¿Z^ÿ\u009c\u0019^{Mb\u008d2&¾N0x6~Z)vMbM7K)\u009d3\u007fH\u0011\u009d0dxH.D3ipeMI\u007f0dJ6.5{peMI\u007f0dJ6.5{peMI\u007f0dJ6.5rzXgx\u0014\u009ed\n¾N0x6~Z)vMbM7K)\u009d3\u007fH\u0011\u009d0dxH.B\u00890dxHN\"\u0089gHO  4e# 5xfJXgd# KO`\r\u008aOF[X$×\u001b\u0093ãéQëSÿ\u0000+äGäêî\u00004ÖRá\b4é]Qá\u0003ýÖ@)\\äàRé]ïë\u0003ì^)\\äàRé]ïë\u0003ì^)\\äàRé]ïë\u0003ì\u0017_ñZQ\r3]¯\u0093ãéQëSÿ\u0000+äGäêî\u00004ÖRá\b4é]Qá\u0003ç é]Qáã\u0007 Záâ\u0019\u0099í\\\u0006\u0099ìQ[ïñZ]\u0006\u0099îâY¤/â".getBytes("ISO-8859-1"), 0, bArr, 0, 516);
        onTransact = bArr;
    }
}
