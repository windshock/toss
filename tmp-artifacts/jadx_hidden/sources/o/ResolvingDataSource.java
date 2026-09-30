package o;

/* loaded from: classes.dex */
public class ResolvingDataSource {
    private static final byte[] $$a;
    private static int IAuthTabCallback;
    private static final int $$b = 200;
    private static int onWarmupCompleted = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 38
            int r8 = 111 - r8
            int r7 = r7 * 46
            int r7 = 49 - r7
            byte[] r0 = o.ResolvingDataSource.$$a
            int r6 = r6 * 31
            int r1 = 47 - r6
            byte[] r1 = new byte[r1]
            int r6 = 46 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2f:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-6)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ResolvingDataSource.a(short, int, int, java.lang.Object[]):void");
    }

    public static native String run(String str);

    static {
        byte[] bArr = {1, -53, 31, 101, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        IAuthTabCallback = 1;
        try {
            byte b = bArr[42];
            Object[] objArr = new Object[1];
            a(b, bArr[0], b, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[0];
            Object[] objArr2 = new Object[1];
            a(b2, bArr[42], b2, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onWarmupCompleted;
            int i2 = (i & 55) + (i | 55);
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
}
