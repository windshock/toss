package com.bytedance.adsdk.ugeno.ycx;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class lud {
    private static int IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    public static final lud dj;
    public static final lud ea;
    public static final lud fby;
    public static final lud jc;
    public static final lud jw;
    public static final lud lt;
    public static final lud lud;
    public static final lud ok;
    private static int onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static byte[] onNavigationEvent;
    private static short[] onWarmupCompleted;
    private static final /* synthetic */ lud[] pmi;
    public static final lud ry;
    public static final lud sya;
    public static final lud ul;
    public static final lud xkz;
    public static final lud ycx;
    public static final lud zb;
    private final String dy;
    private final String syc;
    private final String wie;
    private static final byte[] $$a = {79, -7, -1, -17};
    private static final int $$b = 234;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallbackDefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i2, byte b, short s) {
        int i3;
        int i4 = (b * 2) + 4;
        int i5 = 115 - (s * 2);
        int i6 = i2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i7;
            int i9 = i4;
            int i10 = 0;
            int i11 = i9 + 1;
            int i12 = (-i4) + i8;
            i3 = i10;
            i5 = i12;
            i4 = i11;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i13 = i5;
            i9 = i4;
            i4 = bArr[i4];
            i10 = i3 + 1;
            i8 = i13;
            int i112 = i9 + 1;
            int i122 = (-i4) + i8;
            i3 = i10;
            i5 = i122;
            i4 = i112;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    private static /* synthetic */ lud[] dj() {
        int i2 = 2 % 2;
        int i3 = asBinder + 93;
        int i4 = i3 % 128;
        asInterface = i4;
        int i5 = i3 % 2;
        lud[] ludVarArr = {ycx, zb, sya, dj, lud, lt, ul, fby, jw, jc, ea, ok, ry, xkz};
        int i6 = i4 + 69;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 47 / 0;
        }
        return ludVarArr;
    }

    public static lud valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = asBinder + 79;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        lud ludVar = (lud) Enum.valueOf(lud.class, str);
        if (i4 == 0) {
            throw null;
        }
        int i5 = asBinder + 5;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return ludVar;
    }

    public static lud[] values() {
        int i2 = 2 % 2;
        int i3 = asBinder + 55;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        lud[] ludVarArr = pmi;
        if (i4 != 0) {
            return (lud[]) ludVarArr.clone();
        }
        int i5 = 65 / 0;
        return (lud[]) ludVarArr.clone();
    }

    static {
        IAuthTabCallbackStub = 0;
        onExtraCallback();
        ycx = new lud("TRANSLATE", 0, "translate", "translation", "point");
        zb = new lud("TRANSLATE_X", 1, "translateX", "translationX", "float");
        sya = new lud("TRANSLATE_Y", 2, "translateY", "translationY", "float");
        dj = new lud("ROTATE_X", 3, "rotateX", "rotationX", "float");
        lud = new lud("ROTATE_Y", 4, "rotateY", "rotationY", "float");
        lt = new lud("ROTATE_Z", 5, "rotateZ", "rotation", "float");
        ul = new lud("SCALE", 6, "scale", "scale", "point");
        fby = new lud("SCALE_X", 7, "scaleX", "scaleX", "float");
        jw = new lud("SCALE_Y", 8, "scaleY", "scaleY", "float");
        Object[] objArr = new Object[1];
        a((short) ((-63) - Color.green(0)), (byte) (90 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1064883387 + TextUtils.getTrimmedLength(""), Drawable.resolveOpacity(0, 0) + 1348804079, ((Process.getThreadPriority(0) + 20) >> 6) - 21, objArr);
        jc = new lud("ALPHA", 9, "opacity", ((String) objArr[0]).intern(), "float");
        ea = new lud("BACKGROUND_COLOR", 10, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "int");
        ok = new lud("BORDER_RADIUS", 11, "borderRadius", "borderRadius", "float");
        ry = new lud("RIPPLE", 12, "ripple", "ripple", "float");
        xkz = new lud("SHINE", 13, "shine", "shine", "float");
        pmi = dj();
        int i2 = IAuthTabCallbackDefault + 43;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private lud(String str, int i2, String str2, String str3, String str4) {
        this.syc = str2;
        this.dy = str3;
        this.wie = str4;
    }

    public String ycx() {
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.syc;
        int i5 = i4 + 1;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String zb() {
        int i2 = 2 % 2;
        int i3 = asBinder + 43;
        int i4 = i3 % 128;
        asInterface = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.dy;
        int i5 = i4 + 75;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public String sya() {
        int i2 = 2 % 2;
        int i3 = asInterface + 117;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.wie;
        if (i4 != 0) {
            int i5 = 28 / 0;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lud ycx(String str) {
        char c = 2;
        int i2 = 2 % 2;
        int i3 = asBinder + 31;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            switch (str.hashCode()) {
                case -1721943862:
                    break;
                case -1721943861:
                    break;
                case -1267206133:
                    break;
                case -930826704:
                    break;
                case -908189618:
                    break;
                case -908189617:
                    break;
                case 109250890:
                    break;
                case 1052832078:
                    break;
                case 1287124693:
                    break;
                case 1349188574:
                    break;
                case 1384173149:
                    break;
                case 1384173150:
                    break;
                case 1384173151:
                    break;
            }
        } else {
            int i4 = 43 / 0;
            switch (str.hashCode()) {
                case -1721943862:
                    if (!str.equals("translateX")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -1721943861:
                    if (str.equals("translateY")) {
                        int i5 = asBinder + 67;
                        asInterface = i5 % 128;
                        int i6 = i5 % 2;
                        c = 1;
                        break;
                    }
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        int i7 = asInterface + 21;
                        asBinder = i7 % 128;
                        if (i7 % 2 != 0) {
                            c = 5;
                            break;
                        }
                    }
                    break;
                case -930826704:
                    if (str.equals("ripple")) {
                        c = 3;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 4;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        int i8 = asInterface + 43;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1052832078:
                    if (str.equals("translate")) {
                        int i10 = asBinder + 109;
                        asInterface = i10 % 128;
                        if (i10 % 2 != 0) {
                            c = 7;
                            break;
                        }
                    }
                    break;
                case 1287124693:
                    if (str.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1349188574:
                    if (str.equals("borderRadius")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1384173149:
                    if (str.equals("rotateX")) {
                        int i11 = asBinder + 39;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                        c = '\n';
                        break;
                    }
                    break;
                case 1384173150:
                    if (str.equals("rotateY")) {
                        c = 11;
                        break;
                    }
                    break;
                case 1384173151:
                    if (str.equals("rotateZ")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
        }
        switch (c) {
            case 0:
                return zb;
            case 1:
                return sya;
            case 2:
                return jc;
            case 3:
                return ry;
            case 4:
                return fby;
            case 5:
                return jw;
            case 6:
                return ul;
            case 7:
                return ycx;
            case '\b':
                return ea;
            case '\t':
                return ok;
            case '\n':
                return dj;
            case 11:
                return lud;
            case '\f':
                return lt;
            default:
                return zb;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0286  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        int i5;
        boolean z;
        int length;
        byte[] bArr;
        int i6;
        char c = 2;
        int i7 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            float f = 0.0f;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Drawable.resolveOpacity(0, 0)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i8 = $10;
                int i9 = i8 + 101;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr2 = onNavigationEvent;
                if (bArr2 != null) {
                    int i11 = i8 + 25;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char doubleTapTimeout = (char) (12843 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 55;
                            int i12 = (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 2167;
                            byte b2 = (byte) ($$a[c] + 1);
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(doubleTapTimeout, scrollDefaultDelay, i12, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i6++;
                        c = 2;
                        f = 0.0f;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 43424), Drawable.resolveOpacity(0, 0) + 42, 22439 - ((Process.getThreadPriority(0) + 20) >> 6), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (onWarmupCompleted[i2 + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallback ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i13 = $11;
                int i14 = i13 + 83;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                int i16 = ((i2 + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z2) {
                    i5 = 1;
                } else {
                    int i17 = i13 + 117;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i5 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i16 + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getCapsMode("", 0, 0), 85 - TextUtils.indexOf((CharSequence) "", '0', 0), 9567 - (ViewConfiguration.getLongPressTimeout() >> 16), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (bArr4[i19] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    z = true;
                } else {
                    int i20 = $10 + 75;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i22 = $11 + 101;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 80 / 0;
                        if (z) {
                            byte[] bArr6 = onNavigationEvent;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        } else {
                            short[] sArr = onWarmupCompleted;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                    } else if (z) {
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static void onExtraCallback() {
        IAuthTabCallback = 1690366797;
        onExtraCallback = -1538795492;
        onExtraCallbackWithResult = 199047802;
        onNavigationEvent = new byte[]{-7, -22, -23, -107, -104};
    }
}
