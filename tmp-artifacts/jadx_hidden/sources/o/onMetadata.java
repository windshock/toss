package o;

/* loaded from: classes.dex */
public class onMetadata {
    private static final byte[] $$a;
    private static int onExtraCallbackWithResult;
    private static final int $$b = 32;
    private static int onNavigationEvent = 1;
    static int onWarmupCompleted = 0;
    static int IAuthTabCallback = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 38
            int r9 = r9 + 73
            byte[] r0 = o.onMetadata.$$a
            int r7 = r7 * 46
            int r7 = 49 - r7
            int r8 = r8 * 31
            int r8 = 47 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-6)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onMetadata.a(byte, int, byte, java.lang.Object[]):void");
    }

    public static native long read();

    public static native long run();

    static {
        byte[] bArr = {90, 10, -103, 87, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onExtraCallbackWithResult = 0;
        try {
            byte b = (byte) (bArr[28] - 1);
            byte b2 = bArr[42];
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (b2 + 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b4, (byte) (b4 + 1), b3, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onNavigationEvent + 3;
            onExtraCallbackWithResult = i % 128;
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
