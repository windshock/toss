package im.toss.devtool.action.quickaction;

import androidx.activity.ComponentActivity;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class QuickActionBottomSheetActivity$IAuthTabCallbackStub implements Function0<AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1> {
    private static final byte[] $$a;
    final /* synthetic */ ComponentActivity onExtraCallbackWithResult;
    static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(QuickActionBottomSheetActivity$IAuthTabCallbackStub.class);
    private static final int $$b = 21;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r5, int r6, short r7) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r5 = r5 * 3
            int r5 = 102 - r5
            int r6 = r6 * 4
            int r0 = r6 + 11
            byte[] r1 = im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 10
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r5
            r5 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2b:
            int r5 = r5 + r4
            int r5 = r5 + 2
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: im.toss.devtool.action.quickaction.QuickActionBottomSheetActivity$IAuthTabCallbackStub.$$c(byte, int, short):java.lang.String");
    }

    static {
        byte[] bArr = {11, -55, -20, -91, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
        $$a = bArr;
        ClassLoader parent = QuickActionBottomSheetActivity$IAuthTabCallbackStub.class.getClassLoader().getParent();
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

    public QuickActionBottomSheetActivity$IAuthTabCallbackStub(ComponentActivity componentActivity) {
        this.onExtraCallbackWithResult = componentActivity;
    }

    public static native Object r(Object obj, int i, int i2, Object obj2);

    public /* synthetic */ Object invoke() {
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5782);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 27) & 1) == 0) {
            androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
            int i3 = 58 / 0;
        } else {
            androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
        return androidTextContextMenuToolbarProviderExternalSyntheticLambda1OnExtraCallbackWithResult;
    }

    public final AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 onExtraCallbackWithResult() {
        AndroidTextContextMenuToolbarProviderExternalSyntheticLambda1 viewModelStore;
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4709);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 31) & 1) == 0) {
            viewModelStore = this.onExtraCallbackWithResult.getViewModelStore();
            int i3 = 33 / 0;
        } else {
            viewModelStore = this.onExtraCallbackWithResult.getViewModelStore();
        }
        int i4 = onNavigationEvent;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
        if (((((i4 | iOnWarmupCompleted2) & (~(i4 & iOnWarmupCompleted2))) >> 5) & 1) != 0) {
            return viewModelStore;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
