package com.bytedance.sdk.openadsdk.core.ry.lt;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.ry;
import com.bytedance.adsdk.ugeno.dj;
import com.bytedance.adsdk.ugeno.dj.zb;
import com.bytedance.sdk.component.utils.htf;
import com.bytedance.sdk.component.utils.pmi;
import com.bytedance.sdk.openadsdk.core.model.tn;
import com.bytedance.sdk.openadsdk.core.uh;
import com.bytedance.sdk.openadsdk.utils.oby;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.lang.reflect.Method;
import java.util.Iterator;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private com.bytedance.adsdk.ugeno.zb.sya dj;
    private JSONArray dy;
    private JSONObject ea;
    private final tn fby;
    private com.bytedance.sdk.openadsdk.core.widget.lt jc;
    private final String jw;
    private com.bytedance.adsdk.ugeno.zb.sya lud;
    private final JSONObject ok;
    private boolean ry;
    private com.bytedance.adsdk.ugeno.zb.sya sya;
    private boolean syc;
    private final Context ul;
    private boolean xkz;
    private static char[] onWarmupCompleted = {64966, 64985, 64961, 64991};
    private static char onNavigationEvent = 51243;
    private int ycx = -1;
    private int zb = -1;
    private final String lt = "UGenSwiperEvent";

    static /* synthetic */ void sya(lud ludVar, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        ludVar.ycx(i2);
        int i6 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    static /* synthetic */ boolean sya(lud ludVar, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 11;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        ludVar.syc = z;
        int i6 = i3 + 107;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ int ycx(lud ludVar, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 85;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        ludVar.zb = i2;
        int i7 = i5 + 91;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    static /* synthetic */ void ycx(lud ludVar, boolean z, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ludVar.ycx(z, z2, z3);
        int i5 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ boolean ycx(lud ludVar, boolean z) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ludVar.ry = z;
        if (i4 == 0) {
            return z;
        }
        throw null;
    }

    static /* synthetic */ int zb(lud ludVar, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 21;
        int i5 = i4 % 128;
        IAuthTabCallback = i5;
        int i6 = i4 % 2;
        Object obj = null;
        ludVar.ycx = i2;
        if (i6 != 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i5 + 15;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    static /* synthetic */ boolean zb(lud ludVar, boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 85;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        ludVar.xkz = z;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 89;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public lud(Context context, tn tnVar, String str, JSONObject jSONObject) {
        this.ul = context;
        this.fby = tnVar;
        this.jw = str;
        this.ok = jSONObject;
    }

    public void ycx(com.bytedance.adsdk.ugeno.zb.sya<View> syaVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        com.bytedance.adsdk.ugeno.zb.sya syaVarLud = syaVar.lud("swiperLayout");
        this.lud = syaVarLud;
        if (syaVarLud instanceof dj) {
            this.dy = this.ok.optJSONArray("dpa_data");
            this.sya = syaVar.lud("swiperLeftArrow");
            this.dj = syaVar.lud("swiperRightArrow");
            ((dj) this.lud).ycx(new com.bytedance.adsdk.ugeno.ul.sya() { // from class: com.bytedance.sdk.openadsdk.core.ry.lt.lud.1
                @Override // com.bytedance.adsdk.ugeno.ul.sya
                public void ycx(boolean z, int i5) {
                }

                @Override // com.bytedance.adsdk.ugeno.ul.sya
                public void ycx(boolean z, int i5, float f, int i6) {
                }

                @Override // com.bytedance.adsdk.ugeno.ul.sya
                public void ycx(boolean z, int i5, int i6, boolean z2, boolean z3) {
                    lud.ycx(lud.this, i5);
                    lud.zb(lud.this, i6);
                    lud.ycx(lud.this, z);
                    lud.zb(lud.this, z2);
                    lud.sya(lud.this, z3);
                    lud.ycx(lud.this, z, z2, z3);
                    lud.sya(lud.this, i5);
                }
            });
            int i5 = IAuthTabCallback + 99;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void ycx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        ycx(this.ry, this.xkz, this.syc);
        int i5 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    private void ycx(boolean z, boolean z2, boolean z3) {
        int i2 = 2 % 2;
        com.bytedance.adsdk.ugeno.zb.sya syaVar = this.sya;
        if (syaVar != null) {
            int i3 = onExtraCallbackWithResult + 1;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            if (this.dj != null) {
                View viewEa = syaVar.ea();
                View viewEa2 = this.dj.ea();
                JSONArray jSONArray = this.dy;
                if (jSONArray != null && jSONArray.length() == 1) {
                    viewEa.setVisibility(8);
                    viewEa2.setVisibility(8);
                    return;
                }
                if (z) {
                    return;
                }
                if (z2) {
                    if (viewEa instanceof TextView) {
                        ycx((TextView) viewEa, 90);
                    }
                    if (viewEa2 instanceof TextView) {
                        ycx((TextView) viewEa2, OggPageHeader.MAX_SEGMENT_COUNT);
                        return;
                    }
                    return;
                }
                if (z3) {
                    if (viewEa instanceof TextView) {
                        ycx((TextView) viewEa, OggPageHeader.MAX_SEGMENT_COUNT);
                        int i5 = onExtraCallbackWithResult + 59;
                        IAuthTabCallback = i5 % 128;
                        int i6 = i5 % 2;
                    }
                    if (viewEa2 instanceof TextView) {
                        ycx((TextView) viewEa2, 90);
                        return;
                    }
                    return;
                }
                if (viewEa instanceof TextView) {
                    int i7 = onExtraCallbackWithResult + 71;
                    IAuthTabCallback = i7 % 128;
                    int i8 = i7 % 2;
                    ycx((TextView) viewEa, OggPageHeader.MAX_SEGMENT_COUNT);
                    int i9 = onExtraCallbackWithResult + 97;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 5 % 5;
                    }
                }
                if (viewEa2 instanceof TextView) {
                    ycx((TextView) viewEa2, OggPageHeader.MAX_SEGMENT_COUNT);
                }
            }
        }
    }

    private void ycx(int i2) {
        int i3 = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("index", i2);
            int i4 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzCrYNeFWPJLiR+0", "SOsjkSC9e8iVWdJRvxmvPw==", 145);
        }
        com.bytedance.sdk.openadsdk.dj.sya.zb(this.fby, this.jw, "carousel_show", jSONObject);
        int i6 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ycx(TextView textView, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int currentTextColor = textView.getCurrentTextColor();
            textView.setTextColor(Color.argb(i2, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
            int i5 = 33 / 0;
        } else {
            int currentTextColor2 = textView.getCurrentTextColor();
            textView.setTextColor(Color.argb(i2, Color.red(currentTextColor2), Color.green(currentTextColor2), Color.blue(currentTextColor2)));
        }
    }

    public void zb() throws Resources.NotFoundException {
        int i2;
        int i3 = 2 % 2;
        com.bytedance.adsdk.ugeno.zb.sya syaVar = this.lud;
        if ((!(syaVar instanceof dj)) || (i2 = this.ycx) == -1) {
            return;
        }
        int i4 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        ((dj) syaVar).ycx(i2 - 1);
        int i6 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 5;
        }
    }

    public void sya() throws Resources.NotFoundException {
        int i2;
        int i3 = 2 % 2;
        com.bytedance.adsdk.ugeno.zb.sya syaVar = this.lud;
        if ((!(syaVar instanceof dj)) || (i2 = this.ycx) == -1) {
            return;
        }
        int i4 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        ((dj) syaVar).ycx(i2 + 1);
        int i6 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
    }

    public void ycx(com.bytedance.sdk.openadsdk.core.widget.lt ltVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 17;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        this.jc = ltVar;
        if (i5 == 0) {
            int i6 = 70 / 0;
        }
        int i7 = i4 + 25;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r3
      0x0023: PHI (r3v3 int) = (r3v2 int), (r3v19 int) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ycx(ry ryVar) {
        int i2;
        JSONObject jSONObjectOptJSONObject;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult;
        int i5 = i4 + 81;
        IAuthTabCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            this.ea = null;
            i2 = this.zb;
            int i6 = 22 / 0;
            if (i2 != -1) {
                int i7 = i4 + 57;
                IAuthTabCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 59 / 0;
                    if (i2 != 0) {
                        try {
                            JSONObject jSONObjectSya = ryVar.sya();
                            if (jSONObjectSya != null && (jSONObjectOptJSONObject = jSONObjectSya.optJSONObject("related_dpa_click")) != null) {
                                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                                int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                                if (!zOptBoolean || iOptInt == -1) {
                                    return false;
                                }
                                int i9 = IAuthTabCallback + 41;
                                int i10 = i9 % 128;
                                onExtraCallbackWithResult = i10;
                                if (i9 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                if (this.dy != null) {
                                    int i11 = i10 + 55;
                                    IAuthTabCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                    Object[] objArr = new Object[1];
                                    a(new char[]{2, 0, 13858}, (byte) (ExpandableListView.getPackedPositionType(0L) + 44), Color.blue(0) + 3, objArr);
                                    String strYcx = zb.ycx(jSONObjectOptJSONObject.optString(((String) objArr[0]).intern()), this.dy.optJSONObject(this.zb));
                                    String strYcx2 = zb.ycx(jSONObjectOptJSONObject.optString("fallback_url"), this.dy.optJSONObject(this.zb));
                                    Object[] objArr2 = new Object[1];
                                    a(new char[]{2, 0, 13858}, (byte) (View.MeasureSpec.getSize(0) + 44), 3 - ExpandableListView.getPackedPositionType(0L), objArr2);
                                    jSONObjectOptJSONObject.put(((String) objArr2[0]).intern(), strYcx);
                                    jSONObjectOptJSONObject.put("fallback_url", strYcx2);
                                    ycx(jSONObjectOptJSONObject, this.dy.optJSONObject(this.zb));
                                }
                                ycx(jSONObjectOptJSONObject, ryVar.ycx().ea());
                                int i13 = onExtraCallbackWithResult + 115;
                                IAuthTabCallback = i13 % 128;
                                if (i13 % 2 == 0) {
                                    return true;
                                }
                                throw null;
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzCrYNeFWPJLiR+0", "VOAhjDCrYNeFWPRRhRKrDU3rI4E=", 215);
                            htf.sya("UGenSwiperEvent", th.getMessage());
                        }
                    }
                } else if (i2 != 0) {
                }
            }
        } else {
            this.ea = null;
            i2 = this.zb;
            if (i2 != -1) {
            }
        }
        return false;
    }

    private void ycx(JSONObject jSONObject, JSONObject jSONObject2) {
        int i2 = 2 % 2;
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        int i3 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("clickInfo");
        this.ea = jSONObjectOptJSONObject;
        if (jSONObjectOptJSONObject != null) {
            int i5 = IAuthTabCallback + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    this.ea.putOpt(next, zb.ycx((String) this.ea.opt(next), jSONObject2));
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzCrYNeFWPJLiR+0", "S+8/hgafZc6DQf5Tih4=", 235);
                }
            }
            try {
                jSONObject.putOpt("clickInfo", this.ea);
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V+yqQDfJs35BY0k6f", "bskomzCrYNeFWPJLiR+0", "S+8/hgafZc6DQf5Tih4=", 240);
            }
        }
    }

    public JSONObject dj() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 53;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        JSONObject jSONObject = this.ea;
        int i6 = i3 + 21;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return jSONObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean ycx(int i2, String str, String str2) {
        int i3 = 2 % 2;
        if (i2 != 1) {
            int i4 = onExtraCallbackWithResult + 15;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0 ? i2 == 2 : i2 == 4) {
                if (TextUtils.isEmpty(str)) {
                    int i5 = onExtraCallbackWithResult + 17;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 54 / 0;
                    }
                }
                if (!pmi.ycx(str2)) {
                    return false;
                }
            } else if (i2 == 3) {
                if (!pmi.ycx(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 26 - TextUtils.getOffsetBefore("", 0), Process.getGidForName("") + 23140, -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            int i6 = $11 + 17;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                i3 = i2 + 39;
                cArr4[i3] = (char) (cArr[i3] + b);
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
                    int i7 = $10 + 69;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback << b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent / 0] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback + b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 24824), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 74, 8088 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 30 - TextUtils.getOffsetAfter("", 0), KeyEvent.normalizeMetaState(0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i8 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i8];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i9 = $10 + 77;
                            $11 = i9 % 128;
                            int i10 = i9 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i11];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                        } else {
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        int i15 = 0;
        while (i15 < i2) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            i15++;
            int i16 = $10 + 103;
            $11 = i16 % 128;
            int i17 = i16 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    private void ycx(JSONObject jSONObject, View view) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOptInt = jSONObject.optInt("landingStyle");
        Object[] objArr = new Object[1];
        a(new char[]{2, 0, 13858}, (byte) (45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), Drawable.resolveOpacity(0, 0) + 3, objArr);
        if (ycx(iOptInt, jSONObject.optString(((String) objArr[0]).intern()), jSONObject.optString("fallback_url"))) {
            uh.ycx(ycx(view), this.ul instanceof Activity, jSONObject, this.fby, this.jw, oby.ycx(this.jw), (WebView) null, this.jc);
            int i5 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }
    }

    private Context ycx(View view) {
        Activity activityYcx;
        int i2 = 2 % 2;
        if (view != null) {
            activityYcx = com.bytedance.sdk.component.utils.zb.ycx(view);
            int i3 = onExtraCallbackWithResult + 99;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        } else {
            activityYcx = null;
        }
        if (activityYcx != null) {
            return activityYcx;
        }
        int i5 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return this.ul;
    }
}
