package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCommonDeleteWalletErrorActivityKt$;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.getPrivacyDestinationUri;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class extract {
    public static final extract IAuthTabCallback;
    private static int IAuthTabCallbackDefault;
    private static long asInterface;
    private static getBacktraceNote<AppLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static final byte[] $$a = {119, -40, 16, 123};
    private static final int $$b = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3;
        int i4 = 4 - (i * 3);
        byte[] bArr = $$a;
        int i5 = (b2 * 2) + 97;
        int i6 = (b * 4) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i4++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i4++;
            i5 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = asBinder + 23;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + 81;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(y1bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        getBacktraceNote<y1b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 41;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = onExtraCallbackWithResult;
            int i4 = 54 / 0;
        } else {
            getbacktracenote = onExtraCallbackWithResult;
        }
        int i5 = i2 + 27;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        Function2<CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> function2;
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        onTransact = i3;
        if (i2 % 2 == 0) {
            function2 = onWarmupCompleted;
            int i4 = 66 / 0;
        } else {
            function2 = onWarmupCompleted;
        }
        int i5 = i3 + 73;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return function2;
    }

    static {
        IAuthTabCallbackDefault = 0;
        onNavigationEvent();
        IAuthTabCallback = new extract();
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(-2062444555, false, new ComposableSingletons$MobileIdCommonDeleteWalletErrorActivityKt$.ExternalSyntheticLambda0());
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(1576349413, false, new ComposableSingletons$MobileIdCommonDeleteWalletErrorActivityKt$.ExternalSyntheticLambda1());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(1332399579, false, new ComposableSingletons$MobileIdCommonDeleteWalletErrorActivityKt$.ExternalSyntheticLambda2());
        int i = IAuthTabCallbackStub + 109;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final Unit onExtraCallback(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 103;
        onTransact = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 != 0 ? (i & 3) != 2 : (i & 3) != 3, i & 1)) {
            int i4 = asBinder + 19;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2062444555, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCommonDeleteWalletErrorActivityKt.lambda$-2062444555.<anonymous> (MobileIdCommonDeleteWalletErrorActivity.kt:87)");
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onTransact + 41;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $10 + 37;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59696 - MotionEvent.axisFromString("")), Drawable.resolveOpacity(0, 0) + 17, 10974 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(asInterface), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 30, 20219 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49123), 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1494 - View.MeasureSpec.getMode(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            int i7 = $10 + 81;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 49123), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 43, View.resolveSizeAndState(0, 0, 0) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(AppLovinNativeAdImplExternalSyntheticLambda1 appLovinNativeAdImplExternalSyntheticLambda1, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asBinder + 65;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 94) == 0) {
                i |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(appLovinNativeAdImplExternalSyntheticLambda1) ? 4 : 2;
                int i4 = asBinder + 105;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 % 3;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(appLovinNativeAdImplExternalSyntheticLambda1, "");
            if ((i & 6) == 0) {
            }
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1))) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1576349413, i, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCommonDeleteWalletErrorActivityKt.lambda$1576349413.<anonymous> (MobileIdCommonDeleteWalletErrorActivity.kt:109)");
                int i6 = onTransact + 15;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            }
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getJumpTapTimeout() >> 16, 55 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Gravity.getAbsoluteGravity(0, 0) + 50743), objArr);
            appLovinNativeAdImplExternalSyntheticLambda1.onNavigationEvent(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0, 0.0f, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (String) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 21) & 29360128) | 6, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onNavigationEvent(y1b y1bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1bVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1bVar) ? 4 : 2);
            int i4 = onTransact + 95;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i6 = onTransact + 119;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1332399579, i2, -1, "im.toss.features.mobileid.impl.view.ComposableSingletons$MobileIdCommonDeleteWalletErrorActivityKt.lambda$1332399579.<anonymous> (MobileIdCommonDeleteWalletErrorActivity.kt:105)");
            }
            y1bVar.onExtraCallback(getPrivacyDestinationUri.onExtraCallbackWithResult.onExtraCallbackWithResult.Companion.IAuthTabCallbackDefault(), (QuirksExternalSyntheticBackport0) null, (getBacktraceNote) null, setByteOrder.Companion.IAuthTabCallbackDefault(), (Function0) null, onExtraCallback, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 199686, 22);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i8 = asBinder + 45;
                onTransact = i8 % 128;
                if (i8 % 2 == 0) {
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

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{11147, 4174, 23589, 38936, 50420, 228, 19674, 35107, 62808, 12598, 32248, 47556, 58790, 8581, 28179, 43552, 38428, 54009, 7890, 23254, 34686, 49987, 3946, 19440, 47060, 62374, 16285, 25705, 41018, 60421, 10400, 5319, 20652, 40311, 55644, 1319, 16649, 36241, 51632, 13726, 29305, 48717, 64011, 9917, 25245, 44779, 60270, 55108, 4924, 24350, 39855, 51122, 900, 18529, 46155};
        asInterface = 6492362942218098189L;
    }
}
