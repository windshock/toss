package o;

/* loaded from: classes.dex */
public class UdpDataSourceUdpDataSourceException {
    private static final byte[] $$a;
    private static int onExtraCallbackWithResult;
    private static final int $$b = 25;
    private static int onExtraCallback = 1;
    static int onWarmupCompleted = 0;
    static int onNavigationEvent = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    private static void a(short s, byte b, short s2, Object[] objArr) {
        int i = s * 31;
        int i2 = 50 - (s2 * 46);
        int i3 = (b * 38) + 73;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[47 - i];
        int i4 = 46 - i;
        int i5 = -1;
        ?? r6 = i3;
        if (bArr == null) {
            i2++;
            i5 = -1;
            r6 = (i2 + i3) - 6;
        }
        while (true) {
            int i6 = i2;
            byte b2 = r6;
            int i7 = i5 + 1;
            bArr2[i7] = b2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2 = i6 + 1;
                r6 = (b2 + bArr[i6]) - 6;
                i5 = i7;
            }
        }
    }

    public static native long read(String[][] strArr);

    static {
        byte[] bArr = {65, -53, 110, -39, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onExtraCallbackWithResult = 0;
        try {
            byte b = bArr[42];
            byte b2 = (byte) (b + 1);
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            Object[] objArr2 = new Object[1];
            a((byte) (25 & 7), b3, b3, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallback + 67;
            onExtraCallbackWithResult = i % 128;
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
