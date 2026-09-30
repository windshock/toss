package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda17 {
    private static final byte[] $$a;
    private static int IAuthTabCallback;
    private static final int $$b = 147;
    private static int onNavigationEvent = 1;
    static int onWarmupCompleted = 0;
    static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda17.$$a
            int r7 = r7 * 46
            int r7 = 49 - r7
            int r8 = r8 * 31
            int r1 = 47 - r8
            int r6 = r6 * 38
            int r6 = r6 + 73
            byte[] r1 = new byte[r1]
            int r8 = 46 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L31:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-6)
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda17.a(int, byte, short, java.lang.Object[]):void");
    }

    public static native long read(String str, int i);

    static {
        byte[] bArr = {70, -47, -65, 52, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        IAuthTabCallback = 0;
        byte b = (byte) (147 & 5);
        try {
            Object[] objArr = new Object[1];
            a(b, b, bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onNavigationEvent + 91;
            IAuthTabCallback = i % 128;
            int i2 = i % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
