package com.bytedance.sdk.component.adexpress.dynamic.sya;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.ui.DefaultViewSpecProvider;
import com.bytedance.sdk.component.adexpress.lt.oty;
import com.google.android.material.button.MaterialButton;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class jw extends FrameLayout implements fby {
    private View dj;
    private com.bytedance.sdk.component.adexpress.dynamic.dj.jc ea;
    private View.OnTouchListener fby;
    private boolean jc;
    private int jw;
    private String lt;
    private ul lud;
    private com.bytedance.sdk.component.adexpress.zb.ry ok;
    private com.bytedance.sdk.component.adexpress.dynamic.dj.ul sya;
    private com.bytedance.sdk.component.adexpress.lt.wie ul;
    private Context ycx;
    private com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud zb;
    private static final byte[] $$a = {106, 40, -98, -117};
    private static final int $$b = 82;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onNavigationEvent = 0;
    private static int onExtraCallback = 1;
    private static long onWarmupCompleted = 7798559133331975163L;
    private static int IAuthTabCallback = -1776194565;
    private static char onExtraCallbackWithResult = 46936;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, int i3, int i4) {
        int i5;
        int i6 = 110 - i3;
        int i7 = i2 * 3;
        byte[] bArr = $$a;
        int i8 = 3 - (i4 * 2);
        byte[] bArr2 = new byte[1 - i7];
        int i9 = 0 - i7;
        if (bArr == null) {
            int i10 = i6;
            i5 = 0;
            i6 = i9;
            i6 += i10;
            bArr2[i5] = (byte) i6;
            if (i5 == i9) {
                return new String(bArr2, 0);
            }
            i8++;
            i10 = bArr[i8];
            i5++;
            i6 += i10;
            bArr2[i5] = (byte) i6;
            if (i5 == i9) {
            }
        } else {
            i5 = 0;
            bArr2[i5] = (byte) i6;
            if (i5 == i9) {
            }
        }
    }

    static /* synthetic */ com.bytedance.sdk.component.adexpress.lt.wie ycx(jw jwVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 77;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        com.bytedance.sdk.component.adexpress.lt.wie wieVar = jwVar.ul;
        if (i4 != 0) {
            return wieVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void zb(jw jwVar) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 87;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        jwVar.jw();
        if (i4 != 0) {
            int i5 = 96 / 0;
        }
    }

    public jw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar) throws Throwable {
        super(context);
        this.ycx = context;
        this.zb = ludVar;
        this.sya = ulVar;
        ul();
    }

    public jw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud ludVar, com.bytedance.sdk.component.adexpress.dynamic.dj.ul ulVar, com.bytedance.sdk.component.adexpress.dynamic.dj.jc jcVar, com.bytedance.sdk.component.adexpress.zb.ry ryVar) throws Throwable {
        super(context);
        this.ycx = context;
        this.zb = ludVar;
        this.sya = ulVar;
        this.ea = jcVar;
        this.ok = ryVar;
        ul();
    }

    private void ul() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 111;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.lt = this.sya.dc();
        this.jw = this.sya.xym();
        this.jc = this.sya.lv();
        ul ulVarYcx = jc.ycx(this.ycx, this.zb, this.sya, this.ea, this.ok);
        this.lud = ulVarYcx;
        if (ulVarYcx != null) {
            int i5 = onNavigationEvent + 57;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            this.dj = ulVarYcx.sya();
            if (this.sya.sz()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.lt, "6")) {
                int i7 = onExtraCallback + 27;
                onNavigationEvent = i7 % 128;
                if (i7 % 2 != 0) {
                    this.sya.ui();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (!this.sya.ui() || TextUtils.isEmpty(this.sya.hpv())) {
                    this.ul = new com.bytedance.sdk.component.adexpress.lt.wie(this.ycx, Color.parseColor("#99000000"));
                    int i8 = onExtraCallback + 75;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    this.ul = new com.bytedance.sdk.component.adexpress.lt.wie(this.ycx, com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(this.sya.hpv()));
                }
                FrameLayout frameLayout = new FrameLayout(this.ycx);
                frameLayout.addView(this.ul, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.sya.jw.1
                    @Override // java.lang.Runnable
                    public void run() {
                        jw.ycx(jw.this).zb();
                    }
                });
            }
            if (ycx(this.lt) && com.bytedance.sdk.component.adexpress.dj.zb()) {
                int color = Color.parseColor("#99000000");
                if (this.sya.ui() && !TextUtils.isEmpty(this.sya.hpv())) {
                    try {
                        color = com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(this.sya.hpv());
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "cuA5kBG9atO2Q9JKrx6uPFrnI5AR", "UuAkgTW1bNA=", 110);
                    }
                }
                View view = new View(this.ycx);
                view.setBackgroundColor(color);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.lud.sya());
            ycx(this.lud.sya());
            setVisibility(0);
        }
    }

    private static void a(char c, int i2, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
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
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + 43, 1452 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                if (objOnExtraCallback2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 + 1);
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49123), TextUtils.indexOf((CharSequence) "", '0') + 45, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1494, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 23973), Color.alpha(0) + 50, AndroidCharacter.getMirror('0') + 22891, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 45848), Color.alpha(0) + 29, (Process.myPid() >> 22) + 12577, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onExtraCallbackWithResult ^ 7798559133331975163L)));
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 39;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean ycx(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 78 / 0;
            if (!TextUtils.equals(str, "24")) {
                if (!TextUtils.equals(str, "23")) {
                    int i5 = onExtraCallback + 1;
                    onNavigationEvent = i5 % 128;
                    if (i5 % 2 == 0) {
                        if (!TextUtils.equals(str, "25") && !TextUtils.equals(str, "22")) {
                            int i6 = onNavigationEvent + 29;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Object[] objArr = new Object[1];
                            a((char) (25198 - ImageFormat.getBitsPerPixel(0)), Color.green(0) + 432132462, new char[]{34526}, new char[]{0, 0, 0, 0}, new char[]{28335, 49617, 28441, 7266}, objArr);
                            if (!TextUtils.equals(str, ((String) objArr[0]).intern())) {
                                int i8 = onNavigationEvent + 57;
                                onExtraCallback = i8 % 128;
                                int i9 = i8 % 2;
                                return false;
                            }
                        }
                    } else {
                        TextUtils.equals(str, "25");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        } else if (!TextUtils.equals(str, "24")) {
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 75;
        onNavigationEvent = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            if (!(this.fby instanceof com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.sya)) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            int i5 = i3 + 17;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        boolean z = this.fby instanceof com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.sya;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void ycx(ViewGroup viewGroup) throws Throwable {
        int i2 = 2 % 2;
        if (this.dj != null) {
            String str = this.lt;
            int iHashCode = str.hashCode();
            char c = 7;
            if (iHashCode != 1598) {
                if (iHashCode != 1607) {
                    switch (iHashCode) {
                        case 48:
                            Object[] objArr = new Object[1];
                            a((char) (7936 - (ViewConfiguration.getTapTimeout() >> 16)), (-459604541) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{48747}, new char[]{0, 0, 0, 0}, new char[]{50006, 39677, 228, 24095}, objArr);
                            if (!str.equals(((String) objArr[0]).intern())) {
                                c = 65535;
                                break;
                            } else {
                                c = 0;
                                break;
                            }
                        case 49:
                            Object[] objArr2 = new Object[1];
                            a((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 25199), 432132462 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{34526}, new char[]{0, 0, 0, 0}, new char[]{28335, 49617, 28441, 7266}, objArr2);
                            if (str.equals(((String) objArr2[0]).intern())) {
                                c = 1;
                                break;
                            }
                            break;
                        case 50:
                            Object[] objArr3 = new Object[1];
                            a((char) (43848 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Color.argb(0, 0, 0, 0) - 1313733906, new char[]{9097}, new char[]{0, 0, 0, 0}, new char[]{61101, 45570, 18609, 29611}, objArr3);
                            if (str.equals(((String) objArr3[0]).intern())) {
                                c = 2;
                                break;
                            }
                            break;
                        default:
                            switch (iHashCode) {
                                case 53:
                                    if (str.equals("5")) {
                                        int i3 = onExtraCallback + 97;
                                        onNavigationEvent = i3 % 128;
                                        int i4 = i3 % 2;
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case DefaultViewSpecProvider.TAB_BAR_HEIGHT_DP /* 54 */:
                                    if (str.equals("6")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 55:
                                    if (str.equals("7")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                                case 56:
                                    if (str.equals("8")) {
                                        c = 6;
                                        break;
                                    }
                                    break;
                                case 57:
                                    if (!str.equals("9")) {
                                    }
                                    break;
                                default:
                                    switch (iHashCode) {
                                        case 1567:
                                            if (str.equals("10")) {
                                                c = '\b';
                                                break;
                                            }
                                            break;
                                        case 1568:
                                            if (str.equals("11")) {
                                                c = '\t';
                                                break;
                                            }
                                            break;
                                        case 1569:
                                            if (str.equals("12")) {
                                                c = '\n';
                                                break;
                                            }
                                            break;
                                        case 1570:
                                            if (str.equals("13")) {
                                                int i5 = onExtraCallback + 79;
                                                onNavigationEvent = i5 % 128;
                                                int i6 = i5 % 2;
                                                c = 11;
                                                break;
                                            }
                                            break;
                                        case 1571:
                                            if (str.equals("14")) {
                                                c = '\f';
                                                break;
                                            }
                                            break;
                                        default:
                                            switch (iHashCode) {
                                                case 1573:
                                                    if (str.equals("16")) {
                                                        int i7 = onExtraCallback + 115;
                                                        onNavigationEvent = i7 % 128;
                                                        int i8 = i7 % 2;
                                                        c = '\r';
                                                        break;
                                                    }
                                                    break;
                                                case 1574:
                                                    if (str.equals("17")) {
                                                        c = 14;
                                                        break;
                                                    }
                                                    break;
                                                case 1575:
                                                    if (str.equals("18")) {
                                                        c = 15;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    switch (iHashCode) {
                                                        case 1600:
                                                            if (!(!str.equals("22"))) {
                                                                c = 17;
                                                                break;
                                                            }
                                                            break;
                                                        case 1601:
                                                            if (str.equals("23")) {
                                                                c = 18;
                                                                break;
                                                            }
                                                            break;
                                                        case 1602:
                                                            if (str.equals("24")) {
                                                                c = 19;
                                                                break;
                                                            }
                                                            break;
                                                        case 1603:
                                                            if (str.equals("25")) {
                                                                int i9 = onExtraCallback + 41;
                                                                onNavigationEvent = i9 % 128;
                                                                int i10 = i9 % 2;
                                                                c = 20;
                                                                break;
                                                            }
                                                            break;
                                                    }
                                            }
                                    }
                            }
                    }
                } else if (str.equals("29")) {
                    int i11 = onNavigationEvent + 93;
                    onExtraCallback = i11 % 128;
                    int i12 = i11 % 2;
                    c = 21;
                }
            } else if (str.equals("20")) {
                int i13 = onExtraCallback + 7;
                onNavigationEvent = i13 % 128;
                int i14 = i13 % 2;
                c = 16;
            }
            Object obj = null;
            switch (c) {
                case 0:
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.lud(this, this.jw);
                    setBackgroundColor(Color.parseColor("#80000000"));
                    break;
                case 1:
                case 4:
                    if (!this.sya.ui() || TextUtils.isEmpty(this.sya.hpv())) {
                        setBackgroundColor(Color.parseColor("#80000000"));
                    }
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.lt(this);
                    break;
                case 2:
                case 5:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.zb(this, this);
                    break;
                case 3:
                    if (!this.sya.ui() || TextUtils.isEmpty(this.sya.hpv())) {
                        setBackgroundColor(Color.parseColor("#80000000"));
                    } else {
                        setBackgroundColor(com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(this.sya.hpv()));
                    }
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.sya(this);
                    this.dj.setTag(2);
                    break;
                case 6:
                case '\t':
                    this.zb.setClipChildren(false);
                    this.zb.setClipChildren(false);
                    ViewGroup viewGroup2 = (ViewGroup) this.zb.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.setClipChildren(false);
                        viewGroup2.setClipToPadding(false);
                    }
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.lt(this);
                    break;
                case 7:
                case 14:
                    this.dj.setTag(2);
                    break;
                case '\b':
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.dj(this, this.jw, this.jc);
                    break;
                case '\n':
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.sya(this);
                    this.dj.setTag(2);
                    break;
                case 11:
                case 19:
                    if (!this.lt.equals("24") || !com.bytedance.sdk.component.adexpress.dj.zb()) {
                        this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.lud(this, this.jw);
                        break;
                    } else {
                        this.zb.setClipChildren(false);
                        this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.lt(this);
                        break;
                    }
                    break;
                case '\f':
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.zb(this, this);
                    break;
                case '\r':
                    View view = this.dj;
                    if (view != null && (view instanceof com.bytedance.sdk.component.adexpress.lt.pmi) && ((com.bytedance.sdk.component.adexpress.lt.pmi) view).getShakeLayout() != null) {
                        ((com.bytedance.sdk.component.adexpress.lt.pmi) this.dj).getShakeLayout().setTag(2);
                    }
                    this.dj.setTag(2);
                    break;
                case 15:
                    View view2 = this.dj;
                    if (view2 != null && (view2 instanceof oty)) {
                        int i15 = onNavigationEvent + 43;
                        onExtraCallback = i15 % 128;
                        int i16 = i15 % 2;
                        if (((oty) view2).getWriggleLayout() != null) {
                            int i17 = onExtraCallback + 5;
                            onNavigationEvent = i17 % 128;
                            if (i17 % 2 != 0) {
                                ((oty) this.dj).getWriggleLayout().setTag(2);
                                throw null;
                            }
                            ((oty) this.dj).getWriggleLayout().setTag(2);
                        }
                    }
                    this.dj.setTag(2);
                    break;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.ycx(this, this.jw, viewGroup);
                    break;
                case 17:
                    if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
                        this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.ul(this, this.jw, viewGroup);
                        break;
                    } else {
                        this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.fby(this, this.jc);
                        break;
                    }
                case 18:
                    if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                        this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.lt(this);
                        break;
                    }
                    break;
                case 20:
                    if (com.bytedance.sdk.component.adexpress.dj.zb()) {
                        this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.fby(this, this.jc);
                        break;
                    }
                    break;
                case 21:
                    View view3 = this.dj;
                    if (view3 != null) {
                        int i18 = onExtraCallback + 23;
                        onNavigationEvent = i18 % 128;
                        if (i18 % 2 != 0) {
                            boolean z = view3 instanceof com.bytedance.sdk.component.adexpress.lt.lt;
                            obj.hashCode();
                            throw null;
                        }
                        if ((view3 instanceof com.bytedance.sdk.component.adexpress.lt.lt) && ((com.bytedance.sdk.component.adexpress.lt.lt) view3).getShakeView() != null) {
                            ((com.bytedance.sdk.component.adexpress.lt.lt) this.dj).getShakeView().setTag(2);
                        }
                    }
                    this.fby = new com.bytedance.sdk.component.adexpress.dynamic.sya.ycx.lud(this, this.jw);
                    break;
            }
            View.OnTouchListener onTouchListener = this.fby;
            if (onTouchListener != null) {
                int i19 = onExtraCallback + 115;
                onNavigationEvent = i19 % 128;
                if (i19 % 2 != 0) {
                    setOnTouchListener(onTouchListener);
                    throw null;
                }
                setOnTouchListener(onTouchListener);
            }
            if (fby()) {
                this.dj.setTag(2);
                setOnClickListener((View.OnClickListener) this.zb.getDynamicClickListener());
            }
        }
    }

    private boolean fby() {
        int i2 = 2 % 2;
        if (this.sya.lv()) {
            return false;
        }
        if (TextUtils.equals("9", this.lt)) {
            int i3 = onExtraCallback + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!TextUtils.equals("16", this.lt)) {
            if (TextUtils.equals("17", this.lt)) {
                int i5 = onExtraCallback + 17;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            if ((!TextUtils.equals("18", this.lt)) && (!TextUtils.equals("20", this.lt))) {
                if (!TextUtils.equals("29", this.lt)) {
                    return !TextUtils.equals("10", this.lt);
                }
                int i7 = onNavigationEvent + 45;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
        }
        return false;
    }

    public void sya() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 37;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        ul ulVar = this.lud;
        if (ulVar != null) {
            int i6 = i4 + 55;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            ulVar.ycx();
            if (i7 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public void dj() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 111;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            ul ulVar = this.lud;
            if (ulVar != null) {
                ulVar.zb();
                int i4 = onNavigationEvent + 125;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 3;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            super.onDetachedFromWindow();
            throw null;
        }
        super.onDetachedFromWindow();
        try {
            ul ulVar = this.lud;
            if (ulVar == null) {
                int i4 = onNavigationEvent + 53;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            int i6 = onExtraCallback + 63;
            onNavigationEvent = i6 % 128;
            if (i6 % 2 == 0) {
                ulVar.zb();
            } else {
                ulVar.zb();
                int i7 = 88 / 0;
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6kmT+s/lACo", "cuA5kBG9atO2Q9JKrx6uPFrnI5AR", "VOAJkBe9as+FTvFPgxyXIVXqIoI=", 302);
            e.getMessage();
        }
    }

    public void lud() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent;
        int i4 = i3 + 21;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
            if (this.dj == null) {
                return;
            }
        } else if (this.dj == null) {
            return;
        }
        int i6 = i3 + 103;
        onExtraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            String str = this.lt;
            Object[] objArr = new Object[1];
            a((char) (43847 % (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Process.getGidForName("") - 1313733905, new char[]{9097}, new char[]{0, 0, 0, 0}, new char[]{61101, 45570, 18609, 29611}, objArr);
            if (!TextUtils.equals(str, ((String) objArr[0]).intern())) {
                return;
            }
        } else {
            String str2 = this.lt;
            Object[] objArr2 = new Object[1];
            a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 43847), Process.getGidForName("") - 1313733905, new char[]{9097}, new char[]{0, 0, 0, 0}, new char[]{61101, 45570, 18609, 29611}, objArr2);
            if (!TextUtils.equals(str2, ((String) objArr2[0]).intern())) {
                return;
            }
        }
        View view = this.dj;
        if (!(view instanceof com.bytedance.sdk.component.adexpress.lt.sya)) {
            return;
        }
        ((com.bytedance.sdk.component.adexpress.lt.sya) view).sya();
        int i7 = onNavigationEvent + 123;
        onExtraCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public void lt() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 47;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (this.dj != null) {
            String str = this.lt;
            Object[] objArr = new Object[1];
            a((char) (Color.red(0) + 43848), (-1313733906) - (Process.myPid() >> 22), new char[]{9097}, new char[]{0, 0, 0, 0}, new char[]{61101, 45570, 18609, 29611}, objArr);
            if (TextUtils.equals(str, ((String) objArr[0]).intern())) {
                View view = this.dj;
                if (view instanceof com.bytedance.sdk.component.adexpress.lt.sya) {
                    ((com.bytedance.sdk.component.adexpress.lt.sya) view).dj();
                }
            }
        }
        int i5 = onNavigationEvent + 91;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.fby
    public void ycx() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 97;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!(!TextUtils.equals(this.lt, "6"))) {
            com.bytedance.sdk.component.adexpress.lt.wie wieVar = this.ul;
            if (wieVar != null) {
                wieVar.sya();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.sya.jw.2
                    @Override // java.lang.Runnable
                    public void run() {
                        jw.zb(jw.this);
                    }
                }, 300L);
                return;
            }
            return;
        }
        Object obj = null;
        if (!TextUtils.equals(this.lt, "20")) {
            jw();
            int i5 = onNavigationEvent + 103;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            return;
        }
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.sya.jw.3
            @Override // java.lang.Runnable
            public void run() {
                jw.zb(jw.this);
            }
        }, 400L);
        int i6 = onNavigationEvent + 23;
        onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sya.fby
    public void zb() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            if (!fby()) {
                return;
            }
            setOnClickListener((View.OnClickListener) this.zb.getDynamicClickListener());
            performClick();
            if (this.sya.tx()) {
                return;
            }
            int i4 = onExtraCallback + 1;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            setVisibility(8);
            return;
        }
        fby();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void jw() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        int i4 = i3 % 128;
        onNavigationEvent = i4;
        int i5 = i3 % 2;
        if (this.fby != null) {
            int i6 = i4 + 35;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                setOnClickListener((View.OnClickListener) this.zb.getDynamicClickListener());
                performClick();
                if (!(!this.sya.tx())) {
                    return;
                }
                setVisibility(8);
                return;
            }
            setOnClickListener((View.OnClickListener) this.zb.getDynamicClickListener());
            performClick();
            this.sya.tx();
            throw null;
        }
    }
}
