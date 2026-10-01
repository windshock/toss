package o;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0 extends AccessibilityDelegateCompat {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    private final String onNavigationEvent;

    public r8lambdaNCvR6EZjAYpz_owCtw_Vfp2Jx0(@Nullable String str) {
        this.onNavigationEvent = str;
    }

    public void onInitializeAccessibilityNodeInfo(@NotNull View view, @NotNull SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        String str;
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            str = this.onNavigationEvent;
            int i3 = 54 / 0;
            if (str == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(suspendAnimationKtExternalSyntheticLambda4, "");
            super.onInitializeAccessibilityNodeInfo(view, suspendAnimationKtExternalSyntheticLambda4);
            str = this.onNavigationEvent;
            if (str == null) {
                return;
            }
        }
        suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallbackDefault(str);
        int i4 = onWarmupCompleted + 75;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
