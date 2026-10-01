package o;

import im.toss.uikit.base.MainBottomNavBarVisibility;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1rSDKExternalSyntheticLambda1 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    public static final boolean onWarmupCompleted(@NotNull MainBottomNavBarVisibility mainBottomNavBarVisibility) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(mainBottomNavBarVisibility, "");
            return mainBottomNavBarVisibility instanceof MainBottomNavBarVisibility.Visible;
        }
        Intrinsics.checkNotNullParameter(mainBottomNavBarVisibility, "");
        boolean z = mainBottomNavBarVisibility instanceof MainBottomNavBarVisibility.Visible;
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
