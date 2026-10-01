package o;

import android.os.Build;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda2 {
    private static final long[] IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int asInterface = 0;
    private static char[] onExtraCallback = null;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 0;
    private static int onTransact = 1;
    private static int onWarmupCompleted = 1;

    static {
        onExtraCallbackWithResult();
        IAuthTabCallback = new long[]{472001035};
        int i = IAuthTabCallbackDefault + 81;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            throw new NullPointerException();
        }
    }

    private static int onWarmupCompleted(int i) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        onExtraCallback(new int[]{0, 17, 6, 7}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000", false, objArr);
        if (ResolvingDataSourceFactory.onExtraCallbackWithResult(((String) objArr[0]).intern(), 5, 1073741823L, IAuthTabCallback) <= 0) {
            if (Build.VERSION.SDK_INT >= 24) {
                return i;
            }
            Object[] objArr2 = new Object[1];
            onExtraCallback(new int[]{17, 6, 0, 6}, "\u0001\u0001\u0001\u0000\u0000\u0000", false, objArr2);
            Matcher matcher = Pattern.compile((String) objArr2[0]).matcher("");
            Object[] objArr3 = new Object[1];
            onExtraCallback(new int[]{23, 6, 0, 2}, "\u0001\u0000\u0000\u0001\u0000\u0001", false, objArr3);
            File[] fileArrListFiles = new File((String) objArr3[0]).listFiles();
            if (fileArrListFiles != null) {
                int i3 = 0;
                for (int i4 = 0; i4 < fileArrListFiles.length && i3 < 3; i4++) {
                    int i5 = onNavigationEvent + 73;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        File file = fileArrListFiles[i4];
                        if (file != null && file.isDirectory() && matcher.reset(fileArrListFiles[i4].getName()).matches()) {
                            i3++;
                            StringBuilder sb = new StringBuilder();
                            sb.append(fileArrListFiles[i4].getAbsolutePath());
                            Object[] objArr4 = new Object[1];
                            onExtraCallback(new int[]{29, 7, 187, 4}, "\u0000\u0001\u0000\u0001\u0000\u0000\u0000", false, objArr4);
                            sb.append((String) objArr4[0]);
                            if (ResolvingDataSourceFactory.onExtraCallbackWithResult(sb.toString(), 5, 1073741823L, IAuthTabCallback) > 0) {
                                return i ^ 241;
                            }
                        }
                    } else {
                        File file2 = fileArrListFiles[i4];
                        throw new ArithmeticException();
                    }
                }
            }
            return i;
        }
        int i6 = onWarmupCompleted + 27;
        int i7 = i6 % 128;
        onNavigationEvent = i7;
        int i8 = i6 % 2 != 0 ? i ^ 9342 : i ^ 240;
        int i9 = i7 + 109;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return i8;
    }

    private static int IAuthTabCallback(int i) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        onExtraCallback(new int[]{36, 22, 101, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000", true, objArr);
        if (ResolvingDataSourceFactory.onExtraCallbackWithResult((String) objArr[0], 5, 1073741823L, IAuthTabCallback) > 0) {
            int i3 = onWarmupCompleted + 79;
            onNavigationEvent = i3 % 128;
            return i3 % 2 != 0 ? i ^ 3067 : i ^ 242;
        }
        int i4 = onNavigationEvent + 3;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return i;
        }
        throw new NullPointerException();
    }

    private static int onExtraCallbackWithResult(int i) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 81;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int iOnWarmupCompleted = onWarmupCompleted(i);
        if (iOnWarmupCompleted == i) {
            int iIAuthTabCallback = IAuthTabCallback(i);
            if (iIAuthTabCallback == i) {
                return i;
            }
            int i5 = onWarmupCompleted + 39;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return iIAuthTabCallback;
            }
            throw new NullPointerException();
        }
        int i6 = onNavigationEvent + 115;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return iOnWarmupCompleted;
    }

    public static int onExtraCallback(int i) throws UnsupportedEncodingException {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 105;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallbackWithResult(i);
            throw new NullPointerException();
        }
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
        if (iOnExtraCallbackWithResult != i) {
            return iOnExtraCallbackWithResult;
        }
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    private static void onExtraCallback(int[] iArr, String str, boolean z, Object[] objArr) throws UnsupportedEncodingException {
        char[] cArr;
        String str2 = str;
        int i = 2 % 2;
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0 = new UtilExternalSyntheticLambda0();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = onExtraCallback;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                cArr3[i8] = (char) (cArr2[i8] - 4301814714517170301L);
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            char[] cArr5 = new char[i5];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i5) {
                if (bArr[utilExternalSyntheticLambda0.onNavigationEvent] != 1) {
                    cArr5[utilExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr4[utilExternalSyntheticLambda0.onNavigationEvent] << 1) - c);
                } else {
                    int i9 = onTransact + 109;
                    asInterface = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr5[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[utilExternalSyntheticLambda0.onNavigationEvent] + 4 + c);
                    } else {
                        cArr5[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (((cArr4[utilExternalSyntheticLambda0.onNavigationEvent] << 1) + 1) - c);
                    }
                }
                c = cArr5[utilExternalSyntheticLambda0.onNavigationEvent];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i10 = onTransact + 91;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr4, 0, cArr6, 0, i5);
            int i12 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr4, i12, i7);
            System.arraycopy(cArr6, i7, cArr4, 0, i12);
        }
        if (z) {
            char[] cArr7 = new char[i5];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i5) {
                cArr7[utilExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i5 - utilExternalSyntheticLambda0.onNavigationEvent) - 1];
                utilExternalSyntheticLambda0.onNavigationEvent++;
                int i13 = asInterface + 101;
                onTransact = i13 % 128;
                int i14 = i13 % 2;
            }
            cArr = cArr7;
        } else {
            cArr = cArr4;
        }
        if (i6 > 0) {
            int i15 = onTransact + 13;
            asInterface = i15 % 128;
            int i16 = i15 % 2;
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i5) {
                int i17 = asInterface + 91;
                onTransact = i17 % 128;
                int i18 = i17 % 2;
                cArr[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr[utilExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = new char[]{10391, 10449, 10481, 10485, 10484, 10484, 10486, 10452, 10450, 10484, 10483, 10476, 10444, 10452, 10479, 10475, 10476, 10410, 10434, 10411, 10416, 10440, 10433, 10414, 10438, 10412, 10444, 10478, 10477, 10517, 10665, 10665, 10667, 10633, 10630, 10662, 10476, 10576, 10568, 10572, 10575, 10577, 10545, 10549, 10584, 10579, 10573, 10572, 10570, 10574, 10547, 10547, 10574, 10540, 10547, 10584, 10584, 10547};
    }
}
