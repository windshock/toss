package com.bytedance.sdk.component.adexpress.dynamic.dj;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.component.adexpress.dynamic.lud.ea;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ul {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] IAuthTabCallback = {51240, 64989, 64982, 64967, 64963, 64978, 64960, 64988, 64961};
    private static char onExtraCallback = 51242;
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    private lt dj;
    private String lt;
    private lud lud;
    public JSONObject sya;
    public int ycx;
    public String zb;

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ul(lud ludVar) {
        this.lud = ludVar;
        this.ycx = ludVar.ycx();
        this.zb = ludVar.sya();
        this.sya = ludVar.lud().sg();
        this.lt = ludVar.dj();
        if (com.bytedance.sdk.component.adexpress.dj.sya() == 1) {
            this.dj = ludVar.ul();
        } else {
            this.dj = ludVar.lud();
            int i2 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 5 % 5;
            }
            if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                return;
            }
            int i4 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            this.dj = ludVar.lud();
            if (i5 != 0) {
                throw null;
            }
            return;
        }
        int i6 = 2 % 2;
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
        }
    }

    public int ycx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iXkz = (int) this.dj.xkz();
        int i5 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iXkz;
    }

    public int zb() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 77;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            this.dj.wie();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iWie = (int) this.dj.wie();
        int i4 = onExtraCallbackWithResult + 103;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return iWie;
    }

    public int sya() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iSyc = (int) this.dj.syc();
        int i5 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return iSyc;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int dj() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iDy = (int) this.dj.dy();
        int i5 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return iDy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float lud() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 == 0) {
            return ltVar.pmi();
        }
        ltVar.pmi();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String lt() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 37;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            if (this.ycx == 0) {
                int i5 = i3 + 107;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    if (!TextUtils.isEmpty(this.zb)) {
                        return this.zb;
                    }
                    return this.sya.optString(com.bytedance.sdk.component.adexpress.dj.ul.sya(com.bytedance.sdk.component.adexpress.dj.ycx()));
                }
                TextUtils.isEmpty(this.zb);
                obj.hashCode();
                throw null;
            }
            return "";
        }
        obj.hashCode();
        throw null;
    }

    public int ul() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 53;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int iYcx = ycx(this.dj.wwx());
            int i4 = onWarmupCompleted + 97;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return iYcx;
        }
        ycx(this.dj.wwx());
        throw null;
    }

    public int fby() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strThx = this.dj.thx();
        if (!TtmlNode.LEFT.equals(strThx)) {
            if (TtmlNode.CENTER.equals(strThx)) {
                return 4;
            }
            if (!TtmlNode.RIGHT.equals(strThx)) {
                return 2;
            }
            int i5 = onWarmupCompleted + 1;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                return 3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i6 % 128;
        return i6 % 2 == 0 ? 101 : 17;
    }

    public int jw() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iFby = fby();
        if (iFby == 4) {
            return 17;
        }
        if (iFby != 3) {
            return 8388611;
        }
        int i5 = onWarmupCompleted + 49;
        int i6 = i5 % 128;
        onExtraCallbackWithResult = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 43;
        onWarmupCompleted = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 30 / 0;
        }
        return 8388613;
    }

    public String jc() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.ycx;
        if (i6 != 2) {
            int i7 = i3 + 21;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            if (i6 != 13) {
                return "";
            }
        }
        return this.zb;
    }

    public String ea() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 77;
        int i5 = i4 % 128;
        onExtraCallbackWithResult = i5;
        Object obj = null;
        if (i4 % 2 == 0 ? this.ycx != 1 : this.ycx != 1) {
            int i6 = i5 + 53;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            return "";
        }
        String str = this.zb;
        int i7 = i3 + 39;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public String ok() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return this.lt;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public double ry() throws NumberFormatException {
        int i2 = 2 % 2;
        if (this.ycx != 11) {
            return -1.0d;
        }
        int i3 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        try {
            double d = Double.parseDouble(this.zb);
            if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
                int i5 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                d = (int) d;
            }
            int i7 = onWarmupCompleted + 39;
            onExtraCallbackWithResult = i7 % 128;
            if (i7 % 2 == 0) {
                return d;
            }
            throw null;
        } catch (NumberFormatException e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImD+hPFL4KKMCsHzC", "XOs5phe9e+SPX9lJ", 177);
            return -1.0d;
        }
    }

    public double xkz() {
        double dUh;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            dUh = this.dj.uh();
            int i4 = 10 / 0;
        } else {
            dUh = this.dj.uh();
        }
        int i5 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return dUh;
    }

    public float syc() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        float fEa = this.dj.ea();
        int i5 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return fEa;
    }

    public int dy() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iYcx = ycx(this.dj.hf());
        int i5 = onWarmupCompleted + 121;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return iYcx;
    }

    public float wie() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.dj.ok();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        float fOk = this.dj.ok();
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return fOk;
    }

    public int pmi() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            this.dj.tpg();
            throw null;
        }
        int iTpg = this.dj.tpg();
        int i4 = onWarmupCompleted + 41;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iTpg;
    }

    public int uh() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iVy = this.dj.vy();
        int i5 = onWarmupCompleted + 101;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return iVy;
        }
        throw null;
    }

    public boolean htf() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 17;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zLiq = this.dj.liq();
        int i5 = onExtraCallbackWithResult + 23;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
        return zLiq;
    }

    public String thx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 47;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strDv = this.dj.dv();
        int i5 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return strDv;
    }

    public void ycx(float f) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 57;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        this.dj.ycx(f);
        int i5 = onWarmupCompleted + 113;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean wwx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zSz = this.dj.sz();
        int i5 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return zSz;
    }

    public int tn() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 35;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iYi = this.dj.yi();
        int i5 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iYi;
    }

    public String dv() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 != 0) {
            return ltVar.dwi();
        }
        ltVar.dwi();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String oty() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String strNq = this.dj.nq();
        int i5 = onExtraCallbackWithResult + 59;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return strNq;
        }
        throw null;
    }

    public long hf() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        long jSpv = this.dj.spv();
        int i5 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return jSpv;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int length;
        char[] cArr2;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = IAuthTabCallback;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $10 + 85;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 31;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getSize(0), 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), ExpandableListView.getPackedPositionGroup(j) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 23139 - (ViewConfiguration.getLongPressTimeout() >> 16), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                int i11 = $11 + 75;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i13 = $10 + 65;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                            int i14 = $11 + 95;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            obj = obj2;
                        } else {
                            try {
                                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24824 - ExpandableListView.getPackedPositionGroup(0L)), 74 - ExpandableListView.getPackedPositionGroup(0L), Color.rgb(0, 0, 0) + 16785304, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                }
                                if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                                    if (objOnExtraCallback4 == null) {
                                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTapTimeout() >> 16), 30 - Color.alpha(0), 19488 - Drawable.resolveOpacity(0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                    }
                                    obj = null;
                                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                                    int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i16];
                                } else {
                                    obj = null;
                                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                        defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                        int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i17];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i18];
                                    } else {
                                        int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                        int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i19];
                                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i20];
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    } else {
                        defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                        defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    obj2 = obj;
                }
            }
            for (int i21 = 0; i21 < i2; i21++) {
                cArr4[i21] = (char) (cArr4[i21] ^ 13722);
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

    public int tru() throws Throwable {
        int i2 = 2 % 2;
        String strDwi = this.dj.dwi();
        if ("skip-with-time-skip-btn".equals(this.lud.zb()) || !(!"skip".equals(this.lud.zb())) || !(!TextUtils.equals("skip-with-countdowns-skip-btn", this.lud.zb()))) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.lud.zb()) && !"skip-with-time".equals(this.lud.zb())) {
            if (this.ycx == 10 && TextUtils.equals(this.dj.oby(), "click")) {
                return 5;
            }
            if (nzi()) {
                int i3 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (wk()) {
                    int i5 = onExtraCallbackWithResult + 29;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return 0;
                }
            }
            if (nzi()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.lud.zb())) {
                return 3;
            }
            if (!TextUtils.isEmpty(strDwi)) {
                int i7 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr = new Object[1];
                a(new char[]{4, 1, 2, 0}, (byte) (91 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3, objArr);
                if (!strDwi.equals(((String) objArr[0]).intern())) {
                    if (strDwi.equals(MediaDescription.MEDIA_TYPE_VIDEO) || (this.lud.ycx() == 7 && TextUtils.equals(strDwi, "normal"))) {
                        return (com.bytedance.sdk.component.adexpress.dj.zb() && this.lud.lud() != null && this.lud.lud().ff()) ? 11 : 4;
                    }
                    if (strDwi.equals("normal")) {
                        int i9 = onWarmupCompleted + 89;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            return 1;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (strDwi.equals("creative")) {
                        return 2;
                    }
                    if (!"slide".equals(this.dj.oby())) {
                        return 0;
                    }
                    int i10 = onExtraCallbackWithResult + 17;
                    onWarmupCompleted = i10 % 128;
                    int i11 = i10 % 2;
                    return 2;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r8.lud.zb().contains("logoad") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean nzi() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            com.bytedance.sdk.component.adexpress.dj.zb();
            throw null;
        }
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            if (!this.lud.zb().contains("logo-union") && !this.lud.zb().contains("logounion")) {
                int i4 = onWarmupCompleted + 53;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    this.lud.zb().contains("logoad");
                    throw null;
                }
            }
            return true;
        }
        if (!"logo-union".equals(this.lud.zb())) {
            int i5 = onWarmupCompleted + 111;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            if ((!"logounion".equals(this.lud.zb())) && !"logoad".equals(this.lud.zb())) {
                return false;
            }
        }
        return true;
    }

    public int bhi() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iYcx = ycx(this.dj.tn());
        int i5 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return iYcx;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public double av() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.dj.fby();
            obj.hashCode();
            throw null;
        }
        double dFby = this.dj.fby();
        int i4 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return dFby;
        }
        obj.hashCode();
        throw null;
    }

    public int rmf() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.dj.sya();
            throw null;
        }
        int iSya = this.dj.sya();
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iSya;
    }

    public int aeu() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 61;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iZb = this.dj.zb();
        int i5 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iZb;
    }

    public int xz() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.dj.lud();
            throw null;
        }
        int iLud = this.dj.lud();
        int i4 = onExtraCallbackWithResult + 111;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iLud;
        }
        obj.hashCode();
        throw null;
    }

    public int rmy() {
        int iDj;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            iDj = this.dj.dj();
            int i4 = 80 / 0;
        } else {
            iDj = this.dj.dj();
        }
        int i5 = onWarmupCompleted + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iDj;
    }

    public int kgy() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 97;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iJw = this.dj.jw();
        int i5 = onWarmupCompleted + 65;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return iJw;
        }
        throw null;
    }

    public String ifb() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String strJc = this.dj.jc();
        if (i4 != 0) {
            int i5 = 59 / 0;
        }
        return strJc;
    }

    public String yzp() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strOby = this.dj.oby();
        int i5 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return strOby;
        }
        throw null;
    }

    private boolean wk() {
        int i2 = 2 % 2;
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            int i3 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i3 % 128;
            return i3 % 2 == 0;
        }
        if ((!(!TextUtils.isEmpty(this.zb)) || !this.zb.contains("adx:")) && !ea.zb()) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static int ycx(String str) throws Throwable {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        a(new char[]{5, 6, 4, 2, 7, 3, '\b', 2, 0, 2, 13898}, (byte) (92 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 12, new Object[1]);
        if (!(!str.equals(((String) r7[0]).intern()))) {
            return 0;
        }
        if (str.charAt(0) == '#') {
            int i3 = onWarmupCompleted + 93;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (str.length() == 7) {
                int i5 = onExtraCallbackWithResult + 115;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                return Color.parseColor(str);
            }
        }
        if (str.charAt(0) == '#') {
            int i7 = onExtraCallbackWithResult + 121;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0 ? str.length() == 9 : str.length() == 44) {
                return Color.parseColor(str);
            }
        }
        if (!str.startsWith("rgba")) {
            int i8 = onExtraCallbackWithResult + 33;
            onWarmupCompleted = i8 % 128;
            int i9 = i8 % 2;
            return -16777216;
        }
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (strArrSplit != null) {
            try {
                if (strArrSplit.length == 4) {
                    int i10 = onWarmupCompleted + 59;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            } catch (NumberFormatException e) {
                com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImD+hPFL4KKMCsHzC", "T/wsmxC6ZtWNadhRgwM=", 408);
                return 0;
            }
        }
        int i12 = onExtraCallbackWithResult + 1;
        onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        return -16777216;
    }

    public static float[] zb(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (strArrSplit == null || strArrSplit.length != 4) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        int i5 = onExtraCallbackWithResult + 117;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return new float[]{Float.parseFloat(strArrSplit[0]), Float.parseFloat(strArrSplit[1]), Float.parseFloat(strArrSplit[2]), Float.parseFloat(strArrSplit[3])};
    }

    public boolean dwi() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.dj.aq();
            obj.hashCode();
            throw null;
        }
        boolean zAq = this.dj.aq();
        int i4 = onWarmupCompleted + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return zAq;
        }
        obj.hashCode();
        throw null;
    }

    public int oby() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 != 0) {
            return ltVar.uu();
        }
        ltVar.uu();
        throw null;
    }

    public int nji() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 59;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 == 0) {
            return ltVar.bjp();
        }
        ltVar.bjp();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String dc() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strYzp = this.dj.yzp();
        int i5 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return strYzp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean sz() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        boolean zJp = this.dj.jp();
        int i5 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zJp;
    }

    public int yi() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 != 0) {
            return ltVar.ul();
        }
        ltVar.ul();
        throw null;
    }

    public int xym() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 == 0) {
            return ltVar.sp();
        }
        ltVar.sp();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int rl() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            this.dj.yyc();
            throw null;
        }
        int iYyc = this.dj.yyc();
        int i4 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iYyc;
        }
        throw null;
    }

    public int zr() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iAg = this.dj.ag();
        int i5 = onExtraCallbackWithResult + 25;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return iAg;
        }
        throw null;
    }

    public int bba() {
        int iQn;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 123;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            iQn = this.dj.qn();
            int i4 = 19 / 0;
        } else {
            iQn = this.dj.qn();
        }
        int i5 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return iQn;
    }

    public boolean mp() {
        boolean zQt;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            zQt = this.dj.qt();
            int i4 = 48 / 0;
        } else {
            zQt = this.dj.qt();
        }
        int i5 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return zQt;
    }

    public String uf() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 85;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        String strAv = this.dj.av();
        int i5 = onExtraCallbackWithResult + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return strAv;
    }

    public String duz() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 125;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            this.dj.te();
            throw null;
        }
        String strTe = this.dj.te();
        int i4 = onWarmupCompleted + 103;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return strTe;
    }

    public String uz() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        onWarmupCompleted = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            this.dj.mue();
            obj.hashCode();
            throw null;
        }
        String strMue = this.dj.mue();
        int i4 = onWarmupCompleted + 69;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return strMue;
        }
        obj.hashCode();
        throw null;
    }

    public boolean lv() {
        boolean zRy;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            zRy = this.dj.ry();
            int i4 = 63 / 0;
        } else {
            zRy = this.dj.ry();
        }
        int i5 = onWarmupCompleted + 93;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return zRy;
        }
        throw null;
    }

    public boolean ui() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zAeu = this.dj.aeu();
        int i5 = onWarmupCompleted + 109;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return zAeu;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String hpv() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 11;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strRmf = this.dj.rmf();
        int i5 = onWarmupCompleted + 81;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return strRmf;
    }

    public int iq() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iXz = this.dj.xz();
        int i5 = onExtraCallbackWithResult + 75;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iXz;
    }

    public int dqs() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iRmy = this.dj.rmy();
        if (i4 != 0) {
            int i5 = 75 / 0;
        }
        return iRmy;
    }

    public double ur() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            this.dj.kgy();
            throw null;
        }
        double dKgy = this.dj.kgy();
        int i4 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return dKgy;
        }
        throw null;
    }

    public double wr() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        double dIfb = this.dj.ifb();
        int i5 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return dIfb;
    }

    public int giw() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 105;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 != 0) {
            return ltVar.nc();
        }
        ltVar.nc();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String sg() {
        String strPyn;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            strPyn = this.dj.pyn();
            int i4 = 2 / 0;
        } else {
            strPyn = this.dj.pyn();
        }
        int i5 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return strPyn;
    }

    public String bh() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 95;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strPy = this.dj.py();
        int i5 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return strPy;
        }
        throw null;
    }

    public boolean aq() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        boolean zDfk = this.dj.dfk();
        int i5 = onWarmupCompleted + 51;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zDfk;
    }

    public int bjp() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            this.dj.row();
            throw null;
        }
        int iRow = this.dj.row();
        int i4 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return iRow;
        }
        throw null;
    }

    public int uu() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int iKt = this.dj.kt();
        int i5 = onExtraCallbackWithResult + 91;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return iKt;
    }

    public int xf() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 61;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iVyl = this.dj.vyl();
        int i5 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return iVyl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean tx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 13;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        lt ltVar = this.dj;
        if (i4 != 0) {
            return ltVar.qt();
        }
        ltVar.qt();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String ufy() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 107;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        String strOty = this.dj.oty();
        int i5 = onExtraCallbackWithResult + 65;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return strOty;
    }
}
