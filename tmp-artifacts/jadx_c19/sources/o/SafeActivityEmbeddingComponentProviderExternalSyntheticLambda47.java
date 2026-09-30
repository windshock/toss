package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47;
import o.y0a;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47 {
    private static long IAuthTabCallback;
    private static int asInterface;
    private static getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    public static final SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47 onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted;
    private static final byte[] $$a = {15, 58, -59};
    private static final int $$b = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 0;
    private static int IAuthTabCallbackStub = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 3 - (i2 * 3);
        int i7 = 97 - (s * 4);
        byte[] bArr = $$a;
        int i8 = i3 * 3;
        byte[] bArr2 = new byte[i8 + 1];
        int i9 = -1;
        if (bArr == null) {
            int i10 = -1;
            int i11 = i6;
            i6 += -i7;
            i4 = i11 + 1;
            i9 = i10;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i6;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            i11 = i4;
            i7 = bArr[i4];
            i10 = i5;
            i6 += -i7;
            i4 = i11 + 1;
            i9 = i10;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i6;
            if (i5 == i8) {
            }
        } else {
            i6 = i7;
            i4 = i6;
            i5 = i9 + 1;
            bArr2[i5] = (byte) i6;
            if (i5 == i8) {
            }
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(y0a y0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onTransact + 29;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnExtraCallback = onExtraCallback(y0aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStub + 1;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y0a y0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = onTransact + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(y0aVar, cameraCaptureResultEmptyCameraCaptureResult, i2);
        int i6 = IAuthTabCallbackStub + 111;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 91 / 0;
        }
        return unitOnNavigationEvent;
    }

    public final getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 9;
        int i4 = i3 % 128;
        onTransact = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        int i5 = i4 + 79;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 113;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<y0a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onWarmupCompleted;
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
        return getbacktracenote;
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 35;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i2 + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 59697), (ViewConfiguration.getWindowTouchSlop() >> 8) + 17, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10972, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 46135), Process.getGidForName("") + 32, ExpandableListView.getPackedPositionGroup(0L) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 49123), 44 - TextUtils.getCapsMode("", 0, 0), Color.argb(0, 0, 0, 0) + 1494, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i8 = $10 + 107;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49123), 44 - KeyEvent.getDeadChar(0, 0), 1495 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i10 = $10 + 91;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    static {
        asInterface = 1;
        onNavigationEvent();
        onExtraCallbackWithResult = new SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47();
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-310530201, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                Unit unitOnExtraCallbackWithResult;
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 15;
                onExtraCallbackWithResult = i3 % 128;
                y0a y0aVar = (y0a) obj;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) obj2;
                if (i3 % 2 == 0) {
                    unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47.onExtraCallbackWithResult(y0aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                    int i4 = 99 / 0;
                } else {
                    unitOnExtraCallbackWithResult = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47.onExtraCallbackWithResult(y0aVar, cameraCaptureResultEmptyCameraCaptureResult, ((Integer) obj3).intValue());
                }
                int i5 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unitOnExtraCallbackWithResult;
            }
        });
        onWarmupCompleted = ForwardingCameraControl.onExtraCallbackWithResult(1804586206, false, new getBacktraceNote() { // from class: im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchasePreparationScreenKt$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Unit unitIAuthTabCallback = SafeActivityEmbeddingComponentProviderExternalSyntheticLambda47.IAuthTabCallback((y0a) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                int i5 = onExtraCallback + 89;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitIAuthTabCallback;
                }
                throw null;
            }
        });
        int i2 = asBinder + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(y0a y0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        boolean z;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 41;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(y0aVar, "");
            if ((i2 & 17) != 27) {
                int i5 = onTransact + 105;
                IAuthTabCallbackStub = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(y0aVar, "");
            if ((i2 & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-310530201, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchasePreparationScreenKt.lambda$-310530201.<anonymous> (InAppPurchasePreparationScreen.kt:225)");
                int i7 = onTransact + 113;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
            }
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            Object[] objArr = new Object[1];
            a(Color.red(0) + 59, (Process.myPid() >> 22) + 60, (char) ('0' - AndroidCharacter.getMirror('0')), objArr);
            AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, false, false, 0, 0.0f, false, fIAuthTabCallback, fIAuthTabCallback2, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 113246214, 0, 7806);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onTransact + 81;
        IAuthTabCallbackStub = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(y0a y0aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(y0aVar, "");
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 17) != 16, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackStub + 27;
                onTransact = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1804586206, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchasePreparationScreenKt.lambda$1804586206.<anonymous> (InAppPurchasePreparationScreen.kt:239)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1804586206, i2, -1, "im.toss.appsintoss.iap.screen.ComposableSingletons$InAppPurchasePreparationScreenKt.lambda$1804586206.<anonymous> (InAppPurchasePreparationScreen.kt:239)");
            }
            float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f);
            Object[] objArr = new Object[1];
            a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0), 58 - ImageFormat.getBitsPerPixel(0), (char) (38302 - View.resolveSize(0, 0)), objArr);
            AppLovinStarRatingView.IAuthTabCallback(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, false, false, 0, 0.0f, false, fIAuthTabCallback, fIAuthTabCallback2, (QuirkSettingsLoader) null, (immediateFailedFuture) null, false, (String) null, cameraCaptureResultEmptyCameraCaptureResult, 113246214, 0, 7806);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onTransact + 31;
                IAuthTabCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    static void onNavigationEvent() {
        onNavigationEvent = new char[]{30754, 46222, 57694, 7722, 19193, 34560, 46149, 57525, 7609, 18958, 34507, 45998, 57443, 7385, 18884, 34414, 45861, 61321, 7257, 18804, 34275, 45655, 61253, 7158, 18597, 34062, 45534, 61107, 7023, 22473, 33991, 45433, 60965, 6807, 22343, 33845, 45284, 60693, 6665, 22258, 33711, 45081, 60609, 6647, 22125, 33480, 49039, 60543, 6436, 21975, 33369, 48938, 60389, 6222, 21828, 33264, 48825, 60181, 10180, 60860, 8464, 29888, 35764, 57191, 4766, 8667, 29995, 34855, 57232, 4949, 9776, 30205, 35143, 56410, 5104, 9915, 31255, 35271, 56554, 4221, 10185, 31451, 36456, 56635, 4240, 9280, 31533, 36593, 49751, 4441, 9447, 31675, 36617, 49881, 4523, 9594, 30859, 36753, 50038, 5670, 9611, 31046, 35945, 50157, 5953, 10776, 31208, 36027, 49171, 6041, 10935, 32356, 36299, 49280, 5162, 11070, 32407, 45659, 49450};
        IAuthTabCallback = 8633356707122454884L;
    }
}
