package o;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import im.toss.features.foreigner.home.R;
import im.toss.features.foreigner.home.ui.asset.ForeignerHomeTossbankProgressKt$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AppLovinVastMediaViewf;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.handleNativeAdClick;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class NativeCallNotFoundPoint {
    private static final byte[] $$a = {57, 22, -21, -92};
    private static final int $$b = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onNavigationEvent = {60860, 37922, 7844, 33058, 2991, 45668, 13559, 49013, 8631, 43058, 21153, 54582, 24485, 50733, 18662, 62270, 30107, 64517, 26243, 59740, 37781, 6675, 40151, 1811, 35207, 12297, 47758, 15633, 42947, 11806, 53382, 23309, 56763, 17442, 52968, 28989, 64501, 25213, 58614, 28471, 4582, 39015, 750, 34153, 4001, 46696, 14561, 41830, 9688, 44059, 22212, 55645, 17359, 51789, 19606, 63306, 31178, 57409, 60860, 37922, 7844, 33058, 2991, 45668, 13559, 49013, 8631, 43058, 21153, 54582, 24485, 50733, 18662, 62270, 30107, 64517, 26243, 59740, 37781, 6675, 40151, 1814, 35211, 12306, 47764, 15627, 42889, 11805, 53447, 23322, 56806, 17529, 52983, 29024, 64505, 25197, 58603, 28471, 4579, 39028, 737, 34150, 4069, 46699, 14566, 41854, 9625, 44116, 22236, 55623, 17369, 51728, 19666, 63305, 31179, 57416};
    private static long IAuthTabCallback = 6414144187045811286L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        int i2 = s2 + 4;
        int i3 = (b * 2) + 97;
        byte[] bArr = $$a;
        int i4 = s * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        if (bArr == null) {
            int i6 = i2;
            int i7 = 0;
            i3 = (-i3) + i6;
            i = i7;
            int i8 = i2;
            int i9 = i3;
            bArr2[i] = (byte) i9;
            int i10 = i8 + 1;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            i2 = i10;
            i3 = bArr[i10];
            i7 = i + 1;
            i6 = i9;
            i3 = (-i3) + i6;
            i = i7;
            int i82 = i2;
            int i92 = i3;
            bArr2[i] = (byte) i92;
            int i102 = i82 + 1;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i822 = i2;
            int i922 = i3;
            bArr2[i] = (byte) i922;
            int i1022 = i822 + 1;
            if (i == i5) {
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(function0, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(function0);
        }
        onExtraCallbackWithResult(function0);
        throw null;
    }

    private static final Unit onWarmupCompleted(Function0 function0, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        onWarmupCompleted(function0, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        final /* synthetic */ String $referrer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$referrer = str;
        }

        public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 111;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(setDetectableSize);
            int i4 = onExtraCallbackWithResult + 37;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return unitOnNavigationEvent;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$referrer, access13800Var);
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onNavigationEvent + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnExtraCallbackWithResult;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 19;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 64 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        
            if (r4.label == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        
            kotlin.ResultKt.onNavigationEvent(r5);
            o.setParams.onNavigationEvent(4701256, r4.$referrer, (kotlin.jvm.functions.Function1<? super o.SetDetectableSize, kotlin.Unit>) new im.toss.features.foreigner.home.ui.asset.ForeignerHomeTossbankProgressKt$ForeignerHomeTossbankProgress$1$1$.ExternalSyntheticLambda0());
            r5 = kotlin.Unit.INSTANCE;
            r1 = o.NativeCallNotFoundPoint.onExtraCallback.onNavigationEvent + 5;
            o.NativeCallNotFoundPoint.onExtraCallback.onExtraCallbackWithResult = r1 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 3;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
        }

        private static final Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            setDetectableSize.onExtraCallback("tossbank_reward_yn", "N");
            setDetectableSize.onExtraCallback("button_type", "continue");
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    private static final Unit onExtraCallbackWithResult(Function0 function0) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c1  */
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
            int i4 = $11 + 57;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i * i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 59697), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, TextUtils.indexOf("", "", 0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.getCapsMode("", 0, 0) + 31, KeyEvent.keyCodeFromString("") + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getTouchSlop() >> 8)), ((Process.getThreadPriority(0) + 20) >> 6) + 44, 1494 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onNavigationEvent[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 17 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getTrimmedLength("") + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46135 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 31, 20220 - View.resolveSizeAndState(0, 0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Drawable.resolveOpacity(0, 0)), KeyEvent.normalizeMetaState(0) + 44, ((Process.getThreadPriority(0) + 20) >> 6) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
            int i7 = $10 + 73;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 49122), Drawable.resolveOpacity(0, 0) + 44, TextUtils.indexOf("", "", 0) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onWarmupCompleted(@NotNull Function0<Unit> function0, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(2076961541);
        if ((i & 6) != 0) {
            i3 = i;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
            int i5 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2 == 0 ? 2 : 4;
            i3 = i6 | i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                int i8 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            } else {
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i7 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2076961541, i3, -1, "im.toss.features.foreigner.home.ui.asset.ForeignerHomeTossbankProgress (ForeignerHomeTossbankProgress.kt:36)");
                }
                String str = (String) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(setParams.onWarmupCompleted());
                Unit unit = Unit.INSTANCE;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str);
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                Object obj = null;
                if (zOnNavigationEvent || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onExtraCallback(str, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                boolean z = (i3 & 14) == 4;
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!z) {
                    int i10 = onWarmupCompleted + 89;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 == 0) {
                        CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback();
                        obj.hashCode();
                        throw null;
                    }
                    Object obj2 = objOnMinimized2;
                    if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        ForeignerHomeTossbankProgressKt$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new ForeignerHomeTossbankProgressKt$.ExternalSyntheticLambda0(function0);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(externalSyntheticLambda0);
                        obj2 = externalSyntheticLambda0;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport03;
                    Function0 function0OnWarmupCompleted = RealImageLoader.onWarmupCompleted(0L, (Function0) obj2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 1);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageLoaderBuilderExternalSyntheticLambda2.onNavigationEvent(setPluginId.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, 1, (Object) null), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), (getConfiguration) null, (getCachingExecutorService) null, true, false, false, false, (String) null, (Role) null, 0L, function0OnWarmupCompleted, 507, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                    FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                    FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                    QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                    component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                    toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                    Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i11 = onExtraCallbackWithResult + 5;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        int i13 = onWarmupCompleted + 55;
                        onExtraCallbackWithResult = i13 % 128;
                        if (i13 % 2 == 0) {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                            obj.hashCode();
                            throw null;
                        }
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                    LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                    FocusMeteringControlExternalSyntheticLambda12.onNavigationEvent onnavigationeventOnExtraCallbackWithResult = focusMeteringControlExternalSyntheticLambda12.onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), onextracallbackwithresult.onTransact());
                    QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(onnavigationeventOnExtraCallbackWithResult, onextracallbackwithresult.access000(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, onextracallback);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i14 = onWarmupCompleted + 77;
                        onExtraCallbackWithResult = i14 % 128;
                        int i15 = i14 % 2;
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    deprecated_eventListenerFactory deprecated_eventlistenerfactory = deprecated_eventListenerFactory.Image;
                    handleNativeAdClick.onExtraCallback.onWarmupCompleted.onExtraCallback onextracallback2 = handleNativeAdClick.onExtraCallback.onWarmupCompleted.Companion;
                    handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted2 = onextracallback2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                    float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(0.5f);
                    y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = setExtensionStrength.onExtraCallbackWithResult(ensureNavButtonView.onExtraCallback(onextracallback, fIAuthTabCallback, y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).extraCommand(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f))), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f)));
                    Object[] objArr = new Object[1];
                    a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
                    setMainImageUri.IAuthTabCallback(((String) objArr[0]).intern(), deprecated_eventlistenerfactory, quirksExternalSyntheticBackport0OnExtraCallbackWithResult, onWarmupCompleted2, 0L, 0, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 3126, 0, 8176);
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_tossbank, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    AppLovinPostbackService appLovinPostbackService = AppLovinPostbackService.onExtraCallbackWithResult;
                    getHumanReadableName gethumanreadablenameIAuthTabCallback_Parcel = appLovinPostbackService.IAuthTabCallback_Parcel();
                    long jICustomTabsService = y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6).ICustomTabsService();
                    AppLovinVastMediaViewf.IAuthTabCallback iAuthTabCallback = AppLovinVastMediaViewf.Companion;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, null, gethumanreadablenameIAuthTabCallback_Parcel, Long.valueOf(jICustomTabsService), 0L, 0L, null, 1, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(iAuthTabCallback.onNavigationEvent()), false, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 3072, 122738}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnExtraCallback = focusMeteringControlExternalSyntheticLambda12.onExtraCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f));
                    QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedIAuthTabCallbackDefault = onextracallbackwithresult.IAuthTabCallbackDefault();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null);
                    component5 component5VarOnExtraCallback2 = RowKt.onExtraCallback(asbinderOnExtraCallback, onwarmupcompletedIAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                        int i16 = onExtraCallbackWithResult + 103;
                        onWarmupCompleted = i16 % 128;
                        if (i16 % 2 != 0) {
                            getAwbState.onExtraCallback();
                            int i17 = 78 / 0;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback3);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback2, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_tossbank_progress_title, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), rowScopeInstance.onNavigationEvent(onextracallback, 1.0f, false), appLovinPostbackService.access100(), Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, 0L, null, 2, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(iAuthTabCallback.onNavigationEvent()), false, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12582912, 199680, 89968}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    deprecated_eventListenerFactory deprecated_eventlistenerfactory2 = deprecated_eventListenerFactory.Lottie;
                    handleNativeAdClick.onExtraCallback.onWarmupCompleted onWarmupCompleted3 = onextracallback2.onWarmupCompleted(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                    Object[] objArr2 = new Object[1];
                    a(57 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 58, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr2);
                    setMainImageUri.IAuthTabCallback(((String) objArr2[0]).intern(), deprecated_eventlistenerfactory2, (QuirksExternalSyntheticBackport0) null, onWarmupCompleted3, 0L, Integer.MAX_VALUE, 0.0f, (handleNativeAdClick.onWarmupCompleted) null, 0L, (getBacktraceNote) null, 0.0f, (Function0) null, (String) null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 199734, 0, 8148);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                    ImageLoaderBuilderExternalSyntheticLambda5.IAuthTabCallback(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.foreigner_home_asset_tossbank_progress_button, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), setCallToAction.IAuthTabCallback.Companion.IAuthTabCallback(), null, null, null, function0OnWarmupCompleted, null, false, false, cameraCaptureResultEmptyCameraCaptureResult2, 432, 952}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                    cameraCaptureResultEmptyCameraCaptureResult2.asInterface();
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        int i18 = onWarmupCompleted + 31;
                        onExtraCallbackWithResult = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport04;
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new ForeignerHomeTossbankProgressKt$.ExternalSyntheticLambda1(function0, quirksExternalSyntheticBackport02, i, i2));
                return;
            }
            return;
        }
        i3 |= 48;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 19) == 18, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }
}
