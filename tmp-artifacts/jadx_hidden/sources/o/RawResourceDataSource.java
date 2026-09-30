package o;

/* loaded from: classes.dex */
public class RawResourceDataSource {
    private static final byte[] $$a;
    private static int IAuthTabCallback;
    private static final int $$b = 29;
    private static int onNavigationEvent = 0;
    private static int onExtraCallbackWithResult = 0;
    private static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 46
            int r7 = 50 - r7
            int r8 = r8 * 31
            int r8 = r8 + 16
            int r9 = r9 * 38
            int r9 = r9 + 73
            byte[] r0 = o.RawResourceDataSource.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2c
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            int r9 = r9 + 1
            int r7 = r7 + (-6)
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RawResourceDataSource.a(int, int, byte, java.lang.Object[]):void");
    }

    public static native long read(String str, String[] strArr);

    static {
        byte[] bArr = {48, 86, 58, 71, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        IAuthTabCallback = 1;
        byte b = (byte) (29 & 3);
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
            int i = onNavigationEvent;
            int i2 = (i ^ 87) + ((i & 87) << 1);
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                throw new NullPointerException();
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static int onWarmupCompleted(String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = ((i2 | 35) << 1) - (i2 ^ 35);
        int i4 = i3 % 128;
        onExtraCallbackWithResult = i4;
        int i5 = i3 % 2;
        int length = strArr.length;
        int i6 = (i4 ^ 9) + ((i4 & 9) << 1);
        onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 0;
        while (i8 < length) {
            int i9 = onExtraCallback;
            int i10 = ((i9 | 67) << 1) - (i9 ^ 67);
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                str.contains(strArr[i8]);
                throw new ArithmeticException();
            }
            if (str.contains(strArr[i8])) {
                int i11 = onExtraCallback;
                int i12 = ((i11 | 53) << 1) - (i11 ^ 53);
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                int i14 = i11 + 25;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
                return 1;
            }
            i8++;
            int i16 = onExtraCallback + 111;
            onExtraCallbackWithResult = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 5 % 4;
            }
        }
        return 0;
    }
}
