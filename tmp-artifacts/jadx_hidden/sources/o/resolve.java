package o;

import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public class resolve {
    private static final byte[] $$a;
    private static int onWarmupCompleted;
    private static final int $$b = 49;
    private static int onExtraCallbackWithResult = 1;
    public static int IAuthTabCallback = 0;
    public static int onExtraCallback = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = o.resolve.$$a
            int r7 = r7 * 46
            int r7 = r7 + 4
            int r6 = r6 * 31
            int r6 = 47 - r6
            int r5 = r5 * 38
            int r5 = 111 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r7]
        L28:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-6)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.resolve.a(short, byte, short, java.lang.Object[]):void");
    }

    public static native long read(int i, Method[] methodArr, List<String> list);

    static {
        byte[] bArr = {80, 83, -21, -55, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onWarmupCompleted = 0;
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (49 & 7);
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallbackWithResult + 77;
            onWarmupCompleted = i % 128;
            if (i % 2 != 0) {
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
