package o;

/* loaded from: classes.dex */
public class onAudioFocusChange {
    private static final byte[] $$a;
    private static int onExtraCallbackWithResult;
    private static final int $$b = 12;
    private static int onWarmupCompleted = 0;
    static int onExtraCallback = 0;
    static int onNavigationEvent = 1;

    public static native long R(String str);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 38
            int r8 = 111 - r8
            int r6 = r6 * 31
            int r0 = r6 + 16
            byte[] r1 = o.onAudioFocusChange.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 15
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-6)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onAudioFocusChange.a(int, int, short, java.lang.Object[]):void");
    }

    public static native long read(String str);

    public static native long run(String str);

    static {
        byte[] bArr = {90, 10, -103, 87, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onExtraCallbackWithResult = 1;
        try {
            byte b = (byte) (bArr[13] - 1);
            Object[] objArr = new Object[1];
            a(b, (byte) (-b), bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = (byte) (b2 | 45);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 & 3), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onWarmupCompleted;
            int i2 = ((i | 43) << 1) - (i ^ 43);
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
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
