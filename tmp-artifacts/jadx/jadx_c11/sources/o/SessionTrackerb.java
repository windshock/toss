package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.deeplink.DeepLinkResult;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public interface SessionTrackerb extends IconRoundCornerProgressBar1 {
    public static final onNavigationEvent Companion;
    public static final long access000 = -2927465936847965412L;
    public static final String asInterface;

    public interface onExtraCallback {
        SessionTrackerb getSmallIconId();
    }

    static {
        Object[] objArr = new Object[1];
        d(new char[]{30296, 19963, 273, 50337, 39117, 23654, 5018, 55259, 43888, 28380, 8822, 58899, 48630, 28986, 13661, 2221, 52233, 33713, 18398, 7008}, 15317 - AndroidCharacter.getMirror('0'), objArr);
        asInterface = ((String) objArr[0]).intern();
        Companion = onNavigationEvent.onWarmupCompleted;
    }

    void IAuthTabCallback(@NotNull Activity activity, @NotNull DeepLinkResult deepLinkResult, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str, @Nullable String str2, @Nullable String str3);

    String IAuthTabCallbackDefault(@Nullable String str);

    @Deprecated
    Intent onExtraCallback(@NotNull Context context, @NotNull String str);

    Intent onExtraCallbackWithResult(@NotNull Context context);

    Class<?> onExtraCallbackWithResult(@Nullable String str);

    void onExtraCallbackWithResult(@NotNull Activity activity, @Nullable String str, int i, @Nullable Bundle bundle);

    void onExtraCallbackWithResult(@NotNull String str, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @Nullable String str2, @Nullable String str3);

    boolean onExtraCallbackWithResult(@NotNull Activity activity, @Nullable String str, @Nullable Bundle bundle);

    boolean onExtraCallbackWithResult(@Nullable Activity activity, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2);

    boolean onExtraCallbackWithResult(@Nullable Context context, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2);

    boolean onNavigationEvent(@Nullable String str);

    @Deprecated
    Intent onWarmupCompleted(@NotNull Context context, @NotNull Uri uri);

    DeepLinkResult onWarmupCompleted(@Nullable Activity activity, @Nullable String str, boolean z, @Nullable Function1<? super Uri, Boolean> function1, @Nullable Bundle bundle, boolean z2);

    String onWarmupCompleted(@NotNull String str);

    void onWarmupCompleted(@NotNull Context context, @Nullable String str, @NotNull IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, @Nullable Bundle bundle);

    boolean onWarmupCompleted(@NotNull Activity activity, @NotNull Uri uri);

    boolean onWarmupCompleted(@NotNull Uri uri);

    static /* synthetic */ boolean onExtraCallbackWithResult(SessionTrackerb sessionTrackerb, Context context, String str, boolean z, Function1 function1, Bundle bundle, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj == null) {
            return sessionTrackerb.onExtraCallbackWithResult(context, str, (i & 4) != 0 ? false : z, (Function1<? super Uri, Boolean>) ((i & 8) != 0 ? null : function1), (i & 16) != 0 ? null : bundle, (i & 32) != 0 ? false : z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: route");
    }

    static /* synthetic */ boolean IAuthTabCallback(SessionTrackerb sessionTrackerb, Activity activity, String str, boolean z, Function1 function1, Bundle bundle, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj == null) {
            return sessionTrackerb.onExtraCallbackWithResult(activity, str, (i & 4) != 0 ? false : z, (Function1<? super Uri, Boolean>) ((i & 8) != 0 ? null : function1), (i & 16) != 0 ? null : bundle, (i & 32) != 0 ? false : z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: route");
    }

    static /* synthetic */ void onExtraCallbackWithResult(SessionTrackerb sessionTrackerb, Activity activity, String str, int i, Bundle bundle, int i2, Object obj) {
        int i3 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeWithRequestCode");
        }
        if ((i2 & 8) != 0) {
            bundle = null;
        }
        sessionTrackerb.onExtraCallbackWithResult(activity, str, i, bundle);
    }

    static /* synthetic */ void onNavigationEvent(SessionTrackerb sessionTrackerb, Context context, String str, IEngagementSignalsCallback_Parcel iEngagementSignalsCallback_Parcel, Bundle bundle, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeWithActivityLauncher");
        }
        if ((i & 8) != 0) {
            bundle = null;
        }
        sessionTrackerb.onWarmupCompleted(context, str, iEngagementSignalsCallback_Parcel, bundle);
    }

    default String onWarmupCompleted() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        d(new char[]{30296, 19963, 273, 50337, 39117, 23654, 5018, 55259, 43888, 28380, 8822, 58899, 48630, 28986, 13661, 2221, 52233, 33713, 18398, 7008}, 15269 - Drawable.resolveOpacity(0, 0), objArr);
        return ((String) objArr[0]).intern();
    }

    private static void d(char[] cArr, int i, Object[] objArr) throws Throwable {
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
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 24 - TextUtils.indexOf("", "", 0, 0), Color.alpha(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (access000 ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.getCapsMode("", 0, 0) + 59, 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    static /* synthetic */ void IAuthTabCallback(SessionTrackerb sessionTrackerb, Activity activity, DeepLinkResult deepLinkResult, onExtraCallbackWithResult onextracallbackwithresult, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackDeepLinkResult");
        }
        sessionTrackerb.IAuthTabCallback(activity, deepLinkResult, onextracallbackwithresult, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }

    static /* synthetic */ void onExtraCallbackWithResult(SessionTrackerb sessionTrackerb, String str, onExtraCallbackWithResult onextracallbackwithresult, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logSchemeExecution");
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        sessionTrackerb.onExtraCallbackWithResult(str, onextracallbackwithresult, str2, str3);
    }

    public static final class onNavigationEvent {
        private static char[] IAuthTabCallback;
        private static long onExtraCallback;
        private static int onExtraCallbackWithResult;
        public static final String onNavigationEvent;
        static final /* synthetic */ onNavigationEvent onWarmupCompleted;
        private static final byte[] $$a = {34, -56, 26, -92};
        private static final int $$b = 179;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(short s, int i, short s2) {
            int i2;
            byte[] bArr = $$a;
            int i3 = 97 - (s2 * 2);
            int i4 = s * 2;
            int i5 = i + 4;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                int i8 = i5;
                int i9 = i5 + i6;
                i2 = i7;
                int i10 = i8;
                i3 = i9;
                i5 = i10;
                int i11 = i5 + 1;
                bArr2[i2] = (byte) i3;
                i7 = i2 + 1;
                if (i2 == i4) {
                    return new String(bArr2, 0);
                }
                int i12 = i3;
                i8 = i11;
                i5 = bArr[i11];
                i6 = i12;
                int i92 = i5 + i6;
                i2 = i7;
                int i102 = i8;
                i3 = i92;
                i5 = i102;
                int i112 = i5 + 1;
                bArr2[i2] = (byte) i3;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                int i1122 = i5 + 1;
                bArr2[i2] = (byte) i3;
                i7 = i2 + 1;
                if (i2 == i4) {
                }
            }
        }

        static {
            onExtraCallbackWithResult = 0;
            onExtraCallback();
            Object[] objArr = new Object[1];
            a(ViewConfiguration.getLongPressTimeout() >> 16, (ViewConfiguration.getEdgeSlop() >> 16) + 20, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr);
            onNavigationEvent = ((String) objArr[0]).intern();
            onWarmupCompleted = new onNavigationEvent();
            int i = IAuthTabCallbackStub + 91;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 123;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i * i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 59697), 18 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 46135), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, View.MeasureSpec.getMode(0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 44, 1493 - TextUtils.lastIndexOf("", '0', 0), -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59698 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17, 10973 - TextUtils.indexOf("", ""), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 46134), TextUtils.getOffsetBefore("", 0) + 31, ((Process.getThreadPriority(0) + 20) >> 6) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), TextUtils.lastIndexOf("", '0', 0, 0) + 45, TextUtils.lastIndexOf("", '0', 0, 0) + 1495, -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback6).invoke(null, objArr7);
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            int i7 = $10 + 113;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 44, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
            }
            objArr[0] = new String(cArr);
        }

        private onNavigationEvent() {
        }

        static void onExtraCallback() {
            IAuthTabCallback = new char[]{60839, 22546, 34498, 52392, 15210, 25055, 44937, 6722, 16447, 36517, 62725, 9034, 27089, 55219, 622, 18564, 46742, 64856, 11053, 37353};
            onExtraCallback = -8119824541997705113L;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult INTERCEPTOR = new onExtraCallbackWithResult("INTERCEPTOR", 0);
        public static final onExtraCallbackWithResult PRE_ACTION = new onExtraCallbackWithResult("PRE_ACTION", 1);
        public static final onExtraCallbackWithResult HANDLER = new onExtraCallbackWithResult("HANDLER", 2);
        public static final onExtraCallbackWithResult EXTERNAL = new onExtraCallbackWithResult("EXTERNAL", 3);
        public static final onExtraCallbackWithResult RN_WARMUP = new onExtraCallbackWithResult("RN_WARMUP", 4);
        public static final onExtraCallbackWithResult WEB_FALLBACK = new onExtraCallbackWithResult("WEB_FALLBACK", 5);
        public static final onExtraCallbackWithResult IN_APP_BROWSER = new onExtraCallbackWithResult("IN_APP_BROWSER", 6);
        public static final onExtraCallbackWithResult DIRECT_LAUNCH = new onExtraCallbackWithResult("DIRECT_LAUNCH", 7);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 21;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {INTERCEPTOR, PRE_ACTION, HANDLER, EXTERNAL, RN_WARMUP, WEB_FALLBACK, IN_APP_BROWSER, DIRECT_LAUNCH};
            int i5 = i2 + 41;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 97;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 13;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onWarmupCompleted + 67;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onNavigationEvent + 45;
            onExtraCallbackWithResult = i % 128;
            int i2 = i % 2;
        }
    }
}
