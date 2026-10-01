package com.bytedance.adsdk.ugeno.lud;

import android.graphics.PointF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.ugeno.lud.lt;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ok {
    private static short[] onExtraCallbackWithResult;
    private static final byte[] $$a = {1, -9, -86, 35};
    private static final int $$b = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = -696206578;
    private static int onExtraCallback = -1538795435;
    private static int onNavigationEvent = 850420947;
    private static byte[] onWarmupCompleted = {-16, 4, -5, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, short s3) {
        int i2;
        int i3 = 115 - (s3 * 2);
        int i4 = s2 + 4;
        int i5 = s * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i3 += i7;
            bArr2[i2] = (byte) i3;
            i4++;
            if (i2 == i6) {
                return new String(bArr2, 0);
            }
            i2++;
            i7 = bArr[i4];
            i3 += i7;
            bArr2[i2] = (byte) i3;
            i4++;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i4++;
            if (i2 == i6) {
            }
        }
    }

    public static lt.ycx ycx(String str, JSONObject jSONObject) {
        int i2 = 2 % 2;
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        lt.ycx ycxVar = new lt.ycx();
        String strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(str, jSONObject);
        if (strYcx.contains("#")) {
            strYcx = strYcx.replace("#", "%23");
        }
        Uri uri = Uri.parse(strYcx);
        if (uri == null) {
            return null;
        }
        ycxVar.sya(strYcx);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            int i3 = asInterface + 45;
            onTransact = i3 % 128;
            if (i3 % 2 != 0) {
                ycxVar.ycx(uri.getScheme());
                obj.hashCode();
                throw null;
            }
            ycxVar.ycx(uri.getScheme());
            int i4 = asInterface + 47;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        ycxVar.zb(authority);
        ycxVar.dj(ycxVar.ycx() + "://" + ycxVar.zb());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.dj.zb.ycx(uri.getQueryParameter(str2), jSONObject));
            }
        }
        ycxVar.ycx(map);
        return ycxVar;
    }

    public static lt.ycx ycx(JSONObject jSONObject, JSONObject jSONObject2) throws Throwable {
        int i2 = 2 % 2;
        Object obj = null;
        if (jSONObject == null) {
            int i3 = asInterface + 39;
            int i4 = i3 % 128;
            onTransact = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 85;
            asInterface = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 59 / 0;
            }
            return null;
        }
        lt.ycx ycxVar = new lt.ycx();
        String strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("protocol"), jSONObject2);
        Object[] objArr = new Object[1];
        a((short) View.resolveSizeAndState(0, 0, 0), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), View.resolveSizeAndState(0, 0, 0) - 1925669638, 1762149268 + MotionEvent.axisFromString(""), (ViewConfiguration.getLongPressTimeout() >> 16) - 89, objArr);
        ycxVar.zb(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString(((String) objArr[0]).intern()), jSONObject2));
        if (TextUtils.isEmpty(strYcx)) {
            ycxVar.ycx("global");
        } else {
            ycxVar.ycx(strYcx);
        }
        ycxVar.dj(ycxVar.ycx() + "://" + ycxVar.zb());
        ycxVar.sya(String.valueOf(jSONObject.hashCode()));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("args");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (!(!itKeys.hasNext())) {
                String next = itKeys.next();
                map.put(next, com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObjectOptJSONObject.opt(next), jSONObject2));
            }
        }
        ycxVar.ycx(map);
        int i8 = asInterface + 7;
        onTransact = i8 % 128;
        if (i8 % 2 == 0) {
            return ycxVar;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        long j;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, 22440 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i5 = 1;
            } else {
                int i7 = $10 + 9;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i5 = 0;
            }
            if (i5 == 0) {
                j = -4629411779493505016L;
            } else {
                byte[] bArr = onWarmupCompleted;
                if (bArr != null) {
                    int i9 = $10 + 83;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 12843);
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 56;
                                int deadChar = KeyEvent.getDeadChar(0, 0) + 2167;
                                byte b2 = $$a[0];
                                byte b3 = (byte) (b2 - 1);
                                byte b4 = (byte) (-b2);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cCombineMeasuredStates, modifierMetaStateMask, deadChar, -299036574, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onWarmupCompleted;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 42 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onExtraCallbackWithResult[i2 + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i2 + iIntValue) - 2) + ((int) (IAuthTabCallback ^ j)) + i5;
                try {
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onNavigationEvent), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 86, TextUtils.indexOf("", "", 0, 0) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onWarmupCompleted;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        if (!z) {
                            short[] sArr = onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            int i13 = $11 + 107;
                            $10 = i13 % 128;
                            if (i13 % 2 != 0) {
                                byte[] bArr6 = onWarmupCompleted;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent / 0;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback * (((byte) (((byte) (bArr6[r7] - (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                byte[] bArr7 = onWarmupCompleted;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                                sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                                int i14 = $11 + 61;
                                $10 = i14 % 128;
                                int i15 = i14 % 2;
                            }
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        int i142 = $11 + 61;
                        $10 = i142 % 128;
                        int i152 = i142 % 2;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }
}
