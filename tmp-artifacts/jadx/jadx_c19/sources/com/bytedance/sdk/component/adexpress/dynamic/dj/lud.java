package com.bytedance.sdk.component.adexpress.dynamic.dj;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    private static int IAuthTabCallback;
    private static int onExtraCallback;
    private static char onNavigationEvent;
    private static long onWarmupCompleted;
    public static final Map<String, Integer> ycx;
    private lt dj;
    private String lt;
    private lt lud;
    private String sya;
    private String zb;
    private static final byte[] $$a = {63, 67, 46, -88};
    private static final int $$b = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, byte b2) {
        int i2;
        int i3;
        int i4 = b2 * 2;
        ?? r7 = b + 109;
        byte[] bArr = $$a;
        int i5 = 3 - (s * 4);
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte b3 = r7;
            int i6 = 0;
            int i7 = i5;
            int i8 = i5 + (-b3);
            i2 = i6;
            int i9 = i7;
            i3 = i8;
            i5 = i9;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i10 = i5 + 1;
            b3 = bArr[i10];
            int i11 = i3;
            i7 = i10;
            i5 = i11;
            int i82 = i5 + (-b3);
            i2 = i6;
            int i92 = i7;
            i3 = i82;
            i5 = i92;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3 = r7;
            bArr2[i2] = (byte) i3;
            i6 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    static {
        onExtraCallback = 0;
        onExtraCallbackWithResult();
        HashMap map = new HashMap();
        ycx = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        Object[] objArr = new Object[1];
        a((char) (54484 - ((byte) KeyEvent.getModifierMetaStateMask())), Process.getGidForName("") - 299238493, new char[]{43346, 2768, 42199, 19630, 26578}, new char[]{31211, 29309, 11230, 17257}, new char[]{41672, 10747, 54766, 8916}, objArr);
        map.put(((String) objArr[0]).intern(), 0);
        Object[] objArr2 = new Object[1];
        a((char) ((-1) - Process.getGidForName("")), Color.argb(0, 0, 0, 0), new char[]{13402, 45867, 32009, 20256, 49202, 12686, 14013, 25373}, new char[]{31211, 29309, 11230, 17257}, new char[]{37557, 32723, 55299, 1080}, objArr2);
        map.put(((String) objArr2[0]).intern(), 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        Object[] objArr3 = new Object[1];
        a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16614), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{16662, 40170, 3071, 38572}, new char[]{31211, 29309, 11230, 17257}, new char[]{16020, 48066, 59312, 26432}, objArr3);
        map.put(((String) objArr3[0]).intern(), 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put(TtmlNode.TAG_IMAGE, 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        map.put("logounion", 5);
        map.put("logo-union", 9);
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        map.put("webview-close", 22);
        map.put("feedback-dislike", 12);
        Object[] objArr4 = new Object[1];
        a((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41173), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{47605, 40032, 56299, 33618, 34872, 36622}, new char[]{31211, 29309, 11230, 17257}, new char[]{27026, 26113, 54623, 16032}, objArr4);
        map.put(((String) objArr4[0]).intern(), 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put("vessel", 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        map.put("carousel-vessel", 26);
        map.put("leisure-interact", 25);
        map.put("video-hd", 7);
        map.put(MediaDescription.MEDIA_TYPE_VIDEO, 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        map.put("star", 11);
        map.put("skip-countdowns", 19);
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        map.put("skip-with-countdowns-skip-countdown", 20);
        map.put("skip-with-time", 14);
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
        int i2 = onExtraCallbackWithResult + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i2));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i4 = $11 + 79;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 1451, 228868077, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 44, 1494 - Color.red(0), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23973), 51 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 22939 - Color.alpha(0), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.indexOf("", "")), View.resolveSizeAndState(0, 0, 0) + 29, 12577 - TextUtils.getOffsetBefore("", 0), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                int i6 = $10 + 21;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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

    public int ycx() {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(this.zb)) {
            return 0;
        }
        if (this.zb.equals("logo")) {
            String str = this.zb + this.sya;
            this.zb = str;
            if (str.contains("logoad")) {
                int i3 = asInterface + 125;
                IAuthTabCallbackStub = i3 % 128;
                int i4 = i3 % 2;
                return 4;
            }
            if (this.zb.contains("logounion")) {
                int i5 = asInterface + 27;
                IAuthTabCallbackStub = i5 % 128;
                return i5 % 2 == 0 ? 3 : 5;
            }
        }
        Map<String, Integer> map = ycx;
        if (map.get(this.zb) != null) {
            return map.get(this.zb).intValue();
        }
        return -1;
    }

    public String zb() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 57;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        String str = this.zb;
        int i6 = i3 + 83;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void ycx(String str) {
        int i2 = 2 % 2;
        int i3 = asInterface + 53;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        this.zb = str;
        int i6 = i4 + 93;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public String sya() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 111;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        String str = this.sya;
        int i6 = i3 + 109;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void zb(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 69;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        this.sya = str;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void sya(String str) {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 25;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        this.lt = str;
        int i6 = i3 + 123;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public String dj() {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 51;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        String str = this.lt;
        int i5 = i3 + 19;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public lt lud() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 85;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return this.dj;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int lt() {
        int i2 = 2 % 2;
        int i3 = asInterface + 5;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        int iUfy = this.dj.ufy();
        int i5 = asInterface + 37;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return iUfy;
    }

    public void ycx(lt ltVar) {
        int i2 = 2 % 2;
        int i3 = asInterface + 113;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        int i5 = i3 % 2;
        this.dj = ltVar;
        int i6 = i4 + 59;
        asInterface = i6 % 128;
        int i7 = i6 % 2;
    }

    public void zb(lt ltVar) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 97;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        this.lud = ltVar;
        int i6 = i3 + 5;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 14 / 0;
        }
    }

    public lt ul() {
        int i2 = 2 % 2;
        int i3 = asInterface;
        int i4 = i3 + 89;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        lt ltVar = this.lud;
        int i5 = i3 + 121;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return ltVar;
    }

    public String toString() {
        int i2 = 2 % 2;
        String str = "DynamicLayoutBrick{type='" + this.zb + "', data='" + this.sya + "', value=" + this.dj + ", themeValue=" + this.lud + ", dataExtraInfo='" + this.lt + "'}";
        int i3 = IAuthTabCallbackStub + 85;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    static void onExtraCallbackWithResult() {
        onWarmupCompleted = 3410113224066732560L;
        IAuthTabCallback = -1776194565;
        onNavigationEvent = (char) 27643;
    }
}
