package com.bytedance.sdk.component.adexpress.dynamic.lud;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.sdk.component.adexpress.dynamic.dj.fby;
import com.bytedance.sdk.component.adexpress.dynamic.lud.zb;
import com.bytedance.sdk.component.adexpress.zb.ry;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onNavigationEvent;
    private ycx dj;
    private fby sya;
    public com.bytedance.sdk.component.adexpress.dynamic.dj.zb ycx;
    protected zb zb;
    private static char[] onWarmupCompleted = {32738, 32737, 32736};
    private static int IAuthTabCallback = -1184333870;
    private static boolean onExtraCallbackWithResult = true;
    private static boolean onExtraCallback = true;

    static class ycx {
        float sya;
        float ycx;
        float zb;

        ycx() {
        }
    }

    public lud(double d, int i2, double d2, String str, ry ryVar) {
        this.zb = new zb(d, i2, d2, str, ryVar);
    }

    public void ycx(ycx ycxVar) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 41;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        this.dj = ycxVar;
        int i6 = i4 + 9;
        onNavigationEvent = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
    }

    public void ycx() {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 91;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            this.zb.ycx();
            int i4 = 87 / 0;
        } else {
            this.zb.ycx();
        }
        int i5 = asBinder + 71;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
    }

    public void ycx(fby fbyVar, float f, float f2) throws Throwable {
        int i2 = 2 % 2;
        if (fbyVar != null) {
            int i3 = onNavigationEvent + 107;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            this.sya = fbyVar;
        }
        fby fbyVar2 = this.sya;
        float fFby = fbyVar2.fby();
        float fJw = fbyVar2.jw();
        float f3 = TextUtils.equals(fbyVar2.jc().lud().tru(), "fixed") ? fJw : 65536.0f;
        this.zb.ycx();
        this.zb.sya(fbyVar2, fFby, f3);
        zb.sya syaVarYcx = this.zb.ycx(fbyVar2);
        com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar = new com.bytedance.sdk.component.adexpress.dynamic.dj.zb();
        zbVar.ycx = f;
        zbVar.zb = f2;
        if (syaVarYcx == null) {
            int i5 = asBinder + 23;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
        } else {
            fFby = syaVarYcx.ycx;
        }
        zbVar.sya = fFby;
        if (syaVarYcx != null) {
            int i7 = asBinder + 27;
            onNavigationEvent = i7 % 128;
            int i8 = i7 % 2;
            fJw = syaVarYcx.zb;
        }
        zbVar.dj = fJw;
        zbVar.lud = "root";
        zbVar.jw = 1280.0f;
        zbVar.lt = fbyVar2;
        fbyVar2.sya(f);
        zbVar.lt.dj(zbVar.zb);
        zbVar.lt.lud(zbVar.sya);
        zbVar.lt.lt(zbVar.dj);
        com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVarYcx = ycx(zbVar, 0.0f);
        this.ycx = zbVarYcx;
        ycx(zbVarYcx);
        int i9 = asBinder + 113;
        onNavigationEvent = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void ycx(com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.dj.zb> it;
        int i2 = 2 % 2;
        if (zbVar != null) {
            zbVar.lt.jc().zb();
            List<List<com.bytedance.sdk.component.adexpress.dynamic.dj.zb>> list = zbVar.ul;
            if (list != null && list.size() > 0) {
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.dj.zb>> it2 = list.iterator();
                while (!(!it2.hasNext())) {
                    int i3 = asBinder + 23;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                    List<com.bytedance.sdk.component.adexpress.dynamic.dj.zb> next = it2.next();
                    if (next != null) {
                        int i5 = asBinder + 73;
                        onNavigationEvent = i5 % 128;
                        int i6 = i5 % 2;
                        if (next.size() > 0) {
                            int i7 = asBinder + 67;
                            onNavigationEvent = i7 % 128;
                            if (i7 % 2 != 0) {
                                it = next.iterator();
                                int i8 = 87 / 0;
                            } else {
                                it = next.iterator();
                            }
                            while (it.hasNext()) {
                                ycx(it.next());
                            }
                        }
                    }
                }
            }
        }
        int i9 = asBinder + 5;
        onNavigationEvent = i9 % 128;
        int i10 = i9 % 2;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 85;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), Gravity.getAbsoluteGravity(0, 0) + 77, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 78, 20952 - View.resolveSize(0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback3 == null) {
            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 75 - (ViewConfiguration.getWindowTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
        if (onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.blue(0) + 63, 12213 - ((byte) KeyEvent.getModifierMetaStateMask()), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onExtraCallbackWithResult) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            String str = new String(cArr6);
            int i6 = $11 + 95;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        int i7 = $10 + 45;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 64 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 12214 - (Process.myTid() >> 22), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
            int i8 = $11 + 55;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 5 / 4;
            }
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dd A[PHI: r1
      0x01dd: PHI (r1v57 com.bytedance.sdk.component.adexpress.dynamic.lud.zb$sya) = 
      (r1v56 com.bytedance.sdk.component.adexpress.dynamic.lud.zb$sya)
      (r1v60 com.bytedance.sdk.component.adexpress.dynamic.lud.zb$sya)
     binds: [B:71:0x01db, B:68:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.component.adexpress.dynamic.dj.zb ycx(com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar, float f) throws Throwable {
        float fYcx;
        float f2;
        float fYcx2;
        int i2;
        List<List<fby>> list;
        float fYcx3;
        float fYcx4;
        float f3;
        float f4;
        float f5;
        com.bytedance.sdk.component.adexpress.dynamic.dj.jw jwVar;
        float f6;
        com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar2;
        com.bytedance.sdk.component.adexpress.dynamic.dj.jw jwVarYcx;
        fby fbyVar;
        List<fby> list2;
        com.bytedance.sdk.component.adexpress.dynamic.dj.jw jwVarYcx2;
        float f7;
        com.bytedance.sdk.component.adexpress.dynamic.dj.jw jwVar2;
        float f8;
        zb.sya syaVarYcx;
        zb.sya syaVarYcx2;
        com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar3 = zbVar;
        int i3 = 2 % 2;
        fby fbyVar2 = zbVar3.lt;
        if (fbyVar2 != null) {
            fbyVar2.thx();
            List<List<fby>> listWie = fbyVar2.wie();
            if (listWie != null && listWie.size() > 0) {
                com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud = fbyVar2.jc().lud();
                float fWie = ltVarLud.wie();
                float fDy = ltVarLud.dy();
                float fXkz = ltVarLud.xkz();
                float fSyc = ltVarLud.syc();
                float fOk = ltVarLud.ok();
                String strNji = ltVarLud.nji();
                String strDc = ltVarLud.dc();
                float f9 = zbVar3.ycx + fSyc;
                float f10 = zbVar3.zb;
                float f11 = fOk * 2.0f;
                float f12 = ((zbVar3.sya - fSyc) - fDy) - f11;
                float f13 = ((zbVar3.dj - fWie) - fXkz) - f11;
                com.bytedance.sdk.component.adexpress.dynamic.dj.jw jwVar3 = new com.bytedance.sdk.component.adexpress.dynamic.dj.jw(f9, f10 + fWie);
                if (zbVar3.ul == null) {
                    zbVar3.ul = new ArrayList();
                }
                Iterator<List<fby>> it = listWie.iterator();
                float f14 = 0.0f;
                while (it.hasNext()) {
                    zb.sya syaVarYcx3 = this.zb.ycx(it.next());
                    if (syaVarYcx3 != null) {
                        f14 += syaVarYcx3.zb;
                    }
                }
                String str = "space-around";
                String str2 = "space-between";
                if (f14 >= f13) {
                    fYcx = 0.0f;
                    f2 = fYcx;
                    fYcx2 = 0.0f;
                    jwVar3.zb += fYcx2;
                    float f15 = f;
                    i2 = 0;
                    while (i2 < listWie.size()) {
                        List<fby> list3 = listWie.get(i2);
                        i2++;
                        if (i2 >= zbVar3.ul.size()) {
                            int size = (i2 - zbVar3.ul.size()) + 1;
                            list = listWie;
                            int i4 = 0;
                            while (i4 < size) {
                                zbVar3.ul.add(new ArrayList());
                                i4++;
                                size = size;
                                f15 = f15;
                            }
                        } else {
                            list = listWie;
                        }
                        float f16 = f15;
                        Iterator<fby> it2 = list3.iterator();
                        float f17 = 0.0f;
                        while (it2.hasNext()) {
                            int i5 = onNavigationEvent + 91;
                            float f18 = f2;
                            asBinder = i5 % 128;
                            int i6 = i5 % 2;
                            fby next = it2.next();
                            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud2 = next.jc().lud();
                            Iterator<fby> it3 = it2;
                            String strBhi = ltVarLud2.bhi();
                            int iUi = ltVarLud2.ui();
                            if (!TextUtils.equals(strBhi, "flex") && iUi != 1 && iUi != 2 && (syaVarYcx2 = this.zb.ycx(next)) != null) {
                                f17 += syaVarYcx2.ycx;
                            }
                            it2 = it3;
                            f2 = f18;
                        }
                        float f19 = f2;
                        float fMax = Math.max(f12 - f17, 0.0f);
                        Iterator<fby> it4 = list3.iterator();
                        float f20 = 0.0f;
                        while (it4.hasNext()) {
                            fby next2 = it4.next();
                            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud3 = next2.jc().lud();
                            Iterator<fby> it5 = it4;
                            if (ltVarLud3.ui() != 1) {
                                int i7 = onNavigationEvent + 109;
                                asBinder = i7 % 128;
                                int i8 = i7 % 2;
                                if (ltVarLud3.ui() != 2) {
                                    int i9 = onNavigationEvent + 101;
                                    f8 = fMax;
                                    asBinder = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        syaVarYcx = this.zb.ycx(next2);
                                        int i10 = 48 / 0;
                                        if (syaVarYcx != null) {
                                            f20 += syaVarYcx.ycx;
                                        }
                                    } else {
                                        syaVarYcx = this.zb.ycx(next2);
                                        if (syaVarYcx != null) {
                                        }
                                    }
                                } else {
                                    f8 = fMax;
                                    int i11 = onNavigationEvent + 9;
                                    asBinder = i11 % 128;
                                    int i12 = i11 % 2;
                                }
                            }
                            fMax = f8;
                            it4 = it5;
                        }
                        float f21 = fMax;
                        if (f20 >= f12) {
                            fYcx3 = 0.0f;
                            fYcx4 = 0.0f;
                        } else {
                            if (TextUtils.equals(strNji, TtmlNode.CENTER)) {
                                fYcx3 = (f12 - f20) / 2.0f;
                            } else if (TextUtils.equals(strNji, "flex-end")) {
                                fYcx3 = f12 - f20;
                            } else if (TextUtils.equals(strNji, str)) {
                                fYcx3 = jc.ycx((f12 - f20) / (list3.size() + 1));
                                fYcx4 = fYcx3;
                            } else {
                                if (TextUtils.equals(strNji, str2) && list3.size() > 1) {
                                    fYcx4 = jc.ycx((f12 - f20) / (list3.size() - 1.0f));
                                    fYcx3 = 0.0f;
                                }
                                fYcx3 = 0.0f;
                            }
                            fYcx4 = 0.0f;
                        }
                        jwVar3.ycx += fYcx3;
                        Iterator<fby> it6 = list3.iterator();
                        float fMax2 = 0.0f;
                        while (it6.hasNext()) {
                            fby next3 = it6.next();
                            float f22 = this.zb.ycx(next3) != null ? this.zb.ycx(next3).zb : 0.0f;
                            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud4 = next3.jc().lud();
                            Iterator<fby> it7 = it6;
                            fMax2 = Math.max(fMax2, (ltVarLud4.ui() == 1 || ltVarLud4.ui() == 2) ? 0.0f : f22);
                            it6 = it7;
                        }
                        Iterator<fby> it8 = list3.iterator();
                        float f23 = f16;
                        while (it8.hasNext()) {
                            fby next4 = it8.next();
                            Iterator<fby> it9 = it8;
                            zb.sya syaVarYcx4 = this.zb.ycx(next4);
                            String str3 = str;
                            com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVarLud5 = next4.jc().lud();
                            float f24 = f23;
                            float fXym = ltVarLud5.xym();
                            String str4 = strNji;
                            float fBba = ltVarLud5.bba();
                            String str5 = str2;
                            float fRl = ltVarLud5.rl();
                            float f25 = f12;
                            float fZr = ltVarLud5.zr();
                            if (syaVarYcx4 == null) {
                                f3 = fYcx4;
                                f4 = 0.0f;
                            } else {
                                f3 = fYcx4;
                                f4 = syaVarYcx4.ycx;
                            }
                            if (syaVarYcx4 == null) {
                                jwVar = jwVar3;
                                f5 = 0.0f;
                            } else {
                                f5 = syaVarYcx4.zb;
                                jwVar = jwVar3;
                            }
                            fby fbyVar3 = fbyVar2;
                            float f26 = TextUtils.equals(fbyVar2.sya(), "root") ? i2 : f24;
                            int i13 = i2;
                            if (ltVarLud5.ui() == 1) {
                                f6 = f26;
                                zbVar2 = zbVar;
                                jwVarYcx = ycx(zbVar2, ltVarLud5, (f4 - fBba) - fZr, (f5 - fXym) - fRl);
                            } else {
                                f6 = f26;
                                zbVar2 = zbVar;
                                jwVarYcx = jwVar;
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.dj.jw jwVar4 = jwVarYcx;
                            if (ltVarLud5.ui() == 2) {
                                list2 = list3;
                                fbyVar = next4;
                                jwVarYcx2 = ycx(ltVarLud5, this.zb.ycx(this.sya), new zb.sya((f4 - fBba) - fZr, (f5 - fXym) - fRl));
                            } else {
                                fbyVar = next4;
                                list2 = list3;
                                jwVarYcx2 = jwVar4;
                            }
                            String strWk = ltVarLud.wk();
                            if (fMax2 > f5) {
                                int i14 = onNavigationEvent + 83;
                                asBinder = i14 % 128;
                                int i15 = i14 % 2;
                                if (TextUtils.equals(strWk, "flex-start")) {
                                    f7 = 0.0f;
                                } else if (strWk.equals(TtmlNode.CENTER)) {
                                    f7 = (fMax2 - f5) / 2.0f;
                                } else {
                                    int i16 = asBinder + 61;
                                    onNavigationEvent = i16 % 128;
                                    int i17 = i16 % 2;
                                    if (strWk.equals("flex-end")) {
                                        f7 = fMax2 - f5;
                                    }
                                }
                            }
                            com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar4 = new com.bytedance.sdk.component.adexpress.dynamic.dj.zb();
                            zbVar4.ycx = jwVarYcx2.ycx + fZr;
                            zbVar4.zb = jwVarYcx2.zb + fXym + f7;
                            zbVar4.sya = (f4 - fBba) - fZr;
                            zbVar4.dj = (f5 - fXym) - fRl;
                            zbVar4.lud = zbVar2.lud + "." + fbyVar.sya();
                            zbVar4.fby = zbVar2;
                            fby fbyVar4 = fbyVar;
                            zbVar4.lt = fbyVar4;
                            float f27 = f21;
                            zbVar4.jw = f27;
                            List<fby> list4 = list2;
                            zbVar4.jc = list4;
                            fbyVar4.sya(zbVar4.ycx);
                            zbVar4.lt.dj(zbVar4.zb);
                            zbVar4.lt.lud(zbVar4.sya);
                            zbVar4.lt.lt(zbVar4.dj);
                            float f28 = f6;
                            i2 = i13;
                            zbVar2.ul.get(i2).add(ycx(zbVar4, f28));
                            if (ltVarLud5.ui() != 1) {
                                int i18 = onNavigationEvent + 91;
                                asBinder = i18 % 128;
                                if (i18 % 2 != 0 ? ltVarLud5.ui() == 2 : ltVarLud5.ui() == 4) {
                                    jwVar2 = jwVar;
                                } else {
                                    jwVar2 = jwVar;
                                    jwVar2.ycx += f4 + f3;
                                }
                            }
                            f21 = f27;
                            f23 = f28;
                            it8 = it9;
                            str = str3;
                            strNji = str4;
                            str2 = str5;
                            f12 = f25;
                            fYcx4 = f3;
                            fbyVar2 = fbyVar3;
                            jwVar3 = jwVar2;
                            list3 = list4;
                        }
                        com.bytedance.sdk.component.adexpress.dynamic.dj.jw jwVar5 = jwVar3;
                        jwVar5.ycx = f9;
                        jwVar5.zb += fMax2 + f19;
                        zbVar3 = zbVar;
                        listWie = list;
                        f2 = f19;
                        f15 = f23;
                        fbyVar2 = fbyVar2;
                    }
                } else {
                    if (TextUtils.equals(strDc, TtmlNode.CENTER)) {
                        fYcx2 = (f13 - f14) / 2.0f;
                    } else if (TextUtils.equals(strDc, "flex-end")) {
                        fYcx2 = f13 - f14;
                    } else if (TextUtils.equals(strDc, "space-around")) {
                        int i19 = onNavigationEvent + 19;
                        asBinder = i19 % 128;
                        int i20 = i19 % 2;
                        fYcx2 = jc.ycx((f13 - f14) / (listWie.size() + 1));
                        f2 = fYcx2;
                        jwVar3.zb += fYcx2;
                        float f152 = f;
                        i2 = 0;
                        while (i2 < listWie.size()) {
                        }
                    } else if (TextUtils.equals(strDc, "space-between")) {
                        int i21 = asBinder + 81;
                        onNavigationEvent = i21 % 128;
                        int i22 = i21 % 2;
                        if (listWie.size() > 1) {
                            fYcx = jc.ycx((f13 - f14) / (listWie.size() - 1));
                        }
                        f2 = fYcx;
                        fYcx2 = 0.0f;
                        jwVar3.zb += fYcx2;
                        float f1522 = f;
                        i2 = 0;
                        while (i2 < listWie.size()) {
                        }
                    }
                    f2 = 0.0f;
                    jwVar3.zb += fYcx2;
                    float f15222 = f;
                    i2 = 0;
                    while (i2 < listWie.size()) {
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar5 = zbVar3;
        int i23 = asBinder + 5;
        onNavigationEvent = i23 % 128;
        if (i23 % 2 == 0) {
            return zbVar5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.bytedance.sdk.component.adexpress.dynamic.dj.jw ycx(com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVar, zb.sya syaVar, zb.sya syaVar2) {
        float f;
        float fMin;
        int i2 = 2 % 2;
        float fXf = ltVar.xf();
        float fUfy = ltVar.ufy();
        float fTx = ltVar.tx();
        float fNzi = ltVar.nzi();
        boolean zIq = ltVar.iq();
        boolean zDqs = ltVar.dqs();
        boolean zUr = ltVar.ur();
        boolean zWr = ltVar.wr();
        if (!zIq) {
            if (zDqs) {
                float f2 = this.dj.ycx;
                if (f2 == 0.0f) {
                    fMin = syaVar.ycx;
                } else {
                    fMin = Math.min(f2, syaVar.ycx);
                    int i3 = asBinder + 115;
                    onNavigationEvent = i3 % 128;
                    int i4 = i3 % 2;
                }
                fXf = (fMin - fTx) - syaVar2.ycx;
            } else {
                fXf = 0.0f;
            }
        }
        if (!zUr) {
            if (!zWr) {
                int i5 = onNavigationEvent + 3;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                fUfy = 0.0f;
            } else {
                int i7 = onNavigationEvent + 33;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    f = this.dj.zb;
                    if (f == 2.0f) {
                        f = syaVar.zb;
                    }
                    fUfy = (f - fNzi) - syaVar2.zb;
                } else {
                    f = this.dj.zb;
                    if (f == 0.0f) {
                    }
                    fUfy = (f - fNzi) - syaVar2.zb;
                }
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.dj.jw(fXf, fUfy);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.dj.jw ycx(com.bytedance.sdk.component.adexpress.dynamic.dj.zb zbVar, com.bytedance.sdk.component.adexpress.dynamic.dj.lt ltVar, float f, float f2) throws Throwable {
        float f3;
        float f4;
        float f5;
        float f6;
        int i2 = 2 % 2;
        float f7 = zbVar.ycx;
        float f8 = zbVar.zb;
        float fXf = ltVar.xf();
        float fUfy = ltVar.ufy();
        float fTx = ltVar.tx();
        float fNzi = ltVar.nzi();
        boolean zIq = ltVar.iq();
        boolean zDqs = ltVar.dqs();
        boolean zUr = ltVar.ur();
        boolean zWr = ltVar.wr();
        String strHpv = ltVar.hpv();
        float f9 = zbVar.sya;
        float f10 = zbVar.dj;
        Object[] objArr = new Object[1];
        a(null, null, new byte[]{-127}, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        if (TextUtils.equals(strHpv, ((String) objArr[0]).intern())) {
            if (!(true ^ zIq)) {
                int i3 = onNavigationEvent + 33;
                asBinder = i3 % 128;
                f3 = i3 % 2 == 0 ? zbVar.ycx % fXf : zbVar.ycx + fXf;
            } else if (zDqs) {
                int i4 = asBinder + 33;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                f3 = ((zbVar.ycx + f9) - fTx) - f;
                int i6 = onNavigationEvent + 97;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
            } else {
                f3 = f7;
            }
            if (zUr) {
                f6 = zbVar.zb;
                f4 = f6 + fUfy;
            } else {
                if (zWr) {
                    f5 = zbVar.zb;
                    f4 = ((f5 + f10) - fNzi) - f2;
                    int i8 = onNavigationEvent + 103;
                    asBinder = i8 % 128;
                    int i9 = i8 % 2;
                }
                f4 = f8;
            }
        } else {
            Object[] objArr2 = new Object[1];
            a(null, null, new byte[]{-126}, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            if (TextUtils.equals(strHpv, ((String) objArr2[0]).intern())) {
                f3 = zbVar.ycx + ((f9 - f) / 2.0f);
                if (zUr) {
                    f6 = zbVar.zb;
                    f4 = f6 + fUfy;
                } else if (zWr) {
                    int i10 = asBinder + 35;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    f5 = zbVar.zb;
                    f4 = ((f5 + f10) - fNzi) - f2;
                    int i82 = onNavigationEvent + 103;
                    asBinder = i82 % 128;
                    int i92 = i82 % 2;
                }
            } else {
                Object[] objArr3 = new Object[1];
                a(null, null, new byte[]{-125}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, objArr3);
                if (TextUtils.equals(strHpv, ((String) objArr3[0]).intern())) {
                    f4 = zbVar.zb + ((f10 - f2) / 2.0f);
                    f3 = !(zIq ^ true) ? zbVar.ycx + fXf : true ^ zDqs ? f7 : ((zbVar.ycx + f9) - fTx) - f;
                } else if (TextUtils.equals(strHpv, "3")) {
                    int i12 = asBinder + 95;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    f3 = zbVar.ycx + ((f9 - f) / 2.0f);
                    f4 = zbVar.zb + ((f10 - f2) / 2.0f);
                } else {
                    f3 = f7;
                }
            }
            f4 = f8;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.dj.jw(f3, f4);
    }
}
