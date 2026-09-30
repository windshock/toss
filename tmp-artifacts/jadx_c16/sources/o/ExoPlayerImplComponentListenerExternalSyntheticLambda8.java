package o;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class ExoPlayerImplComponentListenerExternalSyntheticLambda8 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static char[] onWarmupCompleted = {64982, 64989, 64988, 65065};
    private static char IAuthTabCallback = 51243;

    ExoPlayerImplComponentListenerExternalSyntheticLambda8() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix onExtraCallback(RectF rectF, RectF rectF2, String str, int i) throws Throwable {
        double dMax;
        double d;
        double d2;
        double dMin;
        double d3;
        int i2 = 2 % 2;
        double d4 = rectF.left;
        double d5 = rectF.top;
        double dWidth = rectF.width();
        double dHeight = rectF.height();
        double d6 = rectF2.left;
        double d7 = rectF2.top;
        double dWidth2 = rectF2.width();
        double dHeight2 = rectF2.height();
        double d8 = dWidth2 / dWidth;
        double d9 = dHeight2 / dHeight;
        double d10 = d6 - (d4 * d8);
        if (i == 2) {
            dMin = Math.min(d8, d9);
            if (dMin > 1.0d) {
                d3 = d10 - (((dWidth2 / dMin) - dWidth) / 2.0d);
                dHeight2 /= dMin;
            } else {
                d3 = d10 - ((dWidth2 - (dWidth * dMin)) / 2.0d);
                dHeight *= dMin;
            }
            d2 = (d7 - (d5 * d9)) - ((dHeight2 - dHeight) / 2.0d);
            int i3 = onExtraCallback + 41;
            int i4 = i3 % 128;
            onExtraCallbackWithResult = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 41;
            onExtraCallback = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            d9 = dMin;
        } else {
            Object[] objArr = new Object[1];
            a(new char[]{0, 3, 0, 1}, (byte) (TextUtils.getOffsetAfter("", 0) + 2), TextUtils.getCapsMode("", 0, 0) + 4, objArr);
            if (!str.equals(((String) objArr[0]).intern()) && i == 0) {
                dMax = Math.min(d8, d9);
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{0, 3, 0, 1}, (byte) (2 - (ViewConfiguration.getPressedStateDuration() >> 16)), 4 - View.resolveSize(0, 0), objArr2);
                if (!str.equals(((String) objArr2[0]).intern()) && i == 1) {
                    dMax = Math.max(d8, d9);
                }
                d = d6 - (d4 * d8);
                double d11 = d7 - (d5 * d9);
                if (str.contains("xMid")) {
                    int i7 = onExtraCallback + 71;
                    onExtraCallbackWithResult = i7 % 128;
                    d = i7 % 2 == 0 ? d - ((dWidth2 - (dWidth + d8)) + 2.0d) : d + ((dWidth2 - (dWidth * d8)) / 2.0d);
                }
                if (str.contains("xMax")) {
                    int i8 = onExtraCallbackWithResult + 93;
                    onExtraCallback = i8 % 128;
                    int i9 = i8 % 2;
                    d += dWidth2 - (dWidth * d8);
                }
                if (str.contains("YMid")) {
                    d11 += (dHeight2 - (dHeight * d9)) / 2.0d;
                }
                d2 = d11;
                if (!str.contains("YMax")) {
                    d2 += dHeight2 - (dHeight * d9);
                    Matrix matrix = new Matrix();
                    matrix.postTranslate((float) d, (float) d2);
                    matrix.preScale((float) d8, (float) d9);
                    return matrix;
                }
                dMin = d8;
                d3 = d;
            }
            d8 = dMax;
            d9 = d8;
            d = d6 - (d4 * d8);
            double d112 = d7 - (d5 * d9);
            if (str.contains("xMid")) {
            }
            if (str.contains("xMax")) {
            }
            if (str.contains("YMid")) {
            }
            d2 = d112;
            if (!str.contains("YMax")) {
            }
        }
        d8 = dMin;
        d = d3;
        Matrix matrix2 = new Matrix();
        matrix2.postTranslate((float) d, (float) d2);
        matrix2.preScale((float) d8, (float) d9);
        return matrix2;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = $11 + 61;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.getDefaultSize(0, 0), (-16777190) - Color.rgb(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionType(0L) + 26, 23140 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i8 = $10 + 101;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 24824), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 74, ((Process.getThreadPriority(0) + 20) >> 6) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i10 = $10 + 95;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(0), 30 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.alpha(0) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i12 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i12];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i13];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                            i3 = $10 + 87;
                        } else {
                            int i15 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i16 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i15];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i16];
                            i3 = $10 + 115;
                        }
                        $11 = i3 % 128;
                        int i17 = i3 % 2;
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
