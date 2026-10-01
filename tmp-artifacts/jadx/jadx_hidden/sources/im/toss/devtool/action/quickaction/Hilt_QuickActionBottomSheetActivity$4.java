package im.toss.devtool.action.quickaction;

import android.content.Context;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.writeTypedList;

/* loaded from: classes.dex */
public class Hilt_QuickActionBottomSheetActivity$4 implements writeTypedList {
    private static final byte[] $$a;
    final /* synthetic */ Hilt_QuickActionBottomSheetActivity onExtraCallbackWithResult;
    static int onExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(Hilt_QuickActionBottomSheetActivity$4.class);
    private static final int $$b = 18;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = 102 - r6
            byte[] r0 = im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4.$$a
            int r8 = r8 * 4
            int r8 = 11 - r8
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + 2
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4.$$c(int, int, byte):java.lang.String");
    }

    static {
        byte[] bArr = {78, -86, Byte.MIN_VALUE, Byte.MIN_VALUE, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
        $$a = bArr;
        ClassLoader parent = Hilt_QuickActionBottomSheetActivity$4.class.getClassLoader().getParent();
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

    public static native int h(int i);

    public Hilt_QuickActionBottomSheetActivity$4(Hilt_QuickActionBottomSheetActivity hilt_QuickActionBottomSheetActivity) {
        this.onExtraCallbackWithResult = hilt_QuickActionBottomSheetActivity;
    }

    public void onContextAvailable(Context context) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1846);
        this.onExtraCallbackWithResult.onWarmupCompleted();
        int i2 = onExtraCallback;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5109);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 12) & 1) != 0) {
            int i3 = 34 / 0;
        }
    }
}
