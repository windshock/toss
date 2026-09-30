package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda3 {
    private static final byte[] $$a;
    private static int onExtraCallback;
    private static final int $$b = 106;
    private static int IAuthTabCallback = 1;
    static int onNavigationEvent = 0;
    static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda3.$$a
            int r7 = r7 * 46
            int r7 = 49 - r7
            int r9 = r9 * 38
            int r9 = 111 - r9
            int r8 = r8 * 31
            int r8 = r8 + 16
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r7
            int r7 = r3 + (-6)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda3.a(byte, short, int, java.lang.Object[]):void");
    }

    public static native long read(int i);

    static {
        byte[] bArr = {46, -35, 45, 111, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onExtraCallback = 0;
        try {
            byte b = (byte) (bArr[28] - 1);
            Object[] objArr = new Object[1];
            a(b, b, bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallback + 9;
            onExtraCallback = i % 128;
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
