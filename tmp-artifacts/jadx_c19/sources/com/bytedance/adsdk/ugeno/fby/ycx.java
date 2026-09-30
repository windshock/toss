package com.bytedance.adsdk.ugeno.fby;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static char[] onWarmupCompleted = {64989, 64960, 64967, 64963, 64961, 64991, 64982, 64978, 64988};
    private static char onNavigationEvent = 51242;

    /* renamed from: com.bytedance.adsdk.ugeno.fby.ycx$ycx, reason: collision with other inner class name */
    public static class C0005ycx {
        public float[] sya;
        public GradientDrawable.Orientation ycx;
        public int[] zb;
    }

    public static int ycx(String str) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 65;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ycx(str, -16777216);
            throw null;
        }
        int iYcx = ycx(str, -16777216);
        int i4 = onExtraCallback + 53;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return iYcx;
        }
        obj.hashCode();
        throw null;
    }

    public static int ycx(String str, int i2) throws Throwable {
        int i3 = 2 % 2;
        if (!TextUtils.isEmpty(str)) {
            Object[] objArr = new Object[1];
            a(new char[]{1, 5, 6, 1, 0, 4, 1, 7, 0, 3, 13825}, (byte) (Process.getGidForName("") + 20), TextUtils.lastIndexOf("", '0', 0) + 12, objArr);
            if (str.equals(((String) objArr[0]).intern())) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i4 = 1; i4 < charArray.length; i4++) {
                    int i5 = onExtraCallback + 95;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                    sb.append(charArray[i4]);
                    sb.append(charArray[i4]);
                }
                return Color.parseColor(sb.toString());
            }
            if (str.charAt(0) == '#') {
                int i7 = onExtraCallbackWithResult + 107;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                if (str.length() == 7) {
                    return Color.parseColor(str);
                }
            }
            if (str.charAt(0) == '#') {
                int i9 = onExtraCallback + 105;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 == 0 ? str.length() == 9 : str.length() == 26) {
                    return Color.parseColor(str);
                }
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null) {
                int i10 = onExtraCallback + 57;
                int i11 = i10 % 128;
                onExtraCallbackWithResult = i11;
                int i12 = i10 % 2;
                if (strArrSplit.length == 4) {
                    int i13 = i11 + 5;
                    onExtraCallback = i13 % 128;
                    int i14 = i13 % 2;
                    return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
                }
            }
        }
        return i2;
    }

    public static C0005ycx zb(String str) {
        int iIndexOf;
        int i2 = 2 % 2;
        Object obj = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
                if (TextUtils.isEmpty(strSubstring)) {
                    int i3 = onExtraCallbackWithResult + 7;
                    int i4 = i3 % 128;
                    onExtraCallback = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 13;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 34 / 0;
                    }
                    return null;
                }
                int iYcx = ycx(strSubstring, '%');
                int iIndexOf2 = strSubstring.indexOf(",");
                String strSubstring2 = strSubstring.substring(0, iIndexOf2);
                C0005ycx c0005ycx = new C0005ycx();
                c0005ycx.ycx = dj(strSubstring2);
                String strSubstring3 = strSubstring.substring(iIndexOf2 + 1);
                int[] iArr = new int[iYcx];
                float[] fArr = new float[iYcx];
                int i8 = 0;
                while (i8 < iYcx) {
                    int iIndexOf3 = strSubstring3.indexOf("%");
                    String strTrim = strSubstring3.substring(0, iIndexOf3 + 1).trim();
                    if (strTrim.contains("rgba")) {
                        int i9 = onExtraCallbackWithResult + 29;
                        onExtraCallback = i9 % 128;
                        int i10 = i9 % 2;
                        iIndexOf = strTrim.indexOf(")");
                    } else {
                        iIndexOf = strTrim.indexOf(" ");
                    }
                    int i11 = iIndexOf + 1;
                    iArr[i8] = ycx(strTrim.substring(0, i11).trim());
                    fArr[i8] = sya.ycx(strTrim.substring(i11, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                    int i12 = iIndexOf3 + 2;
                    if (strSubstring3.length() <= i12) {
                        break;
                    }
                    int i13 = onExtraCallback + 49;
                    onExtraCallbackWithResult = i13 % 128;
                    if (i13 % 2 != 0) {
                        strSubstring3 = strSubstring3.substring(i12);
                        i8 += 63;
                    } else {
                        strSubstring3 = strSubstring3.substring(i12);
                        i8++;
                    }
                }
                if (iYcx >= 2) {
                    c0005ycx.zb = iArr;
                    c0005ycx.sya = fArr;
                    return c0005ycx;
                }
                int i14 = onExtraCallbackWithResult + 69;
                onExtraCallback = i14 % 128;
                if (i14 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static int ycx(String str, char c) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        int i4 = 0;
        if (i3 % 2 != 0 ? TextUtils.isEmpty(str) : !(!TextUtils.isEmpty(str))) {
            int i5 = onExtraCallbackWithResult + 23;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int i7 = 0;
        while (i4 < str.length()) {
            int i8 = onExtraCallbackWithResult + 77;
            onExtraCallback = i8 % 128;
            if (i8 % 2 == 0) {
                str.charAt(i4);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (str.charAt(i4) == c) {
                i7++;
            }
            i4++;
            int i9 = onExtraCallback + 43;
            onExtraCallbackWithResult = i9 % 128;
            int i10 = i9 % 2;
        }
        return i7;
    }

    public static boolean sya(String str) {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            int i3 = onExtraCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!str.startsWith("linear-gradient")) {
            return false;
        }
        int i5 = onExtraCallback;
        int i6 = i5 + 31;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 65;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public static GradientDrawable.Orientation dj(String str) throws NumberFormatException {
        int i2;
        int i3 = 2 % 2;
        try {
            if (!(!str.contains("deg"))) {
                int i4 = onExtraCallbackWithResult + 25;
                onExtraCallback = i4 % 128;
                i2 = Integer.parseInt((i4 % 2 == 0 ? str.substring(1, str.length() * 3) : str.substring(0, str.length() - 3)).trim());
                int i5 = onExtraCallback + 91;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i2 = Integer.parseInt(str);
            }
            if (i2 == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i2 == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i2 == 270) {
                int i7 = onExtraCallbackWithResult + 91;
                onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i2 == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (i2 != 45) {
                return GradientDrawable.Orientation.BOTTOM_TOP;
            }
            int i9 = onExtraCallbackWithResult + 19;
            onExtraCallback = i9 % 128;
            if (i9 % 2 != 0) {
                return GradientDrawable.Orientation.BL_TR;
            }
            int i10 = 44 / 0;
            return GradientDrawable.Orientation.BL_TR;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int ycx(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult;
        int i6 = i5 + 23;
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        if (i3 < 0 || i3 > 255) {
            int i8 = i5 + 43;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            i3 = 255;
        }
        return (i2 & 16777215) | (i3 << 24);
    }

    private static void a(char[] cArr, byte b, int i2, Object[] objArr) throws Throwable {
        int i3;
        Object obj;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = onWarmupCompleted;
        int i5 = -1310771303;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), 26 - TextUtils.indexOf("", "", 0, 0), 23139 - ExpandableListView.getPackedPositionType(j), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i6++;
                    i5 = -1310771303;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $10 + 65;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 % 5;
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(onNavigationEvent)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getTrimmedLength(""), 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 23138 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i2];
        if (i2 % 2 != 0) {
            i3 = i2 - 1;
            cArr4[i3] = (char) (cArr[i3] - b);
        } else {
            i3 = i2;
        }
        if (i3 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i3) {
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback != defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24823 - TextUtils.lastIndexOf("", '0')), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 74, 8088 - View.resolveSizeAndState(0, 0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        try {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.indexOf("", "", 0, 0) + 30, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 19488, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i9 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i9];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i10 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i10];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i11];
                        } else {
                            int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i12];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i13];
                        }
                    }
                } else {
                    int i14 = $10 + 81;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback % b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback >>> b);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    }
                    obj = obj2;
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i2; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }
}
