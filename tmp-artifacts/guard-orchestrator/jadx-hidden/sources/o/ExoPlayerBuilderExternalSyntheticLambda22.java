package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda22 {
    private static final byte[] $$a;
    private static int onWarmupCompleted;
    private static final int $$b = 123;
    private static int IAuthTabCallback = 1;
    static int onNavigationEvent = 0;
    static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 38
            int r8 = 111 - r8
            int r6 = r6 * 31
            int r6 = r6 + 16
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda22.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-6)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda22.a(short, int, int, java.lang.Object[]):void");
    }

    static native long read();

    static {
        byte[] bArr = {69, -38, -90, 81, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onWarmupCompleted = 0;
        byte b = (byte) (123 & 5);
        try {
            Object[] objArr = new Object[1];
            a(b, (byte) (-b), bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = (byte) (b2 | 45);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 3), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallback + 27;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
                throw new ArithmeticException();
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
