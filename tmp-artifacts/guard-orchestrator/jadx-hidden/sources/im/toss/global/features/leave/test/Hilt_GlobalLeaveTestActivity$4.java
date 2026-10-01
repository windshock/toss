package im.toss.global.features.leave.test;

import android.content.Context;
import java.lang.reflect.Method;
import o.writeTypedList;

/* loaded from: classes.dex */
public class Hilt_GlobalLeaveTestActivity$4 implements writeTypedList {
    private static final byte[] $$a;
    private static final int $$b = 98;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    final /* synthetic */ Hilt_GlobalLeaveTestActivity onExtraCallbackWithResult;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 102
            byte[] r0 = im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4.$$a
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r1 = 11 - r7
            byte[] r1 = new byte[r1]
            int r7 = 10 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + 2
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4.$$c(short, byte, short):java.lang.String");
    }

    public static native char p(int i, int i2);

    public Hilt_GlobalLeaveTestActivity$4(Hilt_GlobalLeaveTestActivity hilt_GlobalLeaveTestActivity) {
        this.onExtraCallbackWithResult = hilt_GlobalLeaveTestActivity;
    }

    public void onContextAvailable(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 7;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallbackWithResult.aR_();
        int i4 = onNavigationEvent + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        byte[] bArr = {115, 30, 119, 102, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = Hilt_GlobalLeaveTestActivity$4.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] + 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            onNavigationEvent = 0;
            onWarmupCompleted = 1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
