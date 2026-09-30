package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda12 {
    private static final byte[] $$a;
    private static int IAuthTabCallback;
    private static final int $$b = 65;
    private static int onWarmupCompleted = 0;
    static int onExtraCallback = 0;
    static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda12.$$a
            int r8 = r8 * 31
            int r1 = r8 + 16
            int r7 = r7 * 38
            int r7 = 111 - r7
            int r6 = r6 * 46
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 15
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-6)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda12.a(byte, int, int, java.lang.Object[]):void");
    }

    public static native synchronized long read();

    static {
        byte[] bArr = {77, -67, -125, 9, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        IAuthTabCallback = 1;
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (b2 + 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (65 & 7);
            Object[] objArr2 = new Object[1];
            a(b3, b3, bArr[42], objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onWarmupCompleted;
            int i2 = ((i | 113) << 1) - (i ^ 113);
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
