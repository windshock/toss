package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ActivityAnimBean1 {
    private static short[] access000;
    private final getAnimResId IAuthTabCallback;
    private final getAnimResId onExtraCallback;
    private final getAnimResId onExtraCallbackWithResult;
    private final getAnimResId onNavigationEvent;
    private final getAnimResId onWarmupCompleted;
    private static final byte[] $$a = {79, 9, 94, -7};
    private static final int $$b = 138;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getInterfaceDescriptor = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char[] asInterface = {39260, 17728, 8458, 3537, 59824, 54660, 45141, 39997, 30964, 9469, 143, 61268, 52009, 47081, 37870, 32640, 23122, 1656};
    private static long IAuthTabCallbackDefault = 7742787517977539046L;
    private static int onTransact = -1877402708;
    private static int IAuthTabCallbackStub = -1538795519;
    private static int asBinder = 1741046435;
    private static byte[] access100 = {-65, -29, -85, -56, -125, -104, -43, -18, 73, -21, -62, -20, -98, -103, 104, -18, 13, 66, 53, 61, 40, 24, 19, 74, 54, -127, 24, -43, 42, 45, -68, 19, -56, -78, -69, 36, 32, 105, -78, 8, 8, 8, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, short s, short s2) {
        int i2;
        int i3 = (s2 * 4) + 4;
        int i4 = (s * 18) + 97;
        int i5 = i * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            int i8 = i3;
            i2 = 0;
            i3++;
            i4 = i8 + (-i7);
            int i9 = i3;
            int i10 = i4;
            bArr2[i2] = (byte) i10;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i9];
            i3 = i9;
            i8 = i10;
            i3++;
            i4 = i8 + (-i7);
            int i92 = i3;
            int i102 = i4;
            bArr2[i2] = (byte) i102;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i3;
            int i1022 = i4;
            bArr2[i2] = (byte) i1022;
            if (i2 == i6) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof o.ActivityAnimBean1) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 79;
        o.ActivityAnimBean1.getInterfaceDescriptor = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (o.ActivityAnimBean1) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = o.ActivityAnimBean1.IAuthTabCallbackStubProxy + 97;
        o.ActivityAnimBean1.getInterfaceDescriptor = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r6 = o.ActivityAnimBean1.IAuthTabCallbackStubProxy + 33;
        o.ActivityAnimBean1.getInterfaceDescriptor = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 85;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        if (i2 % 2 == 0) {
            int i4 = 88 / 0;
        }
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.onExtraCallbackWithResult.hashCode() * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode();
        int i4 = IAuthTabCallbackStubProxy + 101;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return iHashCode;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        getAnimResId getanimresid = this.onExtraCallbackWithResult;
        getAnimResId getanimresid2 = this.IAuthTabCallback;
        getAnimResId getanimresid3 = this.onWarmupCompleted;
        getAnimResId getanimresid4 = this.onExtraCallback;
        getAnimResId getanimresid5 = this.onNavigationEvent;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 18, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 29892), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(getanimresid);
        Object[] objArr2 = new Object[1];
        b((byte) ((Process.myTid() >> 22) + 88), (short) ((-54) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (-895402916) - Color.rgb(0, 0, 0), 2 - TextUtils.getCapsMode("", 0, 0), 1014916481 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(getanimresid2);
        Object[] objArr3 = new Object[1];
        b((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 82), (short) ((-66) - TextUtils.lastIndexOf("", '0', 0)), View.combineMeasuredStates(0, 0) - 878625690, (-1) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1014916481 - TextUtils.getTrimmedLength(""), objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(getanimresid3);
        Object[] objArr4 = new Object[1];
        b((byte) (15 - TextUtils.indexOf((CharSequence) "", '0')), (short) (ExpandableListView.getPackedPositionType(0L) - 44), KeyEvent.keyCodeFromString("") - 878625684, 3 - ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.indexOf((CharSequence) "", '0', 0) + 1014916482, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(getanimresid4);
        Object[] objArr5 = new Object[1];
        b((byte) (56 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 19), TextUtils.getOffsetAfter("", 0) - 878625673, ExpandableListView.getPackedPositionType(0L) + 4, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1014916481, objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(getanimresid5);
        Object[] objArr6 = new Object[1];
        b((byte) ((-36) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (short) (ExpandableListView.getPackedPositionType(0L) + 18), (-878625660) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 8, 1014916477 - ExpandableListView.getPackedPositionChild(0L), objArr6);
        sb.append(((String) objArr6[0]).intern());
        String string = sb.toString();
        int i2 = getInterfaceDescriptor + 39;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public ActivityAnimBean1(@NotNull getAnimResId getanimresid, @NotNull getAnimResId getanimresid2, @NotNull getAnimResId getanimresid3, @NotNull getAnimResId getanimresid4, @NotNull getAnimResId getanimresid5) {
        Intrinsics.checkNotNullParameter(getanimresid, "");
        Intrinsics.checkNotNullParameter(getanimresid2, "");
        Intrinsics.checkNotNullParameter(getanimresid3, "");
        Intrinsics.checkNotNullParameter(getanimresid4, "");
        Intrinsics.checkNotNullParameter(getanimresid5, "");
        this.onExtraCallbackWithResult = getanimresid;
        this.IAuthTabCallback = getanimresid2;
        this.onWarmupCompleted = getanimresid3;
        this.onExtraCallback = getanimresid4;
        this.onNavigationEvent = getanimresid5;
    }

    public final getAnimResId onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 17;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getAnimResId getanimresid = this.onExtraCallbackWithResult;
        int i5 = i2 + 15;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 == 0) {
            return getanimresid;
        }
        throw null;
    }

    public final getAnimResId onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        getAnimResId getanimresid = this.IAuthTabCallback;
        int i5 = i3 + 55;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return getanimresid;
    }

    public final getAnimResId IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 29;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        getAnimResId getanimresid = this.onWarmupCompleted;
        int i5 = i2 + 93;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return getanimresid;
    }

    public final getAnimResId onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 37;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getAnimResId getanimresid = this.onExtraCallback;
        int i4 = i2 + 11;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return getanimresid;
    }

    public final getAnimResId onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 77;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (true) {
            i3 = -1401950695;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i7 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(asInterface[i + i7])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 17 - TextUtils.getOffsetBefore("", 0), 10973 - (ViewConfiguration.getWindowTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(IAuthTabCallbackDefault), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.lastIndexOf("", '0')), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), 20220 - TextUtils.indexOf("", "", 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49124 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getScrollBarSize() >> 8), 1494 - View.MeasureSpec.getMode(0), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            try {
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i3);
                if (objOnExtraCallback4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - Gravity.getAbsoluteGravity(0, 0)), 43 - ExpandableListView.getPackedPositionChild(0L), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1493, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
                i3 = -1401950695;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i8 = $10 + 57;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallbackStub)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, 22439 - View.resolveSizeAndState(0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                int i6 = $11 + 125;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                byte[] bArr = access100;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 + 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54, (ViewConfiguration.getScrollBarSize() >> 8) + 2167, -299036574, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = access100;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onTransact)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getLongPressTimeout() >> 16)), Process.getGidForName("") + 43, MotionEvent.axisFromString("") + 22440, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (access000[i + ((int) (onTransact ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (IAuthTabCallbackStub ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i9 = $10 + 107;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onTransact ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(asBinder), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 86 - (ViewConfiguration.getWindowTouchSlop() >> 8), 9566 - TextUtils.lastIndexOf("", '0'), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = access100;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $10 + 77;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            bArr5[i11] = (byte) (bArr4[i11] - 4629411779493505016L);
                            i11 %= 0;
                        } else {
                            bArr5[i11] = (byte) (bArr4[i11] ^ (-4629411779493505016L));
                            i11++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i13 = $11 + 97;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr6 = access100;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = access000;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
