package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class DialogService {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;

    public static final showErrorDialog onExtraCallbackWithResult(@NotNull TitleBarCloseBtnClickInterceptPoint titleBarCloseBtnClickInterceptPoint) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(titleBarCloseBtnClickInterceptPoint, "");
        showErrorDialog showerrordialog = new showErrorDialog(titleBarCloseBtnClickInterceptPoint.onWarmupCompleted(), titleBarCloseBtnClickInterceptPoint.onExtraCallbackWithResult(), titleBarCloseBtnClickInterceptPoint.onExtraCallback(), titleBarCloseBtnClickInterceptPoint.IAuthTabCallback());
        int i2 = onWarmupCompleted + 59;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return showerrordialog;
    }
}
