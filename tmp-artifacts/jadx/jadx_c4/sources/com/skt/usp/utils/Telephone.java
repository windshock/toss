package com.skt.usp.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.skt.usp.tools.UCPLibraryFeatures;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersBuilderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public class Telephone {
    private static final byte[] $$a = {69, -50, 81, 75};
    private static final int $$b = 1;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onWarmupCompleted = 7025836445376041412L;
    private static int onNavigationEvent = -1776194565;
    private static char onExtraCallback = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        byte[] bArr = $$a;
        int i2 = b + 4;
        int i3 = s * 2;
        int i4 = s2 + 109;
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i2;
            int i9 = (-i2) + i6;
            i = i7;
            int i10 = i8;
            i4 = i9;
            i2 = i10;
            int i11 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                return new String(bArr2, 0);
            }
            int i12 = i4;
            i8 = i11;
            i2 = bArr[i11];
            i7 = i + 1;
            i6 = i12;
            int i92 = (-i2) + i6;
            i = i7;
            int i102 = i8;
            i4 = i92;
            i2 = i102;
            int i112 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i1122 = i2 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }

    protected Telephone() {
    }

    public static boolean isEmulator() {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            str = Build.MODEL;
            int i3 = 77 / 0;
            if (str.contains("sdk")) {
                return true;
            }
        } else {
            str = Build.MODEL;
            if (str.contains("sdk")) {
                return true;
            }
        }
        if (str.contains("SDK")) {
            return true;
        }
        int i4 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static String getSimSerialNumber(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                isEmulator();
                obj.hashCode();
                throw null;
            }
            if (isEmulator()) {
                int i3 = onExtraCallbackWithResult + 53;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return "8982050611301699363F";
            }
            return ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber() + "F";
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getMdn(Context context) throws Throwable {
        String line1Number;
        int i = 2 % 2;
        Object obj = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            line1Number = telephonyManager.getLine1Number();
            try {
                if (UCPLibraryFeatures.getUcpSubscriptionId() > 0) {
                    int i2 = IAuthTabCallback + 111;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        telephonyManager.createForSubscriptionId(UCPLibraryFeatures.getUcpSubscriptionId()).getLine1Number();
                        throw null;
                    }
                    line1Number = telephonyManager.createForSubscriptionId(UCPLibraryFeatures.getUcpSubscriptionId()).getLine1Number();
                }
                if (line1Number != null) {
                    int i3 = onExtraCallbackWithResult + 17;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        line1Number.startsWith("+");
                        throw null;
                    }
                    if (line1Number.startsWith("+")) {
                        Object[] objArr = new Object[1];
                        a((char) (21959 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 414504535 + (ViewConfiguration.getTouchSlop() >> 8), new char[]{40452}, new char[]{47679, 24192, 50483, 3514}, new char[]{22445, 46294, 50968, 33877}, objArr);
                        String strReplace = line1Number.replace("+82", ((String) objArr[0]).intern());
                        int i4 = onExtraCallbackWithResult + 65;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        return strReplace;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            line1Number = null;
        }
        int i6 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return line1Number;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return r4.createForSubscriptionId(r5).getLine1Number();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r5 > 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (r5 > 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getMdn(Context context, int i) {
        String line1Number;
        TelephonyManager telephonyManager;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        String str = null;
        try {
            if (i3 % 2 != 0) {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                line1Number = telephonyManager.getLine1Number();
                int i4 = 13 / 0;
            } else {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                line1Number = telephonyManager.getLine1Number();
            }
        } catch (Exception unused) {
            line1Number = str;
        }
        int i5 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return line1Number;
    }

    public static String getMdnBySubId(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                String line1Number = ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(i).getLine1Number();
                int i4 = onExtraCallbackWithResult + 99;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return line1Number;
            }
            ((TelephonyManager) context.getSystemService("phone")).createForSubscriptionId(i).getLine1Number();
            obj.hashCode();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i5 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i6 = $11 + 35;
            $10 = i6 % 128;
            int i7 = i6 % i3;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    int i8 = 44 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    int i9 = 1452 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int i10 = $$b;
                    String str$$c = $$c((byte) (i10 - 1), (byte) (-i10), (byte) i10);
                    Class[] clsArr = new Class[1];
                    clsArr[i5] = Object.class;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), i8, i9, 228868077, false, str$$c, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", i5, i5) + 49123);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(i5) + 45;
                        int iIndexOf = 1494 - TextUtils.indexOf("", "");
                        int i11 = $$b;
                        byte b = (byte) (i11 - 1);
                        byte b2 = (byte) (-i11);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(capsMode, bitsPerPixel, iIndexOf, 1533236389, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - ((Process.getThreadPriority(0) + 20) >> 6)), 50 - Color.red(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                    if (objOnExtraCallback4 == null) {
                        i2 = 2;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 45849), 29 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12576, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        i2 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                    cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onWarmupCompleted ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                    int i12 = $11 + 119;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i3 = i2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static boolean isAirplaneModeOn(Context context) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ContentResolver contentResolver = context.getContentResolver();
        if (i3 == 0 ? Settings.System.getInt(contentResolver, "airplane_mode_on", 0) == 0 : Settings.System.getInt(contentResolver, "airplane_mode_on", 1) == 0) {
            return false;
        }
        int i4 = IAuthTabCallback;
        int i5 = i4 + 77;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 119;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public static boolean isInsertedUsim(Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        String mdn = getMdn(context);
        if (mdn == null) {
            return false;
        }
        int i4 = IAuthTabCallback + 95;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            mdn.length();
            throw null;
        }
        if (mdn.length() <= 0) {
            return false;
        }
        int i5 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static boolean isRoaming(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsNetworkRoaming = ((TelephonyManager) context.getSystemService("phone")).isNetworkRoaming();
        int i4 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zIsNetworkRoaming;
    }

    public static void setAirplaneMode(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsAirplaneModeOn = isAirplaneModeOn(context);
        if (zIsAirplaneModeOn != z) {
            int i4 = IAuthTabCallback;
            int i5 = i4 + 81;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = (i5 % 2 != 0 ? !z : !z) ? 0 : 1;
            if (i6 == 1) {
                int i7 = i4 + 19;
                onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (zIsAirplaneModeOn) {
                    return;
                }
            }
            if (i6 == 0) {
                int i8 = i4 + 91;
                onExtraCallbackWithResult = i8 % 128;
                int i9 = i8 % 2;
                if (!zIsAirplaneModeOn) {
                    return;
                }
            }
            Settings.System.putInt(context.getContentResolver(), "airplane_mode_on", i6);
            Intent intent = new Intent("android.intent.action.AIRPLANE_MODE");
            intent.putExtra("state", i6);
            context.sendBroadcast(intent);
        }
    }
}
