package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.ugeno.zb.sya;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private long dj;
    private String lt;
    private long lud;
    private List<C0003ycx> sya;
    private String ycx;
    private float zb;

    public String ycx() {
        return this.ycx;
    }

    public void ycx(String str) {
        this.ycx = str;
    }

    public void ycx(float f) {
        this.zb = f;
    }

    public float zb() {
        return this.zb;
    }

    public List<C0003ycx> sya() {
        return this.sya;
    }

    public void ycx(List<C0003ycx> list) {
        this.sya = list;
    }

    public long dj() {
        return this.dj;
    }

    public void ycx(long j) {
        this.dj = j;
    }

    public long lud() {
        return this.lud;
    }

    public void zb(long j) {
        this.lud = j;
    }

    public String lt() {
        return this.lt;
    }

    public void zb(String str) {
        this.lt = str;
    }

    public static ycx ycx(String str, sya syaVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return ycx(new JSONObject(str), syaVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static ycx ycx(JSONObject jSONObject, sya syaVar) {
        return ycx(jSONObject, null, syaVar);
    }

    public static ycx ycx(JSONObject jSONObject, JSONObject jSONObject2, sya syaVar) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        ycx ycxVar = new ycx();
        ycxVar.ycx(jSONObject.optString("ordering"));
        String strOptString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", strOptString)) {
            ycxVar.ycx(-1.0f);
        } else {
            try {
                ycxVar.ycx(Float.parseFloat(strOptString));
            } catch (NumberFormatException unused) {
                ycxVar.ycx(0.0f);
            }
        }
        ycxVar.ycx(jSONObject.optLong("duration", 0L));
        ycxVar.zb(com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("startDelay"), syaVar.ok()), 0L));
        ycxVar.zb(jSONObject.optString("loopMode"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animators");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.fby.zb.ycx(jSONObject2, jSONObjectOptJSONObject);
                }
                arrayList.add(C0003ycx.ycx(jSONObjectOptJSONObject, syaVar));
            }
            ycxVar.ycx(arrayList);
        }
        return ycxVar;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.core.ycx$ycx, reason: collision with other inner class name */
    public static class C0003ycx {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        private long dj;
        private float[] fby;
        private String jc;
        private String jw;
        private float lt;
        private String lud;
        private String sya;
        private float ul;
        private long ycx;
        private float zb;
        private static char[] IAuthTabCallback = {64978, 64989, 64967, 64970, 64986, 64982, 64990, 64988, 64963};
        private static char onWarmupCompleted = 51242;

        public long ycx() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 3;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            long j = this.ycx;
            if (i5 == 0) {
                int i6 = 33 / 0;
            }
            int i7 = i4 + 29;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return j;
        }

        public void ycx(long j) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 55;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            this.ycx = j;
            int i6 = i4 + 119;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 7 / 0;
            }
        }

        public float zb() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 99;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            float f = this.zb;
            int i6 = i3 + 49;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void ycx(float f) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 85;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.zb = f;
            if (i4 == 0) {
                throw null;
            }
        }

        public String sya() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 59;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String str = this.sya;
            int i6 = i3 + 95;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public void ycx(String str) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 103;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            this.sya = str;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i4 + 33;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 17 / 0;
            }
        }

        public long dj() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return this.dj;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void zb(long j) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 83;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            this.dj = j;
            int i6 = i4 + 27;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
        }

        public String lud() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 71;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            String str = this.lud;
            int i6 = i3 + 19;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public void zb(String str) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 21;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.lud = str;
            int i6 = i3 + 37;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 96 / 0;
            }
        }

        public float lt() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return this.lt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void zb(float f) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 79;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.lt = f;
            int i6 = i3 + 59;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        public float ul() {
            float f;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 75;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            if (i3 % 2 != 0) {
                f = this.ul;
                int i5 = 9 / 0;
            } else {
                f = this.ul;
            }
            int i6 = i4 + 111;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return f;
        }

        public void sya(float f) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 103;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.ul = f;
            if (i5 == 0) {
                int i6 = 25 / 0;
            }
            int i7 = i3 + 47;
            onNavigationEvent = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 83 / 0;
            }
        }

        public float[] fby() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 125;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            float[] fArr = this.fby;
            int i6 = i4 + 79;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            return fArr;
        }

        public void ycx(float[] fArr) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 111;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.fby = fArr;
            int i6 = i3 + 41;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        public String jw() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 35;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            String str = this.jw;
            int i5 = i3 + 67;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String jc() {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent;
            int i4 = i3 + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            String str = this.jc;
            int i6 = i3 + 13;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public void sya(String str) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 41;
            int i4 = i3 % 128;
            onNavigationEvent = i4;
            int i5 = i3 % 2;
            this.jc = str;
            if (i5 == 0) {
                int i6 = 32 / 0;
            }
            int i7 = i4 + 55;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
        }

        public void dj(String str) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult;
            int i4 = i3 + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            this.jw = str;
            int i6 = i3 + 11;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
        }

        private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
            int i3;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr2 = IAuthTabCallback;
            int i5 = 8;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 41;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 26 - (ViewConfiguration.getTouchSlop() >> i5), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i6 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 26, 23139 - KeyEvent.getDeadChar(0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i6++;
                    }
                    i5 = 8;
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23138 - TextUtils.lastIndexOf("", '0', 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
                }
                char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                char[] cArr4 = new char[i2];
                if (i2 % 2 != 0) {
                    int i8 = $10 + 17;
                    $11 = i8 % 128;
                    if (i8 % 2 == 0) {
                        i3 = i2 + 59;
                        cArr4[i3] = (char) (cArr[i3] / b);
                    } else {
                        i3 = i2 - 1;
                        cArr4[i3] = (char) (cArr[i3] - b);
                    }
                } else {
                    i3 = i2;
                }
                if (i3 > 1) {
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            int i9 = $10 + 43;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        } else {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24824), (ViewConfiguration.getEdgeSlop() >> 16) + 74, 8088 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                int i11 = $11 + 3;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                try {
                                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback5 == null) {
                                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 30 - (ViewConfiguration.getLongPressTimeout() >> 16), 19488 - (KeyEvent.getMaxKeyCode() >> 16), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                                    int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i15];
                            } else {
                                int i16 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i17 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i16];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i17];
                            }
                        }
                        defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    }
                }
                int i18 = $10 + 19;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                int i20 = 0;
                while (i20 < i2) {
                    int i21 = $10 + 59;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        cArr4[i20] = (char) (cArr4[i20] ^ 3416);
                        i20 += 57;
                    } else {
                        cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                        i20++;
                    }
                }
                objArr[0] = new String(cArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        public static C0003ycx ycx(JSONObject jSONObject, sya syaVar) throws Throwable {
            int i2 = 2 % 2;
            if (jSONObject != null) {
                C0003ycx c0003ycx = new C0003ycx();
                c0003ycx.ycx(jSONObject.optLong("duration"));
                String strOptString = jSONObject.optString("loop");
                if (TextUtils.equals("infinite", strOptString)) {
                    c0003ycx.ycx(-1.0f);
                } else {
                    try {
                        c0003ycx.ycx(Float.parseFloat(strOptString));
                    } catch (NumberFormatException unused) {
                        c0003ycx.ycx(0.0f);
                    }
                }
                c0003ycx.ycx(jSONObject.optString("loopMode"));
                int i3 = 0;
                Object[] objArr = new Object[1];
                a(new char[]{0, 5, 2, '\b'}, (byte) (97 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 4, objArr);
                c0003ycx.zb(jSONObject.optString(((String) objArr[0]).intern()));
                if (TextUtils.equals(c0003ycx.lud(), "ripple")) {
                    c0003ycx.sya(jSONObject.optString("rippleColor"));
                }
                View viewEa = syaVar.ea();
                Context context = viewEa != null ? viewEa.getContext() : null;
                if (!TextUtils.equals(c0003ycx.lud(), TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                    if ((TextUtils.equals(c0003ycx.lud(), "translateX") || TextUtils.equals(c0003ycx.lud(), "translateY")) && context != null) {
                        try {
                            float fYcx = com.bytedance.adsdk.ugeno.fby.fby.ycx(context, (float) jSONObject.optDouble("valueFrom"));
                            float fYcx2 = com.bytedance.adsdk.ugeno.fby.fby.ycx(context, (float) jSONObject.optDouble("valueTo"));
                            c0003ycx.zb(fYcx);
                            c0003ycx.sya(fYcx2);
                        } catch (Exception unused2) {
                            KeyEvent.getMaxKeyCode();
                            ViewConfiguration.getZoomControlsTimeout();
                        }
                    } else {
                        c0003ycx.zb((float) jSONObject.optDouble("valueFrom"));
                        c0003ycx.sya((float) jSONObject.optDouble("valueTo"));
                    }
                } else {
                    int i4 = onExtraCallbackWithResult + 87;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        String strYcx = com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("valueTo"), syaVar.ok());
                        int iYcx = com.bytedance.adsdk.ugeno.fby.ycx.ycx(jSONObject.optString("valueFrom"));
                        int iYcx2 = com.bytedance.adsdk.ugeno.fby.ycx.ycx(strYcx);
                        c0003ycx.zb(iYcx);
                        c0003ycx.sya(iYcx2);
                    } else {
                        String strYcx2 = com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("valueTo"), syaVar.ok());
                        int iYcx3 = com.bytedance.adsdk.ugeno.fby.ycx.ycx(jSONObject.optString("valueFrom"));
                        int iYcx4 = com.bytedance.adsdk.ugeno.fby.ycx.ycx(strYcx2);
                        c0003ycx.zb(iYcx3);
                        c0003ycx.sya(iYcx4);
                        throw null;
                    }
                }
                c0003ycx.dj(jSONObject.optString("interpolator"));
                c0003ycx.zb(com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx(jSONObject.optString("startDelay"), syaVar.ok()), 0L));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
                if (jSONArrayOptJSONArray != null) {
                    int i5 = onExtraCallbackWithResult + 103;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 != 0) {
                        if (jSONArrayOptJSONArray.length() > 0) {
                            float[] fArr = new float[jSONArrayOptJSONArray.length()];
                            if ((TextUtils.equals(c0003ycx.lud(), "translateX") || TextUtils.equals(c0003ycx.lud(), "translateY")) && context != null) {
                                while (i3 < jSONArrayOptJSONArray.length()) {
                                    fArr[i3] = com.bytedance.adsdk.ugeno.fby.fby.ycx(context, (float) ycx.ycx(jSONArrayOptJSONArray.optString(i3), syaVar.ok()));
                                    i3++;
                                }
                            } else {
                                while (i3 < jSONArrayOptJSONArray.length()) {
                                    fArr[i3] = (float) ycx.ycx(jSONArrayOptJSONArray.optString(i3), syaVar.ok());
                                    i3++;
                                }
                            }
                            c0003ycx.ycx(fArr);
                        }
                    } else {
                        jSONArrayOptJSONArray.length();
                        throw null;
                    }
                }
                return c0003ycx;
            }
            int i6 = onExtraCallbackWithResult + 93;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    public static double ycx(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.fby.sya.ycx(com.bytedance.adsdk.ugeno.dj.zb.ycx((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
