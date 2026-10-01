package o;

import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import im.toss.devtool.runtime.ui.scheme.history.SchemeHistoryViewModel;
import o.bindContext;

/* loaded from: classes.dex */
public final class AppUtils {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    static SchemeHistoryViewModel keepFieldType;
    public static String onExtraCallback;
    private static int onExtraCallbackWithResult;
    private static int onWarmupCompleted;

    static {
        onExtraCallback();
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 63, 49 - TextUtils.lastIndexOf("", '0'), new char[]{'\b', 65482, 14, 17, '\n', 16, 5, '\t', 1, 65482, 17, 5, 65482, 15, 65535, 4, 1, '\t', 1, 65482, 4, 5, 15, 16, 11, 14, 21, 65482, 65519, 65535, 4, 1, '\t', 1, 65508, 5, 15, 16, 11, 14, 21, 65522, 5, 1, 19, 65513, 11, 0, 1, '\b', 5, '\t', 65482, 16, 11, 15, 15, 65482, 0, 1, 18, 16, 11, 11}, false, 245 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
        onExtraCallback = ((String) objArr[0]).intern();
        int i = onWarmupCompleted + 63;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
        char[] cArr2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
            int i5 = $10 + 53;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
            int i7 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            cArr3[i7] = bindContext.access000.g(cArr3[i7], onExtraCallbackWithResult);
            LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
        }
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i8 = $10 + 81;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i9 = $11 + 125;
        $10 = i9 % 128;
        if (i9 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i10 = 9 / 0;
            objArr[0] = str;
        }
    }

    static void onExtraCallback() {
        onExtraCallbackWithResult = 478309049;
    }
}
