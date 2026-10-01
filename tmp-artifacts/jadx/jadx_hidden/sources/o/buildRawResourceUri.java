package o;

/* loaded from: classes.dex */
public class buildRawResourceUri {
    private static final byte[] $$a;
    private static final int $$b = 82;
    private static int IAuthTabCallback = 0;
    static int onExtraCallback = 0;
    static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 46
            int r7 = r7 + 4
            int r6 = r6 * 38
            int r6 = 111 - r6
            int r5 = r5 * 31
            int r0 = 47 - r5
            byte[] r1 = o.buildRawResourceUri.$$a
            byte[] r0 = new byte[r0]
            int r5 = 46 - r5
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-6)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.buildRawResourceUri.a(byte, byte, byte, java.lang.Object[]):void");
    }

    public static native long read();

    static {
        byte[] bArr = {126, 1, 26, -71, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onWarmupCompleted = 1;
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[1];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallback;
            int i2 = ((i | 63) << 1) - (i ^ 63);
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
