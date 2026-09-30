package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda10 {
    private static final byte[] $$a;
    private static int IAuthTabCallback;
    private static final int $$b = 160;
    private static int onExtraCallbackWithResult = 1;
    static int onNavigationEvent = 0;
    static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 38
            int r7 = 111 - r7
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda10.$$a
            int r6 = r6 * 46
            int r6 = r6 + 4
            int r5 = r5 * 31
            int r1 = r5 + 16
            byte[] r1 = new byte[r1]
            int r5 = r5 + 15
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r6]
        L2a:
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-6)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda10.a(byte, byte, int, java.lang.Object[]):void");
    }

    static native long read(int i);

    static {
        byte[] bArr = {48, 86, 58, 71, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        IAuthTabCallback = 0;
        try {
            byte b = (byte) (bArr[28] - 1);
            byte b2 = bArr[42];
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            byte b4 = (byte) (b3 + 1);
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallbackWithResult;
            int i2 = ((i | 103) << 1) - (i ^ 103);
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
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
