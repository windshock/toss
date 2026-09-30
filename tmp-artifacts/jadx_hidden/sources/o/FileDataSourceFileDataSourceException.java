package o;

/* loaded from: classes.dex */
public class FileDataSourceFileDataSourceException {
    private static final byte[] $$a;
    private static int onNavigationEvent;
    private static final int $$b = 185;
    private static int onExtraCallbackWithResult = 0;
    static int IAuthTabCallback = 0;
    static int onExtraCallback = 1;

    private static void a(byte b, short s, byte b2, Object[] objArr) {
        int i = 111 - (b2 * 38);
        byte[] bArr = $$a;
        int i2 = b * 31;
        int i3 = 49 - (s * 46);
        byte[] bArr2 = new byte[47 - i2];
        int i4 = 46 - i2;
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i = (i4 + i3) - 6;
            i3 = i3;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i5 = i6;
            i = (i + bArr[i7]) - 6;
            i3 = i7;
        }
    }

    public static native long read();

    static {
        byte[] bArr = {15, -57, -42, 5, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onNavigationEvent = 1;
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b2, (byte) (b2 + 1), b, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            Object[] objArr2 = new Object[1];
            a((byte) (185 & 7), b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallbackWithResult;
            int i2 = ((i | 65) << 1) - (65 ^ i);
            onNavigationEvent = i2 % 128;
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
