package o;

/* loaded from: classes.dex */
public class ReusableBufferedOutputStream {
    private static final byte[] $$a;
    private static char IAuthTabCallbackStub;
    private static int asBinder;
    private static char asInterface;
    private static int onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onWarmupCompleted;
    private static final int $$b = 212;
    private static int onTransact = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int IAuthTabCallbackDefault = 1;
    static int onNavigationEvent = 0;
    static int IAuthTabCallback = 1;

    public static native byte[] R(int i, int i2);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = o.ReusableBufferedOutputStream.$$a
            int r6 = r6 * 31
            int r1 = 47 - r6
            int r7 = r7 * 38
            int r7 = r7 + 73
            int r5 = r5 * 46
            int r5 = 50 - r5
            byte[] r1 = new byte[r1]
            int r6 = 46 - r6
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r0[r5]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-6)
            int r5 = r5 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ReusableBufferedOutputStream.a(int, byte, byte, java.lang.Object[]):void");
    }

    public static native byte[] run(int i);

    static {
        byte[] bArr = {20, 103, 109, 52, 59, -40, -34, 5, -8, -8, -9, -13, -3, 2, -7, -19, 40, -35, -25, 13, 8, -34, -12, -3, 9, -8, 26, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 2, -58, -5, 6, 14, -19, -7, 25, -36, -17, -6, 4, -5, -8, -14};
        $$a = bArr;
        asBinder = 0;
        onExtraCallbackWithResult();
        onWarmupCompleted();
        try {
            byte b = (byte) (bArr[13] - 1);
            byte b2 = bArr[42];
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (b2 + 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b4, (byte) (b4 + 1), b3, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = IAuthTabCallbackDefault + 13;
            asBinder = i % 128;
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

    static void onWarmupCompleted() {
        onExtraCallback = -837138436;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = (char) 50633;
        onWarmupCompleted = (char) 47118;
        IAuthTabCallbackStub = (char) 38491;
        asInterface = (char) 42555;
    }
}
