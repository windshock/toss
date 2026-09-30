package o;

/* loaded from: classes.dex */
public class HttpDataSourceInvalidContentTypeException {
    private static final byte[] $$a;
    private static int onNavigationEvent;
    private static final int $$b = 208;
    private static int onExtraCallbackWithResult = 0;
    static int IAuthTabCallback = 0;
    static int onExtraCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 31
            int r0 = 47 - r6
            int r7 = r7 * 46
            int r7 = 50 - r7
            int r8 = r8 * 38
            int r8 = r8 + 73
            byte[] r1 = o.HttpDataSourceInvalidContentTypeException.$$a
            byte[] r0 = new byte[r0]
            int r6 = 46 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r7
            int r7 = r3 + (-6)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.HttpDataSourceInvalidContentTypeException.a(int, byte, int, java.lang.Object[]):void");
    }

    public static native int n(Object obj);

    public static native long read();

    public static native long run();

    static {
        byte[] bArr = {29, -59, -25, -119, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onNavigationEvent = 1;
        try {
            byte b = bArr[42];
            byte b2 = (byte) (b + 1);
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (bArr[28] - 1);
            byte b4 = bArr[42];
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallbackWithResult;
            int i2 = (i & 121) + (i | 121);
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
