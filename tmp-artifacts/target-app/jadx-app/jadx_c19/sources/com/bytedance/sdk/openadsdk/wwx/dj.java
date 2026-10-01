package com.bytedance.sdk.openadsdk.wwx;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackGroupExternalSyntheticLambda0;

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
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class dj {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    public static final dj dj;
    private static final /* synthetic */ dj[] jw;
    public static final dj lt;
    public static final dj lud;
    private static int onExtraCallback = 0;
    private static char[] onExtraCallbackWithResult = null;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;
    public static final dj sya;
    public static final dj ul;
    public static final dj ycx;
    public static final dj zb;
    private String fby;

    public static dj valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 25;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        dj djVar = (dj) Enum.valueOf(dj.class, str);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = onExtraCallback + 43;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return djVar;
    }

    public static dj[] values() {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 117;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        dj[] djVarArr = (dj[]) jw.clone();
        int i5 = onWarmupCompleted + 71;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return djVarArr;
        }
        throw null;
    }

    static {
        IAuthTabCallback();
        dj djVar = new dj("TYPE_2G", 0, "2g");
        ycx = djVar;
        dj djVar2 = new dj("TYPE_3G", 1, "3g");
        zb = djVar2;
        dj djVar3 = new dj("TYPE_4G", 2, "4g");
        sya = djVar3;
        dj djVar4 = new dj("TYPE_5G", 3, "5g");
        dj = djVar4;
        dj djVar5 = new dj("TYPE_WIFI", 4, "wifi");
        lud = djVar5;
        dj djVar6 = new dj("TYPE_MOBILE", 5, "mobile");
        lt = djVar6;
        Object[] objArr = new Object[1];
        a(new int[]{0, 7, 0, 2}, false, new byte[]{1, 1, 1, 1, 1, 1, 1}, objArr);
        dj djVar7 = new dj("TYPE_UNKNOWN", 6, ((String) objArr[0]).intern());
        ul = djVar7;
        jw = new dj[]{djVar, djVar2, djVar3, djVar4, djVar5, djVar6, djVar7};
        int i2 = IAuthTabCallback + 9;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private dj(String str, int i2, String str2) {
        this.fby = str2;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 47;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        String str = this.fby;
        int i6 = i4 + 81;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 / 0;
        }
        return str;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        char c = '0';
        if (cArr != null) {
            int i8 = $10 + 43;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 17;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((KeyEvent.getMaxKeyCode() >> 16) + 35283), (Process.myPid() >> 22) + 35, 14238 - TextUtils.lastIndexOf("", c, 0, 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i10++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i13 = $11 + 119;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10934), 65 - (ViewConfiguration.getFadingEdgeLength() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0') + 49468), 70 - TextUtils.getTrimmedLength(""), 12486 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i17 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i17, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i18 = $11 + 91;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[5]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void IAuthTabCallback() {
        onExtraCallbackWithResult = new char[]{27253, 27196, 27199, 27199, 27170, 27170, 27168};
    }
}
