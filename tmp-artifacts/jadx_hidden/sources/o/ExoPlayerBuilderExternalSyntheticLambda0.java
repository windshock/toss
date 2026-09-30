package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda0 {
    private static final byte[] $$a;
    private static int onNavigationEvent;
    private static final int $$b = 240;
    private static int onExtraCallback = 1;
    static int onExtraCallbackWithResult = 0;
    static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 46
            int r6 = 49 - r6
            int r5 = r5 * 38
            int r5 = 111 - r5
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda0.$$a
            int r7 = r7 * 31
            int r1 = r7 + 16
            byte[] r1 = new byte[r1]
            int r7 = r7 + 15
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2d:
            int r5 = r5 + r4
            int r5 = r5 + (-6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda0.a(byte, int, int, java.lang.Object[]):void");
    }

    public static native long read();

    static {
        byte[] bArr = {2, 105, -126, -86, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onNavigationEvent = 0;
        try {
            byte b = bArr[42];
            byte b2 = (byte) (b + 1);
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (bArr[0] - 1);
            byte b4 = bArr[42];
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallback + 45;
            onNavigationEvent = i % 128;
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
