package o;

/* loaded from: classes.dex */
public class ExoPlayerBuilderExternalSyntheticLambda5 {
    private static final byte[] $$a;
    private static int onExtraCallbackWithResult;
    private static final int $$b = 86;
    private static int onExtraCallback = 1;
    static int onNavigationEvent = 0;
    static int IAuthTabCallback = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 38
            int r6 = r6 + 73
            int r7 = r7 + 4
            byte[] r0 = o.ExoPlayerBuilderExternalSyntheticLambda5.$$a
            int r5 = r5 * 31
            int r5 = r5 + 16
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r7 = r7 + 1
            r4 = r0[r7]
        L29:
            int r6 = r6 + r4
            int r6 = r6 + (-6)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ExoPlayerBuilderExternalSyntheticLambda5.a(byte, byte, byte, java.lang.Object[]):void");
    }

    public static native long read();

    static {
        byte[] bArr = {63, 67, 46, -88, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        onExtraCallbackWithResult = 0;
        try {
            byte b = (byte) (bArr[28] - 1);
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (-b2), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = bArr[42];
            byte b4 = b3;
            Object[] objArr2 = new Object[1];
            a(b3, b4, (byte) (b4 | 45), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = onExtraCallback;
            int i2 = (i & 39) + (i | 39);
            onExtraCallbackWithResult = i2 % 128;
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
