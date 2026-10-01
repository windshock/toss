package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CompositionLocalKtExternalSyntheticLambda0;
import o.CompositionLocalKtExternalSyntheticLambda3;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lt extends lud {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] IAuthTabCallback = null;
    private static String htf = "";
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private volatile boolean thx;
    protected com.bytedance.sdk.component.adexpress.dynamic.sya.jw uh;
    private Runnable ycx;
    private Runnable zb;

    static {
        onExtraCallbackWithResult();
        int i2 = onExtraCallback + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ Drawable ycx(lt ltVar, String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 83;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Drawable drawableSya = ltVar.sya(str);
        int i5 = onWarmupCompleted + 115;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return drawableSya;
    }

    static /* synthetic */ void ycx(lt ltVar, ViewGroup viewGroup) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ltVar.ycx(viewGroup);
        if (i4 != 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean ycx(lt ltVar, boolean z) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        ltVar.thx = z;
        int i5 = onWarmupCompleted + 37;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public lt(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        int i2;
        int iZb;
        super(context, dynamicRootView, fbyVar);
        this.thx = true;
        setTag(Integer.valueOf(getClickArea()));
        String strZb = fbyVar.jc().zb();
        if ("logo-union".equals(strZb)) {
            dynamicRootView.setLogoUnionHeight(this.fby - ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, this.ok.zb() + this.ok.ycx())));
            int i3 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        if ("scoreCountWithIcon".equals(strZb)) {
            int i5 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                i2 = this.fby;
                iZb = this.ok.zb() / this.ok.ycx();
            } else {
                i2 = this.fby;
                iZb = this.ok.zb() + this.ok.ycx();
            }
            dynamicRootView.setScoreCountWithIcon(i2 - ((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, iZb)));
            int i6 = 2 % 2;
        }
    }

    private String zb(String str) {
        int i2 = 2 % 2;
        try {
            Map mapEa = this.xkz.getRenderRequest().ea();
            if (mapEa != null) {
                int i3 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (mapEa.size() > 0) {
                    return (String) mapEa.get(str);
                }
            }
            int i5 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU/HIIU=", "XOs5vA69bsKrT84=", 75);
            return null;
        }
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int i2 = 2 % 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ul, this.fby);
        int i3 = onWarmupCompleted + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return layoutParams;
    }

    private static void a(int[] iArr, int i2, Object[] objArr) {
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IAuthTabCallback;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10;
            int i7 = i6 + 23;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = i6 + 81;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i11])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 71 - ImageFormat.getBitsPerPixel(0), 8848 - (KeyEvent.getMaxKeyCode() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr4[i11] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i11++;
                    i4 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = IAuthTabCallback;
        long j = 0;
        if (iArr6 != null) {
            int i12 = $10 + 95;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i13 = 0;
            while (i13 < length) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr6[i13]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), (ViewConfiguration.getEdgeSlop() >> 16) + 72, 8848 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i13] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i13++;
                i5 = 0;
                j = 0;
            }
            iArr6 = iArr2;
        }
        int i14 = i5;
        System.arraycopy(iArr6, i14, iArr5, i14, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i14;
        int i15 = $10 + 49;
        $11 = i15 % 128;
        int i16 = i15 % 2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                int i19 = $11 + 75;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i17];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 22252), 40 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 10301 - (ViewConfiguration.getLongPressTimeout() >> 16), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i17 += 73;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i17];
                    try {
                        Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 39, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10300, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                        i17++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i20;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i22 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4034), 78 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 7398 - Color.alpha(0), 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[PHI: r3
      0x0075: PHI (r3v42 org.json.JSONObject) = (r3v41 org.json.JSONObject), (r3v46 org.json.JSONObject) binds: [B:19:0x0073, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean jw() throws Throwable {
        String strZb;
        int iWie;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        int i2 = 2 % 2;
        final View view = this.syc;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.ry.ycx(this.ok.tru()));
        String strUfy = this.ok.ufy();
        int iDy = 0;
        String strDv = null;
        if (TextUtils.isEmpty(strUfy) || (dynamicRootView = this.xkz) == null) {
            strZb = null;
        } else {
            int i3 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            if (dynamicRootView.getRenderRequest() != null && this.xkz.getRenderRequest().sya() != null) {
                int i5 = onExtraCallbackWithResult + 79;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    jSONObjectOptJSONObject = this.xkz.getRenderRequest().sya().optJSONObject("creative");
                    int i6 = 84 / 0;
                    if (jSONObjectOptJSONObject != null) {
                        strZb = ycx(jSONObjectOptJSONObject.opt(strUfy));
                    }
                } else {
                    jSONObjectOptJSONObject = this.xkz.getRenderRequest().sya().optJSONObject("creative");
                    if (jSONObjectOptJSONObject != null) {
                    }
                }
            }
        }
        if (TextUtils.isEmpty(strZb)) {
            strZb = this.ok.thx();
            int i7 = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        com.bytedance.sdk.component.adexpress.ycx.ycx.sya syaVarSya = com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().sya();
        if (syaVarSya != null) {
            iDy = syaVarSya.dy();
            iWie = syaVarSya.wie();
        } else {
            int i9 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            iWie = 0;
        }
        if (this.ok.htf()) {
            int iUh = this.ok.uh();
            String str = this.ok.zb;
            com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().lud().ycx(str).ycx(this.ul).zb(this.fby).dj(iDy).lud(iWie).ycx(zb(str)).sya(2).ycx(new sya(this.ea, iUh)).ycx(new zb(view, this));
        } else if (!TextUtils.isEmpty(strZb)) {
            int i11 = onWarmupCompleted + 57;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
            if (!strZb.startsWith("http:") && !strZb.startsWith("https:")) {
                int i13 = onExtraCallbackWithResult + 63;
                onWarmupCompleted = i13 % 128;
                if (i13 % 2 == 0) {
                    DynamicRootView dynamicRootView2 = this.xkz;
                    strDv.hashCode();
                    throw null;
                }
                DynamicRootView dynamicRootView3 = this.xkz;
                if (dynamicRootView3 != null && dynamicRootView3.getRenderRequest() != null) {
                    strDv = this.xkz.getRenderRequest().dv();
                }
                strZb = com.bytedance.sdk.component.adexpress.dynamic.lud.jw.zb(strZb, strDv);
            }
            com.bytedance.sdk.component.lud.jc jcVarSya = com.bytedance.sdk.component.adexpress.ycx.ycx.ycx.ycx().lud().ycx(strZb).ycx(this.ul).zb(this.fby).dj(iDy).lud(iWie).ycx(zb(strZb)).sya(1);
            ycx(jcVarSya);
            jcVarSya.ycx(new ycx(view, this.xkz, this.ry));
        }
        if (getBackground() == null) {
            int i14 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i14 % 128;
            int i15 = i14 % 2;
            Drawable backgroundDrawable = getBackgroundDrawable();
            if (backgroundDrawable != null) {
                view.setBackground(backgroundDrawable);
            }
        }
        if (this.ok.av() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (lt.this.ok.kgy() > 0) {
                            lt ltVar = lt.this;
                            Drawable drawableYcx = lt.ycx(ltVar, ltVar.xkz.getBgMaterialCenterCalcColor().get(Integer.valueOf(lt.this.ok.kgy())));
                            if (drawableYcx == null) {
                                lt ltVar2 = lt.this;
                                drawableYcx = ltVar2.ycx(true, ltVar2.xkz.getBgMaterialCenterCalcColor().get(Integer.valueOf(lt.this.ok.kgy())));
                            }
                            if (drawableYcx != null) {
                                view.setBackground(drawableYcx);
                                return;
                            }
                            View view2 = view;
                            lt ltVar3 = lt.this;
                            view2.setBackground(ltVar3.ycx(true, ltVar3.xkz.getBgColor()));
                        }
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU/HIIVH7Q==", "Sfsj", 168);
                    }
                }
            }, (long) (this.ok.av() * 1000.0d));
        }
        View view2 = this.syc;
        if (view2 != null) {
            int i16 = onExtraCallbackWithResult + 79;
            onWarmupCompleted = i16 % 128;
            int i17 = i16 % 2;
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.sya()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.zb()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.dj()), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.ycx()));
        }
        if (!this.dy) {
            int i18 = onExtraCallbackWithResult + 59;
            onWarmupCompleted = i18 % 128;
            int i19 = i18 % 2;
            if (this.ok.xkz() > 0.0d) {
                setShouldInvisible(true);
                view.setVisibility(4);
                setVisibility(4);
                int i20 = onExtraCallbackWithResult + 43;
                onWarmupCompleted = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        return true;
    }

    static class sya implements com.bytedance.sdk.component.lud.fby {
        private final WeakReference<Context> ycx;
        private final int zb;

        public sya(Context context, int i2) {
            this.ycx = new WeakReference<>(context);
            this.zb = i2;
        }

        public Bitmap ycx(Bitmap bitmap) {
            Context context = this.ycx.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.dj.ycx.ycx(context, bitmap, this.zb);
            }
            return null;
        }
    }

    static class zb implements com.bytedance.sdk.component.lud.dy {
        private final WeakReference<View> ycx;
        private final WeakReference<lud> zb;

        public void ycx(int i2, String str, @Nullable Throwable th) {
        }

        public zb(View view, lud ludVar) {
            this.ycx = new WeakReference<>(view);
            this.zb = new WeakReference<>(ludVar);
        }

        public void ycx(com.bytedance.sdk.component.lud.ea eaVar) {
            Object objZb;
            lud ludVar;
            View view = this.ycx.get();
            if (view == null || (objZb = eaVar.zb()) == null || eaVar.sya() == null || (ludVar = this.zb.get()) == null || !(objZb instanceof Bitmap)) {
                return;
            }
            view.setBackground(ludVar.ycx((Bitmap) objZb));
        }
    }

    static class ycx implements com.bytedance.sdk.component.lud.dy {
        private final com.bytedance.sdk.component.adexpress.dynamic.dj.fby sya;
        private final WeakReference<View> ycx;
        private final WeakReference<DynamicRootView> zb;

        public void ycx(int i2, String str, @Nullable Throwable th) {
        }

        public ycx(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
            this.ycx = new WeakReference<>(view);
            this.zb = new WeakReference<>(dynamicRootView);
            this.sya = fbyVar;
        }

        public void ycx(com.bytedance.sdk.component.lud.ea eaVar) {
            Drawable bitmapDrawable;
            View view = this.ycx.get();
            Object objZb = eaVar.zb();
            if (objZb instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objZb);
            } else if (objZb instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && CompositionLocalKtExternalSyntheticLambda0.onWarmupCompleted(objZb)) {
                    CompositionLocalKtExternalSyntheticLambda3.pG_(objZb).start();
                }
                bitmapDrawable = (Drawable) objZb;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
                DynamicRootView dynamicRootView = this.zb.get();
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().dj()) && !"splash_ad".equals(dynamicRootView.getRenderRequest().dj())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view != null) {
                view.setBackground(bitmapDrawable);
                com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar = this.sya;
                if (fbyVar == null || fbyVar.jc() == null || 6 != this.sya.jc().ycx() || view.getBackground() == null) {
                    return;
                }
                view.getBackground().setAutoMirrored(true);
            }
        }
    }

    private String ycx(Object obj) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 119;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            if (!(obj instanceof String)) {
                if (obj instanceof JSONArray) {
                    return ycx(((JSONArray) obj).opt(0));
                }
                if (!(obj instanceof JSONObject)) {
                    return null;
                }
                int i5 = i4 + 15;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                a(new int[]{-280275747, 434845594}, 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr);
                return ycx((Object) ((JSONObject) obj).optString(((String) objArr[0]).intern()));
            }
            int i7 = i4 + 49;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                return (String) obj;
            }
            int i8 = 38 / 0;
            return (String) obj;
        }
        boolean z = obj instanceof String;
        obj2.hashCode();
        throw null;
    }

    private Drawable sya(String str) {
        int i2 = 2 % 2;
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            int i3 = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            String string = "";
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                if (!jSONArray.getString(i5).startsWith("#")) {
                    if (jSONArray.getString(i5).endsWith("deg")) {
                        string = jSONArray.getString(i5);
                    }
                } else {
                    int i6 = onWarmupCompleted + 69;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        arrayList.add(jSONArray.getString(i5));
                        int i7 = 59 / 0;
                    } else {
                        arrayList.add(jSONArray.getString(i5));
                    }
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            int i8 = 0;
            while (i8 < arrayList.size()) {
                iArr[i8] = com.bytedance.sdk.component.adexpress.dynamic.dj.ul.ycx(((String) arrayList.get(i8)).substring(0, 7));
                i8++;
                int i9 = onExtraCallbackWithResult + 113;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
            }
            GradientDrawable gradientDrawableYcx = ycx(ycx(string), iArr);
            gradientDrawableYcx.setShape(0);
            gradientDrawableYcx.setCornerRadius(com.bytedance.sdk.component.adexpress.dj.ul.ycx(this.ea, this.ok.syc()));
            return gradientDrawableYcx;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU/HIIU=", "XOs5uAKobNWJS9t+iR+0LUnKP5QUvWvLhQ==", 332);
            return null;
        }
    }

    private static void ycx(com.bytedance.sdk.component.lud.jc jcVar) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            "SMARTISAN".equals(Build.BRAND);
            throw null;
        }
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            int i4 = onExtraCallbackWithResult + 41;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            jcVar.ycx(Bitmap.Config.ARGB_8888);
            int i6 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static String getBuildModel() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        try {
            htf = com.bytedance.sdk.component.utils.oty.ycx();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU/HIIU=", "XOs5txa1ZcOtRdNYgA==", 347);
            htf = Build.MODEL;
        }
        if (TextUtils.isEmpty(htf)) {
            htf = Build.MODEL;
        }
        String str = htf;
        int i5 = onExtraCallbackWithResult + 45;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        int i2 = 2 % 2;
        View view = this.syc;
        if (view == null) {
            int i3 = onWarmupCompleted + 19;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            view = this;
        }
        double dHtf = this.ry.jc().lud().htf();
        if (dHtf < 90.0d) {
            int i4 = onExtraCallbackWithResult + 75;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            if (dHtf > 0.0d) {
                com.bytedance.sdk.component.utils.jw.zb().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.2
                    @Override // java.lang.Runnable
                    public void run() {
                        lt.this.setVisibility(8);
                    }
                }, (long) (dHtf * 1000.0d));
            }
        }
        ycx(this.ry.jc().lud().uh(), view);
        if (!TextUtils.isEmpty(this.ok.dc())) {
            int i6 = onExtraCallbackWithResult + 1;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            ycx();
        }
        super.onAttachedToWindow();
    }

    private void ycx(double d, final View view) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 15;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if (d > 0.0d) {
            com.bytedance.sdk.component.utils.jw.zb().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.3
                @Override // java.lang.Runnable
                public void run() {
                    if (lt.this.ry.jc().lud().vbt() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    lt.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
        int i5 = onExtraCallbackWithResult + 89;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.ycx);
            removeCallbacks(this.zb);
            int i5 = onExtraCallbackWithResult + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61auWBWdJqhRWnLU/HIIU=", "VOAJkBe9as+FTvFPgxyXIVXqIoI=", 401);
        }
    }

    private void ycx(ViewGroup viewGroup) {
        int i2 = 2 % 2;
        if (viewGroup != null) {
            int i3 = onWarmupCompleted + 107;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                if (viewGroup.getChildCount() > 0) {
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        int i5 = onExtraCallbackWithResult + 33;
                        onWarmupCompleted = i5 % 128;
                        int i6 = i5 % 2;
                        if (viewGroup.getChildAt(i4) instanceof com.bytedance.sdk.component.adexpress.dynamic.sya.jw) {
                            viewGroup.removeViewAt(i4);
                        }
                    }
                }
            } else {
                viewGroup.getChildCount();
                throw null;
            }
        }
        int i7 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
    }

    private void ycx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 67;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        if (this.thx) {
            int iZr = this.ok.zr();
            int iBba = this.ok.bba();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = lt.this.xkz;
                    if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                        com.bytedance.sdk.component.adexpress.zb.ry renderRequest = lt.this.xkz.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.dj.jc jcVar = new com.bytedance.sdk.component.adexpress.dynamic.dj.jc();
                        jcVar.ycx(renderRequest.syc());
                        jcVar.zb(renderRequest.dy());
                        jcVar.sya(renderRequest.wie());
                        jcVar.ycx(renderRequest.pmi());
                        jcVar.zb(renderRequest.uh());
                        jcVar.sya(renderRequest.htf());
                        jcVar.dj(renderRequest.thx());
                        jcVar.lud(renderRequest.wwx());
                        lt ltVar = lt.this;
                        ltVar.uh = new com.bytedance.sdk.component.adexpress.dynamic.sya.jw(ltVar.ea, ltVar, ltVar.ok, jcVar, renderRequest);
                    } else {
                        lt ltVar2 = lt.this;
                        ltVar2.uh = new com.bytedance.sdk.component.adexpress.dynamic.sya.jw(ltVar2.ea, ltVar2, ltVar2.ok);
                    }
                    lt ltVar3 = lt.this;
                    ltVar3.zb(ltVar3.uh);
                    if (lt.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) lt.this.getParent()).setClipChildren(false);
                    }
                    lt.this.setClipChildren(false);
                    lt.this.uh.setTag(2);
                    lt ltVar4 = lt.this;
                    lt.ycx(ltVar4, ltVar4);
                    lt ltVar5 = lt.this;
                    ltVar5.addView(ltVar5.uh, new FrameLayout.LayoutParams(-1, -1));
                    lt.this.uh.sya();
                }
            };
            this.ycx = runnable;
            postDelayed(runnable, iZr * 1000);
            if (this.ok.mp()) {
                return;
            }
            int i5 = onWarmupCompleted;
            int i6 = i5 + 63;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 7 / 0;
                if (iBba >= Integer.MAX_VALUE) {
                    return;
                }
            } else if (iBba >= Integer.MAX_VALUE) {
                return;
            }
            int i8 = i5 + 33;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            if (iZr < iBba) {
                Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt.5
                    @Override // java.lang.Runnable
                    public void run() {
                        lt ltVar = lt.this;
                        if (ltVar.uh != null) {
                            lt.ycx(ltVar, false);
                            lt.this.uh.dj();
                            lt.this.uh.setVisibility(4);
                            lt ltVar2 = lt.this;
                            ltVar2.removeView(ltVar2.uh);
                        }
                    }
                };
                this.zb = runnable2;
                postDelayed(runnable2, iBba * 1000);
            }
        }
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallback = new int[]{-1107177724, -1140209111, 1249633566, -847766749, 96690511, -235189519, -1520523199, -1857810268, -1996153068, 1217191132, 819181803, 546398108, -670516873, 1388071816, -939020730, -1866234144, 1093027297, -1168904651};
    }
}
