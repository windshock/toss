package com.bytedance.adsdk.ugeno.zb.zb;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.kernel.RVParams;
import com.bytedance.adsdk.ugeno.fby.fby;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class zb {
    private final sya ycx;
    private final List<dj> zb;

    static int ycx(String str) {
        if ("line".equals(str)) {
            return 1;
        }
        if ("rectangle".equals(str)) {
            return 2;
        }
        if (TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE.equals(str)) {
            return 3;
        }
        return "sphere".equals(str) ? 4 : 0;
    }

    public static final class dj {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long onExtraCallback = -6302953559120470316L;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        public final float dj;
        public final float ea;
        public final float fby;
        public final float jc;
        public final float jw;
        public final float lt;
        public final float lud;
        public final ycx ok;
        public final float sya;
        public final float ul;
        public final String ycx;
        public final float zb;

        private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            int i4 = $11 + 117;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 5;
            }
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 19628, 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallback ^ 5407414049857832247L);
                    try {
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 59 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i7 = $11 + 125;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 59 - Color.argb(0, 0, 0, 0), Color.red(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        private dj(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, ycx ycxVar) {
            this.ycx = str;
            this.zb = f;
            this.sya = f2;
            this.dj = f3;
            this.lud = f4;
            this.lt = f5;
            this.ul = f6;
            this.fby = f7;
            this.jw = f8;
            this.jc = f9;
            this.ea = f10;
            this.ok = ycxVar;
        }

        static dj ycx(Context context, JSONObject jSONObject) throws Throwable {
            int i2 = 2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{39821, 11919, 61844, 33953}, View.MeasureSpec.getSize(0) + 46349, objArr);
            dj djVar = new dj(jSONObject.optString(((String) objArr[0]).intern(), ""), (float) jSONObject.optDouble("birthRate", 1.0d), (float) jSONObject.optDouble("lifetime", 1.0d), (float) jSONObject.optDouble("lifetimeRange", 0.0d), (float) jSONObject.optDouble("scale", 1.0d), (float) jSONObject.optDouble("scaleRange", 0.0d), (float) jSONObject.optDouble("velocity", 0.0d), (float) jSONObject.optDouble("velocityRange", 0.0d), (float) jSONObject.optDouble("emissionRange", 0.0d), (float) jSONObject.optDouble("alphaRange", 0.0d), (float) jSONObject.optDouble("alphaSpeed", 0.0d), ycx.ycx(context, jSONObject.optJSONObject("content")));
            int i3 = onExtraCallbackWithResult + 47;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return djVar;
        }
    }

    static int zb(String str) {
        if ("outline".equals(str)) {
            return 1;
        }
        return "surface".equals(str) ? 2 : 0;
    }

    static int sya(String str) {
        if ("rect".equals(str)) {
            return 1;
        }
        return "star".equals(str) ? 2 : 0;
    }

    static int dj(String str) {
        if ("additive".equals(str)) {
            return 1;
        }
        if ("backToFront".equals(str) || "oldestFirst".equals(str)) {
            return 3;
        }
        return "oldestLast".equals(str) ? 4 : 0;
    }

    private zb(sya syaVar, List<dj> list) {
        this.ycx = syaVar;
        this.zb = list;
    }

    public sya ycx() {
        return this.ycx;
    }

    public List<dj> zb() {
        return this.zb;
    }

    public boolean sya() {
        List<dj> list = this.zb;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public static zb ycx(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ycx(context, new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static zb ycx(Context context, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        sya syaVarYcx = sya.ycx(jSONObject.optJSONObject("layer"));
        List<dj> listYcx = ycx(context, jSONObject.optJSONArray("particles"));
        if (listYcx.isEmpty()) {
            return null;
        }
        return new zb(syaVarYcx, listYcx);
    }

    private static List<dj> ycx(Context context, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null) {
                arrayList.add(dj.ycx(context, jSONObjectOptJSONObject));
            }
        }
        return arrayList;
    }

    public static final class sya {
        public final int dj;
        public final C0011zb fby;
        public final C0011zb jc;
        public final C0011zb jw;
        public final int lt;
        public final int lud;
        public final String sya;
        public final C0011zb ul;
        public final String ycx;
        public final String zb;

        private sya(String str, String str2, String str3, C0011zb c0011zb, C0011zb c0011zb2, C0011zb c0011zb3, C0011zb c0011zb4) {
            this.ycx = str;
            this.zb = str2;
            this.sya = str3;
            this.dj = zb.ycx(str);
            this.lud = zb.zb(str2);
            this.lt = zb.dj(str3);
            this.ul = c0011zb;
            this.fby = c0011zb2;
            this.jw = c0011zb3;
            this.jc = c0011zb4;
        }

        static sya ycx(JSONObject jSONObject) {
            if (jSONObject == null) {
                return ycx();
            }
            String strOptString = jSONObject.optString("emitterShape", "point");
            String strOptString2 = jSONObject.optString("emitterMode", "points");
            String strOptString3 = jSONObject.optString("renderMode", "unordered");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("emitterPosition");
            C0011zb c0011zbYcx = C0011zb.ycx(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("x") : null, new C0011zb(0.5f, true));
            C0011zb c0011zbYcx2 = C0011zb.ycx(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("y") : null, new C0011zb(0.0f, true));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("emitterSize");
            return new sya(strOptString, strOptString2, strOptString3, c0011zbYcx, c0011zbYcx2, C0011zb.ycx(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.opt("w") : null, new C0011zb(1.0f, true)), C0011zb.ycx(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.opt("h") : null, new C0011zb(1.0f, true)));
        }

        private static sya ycx() {
            return new sya("point", "points", "unordered", new C0011zb(0.5f, true), new C0011zb(0.0f, true), new C0011zb(1.0f, true), new C0011zb(1.0f, true));
        }
    }

    public static final class ycx {
        public final float dj;
        public final int lud;
        public final float sya;
        public final String ycx;
        public final int zb;

        private ycx(String str, float f, float f2, int i2) {
            this.ycx = str;
            this.zb = zb.sya(str);
            this.sya = f;
            this.dj = f2;
            this.lud = i2;
        }

        static ycx ycx(Context context, JSONObject jSONObject) {
            if (jSONObject == null) {
                return new ycx(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, fby.ycx(context, 6.0f), fby.ycx(context, 6.0f), -1);
            }
            return new ycx(jSONObject.optString("shape", TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE), fby.ycx(context, (float) jSONObject.optDouble("width", 6.0d)), fby.ycx(context, (float) jSONObject.optDouble("height", 6.0d)), com.bytedance.adsdk.ugeno.fby.ycx.ycx(jSONObject.optString(TtmlNode.ATTR_TTS_COLOR, "#FFFFFF"), -1));
        }
    }

    /* renamed from: com.bytedance.adsdk.ugeno.zb.zb.zb$zb, reason: collision with other inner class name */
    public static final class C0011zb {
        public final float ycx;
        public final boolean zb;

        public C0011zb(float f, boolean z) {
            this.ycx = f;
            this.zb = z;
        }

        static C0011zb ycx(Object obj, C0011zb c0011zb) {
            if (obj != null) {
                if (obj instanceof Number) {
                    return new C0011zb(((Number) obj).floatValue(), false);
                }
                String strTrim = obj.toString().trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    try {
                        if (strTrim.endsWith("%")) {
                            return new C0011zb(Float.parseFloat(strTrim.substring(0, strTrim.length() - 1)) / 100.0f, true);
                        }
                        return new C0011zb(Float.parseFloat(strTrim), false);
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return c0011zb;
        }

        public float ycx(float f) {
            return this.zb ? f * this.ycx : this.ycx;
        }
    }
}
