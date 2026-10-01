package o;

/* loaded from: classes.dex */
public class ExoPlayerImplExternalSyntheticLambda0 {
    private static final byte[] $$a;
    private static int onNavigationEvent;
    private static final int $$b = 104;
    private static int onWarmupCompleted = 0;
    static int onExtraCallback = 0;
    static int IAuthTabCallback = 1;

    private static void a(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (i * 38) + 73;
        int i3 = 50 - (s * 46);
        int i4 = s2 * 31;
        byte[] bArr2 = new byte[47 - i4];
        int i5 = 46 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 6;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i3])) - 6;
            i3++;
            i6 = i7;
        }
    }

    static native long read(int i, String[][] strArr);

    static {
        byte[] bArr = {120, 65, 99, 57, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onNavigationEvent = 1;
        try {
            byte b = (byte) (bArr[13] - 1);
            Object[] objArr = new Object[1];
            a(b, b, bArr[42], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = bArr[42];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 1), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onWarmupCompleted + 77;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
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
