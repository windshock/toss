package com.bytedance.adsdk.ugeno.ycx.ycx;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ycx {
    private String sya;
    protected JSONObject ycx;
    protected com.bytedance.adsdk.ugeno.zb.sya zb;
    private static final byte[] $$a = {11, -55, -20, -91};
    private static final int $$b = 22;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int IAuthTabCallback = 478308947;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 105 - (i2 * 2);
        byte[] bArr = $$a;
        int i7 = i3 + 4;
        int i8 = (s * 2) + 1;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i8;
            int i10 = i7;
            i5 = 0;
            int i11 = i7 + (-i9);
            i4 = i5;
            i7 = i10;
            i6 = i11;
            i5 = i4 + 1;
            int i12 = i7 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i12];
            i7 = i6;
            i10 = i12;
            int i112 = i7 + (-i9);
            i4 = i5;
            i7 = i10;
            i6 = i112;
            i5 = i4 + 1;
            int i122 = i7 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            int i1222 = i7 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
            }
        }
    }

    public abstract List<PropertyValuesHolder> sya();

    public abstract void ycx(int i2, int i3);

    public abstract void ycx(Canvas canvas);

    public abstract void zb();

    public abstract void zb(Canvas canvas);

    public ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, JSONObject jSONObject) throws Throwable {
        this.ycx = jSONObject;
        this.zb = syaVar;
        ycx();
    }

    public void ycx() throws Throwable {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObject = this.ycx;
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 4, 2 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{'\t', 4, 65525, 0}, true, 234 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
        this.sya = jSONObject.optString(((String) objArr[0]).intern());
        zb();
        int i5 = onExtraCallbackWithResult + 37;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String dj() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 91;
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        String str = this.sya;
        int i6 = i4 + 19;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 93 / 0;
        }
        return str;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.ycx.ycx.ycx$ycx, reason: collision with other inner class name */
    public static class C0009ycx {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private static char[] onNavigationEvent = {64970, 64982, 64967, 64963};
        private static char onExtraCallbackWithResult = 51243;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ycx ycx(com.bytedance.adsdk.ugeno.zb.sya syaVar, JSONObject jSONObject) throws Throwable {
            int i2 = 2 % 2;
            if (syaVar == null) {
                return null;
            }
            char c = 0;
            if (jSONObject == null) {
                int i3 = IAuthTabCallback + 15;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                int i4 = 79 / 0;
                return null;
            }
            Object[] objArr = new Object[1];
            a(new char[]{0, 2, 1, 3}, (byte) (83 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 4, objArr);
            String strOptString = jSONObject.optString(((String) objArr[0]).intern());
            switch (strOptString.hashCode()) {
                case -1881872635:
                    if (!strOptString.equals("stretch")) {
                        c = 65535;
                        break;
                    } else {
                        int i5 = onWarmupCompleted + 97;
                        IAuthTabCallback = i5 % 128;
                        if (i5 % 2 != 0) {
                            c = 1;
                            break;
                        }
                    }
                    break;
                case -930826704:
                    if (!strOptString.equals("ripple")) {
                    }
                    break;
                case -920177947:
                    if (strOptString.equals("rub_in")) {
                        int i6 = IAuthTabCallback + 21;
                        onWarmupCompleted = i6 % 128;
                        if (i6 % 2 != 0) {
                            c = 2;
                            break;
                        } else {
                            c = 3;
                            break;
                        }
                    }
                    break;
                case 109407595:
                    if (strOptString.equals("shine")) {
                        int i7 = IAuthTabCallback + 75;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return new lud(syaVar, jSONObject);
            }
            if (c == 1) {
                return new zb(syaVar, jSONObject);
            }
            if (c == 2) {
                return new sya(syaVar, jSONObject);
            }
            if (c != 3) {
                return null;
            }
            return new dj(syaVar, jSONObject);
        }

        private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
            int i3;
            int length;
            char[] cArr2;
            int i4;
            int i5 = 2;
            int i6 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
            char[] cArr3 = onNavigationEvent;
            long j = 0;
            if (cArr3 != null) {
                int i7 = $11 + 5;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i4 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i4 = 0;
                }
                while (i4 < length) {
                    int i8 = $10 + 117;
                    $11 = i8 % 128;
                    if (i8 % i5 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 23139 - (ViewConfiguration.getWindowTouchSlop() >> 8), -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr2[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                            i4 >>= 1;
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
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 26, (Process.myPid() >> 22) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                            }
                            cArr2[i4] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            i4++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i5 = 2;
                }
                cArr3 = cArr2;
            }
            Object[] objArr4 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 26 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23138, -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i2];
            if (i2 % 2 != 0) {
                int i9 = $10 + 101;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i3 = i2 - 1;
                cArr4[i3] = (char) (cArr[i3] - b);
            } else {
                i3 = i2;
            }
            if (i3 > 1) {
                int i11 = $11 + 93;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i13 = $11 + 33;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    } else {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24825 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 74, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 19488 - View.MeasureSpec.makeMeasureSpec(0, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                        } else if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i16 = $11 + 77;
                            $10 = i16 % 128;
                            int i17 = i16 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i18];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i19];
                        } else {
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i21 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i20];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i21];
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    j = 0;
                }
            }
            for (int i22 = 0; i22 < i2; i22++) {
                cArr4[i22] = (char) (cArr4[i22] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
        int i5;
        Throwable cause;
        int i6 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i2];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i5 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                break;
            }
            int i7 = $10 + 93;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16742091) - Color.rgb(0, 0, 0)), 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 10279 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12843), (ViewConfiguration.getTouchSlop() >> 8) + 55, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2167, 1298711993, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i3 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            int i10 = $11 + 15;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                int i12 = $11 + 25;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12843), MotionEvent.axisFromString("") + 56, (ViewConfiguration.getLongPressTimeout() >> 16) + 2167, 1298711993, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i5 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}
