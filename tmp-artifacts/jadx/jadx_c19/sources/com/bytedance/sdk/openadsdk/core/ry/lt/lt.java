package com.bytedance.sdk.openadsdk.core.ry.lt;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.component.utils.pmi;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.uh;
import com.bytedance.sdk.openadsdk.utils.oby;
import java.lang.reflect.Method;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TimelineExternalSyntheticLambda1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    private final String dj;
    private final String sya;
    private final String ycx = "UGenV3OpenLinks";
    private final String zb = "landingStyle";
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 165;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;
    private static char[] IAuthTabCallback = {24102, 64811, 6187};
    private static long onNavigationEvent = 4950022755178794718L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, short s, byte b2) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = b2 + 4;
        int i5 = (s * 2) + 1;
        int i6 = 97 - (b * 3);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i4];
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
            }
        }
    }

    public lt() throws Throwable {
        Object[] objArr = new Object[1];
        a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 3 - Color.argb(0, 0, 0, 0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45959), objArr);
        this.sya = ((String) objArr[0]).intern();
        this.dj = "fallbackUrl";
    }

    public void ycx(Context context, boolean z, tn tnVar, String str, Map<String, Object> map, com.bytedance.sdk.openadsdk.core.widget.lt ltVar) {
        int i2;
        int i3 = 2 % 2;
        int i4 = onExtraCallback;
        int i5 = i4 + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
            if (map == null) {
                return;
            }
        } else if (map == null) {
            return;
        }
        int i7 = i4 + 15;
        onExtraCallbackWithResult = i7 % 128;
        String strValueOf = null;
        if (i7 % 2 != 0) {
            map.isEmpty();
            strValueOf.hashCode();
            throw null;
        }
        if (map.isEmpty()) {
            return;
        }
        int i8 = onExtraCallback + 1;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        try {
            Object obj = map.get("landingStyle");
            Object[] objArr = new Object[1];
            a(Color.argb(0, 0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, (char) (Color.green(0) + 45959), objArr);
            Object obj2 = map.get(((String) objArr[0]).intern());
            Object obj3 = map.get("fallbackUrl");
            if (obj != null) {
                int i10 = onExtraCallbackWithResult + 15;
                onExtraCallback = i10 % 128;
                try {
                    if (i10 % 2 == 0) {
                        Integer.parseInt(String.valueOf(obj));
                        strValueOf.hashCode();
                        throw null;
                    }
                    i2 = Integer.parseInt(String.valueOf(obj));
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzXvRteFRPtUghqz", "VP4omyK4RcaOTudcixSMIVXlPg==", 36);
                }
            } else {
                i2 = -1;
            }
            String strValueOf2 = obj2 != null ? String.valueOf(obj2) : null;
            if (obj3 != null) {
                strValueOf = String.valueOf(obj3);
                int i11 = onExtraCallback + 71;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
            }
            if (ycx(i2, strValueOf2, strValueOf)) {
                uh.ycx(context, z, ycx(map), tnVar, str, oby.ycx(str), (WebView) null, ltVar);
                int i13 = onExtraCallback + 125;
                onExtraCallbackWithResult = i13 % 128;
                int i14 = i13 % 2;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzXvRteFRPtUghqz", "VP4omyK4RcaOTudcixSMIVXlPg==", 65);
            htf.sya("UGenV3OpenLinks", th2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean ycx(int i2, String str, String str2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        if (i2 == 1) {
            if (!pmi.ycx(str)) {
                int i6 = onExtraCallback + 71;
                onExtraCallbackWithResult = i6 % 128;
                return i6 % 2 != 0;
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
            }
        } else {
            if (TextUtils.isEmpty(str) && !(!TextUtils.isEmpty(str2))) {
                int i7 = onExtraCallback + 49;
                onExtraCallbackWithResult = i7 % 128;
                return i7 % 2 != 0;
            }
            if (!pmi.ycx(str2)) {
                int i8 = onExtraCallback + 85;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
        }
        return true;
    }

    private static void a(int i2, int i3, char c, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i5 = $10 + 39;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            int i7 = $11 + 37;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i2 - i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 59696), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 17, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - TextUtils.getTrimmedLength("")), 31 - (ViewConfiguration.getPressedStateDuration() >> 16), 20220 - (ViewConfiguration.getEdgeSlop() >> 16), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, 1494 - Color.alpha(0), -1657859959, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
                int i9 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i2 + i9])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 59697), 17 - View.resolveSize(0, 0), TextUtils.indexOf("", "", 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46133), 32 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 20221 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i9] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback6 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1494, -1657859959, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback6).invoke(null, objArr7);
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
        }
        char[] cArr = new char[i3];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i3) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback7 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49123), ExpandableListView.getPackedPositionChild(0L) + 45, TextUtils.getOffsetAfter("", 0) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback7).invoke(null, objArr8);
            int i10 = $11 + 57;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private JSONObject ycx(Map<String, Object> map) throws JSONException {
        int i2 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            try {
                int i3 = onExtraCallback + 55;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        int i5 = onExtraCallbackWithResult + 71;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        jSONObject.put(entry.getKey(), String.valueOf(value));
                    }
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzXvRteFRPtUghqz", "Vu89xymvZsk=", 103);
            }
        }
        return jSONObject;
    }
}
