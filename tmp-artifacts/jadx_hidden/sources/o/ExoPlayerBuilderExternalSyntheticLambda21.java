package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda21 {
    private static final byte[] $$a;
    private static int onExtraCallback;
    private static final int $$b = 145;
    private static int onExtraCallbackWithResult = 1;
    static int onWarmupCompleted = 0;
    static int onNavigationEvent = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda21.$$a
            int r8 = r8 * 46
            int r8 = 50 - r8
            int r9 = r9 * 38
            int r9 = 111 - r9
            int r7 = r7 * 31
            int r7 = 47 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2f:
            int r8 = r8 + 1
            int r9 = r9 + r3
            int r9 = r9 + (-6)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda21.a(int, byte, int, java.lang.Object[]):void");
    }

    static native long read();

    static {
        byte[] bArr = {105, -91, -115, 31, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onExtraCallback = 0;
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b2, (byte) (b2 + 1), b, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            Object[] objArr2 = new Object[1];
            a((byte) (145 & 7), b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallbackWithResult;
            int i2 = ((i | 9) << 1) - (i ^ 9);
            onExtraCallback = i2 % 128;
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
