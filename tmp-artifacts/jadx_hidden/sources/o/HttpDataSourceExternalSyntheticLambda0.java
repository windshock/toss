package o;

/* loaded from: classes.dex */
public class HttpDataSourceExternalSyntheticLambda0 {
    private static final byte[] $$a;
    private static int onWarmupCompleted;
    private static final int $$b = 76;
    private static int onNavigationEvent = 0;
    static int IAuthTabCallback = 0;
    static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.HttpDataSourceExternalSyntheticLambda0.$$a
            int r6 = r6 * 38
            int r6 = 111 - r6
            int r7 = r7 * 46
            int r7 = 49 - r7
            int r8 = r8 * 31
            int r1 = 47 - r8
            byte[] r1 = new byte[r1]
            int r8 = 46 - r8
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r7
            r7 = r8
            r4 = r2
            goto L32
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
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-6)
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HttpDataSourceExternalSyntheticLambda0.a(byte, short, byte, java.lang.Object[]):void");
    }

    public static native long read();

    static {
        byte[] bArr = {101, 74, 115, 66, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onWarmupCompleted = 1;
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b2, (byte) (b2 + 1), b, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (bArr[13] - 1);
            byte b4 = bArr[42];
            Object[] objArr2 = new Object[1];
            a(b3, b4, (byte) (b4 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onNavigationEvent;
            int i2 = (i & 21) + (i | 21);
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
