package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.tosssecurities.features.main.ui.TossSecMainViewModel;
import java.lang.reflect.Method;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ulycxycx {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 1;
    private static int onExtraCallback;
    private static char[] onNavigationEvent = {32555};
    private static int onExtraCallbackWithResult = -1184334053;
    private static boolean onWarmupCompleted = true;
    private static boolean IAuthTabCallback = true;

    private static int onExtraCallback(int i) {
        int i2 = 2 % 2;
        if (i < 32) {
            int i3 = onExtraCallback + 105;
            asBinder = i3 % 128;
            return i3 % 2 == 0 ? 1 : 0;
        }
        if (i == 37) {
            return 0;
        }
        int i4 = asBinder + 85;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~((~i3) | i5);
        int i8 = (~((~i5) | (~i4))) | i7;
        int i9 = i5 | i4;
        int i10 = i5 + i4 + i + ((-39394691) * i2) + ((-2104995841) * i6);
        int i11 = i10 * i10;
        int i12 = (i5 * (-1880913482)) + 198443008 + ((-1880913482) * i4) + ((-1126725195) * i7) + (i8 * 1126725195) + (1126725195 * i9) + ((-754188288) * i) + ((-1529085952) * i2) + ((-319553536) * i6) + ((-289079296) * i11);
        int i13 = ((i5 * 1773844906) - 1404835566) + (i4 * 1773844906) + (i7 * (-613)) + (i8 * 613) + (i9 * 613) + (i * 1773845519) + (i2 * 1055723859) + (i6 * 1996616689) + (i11 * (-1450508288));
        return i12 + ((i13 * i13) * (-778371072)) != 1 ? onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static int onExtraCallbackWithResult(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder + 49;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            i6 |= (bArr[i + i7] & 255) << (i7 << 3);
        }
        int i8 = asBinder + 123;
        onExtraCallback = i8 % 128;
        if (i8 % 2 == 0) {
            return i6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int onNavigationEvent(byte[] bArr, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = onExtraCallback + 45;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
            i4 |= (bArr[i + i5] & 255) << (((i2 - i5) - 1) << 3);
        }
        int i8 = asBinder + 53;
        onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 47 / 0;
        }
        return i4;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        char[] cArr2;
        Object obj;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        if (cArr3 != null) {
            int i3 = $10 + 105;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), 77 - Color.argb(0, 0, 0, 0), TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET) + 20952, 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), 76 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 16038 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            int i6 = 1052772399;
            if (IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i6);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSize(0, 0), Color.alpha(0) + 63, 12213 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i6 = 1052772399;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!onWarmupCompleted) {
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
            int i7 = $10 + 93;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 1;
            } else {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                cArr2 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            }
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i8 = $11 + 113;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] * iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 63, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    obj = null;
                } else {
                    cArr2[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getLongPressTimeout() >> 16), 63 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 12214 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    obj = null;
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
            }
            objArr[0] = new String(cArr2);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    public static int onExtraCallbackWithResult(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = asBinder + 107;
        onExtraCallback = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            Math.min(onExtraCallback(bArr2, i2), i3);
            obj.hashCode();
            throw null;
        }
        int iMin = Math.min(onExtraCallback(bArr2, i2), i3);
        if (iMin == 0) {
            return iMin;
        }
        System.arraycopy(bArr2, i2, bArr, i, iMin);
        int i6 = onExtraCallback + 53;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return iMin;
        }
        throw null;
    }

    public static void onWarmupCompleted(byte[] bArr, int i, byte b, int i2) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 113;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i;
        while (i5 < i2 + i) {
            int i6 = asBinder + 61;
            int i7 = i6 % 128;
            onExtraCallback = i7;
            if (i6 % 2 != 0) {
                bArr[i5] = b;
                i5 += 81;
            } else {
                bArr[i5] = b;
                i5++;
            }
            int i8 = i7 + 45;
            asBinder = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 4;
            }
        }
    }

    public static int onExtraCallback(byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        if (bArr == null) {
            int i7 = i3 + 109;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return 0;
        }
        int length = bArr.length;
        int i9 = i3 + 27;
        onExtraCallback = i9 % 128;
        int i10 = i9 % 2;
        while (i6 < length - i) {
            int i11 = asBinder + 35;
            onExtraCallback = i11 % 128;
            if (i11 % 2 == 0) {
                if (bArr[i + i6] == 0) {
                    break;
                }
                i6++;
            } else {
                if (bArr[i / i6] == 0) {
                    break;
                }
                i6++;
            }
        }
        int i12 = onExtraCallback + 13;
        asBinder = i12 % 128;
        int i13 = i12 % 2;
        return i6;
    }

    public static boolean onExtraCallbackWithResult(String str) {
        int i = 2 % 2;
        if (str == null) {
            return true;
        }
        int i2 = asBinder + 55;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (str.length() == 0) {
            return true;
        }
        int i4 = asBinder + 79;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static final void onWarmupCompleted(String str, byte[] bArr, int i) {
        int i2 = 2 % 2;
        int i3 = asBinder + 5;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{str, bArr, 0, Integer.valueOf(i)}, 2118917951, -2118917950, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        } else {
            onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), new Object[]{str, bArr, 0, Integer.valueOf(i)}, 2118917951, -2118917950, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int i;
        int i2 = 0;
        String str = (String) objArr[0];
        int i3 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int i4 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        int i5 = 2 % 2;
        byte[] bArr2 = new byte[17];
        int iIntValue2 = ((Number) objArr[3]).intValue() + iIntValue;
        xkzzb.onExtraCallback(str + "()================================= ,size={ [" + iIntValue2 + "]");
        int i6 = iIntValue;
        while (i6 < iIntValue2) {
            int i7 = asBinder + 125;
            onExtraCallback = i7 % 128;
            int i8 = i7 % i4;
            String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            if (i8 != 0) {
                int i9 = 96 / i2;
            }
            int i10 = i6;
            while (true) {
                i = i6 + 16;
                String hexString = "  ";
                if (i10 >= i) {
                    break;
                }
                int i11 = asBinder + 83;
                int i12 = i11 % 128;
                onExtraCallback = i12;
                int i13 = i11 % i4;
                if (i10 < iIntValue2) {
                    int i14 = i12 + 119;
                    asBinder = i14 % 128;
                    int i15 = i14 % i4;
                    hexString = Integer.toHexString(bArr[i10] & 255);
                    if (hexString.length() < i4) {
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr3 = new byte[i3];
                        bArr3[i2] = -127;
                        Object[] objArr2 = new Object[i3];
                        a(null, null, bArr3, Color.blue(i2) + 127, objArr2);
                        sb.append(((String) objArr2[i2]).intern());
                        sb.append(hexString);
                        hexString = sb.toString();
                    }
                }
                String str3 = str2 + hexString;
                if (i10 % 2 != 0) {
                    str3 = str3 + ' ';
                }
                str2 = str3;
                i10++;
                i4 = 2;
            }
            String str4 = str2 + "   |";
            onWarmupCompleted(bArr2, i2, (byte) 32, 17);
            if (i < iIntValue2) {
                int i16 = onExtraCallback + 111;
                asBinder = i16 % 128;
                int i17 = i16 % 2;
                onExtraCallbackWithResult(bArr2, i2, bArr, i6, 16);
                int i18 = asBinder + 71;
                onExtraCallback = i18 % 128;
                int i19 = i18 % 2;
            } else {
                onExtraCallbackWithResult(bArr2, i2, bArr, i6, iIntValue2 - i6);
            }
            for (int i20 = i2; i20 < 16; i20++) {
                int i21 = asBinder + 75;
                onExtraCallback = i21 % 128;
                if (i21 % 2 != 0) {
                    if (onExtraCallback(onExtraCallbackWithResult(bArr2, i20, i2)) == 0) {
                        bArr2[i20] = 46;
                    }
                } else if (onExtraCallback(onExtraCallbackWithResult(bArr2, i20, i3)) == 0) {
                }
            }
            StringBuffer stringBuffer = new StringBuffer("00000000");
            String hexString2 = Integer.toHexString(i6 - iIntValue);
            int length = stringBuffer.length();
            int length2 = hexString2.length();
            for (int i22 = i3; i22 <= length2; i22++) {
                stringBuffer.setCharAt(length - i22, hexString2.charAt(length2 - i22));
            }
            xkzzb.onExtraCallback(((stringBuffer.toString() + "  ") + str4) + new String(bArr2));
            i6 = i;
            i4 = 2;
            i2 = 0;
            i3 = 1;
        }
        xkzzb.onExtraCallback(" ================================= }" + str + "() end!");
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 0;
        byte[] bArr = (byte[]) objArr[0];
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        while (i < bArr.length) {
            str = str + Integer.toString((bArr[i] & 255) + 256, 16).substring(1);
            i++;
            int i5 = onExtraCallback + 15;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        return str;
    }

    public static final void onNavigationEvent(String str, byte[] bArr, int i, int i2) {
        Object[] objArr = {str, bArr, Integer.valueOf(i), Integer.valueOf(i2)};
        onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), objArr, 2118917951, -2118917950, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }

    public static String onWarmupCompleted(byte[] bArr) {
        int iOnExtraCallbackWithResult = TossSecMainViewModel.asInterface.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), TossSecMainViewModel.asInterface.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{bArr}, -2935818, 2935818, TossSecMainViewModel.asInterface.onExtraCallbackWithResult());
    }
}
