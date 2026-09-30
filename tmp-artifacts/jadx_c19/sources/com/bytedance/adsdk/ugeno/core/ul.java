package com.bytedance.adsdk.ugeno.core;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.ugeno.fby.sya;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] onExtraCallbackWithResult = {2033351664, 2126785221, 80929206, -86829877, -754788707, -1937743129, 164123414, 50243244, 263384480, -1883174080, -1038588142, -240192408, 21567679, 2117224630, 1469941655, 1011269636, 690048773, -1476048899};
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private JSONObject dj;
    private float fby;
    private boolean jc;
    private float jw;
    private JSONObject lt;
    private String lud;
    private String sya;
    private boolean ul;
    private JSONObject ycx;
    private JSONObject zb;

    public ul(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ul(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObjectOptJSONObject;
        this.jc = true;
        if (jSONObject != null) {
            if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.ycx = jSONObject.optJSONObject(TtmlNode.TAG_BODY);
            } else {
                this.ycx = jSONObject.optJSONObject("main_template");
            }
            this.zb = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has("meta")) {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
            } else {
                jSONObjectOptJSONObject = jSONObject.optJSONObject("template_info");
                int i2 = onWarmupCompleted + 9;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            }
            if (jSONObjectOptJSONObject != null) {
                if (jSONObject.has(TtmlNode.TAG_BODY)) {
                    int i5 = onNavigationEvent + 59;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 == 0) {
                        this.ul = true;
                        String strOptString = jSONObjectOptJSONObject.optString("version");
                        this.sya = strOptString;
                        if (TextUtils.isEmpty(strOptString)) {
                            this.sya = "3.0";
                        }
                    } else {
                        this.ul = true;
                        String strOptString2 = jSONObjectOptJSONObject.optString("version");
                        this.sya = strOptString2;
                        if (TextUtils.isEmpty(strOptString2)) {
                        }
                    }
                } else {
                    this.sya = jSONObjectOptJSONObject.optString("sdk_version");
                }
                if (jSONObjectOptJSONObject.has("adType")) {
                    this.lud = jSONObjectOptJSONObject.optString("adType");
                }
                if (jSONObjectOptJSONObject.has("gestureThrough")) {
                    int i6 = onNavigationEvent + 93;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    this.jc = sya.ycx(jSONObjectOptJSONObject.optString("gestureThrough"), true);
                    int i8 = onNavigationEvent + 47;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = 2 % 2;
                }
            } else if (!(!jSONObject.has(TtmlNode.TAG_BODY))) {
                this.sya = "3.0";
                this.ul = true;
                int i11 = onNavigationEvent + 17;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    int i102 = 2 % 2;
                }
            }
            this.dj = jSONObject2;
            this.lt = jSONObject3;
            int i12 = 2 % 2;
        }
    }

    public ycx ycx() throws JSONException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ycx ycxVarLud = lud();
        int i5 = onWarmupCompleted + 85;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return ycxVarLud;
    }

    public void ycx(float f, float f2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 101;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.fby = f;
        this.jw = f2;
        int i6 = i3 + 39;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        int i4 = -1469660336;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 72 - View.getDefaultSize(0, 0), Color.argb(0, 0, 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i5++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 67;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int i8 = $11 + 77;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i10 = 0; i10 < length3; i10++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i10])};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 72 - (Process.myPid() >> 22), (-16768368) - Color.rgb(0, 0, 0), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i11 = $11 + 55;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i13];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - Drawable.resolveOpacity(0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 40, 10301 - Color.green(0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i14;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 78, 7397 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            int i17 = $11 + 19;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    private ycx lud() throws JSONException {
        int i2 = 2 % 2;
        if (dj()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("flexDirection", "row");
                jSONObject.put("justifyContent", "flex_start");
                jSONObject.put("alignItems", "flex_start");
                jSONObject.put("clickable", false);
                jSONObject.put("width", "match_parent");
                jSONObject.put("height", "wrap_content");
                float f = this.fby;
                if (f > 0.0f) {
                    jSONObject.put("width", f);
                    int i3 = onWarmupCompleted + 49;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                }
                float f2 = this.jw;
                if (f2 > 0.0f) {
                    int i5 = onWarmupCompleted + 59;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    jSONObject.put("height", f2);
                }
                JSONObject jSONObject2 = this.dj;
                if (jSONObject2 != null) {
                    String strOptString = jSONObject2.optString("xSize");
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject3 = new JSONObject(strOptString);
                        if (jSONObject3.optInt("width") > 0) {
                            jSONObject.put("width", jSONObject3.optInt("width"));
                        }
                        if (jSONObject3.optInt("height") > 0) {
                            jSONObject.put("height", jSONObject3.optInt("height"));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
            ycx ycxVar = new ycx();
            ycxVar.zb = "View";
            ycxVar.ycx = "virtualNode";
            ycxVar.sya = jSONObject;
            ycxVar.lt = null;
            ycxVar.ul = this.sya;
            ycxVar.jw = this.jc;
            ycxVar.fby = this.lud;
            ycxVar.ycx(ycx(this.ycx, ycxVar));
            return ycxVar;
        }
        int i7 = onWarmupCompleted + 15;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return ycx(this.ycx, (ycx) null);
        }
        int i8 = 12 / 0;
        return ycx(this.ycx, (ycx) null);
    }

    public String zb() {
        String str;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 11;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            str = this.sya;
            int i5 = 11 / 0;
        } else {
            str = this.sya;
        }
        int i6 = i4 + 11;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 89 / 0;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r1 = new java.util.ArrayList();
        r3 = r6.zb.keys();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if ((!r3.hasNext()) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r4 = com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent + 87;
        com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted = r4 % 128;
        r4 = r4 % 2;
        r4 = ycx(r6.zb.optJSONObject(r3.next()), (com.bytedance.adsdk.ugeno.core.ul.ycx) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r6.zb == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r6.zb == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<ycx> sya() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r19.has(((java.lang.String) r12[0]).intern()) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        r14 = new java.lang.Object[1];
        a(new int[]{-270076879, 375007958}, 4 - android.graphics.Color.blue(0), r14);
        r7 = r19.optString(((java.lang.String) r14[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r14 = new java.lang.Object[1];
        a(new int[]{-773632739, 412487736}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 4, r14);
        r7 = r19.optString(((java.lang.String) r14[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        r14 = r19.optString(com.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID);
        r15 = new org.json.JSONObject();
        r16 = r19.keys();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (r16.hasNext() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r12 = r16.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (android.text.TextUtils.equals(r12, "children") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        r15.put(r12, r19.opt(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        r12 = new com.bytedance.adsdk.ugeno.core.ul.ycx();
        r12.ycx = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        if (r18.ul == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        if (android.text.TextUtils.equals("Video", r7) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c9, code lost:
    
        r12.zb = r7 + "V3";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        r12.zb = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
    
        r12.sya = r15;
        r12.lt = r20;
        r12.ul = r18.sya;
        r12.jw = r18.jc;
        r12.fby = r18.lud;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fe, code lost:
    
        if (r15.has("i18n") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0100, code lost:
    
        r12.dj = r15.optJSONObject("i18n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010d, code lost:
    
        if (android.text.TextUtils.equals(r7, "CustomComponent") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        r5 = com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent + 11;
        com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0118, code lost:
    
        if ((r5 % 2) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x011a, code lost:
    
        ycx(r19, r12.sya);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0122, code lost:
    
        ycx(r19, r12.sya);
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        r5 = r19.optJSONArray("children");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0131, code lost:
    
        if (r5 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
    
        r7 = com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent + 1;
        com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013b, code lost:
    
        if ((r7 % 2) == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0141, code lost:
    
        if (r5.length() <= 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0143, code lost:
    
        r7 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0149, code lost:
    
        if (r7 >= r5.length()) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014b, code lost:
    
        r14 = r5.optJSONObject(r7);
        r2 = new java.lang.Object[1];
        a(new int[]{r3, 375007958}, android.text.TextUtils.lastIndexOf("", r9, 0) + 5, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x016b, code lost:
    
        if (r19.has(((java.lang.String) r2[0]).intern()) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016d, code lost:
    
        r9 = new java.lang.Object[1];
        a(new int[]{r3, 375007958}, 4 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), r9);
        r4 = r19.optString(((java.lang.String) r9[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018f, code lost:
    
        r4 = new java.lang.Object[1];
        a(new int[]{-773632739, 412487736}, 4 - android.view.View.resolveSizeAndState(0, 0, 0), r4);
        r4 = r19.optString(((java.lang.String) r4[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b1, code lost:
    
        r3 = com.bytedance.adsdk.ugeno.dj.zb.ycx(r14.optString(com.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID), r18.dj);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c1, code lost:
    
        if (android.text.TextUtils.equals(r4, "Template") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c3, code lost:
    
        r4 = r18.zb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c5, code lost:
    
        if (r4 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c7, code lost:
    
        r14 = com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted + 95;
        com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent = r14 % 128;
        r14 = r14 % 2;
        r14 = r4.optJSONObject(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01d6, code lost:
    
        r3 = null;
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01d9, code lost:
    
        r3 = ycx(r14, r12);
        r4 = com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent + 63;
        com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted = r4 % 128;
        r14 = 2;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e7, code lost:
    
        if (r3 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01e9, code lost:
    
        r4 = com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted + 61;
        com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01f2, code lost:
    
        if ((r4 % r14) != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f4, code lost:
    
        r3.zb(zb(r3));
        r3.ycx(ycx(r3));
        r4 = com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted + 91;
        com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r19 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x020d, code lost:
    
        r3.zb(zb(r3));
        r3.ycx(ycx(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x021c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0221, code lost:
    
        if (sya(r3) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0223, code lost:
    
        r4 = com.bytedance.adsdk.ugeno.core.ul.onWarmupCompleted + 21;
        com.bytedance.adsdk.ugeno.core.ul.onNavigationEvent = r4 % 128;
        r14 = 2;
        r4 = r4 % 2;
        r10 = r10 + 1;
        r12.zb(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0233, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0234, code lost:
    
        if (r3 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0236, code lost:
    
        r12.ycx(r7 - r10, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x023b, code lost:
    
        r7 = r7 + 1;
        r3 = -270076879;
        r9 = '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0246, code lost:
    
        r5.length();
        r1 = null;
        r1.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024e, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r19 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3 = -270076879;
        r9 = '0';
        r12 = new java.lang.Object[1];
        a(new int[]{-270076879, 375007958}, 3 - android.text.TextUtils.lastIndexOf("", '0', 0), r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ycx ycx(JSONObject jSONObject, ycx ycxVar) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
    }

    public boolean ycx(ycx ycxVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (ycxVar == null) {
            return false;
        }
        JSONObject jSONObjectLud = ycxVar.lud();
        if (jSONObjectLud != null) {
            return TextUtils.equals(jSONObjectLud.optString("width"), "match_parent");
        }
        int i5 = onNavigationEvent;
        int i6 = i5 + 119;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 33;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public boolean zb(ycx ycxVar) {
        int i2 = 2 % 2;
        if (ycxVar == null) {
            return false;
        }
        JSONObject jSONObjectLud = ycxVar.lud();
        if (jSONObjectLud == null) {
            int i3 = onWarmupCompleted + 45;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        boolean zEquals = TextUtils.equals(jSONObjectLud.optString("height"), "match_parent");
        int i5 = onWarmupCompleted + 31;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            return zEquals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean sya(ycx ycxVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 13;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (ycxVar == null) {
            int i6 = i4 + 27;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        JSONObject jSONObjectLud = ycxVar.lud();
        if (jSONObjectLud == null) {
            int i8 = onWarmupCompleted + 117;
            onNavigationEvent = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        boolean zEquals = TextUtils.equals(jSONObjectLud.optString("position"), "absolute");
        int i10 = onNavigationEvent + 27;
        onWarmupCompleted = i10 % 128;
        int i11 = i10 % 2;
        return zEquals;
    }

    public boolean dj() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ul;
        if (i4 != 0) {
            int i5 = 95 / 0;
        }
        return z;
    }

    private void ycx(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        Iterator<String> itKeys;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 17;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.lt == null || jSONObject2 == null) {
            return;
        }
        try {
            String strOptString = this.lt.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(strOptString);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("targetProps");
            if (jSONObjectOptJSONObject != null) {
                int i4 = onNavigationEvent + 57;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    itKeys = jSONObjectOptJSONObject.keys();
                    int i5 = 36 / 0;
                } else {
                    itKeys = jSONObjectOptJSONObject.keys();
                }
                while (!(!itKeys.hasNext())) {
                    int i6 = onNavigationEvent + 3;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    String next = itKeys.next();
                    Object objOpt = jSONObjectOptJSONObject.opt(next);
                    if ((!TextUtils.equals(next, "events")) || !jSONObject3.has("events")) {
                        jSONObject3.put(next, objOpt);
                    } else if (objOpt instanceof JSONArray) {
                        int i8 = onNavigationEvent + 67;
                        onWarmupCompleted = i8 % 128;
                        int i9 = i8 % 2;
                        com.bytedance.adsdk.ugeno.fby.zb.ycx(jSONObject3.optJSONArray("events"), (JSONArray) objOpt);
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                jSONArrayOptJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", jSONArrayOptJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean dj(ycx ycxVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 5;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (ycxVar != null && ycxVar.sya != null) {
            int i4 = onNavigationEvent + 93;
            onWarmupCompleted = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = onWarmupCompleted + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public static class ycx {
        private JSONObject dj;
        private boolean ea;
        private String fby;
        private boolean jc;
        private boolean jw;
        private ycx lt;
        private LinkedList<ycx> lud;
        private JSONObject sya;
        private String ul;
        private String ycx;
        private String zb;

        public String ycx() {
            return this.ycx;
        }

        public String zb() {
            return this.ul;
        }

        public boolean sya() {
            return this.jw;
        }

        public String dj() {
            return this.zb;
        }

        public void ycx(String str) {
            this.zb = str;
        }

        public void ycx(boolean z) {
            this.jc = z;
        }

        public void zb(boolean z) {
            this.ea = z;
        }

        public JSONObject lud() {
            return this.sya;
        }

        public List<ycx> lt() {
            return this.lud;
        }

        public void ycx(ycx ycxVar) {
            if (this.lud == null) {
                this.lud = new LinkedList<>();
            }
            this.lud.add(ycxVar);
        }

        public void zb(ycx ycxVar) {
            if (this.lud == null) {
                this.lud = new LinkedList<>();
            }
            this.lud.addLast(ycxVar);
        }

        public void ycx(int i2, ycx ycxVar) {
            if (this.lud == null) {
                this.lud = new LinkedList<>();
            }
            this.lud.add(i2, ycxVar);
        }

        public JSONObject ul() {
            return this.dj;
        }

        public String toString() {
            return "UGNode{id='" + this.ycx + "', name='" + this.zb + "'}";
        }
    }
}
