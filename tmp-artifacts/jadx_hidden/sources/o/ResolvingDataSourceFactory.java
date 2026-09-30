package o;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class ResolvingDataSourceFactory {
    private static final byte[] $$a;
    private static int onNavigationEvent;
    private static final int $$b = 114;
    private static int onExtraCallbackWithResult = 0;
    static int onExtraCallback = 0;
    static int onWarmupCompleted = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 38
            int r6 = 111 - r6
            byte[] r0 = o.ResolvingDataSourceFactory.$$a
            int r7 = r7 * 31
            int r1 = r7 + 16
            int r8 = r8 * 46
            int r8 = 49 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 15
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L30:
            int r8 = r8 + r4
            int r8 = r8 + (-6)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ResolvingDataSourceFactory.a(int, byte, short, java.lang.Object[]):void");
    }

    public static native long read(String str, int i, long j, long[] jArr);

    static {
        byte[] bArr = {98, -3, -80, -4, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
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
            int i2 = (i ^ 81) + ((i & 81) << 1);
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
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

    public static int onExtraCallbackWithResult(String str, int i, long j, long[] jArr) throws Throwable {
        int i2 = 2 % 2;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            int i3 = onWarmupCompleted;
            int i4 = (i3 & 47) + (i3 | 47);
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            long j2 = 0;
            while (true) {
                try {
                    int i6 = bufferedInputStream2.read();
                    if (i6 == -1) {
                        try {
                            bufferedInputStream2.close();
                        } catch (Exception unused) {
                        }
                        int i7 = onWarmupCompleted + 87;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return 0;
                    }
                    int i9 = onWarmupCompleted + 19;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    j2 = ((j2 << i) ^ i6) & j;
                    for (int i11 = 0; i11 < jArr.length; i11++) {
                        int i12 = onExtraCallback;
                        int i13 = i12 + 97;
                        onWarmupCompleted = i13 % 128;
                        int i14 = i13 % 2;
                        if (j2 == jArr[i11]) {
                            int i15 = (i12 ^ 115) + ((i12 & 115) << 1);
                            onWarmupCompleted = i15 % 128;
                            int i16 = i15 % 2 != 0 ? (i11 & 1) + (i11 | 1) : 0;
                            try {
                                bufferedInputStream2.close();
                            } catch (Exception unused2) {
                            }
                            int i17 = onWarmupCompleted + 19;
                            onExtraCallback = i17 % 128;
                            if (i17 % 2 == 0) {
                                return i16;
                            }
                            throw new NullPointerException();
                        }
                    }
                } catch (IOException unused3) {
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    int i18 = onWarmupCompleted + 17;
                    onExtraCallback = i18 % 128;
                    if (i18 % 2 == 0) {
                        return -1;
                    }
                    throw new NullPointerException();
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception unused5) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
