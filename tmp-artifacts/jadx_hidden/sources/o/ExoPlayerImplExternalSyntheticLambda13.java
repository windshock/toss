package o;

/* loaded from: classes.dex */
public class ExoPlayerImplExternalSyntheticLambda13 {
    private static final byte[] $$a;
    private static int onWarmupCompleted;
    private static final int $$b = 41;
    private static int onNavigationEvent = 1;
    static int onExtraCallback = 0;
    static int IAuthTabCallback = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 31
            int r0 = 47 - r5
            int r7 = r7 * 38
            int r7 = 111 - r7
            int r6 = r6 * 46
            int r6 = 50 - r6
            byte[] r1 = o.ExoPlayerImplExternalSyntheticLambda13.$$a
            byte[] r0 = new byte[r0]
            int r5 = 46 - r5
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r6]
        L2a:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-6)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerImplExternalSyntheticLambda13.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static native long read(byte[] bArr);

    static {
        byte[] bArr = {89, 120, -98, -110, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onWarmupCompleted = 0;
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b2, (byte) (b2 + 1), b, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            Object[] objArr2 = new Object[1];
            a((byte) (41 & 7), b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onNavigationEvent + 101;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
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
