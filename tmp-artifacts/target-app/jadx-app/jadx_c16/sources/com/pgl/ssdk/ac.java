package com.pgl.ssdk;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.regex.Pattern;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda2;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public class ac {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static final FileFilter a;
    private static int asBinder = 1;
    private static int asInterface = 0;
    private static boolean onExtraCallback = false;
    private static int onExtraCallbackWithResult = 0;
    private static char[] onNavigationEvent = null;
    private static int onTransact = 1;
    private static int onWarmupCompleted;

    static final class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    static {
        onExtraCallback();
        a = new a();
        int i = onWarmupCompleted + 75;
        onTransact = i % 128;
        int i2 = i % 2;
    }

    private static int a() {
        int i = 2 % 2;
        try {
            int length = new File("/sys/devices/system/cpu/").listFiles(a).length;
            int i2 = asInterface + 9;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(4:31|3|29|4)|(4:33|5|25|6)|27|15|(2:17|18)(2:19|20)) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str) throws Throwable {
        BufferedReader bufferedReader;
        FileReader fileReader;
        String line;
        int i = 2 % 2;
        try {
            fileReader = new FileReader(str);
            try {
                bufferedReader = new BufferedReader(fileReader);
            } catch (Throwable unused) {
                bufferedReader = null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            fileReader = null;
        }
        try {
            line = bufferedReader.readLine();
            try {
                bufferedReader.close();
            } catch (Throwable unused3) {
            }
        } catch (Throwable unused4) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused5) {
                }
            }
            line = null;
            if (fileReader != null) {
                fileReader.close();
            }
            if (line == null) {
            }
        }
        fileReader.close();
        if (line == null) {
            String strTrim = line.trim();
            int i2 = asBinder + 61;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return strTrim;
        }
        int i4 = asBinder + 7;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr = new Object[1];
        d(null, null, new byte[]{-127}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, objArr);
        return ((String) objArr[0]).intern();
    }

    private static String a(HashMap<String, String> map, String str) {
        String str2;
        int i = 2 % 2;
        int i2 = asBinder + 61;
        asInterface = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                str2 = map.get(str);
                int i3 = 81 / 0;
            } else {
                str2 = map.get(str);
            }
        } catch (Throwable unused) {
            str2 = null;
        }
        if (str2 != null) {
            return str2.trim();
        }
        int i4 = asBinder + 1;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return "";
        }
        throw null;
    }

    private static HashMap<String, String> b() {
        FileReader fileReader;
        String strTrim;
        String strTrim2;
        int i = 2 % 2;
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split(":", 2);
                        if (strArrSplit.length >= 2) {
                            int i2 = asBinder + 113;
                            asInterface = i2 % 128;
                            if (i2 % 2 != 0) {
                                strTrim = strArrSplit[1].trim();
                                strTrim2 = strArrSplit[1].trim();
                                if (map.get(strTrim) == null) {
                                    map.put(strTrim, strTrim2);
                                }
                            } else {
                                strTrim = strArrSplit[0].trim();
                                strTrim2 = strArrSplit[1].trim();
                                if (map.get(strTrim) == null) {
                                    map.put(strTrim, strTrim2);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                int i3 = asInterface + 93;
                                asBinder = i3 % 128;
                                int i4 = i3 % 2;
                            } catch (Throwable unused2) {
                            }
                        }
                        if (fileReader != null) {
                            fileReader.close();
                        }
                        return map;
                    }
                }
                int i5 = asBinder + 93;
                asInterface = i5 % 128;
                try {
                    if (i5 % 2 != 0) {
                        bufferedReader2.close();
                        int i6 = 94 / 0;
                    } else {
                        bufferedReader2.close();
                    }
                } catch (Throwable unused3) {
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        try {
            fileReader.close();
        } catch (Throwable unused6) {
        }
        return map;
    }

    public static String c() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> mapB = b();
            Object[] objArr = new Object[1];
            d(null, null, new byte[]{-123, -124, -125, -126}, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
            jSONObject.put(((String) objArr[0]).intern(), a());
            jSONObject.put("hw", a(mapB, "Hardware"));
            jSONObject.put("max", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", a(mapB, "Features"));
        } catch (Throwable unused) {
        }
        String string = jSONObject.toString();
        if (string == null) {
            int i2 = asBinder + 51;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return "{}";
            }
            int i3 = 19 / 0;
            return "{}";
        }
        String strTrim = string.trim();
        int i4 = asInterface + 89;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return strTrim;
    }

    private static void d(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        Object obj = null;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 77 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i4] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 75, (Process.myTid() >> 22) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
        int i5 = 1052772399;
        if (IAuthTabCallback) {
            int i6 = $10 + 85;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
            char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] * i] >> iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 63 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.getMode(0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(obj, objArr4);
                } else {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 63, 12214 - Color.alpha(0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                obj = null;
                i5 = 1052772399;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        if (!onExtraCallback) {
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i9 = $11 + 33;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback / 0) % defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] >>> iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i10 = $10 + 9;
        $11 = i10 % 128;
        if (i10 % 2 == 0) {
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
            Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), Color.red(0) + 63, 12214 - (ViewConfiguration.getTapTimeout() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i11 = $11 + 37;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{32441, 32462, 32506, 32511, 32460};
        onExtraCallbackWithResult = -1184333975;
        onExtraCallback = true;
        IAuthTabCallback = true;
    }
}
