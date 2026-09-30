package o;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import im.toss.features.mobileid.impl.R;
import im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdPushResetActivityKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getPrivacyDestinationUri;
import viva.republica.toss.main.more.notification.NotificationSettingAdapter$;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class getJavaBeanDeserializer {
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static char[] IAuthTabCallbackDefault;
    private static long IAuthTabCallbackStub;
    private static int asBinder;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    public static final getJavaBeanDeserializer onWarmupCompleted;
    private static final byte[] $$a = {75, -35, 114, 51};
    private static final int $$b = 49;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        byte[] bArr = $$a;
        int i3 = i * 3;
        int i4 = 97 - (s * 3);
        int i5 = b + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            int i9 = i5 + i6;
            i2 = i7;
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i8 = i11;
            i5 = bArr[i11];
            i7 = i2 + 1;
            i6 = i12;
            int i92 = i5 + i6;
            i2 = i7;
            int i102 = i8;
            i4 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            int i1122 = i5 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i3);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i5));
        int i11 = ~(i9 | i6);
        int i12 = i10 | i11;
        int i13 = ~i5;
        int i14 = i11 | (~(i13 | i6));
        int i15 = (~(i3 | i7 | i13)) | (~(i13 | i9 | i6));
        int i16 = i5 + i6 + i4 + ((-1369571145) * i) + ((-720088171) * i2);
        int i17 = i16 * i16;
        int i18 = (((-954023988) * i5) - 252706816) + ((-260227018) * i6) + ((-346898485) * i12) + (i14 * 346898485) + (346898485 * i15) + ((-607125504) * i4) + (565182464 * i) + (1611661312 * i2) + ((-409206784) * i17);
        int i19 = ((i5 * (-1931095572)) - 2087550970) + (i6 * (-1931094842)) + (i12 * (-365)) + (i14 * 365) + (i15 * 365) + (i4 * (-1931095207)) + (i * (-789048161)) + (i2 * 356376013) + (i17 * 423362560);
        return i18 + ((i19 * i19) * (-1901854720)) != 1 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 51;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = asInterface + 55;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        if (i4 == 0) {
            unit = (Unit) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 467158795, objArr, -467158794);
            int i5 = 3 / 0;
        } else {
            unit = (Unit) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, 467158795, objArr, -467158794);
        }
        int i6 = asInterface + 49;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 65;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onTransact + 107;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        int i5 = i3 + 39;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 43;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallback(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallback(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 19;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i5 = i3 + 29;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        throw null;
    }

    public final getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = asInterface + 33;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            getbacktracenote = onNavigationEvent;
            int i4 = 63 / 0;
        } else {
            getbacktracenote = onNavigationEvent;
        }
        int i5 = i3 + 5;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    static {
        asBinder = 0;
        onWarmupCompleted();
        onWarmupCompleted = new getJavaBeanDeserializer();
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1920581135, false, new ComposableSingletons$MobileIdPushResetActivityKt$.ExternalSyntheticLambda0());
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-498074504, false, new ComposableSingletons$MobileIdPushResetActivityKt$.ExternalSyntheticLambda1());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(915616001, false, new ComposableSingletons$MobileIdPushResetActivityKt$.ExternalSyntheticLambda2());
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1584895541, false, new ComposableSingletons$MobileIdPushResetActivityKt$.ExternalSyntheticLambda3());
        int i = getInterfaceDescriptor + 99;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onWarmupCompleted(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i3 = onTransact + 59;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1920581135, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdPushResetActivityKt.lambda$-1920581135.<anonymous> (MobileIdPushResetActivity.kt:77)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onTransact + 85;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = asInterface + 67;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        Throwable cause;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 13;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i7 = $11 + 95;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(IAuthTabCallbackDefault[i + i9])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 59696), 17 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 46134), 30 - ((byte) KeyEvent.getModifierMetaStateMask()), 20220 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49123), (ViewConfiguration.getTapTimeout() >> 16) + 44, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 1);
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.normalizeMetaState(0)), 44 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1494 - (Process.myPid() >> 22), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i3 = -1401950695;
        }
        String str = new String(cArr);
        int i10 = $10 + 59;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static final Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        int i4 = onTransact + 33;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            int i6 = asInterface + 65;
            onTransact = i6 % 128;
            if (i6 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                i2 = 4;
            } else {
                int i7 = asInterface + 75;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i9 = asInterface + 115;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i11 = onTransact + 97;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i13 = asInterface + 41;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(915616001, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdPushResetActivityKt.lambda$915616001.<anonymous> (MobileIdPushResetActivity.kt:98)");
                int i15 = onTransact + 109;
                asInterface = i15 % 128;
                int i16 = i15 % 2;
            }
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getScrollBarFadeDuration() >> 16, ((byte) KeyEvent.getModifierMetaStateMask()) + 56, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr);
            appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 21) & 29360128) | 6, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar)) {
                int i5 = onTransact + 53;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i7 = onTransact + 61;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i9 = asInterface + 7;
            onTransact = i9 % 128;
            int i10 = i9 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1584895541, i2, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdPushResetActivityKt.lambda$-1584895541.<anonymous> (MobileIdPushResetActivity.kt:94)");
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, onExtraCallbackWithResult, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 199686, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        boolean z;
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i2 = asInterface + 113;
            onTransact = i2 % 128;
            z = i2 % 2 != 0;
        }
        if (true ^ cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            int i3 = onTransact + 37;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 59 / 0;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-498074504, iIntValue, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdPushResetActivityKt.lambda$-498074504.<anonymous> (MobileIdPushResetActivity.kt:105)");
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.mobileid_impl_push_reset_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.mobileid_impl_push_reset_title, cameraCaptureResultEmptyCameraCaptureResult, 0), null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        return (Unit) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), 467158795, objArr, -467158794);
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int iOnWarmupCompleted = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        int iOnWarmupCompleted2 = NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted();
        return (getBacktraceNote) onExtraCallback(NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), NotificationSettingAdapter$.ExternalSyntheticLambda2.onWarmupCompleted(), iOnWarmupCompleted, iOnWarmupCompleted2, -31196818, new Object[]{this}, 31196818);
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackDefault = new char[]{60860, 31254, 49868, 10886, 45951, 7008, 25535, 51201, 20503, 47302, 169, 26994, 61749, 22921, 42510, 3594, 38619, 65201, 18283, 44920, 14213, 40023, 58463, 19682, 54443, 15718, 34268, 60815, 31321, 49721, 10925, 45757, 7035, 25551, 52117, 20569, 47138, 181, 26805, 61724, 22998, 41373, 3706, 38507, 65198, 18183, 44819, 14286, 40859, 58486, 19574, 54524, 15711, 34069, 60894};
        IAuthTabCallbackStub = -3480772351793071518L;
    }
}
