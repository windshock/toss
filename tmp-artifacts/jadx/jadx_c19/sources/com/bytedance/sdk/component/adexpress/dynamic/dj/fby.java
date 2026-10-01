package com.bytedance.sdk.component.adexpress.dynamic.dj;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class fby {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 42049;
    private static int asBinder = 1;
    private static char onExtraCallback = 12333;
    private static int onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 57778;
    private static char onWarmupCompleted = 12954;
    private float dj;
    private fby ea;
    private float fby;
    private List<fby> jc;
    private lud jw;
    private float lt;
    private float lud;
    private List<List<fby>> ok;
    private String ry;
    private float sya;
    private float ul;
    private boolean xkz;
    private String ycx;
    private float zb;
    private Map<String, String> syc = new HashMap();
    private Map<Integer, String> dy = new HashMap();

    public String ycx() {
        String str;
        int i2 = 2 % 2;
        int i3 = asBinder + 107;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        if (i3 % 2 != 0) {
            str = this.ry;
            int i5 = 81 / 0;
        } else {
            str = this.ry;
        }
        int i6 = i4 + 11;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void ycx(String str) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        this.ry = str;
        int i6 = i3 + 115;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public Map<Integer, String> zb() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 81;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        Map<Integer, String> map = this.dy;
        int i6 = i3 + 55;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public void ycx(JSONArray jSONArray) {
        int i2 = 2 % 2;
        if (jSONArray != null) {
            int i3 = asBinder + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            try {
                if (jSONArray.length() == 0) {
                    int i5 = onExtraCallbackWithResult + 83;
                    asBinder = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    int i8 = asBinder + 121;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i7);
                    Map<Integer, String> map = this.dy;
                    Integer numValueOf = Integer.valueOf(jSONObjectOptJSONObject.optInt(TtmlNode.ATTR_ID));
                    Object[] objArr = new Object[1];
                    a(new char[]{38653, 4025, 64221, 47622, 3298, 47662}, 5 - ExpandableListView.getPackedPositionType(0L), objArr);
                    map.put(numValueOf, jSONObjectOptJSONObject.optString(((String) objArr[0]).intern()));
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImCSuIU8=", "SOs5twSRaNOFWN5cgDKlJk/rP7YCsGrkj0bYTw==", 54);
            }
        }
        int i10 = asBinder + 3;
        onExtraCallbackWithResult = i10 % 128;
        int i11 = i10 % 2;
    }

    public String sya() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 93;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ycx;
        int i6 = i3 + 107;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void zb(String str) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 93;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.ycx = str;
        if (i5 == 0) {
            int i6 = 83 / 0;
        }
        int i7 = i4 + 89;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float dj() {
        float f;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 9;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            f = this.dj;
            int i5 = 9 / 0;
        } else {
            f = this.dj;
        }
        int i6 = i3 + 11;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return f;
    }

    public void ycx(float f) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.dj = f;
        if (i4 == 0) {
            throw null;
        }
    }

    public float lud() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 5;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        float f = this.lud;
        int i6 = i3 + 5;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return f;
    }

    public void zb(float f) {
        int i2 = 2 % 2;
        int i3 = asBinder + 59;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.lud = f;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 93;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public float lt() {
        int i2 = 2 % 2;
        int i3 = asBinder + 35;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        float f = this.zb;
        int i6 = i4 + 107;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return f;
        }
        throw null;
    }

    public void sya(float f) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.zb = f;
        int i6 = i4 + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public float ul() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 73;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        float f = this.sya;
        int i6 = i4 + 71;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 80 / 0;
        }
        return f;
    }

    public void dj(float f) {
        int i2 = 2 % 2;
        int i3 = asBinder + 27;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.sya = f;
        int i6 = i4 + 113;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public float fby() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 103;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        float f = this.lt;
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        return f;
    }

    public void lud(float f) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 7;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.lt = f;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 61;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public float jw() {
        float f;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 25;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            f = this.ul;
            int i5 = 90 / 0;
        } else {
            f = this.ul;
        }
        int i6 = i3 + 1;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 5 / 0;
        }
        return f;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            int i6 = i4;
            while (i6 < 16) {
                int i7 = $10 + 45;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i5) ^ ((c2 << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        charSequence = "";
                        char offsetAfter = (char) TextUtils.getOffsetAfter(charSequence, i4);
                        int iResolveOpacity = Drawable.resolveOpacity(i4, i4) + 10;
                        int packedPositionGroup = 12434 - ExpandableListView.getPackedPositionGroup(0L);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetAfter, iResolveOpacity, packedPositionGroup, -787580090, false, "C", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), TextUtils.getCapsMode(charSequence, 0, 0) + 10, ExpandableListView.getPackedPositionGroup(0L) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    cArr3 = cArr4;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - TextUtils.indexOf("", "")), 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i11 = $10 + 71;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public void lt(float f) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.ul = f;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 73;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void ul(float f) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 35;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        this.fby = f;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public lud jc() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        lud ludVar = this.jw;
        int i5 = i4 + 115;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return ludVar;
    }

    public void ycx(lud ludVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 71;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.jw = ludVar;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 25;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public List<fby> ea() {
        int i2 = 2 % 2;
        int i3 = asBinder + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return this.jc;
        }
        throw null;
    }

    public void ycx(List<fby> list) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 97;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        this.jc = list;
        int i6 = i3 + 99;
        onExtraCallbackWithResult = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void ycx(fby fbyVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 105;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.ea = fbyVar;
        int i6 = i3 + 5;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    public fby ok() {
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        fby fbyVar = this.ea;
        int i6 = i4 + 103;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return fbyVar;
    }

    public int ry() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        lt ltVarLud = this.jw.lud();
        int iZr = ltVarLud.zr() + ltVarLud.bba();
        int i5 = asBinder + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return iZr;
        }
        throw null;
    }

    public int xkz() {
        int i2 = 2 % 2;
        int i3 = asBinder + 5;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        lt ltVarLud = this.jw.lud();
        int iXym = ltVarLud.xym() + ltVarLud.rl();
        int i5 = asBinder + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iXym;
    }

    public float syc() {
        float fRy;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            lt ltVarLud = this.jw.lud();
            fRy = ((ry() / ltVarLud.syc()) + ltVarLud.dy()) % (ltVarLud.ok() - 0.0f);
        } else {
            lt ltVarLud2 = this.jw.lud();
            fRy = ry() + ltVarLud2.syc() + ltVarLud2.dy() + (ltVarLud2.ok() * 2.0f);
        }
        int i4 = onExtraCallbackWithResult + 107;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return fRy;
    }

    public float dy() {
        float fXkz;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            lt ltVarLud = this.jw.lud();
            fXkz = ((xkz() - ltVarLud.wie()) + ltVarLud.xkz()) % (ltVarLud.ok() * 2.0f);
        } else {
            lt ltVarLud2 = this.jw.lud();
            fXkz = xkz() + ltVarLud2.wie() + ltVarLud2.xkz() + (ltVarLud2.ok() * 2.0f);
        }
        int i4 = onExtraCallbackWithResult + 9;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return fXkz;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void zb(List<List<fby>> list) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.ok = list;
        int i6 = i4 + 75;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public List<List<fby>> wie() {
        int i2 = 2 % 2;
        int i3 = asBinder + 35;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return this.ok;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean pmi() {
        int i2 = 2 % 2;
        int i3 = asBinder + 11;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<fby> list = this.jc;
        if (list == null || list.size() <= 0) {
            return true;
        }
        int i4 = asBinder + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public boolean uh() {
        int i2 = 2 % 2;
        int i3 = asBinder + 113;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        boolean z = this.xkz;
        int i6 = i4 + 87;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void ycx(boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 47;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        this.xkz = z;
        if (i5 == 0) {
            int i6 = 94 / 0;
        }
        int i7 = i3 + 121;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
    }

    public Map<String, String> htf() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 19;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return this.syc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void ycx(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = asBinder + 95;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.syc.put(str, str2);
        int i5 = onExtraCallbackWithResult + 101;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public void thx() {
        int i2 = 2 % 2;
        List<List<fby>> list = this.ok;
        if (list != null) {
            int i3 = onExtraCallbackWithResult + 105;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                int size = list.size();
                int i4 = 10 / 0;
                if (size <= 0) {
                    return;
                }
            } else if (list.size() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<List<fby>> it = this.ok.iterator();
            while (!(!it.hasNext())) {
                int i5 = onExtraCallbackWithResult + 61;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                List<fby> next = it.next();
                if (next != null && next.size() > 0) {
                    arrayList.add(next);
                }
            }
            this.ok = arrayList;
        }
    }

    public boolean wwx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            boolean zEquals = TextUtils.equals(this.jw.lud().bhi(), "flex");
            int i4 = asBinder + 85;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 0;
            }
            return zEquals;
        }
        TextUtils.equals(this.jw.lud().bhi(), "flex");
        throw null;
    }

    public String tn() {
        int i2 = 2 % 2;
        int i3 = asBinder + 25;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String strTn = this.jw.lud().tn();
        int i5 = onExtraCallbackWithResult + 13;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return strTn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void sya(String str) {
        int i2 = 2 % 2;
        int i3 = asBinder + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.jw.lud().lt(str);
        int i5 = onExtraCallbackWithResult + 59;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "DynamicLayoutUnit{id='" + this.ycx + "', x=" + this.zb + ", y=" + this.sya + ", width=" + this.lt + ", height=" + this.ul + ", remainWidth=" + this.fby + ", rootBrick=" + this.jw + ", childrenBrickUnits=" + this.jc + '}';
        int i3 = onExtraCallbackWithResult + 119;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public boolean dv() {
        int i2 = 2 % 2;
        if (this.jw.lud().ufy() < 0 || this.jw.lud().nzi() < 0 || this.jw.lud().xf() < 0 || this.jw.lud().tx() < 0) {
            return true;
        }
        int i3 = onExtraCallbackWithResult + 47;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 89;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public String ycx(int i2) {
        int i3 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.jw.zb());
        sb.append(":");
        sb.append(this.ycx);
        if (this.jw.lud() != null) {
            sb.append(":");
            sb.append(this.jw.lud().ci());
            int i4 = asBinder + 23;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
        sb.append(":");
        sb.append(i2);
        String string = sb.toString();
        int i6 = asBinder + 17;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return string;
    }
}
