package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.facepay.log.model.LogAction;
import im.toss.facepay.log.model.LogFeature;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getAppLaunchParams {
    private final LogFeature IAuthTabCallback;
    private final String IAuthTabCallbackStub;
    private final LogAction onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;
    private static final byte[] $$a = {80, 83, -21, -55};
    private static final int $$b = 102;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int onTransact = 1;
    private static int IAuthTabCallbackDefault = 478308938;
    private static char[] asInterface = {27258, 27187, 27358, 27355, 27339, 27336, 27353, 27355, 27347, 27345, 27355, 27338, 27358, 27351, 27338, 27337, 27356, 27352, 27197, 27164, 27226};

    private static String $$c(int i, byte b, short s) {
        byte[] bArr = $$a;
        int i2 = (s * 3) + 105;
        int i3 = b + 4;
        int i4 = i * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            i3++;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i3]) + i2;
            i5 = i6;
        }
    }

    public static /* synthetic */ getAppLaunchParams onNavigationEvent(getAppLaunchParams getapplaunchparams, String str, LogFeature logFeature, LogAction logAction, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onTransact;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 11;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                String str5 = getapplaunchparams.onNavigationEvent;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = getapplaunchparams.onNavigationEvent;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            logFeature = getapplaunchparams.IAuthTabCallback;
        }
        LogFeature logFeature2 = logFeature;
        if ((i & 4) != 0) {
            logAction = getapplaunchparams.onExtraCallback;
        }
        LogAction logAction2 = logAction;
        if ((i & 8) != 0) {
            str2 = getapplaunchparams.IAuthTabCallbackStub;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = getapplaunchparams.onWarmupCompleted;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            int i7 = i3 + 63;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            str4 = getapplaunchparams.onExtraCallbackWithResult;
        }
        return getapplaunchparams.IAuthTabCallback(str6, logFeature2, logAction2, str7, str8, str4);
    }

    public final getAppLaunchParams IAuthTabCallback(@NotNull String str, @NotNull LogFeature logFeature, @NotNull LogAction logAction, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logFeature, "");
        Intrinsics.checkNotNullParameter(logAction, "");
        getAppLaunchParams getapplaunchparams = new getAppLaunchParams(str, logFeature, logAction, str2, str3, str4);
        int i2 = onTransact + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return getapplaunchparams;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAppLaunchParams)) {
            return false;
        }
        getAppLaunchParams getapplaunchparams = (getAppLaunchParams) obj;
        if (!Intrinsics.areEqual(this.onNavigationEvent, getapplaunchparams.onNavigationEvent)) {
            int i2 = onTransact + 5;
            asBinder = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.IAuthTabCallback != getapplaunchparams.IAuthTabCallback || this.onExtraCallback != getapplaunchparams.onExtraCallback) {
            return false;
        }
        if (!Intrinsics.areEqual(this.IAuthTabCallbackStub, getapplaunchparams.IAuthTabCallbackStub)) {
            int i3 = onTransact + 9;
            asBinder = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.onWarmupCompleted, getapplaunchparams.onWarmupCompleted)) {
            return Intrinsics.areEqual(this.onExtraCallbackWithResult, getapplaunchparams.onExtraCallbackWithResult);
        }
        int i4 = asBinder + 65;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.onNavigationEvent.hashCode();
        int iHashCode3 = this.IAuthTabCallback.hashCode();
        int iHashCode4 = this.onExtraCallback.hashCode();
        String str = this.IAuthTabCallbackStub;
        int iHashCode5 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = onTransact + 89;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.onWarmupCompleted;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.onExtraCallbackWithResult;
        if (str3 != null) {
            int i4 = onTransact + 123;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            iHashCode5 = str3.hashCode();
        }
        return (((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode5;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.onNavigationEvent;
        LogFeature logFeature = this.IAuthTabCallback;
        LogAction logAction = this.onExtraCallback;
        String str2 = this.IAuthTabCallbackStub;
        String str3 = this.onWarmupCompleted;
        String str4 = this.onExtraCallbackWithResult;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        a(23 - View.combineMeasuredStates(0, 0), 8 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{65522, 6, 14, 65515, 4, 2, 0, 65509, 65500, 4, 2, '\b', 21, 17, 4, 18, 65479, '\r', 14, '\b', 18, 18, 4}, true, View.MeasureSpec.getSize(0) + 196, objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(str);
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 10, 5 - (ViewConfiguration.getEdgeSlop() >> 16), new char[]{'\t', '\r', 14, 65480, 65492, 65509, '\r', 26, 29, 28}, true, ((Process.getThreadPriority(0) + 20) >> 6) + 187, objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(logFeature);
        Object[] objArr3 = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8, 3 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{11, 65482, 65494, 65511, 24, 25, 19, 30, '\r'}, true, Color.alpha(0) + 185, objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(logAction);
        Object[] objArr4 = new Object[1];
        a(16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1 - View.getDefaultSize(0, 0), new char[]{65504, 65487, 65475, 23, 21, 4, 17, 22, 4, 6, 23, '\f', 18, 17, 65516, 7}, false, MotionEvent.axisFromString("") + 193, objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(str2);
        Object[] objArr5 = new Object[1];
        a(18 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6, new char[]{65526, 4, 23, 21, 65474, 65486, 65503, 6, 65515, 16, 17, 11, 22, 5, 3, 21, 16, 3, 20}, true, 194 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(str3);
        Object[] objArr6 = new Object[1];
        b(true, new byte[]{1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0}, new int[]{0, 20, 44, 0}, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(str4);
        Object[] objArr7 = new Object[1];
        b(false, new byte[]{1}, new int[]{20, 1, 0, 0}, objArr7);
        sb.append(((String) objArr7[0]).intern());
        String string = sb.toString();
        int i2 = onTransact + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return string;
    }

    public getAppLaunchParams(@NotNull String str, @NotNull LogFeature logFeature, @NotNull LogAction logAction, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logFeature, "");
        Intrinsics.checkNotNullParameter(logAction, "");
        this.onNavigationEvent = str;
        this.IAuthTabCallback = logFeature;
        this.onExtraCallback = logAction;
        this.IAuthTabCallbackStub = str2;
        this.onWarmupCompleted = str3;
        this.onExtraCallbackWithResult = str4;
    }

    public final String IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onNavigationEvent;
        int i5 = i2 + 39;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LogFeature onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    public final LogAction onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        LogAction logAction = this.onExtraCallback;
        int i5 = i3 + 95;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return logAction;
    }

    public final String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 63;
        onTransact = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.IAuthTabCallbackStub;
        int i4 = i2 + 9;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        int i3 = i2 % 128;
        onTransact = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.onWarmupCompleted;
        int i4 = i3 + 45;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.onExtraCallbackWithResult;
        int i5 = i2 + 55;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        float f;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            f = 0.0f;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 79;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(IAuthTabCallbackDefault)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35124 - TextUtils.indexOf((CharSequence) "", '0')), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23, View.getDefaultSize(0, 0) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 12843), 55 - (ViewConfiguration.getFadingEdgeLength() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $10 + 75;
                $11 = i9 % 128;
                int i10 = i9 % 2;
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $11 + 25;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 12843), 56 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)), 2166 - Process.getGidForName(""), 1298711993, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
                f = 0.0f;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = asInterface;
        if (cArr != null) {
            int i7 = $10 + 29;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 113;
                $10 = i10 % 128;
                int i11 = i10 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.getCapsMode("", 0, 0) + 35283), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 34, View.MeasureSpec.getMode(0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), View.MeasureSpec.getMode(0) + 65, 16718 - Color.argb(0, 0, 0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 30 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 17657 - View.MeasureSpec.makeMeasureSpec(0, 0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - TextUtils.getTrimmedLength("")), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 69, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i14 = $11 + 19;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 / 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i17 = $10 + 17;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i19 = $10 + 3;
        $11 = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }
}
