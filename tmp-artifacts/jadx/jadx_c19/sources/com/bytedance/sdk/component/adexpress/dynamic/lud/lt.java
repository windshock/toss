package com.bytedance.sdk.component.adexpress.dynamic.lud;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.component.adexpress.dj.ul;
import com.bytedance.sdk.component.adexpress.dynamic.dj.fby;
import com.bytedance.sdk.component.adexpress.dynamic.lud.lud;
import com.bytedance.sdk.component.adexpress.zb.ry;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static boolean onExtraCallback = false;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char[] onWarmupCompleted;
    private static HashMap<String, String> ul;
    private ycx dj;
    private com.bytedance.sdk.component.adexpress.dynamic.dj.dj lt;
    private sya lud;
    private com.bytedance.sdk.component.adexpress.dynamic.dj.sya sya;
    private JSONObject ycx;
    private JSONObject zb;

    static {
        onWarmupCompleted();
        HashMap<String, String> map = new HashMap<>();
        ul = map;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -122, -124, -123, -124, -125, -126, -127}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-115, -116, -123, -124, -117, -123, -118, -119, -127, -121, -120}, 127 - View.getDefaultSize(0, 0), objArr2);
        map.put(strIntern, ((String) objArr2[0]).intern());
        ul.put("source", "source|app.app_name");
        ul.put("screenshot", "dynamic_creative.screenshot");
        int i2 = onExtraCallbackWithResult + 97;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public lt(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.ycx = jSONObject;
        this.zb = jSONObject2;
        this.sya = new com.bytedance.sdk.component.adexpress.dynamic.dj.sya(jSONObject2);
        this.dj = ycx.ycx(jSONObject3);
        this.lt = com.bytedance.sdk.component.adexpress.dynamic.dj.dj.ycx(jSONObject4);
    }

    public fby ycx(double d, int i2, double d2, String str, ry ryVar) throws Throwable {
        JSONObject jSONObject;
        int i3 = 2 % 2;
        this.sya.ycx();
        try {
            jSONObject = new JSONObject(this.lt.zb);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61auuBU9hImDiuLlfvOZAR", "UuArmQKobOOZRNZQhRKMKULhOIE=", 76);
            jSONObject = null;
        }
        fby fbyVarYcx = ycx(dj.ycx(this.ycx, jSONObject), (fby) null);
        ycx(fbyVarYcx);
        lud ludVar = new lud(d, i2, d2, str, ryVar);
        lud.ycx ycxVar = new lud.ycx();
        ycx ycxVar2 = this.dj;
        ycxVar.ycx = ycxVar2.ycx;
        ycxVar.zb = ycxVar2.zb;
        ycxVar.sya = 0.0f;
        ludVar.ycx(ycxVar);
        ludVar.ycx(fbyVarYcx, 0.0f, 0.0f);
        ludVar.ycx();
        com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar = ludVar.ycx;
        if (zbVar.dj != 65536.0f) {
            return zbVar.lt;
        }
        int i4 = IAuthTabCallbackDefault;
        int i5 = i4 + 81;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        int i7 = i4 + 11;
        asInterface = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private void ycx(fby fbyVar) {
        int iYcx;
        int i2;
        float fMin;
        float fMin2;
        int i3 = 2 % 2;
        if (fbyVar == null) {
            return;
        }
        if (com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().sya() != null) {
            iYcx = com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().sya().dy();
            i2 = IAuthTabCallbackDefault + 61;
        } else {
            iYcx = ul.ycx(com.bytedance.sdk.component.adexpress.dj.ycx());
            i2 = IAuthTabCallbackDefault + 29;
        }
        asInterface = i2 % 128;
        int i4 = i2 % 2;
        int iZb = ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), iYcx);
        ycx ycxVar = this.dj;
        if (ycxVar.sya) {
            int i5 = IAuthTabCallbackDefault + 29;
            asInterface = i5 % 128;
            if (i5 % 2 != 0) {
                float f = ycxVar.ycx;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            fMin = ycxVar.ycx;
        } else {
            fMin = Math.min(ycxVar.ycx, iZb);
        }
        if (this.dj.zb == 0.0f) {
            fbyVar.lud(fMin);
            fbyVar.jc().lud().jc(TtmlNode.TEXT_EMPHASIS_AUTO);
            fbyVar.lt(0.0f);
            return;
        }
        fbyVar.lud(fMin);
        int iZb2 = ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx()));
        ycx ycxVar2 = this.dj;
        if (ycxVar2.sya) {
            int i6 = IAuthTabCallbackDefault + 21;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            fMin2 = ycxVar2.zb;
        } else {
            fMin2 = Math.min(ycxVar2.zb, iZb2);
        }
        fbyVar.lt(fMin2);
        fbyVar.jc().lud().jc("fixed");
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr2 = onWarmupCompleted;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", c, 0, 0) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 76, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i4++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), 75 - KeyEvent.normalizeMetaState(0), 16037 - TextUtils.getOffsetAfter("", 0), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallback) {
            int i5 = $10 + 9;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 63 - (Process.myPid() >> 22), 12214 - Color.red(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            String str = new String(cArr4);
            int i7 = $10 + 71;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            objArr[0] = str;
            return;
        }
        if (IAuthTabCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), (-16777153) - Color.rgb(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
        char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
        defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            int i9 = $10 + 25;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 % 2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public fby ycx(JSONObject jSONObject, fby fbyVar) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5;
        lt ltVar = this;
        JSONObject jSONObject2 = jSONObject;
        int i6 = 2;
        int i7 = 2 % 2;
        int i8 = 0;
        if (jSONObject2 == null) {
            int i9 = IAuthTabCallbackDefault + 117;
            asInterface = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 52 / 0;
            }
            return null;
        }
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-121, -117, -110, -124}, View.resolveSize(0, 0) + 127, objArr);
        String strOptString = jSONObject2.optString(((String) objArr[0]).intern());
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int i11 = asInterface + 99;
            IAuthTabCallbackDefault = i11 % 128;
            if (i11 % 2 == 0) {
                jSONObject2.optInt("componentId");
                throw null;
            }
            int iOptInt = jSONObject2.optInt("componentId");
            if (ltVar.lt != null) {
                sya syaVar = new sya();
                ltVar.lud = syaVar;
                JSONObject jSONObjectYcx = syaVar.ycx(ltVar.lt.ycx, iOptInt, jSONObject2);
                if (jSONObjectYcx != null) {
                    jSONObject2 = jSONObjectYcx;
                }
            }
        }
        fby fbyVarYcx = ltVar.ycx(jSONObject2);
        fbyVarYcx.ycx(fbyVar);
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            fbyVarYcx.ycx((List<fby>) null);
            return fbyVarYcx;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        while (i12 < jSONArrayOptJSONArray.length()) {
            int i13 = IAuthTabCallbackDefault + 77;
            asInterface = i13 % 128;
            if (i13 % i6 != 0) {
                jSONArrayOptJSONArray.optJSONArray(i12);
                throw null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i12);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                int iBh = TextUtils.equals(strOptString, "tag-group") ? fbyVarYcx.jc().lud().bh() : jSONArrayOptJSONArray2.length();
                int i14 = i8;
                while (i14 < iBh) {
                    int i15 = asInterface + 3;
                    IAuthTabCallbackDefault = i15 % 128;
                    int i16 = i15 % i6;
                    fby fbyVarYcx2 = ltVar.ycx(jSONArrayOptJSONArray2.optJSONObject(i14), fbyVarYcx);
                    if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
                        i5 = i6;
                        i4 = 0;
                    } else {
                        if ("skip-with-time".equals(fbyVarYcx.jc().zb())) {
                            Object[] objArr2 = new Object[1];
                            a(null, null, new byte[]{-124, -115, -121, -118, -113, -117, -127, -115, -113, -118, -124}, 127 - ExpandableListView.getPackedPositionType(0L), objArr2);
                            i4 = 0;
                            if (!((String) objArr2[0]).intern().equals(fbyVarYcx.tn()) && (!TextUtils.isEmpty(fbyVarYcx.tn()))) {
                                int i17 = asInterface + 25;
                                IAuthTabCallbackDefault = i17 % 128;
                                i5 = 2;
                                int i18 = i17 % 2;
                                fbyVarYcx2.sya(fbyVarYcx.tn());
                            }
                        } else {
                            i4 = 0;
                        }
                        i5 = 2;
                    }
                    arrayList.add(fbyVarYcx2);
                    arrayList3.add(fbyVarYcx2);
                    i14++;
                    ltVar = this;
                    i8 = i4;
                    i6 = i5;
                }
                i2 = i6;
                i3 = i8;
                arrayList2.add(arrayList3);
            } else {
                i2 = i6;
                i3 = i8;
            }
            i12++;
            ltVar = this;
            i8 = i3;
            i6 = i2;
        }
        if (arrayList.size() > 0) {
            fbyVarYcx.ycx(arrayList);
        }
        if (arrayList2.size() > 0) {
            fbyVarYcx.zb(arrayList2);
        }
        return fbyVarYcx;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fby ycx(JSONObject jSONObject) throws Throwable {
        JSONObject jSONObject2;
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        Object obj = null;
        a(null, null, new byte[]{-121, -117, -110, -124}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126, objArr);
        String strOptString = jSONObject.optString(((String) objArr[0]).intern());
        String strOptString2 = jSONObject.optString(TtmlNode.ATTR_ID);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        jw.ycx(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectYcx = jw.ycx(strOptString, jw.ycx(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        fby fbyVar = new fby();
        if (TextUtils.isEmpty(strOptString2)) {
            int i3 = IAuthTabCallbackDefault + 83;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                fbyVar.zb(String.valueOf(fbyVar.hashCode()));
                throw null;
            }
            fbyVar.zb(String.valueOf(fbyVar.hashCode()));
        } else {
            fbyVar.zb(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            zb(fbyVar);
            fbyVar.sya((float) jSONObjectOptJSONObject.optDouble("x"));
            fbyVar.dj((float) jSONObjectOptJSONObject.optDouble("y"));
            fbyVar.lud((float) jSONObjectOptJSONObject.optDouble("width"));
            fbyVar.lt((float) jSONObjectOptJSONObject.optDouble("height"));
            fbyVar.ul(jSONObjectOptJSONObject.optInt("remainWidth"));
            com.bytedance.sdk.component.adexpress.dynamic.dj.lud ludVar = new com.bytedance.sdk.component.adexpress.dynamic.dj.lud();
            ludVar.ycx(strOptString);
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-113, -124, -113, -120}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, objArr2);
            ludVar.zb(jSONObjectOptJSONObject.optString(((String) objArr2[0]).intern()));
            ludVar.sya(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarYcx = com.bytedance.sdk.component.adexpress.dynamic.dj.lt.ycx(jSONObjectOptJSONObject);
            ludVar.ycx(ltVarYcx);
            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarYcx2 = com.bytedance.sdk.component.adexpress.dynamic.dj.lt.ycx(jSONObjectYcx);
            if (ltVarYcx2 == null) {
                int i4 = asInterface + 17;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 == 0) {
                    ludVar.zb(ltVarYcx);
                    obj.hashCode();
                    throw null;
                }
                ludVar.zb(ltVarYcx);
            } else {
                ludVar.zb(ltVarYcx2);
            }
            ycx(ltVarYcx);
            ycx(ltVarYcx2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.zb) != null) {
                ycx(ludVar, jSONObject2.optInt("image_mode"));
            }
            String strZb = ludVar.zb();
            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = ludVar.lud();
            if (ul.containsKey(strZb) && !ltVarLud.duz()) {
                int i5 = IAuthTabCallbackDefault + 121;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                ltVarLud.htf(ul.get(strZb));
            }
            String strSya = ltVarLud.duz() ? ludVar.sya() : ycx(ludVar.sya());
            if (!(!com.bytedance.sdk.component.adexpress.dj.zb())) {
                int i7 = asInterface + 85;
                IAuthTabCallbackDefault = i7 % 128;
                int i8 = i7 % 2;
                if (TextUtils.equals(strZb, "star") || TextUtils.equals(strZb, "text_star")) {
                    strSya = ycx("dynamic_creative.score_exact_i18n|");
                }
                if (!TextUtils.equals(strZb, "score-count")) {
                    int i9 = asInterface + 23;
                    IAuthTabCallbackDefault = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 98 / 0;
                        if (!TextUtils.equals(strZb, "score-count-type-1")) {
                            if (TextUtils.equals(strZb, "score-count-type-2")) {
                                strSya = ycx("dynamic_creative.comment_num_i18n|");
                            }
                            if ("root".equals(strZb) && ltVarYcx.liq()) {
                                strSya = ycx("image.0.url");
                            }
                        }
                    } else if (!TextUtils.equals(strZb, "score-count-type-1")) {
                    }
                }
            }
            if ((!TextUtils.isEmpty(ycx())) && (TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                ludVar.zb(strSya + "adx:" + ycx());
            } else {
                ludVar.zb(strSya);
            }
            fbyVar.ycx(ludVar);
        }
        return fbyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[PHI: r11
      0x00cb: PHI (r11v12 java.lang.String) = (r11v11 java.lang.String), (r11v13 java.lang.String) binds: [B:32:0x00c9, B:29:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zb(fby fbyVar) throws Throwable {
        Object objYcx;
        String strValueOf;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault + 31;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
            if (fbyVar != null) {
                com.bytedance.sdk.component.adexpress.dynamic.dj.sya syaVar = this.sya;
                if (syaVar != null && (objYcx = syaVar.ycx("image.0.url")) != null) {
                    String strValueOf2 = String.valueOf(objYcx);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        com.bytedance.sdk.component.adexpress.dynamic.dj.sya syaVar2 = this.sya;
                        Object[] objArr = new Object[1];
                        a(null, null, new byte[]{-121, -122, -124, -123, -124}, 127 - Color.green(0), objArr);
                        Object objYcx2 = syaVar2.ycx(((String) objArr[0]).intern());
                        if (objYcx2 != null) {
                            String strValueOf3 = String.valueOf(objYcx2);
                            if (!TextUtils.isEmpty(strValueOf3)) {
                                int i5 = asInterface + 21;
                                IAuthTabCallbackDefault = i5 % 128;
                                int i6 = i5 % 2;
                                com.bytedance.sdk.component.adexpress.dynamic.dj.sya syaVar3 = this.sya;
                                Object[] objArr2 = new Object[1];
                                a(null, null, new byte[]{-115, -116, -123, -124, -117, -123, -118, -119, -127, -121, -120}, 127 - View.getDefaultSize(0, 0), objArr2);
                                Object objYcx3 = syaVar3.ycx(((String) objArr2[0]).intern());
                                if (objYcx3 != null) {
                                    String strValueOf4 = String.valueOf(objYcx3);
                                    if (!TextUtils.isEmpty(strValueOf4)) {
                                        int i7 = IAuthTabCallbackDefault + 69;
                                        asInterface = i7 % 128;
                                        if (i7 % 2 != 0) {
                                            this.sya.ycx("icon");
                                            throw null;
                                        }
                                        Object objYcx4 = this.sya.ycx("icon");
                                        if (objYcx4 != null) {
                                            int i8 = asInterface + 85;
                                            IAuthTabCallbackDefault = i8 % 128;
                                            if (i8 % 2 == 0) {
                                                strValueOf = String.valueOf(objYcx4);
                                                int i9 = 13 / 0;
                                                if (!TextUtils.isEmpty(strValueOf)) {
                                                    Object objYcx5 = this.sya.ycx("app.app_name");
                                                    Object objYcx6 = this.sya.ycx("source");
                                                    if (objYcx5 != null || objYcx6 != null) {
                                                        if (objYcx5 == null) {
                                                            int i10 = IAuthTabCallbackDefault + 7;
                                                            asInterface = i10 % 128;
                                                            if (i10 % 2 != 0) {
                                                                throw null;
                                                            }
                                                            objYcx5 = objYcx6;
                                                        }
                                                        String strValueOf5 = String.valueOf(objYcx5);
                                                        if (!TextUtils.isEmpty(strValueOf5)) {
                                                            Object[] objArr3 = new Object[1];
                                                            a(null, null, new byte[]{-122, -118, -111, -121, -112, -113, -114, -123}, 127 - View.combineMeasuredStates(0, 0), objArr3);
                                                            fbyVar.ycx(((String) objArr3[0]).intern(), strValueOf2);
                                                            Object[] objArr4 = new Object[1];
                                                            a(null, null, new byte[]{-121, -122, -124, -123, -124}, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
                                                            fbyVar.ycx(((String) objArr4[0]).intern(), strValueOf3);
                                                            Object[] objArr5 = new Object[1];
                                                            a(null, null, new byte[]{-115, -116, -123, -124, -117, -123, -118, -119, -127, -121, -120}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, objArr5);
                                                            fbyVar.ycx(((String) objArr5[0]).intern(), strValueOf4);
                                                            fbyVar.ycx("icon", strValueOf);
                                                            fbyVar.ycx("app_name", strValueOf5);
                                                            fbyVar.ycx(true);
                                                            return;
                                                        }
                                                    }
                                                }
                                            } else {
                                                strValueOf = String.valueOf(objYcx4);
                                                if (!TextUtils.isEmpty(strValueOf)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (fbyVar != null) {
        }
        int i11 = asInterface + 23;
        IAuthTabCallbackDefault = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void ycx(com.bytedance.sdk.component.adexpress.dynamic.dj.lud ludVar, int i2) throws Throwable {
        int iLastIndexOf;
        int i3 = 2 % 2;
        if (i2 == 5 || i2 == 15 || i2 == 50 || i2 == 154) {
            ludVar.ycx(MediaDescription.MEDIA_TYPE_VIDEO);
            String strYcx = jw.ycx(MediaDescription.MEDIA_TYPE_VIDEO);
            ludVar.lud().htf(strYcx);
            String strYcx2 = jw.ycx(MediaDescription.MEDIA_TYPE_VIDEO, "clickArea");
            if (!TextUtils.isEmpty(strYcx2)) {
                ludVar.lud().syc(strYcx2);
                ludVar.ul().syc(strYcx2);
            }
            ludVar.ul().htf(strYcx);
            ludVar.zb(strYcx);
            ludVar.lud().skm();
            return;
        }
        ludVar.ycx(TtmlNode.TAG_IMAGE);
        String strYcx3 = jw.ycx(TtmlNode.TAG_IMAGE);
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = ludVar.lud();
        ltVarLud.htf(strYcx3);
        ludVar.ul().htf(strYcx3);
        String strYcx4 = jw.ycx(TtmlNode.TAG_IMAGE, "clickArea");
        if (!TextUtils.isEmpty(strYcx4)) {
            int i4 = IAuthTabCallbackDefault + 35;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            ltVarLud.syc(strYcx4);
            ludVar.ul().syc(strYcx4);
        }
        JSONObject jSONObjectCu = ltVarLud.cu();
        if (jSONObjectCu != null) {
            int i6 = asInterface + 107;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            ltVarLud.tn(jSONObjectCu.optString("imageLottieTosPath"));
            ltVarLud.ok(jSONObjectCu.optBoolean("animationsLoop"));
            ltVarLud.hf(jSONObjectCu.optInt("lottieAppNameMaxLength"));
            ltVarLud.bhi(jSONObjectCu.optInt("lottieAdDescMaxLength"));
            ltVarLud.tru(jSONObjectCu.optInt("lottieAdTitleMaxLength"));
        }
        ludVar.zb(strYcx3);
        if (strYcx3 != null && (iLastIndexOf = strYcx3.lastIndexOf(".")) > 0) {
            String strSubstring = strYcx3.substring(0, iLastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", ycx(strSubstring + ".width"));
                jSONObject.put("height", ycx(strSubstring + ".height"));
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "f/cjlA61auuBU9hImDiuLlfvOZAR", "S/wilgaveu6NS9BYuhikLVTMOJEEuX0=", 394);
            }
            ludVar.sya(jSONObject.toString());
        }
        ltVarLud.hfd();
    }

    private String ycx(String str) {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split("\\|");
        int length = strArrSplit.length;
        int i3 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= length) {
                int i4 = asInterface + 47;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return "";
                }
                obj.hashCode();
                throw null;
            }
            int i5 = asInterface + 71;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            String str2 = strArrSplit[i3];
            if (this.sya.zb(str2)) {
                int i7 = IAuthTabCallbackDefault + 39;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    TextUtils.isEmpty(String.valueOf(this.sya.ycx(str2)));
                    obj.hashCode();
                    throw null;
                }
                String strValueOf = String.valueOf(this.sya.ycx(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
            i3++;
        }
    }

    private String ycx() {
        int i2 = 2 % 2;
        int i3 = asInterface + 105;
        int i4 = i3 % 128;
        IAuthTabCallbackDefault = i4;
        if (i3 % 2 != 0) {
            com.bytedance.sdk.component.adexpress.dynamic.dj.sya syaVar = this.sya;
            if (syaVar == null) {
                int i5 = i4 + 37;
                asInterface = i5 % 128;
                int i6 = i5 % 2;
                return "";
            }
            Object objYcx = syaVar.ycx("adx_name");
            if (objYcx == null) {
                int i7 = IAuthTabCallbackDefault + 109;
                asInterface = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 70 / 0;
                }
                return "";
            }
            return String.valueOf(objYcx);
        }
        throw null;
    }

    private void ycx(com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVar) {
        int i2 = 2 % 2;
        int i3 = asInterface + 73;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 10 / 0;
            if (ltVar == null) {
                return;
            }
        } else if (ltVar == null) {
            return;
        }
        String strAv = ltVar.av();
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            String strSya = ul.sya(com.bytedance.sdk.component.adexpress.dj.ycx());
            if ("zh".equals(strSya)) {
                int i5 = IAuthTabCallbackDefault + 59;
                asInterface = i5 % 128;
                if (i5 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                strSya = "cn";
            }
            if (!TextUtils.isEmpty(strSya) && ltVar.lt() != null) {
                String strOptString = ltVar.lt().optString(strSya);
                if (!TextUtils.isEmpty(strOptString)) {
                    strAv = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strAv)) {
            return;
        }
        int iIndexOf = strAv.indexOf("{{");
        int iIndexOf2 = strAv.indexOf("}}");
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf2 < iIndexOf) {
            ltVar.ok(strAv);
            return;
        }
        String strYcx = ycx(strAv.substring(iIndexOf + 2, iIndexOf2));
        StringBuilder sb = new StringBuilder(strAv.substring(0, iIndexOf));
        if (!TextUtils.isEmpty(strYcx)) {
            sb.append(strYcx);
        }
        sb.append(strAv.substring(iIndexOf2 + 2));
        ltVar.ok(sb.toString());
    }

    static void onWarmupCompleted() {
        onWarmupCompleted = new char[]{32462, 32460, 32479, 32461, 32464, 32469, 32476, 32477, 32478, 32463, 32457, 32458, 32459, 32468, 32472, 32466, 32428, 32448};
        onNavigationEvent = -1184333959;
        IAuthTabCallback = true;
        onExtraCallback = true;
    }

    static class ycx {
        boolean sya;
        float ycx;
        float zb;

        public static ycx ycx(JSONObject jSONObject) {
            ycx ycxVar = new ycx();
            if (jSONObject != null) {
                ycxVar.ycx = (float) jSONObject.optDouble("width");
                ycxVar.zb = (float) jSONObject.optDouble("height");
                ycxVar.sya = jSONObject.optBoolean("isLandscape");
            }
            return ycxVar;
        }
    }
}
