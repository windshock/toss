package org.bouncycastle.tsp;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import net.sf.scuba.smartcards.BuildConfig;
import net.sf.scuba.smartcards.ISOFileInfo;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import o.onVideoError;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.tsp.Accuracy;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class GenTimeAccuracy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onNavigationEvent;
    private Accuracy accuracy;
    private static char[] onWarmupCompleted = {32431};
    private static int IAuthTabCallback = -1184334177;
    private static boolean onExtraCallback = true;
    private static boolean onExtraCallbackWithResult = true;

    public GenTimeAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    private String format(int i) throws Throwable {
        StringBuilder sb;
        String str;
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 115;
        asBinder = i3 % 128;
        if (i3 % 2 != 0 ? i < 10 : i < 33) {
            sb = new StringBuilder();
            str = "00";
        } else {
            if (i >= 100) {
                return Integer.toString(i);
            }
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{ISOFileInfo.DATA_BYTES2}, Drawable.resolveOpacity(0, 0) + CertificateBody.profileType, objArr);
            String strIntern = ((String) objArr[0]).intern();
            int i4 = onNavigationEvent + 89;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            sb = sb2;
            str = strIntern;
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    private int getTimeComponent(ASN1Integer aSN1Integer) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 29;
        onNavigationEvent = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (aSN1Integer == null) {
            int i4 = i2 + 49;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return 0;
            }
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 19;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        int iIntValueExact = aSN1Integer.intValueExact();
        if (i6 != 0) {
            int i7 = 47 / 0;
        }
        return iIntValueExact;
    }

    public int getMicros() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int timeComponent = getTimeComponent(this.accuracy.getMicros());
        int i4 = onNavigationEvent + 31;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return timeComponent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getMillis() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int timeComponent = getTimeComponent(this.accuracy.getMillis());
        int i4 = asBinder + 19;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return timeComponent;
    }

    public int getSeconds() {
        int i = 2 % 2;
        int i2 = asBinder + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int timeComponent = getTimeComponent(this.accuracy.getSeconds());
        int i4 = onNavigationEvent + 5;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return timeComponent;
    }

    public String toString() {
        int i = 2 % 2;
        String str = getSeconds() + onVideoError.onExtraCallbackWithResult + format(getMillis()) + format(getMicros());
        int i2 = onNavigationEvent + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onWarmupCompleted;
        char c = '0';
        float f = 0.0f;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = $11 + 85;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.lastIndexOf(BuildConfig.FLAVOR, c)), TextUtils.lastIndexOf(BuildConfig.FLAVOR, c, 0, 0) + 78, 20953 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i5++;
                    c = '0';
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(IAuthTabCallback)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 75 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 16037 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        if (onExtraCallbackWithResult) {
            int i6 = $11 + 1;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), 63 - TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 12215 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $11 + 61;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
        } else {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
        }
        while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
            cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 1), 63 - View.getDefaultSize(0, 0), 12213 - MotionEvent.axisFromString(BuildConfig.FLAVOR), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2);
    }
}
