package com.bytedance.sdk.component.adexpress.dynamic.dj;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.button.MaterialButton;
import com.google.zxing.aztec.encoder.Encoder;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt {
    private String aeu;
    private double ag;
    private int aq;
    private double av;
    private String bah;
    private int bba;
    private int bh;
    private double bhi;
    private String bjp;
    private JSONObject ci;
    private boolean cu;
    private int dc;
    private boolean dfk;
    private float dj;
    private boolean dqs;
    private boolean duz;
    private String dv;
    private int dwi;
    private String dy;
    private double ea;
    private float fby;
    private String ff;
    private int giw;
    private int hf;
    private int hfd;
    private JSONObject hpv;
    private String htf;
    private boolean ifb;
    private int iq;
    private float jc;
    private boolean jp;
    private float jw;
    private String kgy;
    private String kh;
    private boolean kt;
    private int liq;
    private float lt;
    private boolean lud;
    private boolean lv;
    private String mp;
    private boolean mue;
    private int nc;
    private int nji;
    private String nq;
    private int nzi;
    private int oby;
    private double ok;
    private boolean oty;
    private boolean pg;
    private String pmi;
    private int py;
    private int pyn;
    private int qn;
    private JSONObject qt;
    private int rl;
    private String rmf;
    private String rmy;
    private int row;
    private String ry;
    private String rzo;
    private int sg;
    private int skm;
    private int sp;
    private String spv;
    private float sya;
    private String syc;
    private double sz;
    private JSONObject te;
    private String thx;
    private String tn;
    private int tpg;
    private int tru;
    private int tx;
    private boolean uf;
    private int ufy;
    private String uh;
    private String ui;
    private int ujb;
    private float ul;
    private int ur;
    private String uu;
    private boolean uz;
    private String vbt;
    private int vy;
    private boolean vyl;
    private String wie;
    private List<ycx> wk;
    private int wr;
    private String wwx;
    private boolean xf;
    private long xh = -1;
    private String xkz;
    private boolean xym;
    private String xz;
    private float ycx;
    private int yi;
    private int yw;
    private int yyc;
    private int yzp;
    private float zb;
    private int zk;
    private boolean zr;
    private static final byte[] $$a = {34, -56, 26, -92};
    private static final int $$b = 100;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private static long onExtraCallbackWithResult = 7798559133331975163L;
    private static int onExtraCallback = -1776194565;
    private static char IAuthTabCallback = 28557;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = 4 - (i2 * 2);
        int i8 = (b * 3) + 1;
        int i9 = i3 + 109;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i10 = i8;
            i5 = i7;
            i6 = 0;
            i7 += i10;
            i5++;
            i4 = i6;
            i6 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i6 == i8) {
                return new String(bArr2, 0);
            }
            i10 = bArr[i5];
            i7 += i10;
            i5++;
            i4 = i6;
            i6 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i6 == i8) {
            }
        } else {
            i4 = 0;
            i5 = i7;
            i7 = i9;
            i6 = i4 + 1;
            bArr2[i4] = (byte) i7;
            if (i6 == i8) {
            }
        }
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i6 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i7 = $11 + 35;
            $10 = i7 % 128;
            int i8 = i7 % i4;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iMyPid = (Process.myPid() >> 22) + 43;
                    int i9 = 1450 - (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1));
                    byte b = (byte) i6;
                    byte b2 = b;
                    String str$$c = $$c(b, b2, (byte) (b2 + 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i6] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, iMyPid, i9, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    char keyRepeatDelay = (char) (49123 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    int jumpTapTimeout2 = (ViewConfiguration.getJumpTapTimeout() >> 16) + 44;
                    int iRgb = (-16775722) - Color.rgb(i6, i6, i6);
                    byte b3 = (byte) i6;
                    byte b4 = b3;
                    String str$$c2 = $$c(b3, b4, b4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i6] = Object.class;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(keyRepeatDelay, jumpTapTimeout2, iRgb, 1533236389, false, str$$c2, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i6] = trackSelectionParametersBuilderExternalSyntheticLambda0;
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(i6) + 23972);
                    int iRed = Color.red(i6) + 50;
                    int iIndexOf = TextUtils.indexOf("", "", i6) + 22939;
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i6] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cNormalizeMetaState, iRed, iIndexOf, 1872485556, false, "k", clsArr3);
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i11 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i6] = Integer.valueOf(i11);
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    char offsetBefore = (char) (45848 - TextUtils.getOffsetBefore("", i6));
                    int tapTimeout = 29 - (ViewConfiguration.getTapTimeout() >> 16);
                    int maximumDrawingCacheSize = 12577 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    i3 = 2;
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i6] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, tapTimeout, maximumDrawingCacheSize, 1401536470, false, "l", clsArr4);
                } else {
                    i3 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (onExtraCallback ^ 7798559133331975163L)) ^ ((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i12 = $10 + 57;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                i4 = i3;
                i6 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static lt ycx(JSONObject jSONObject) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if (jSONObject == null) {
            int i6 = i4 + 31;
            onNavigationEvent = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        lt ltVar = new lt();
        ltVar.zb(jSONObject.optString("adType", "embeded"));
        ltVar.syc(jSONObject.optString("clickArea", "creative"));
        ltVar.dy(jSONObject.optString("clickTigger", "click"));
        ltVar.sya(jSONObject.optString(TtmlNode.ATTR_TTS_FONT_FAMILY, "PingFangSC"));
        ltVar.dj(jSONObject.optString(TtmlNode.ATTR_TTS_TEXT_ALIGN, TtmlNode.LEFT));
        ltVar.lud(jSONObject.optString(TtmlNode.ATTR_TTS_COLOR, "#999999"));
        Object[] objArr = new Object[1];
        a((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 663010467 + (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new char[]{41086, 48230, 2582, 28722, 26865, 6380, 57792, 61886, 42666, 16702, 36554}, new char[]{0, 0, 0, 0}, new char[]{41829, 33980, 10279, 50680}, objArr);
        ltVar.lt(jSONObject.optString(RVParams.AROME_BG_COLOR, ((String) objArr[0]).intern()));
        ltVar.ul(jSONObject.optString("bgImgUrl", ""));
        ltVar.tru(jSONObject.optString("bgImgData", ""));
        ltVar.fby(jSONObject.optString("borderColor", "#000000"));
        ltVar.jw(jSONObject.optString("borderStyle", "solid"));
        ltVar.jc(jSONObject.optString("heightMode", TtmlNode.TEXT_EMPHASIS_AUTO));
        ltVar.ea(jSONObject.optString("widthMode", "fixed"));
        ltVar.ok(jSONObject.optString("interactText", ""));
        ltVar.sya(jSONObject.optBoolean("isShowBgControl", false));
        ltVar.ry(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            ltVar.ul(jSONObjectOptJSONObject.optInt("translateY", 0));
            ltVar.fby(jSONObjectOptJSONObject.optInt("translateX", 0));
            ltVar.dj(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            ltVar.lud(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        ltVar.xkz(jSONObject.optString("interactType", ""));
        ltVar.lud(jSONObject.optInt("interactSlideDirection", -1));
        ltVar.wie(jSONObject.optString("justifyHorizontal", "space-around"));
        ltVar.pmi(jSONObject.optString("justifyVertical", "flex-start"));
        ltVar.zb(jSONObject.optDouble("timingStart"));
        ltVar.sya(jSONObject.optDouble("timingEnd"));
        ltVar.dj((float) jSONObject.optDouble("width", 0.0d));
        ltVar.sya((float) jSONObject.optDouble("height", 0.0d));
        ltVar.ycx((float) jSONObject.optDouble("borderRadius", 0.0d));
        ltVar.zb((float) jSONObject.optDouble("borderSize", 0.0d));
        ltVar.zb(jSONObject.optBoolean("interactValidate", false));
        ltVar.jw((float) jSONObject.optDouble(TtmlNode.ATTR_TTS_FONT_SIZE, 0.0d));
        ltVar.lud((float) jSONObject.optDouble("paddingBottom", 0.0d));
        ltVar.lt((float) jSONObject.optDouble("paddingLeft", 0.0d));
        ltVar.ul((float) jSONObject.optDouble("paddingRight", 0.0d));
        ltVar.fby((float) jSONObject.optDouble("paddingTop", 0.0d));
        ltVar.dj(jSONObject.optBoolean("lineFeed", false));
        ltVar.jw(jSONObject.optInt("lineCount", 0));
        ltVar.lt(jSONObject.optDouble("lineHeight", 1.2d));
        ltVar.xkz(jSONObject.optInt("letterSpacing", 0));
        ltVar.lud(jSONObject.optBoolean("isDataFixed", false));
        ltVar.syc(jSONObject.optInt(TtmlNode.ATTR_TTS_FONT_WEIGHT));
        ltVar.lt(jSONObject.optBoolean("lineLimit"));
        ltVar.dy(jSONObject.optInt("position"));
        ltVar.uh(jSONObject.optString("align"));
        ltVar.ul(jSONObject.optBoolean("useLeft"));
        ltVar.fby(jSONObject.optBoolean("useRight"));
        ltVar.jw(jSONObject.optBoolean("useTop"));
        ltVar.jc(jSONObject.optBoolean("useBottom"));
        Object[] objArr2 = new Object[1];
        a((char) (36958 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{16748, 22739, 48892, 57846}, new char[]{0, 0, 0, 0}, new char[]{6138, 43995, 24538, 12176}, objArr2);
        ltVar.htf(jSONObject.optString(((String) objArr2[0]).intern()));
        ltVar.zb(jSONObject.optJSONObject("i18n"));
        ltVar.ok(jSONObject.optInt("marginLeft"));
        ltVar.ry(jSONObject.optInt("marginRight"));
        ltVar.jc(jSONObject.optInt("marginTop"));
        ltVar.ea(jSONObject.optInt("marginBottom"));
        ltVar.wie(jSONObject.optInt("tagMaxCount"));
        ltVar.ea(jSONObject.optBoolean("allowTextFlow"));
        ltVar.pmi(jSONObject.optInt("textFlowType"));
        ltVar.uh(jSONObject.optInt("textFlowDuration"));
        ltVar.htf(jSONObject.optInt(TtmlNode.LEFT));
        ltVar.thx(jSONObject.optInt(TtmlNode.RIGHT));
        ltVar.wwx(jSONObject.optInt("top"));
        ltVar.tn(jSONObject.optInt("bottom"));
        ltVar.thx(jSONObject.optString("alignItems", "flex-start"));
        ltVar.wwx(jSONObject.optString("direction", ""));
        ltVar.ycx(jSONObject.optBoolean("loop", false));
        ltVar.dv(jSONObject.optInt("zIndex"));
        ltVar.av(jSONObject.optInt("interactVisibleTime"));
        ltVar.oty(jSONObject.optInt("interactHiddenTime"));
        ltVar.ry(jSONObject.optBoolean("interactEnableMask"));
        ltVar.xkz(jSONObject.optBoolean("interactWontHide"));
        ltVar.ycx(jSONObject.optString("bgGradient"));
        ltVar.aeu(jSONObject.optInt("areaType"));
        ltVar.xz(jSONObject.optInt("interactSlideThreshold", 0));
        ltVar.ifb(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.dj.zb() ? 0 : 120));
        ltVar.pmi(jSONObject.optBoolean("openPlayableLandingPage", false));
        ltVar.sya(jSONObject.optJSONObject(MediaDescription.MEDIA_TYPE_VIDEO));
        ltVar.dj(jSONObject.optJSONObject(TtmlNode.TAG_IMAGE));
        ltVar.rmy(jSONObject.optInt("borderShadowExtent"));
        ltVar.syc(jSONObject.optBoolean("bgGauseBlur"));
        ltVar.kgy(jSONObject.optInt("bgGauseBlurRadius"));
        ltVar.dy(jSONObject.optBoolean("showTimeProgress", false));
        ltVar.wie(jSONObject.optBoolean("showPlayButton", false));
        ltVar.ycx(jSONObject.optDouble("bgColorCg", 0.0d));
        ltVar.lt(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        ltVar.zb(jSONObject.optInt("borderTopLeftRadius", 0));
        ltVar.ycx(jSONObject.optInt("borderTopRightRadius", 0));
        ltVar.dj(jSONObject.optInt("borderBottomLeftRadius", 0));
        ltVar.sya(jSONObject.optInt("borderBottomRightRadius", 0));
        ltVar.lud(jSONObject.optJSONObject("interactI18n"));
        ltVar.dv(jSONObject.optString("imageObjectFit"));
        ltVar.oty(jSONObject.optString("interactTitle"));
        ltVar.rmf(jSONObject.optInt("interactTextPositionTop"));
        ltVar.tn(jSONObject.optString("imageLottieTosPath"));
        ltVar.ok(jSONObject.optBoolean("animationsLoop"));
        ltVar.hf(jSONObject.optInt("lottieAppNameMaxLength"));
        ltVar.bhi(jSONObject.optInt("lottieAdDescMaxLength"));
        ltVar.tru(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i7);
                    ycx ycxVar = new ycx();
                    ycxVar.sya(jSONObject2.optString("animationType"));
                    ycxVar.ycx(jSONObject2.optDouble("animationDuration"));
                    ycxVar.zb(jSONObject2.optDouble("animationScaleX"));
                    ycxVar.sya(jSONObject2.optDouble("animationScaleY"));
                    ycxVar.dj(jSONObject2.optString("animationTimeFunction"));
                    ycxVar.dj(jSONObject2.optDouble("animationDelay"));
                    ycxVar.lt(jSONObject2.optInt("animationIterationCount"));
                    ycxVar.lud(jSONObject2.optString("animationDirection"));
                    ycxVar.lud(jSONObject2.optDouble("animationInterval"));
                    ycxVar.ycx(jSONObject2.optInt("animationBorderWidth"));
                    Object[] objArr3 = new Object[1];
                    a((char) (49213 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 2043241692, new char[]{57613, 10453, 47678}, new char[]{0, 0, 0, 0}, new char[]{9369, 13979, 15494, 30656}, objArr3);
                    ycxVar.ycx(jSONObject2.optLong(((String) objArr3[0]).intern()));
                    ycxVar.zb(jSONObject2.optInt("animationEffectWidth"));
                    ycxVar.sya(jSONObject2.optInt("animationSwing", 1));
                    ycxVar.dj(jSONObject2.optInt("animationTranslateX"));
                    ycxVar.lud(jSONObject2.optInt("animationTranslateY"));
                    ycxVar.zb(jSONObject2.optString("animationRippleBackgroundColor"));
                    ycxVar.ycx(jSONObject2.optString("animationScaleDirection"));
                    ycxVar.ul(jSONObject2.optInt("animationFadeStart"));
                    ycxVar.fby(jSONObject2.optInt("animationFadeEnd"));
                    ycxVar.lt(jSONObject2.optString("animationFillMode"));
                    ycxVar.jw(jSONObject2.optInt("animationBounceHeight"));
                    if (ltVar.uh() > 0.0d) {
                        int i8 = onWarmupCompleted + 41;
                        onNavigationEvent = i8 % 128;
                        int i9 = i8 % 2;
                        ycxVar.dj(ycxVar.xkz() + ltVar.uh());
                    }
                    arrayList.add(ycxVar);
                }
                ltVar.ycx(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                Object[] objArr4 = new Object[1];
                a((char) (51436 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1612616287 - Color.red(0), new char[]{50889}, new char[]{0, 0, 0, 0}, new char[]{24443, 7826, 60512, 43976}, objArr4);
                ltVar.hf(jSONObject.optString("triggerSlideDirection", ((String) objArr4[0]).intern()));
                ltVar.ycx(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
            return ltVar;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImDOyIVjlG5QPqWw=", "XvY5hwK/feuBU9hImDOyIVjlG5QPqWw=", 344);
            int i10 = onNavigationEvent + 111;
            onWarmupCompleted = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 41 / 0;
            }
            return ltVar;
        }
    }

    public boolean ycx() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.xf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void ycx(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.xf = z;
        if (i4 == 0) {
            int i5 = 45 / 0;
        }
    }

    public int zb() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.tpg;
        int i7 = i4 + 35;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 70 / 0;
        }
        return i6;
    }

    public void ycx(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.tpg = i2;
        if (i5 == 0) {
            throw null;
        }
    }

    public int sya() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 101;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.liq;
        }
        throw null;
    }

    public void zb(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 47;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        this.liq = i2;
        int i7 = i5 + 21;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int dj() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.vy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void sya(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 75;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.vy = i2;
        if (i6 != 0) {
            int i7 = 30 / 0;
        }
        int i8 = i4 + 69;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int lud() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 97;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.yw;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void dj(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.yw = i2;
        int i7 = i4 + 121;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public JSONObject lt() {
        JSONObject jSONObject;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            jSONObject = this.ci;
            int i5 = 78 / 0;
        } else {
            jSONObject = this.ci;
        }
        int i6 = i3 + 31;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return jSONObject;
    }

    public int ul() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 3;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.nc;
        int i7 = i3 + 19;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void lud(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 103;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.nc = i2;
        int i7 = i5 + 93;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public double fby() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 57;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        double d = this.ag;
        int i6 = i3 + 81;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return d;
    }

    public void ycx(double d) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 71;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.ag = d;
        int i6 = i4 + 45;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public int jw() {
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 85;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 != 0) {
            i2 = this.sp;
            int i6 = 38 / 0;
        } else {
            i2 = this.sp;
        }
        int i7 = i5 + 35;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public void lt(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.sp = i2;
        if (i5 != 0) {
            throw null;
        }
    }

    public String jc() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 33;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        String str = this.rzo;
        int i6 = i4 + 35;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void ycx(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 65;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.rzo = str;
        int i6 = i4 + 57;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 73 / 0;
        }
    }

    public float ea() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        float f = this.ycx;
        int i6 = i3 + 53;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
        return f;
    }

    public void ycx(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.ycx = f;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 121;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public float ok() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.zb;
        }
        throw null;
    }

    public void zb(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.zb = f;
        if (i5 == 0) {
            int i6 = 63 / 0;
        }
        int i7 = i3 + 97;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 74 / 0;
        }
    }

    public void sya(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 35;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.sya = f;
        if (i4 == 0) {
            throw null;
        }
    }

    public void dj(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 83;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.dj = f;
        int i6 = i3 + 85;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public boolean ry() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 117;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z = this.lud;
        int i5 = i3 + 55;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return z;
    }

    public void zb(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.lud = z;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 103;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public float xkz() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 25;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        float f = this.lt;
        int i6 = i4 + 23;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void lud(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.lt = f;
        if (i5 == 0) {
            int i6 = 89 / 0;
        }
        int i7 = i4 + 29;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float syc() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 73;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.ul;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void lt(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.ul = f;
        if (i5 == 0) {
            int i6 = 70 / 0;
        }
        int i7 = i3 + 119;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float dy() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 89;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        float f = this.fby;
        int i6 = i3 + 13;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return f;
    }

    public void ul(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.fby = f;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float wie() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float f = this.jw;
        int i5 = i4 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public void fby(float f) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 95;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.jw = f;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 111;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public float pmi() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float f = this.jc;
        if (i4 == 0) {
            int i5 = 97 / 0;
        }
        return f;
    }

    public void jw(float f) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.jc = f;
        if (i5 != 0) {
            int i6 = 23 / 0;
        }
        int i7 = i3 + 87;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public double uh() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 77;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        double d = this.ea;
        int i5 = i3 + 21;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return d;
        }
        obj.hashCode();
        throw null;
    }

    public void zb(double d) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 3;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.ea = d;
        int i6 = i3 + 95;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public double htf() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        double d = this.ok;
        int i5 = i4 + 103;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return d;
    }

    public void sya(double d) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 39;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.ok = d;
        int i6 = i3 + 53;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public void zb(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.ry = str;
        int i6 = i4 + 99;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void sya(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.xkz = str;
        if (i4 != 0) {
            int i5 = 52 / 0;
        }
    }

    public String thx() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 95;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        String str = this.syc;
        int i6 = i4 + 61;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void dj(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 117;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.syc = str;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String wwx() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.dy;
        }
        throw null;
    }

    public void lud(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.dy = str;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 115;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public String tn() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        String str = this.wie;
        int i6 = i4 + 21;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void lt(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.wie = str;
        int i6 = i4 + 87;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public void ul(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.pmi = str;
        int i6 = i4 + 31;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public String dv() {
        String str;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            str = this.pmi;
            int i5 = 72 / 0;
        } else {
            str = this.pmi;
        }
        int i6 = i4 + 37;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private void tru(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.bah = str;
        if (i4 == 0) {
            throw null;
        }
    }

    public String oty() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 71;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        String str = this.bah;
        int i6 = i4 + 41;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public String hf() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.uh;
        }
        throw null;
    }

    public void fby(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.uh = str;
        int i6 = i4 + 113;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public void jw(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 13;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.htf = str;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 111;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public String tru() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 45;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.thx;
        int i6 = i3 + 93;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void jc(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.thx = str;
        int i6 = i3 + 117;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public String bhi() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 9;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.wwx;
        }
        throw null;
    }

    public void ea(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.wwx = str;
        if (i4 == 0) {
            int i5 = 11 / 0;
        }
    }

    public String av() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tn;
        if (i4 != 0) {
            int i5 = 48 / 0;
        }
        return str;
    }

    public void ok(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 17;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.tn = str;
        int i6 = i3 + 25;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public String rmf() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 79;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.dv;
        int i6 = i3 + 51;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void ry(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.dv = str;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean aeu() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 107;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.oty;
        }
        throw null;
    }

    public void sya(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.oty = z;
        if (i5 == 0) {
            int i6 = 17 / 0;
        }
        int i7 = i4 + 37;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public int xz() {
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 41;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 != 0) {
            i2 = this.hf;
            int i6 = 73 / 0;
        } else {
            i2 = this.hf;
        }
        int i7 = i5 + 7;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 23 / 0;
        }
        return i2;
    }

    public void ul(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.hf = i2;
        if (i5 == 0) {
            int i6 = 60 / 0;
        }
    }

    public int rmy() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 53;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.tru;
        int i7 = i3 + 85;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public void fby(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 105;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.tru = i2;
        if (i5 == 0) {
            int i6 = 45 / 0;
        }
    }

    public double kgy() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 51;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        double d = this.bhi;
        int i6 = i3 + 49;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return d;
    }

    public void dj(double d) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.bhi = d;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i4 + 3;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public double ifb() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 87;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        double d = this.av;
        if (i5 == 0) {
            int i6 = 31 / 0;
        }
        int i7 = i4 + 109;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 16 / 0;
        }
        return d;
    }

    public void lud(double d) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.av = d;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 73;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 36 / 0;
        }
    }

    public String yzp() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        String str = this.rmf;
        int i6 = i4 + 11;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 84 / 0;
        }
        return str;
    }

    public void xkz(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.rmf = str;
        int i6 = i3 + 71;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public String dwi() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 107;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        String str = this.aeu;
        int i6 = i3 + 91;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 85 / 0;
        }
        return str;
    }

    public void syc(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 3;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.aeu = str;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 103;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 96 / 0;
        }
    }

    public String oby() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        String str = this.xz;
        int i6 = i4 + 99;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void dy(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 31;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.xz = str;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 37;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public String nji() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.rmy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void wie(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 111;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.rmy = str;
        int i6 = i3 + 39;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public String dc() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.kgy;
        }
        throw null;
    }

    public void pmi(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.kgy = str;
        int i6 = i4 + 51;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean sz() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 47;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.ifb;
        int i6 = i3 + 35;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void dj(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 117;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.ifb = z;
        int i6 = i3 + 15;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public void jw(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 21;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        this.yzp = i2;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i5 + 51;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    public int yi() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.yzp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int xym() {
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 123;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 != 0) {
            i2 = this.dwi;
            int i6 = 6 / 0;
        } else {
            i2 = this.dwi;
        }
        int i7 = i5 + 37;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i2;
    }

    public void jc(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 73;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.dwi = i2;
        int i7 = i4 + 59;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 1 / 0;
        }
    }

    public int rl() {
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 45;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        if (i4 % 2 != 0) {
            i2 = this.oby;
            int i6 = 48 / 0;
        } else {
            i2 = this.oby;
        }
        int i7 = i5 + 19;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 44 / 0;
        }
        return i2;
    }

    public void ea(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 57;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.oby = i2;
        int i7 = i4 + 109;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public int zr() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = this.nji;
        int i7 = i4 + 103;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void ok(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 5;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.nji = i2;
        int i7 = i4 + 109;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public int bba() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 99;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i5 = this.dc;
        int i6 = i4 + 111;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 45 / 0;
        }
        return i5;
    }

    public void ry(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 117;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.dc = i2;
        int i7 = i4 + 99;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public double mp() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        double d = this.sz;
        if (i5 != 0) {
            int i6 = 80 / 0;
        }
        int i7 = i4 + 95;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return d;
    }

    public void lt(double d) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.sz = d;
        int i6 = i4 + 1;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public int uf() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 51;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.yi;
        int i7 = i3 + 29;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void xkz(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 69;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.yi = i2;
        int i7 = i4 + 83;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean duz() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 117;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.xym;
        int i6 = i3 + 97;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void lud(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 31;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.xym = z;
        int i6 = i4 + 99;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public int uz() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 29;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.rl;
        int i7 = i4 + 125;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void syc(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 1;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.rl = i2;
        int i7 = i5 + 11;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean lv() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        boolean z = this.zr;
        int i6 = i4 + 119;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void lt(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 121;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.zr = z;
        int i6 = i3 + 99;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
    }

    public int ui() {
        int i2;
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 43;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            i2 = this.bba;
            int i6 = 51 / 0;
        } else {
            i2 = this.bba;
        }
        int i7 = i4 + 57;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 85 / 0;
        }
        return i2;
    }

    public void dy(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        this.bba = i2;
        if (i6 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = i4 + 75;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public String hpv() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.mp;
        }
        throw null;
    }

    public void uh(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.mp = str;
        int i6 = i3 + 113;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean iq() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.uf;
        if (i4 == 0) {
            int i5 = 3 / 0;
        }
        return z;
    }

    public void ul(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 65;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.uf = z;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 91;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean dqs() {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 81;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            z = this.duz;
            int i5 = 34 / 0;
        } else {
            z = this.duz;
        }
        int i6 = i3 + 63;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void fby(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.duz = z;
        if (i4 != 0) {
            throw null;
        }
    }

    public boolean ur() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.uz;
        int i6 = i3 + 117;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void jw(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.uz = z;
        int i6 = i3 + 17;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public boolean wr() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 5;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.lv;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void jc(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 53;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.lv = z;
        int i6 = i4 + 73;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public String giw() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ui;
        int i6 = i3 + 59;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void htf(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.ui = str;
        if (i4 == 0) {
            throw null;
        }
    }

    public void zb(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.hpv = jSONObject;
        int i6 = i3 + 109;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public JSONObject sg() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        JSONObject jSONObject = this.hpv;
        int i6 = i3 + 67;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 67 / 0;
        }
        return jSONObject;
    }

    public int bh() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 91;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.iq;
        int i7 = i3 + 31;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 6 / 0;
        }
        return i6;
    }

    public void wie(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.iq = i2;
        int i7 = i4 + 87;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean aq() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 81;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        boolean z = this.dqs;
        int i6 = i4 + 109;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void ea(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.dqs = z;
        int i6 = i4 + 45;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int bjp() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = this.ur;
        int i6 = i3 + 71;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public void pmi(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 99;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.ur = i2;
        int i7 = i5 + 67;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public int uu() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.wr;
        if (i4 != 0) {
            int i6 = 97 / 0;
        }
        return i5;
    }

    public void uh(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 47;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.wr = i2;
        if (i6 == 0) {
            throw null;
        }
        int i7 = i5 + 125;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public int xf() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.giw;
        int i7 = i4 + 103;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void htf(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.giw = i2;
        if (i5 == 0) {
            int i6 = 91 / 0;
        }
    }

    public int tx() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 31;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.sg;
        int i7 = i3 + 97;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void thx(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 111;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.sg = i2;
        int i7 = i5 + 43;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public int ufy() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.bh;
        int i7 = i4 + 5;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void wwx(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 91;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.bh = i2;
        if (i6 == 0) {
            int i7 = 56 / 0;
        }
        int i8 = i5 + 7;
        onNavigationEvent = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 73 / 0;
        }
    }

    public int nzi() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 93;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.aq;
        int i7 = i4 + 105;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void tn(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 69;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.aq = i2;
        int i7 = i4 + 85;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String wk() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 23;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.bjp;
        int i6 = i3 + 77;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void thx(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 95;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.bjp = str;
        int i6 = i3 + 103;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String zk() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 77;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.uu;
        int i6 = i3 + 71;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void wwx(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.uu = str;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int ujb() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.tx;
        if (i4 != 0) {
            int i6 = 16 / 0;
        }
        return i5;
    }

    public void dv(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 9;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        this.tx = i2;
        int i7 = i5 + 105;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int qn() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.ufy;
        int i7 = i3 + 85;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public void oty(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.ufy = i2;
        if (i5 == 0) {
            throw null;
        }
    }

    public String py() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.kh;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void tn(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 45;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.kh = str;
        if (i5 == 0) {
            int i6 = 98 / 0;
        }
        int i7 = i4 + 69;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean dfk() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 81;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.cu;
        int i6 = i3 + 99;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public void ok(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.cu = z;
        int i6 = i4 + 119;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 2 / 0;
        }
    }

    public int vyl() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.pyn;
        int i7 = i4 + 89;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void hf(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 31;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.pyn = i2;
        if (i6 == 0) {
            int i7 = 58 / 0;
        }
        int i8 = i4 + 103;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 95 / 0;
        }
    }

    public int kt() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 43;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = this.skm;
        int i7 = i4 + 1;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void tru(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 91;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.skm = i2;
        if (i5 != 0) {
            int i6 = 49 / 0;
        }
    }

    public int row() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 83;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = this.hfd;
        int i7 = i4 + 57;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public void bhi(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 47;
        int i5 = i4 % 128;
        onNavigationEvent = i5;
        int i6 = i4 % 2;
        this.hfd = i2;
        if (i6 != 0) {
            int i7 = 12 / 0;
        }
        int i8 = i5 + 107;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
    }

    public boolean jp() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 67;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        boolean z = this.mue;
        int i6 = i4 + 113;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return z;
    }

    public void ry(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.mue = z;
        if (i4 == 0) {
            int i5 = 40 / 0;
        }
    }

    public int ag() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 87;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.nzi;
        int i7 = i3 + 113;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 48 / 0;
        }
        return i6;
    }

    public void av(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.nzi = i2;
        int i7 = i5 + 115;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public void xkz(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 113;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.pg = z;
        int i6 = i4 + 25;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean qt() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 9;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        boolean z = this.pg;
        int i6 = i4 + 23;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void dv(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.ff = str;
        int i6 = i3 + 33;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public String te() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.ff;
        int i6 = i3 + 81;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 58 / 0;
        }
        return str;
    }

    public void rmf(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 65;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.yyc = i2;
        int i7 = i5 + 109;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public int nc() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.yyc;
        int i7 = i4 + 35;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public List<ycx> vbt() {
        List<ycx> list;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 89;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        if (i3 % 2 == 0) {
            list = this.wk;
            int i5 = 36 / 0;
        } else {
            list = this.wk;
        }
        int i6 = i4 + 119;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
        return list;
    }

    public int pg() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 11;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<ycx> list = this.wk;
        if (list == null) {
            return 0;
        }
        int i4 = onWarmupCompleted + 119;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 % 5;
        }
        for (ycx ycxVar : list) {
            if ("translate".equals(ycxVar.jw())) {
                int i6 = onNavigationEvent + 19;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                if (ycxVar.ul() < 0) {
                    int i8 = onWarmupCompleted + 33;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                    return -ycxVar.ul();
                }
            }
        }
        return 0;
    }

    public void ycx(List<ycx> list) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 103;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.wk = list;
        if (i4 == 0) {
            throw null;
        }
    }

    public int ci() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 97;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.zk;
        int i7 = i3 + 101;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void aeu(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted;
        int i5 = i4 + 25;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        this.zk = i2;
        int i7 = i4 + 71;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public int sp() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 69;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        int i6 = this.ujb;
        int i7 = i4 + 51;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 13 / 0;
        }
        return i6;
    }

    public void xz(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 69;
        int i5 = i4 % 128;
        onWarmupCompleted = i5;
        int i6 = i4 % 2;
        this.ujb = i2;
        int i7 = i5 + 117;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
    }

    public int tpg() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.qn;
        int i7 = i3 + 101;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 != 0) {
            return i6;
        }
        throw null;
    }

    public void rmy(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent;
        int i5 = i4 + 115;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.qn = i2;
        int i7 = i4 + 3;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    public boolean liq() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 37;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        boolean z = this.dfk;
        int i6 = i4 + 115;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void syc(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 55;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.dfk = z;
        int i6 = i4 + 125;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public int vy() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        int i6 = this.py;
        int i7 = i4 + 47;
        onNavigationEvent = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 37 / 0;
        }
        return i6;
    }

    public void kgy(int i2) {
        int i3 = 2 % 2;
        int i4 = onNavigationEvent + 15;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.py = i2;
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean yw() {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 101;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        if (i3 % 2 != 0) {
            z = this.vyl;
            int i5 = 84 / 0;
        } else {
            z = this.vyl;
        }
        int i6 = i4 + 79;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void dy(boolean z) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.vyl = z;
        int i6 = i4 + 61;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean ff() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z = this.kt;
        int i5 = i3 + 75;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return z;
    }

    public void wie(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.kt = z;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 107;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public int yyc() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 75;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.row;
        }
        throw null;
    }

    public void ifb(int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.row = i2;
        if (i5 != 0) {
            int i6 = 82 / 0;
        }
    }

    public String mue() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 83;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.vbt;
        int i5 = i3 + 55;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public boolean kh() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 113;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        boolean z = this.jp;
        int i6 = i4 + 121;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void pmi(boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 25;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.jp = z;
        int i6 = i3 + 41;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void sya(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.qt = jSONObject;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 19;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public JSONObject cu() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObject = this.te;
        if (i4 != 0) {
            int i5 = 11 / 0;
        }
        return jSONObject;
    }

    public void dj(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 115;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.te = jSONObject;
        if (i5 == 0) {
            int i6 = 44 / 0;
        }
        int i7 = i3 + 75;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    public void lud(JSONObject jSONObject) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 113;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.ci = jSONObject;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 83;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    public String pyn() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 21;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        String str = this.nq;
        int i6 = i3 + 113;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void oty(String str) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 49;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        this.nq = str;
        if (i5 == 0) {
            int i6 = 71 / 0;
        }
        int i7 = i3 + 31;
        onWarmupCompleted = i7 % 128;
        int i8 = i7 % 2;
    }

    public void skm() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        ycx(this, this.qt);
        if (i4 == 0) {
            throw null;
        }
    }

    public void hfd() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 107;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        ycx(this, this.te);
        int i5 = onWarmupCompleted + 23;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
    }

    public String nq() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 93;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        String str = this.spv;
        int i6 = i3 + 75;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void hf(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        this.spv = str;
        int i6 = i4 + 37;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long spv() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 117;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return this.xh;
        }
        throw null;
    }

    public void ycx(long j) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 99;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        this.xh = j;
        int i6 = i3 + 11;
        onNavigationEvent = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ycx(lt ltVar, JSONObject jSONObject) throws Throwable {
        int i2 = 2 % 2;
        if (ltVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            char c = '5';
            switch (next.hashCode()) {
                case -2067713583:
                    if (!next.equals("isShowBgControl")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        int i3 = onWarmupCompleted + 43;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        c = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals("paddingLeft")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        c = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        int i5 = onWarmupCompleted + 49;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        c = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        int i7 = onNavigationEvent + 47;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        c = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals("alignItems")) {
                        c = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals("marginTop")) {
                        int i9 = onNavigationEvent + 81;
                        onWarmupCompleted = i9 % 128;
                        int i10 = i9 % 2;
                        c = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals("direction")) {
                        int i11 = onNavigationEvent + 3;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        c = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (!(!next.equals("interactHiddenTime"))) {
                        c = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        c = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals("zIndex")) {
                        c = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals("lineHeight")) {
                        int i13 = onWarmupCompleted + 29;
                        onNavigationEvent = i13 % 128;
                        if (i13 % 2 == 0) {
                            c = 26;
                            break;
                        } else {
                            c = '%';
                            break;
                        }
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals("marginBottom")) {
                        c = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals(RVParams.AROME_BG_COLOR)) {
                        int i14 = onNavigationEvent + 35;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        c = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        c = '!';
                        break;
                    }
                    break;
                case 3076010:
                    Object[] objArr = new Object[1];
                    a((char) (36960 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, new char[]{16748, 22739, 48892, 57846}, new char[]{0, 0, 0, 0}, new char[]{6138, 43995, 24538, 12176}, objArr);
                    if (next.equals(((String) objArr[0]).intern())) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals(TtmlNode.LEFT)) {
                        c = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c = '$';
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals("paddingTop")) {
                    }
                    break;
                case 92903173:
                    if (next.equals("align")) {
                        c = '&';
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals(TtmlNode.ATTR_TTS_COLOR)) {
                        c = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals(TtmlNode.RIGHT)) {
                        c = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        c = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c = '*';
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals("paddingBottom")) {
                        c = '+';
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        int i16 = onNavigationEvent + 15;
                        onWarmupCompleted = i16 % 128;
                        int i17 = i16 % 2;
                        c = ',';
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = '-';
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        c = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c = '/';
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals("paddingRight")) {
                        c = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals("borderColor")) {
                        c = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals("position")) {
                        c = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (!next.equals("isDataFixed")) {
                    }
                    break;
                case 975087886:
                    if (next.equals("marginRight")) {
                        c = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c = ':';
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (!(!next.equals("borderRadius"))) {
                        int i18 = onNavigationEvent + 5;
                        onWarmupCompleted = i18 % 128;
                        if (i18 % 2 != 0) {
                            c = '<';
                            break;
                        }
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = '=';
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = '>';
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals("marginLeft")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals("letterSpacing")) {
                        int i19 = onWarmupCompleted + 53;
                        onNavigationEvent = i19 % 128;
                        int i20 = i19 % 2;
                        c = 'B';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    ltVar.sya(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    ltVar.syc(jSONObject.optString(next));
                    break;
                case 2:
                    ltVar.hf(jSONObject.optString(next));
                    break;
                case 3:
                    ltVar.ul(jSONObject.optString(next));
                    break;
                case 4:
                    ltVar.jw(jSONObject.optInt(next));
                    break;
                case 5:
                    ltVar.pmi(jSONObject.optBoolean(next));
                    break;
                case 6:
                    ltVar.lt(jSONObject.optBoolean(next));
                    break;
                case 7:
                    ltVar.ry(jSONObject.optString(next));
                    break;
                case '\b':
                    ltVar.lt((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    ltVar.zb(jSONObject.optString(next));
                    break;
                case '\n':
                    ltVar.tn(jSONObject.optInt(next));
                    break;
                case 11:
                    ltVar.sya(jSONObject.optString(next));
                    break;
                case '\f':
                    ltVar.sya((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    ltVar.dj(jSONObject.optString(next));
                    break;
                case 14:
                    ltVar.thx(jSONObject.optString(next));
                    break;
                case 15:
                    ltVar.zb(jSONObject.optBoolean(next));
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    ltVar.jc(jSONObject.optInt(next));
                    break;
                case 17:
                    ltVar.jc(jSONObject.optBoolean(next));
                    break;
                case 18:
                    ltVar.ycx(jSONObject.optLong(next));
                    break;
                case 19:
                    ltVar.wwx(jSONObject.optString(next));
                    break;
                case 20:
                    ltVar.wie(jSONObject.optInt(next));
                    break;
                case 21:
                    ltVar.oty(jSONObject.optInt(next));
                    break;
                case 22:
                    ltVar.jw(jSONObject.optBoolean(next));
                    break;
                case 23:
                    ltVar.syc(jSONObject.optInt(next));
                    break;
                case 24:
                    ltVar.dv(jSONObject.optInt(next));
                    break;
                case 25:
                    ltVar.zb(jSONObject.optDouble(next));
                    break;
                case 26:
                    ltVar.lt(jSONObject.optDouble(next));
                    break;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    ltVar.uh(jSONObject.optInt(next));
                    break;
                case 28:
                    ltVar.fby(jSONObject.optBoolean(next));
                    break;
                case 29:
                    ltVar.ea(jSONObject.optInt(next));
                    break;
                case 30:
                    ltVar.lt(jSONObject.optString(next));
                    break;
                case 31:
                    ltVar.ul(jSONObject.optBoolean(next));
                    break;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    ltVar.ea(jSONObject.optString(next));
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    ltVar.wwx(jSONObject.optInt(next));
                    break;
                case '\"':
                    ltVar.htf(jSONObject.optString(next));
                    break;
                case '#':
                    ltVar.htf(jSONObject.optInt(next));
                    break;
                case '$':
                    ltVar.ycx(jSONObject.optBoolean(next));
                    break;
                case '%':
                    ltVar.fby((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    ltVar.uh(jSONObject.optString(next));
                    break;
                case '\'':
                    ltVar.lud(jSONObject.optString(next));
                    break;
                case '(':
                    ltVar.thx(jSONObject.optInt(next));
                    break;
                case ')':
                    ltVar.dj((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    ltVar.sya(jSONObject.optDouble(next));
                    break;
                case '+':
                    ltVar.lud((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    ltVar.ea(jSONObject.optBoolean(next));
                    break;
                case '-':
                    ltVar.xkz(jSONObject.optBoolean(next));
                    break;
                case '.':
                    ltVar.jw((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    ltVar.pmi(jSONObject.optString(next));
                    break;
                case '0':
                    ltVar.av(jSONObject.optInt(next));
                    break;
                case '1':
                    ltVar.ul((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    ltVar.fby(jSONObject.optString(next));
                    break;
                case '3':
                    ltVar.jw(jSONObject.optString(next));
                    break;
                case '4':
                    ltVar.dy(jSONObject.optInt(next));
                    break;
                case '5':
                    ltVar.lud(jSONObject.optBoolean(next));
                    break;
                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                    ltVar.ry(jSONObject.optInt(next));
                    break;
                case '7':
                    ltVar.wie(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        ltVar.ul(jSONObjectOptJSONObject.optInt("translateY", 0));
                        ltVar.fby(jSONObjectOptJSONObject.optInt("translateX", 0));
                        ltVar.dj(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        ltVar.lud(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case '9':
                    ltVar.dj(jSONObject.optBoolean(next));
                    break;
                case ':':
                    ltVar.ok(jSONObject.optString(next));
                    break;
                case ';':
                    ltVar.xkz(jSONObject.optString(next));
                    break;
                case '<':
                    ltVar.ycx((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    ltVar.dy(jSONObject.optString(next));
                    break;
                case '>':
                    ltVar.jc(jSONObject.optString(next));
                    break;
                case '?':
                    ltVar.pmi(jSONObject.optInt(next));
                    break;
                case '@':
                    ltVar.zb((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    ltVar.ok(jSONObject.optInt(next));
                    break;
                case 'B':
                    ltVar.xkz(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
