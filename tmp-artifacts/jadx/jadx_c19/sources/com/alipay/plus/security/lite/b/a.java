package com.alipay.plus.security.lite.b;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class a {
    private static char[] IAuthTabCallback;
    public static final String a;
    private static int onExtraCallback;
    private static long onWarmupCompleted;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 65;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int asBinder = 1;
    private static int onNavigationEvent = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i2;
        int i3 = (s * 3) + 97;
        int i4 = b2 * 2;
        byte[] bArr = $$a;
        int i5 = 3 - (b * 3);
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i3 += i5;
            i5 = i7;
            i2 = i8;
            int i9 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i7 = i9;
            i5 = bArr[i9];
            i3 += i5;
            i5 = i7;
            i2 = i8;
            int i92 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i922 = i5 + 1;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    static {
        onExtraCallback = 1;
        onWarmupCompleted();
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[1];
        b(Color.green(0), 12 - Process.getGidForName(""), (char) KeyEvent.getDeadChar(0, 0), objArr);
        sb.append(((String) objArr[0]).intern());
        sb.append(a.class.getSimpleName());
        a = sb.toString();
        int i2 = onNavigationEvent + 61;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static String a(Context context, String str, String str2) {
        String strOptString;
        int i2 = 2 % 2;
        int i3 = asBinder + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        try {
            String strB = b.b(context, "security_lite_config");
            if (strB != null) {
                strOptString = new JSONObject(strB).optString("apiKey_" + str, "");
                int i5 = asBinder + 19;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else {
                strOptString = "";
            }
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            return c.a(context, "com.alipay.plus.security.lite.API_KEY." + str, "");
        } catch (Throwable th) {
            d.a(a, th.getMessage());
            return str2;
        }
    }

    private static void b(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $11 + 87;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i7 = $10 + 115;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 >>> i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 17, Color.alpha(0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - KeyEvent.normalizeMetaState(0)), TextUtils.indexOf("", "") + 31, Gravity.getAbsoluteGravity(0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char cIndexOf = (char) (49122 - TextUtils.indexOf((CharSequence) "", '0'));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                        int i9 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1493;
                        byte b = (byte) ($$a[0] - 1);
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf, pressedStateDuration, i9, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                int i10 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i2 + i10])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 59697), Color.alpha(0) + 17, 10974 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 46134), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 20220 - (KeyEvent.getMaxKeyCode() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    char c2 = (char) (49124 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44;
                    int i11 = 1495 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c2, minimumFlingVelocity, i11, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i12 = $11 + 9;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                char cIndexOf2 = (char) (49123 - TextUtils.indexOf("", ""));
                int mode = 44 - View.MeasureSpec.getMode(0);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1495;
                byte b5 = (byte) ($$a[0] - 1);
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cIndexOf2, mode, iLastIndexOf, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    static void onWarmupCompleted() {
        IAuthTabCallback = new char[]{60807, 55191, 39419, 17363, 1342, 52995, 45380, 31399, 15528, 59115, 43228, 37395, 21553};
        onWarmupCompleted = -3486244552549083150L;
    }
}
