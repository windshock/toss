package o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class BackgroundThreadStateHandlerExternalSyntheticLambda1 {
    private static Method IAuthTabCallback;
    private static final byte[] IAuthTabCallbackDefault = null;
    private static int[] IAuthTabCallbackStub;
    private static final int asBinder = 0;
    private static Method onExtraCallback;
    private static final ConcurrentMap onExtraCallbackWithResult;
    private static Field onNavigationEvent;
    private static final ConcurrentMap onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void IAuthTabCallback(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 97
            int r7 = r7 + 4
            int r0 = r6 + 3
            byte[] r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda1.IAuthTabCallbackDefault
            byte[] r0 = new byte[r0]
            int r6 = r6 + 2
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + 3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BackgroundThreadStateHandlerExternalSyntheticLambda1.IAuthTabCallback(short, int, short, java.lang.Object[]):void");
    }

    static {
        onWarmupCompleted();
        onExtraCallback();
        onExtraCallback = null;
        IAuthTabCallback = null;
        onNavigationEvent = null;
        onWarmupCompleted = new ConcurrentHashMap();
        onExtraCallbackWithResult = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ef A[Catch: all -> 0x034b, TryCatch #7 {, blocks: (B:24:0x0124, B:27:0x0167, B:40:0x027d, B:65:0x02eb, B:67:0x02f2, B:75:0x033f, B:66:0x02ef, B:81:0x0349, B:77:0x0341, B:79:0x0347, B:80:0x0348, B:26:0x012e), top: B:102:0x0124, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r10v3, types: [int, short] */
    /* JADX WARN: Type inference failed for: r12v0, types: [int, short] */
    /* JADX WARN: Type inference failed for: r4v11, types: [int, short] */
    /* JADX WARN: Type inference failed for: r4v5, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v14, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v15, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v21, types: [int, short] */
    /* JADX WARN: Type inference failed for: r6v7, types: [int, short] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File onNavigationEvent(java.io.InputStream r17, java.io.File r18) throws java.lang.NoSuchFieldException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 984
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BackgroundThreadStateHandlerExternalSyntheticLambda1.onNavigationEvent(java.io.InputStream, java.io.File):java.io.File");
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IAuthTabCallbackStub;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-585175795047243642L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IAuthTabCallbackStub;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-585175795047243642L));
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i4 = 0; i4 < 16; i4++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i4];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent) ^ simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i5;
            }
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i6;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void onExtraCallback() {
        IAuthTabCallbackDefault = new byte[]{87, -2, 11, -41, 10, -13, 11, -6, -9, -8, -57, 66, 3, -9, -2, -18, 5, -66, 30, 33, -5, 12, -3, -14, -8, 14, -8, -16, 5, -1, 4, -20};
        asBinder = 127;
    }

    static void onWarmupCompleted() {
        IAuthTabCallbackStub = new int[]{-737844159, -294168546, 1469165157, -967153640, -14977164, -1758576807, -2026270528, -1551987273, 1265548073, -2002149228, 43359509, -1978683608, -809564138, 37609260, -2070912517, -1346596674, 1425930757, 784917334};
    }
}
