package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class xz extends lt implements com.bytedance.sdk.component.adexpress.dynamic.lud {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int[] onNavigationEvent = {1908692527, -1461929741, -481507284, -1779253100, -1582320969, 921889676, 984920131, 1186441150, -1004480025, -1593369426, 949832155, 405363669, -857928284, 448151697, -287834053, -643529910, 131708528, 301932256};
    private static int onWarmupCompleted = 1;
    boolean htf;
    TextView ycx;
    FrameLayout zb;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lud
    public boolean lud() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 17;
        onWarmupCompleted = i3 % 128;
        return i3 % 2 != 0;
    }

    public xz(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVar) {
        super(context, dynamicRootView, fbyVar);
        this.htf = false;
        View view = new View(context);
        this.syc = view;
        view.setTag(Integer.valueOf(getClickArea()));
        this.ycx = new TextView(context);
        this.zb = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, 40.0f), (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(context, 15.0f));
        layoutParams.gravity = 8388693;
        layoutParams.rightMargin = 20;
        layoutParams.bottomMargin = 20;
        this.ycx.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(25.0f);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.ycx.setBackground(gradientDrawable);
        this.ycx.setTextSize(10.0f);
        this.ycx.setGravity(17);
        this.ycx.setTextColor(-1);
        this.ycx.setVisibility(8);
        if (com.bytedance.sdk.component.adexpress.dj.zb()) {
            addView(this.zb, new FrameLayout.LayoutParams(-1, -1));
            int i2 = 2 % 2;
        }
        addView(this.ycx);
        addView(this.syc, getWidgetLayoutParams());
        if (!com.bytedance.sdk.component.adexpress.dj.zb()) {
            int i3 = onExtraCallbackWithResult + 69;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                addView(this.zb, getWidgetLayoutParams());
            } else {
                addView(this.zb, getWidgetLayoutParams());
                throw null;
            }
        }
        dynamicRootView.videoView = this.zb;
        dynamicRootView.setVideoListener(this);
        int i4 = onExtraCallbackWithResult + 27;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.lt, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rmy
    public boolean jw() throws Throwable {
        int i2 = 2 % 2;
        super.jw();
        double dUl = 0.0d;
        double dDj = 0.0d;
        for (com.bytedance.sdk.component.adexpress.dynamic.dj.fby fbyVarOk = this.ry; fbyVarOk != null; fbyVarOk = fbyVarOk.ok()) {
            int i3 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                double dLt = fbyVarOk.lt();
                dDj = (dDj % dLt) / fbyVarOk.dj();
                dUl = (dUl % fbyVarOk.ul()) / fbyVarOk.lud();
            } else {
                double dLt2 = fbyVarOk.lt();
                dDj = (dDj + dLt2) - fbyVarOk.dj();
                dUl = (dUl + fbyVarOk.ul()) - fbyVarOk.lud();
            }
        }
        try {
            float f = (float) dDj;
            int iYcx = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), f);
            int iYcx2 = (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), f + this.lud);
            if (com.bytedance.sdk.component.adexpress.dj.zb.ycx(getContext())) {
                int dynamicWidth = ((pmi) this.xkz.getChildAt(0)).getDynamicWidth();
                int i4 = dynamicWidth - iYcx;
                int i5 = dynamicWidth - iYcx2;
                int i6 = onExtraCallbackWithResult + 89;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                iYcx2 = i4;
                iYcx = i5;
            }
            if ("open_ad".equals(this.xkz.getRenderRequest().dj())) {
                this.xkz.videoView = this.zb;
            } else {
                float f2 = (float) dUl;
                ((pmi) this.xkz.getChildAt(0)).ycx.ycx(iYcx, (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), f2), iYcx2, (int) com.bytedance.sdk.component.adexpress.dj.ul.ycx(getContext(), f2 + this.lt));
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61avGJTtJSuhilPw==", "Wv49mRqSaNOJXNJumAisLQ==", 93);
        }
        this.xkz.updateRenderInfoForVideo(dDj, dUl, this.lud, this.lt, this.ok.syc());
        int i8 = onWarmupCompleted + 45;
        onExtraCallbackWithResult = i8 % 128;
        if (i8 % 2 == 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lud
    public void setTimeUpdate(int i2) throws Throwable {
        String string;
        String string2;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 119;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        if (!this.ry.jc().lud().yw() || i2 <= 0 || this.htf) {
            this.htf = true;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                sya(getChildAt(i6));
            }
            this.ycx.setVisibility(8);
            return;
        }
        int i7 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0 ? i2 < 60 : i2 < 29) {
            string = "00";
        } else {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            b(new int[]{577548757, -1360932716}, AndroidCharacter.getMirror('0') - '/', objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(i2 / 60);
            string = sb.toString();
        }
        String str = string + ":";
        int i8 = i2 % 60;
        if (i8 > 9) {
            string2 = str + i8;
            int i9 = onWarmupCompleted + 59;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            Object[] objArr2 = new Object[1];
            b(new int[]{577548757, -1360932716}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(i8);
            string2 = sb2.toString();
            int i11 = onWarmupCompleted + 87;
            onExtraCallbackWithResult = i11 % 128;
            int i12 = i11 % 2;
        }
        this.ycx.setText(string2);
        this.ycx.setVisibility(0);
    }

    private void sya(View view) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 117;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = 0;
        if (i3 % 2 == 0) {
            int i6 = 50 / 0;
            if (view == this.ycx) {
                return;
            }
        } else if (view == this.ycx) {
            return;
        }
        int i7 = i4 + 1;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 35 / 0;
            if (view == ((lt) this).uh) {
                return;
            }
        } else if (view == ((lt) this).uh) {
            return;
        }
        try {
            if (((Integer) view.getTag(com.bytedance.sdk.component.adexpress.dynamic.ycx.lt)).intValue() == 1) {
                return;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.oty.sya.ycx(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6QxVe8gnACqYMKX", "f/cjlA61avGJTtJSuhilPw==", "X+EbnBC1a8uF", 141);
        }
        view.setVisibility(0);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i5 >= viewGroup.getChildCount()) {
                return;
            }
            sya(viewGroup.getChildAt(i5));
            i5++;
            int i9 = onExtraCallbackWithResult + 65;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
        }
    }

    private static void b(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onNavigationEvent;
        int i6 = -1469660336;
        if (iArr3 != null) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i8 = $10 + 71;
                $11 = i8 % 128;
                if (i8 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (Process.myPid() >> 22) + 72, TextUtils.getOffsetBefore("", 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i3 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 72 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 8847 - TextUtils.lastIndexOf("", '0'), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i3++;
                }
                i4 = 2;
            }
            int i9 = $10 + 83;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        float f = 0.0f;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 71 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i11++;
                i6 = -1469660336;
                f = 0.0f;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 37;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Gravity.getAbsoluteGravity(0, 0) + 22252), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 38, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i12++;
            }
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i16;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4032), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 77, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.lud
    public void ycx() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.ycx.setVisibility(8);
        int i5 = onWarmupCompleted + 3;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
