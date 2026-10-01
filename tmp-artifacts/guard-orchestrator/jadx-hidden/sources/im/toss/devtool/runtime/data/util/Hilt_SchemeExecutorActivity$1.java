package im.toss.devtool.runtime.data.util;

import android.content.Context;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.writeTypedList;

/* loaded from: classes.dex */
public class Hilt_SchemeExecutorActivity$1 implements writeTypedList {
    private static final byte[] $$a;
    final /* synthetic */ Hilt_SchemeExecutorActivity onExtraCallbackWithResult;
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(Hilt_SchemeExecutorActivity$1.class);
    private static final int $$b = 241;

    private static String $$c(int i, short s, int i2) {
        byte[] bArr = $$a;
        int i3 = (i * 3) + 102;
        int i4 = 3 - (s * 3);
        int i5 = i2 * 3;
        byte[] bArr2 = new byte[i5 + 11];
        int i6 = i5 + 10;
        int i7 = -1;
        if (bArr == null) {
            int i8 = i4 + (-i6) + 2;
            i4 = i4;
            i3 = i8;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            int i9 = i4 + 1;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            i4 = i9;
            i3 = i3 + (-bArr[i9]) + 2;
        }
    }

    static {
        byte[] bArr = {62, 54, 60, 44, -1, -3, 12, 26, -27, 9, -14, 19, -15, -5};
        $$a = bArr;
        ClassLoader parent = Hilt_SchemeExecutorActivity$1.class.getClassLoader().getParent();
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

    public static native void v(Object obj, Object obj2);

    public Hilt_SchemeExecutorActivity$1(Hilt_SchemeExecutorActivity hilt_SchemeExecutorActivity) {
        this.onExtraCallbackWithResult = hilt_SchemeExecutorActivity;
    }

    public void onContextAvailable(Context context) {
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
        this.onExtraCallbackWithResult.aR_();
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2265);
    }
}
