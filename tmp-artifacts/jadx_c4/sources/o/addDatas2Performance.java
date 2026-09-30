package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class addDatas2Performance {
    public static final onExtraCallback Companion;
    private static long IAuthTabCallbackStub;
    private static int asBinder;
    private static char[] onExtraCallback;
    private final forceInnerWebViewCheck IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;
    private final RVPub onNavigationEvent;
    private final addEvent2Performance onWarmupCompleted;
    private static final byte[] $$a = {86, 117, -27, 75};
    private static final int $$b = 170;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackDefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, byte b, short s) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s * 4) + 1;
        int i5 = 4 - (b * 3);
        int i6 = 97 - (i * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i5++;
            i6 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            i5++;
            i6 += i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    static {
        asBinder = 1;
        asInterface();
        Companion = new onExtraCallback(null);
        int i = IAuthTabCallbackDefault + 29;
        asBinder = i % 128;
        int i2 = i % 2;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = asInterface + 47;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof addDatas2Performance)) {
            int i4 = asInterface + 73;
            onTransact = i4 % 128;
            return i4 % 2 == 0;
        }
        addDatas2Performance adddatas2performance = (addDatas2Performance) obj;
        if (this.onNavigationEvent != adddatas2performance.onNavigationEvent || this.onExtraCallbackWithResult != adddatas2performance.onExtraCallbackWithResult) {
            return false;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, adddatas2performance.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.IAuthTabCallback, adddatas2performance.IAuthTabCallback);
        }
        int i5 = asInterface + 33;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        RVPub rVPub;
        int iHashCode;
        int i = 2 % 2;
        int i2 = onTransact + 89;
        asInterface = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            rVPub = this.onNavigationEvent;
            iHashCode = 1;
            if (rVPub != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = rVPub.hashCode();
            }
        } else {
            rVPub = this.onNavigationEvent;
            if (rVPub == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = rVPub.hashCode();
            }
        }
        int iHashCode3 = Boolean.hashCode(this.onExtraCallbackWithResult);
        int iHashCode4 = this.onWarmupCompleted.hashCode();
        forceInnerWebViewCheck forceinnerwebviewcheck = this.IAuthTabCallback;
        if (forceinnerwebviewcheck != null) {
            int i3 = asInterface + 9;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = forceinnerwebviewcheck.hashCode();
            int i5 = asInterface + 63;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        RVPub rVPub = this.onNavigationEvent;
        boolean z = this.onExtraCallbackWithResult;
        addEvent2Performance addevent2performance = this.onWarmupCompleted;
        forceInnerWebViewCheck forceinnerwebviewcheck = this.IAuthTabCallback;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1, TextUtils.getCapsMode("", 0, 0) + 22, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 5537), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(rVPub);
        Object[] objArr2 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 22, 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (2242 - (KeyEvent.getMaxKeyCode() >> 16)), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(z);
        Object[] objArr3 = new Object[1];
        a(KeyEvent.getDeadChar(0, 0) + 41, (ViewConfiguration.getTapTimeout() >> 16) + 17, (char) (Color.rgb(0, 0, 0) + 16777216), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(addevent2performance);
        Object[] objArr4 = new Object[1];
        a(58 - Color.green(0), (Process.myPid() >> 22) + 20, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(forceinnerwebviewcheck);
        Object[] objArr5 = new Object[1];
        a(78 - (ViewConfiguration.getTapTimeout() >> 16), 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.alpha(0), objArr5);
        sb.append(((String) objArr5[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 47;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return string;
    }

    public addDatas2Performance(@Nullable RVPub rVPub, boolean z, @NotNull addEvent2Performance addevent2performance, @Nullable forceInnerWebViewCheck forceinnerwebviewcheck) {
        Intrinsics.checkNotNullParameter(addevent2performance, "");
        this.onNavigationEvent = rVPub;
        this.onExtraCallbackWithResult = z;
        this.onWarmupCompleted = addevent2performance;
        this.IAuthTabCallback = forceinnerwebviewcheck;
    }

    public final RVPub onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        RVPub rVPub = this.onNavigationEvent;
        int i5 = i2 + 35;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return rVPub;
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.onExtraCallbackWithResult;
        if (i3 == 0) {
            int i4 = 14 / 0;
        }
        return z;
    }

    public final addEvent2Performance onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        addEvent2Performance addevent2performance = this.onWarmupCompleted;
        int i5 = i3 + 7;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            return addevent2performance;
        }
        throw null;
    }

    public final forceInnerWebViewCheck onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 119;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        forceInnerWebViewCheck forceinnerwebviewcheck = this.IAuthTabCallback;
        int i5 = i3 + 69;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return forceinnerwebviewcheck;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 67;
        int i3 = i2 % 128;
        asInterface = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.onNavigationEvent != null) {
            return true;
        }
        int i4 = i3 + 103;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }

        public static /* synthetic */ addDatas2Performance onExtraCallback(onExtraCallback onextracallback, RVPub rVPub, boolean z, addData2Performance adddata2performance, forceInnerWebViewCheck forceinnerwebviewcheck, addStage2Performance addstage2performance, int i, Object obj) {
            forceInnerWebViewCheck forceinnerwebviewcheck2;
            addStage2Performance addstage2performance2;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 85;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            addData2Performance adddata2performance2 = (i & 4) != 0 ? null : adddata2performance;
            if ((i & 8) != 0) {
                int i6 = i4 + 57;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 46 / 0;
                }
                forceinnerwebviewcheck2 = null;
            } else {
                forceinnerwebviewcheck2 = forceinnerwebviewcheck;
            }
            if ((i & 16) != 0) {
                int i8 = i4 + 95;
                IAuthTabCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 40 / 0;
                }
                addstage2performance2 = null;
            } else {
                addstage2performance2 = addstage2performance;
            }
            addDatas2Performance adddatas2performanceOnExtraCallback = onextracallback.onExtraCallback(rVPub, z, adddata2performance2, forceinnerwebviewcheck2, addstage2performance2);
            int i10 = onNavigationEvent + 121;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            return adddatas2performanceOnExtraCallback;
        }

        public final addDatas2Performance onExtraCallback(@NotNull RVPub rVPub, boolean z, @Nullable addData2Performance adddata2performance, @Nullable forceInnerWebViewCheck forceinnerwebviewcheck, @Nullable addStage2Performance addstage2performance) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(rVPub, "");
            addDatas2Performance adddatas2performance = new addDatas2Performance(rVPub, z, new addEvent2Performance(null, adddata2performance, null, addstage2performance, 1, null), forceinnerwebviewcheck);
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return adddatas2performance;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i4 = $11 + 41;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onExtraCallback[i % i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getTrimmedLength("") + 59697), 17 - KeyEvent.keyCodeFromString(""), 10973 - View.MeasureSpec.getMode(0), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 46134), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, View.resolveSizeAndState(0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 49124), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 43, 1494 - (ViewConfiguration.getTouchSlop() >> 8), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(onExtraCallback[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getTapTimeout() >> 16)), 17 - TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf("", "") + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(IAuthTabCallbackStub), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 46134), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 20220 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.resolveSize(0, 0) + 44, (ViewConfiguration.getPressedStateDuration() >> 16) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 71;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49122 - ((byte) KeyEvent.getModifierMetaStateMask())), View.resolveSizeAndState(0, 0, 0) + 44, 1494 - Color.red(0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback8 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 45, 1493 - ImageFormat.getBitsPerPixel(0), -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback8).invoke(null, objArr9);
        }
        objArr[0] = new String(cArr);
    }

    static void asInterface() {
        onExtraCallback = new char[]{63551, 16669, 35355, 54019, 7179, 25914, 44599, 63279, 12339, 31020, 49726, 2844, 21595, 40266, 58960, 12099, 26724, 45395, 64117, 17248, 35947, 54581, 58682, 23600, 38771, 52855, 333, 30825, 45916, 59992, 11599, 25668, 57163, 5664, 18747, 32798, 64304, 12845, 29979, 44053, 59207, 60920, 21746, 40878, 50855, 2464, 28835, 48020, 58015, 9616, 27787, 55175, 7928, 16853, 35060, 62438, 15073, 32137, 60920, 21746, 40894, 50855, 2479, 28847, 48039, 58007, 9616, 27786, 55203, 7923, 16869, 35018, 62447, 15079, 32218, 42182, 61387, 22171, 60925};
        IAuthTabCallbackStub = 337020155693126866L;
    }
}
