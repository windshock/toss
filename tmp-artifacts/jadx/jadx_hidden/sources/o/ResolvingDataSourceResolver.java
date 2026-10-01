package o;

/* loaded from: classes.dex */
public class ResolvingDataSourceResolver {
    private static final byte[] $$a;
    private static int onExtraCallbackWithResult;
    private static final int $$b = 151;
    private static int onNavigationEvent = 1;
    static int onExtraCallback = 0;
    static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 46
            int r7 = 50 - r7
            byte[] r0 = o.ResolvingDataSourceResolver.$$a
            int r8 = r8 * 31
            int r1 = r8 + 16
            int r6 = r6 * 38
            int r6 = r6 + 73
            byte[] r1 = new byte[r1]
            int r8 = r8 + 15
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
            int r3 = r3 + 1
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            int r6 = r6 + 1
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ResolvingDataSourceResolver.a(int, byte, short, java.lang.Object[]):void");
    }

    public static native long read(String str);

    static {
        byte[] bArr = {70, -47, -65, 52, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onExtraCallbackWithResult = 0;
        byte b = (byte) (151 & 1);
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
            int i2 = (i ^ 55) + ((i & 55) << 1);
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                throw new ArithmeticException();
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
