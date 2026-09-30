package com.bytedance.adsdk.zb.sya.zb;

import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.adsdk.zb.ycx.ycx.htf;
import java.lang.reflect.Method;
import java.util.List;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class pmi implements sya {
    private final com.bytedance.adsdk.zb.sya.ycx.ycx dj;
    private final zb fby;
    private final boolean jc;
    private final float jw;
    private final com.bytedance.adsdk.zb.sya.ycx.zb lt;
    private final com.bytedance.adsdk.zb.sya.ycx.dj lud;
    private final List<com.bytedance.adsdk.zb.sya.ycx.zb> sya;
    private final ycx ul;
    private final String ycx;
    private final com.bytedance.adsdk.zb.sya.ycx.zb zb;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'sya' uses external variables
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
        private static int IAuthTabCallbackStub = 1;
        private static int asBinder = 0;
        private static int asInterface = 1;
        private static final /* synthetic */ ycx[] dj;
        private static boolean onExtraCallback;
        private static char[] onExtraCallbackWithResult;
        private static boolean onNavigationEvent;
        private static int onWarmupCompleted;
        public static final ycx sya;
        public static final ycx ycx;
        public static final ycx zb;

        private ycx(String str, int i2) {
        }

        public static ycx valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = asBinder + 81;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            ycx ycxVar = (ycx) Enum.valueOf(ycx.class, str);
            int i5 = asBinder + 49;
            asInterface = i5 % 128;
            int i6 = i5 % 2;
            return ycxVar;
        }

        public static ycx[] values() {
            int i2 = 2 % 2;
            int i3 = asInterface + 57;
            asBinder = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            ycx[] ycxVarArr = (ycx[]) dj.clone();
            int i4 = asInterface + 123;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return ycxVarArr;
        }

        static {
            onExtraCallbackWithResult();
            ycx ycxVar = new ycx("BUTT", 0);
            ycx = ycxVar;
            ycx ycxVar2 = new ycx("ROUND", 1);
            zb = ycxVar2;
            Object[] objArr = new Object[1];
            Object obj = null;
            a(null, null, new byte[]{-126, -123, -124, -126, -125, -126, -127}, 127 - TextUtils.getCapsMode("", 0, 0), objArr);
            ycx ycxVar3 = new ycx(((String) objArr[0]).intern(), 2);
            sya = ycxVar3;
            dj = new ycx[]{ycxVar, ycxVar2, ycxVar3};
            int i2 = onWarmupCompleted + 109;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public Paint.Cap ycx() {
            int i2 = 2 % 2;
            int i3 = asInterface + 1;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            int i5 = AnonymousClass1.ycx[ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    int i6 = asBinder + 35;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            Paint.Cap cap = Paint.Cap.BUTT;
            int i8 = asBinder + 85;
            asInterface = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 38 / 0;
            }
            return cap;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i2, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            long j = 0;
            if (cArr2 != null) {
                int i5 = $10 + 97;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 39;
                    $11 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 77 - (ViewConfiguration.getScrollDefaultDelay() >> 16), ExpandableListView.getPackedPositionGroup(j) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i7++;
                        i3 = 2;
                        j = 0;
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
            try {
                Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), 76 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                if (onNavigationEvent) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                    char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i2] - iIntValue);
                        try {
                            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.green(0) + 63, View.combineMeasuredStates(0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (onExtraCallback) {
                    defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                    char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                    while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                        cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), KeyEvent.normalizeMetaState(0) + 63, ExpandableListView.getPackedPositionChild(0L) + 12215, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        int i10 = $10 + 43;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i2] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                String str = new String(cArr6);
                int i12 = $11 + 93;
                $10 = i12 % 128;
                if (i12 % 2 == 0) {
                    objArr[0] = str;
                } else {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }

        static void onExtraCallbackWithResult() {
            onExtraCallbackWithResult = new char[]{32583, 32590, 32585, 32589, 32581};
            IAuthTabCallback = -1184334052;
            onExtraCallback = true;
            onNavigationEvent = true;
        }
    }

    /* renamed from: com.bytedance.adsdk.zb.sya.zb.pmi$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ycx;
        static final /* synthetic */ int[] zb;

        static {
            int[] iArr = new int[zb.values().length];
            zb = iArr;
            try {
                iArr[zb.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zb[zb.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zb[zb.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ycx.values().length];
            ycx = iArr2;
            try {
                iArr2[ycx.ycx.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ycx[ycx.zb.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ycx[ycx.sya.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum zb {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join ycx() {
            int i2 = AnonymousClass1.zb[ordinal()];
            if (i2 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i2 == 2) {
                return Paint.Join.MITER;
            }
            if (i2 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public pmi(String str, com.bytedance.adsdk.zb.sya.ycx.zb zbVar, List<com.bytedance.adsdk.zb.sya.ycx.zb> list, com.bytedance.adsdk.zb.sya.ycx.ycx ycxVar, com.bytedance.adsdk.zb.sya.ycx.dj djVar, com.bytedance.adsdk.zb.sya.ycx.zb zbVar2, ycx ycxVar2, zb zbVar3, float f, boolean z) {
        this.ycx = str;
        this.zb = zbVar;
        this.sya = list;
        this.dj = ycxVar;
        this.lud = djVar;
        this.lt = zbVar2;
        this.ul = ycxVar2;
        this.fby = zbVar3;
        this.jw = f;
        this.jc = z;
    }

    @Override // com.bytedance.adsdk.zb.sya.zb.sya
    public com.bytedance.adsdk.zb.ycx.ycx.sya ycx(com.bytedance.adsdk.zb.jw jwVar, com.bytedance.adsdk.zb.ul ulVar, com.bytedance.adsdk.zb.sya.sya.ycx ycxVar) {
        return new htf(jwVar, ycxVar, this);
    }

    public String ycx() {
        return this.ycx;
    }

    public com.bytedance.adsdk.zb.sya.ycx.ycx zb() {
        return this.dj;
    }

    public com.bytedance.adsdk.zb.sya.ycx.dj sya() {
        return this.lud;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb dj() {
        return this.lt;
    }

    public List<com.bytedance.adsdk.zb.sya.ycx.zb> lud() {
        return this.sya;
    }

    public com.bytedance.adsdk.zb.sya.ycx.zb lt() {
        return this.zb;
    }

    public ycx ul() {
        return this.ul;
    }

    public zb fby() {
        return this.fby;
    }

    public float jw() {
        return this.jw;
    }

    public boolean jc() {
        return this.jc;
    }
}
