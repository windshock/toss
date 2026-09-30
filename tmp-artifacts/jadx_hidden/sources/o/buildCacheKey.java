package o;

/* loaded from: classes.dex */
public class buildCacheKey {
    private static final byte[] $$a;
    private static int onWarmupCompleted;
    private static final int $$b = 182;
    private static int onNavigationEvent = 1;
    static int onExtraCallbackWithResult = 0;
    static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = o.buildCacheKey.$$a
            int r6 = r6 * 46
            int r6 = r6 + 4
            int r5 = r5 * 31
            int r1 = r5 + 16
            int r7 = r7 * 38
            int r7 = r7 + 73
            byte[] r1 = new byte[r1]
            int r5 = r5 + 15
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r5
            r3 = r6
            r4 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-6)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.buildCacheKey.a(int, byte, byte, java.lang.Object[]):void");
    }

    public static native long read();

    static {
        byte[] bArr = {79, 23, 89, 11, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onWarmupCompleted = 0;
        try {
            byte b = (byte) (bArr[13] - 1);
            byte b2 = bArr[42];
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (b2 + 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b4, (byte) (b4 + 1), b3, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onNavigationEvent;
            int i2 = ((i | 65) << 1) - (65 ^ i);
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
