package o;

import im.toss.devtool.runtime.data.util.SchemeExecutorActivity;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class AppNode5 implements setSize<SchemeExecutorActivity> {
    private static final byte[] $$a;
    static int IAuthTabCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AppNode5.class);
    private static final int $$b = 131;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, int r7) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 11
            int r5 = r5 * 4
            int r5 = 102 - r5
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = o.AppNode5.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 10
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r5
            r5 = r7
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
        L29:
            int r5 = r5 + r4
            int r5 = r5 + 2
            int r6 = r6 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AppNode5.$$c(byte, int, int):java.lang.String");
    }

    static {
        byte[] bArr = {102, 12, 98, 84, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
        $$a = bArr;
        ClassLoader parent = AppNode5.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] - 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static native char C(int i, int i2, int i3, int i4);

    public static void IAuthTabCallback(SchemeExecutorActivity schemeExecutorActivity, getStartParams getstartparams) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1240);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 28) & 1;
        schemeExecutorActivity.schemeRepository = getstartparams;
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
