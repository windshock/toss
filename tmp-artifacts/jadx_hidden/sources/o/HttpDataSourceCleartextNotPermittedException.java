package o;

/* loaded from: classes.dex */
public class HttpDataSourceCleartextNotPermittedException {
    private static final byte[] $$a;
    private static int onNavigationEvent;
    private static final int $$b = 163;
    private static int onExtraCallbackWithResult = 1;
    static int onExtraCallback = 0;
    static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 46
            int r7 = 50 - r7
            int r8 = r8 * 38
            int r8 = 111 - r8
            byte[] r0 = o.HttpDataSourceCleartextNotPermittedException.$$a
            int r6 = r6 * 31
            int r1 = r6 + 16
            byte[] r1 = new byte[r1]
            int r6 = r6 + 15
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-6)
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HttpDataSourceCleartextNotPermittedException.a(int, int, byte, java.lang.Object[]):void");
    }

    public static native long read(String str);

    static {
        byte[] bArr = {77, -67, -125, 9, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onNavigationEvent = 0;
        byte b = (byte) (163 & 5);
        try {
            Object[] objArr = new Object[1];
            a(b, b, bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallbackWithResult;
            int i2 = (i ^ 91) + ((i & 91) << 1);
            onNavigationEvent = i2 % 128;
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
