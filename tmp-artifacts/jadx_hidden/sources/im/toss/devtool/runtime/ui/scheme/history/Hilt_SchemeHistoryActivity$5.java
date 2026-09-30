package im.toss.devtool.runtime.ui.scheme.history;

import android.content.Context;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.writeTypedList;

/* loaded from: classes.dex */
public class Hilt_SchemeHistoryActivity$5 implements writeTypedList {
    private static final byte[] $$a;
    final /* synthetic */ Hilt_SchemeHistoryActivity onNavigationEvent;
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(Hilt_SchemeHistoryActivity$5.class);
    private static final int $$b = 110;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 11
            int r8 = r8 * 2
            int r8 = r8 + 102
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 2
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5.$$c(int, short, int):java.lang.String");
    }

    static {
        byte[] bArr = {117, -24, -14, 98, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = Hilt_SchemeHistoryActivity$5.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] + 1);
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

    public static native void w(Object obj, Object obj2);

    public Hilt_SchemeHistoryActivity$5(Hilt_SchemeHistoryActivity hilt_SchemeHistoryActivity) {
        this.onNavigationEvent = hilt_SchemeHistoryActivity;
    }

    public void onContextAvailable(Context context) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        int i3 = i2 & iOnWarmupCompleted;
        if ((((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 23) & 1) == 0) {
            this.onNavigationEvent.aR_();
            int i4 = 86 / 0;
        } else {
            this.onNavigationEvent.aR_();
        }
        int i5 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5782);
        int i6 = (~iOnWarmupCompleted2) & i5;
        int i7 = (~i5) & iOnWarmupCompleted2;
        if (((((i7 & i6) | (i6 ^ i7)) >> 20) & 1) != 0) {
            throw null;
        }
    }
}
