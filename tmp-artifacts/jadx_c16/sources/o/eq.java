package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCiNotValidActivityKt$;
import im.toss.tds.compose.component.atom.image.ResourceSizeKt;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class eq {
    private static int $10 = 0;
    private static int $11 = 1;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback = null;
    private static int IAuthTabCallbackStub = 0;
    private static int asInterface = 1;
    public static final eq onExtraCallback;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult = null;
    private static long onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asInterface + 121;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onWarmupCompleted + 99;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return unitIAuthTabCallback;
    }

    public final getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 35;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            getbacktracenote = onExtraCallbackWithResult;
            int i4 = 65 / 0;
        } else {
            getbacktracenote = onExtraCallbackWithResult;
        }
        int i5 = i2 + 87;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 33;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2 = IAuthTabCallback;
        int i5 = i2 + 93;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        onNavigationEvent();
        onExtraCallback = new eq();
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1632898329, false, new ComposableSingletons$MobileIdCiNotValidActivityKt$.ExternalSyntheticLambda0());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(321135392, false, new ComposableSingletons$MobileIdCiNotValidActivityKt$.ExternalSyntheticLambda1());
        int i = IAuthTabCallbackStub + 41;
        onTransact = i % 128;
        if (i % 2 == 0) {
            int i2 = 75 / 0;
        }
    }

    private static final Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            int i3 = asInterface + 75;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onWarmupCompleted + 59;
                asInterface = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1632898329, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCiNotValidActivityKt.lambda$-1632898329.<anonymous> (MobileIdCiNotValidActivity.kt:54)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1632898329, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCiNotValidActivityKt.lambda$-1632898329.<anonymous> (MobileIdCiNotValidActivity.kt:54)");
            }
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 19628 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) + 59, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 59 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i5 = 71 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), Color.green(0) + 59, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i6 = $11 + 9;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static final Unit IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1)) {
                int i5 = asInterface + 117;
                onWarmupCompleted = i5 % 128;
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
            int i7 = onWarmupCompleted + 11;
            asInterface = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i9 = onWarmupCompleted + 121;
                asInterface = i9 % 128;
                int i10 = i9 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(321135392, i2, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCiNotValidActivityKt.lambda$321135392.<anonymous> (MobileIdCiNotValidActivity.kt:74)");
            }
            immediateFailedFuture immediatefailedfutureOnNavigationEvent = ResourceSizeKt.onNavigationEvent(immediateFailedFuture.Companion, 1.0f);
            Object[] objArr = new Object[1];
            a(new char[]{35283, 17734, 4317, 60496, 48108, 30508, 17058, 7723, 60800, 47390, 29824, 16428, 8126, 60205, 42731, 30152, 16708, 7377, 59498, 42942, 29542, 20203, 6738, 59800, 42252, 28846, 19493, 7073, 55074, 41549, 29082, 19785, 6377, 54368, 41958, 32626, 19154, 1604, 54720, 41239, 31907, 18469, 1973, 53909, 44630, 32222, 18763, 1275, 53285, 45042, 31511, 13975}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 52361, objArr);
            appLovinNativeAdImplExternalSyntheticLambda1.IAuthTabCallback(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0L, (QuirkSettingsLoader) null, immediatefailedfutureOnNavigationEvent, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 24582, 46);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static void onNavigationEvent() {
        onNavigationEvent = -2262048126789809012L;
    }
}
