package com.bytedance.sdk.component.adexpress.dynamic.lud;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dj.ul;
import com.bytedance.sdk.component.adexpress.dynamic.dj.fby;
import com.bytedance.sdk.component.adexpress.dynamic.lud.zb;
import com.bytedance.sdk.component.adexpress.zb.ry;
import com.bytedance.sdk.component.utils.wwx;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ea {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 0;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static char onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static char onWarmupCompleted;
    private static final Set<String> ycx;
    private static String zb;

    static {
        onExtraCallbackWithResult();
        ycx = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
        int i2 = onNavigationEvent + 61;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (android.text.TextUtils.equals(r23, "score-count-type-2") == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x047f A[PHI: r4
      0x047f: PHI (r4v27 int) = (r4v26 int), (r4v37 int) binds: [B:219:0x047d, B:216:0x0475] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x048d A[PHI: r4
      0x048d: PHI (r4v34 int) = (r4v26 int), (r4v37 int) binds: [B:219:0x047d, B:216:0x0475] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0503 A[Catch: Exception -> 0x0513, TryCatch #4 {Exception -> 0x0513, blocks: (B:248:0x04f8, B:250:0x0503, B:254:0x050c), top: B:334:0x04f8, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zb.sya ycx(String str, String str2, String str3, boolean z, boolean z2, int i2, fby fbyVar, double d, int i3, double d2, String str4, ry ryVar) throws Throwable {
        String str5;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        Object[] objArr;
        int i7;
        com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud;
        String strOptString = str;
        int i8 = 2 % 2;
        String strDj = ryVar.dj();
        int iUl = ryVar.ul();
        Object obj = null;
        if (com.bytedance.sdk.component.adexpress.dj.zb() && i3 != 4) {
            if (!TextUtils.equals(str2, "text_star") && !TextUtils.equals(str2, "score-count")) {
                int i9 = asInterface + 49;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    TextUtils.equals(str2, "score-count-type-1");
                    obj.hashCode();
                    throw null;
                }
                if (!TextUtils.equals(str2, "score-count-type-1")) {
                }
            }
            return new zb.sya(0.0f, 0.0f);
        }
        zb.sya syaVar = new zb.sya();
        if (strOptString.startsWith("<svg") || ycx.contains(str2)) {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.dj.zb() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new JSONObject(str3).optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                    syaVar.ycx = fOptDouble;
                    syaVar.zb = fOptDouble;
                    return syaVar;
                }
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 65);
            }
            syaVar.ycx = 10.0f;
            syaVar.zb = 10.0f;
            return syaVar;
        }
        if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                StringBuilder sb = new StringBuilder();
                str5 = "";
                sb.append(wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_text_privacy_development"));
                sb.append(strOptString);
                strOptString = sb.toString();
            } else {
                str5 = "";
            }
            if ("app-version".equals(str2)) {
                strOptString = wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_text_privacy_app_version") + strOptString;
            }
            if (!(!"score-count".equals(str2))) {
                try {
                    i4 = Integer.parseInt(strOptString);
                } catch (NumberFormatException e2) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 118);
                    i4 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.dj.zb() && i4 < 0) {
                    return new zb.sya(0.0f, 0.0f);
                }
                return ycx("(" + String.format(wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_comment_num"), Integer.valueOf(i4)) + ")", str3);
            }
            if (!(!"score-count-type-2".equals(str2))) {
                try {
                    i5 = Integer.parseInt(strOptString);
                } catch (NumberFormatException e3) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e3, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 132);
                    i5 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.dj.zb() && i5 < 0) {
                    return new zb.sya(0.0f, 0.0f);
                }
                return ycx("(" + String.format(new DecimalFormat("###,###,###").format(i5), Integer.valueOf(i5)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.dj.zb()) {
                zb.sya syaVar2 = new zb.sya();
                float fZb = (float) zb(str3);
                syaVar2.ycx = fZb;
                syaVar2.zb = fZb;
                return syaVar2;
            }
            if (!"skip-with-time-countdown".equals(str2)) {
                int i10 = asBinder + 17;
                asInterface = i10 % 128;
                int i11 = i10 % 2;
                if (!TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                    if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                        return ycx("| " + wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_screen_skip_tx"), str3);
                    }
                    if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                        return ycx("| ".concat(String.format(wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_full_skip_count_down"), "00")), str3);
                    }
                    if ("skip-with-time-skip-btn".equals(str2)) {
                        zb.sya syaVarYcx = ycx("| " + wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_screen_skip_tx"), str3);
                        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                            try {
                                syaVarYcx.zb = (float) ((syaVarYcx.zb * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                            } catch (Throwable th) {
                                com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 190);
                            }
                            syaVarYcx.ycx = syaVarYcx.zb;
                        }
                        return syaVarYcx;
                    }
                    if ("skip".equals(str2)) {
                        return ycx(wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_screen_skip_tx"), str3);
                    }
                    if ("timedown".equals(str2)) {
                        return ycx("0.0", str3);
                    }
                    if ("text_star".equals(str2)) {
                        int i12 = asInterface + 77;
                        asBinder = i12 % 128;
                        if (i12 % 2 == 0) {
                            return (!com.bytedance.sdk.component.adexpress.dj.zb() || (d2 >= 0.0d && d2 <= 5.0d)) ? ycx("0.0", str3) : new zb.sya(0.0f, 0.0f);
                        }
                        com.bytedance.sdk.component.adexpress.dj.zb();
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (TextUtils.equals("privacy-detail", str2)) {
                        return ycx("Permission list | Privacy policy", str3);
                    }
                    if ("arrowButton".equals(str2)) {
                        return ycx("Download", str3);
                    }
                    Object[] objArr2 = new Object[1];
                    a(new char[]{47820, 60364, 1625, 27961}, 4 - (Process.myTid() >> 22), objArr2);
                    if (((String) objArr2[0]).intern().equals(str2) && com.bytedance.sdk.component.adexpress.dj.zb() && TextUtils.isEmpty(strOptString) && (ltVarLud = fbyVar.jc().lud()) != null) {
                        strOptString = ltVarLud.sg() != null ? fbyVar.jc().lud().sg().optString(ul.sya(com.bytedance.sdk.component.adexpress.dj.ycx())) : str5;
                    }
                    if (!"fillButton".equals(str2)) {
                        Object[] objArr3 = new Object[1];
                        a(new char[]{47820, 60364, 1625, 27961}, 5 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr3);
                        if (!((String) objArr3[0]).intern().equals(str2)) {
                            Object[] objArr4 = new Object[1];
                            a(new char[]{54564, 43025, 21778, 65178, 38446, 35673}, 6 - ExpandableListView.getPackedPositionType(0L), objArr4);
                            if (!((String) objArr4[0]).intern().equals(str2) && (!"downloadWithIcon".equals(str2)) && !"downloadButton".equals(str2) && !"laceButton".equals(str2) && !"cardButton".equals(str2) && !"colourMixtureButton".equals(str2) && !"arrowButton".equals(str2) && ((!"source".equals(str2) || (com.bytedance.sdk.component.adexpress.dj.zb() && "open_ad".equals(strDj))) && !TextUtils.equals("app-version", str2) && !TextUtils.equals("development-name", str2))) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str3);
                                    int length = strOptString.length();
                                    float fOptDouble2 = (float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE);
                                    float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                                    float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                                    float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                                    float f3 = (length * (fOptDouble2 + fOptDouble3)) - fOptDouble3;
                                    if ("muted".equals(str2)) {
                                        int i13 = asInterface + 47;
                                        asBinder = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            syaVar.ycx = fOptDouble2;
                                            syaVar.zb = fOptDouble2;
                                            return syaVar;
                                        }
                                        syaVar.ycx = fOptDouble2;
                                        syaVar.zb = fOptDouble2;
                                        throw null;
                                    }
                                    if ("star".equals(str2)) {
                                        if (com.bytedance.sdk.component.adexpress.dj.zb() && (d2 < 0.0d || d2 > 5.0d || i3 != 4)) {
                                            return new zb.sya(0.0f, 0.0f);
                                        }
                                        zb.sya syaVarYcx2 = ycx("str", str3);
                                        syaVarYcx2.ycx = fOptDouble2 * 5.0f;
                                        return syaVarYcx2;
                                    }
                                    if ("icon".equals(str2)) {
                                        int i14 = asInterface + 57;
                                        asBinder = i14 % 128;
                                        if (i14 % 2 != 0) {
                                            syaVar.ycx = fOptDouble2;
                                            syaVar.zb = fOptDouble2;
                                            int i15 = 28 / 0;
                                        } else {
                                            syaVar.ycx = fOptDouble2;
                                            syaVar.zb = fOptDouble2;
                                        }
                                        int i16 = asBinder + 23;
                                        asInterface = i16 % 128;
                                        if (i16 % 2 != 0) {
                                            return syaVar;
                                        }
                                        throw null;
                                    }
                                    if (z) {
                                        int i17 = asInterface + 31;
                                        int i18 = i17 % 128;
                                        asBinder = i18;
                                        if (i17 % 2 != 0) {
                                            i7 = ((int) (f3 * fOptDouble5)) << 1;
                                            if (z2) {
                                                i6 = i2;
                                                if (i7 >= i6) {
                                                    int i19 = i18 + 15;
                                                    asInterface = i19 % 128;
                                                    int i20 = i19 % 2;
                                                    i7 = i6;
                                                }
                                            } else {
                                                i6 = i2;
                                            }
                                        } else {
                                            i7 = ((int) (f3 / fOptDouble5)) + 1;
                                            if (z2) {
                                            }
                                        }
                                        f = (float) (fOptDouble4 * fOptDouble2 * i7 * 1.2d);
                                    } else {
                                        i6 = i2;
                                        f = (float) (fOptDouble4 * fOptDouble2 * 1.2d);
                                        if (f3 <= fOptDouble5) {
                                            f2 = f3;
                                        }
                                        float f4 = f;
                                        objArr = new Object[1];
                                        a(new char[]{11187, 20879, 60915, 24064, 18476, 22836}, View.combineMeasuredStates(0, 0) + 5, objArr);
                                        if (!((String) objArr[0]).intern().equals(str2)) {
                                            zb.sya syaVarYcx3 = ycx(strOptString.replace('\n', ' '), str3, false);
                                            if (z) {
                                            }
                                            return syaVarYcx3;
                                        }
                                        int i21 = asInterface + 111;
                                        asBinder = i21 % 128;
                                        if (i21 % 2 != 0) {
                                            com.bytedance.sdk.component.adexpress.dj.zb();
                                            throw null;
                                        }
                                        if (com.bytedance.sdk.component.adexpress.dj.zb() && "open_ad".equals(strDj) && "source".equals(str2)) {
                                            try {
                                                zb.sya syaVarYcx32 = ycx(strOptString.replace('\n', ' '), str3, false);
                                                if (z) {
                                                    int i22 = ((int) (f3 / fOptDouble5)) + 1;
                                                    if (!z2 || i22 < i6) {
                                                        i6 = i22;
                                                    }
                                                    syaVarYcx32.zb *= i6;
                                                }
                                                return syaVarYcx32;
                                            } catch (Exception e4) {
                                                com.bytedance.sdk.openadsdk.oty.sya.ycx(e4, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 305);
                                            }
                                        }
                                        syaVar.ycx = f2;
                                        syaVar.zb = f4;
                                    }
                                    f2 = fOptDouble5;
                                    float f42 = f;
                                    objArr = new Object[1];
                                    a(new char[]{11187, 20879, 60915, 24064, 18476, 22836}, View.combineMeasuredStates(0, 0) + 5, objArr);
                                    if (!((String) objArr[0]).intern().equals(str2)) {
                                    }
                                } catch (JSONException e5) {
                                    com.bytedance.sdk.openadsdk.oty.sya.ycx(e5, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5uQKlZtKUf9lUmCKpMl4=", 312);
                                }
                            }
                        }
                    }
                    return ycx(strOptString, str3);
                }
            }
            if (!ryVar.ycx() || !com.bytedance.sdk.component.adexpress.dj.lt.zb(strDj)) {
                if (d >= 10.0d) {
                    return ycx("00S", str3);
                }
                zb.sya syaVarYcx4 = ycx("0S", str3);
                int i23 = asBinder + 5;
                asInterface = i23 % 128;
                int i24 = i23 % 2;
                return syaVarYcx4;
            }
            if (((int) (d + 0.5d)) - iUl >= 10) {
                return com.bytedance.sdk.component.adexpress.dj.zb() ? ycx("00s", str3) : ycx(String.format(wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_full_skip"), "00"), str3);
            }
            if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                return ycx("0s", str3);
            }
            String strYcx = wwx.ycx(com.bytedance.sdk.component.adexpress.dj.ycx(), "tt_reward_full_skip");
            Object[] objArr5 = new Object[1];
            a(new char[]{21948, 53778}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr5);
            return ycx(String.format(strYcx, ((String) objArr5[0]).intern()), str3);
        }
        if (!com.bytedance.sdk.component.adexpress.dj.zb() && ((!TextUtils.isEmpty(str) && strOptString.contains("adx:")) || zb())) {
            return zb() ? ycx(syaVar, strOptString, str3, zb) : ycx(syaVar, strOptString, str3, "");
        }
        syaVar.ycx = "union".equals(strOptString) ? 14.0f : 20.0f;
        syaVar.zb = 10.0f;
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            String strTru = ryVar.tru();
            if ("union".equals(strOptString) && TextUtils.isEmpty(strTru)) {
                syaVar.ycx = 0.0f;
            }
            String str6 = str2 + strOptString;
            float fZb2 = (float) zb(str3);
            if (str6.contains("logoad")) {
                String strBhi = ryVar.bhi();
                if (!TextUtils.isEmpty(strBhi)) {
                    return ycx(strBhi, str3);
                }
                syaVar.ycx = 0.0f;
            }
            syaVar.zb = fZb2;
            return syaVar;
        }
        return syaVar;
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $10 + 19;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 % 2;
        }
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $11 + 41;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i9 = 58224;
            int i10 = i4;
            while (i10 < 16) {
                int i11 = $11 + 13;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i13 = (c2 + i9) ^ ((c2 << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)));
                int i14 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i14);
                    objArr2[1] = Integer.valueOf(i13);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cResolveSize = (char) View.resolveSize(i4, i4);
                        int i15 = (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)) + 10;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cResolveSize, i15, packedPositionGroup, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 9 - TextUtils.lastIndexOf("", '0'), Process.getGidForName("") + 12435, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i10++;
                    int i16 = $11 + 77;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 16014), (Process.myPid() >> 22) + 14, 19900 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static String ycx(String str) {
        int i2 = 2 % 2;
        int i3 = asInterface + 71;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (TextUtils.isEmpty(str)) {
            int i5 = asInterface + 25;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return "";
        }
        String[] strArrSplit = str.split("adx:");
        if (strArrSplit != null) {
            int i7 = asBinder + 43;
            asInterface = i7 % 128;
            if (i7 % 2 != 0 ? strArrSplit.length >= 2 : strArrSplit.length >= 5) {
                return strArrSplit[1];
            }
        }
        return "";
    }

    private static zb.sya ycx(zb.sya syaVar, String str, String str2, String str3) {
        int i2 = 2 % 2;
        if (str.contains("union")) {
            syaVar.ycx = 0.0f;
            syaVar.zb = 0.0f;
            return syaVar;
        }
        if (TextUtils.isEmpty(str3)) {
            int i3 = asBinder + 103;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            str3 = ycx(str);
        }
        if (!TextUtils.isEmpty(str3)) {
            return ycx(str3, str2);
        }
        syaVar.ycx = 0.0f;
        syaVar.zb = 0.0f;
        int i5 = asInterface + 7;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return syaVar;
    }

    public static zb.sya ycx(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = asBinder + 83;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        zb.sya syaVarYcx = ycx(str, str2, false);
        int i5 = asBinder + 7;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return syaVarYcx;
    }

    public static zb.sya ycx(String str, String str2, boolean z) {
        int i2 = 2 % 2;
        zb.sya syaVar = new zb.sya();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrYcx = ycx(str, (float) zb(str2), z);
            syaVar.ycx = iArrYcx[0];
            syaVar.zb = iArrYcx[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                int i3 = asBinder + 11;
                asInterface = i3 % 128;
                if (i3 % 2 == 0) {
                    syaVar.zb = 1.0f;
                    return syaVar;
                }
                syaVar.zb = 0.0f;
            }
            return syaVar;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5oQakffSJUNJ/lSK0MVfr", 367);
            int i4 = asInterface + 63;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return syaVar;
        }
    }

    public static double zb(String str) {
        int i2 = 2 % 2;
        try {
            double d = Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
            int i3 = asInterface + 17;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 82 / 0;
            }
            return d;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5oQakffSJUNJ/lSK0MVfr", 376);
            return 0.0d;
        }
    }

    public static int[] ycx(String str, float f, boolean z) {
        int i2 = 2 % 2;
        int i3 = asInterface + 49;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int[] iArrZb = zb(str, f, z);
        int[] iArr = {ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), iArrZb[0]), ul.zb(com.bytedance.sdk.component.adexpress.dj.ycx(), iArrZb[1])};
        int i5 = asBinder + 85;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return iArr;
    }

    public static int[] zb(String str, float f, boolean z) {
        int i2 = 2 % 2;
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.dj.ycx());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                int i3 = asInterface + 55;
                asBinder = i3 % 128;
                if (i3 % 2 != 0) {
                    textView.setSingleLine();
                    throw null;
                }
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            int[] iArr = {textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
            int i4 = asBinder + 31;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                return iArr;
            }
            throw null;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX7ApSf0ohw==", "d+80mhaoXMmJXuRUlhSVPFLiPg==", "XOs5oQakffeYed5HiQ==", 398);
            return new int[]{0, 0};
        }
    }

    public static String ycx() {
        int i2 = 2 % 2;
        int i3 = asInterface + 17;
        int i4 = i3 % 128;
        asBinder = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = zb;
        int i5 = i4 + 57;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static boolean zb() {
        int i2 = 2 % 2;
        Object obj = null;
        if (!TextUtils.isEmpty(zb)) {
            int i3 = asInterface + 21;
            asBinder = i3 % 128;
            if (i3 % 2 == 0) {
                return true;
            }
            throw null;
        }
        int i4 = asInterface + 9;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 71;
        asInterface = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = (char) 24953;
        onWarmupCompleted = (char) 37065;
        onExtraCallback = (char) 25634;
        IAuthTabCallback = (char) 11209;
    }
}
