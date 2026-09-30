package com.bytedance.sdk.component.adexpress.dynamic.lud;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Iterator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw {
    private static short[] onNavigationEvent;
    private static final byte[] $$a = {106, -23, 12, Byte.MIN_VALUE};
    private static final int $$b = 90;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = 999922030;
    private static int onExtraCallbackWithResult = -1538795395;
    private static int onExtraCallback = -1010433430;
    private static byte[] onWarmupCompleted = {-60, 58, -44, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, short s2) {
        int i3;
        int i4;
        int i5 = 115 - (s2 * 3);
        int i6 = (s * 2) + 1;
        int i7 = (i2 * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            int i9 = i7;
            int i10 = (-i7) + i8;
            int i11 = i9 + 1;
            i3 = i4;
            i5 = i10;
            i7 = i11;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            int i12 = i5;
            i9 = i7;
            i7 = bArr[i7];
            i8 = i12;
            int i102 = (-i7) + i8;
            int i112 = i9 + 1;
            i3 = i4;
            i5 = i102;
            i7 = i112;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    public static void ycx(String str, JSONObject jSONObject) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectBjp = com.bytedance.sdk.component.adexpress.zb.bjp(str);
        if (jSONObjectBjp != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObjectOptJSONObject = jSONObjectBjp.optJSONObject("values");
            if (jSONObjectOptJSONObject != null) {
                ycx(jSONObjectOptJSONObject, jSONObject);
                return;
            }
        }
        int i5 = asInterface + 95;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    public static JSONObject ycx(String str, JSONObject jSONObject, JSONObject jSONObject2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = asInterface + 89;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectBjp = com.bytedance.sdk.component.adexpress.zb.bjp(str);
        if (jSONObjectBjp == null) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectYcx = ycx(jSONObject2, jSONObjectBjp.optJSONObject("themeValues"), jSONObject);
        int i5 = asInterface + 31;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 49 / 0;
        }
        return jSONObjectYcx;
    }

    private static void ycx(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys;
        int i2 = 2 % 2;
        int i3 = asInterface + 121;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject != null) {
            int i5 = asInterface + 55;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                itKeys = jSONObject.keys();
                int i6 = 47 / 0;
            } else {
                itKeys = jSONObject.keys();
            }
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!jSONObject2.has(next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException e) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61aveBWMRYniS0IVf9", "TuAkmg2WesiO", 65);
                    }
                }
            }
        }
    }

    public static JSONObject ycx(JSONObject... jSONObjectArr) throws JSONException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        for (JSONObject jSONObject2 : jSONObjectArr) {
            int i3 = onTransact + 97;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                int i5 = onTransact + 89;
                asInterface = i5 % 128;
                while (true) {
                    int i6 = i5 % 2;
                    while (!(!itKeys.hasNext())) {
                        int i7 = asInterface + 7;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        String next = itKeys.next();
                        try {
                            jSONObject.put(next, jSONObject2.opt(next));
                            break;
                        } catch (JSONException e) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61aveBWMRYniS0IVf9", "TuAkmg0=", 84);
                        }
                    }
                    i5 = asInterface + 89;
                    onTransact = i5 % 128;
                }
            }
        }
        return jSONObject;
    }

    public static String ycx(String str) throws Throwable {
        int i2 = 2 % 2;
        JSONObject jSONObjectBjp = com.bytedance.sdk.component.adexpress.zb.bjp(str);
        if (jSONObjectBjp != null) {
            JSONObject jSONObjectOptJSONObject = jSONObjectBjp.optJSONObject("values");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            Object[] objArr = new Object[1];
            a((short) Color.blue(0), (byte) (KeyEvent.normalizeMetaState(0) + 33), Color.argb(0, 0, 0, 0) + 1612824218, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1736563198, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 114, objArr);
            return jSONObjectOptJSONObject.optString(((String) objArr[0]).intern());
        }
        int i3 = asInterface;
        int i4 = i3 + 73;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i3 + 61;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return null;
    }

    public static String ycx(String str, String str2) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectBjp = com.bytedance.sdk.component.adexpress.zb.bjp(str);
        if (jSONObjectBjp == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObjectBjp.optJSONObject("values");
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optString(str2);
        }
        int i5 = onTransact + 35;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
        return null;
    }

    public static JSONObject ycx(JSONArray jSONArray) {
        int i2 = 2 % 2;
        int i3 = onTransact + 85;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        int i4 = asInterface + 57;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject.optJSONObject("values");
        }
        int i6 = onTransact + 59;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static String zb(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = asInterface + 37;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
            return ycx.ycx(str);
        }
        int i5 = asInterface + 87;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        if (str.indexOf(46) < 0) {
            str = str + ".png";
        }
        String str3 = str2 + "static/images/" + str;
        int i7 = asInterface + 17;
        onTransact = i7 % 128;
        int i8 = i7 % 2;
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6 A[PHI: r0
      0x01b6: PHI (r0v9 int) = (r0v8 int), (r0v40 int) binds: [B:47:0x01b4, B:44:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b8 A[PHI: r0
      0x01b8: PHI (r0v37 int) = (r0v8 int), (r0v40 int) binds: [B:47:0x01b4, B:44:0x01a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z;
        int i5;
        int i6;
        int length;
        byte[] bArr;
        int i7;
        int i8 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getEdgeSlop() >> 16) + 42, 22439 - KeyEvent.normalizeMetaState(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $11 + 11;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = onWarmupCompleted;
                if (bArr2 != null) {
                    int i11 = $10;
                    int i12 = i11 + 43;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i7 = 0;
                    }
                    int i13 = i11 + 27;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 12843), 55 - (Process.myPid() >> 22), 2167 - KeyEvent.normalizeMetaState(0), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i7] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i7++;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - MotionEvent.axisFromString("")), 42 - Color.green(0), TextUtils.getTrimmedLength("") + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (onNavigationEvent[i2 + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i15 = $10 + 49;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    i5 = ((i2 << iIntValue) - 3) << ((int) (IAuthTabCallback % (-4629411779493505016L)));
                    i6 = z ? 1 : 0;
                } else {
                    i5 = ((i2 + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                    if (z) {
                    }
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i5 + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onExtraCallback), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), View.MeasureSpec.getMode(0) + 86, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9566, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onWarmupCompleted;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (bArr4[i16] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r4] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
