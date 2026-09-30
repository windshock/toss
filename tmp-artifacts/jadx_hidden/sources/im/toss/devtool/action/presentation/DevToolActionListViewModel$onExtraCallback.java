package im.toss.devtool.action.presentation;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DevToolActionListViewModel$onExtraCallback {
    private static final byte[] $$a;
    private static final int $$b = 142;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 11
            byte[] r1 = im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback.$$a
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 102 - r8
            byte[] r0 = new byte[r0]
            int r6 = r6 + 10
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2f
        L16:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1a:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r7 = r7 + r8
            int r7 = r7 + 2
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback.$$c(byte, int, byte):java.lang.String");
    }

    static {
        byte[] bArr = {126, 1, 26, -71, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
        $$a = bArr;
        ClassLoader parent = DevToolActionListViewModel$onExtraCallback.class.getClassLoader().getParent();
        try {
            byte b = bArr[1];
            byte b2 = (byte) (b - 1);
            byte b3 = (byte) (-b);
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b2, b3, (byte) (b3 + 1)), String.class);
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

    public /* synthetic */ DevToolActionListViewModel$onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static native void f(Object obj, Object obj2);

    private DevToolActionListViewModel$onExtraCallback() {
    }
}
