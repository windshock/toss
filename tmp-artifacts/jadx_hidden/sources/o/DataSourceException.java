package o;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class DataSourceException {
    private static final byte[] $$a;
    private static int IAuthTabCallback;
    public static Method onExtraCallback;
    private static char[] onNavigationEvent;
    private static final int $$b = 236;
    private static int asBinder = 1;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;

    public static native long Rid(long j, Method method);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 38
            int r7 = 111 - r7
            byte[] r0 = o.DataSourceException.$$a
            int r6 = r6 + 4
            int r5 = r5 * 31
            int r1 = 47 - r5
            byte[] r1 = new byte[r1]
            int r5 = 46 - r5
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r5
            goto L2b
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r0[r6]
        L2b:
            int r7 = r7 + r3
            int r7 = r7 + (-6)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DataSourceException.a(byte, int, int, java.lang.Object[]):void");
    }

    public static native void run(Object obj);

    static {
        byte[] bArr = {74, 75, -50, -9, -59, 40, 34, -5, 8, 8, 9, 13, 3, -2, 7, 19, -40, 35, 25, -13, -8, 34, 12, 3, -9, 8, -26, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -2, 58, 5, -6, -14, 19, 7, -25, 36, 17, 6, -4, 5, 8, 14};
        $$a = bArr;
        IAuthTabCallback = 0;
        onExtraCallback();
        try {
            byte b = bArr[42];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b2, (byte) (b2 - 1), b, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = (byte) (bArr[28] - 1);
            byte b4 = (byte) (b3 | 44);
            Object[] objArr2 = new Object[1];
            a(b3, b4, (byte) (b4 & 3), objArr2);
            cls.getMethod((String) objArr2[0], null).invoke(null, null);
            int i = asBinder;
            int i2 = ((i | 19) << 1) - (i ^ 19);
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ad A[PHI: r7
      0x01ad: PHI (r7v8 java.lang.Object[]) = (r7v7 java.lang.Object[]), (r7v17 java.lang.Object[]) binds: [B:29:0x01ab, B:25:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void onExtraCallbackWithResult() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DataSourceException.onExtraCallbackWithResult():void");
    }

    private static void onExtraCallbackWithResult(int[] iArr, boolean z, String str, Object[] objArr) throws UnsupportedEncodingException {
        String str2 = str;
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0 = new UtilExternalSyntheticLambda0();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = onNavigationEvent;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                cArr2[i5] = (char) (cArr[i5] - 4301814714517170301L);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            char[] cArr4 = new char[i2];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i2) {
                if (bArr[utilExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    cArr4[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (((cArr3[utilExternalSyntheticLambda0.onNavigationEvent] << 1) + 1) - c);
                } else {
                    cArr4[utilExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr3[utilExternalSyntheticLambda0.onNavigationEvent] << 1) - c);
                }
                c = cArr4[utilExternalSyntheticLambda0.onNavigationEvent];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i6 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i6, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i6);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i2) {
                cArr6[utilExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i2 - utilExternalSyntheticLambda0.onNavigationEvent) - 1];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i2) {
                cArr3[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[utilExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onExtraCallback() {
        onNavigationEvent = new char[]{10413, 10472, 10472, 10436, 10442, 10467, 10468, 10471, 10439, 10445, 10472, 10466, 10470, 10469, 10465, 10472, 10446, 10426, 10454, 10473, 10475, 10472, 10470, 10468, 10443, 10521, 10527, 10515, 10513, 10524, 10521, 10522, 10522, 10522, 10526, 10533, 10448, 10528, 10524, 10531, 10505, 10485, 10518, 10529, 10526, 10527, 10527, 10527, 10531, 10534, 10525, 10531, 10531, 10495, 10501, 10526, 10527, 10530, 10498, 10504, 10531, 10525, 10576, 10566, 10562, 10579, 10566, 10577, 10558, 10539, 10416, 10467, 10473, 10464, 10456, 10473, 10481, 10480, 10477, 10462, 10467, 10481, 10471, 10470, 10575, 10581, 10571, 10561, 10578, 10578, 10576, 10578, 10581, 10581, 10580, 10572, 10575, 10589, 10579, 10581};
    }
}
