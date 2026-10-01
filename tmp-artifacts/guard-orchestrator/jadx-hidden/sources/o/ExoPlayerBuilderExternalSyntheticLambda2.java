package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda2 {
    private static final byte[] $$a;
    private static int onExtraCallback;
    private static final int $$b = 195;
    private static int IAuthTabCallback = 1;
    static int onNavigationEvent = 0;
    static int onExtraCallbackWithResult = 1;

    private static void a(byte b, short s, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i = s * 31;
        int i2 = (b * 38) + 73;
        int i3 = (b2 * 46) + 4;
        byte[] bArr2 = new byte[i + 16];
        int i4 = i + 15;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i4 + i3) - 6;
            i3++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3;
            i2 = (i2 + bArr[i3]) - 6;
            i3 = i7 + 1;
            i5 = i6;
        }
    }

    public static native long read();

    static {
        byte[] bArr = {20, 103, 109, 52, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onExtraCallback = 0;
        byte b = (byte) (195 & 5);
        try {
            Object[] objArr = new Object[1];
            a(b, b, bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallback;
            int i2 = (i & 93) + (i | 93);
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
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
