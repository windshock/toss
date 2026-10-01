package o;

import android.graphics.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda14 {
    private static final byte[] $$a;
    private static long onExtraCallbackWithResult;
    private static int onWarmupCompleted;
    private static final int $$b = 57;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = 1;
    static int onExtraCallback = 0;
    static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 38
            int r5 = r5 + 73
            int r7 = r7 * 31
            int r0 = r7 + 16
            int r6 = r6 * 46
            int r6 = 50 - r6
            byte[] r1 = o.ExoPlayerBuilderExternalSyntheticLambda14.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 15
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r6]
        L2a:
            int r5 = r5 + r3
            int r5 = r5 + (-6)
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda14.a(int, int, short, java.lang.Object[]):void");
    }

    public static native long read(String str, String str2);

    static {
        byte[] bArr = {62, 54, 60, 44, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onWarmupCompleted = 0;
        onExtraCallbackWithResult();
        byte b = (byte) (57 & 7);
        byte b2 = b;
        try {
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallback + 105;
            onWarmupCompleted = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static int onWarmupCompleted(String str, String str2) {
        int i = 2 % 2;
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            try {
                Scanner scanner = new Scanner(new FileInputStream(file));
                Object[] objArr = new Object[1];
                onExtraCallbackWithResult("掌뽂", Color.alpha(0) + 56531, objArr);
                Scanner scannerUseDelimiter = scanner.useDelimiter((String) objArr[0]);
                String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
                scannerUseDelimiter.close();
                if (next.contains(str2)) {
                    int i2 = onExtraCallback + 57;
                    onNavigationEvent = i2 % 128;
                    return i2 % 2 == 0 ? 0 : 1;
                }
                int i3 = onExtraCallback + 59;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
            } catch (IOException unused) {
            }
        }
        return 0;
    }

    private static void onExtraCallbackWithResult(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub;
        int i4 = i3 + 93;
        IAuthTabCallbackDefault = i4 % 128;
        char[] charArray = str;
        if (i4 % 2 != 0) {
            throw new ArithmeticException();
        }
        if (str != null) {
            int i5 = i3 + 25;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                throw new NullPointerException();
            }
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda4 utilExternalSyntheticLambda4 = new UtilExternalSyntheticLambda4();
        utilExternalSyntheticLambda4.onExtraCallbackWithResult = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            jArr[utilExternalSyntheticLambda4.IAuthTabCallback] = (cArr[utilExternalSyntheticLambda4.IAuthTabCallback] ^ (utilExternalSyntheticLambda4.IAuthTabCallback * utilExternalSyntheticLambda4.onExtraCallbackWithResult)) ^ (onExtraCallbackWithResult - (-916733648318839497L));
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        char[] cArr2 = new char[length];
        utilExternalSyntheticLambda4.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda4.IAuthTabCallback < cArr.length) {
            cArr2[utilExternalSyntheticLambda4.IAuthTabCallback] = (char) jArr[utilExternalSyntheticLambda4.IAuthTabCallback];
            utilExternalSyntheticLambda4.IAuthTabCallback++;
        }
        String str2 = new String(cArr2);
        int i6 = IAuthTabCallbackDefault + 91;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 == 0) {
            throw new ArithmeticException();
        }
        objArr[0] = str2;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = 1105318893880420615L;
    }
}
