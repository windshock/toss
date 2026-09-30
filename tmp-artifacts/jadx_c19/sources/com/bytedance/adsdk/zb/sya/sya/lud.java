package com.bytedance.adsdk.zb.sya.sya;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.zb.sya.ycx.ea;
import com.bytedance.adsdk.zb.sya.ycx.ok;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class lud {
    private final long dj;
    private final com.bytedance.adsdk.zb.lud.jc dv;
    private final float dy;
    private final int ea;
    private final List<com.bytedance.adsdk.zb.sya.zb.fby> fby;
    private final List<com.bytedance.adsdk.zb.ul.ycx<Float>> htf;
    private final int jc;
    private final ok jw;
    private final long lt;
    private final ycx lud;
    private final int ok;
    private final ea pmi;
    private final float ry;
    private final String sya;
    private final float syc;
    private final zb thx;
    private final com.bytedance.adsdk.zb.sya.zb.ycx tn;
    private final com.bytedance.adsdk.zb.sya.ycx.zb uh;
    private final String ul;
    private final com.bytedance.adsdk.zb.sya.ycx.jc wie;
    private final boolean wwx;
    private final float xkz;
    private final List<com.bytedance.adsdk.zb.sya.zb.sya> ycx;
    private final com.bytedance.adsdk.zb.ul zb;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ul' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ycx {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 0;
        public static final ycx dj;
        private static final /* synthetic */ ycx[] fby;
        public static final ycx lt;
        public static final ycx lud;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static char[] onNavigationEvent = null;
        private static int onWarmupCompleted = 1;
        public static final ycx sya;
        public static final ycx ul;
        public static final ycx ycx;
        public static final ycx zb;

        private ycx(String str, int i2) {
        }

        public static ycx valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            ycx ycxVar = (ycx) Enum.valueOf(ycx.class, str);
            if (i4 == 0) {
                int i5 = 3 / 0;
            }
            int i6 = IAuthTabCallback + 17;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return ycxVar;
        }

        public static ycx[] values() {
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted + 77;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            ycx[] ycxVarArr = (ycx[]) fby.clone();
            int i5 = onWarmupCompleted + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return ycxVarArr;
        }

        static {
            onExtraCallbackWithResult();
            ycx ycxVar = new ycx("PRE_COMP", 0);
            ycx = ycxVar;
            ycx ycxVar2 = new ycx("SOLID", 1);
            zb = ycxVar2;
            ycx ycxVar3 = new ycx("IMAGE", 2);
            sya = ycxVar3;
            ycx ycxVar4 = new ycx("NULL", 3);
            dj = ycxVar4;
            ycx ycxVar5 = new ycx("SHAPE", 4);
            lud = ycxVar5;
            ycx ycxVar6 = new ycx("TEXT", 5);
            lt = ycxVar6;
            Object[] objArr = new Object[1];
            a(new int[]{0, 7, 25, 5}, false, new byte[]{0, 1, 1, 0, 1, 1, 1}, objArr);
            ycx ycxVar7 = new ycx(((String) objArr[0]).intern(), 6);
            ul = ycxVar7;
            fby = new ycx[]{ycxVar, ycxVar2, ycxVar3, ycxVar4, ycxVar5, ycxVar6, ycxVar7};
            int i2 = onExtraCallback + 55;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 16 / 0;
            }
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            char c;
            int i2 = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr2 = onNavigationEvent;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i7 = 0; i7 < length; i7++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 35284), AndroidCharacter.getMirror('0') - '\r', 14239 - Drawable.resolveOpacity(0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
            char[] cArr4 = new char[i4];
            System.arraycopy(cArr2, i3, cArr4, 0, i4);
            if (bArr != null) {
                int i8 = $11 + 53;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                    c = 1;
                } else {
                    cArr = new char[i4];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    c = 0;
                }
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10936 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 65 - TextUtils.indexOf("", "", 0), Color.green(0) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 49467), TextUtils.indexOf("", "", 0) + 70, View.getDefaultSize(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                cArr4 = cArr;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr4, 0, cArr5, 0, i4);
                int i11 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr4, i11, i6);
                System.arraycopy(cArr5, i6, cArr4, 0, i11);
            }
            if (z) {
                char[] cArr6 = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                int i12 = $11 + 35;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr6;
            }
            if (i5 > 0) {
                int i14 = $10 + 73;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                    int i16 = $10 + 53;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        static void onExtraCallbackWithResult() {
            onNavigationEvent = new char[]{27260, 27179, 27177, 27170, 27173, 27172, 27172};
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'lt' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class zb {
        private static int IAuthTabCallback;
        public static final zb dj;
        public static final zb lt;
        public static final zb lud;
        private static int onExtraCallback;
        public static final zb sya;
        private static final /* synthetic */ zb[] ul;
        public static final zb ycx;
        public static final zb zb;
        private static final byte[] $$a = {69, -50, 81, 75};
        private static final int $$b = 88;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        private static int onNavigationEvent = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i2, int i3, byte b) {
            int i4;
            int i5 = (i2 * 4) + 4;
            int i6 = 105 - (b * 4);
            byte[] bArr = $$a;
            int i7 = i3 * 4;
            byte[] bArr2 = new byte[i7 + 1];
            if (bArr == null) {
                int i8 = i7;
                i4 = 0;
                i5++;
                i6 += i8;
                bArr2[i4] = (byte) i6;
                if (i4 == i7) {
                    return new String(bArr2, 0);
                }
                i4++;
                i8 = bArr[i5];
                i5++;
                i6 += i8;
                bArr2[i4] = (byte) i6;
                if (i4 == i7) {
                }
            } else {
                i4 = 0;
                bArr2[i4] = (byte) i6;
                if (i4 == i7) {
                }
            }
        }

        private zb(String str, int i2) {
        }

        public static zb valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 7;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            zb zbVar = (zb) Enum.valueOf(zb.class, str);
            int i5 = onWarmupCompleted + 121;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return zbVar;
        }

        public static zb[] values() {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 73;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            zb[] zbVarArr = (zb[]) ul.clone();
            int i4 = onWarmupCompleted + 79;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return zbVarArr;
        }

        static {
            IAuthTabCallback = 0;
            onNavigationEvent();
            zb zbVar = new zb("NONE", 0);
            ycx = zbVar;
            zb zbVar2 = new zb("ADD", 1);
            zb = zbVar2;
            zb zbVar3 = new zb("INVERT", 2);
            sya = zbVar3;
            zb zbVar4 = new zb("LUMA", 3);
            dj = zbVar4;
            zb zbVar5 = new zb("LUMA_INVERTED", 4);
            lud = zbVar5;
            Object[] objArr = new Object[1];
            a(7 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.getDefaultSize(0, 0) + 3, new char[]{65535, 7, 65534, 5, 65534, 65531, 65534}, false, 267 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
            zb zbVar6 = new zb(((String) objArr[0]).intern(), 5);
            lt = zbVar6;
            ul = new zb[]{zbVar, zbVar2, zbVar3, zbVar4, zbVar5, zbVar6};
            int i2 = onNavigationEvent + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0173  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i2, int i3, char[] cArr, boolean z, int i4, Object[] objArr) throws Throwable {
            int i5;
            char[] cArr2;
            Throwable cause;
            int i6 = 2 % 2;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
            char[] cArr3 = new char[i2];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (true) {
                i5 = 2083011369;
                if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i2) {
                    break;
                }
                int i7 = $11 + 53;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i4 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                int i9 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(onExtraCallback)};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - View.MeasureSpec.getMode(0)), 23 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - TextUtils.indexOf("", "", 0, 0)), Gravity.getAbsoluteGravity(0, 0) + 55, 2167 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
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
                char[] cArr4 = new char[i2];
                System.arraycopy(cArr3, 0, cArr4, 0, i2);
                System.arraycopy(cArr4, 0, cArr3, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            }
            if (!(!z)) {
                int i10 = $11 + 125;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr2 = new char[i2];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
                } else {
                    cArr2 = new char[i2];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                }
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i2) {
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i2 - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 12844), 55 - TextUtils.indexOf("", ""), 2167 - View.MeasureSpec.getMode(0), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    int i11 = $11 + 87;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 5 / 2;
                    }
                    i5 = 2083011369;
                }
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        static void onNavigationEvent() {
            onExtraCallback = 478309010;
        }
    }

    public lud(List<com.bytedance.adsdk.zb.sya.zb.sya> list, com.bytedance.adsdk.zb.ul ulVar, String str, long j, ycx ycxVar, long j2, String str2, List<com.bytedance.adsdk.zb.sya.zb.fby> list2, ok okVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, com.bytedance.adsdk.zb.sya.ycx.jc jcVar, ea eaVar, List<com.bytedance.adsdk.zb.ul.ycx<Float>> list3, zb zbVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar2, boolean z, com.bytedance.adsdk.zb.sya.zb.ycx ycxVar2, com.bytedance.adsdk.zb.lud.jc jcVar2) {
        this.ycx = list;
        this.zb = ulVar;
        this.sya = str;
        this.dj = j;
        this.lud = ycxVar;
        this.lt = j2;
        this.ul = str2;
        this.fby = list2;
        this.jw = okVar;
        this.jc = i2;
        this.ea = i3;
        this.ok = i4;
        this.ry = f;
        this.xkz = f2;
        this.syc = f3;
        this.dy = f4;
        this.wie = jcVar;
        this.pmi = eaVar;
        this.htf = list3;
        this.thx = zbVar;
        this.uh = zbVar2;
        this.wwx = z;
        this.tn = ycxVar2;
        this.dv = jcVar2;
    }

    com.bytedance.adsdk.zb.ul ycx() {
        return this.zb;
    }

    float zb() {
        return this.ry;
    }

    float sya() {
        return this.xkz / this.zb.wie();
    }

    List<com.bytedance.adsdk.zb.ul.ycx<Float>> dj() {
        return this.htf;
    }

    public long lud() {
        return this.dj;
    }

    public String lt() {
        return this.sya;
    }

    public String ul() {
        return this.ul;
    }

    float fby() {
        return this.syc;
    }

    float jw() {
        return this.dy;
    }

    List<com.bytedance.adsdk.zb.sya.zb.fby> jc() {
        return this.fby;
    }

    public ycx ea() {
        return this.lud;
    }

    zb ok() {
        return this.thx;
    }

    long ry() {
        return this.lt;
    }

    List<com.bytedance.adsdk.zb.sya.zb.sya> xkz() {
        return this.ycx;
    }

    ok syc() {
        return this.jw;
    }

    int dy() {
        return this.ok;
    }

    int wie() {
        return this.ea;
    }

    int pmi() {
        return this.jc;
    }

    com.bytedance.adsdk.zb.sya.ycx.jc uh() {
        return this.wie;
    }

    ea htf() {
        return this.pmi;
    }

    com.bytedance.adsdk.zb.sya.ycx.zb thx() {
        return this.uh;
    }

    public String toString() {
        return ycx("");
    }

    public boolean wwx() {
        return this.wwx;
    }

    public com.bytedance.adsdk.zb.sya.zb.ycx tn() {
        return this.tn;
    }

    public com.bytedance.adsdk.zb.lud.jc dv() {
        return this.dv;
    }

    public String ycx(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(lt());
        sb.append("\n");
        lud ludVarYcx = this.zb.ycx(ry());
        if (ludVarYcx != null) {
            sb.append("\t\tParents: ");
            sb.append(ludVarYcx.lt());
            lud ludVarYcx2 = this.zb.ycx(ludVarYcx.ry());
            while (ludVarYcx2 != null) {
                sb.append("->");
                sb.append(ludVarYcx2.lt());
                ludVarYcx2 = this.zb.ycx(ludVarYcx2.ry());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!jc().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(jc().size());
            sb.append("\n");
        }
        if (pmi() != 0 && wie() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(pmi()), Integer.valueOf(wie()), Integer.valueOf(dy())));
        }
        if (!this.ycx.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.bytedance.adsdk.zb.sya.zb.sya syaVar : this.ycx) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(syaVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
