package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class setMinimumDpi {
    private final String IAuthTabCallback;
    private final String onExtraCallback;
    private final String onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onWarmupCompleted;

    public setMinimumDpi(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.onWarmupCompleted = str;
        this.onNavigationEvent = str2;
        this.onExtraCallbackWithResult = str3;
        this.IAuthTabCallback = str4;
        this.onExtraCallback = str5;
    }

    public final String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public final boolean onNavigationEvent(@NotNull String str) {
        onDisclaimerClick ondisclaimerclickOnWarmupCompleted;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.areEqual(this.onWarmupCompleted, checkNavigationBarByWindowManagerService.TOSS.getCode())) {
            ondisclaimerclickOnWarmupCompleted = DERConstructedSet.IAuthTabCallback(this.onNavigationEvent);
        } else {
            ondisclaimerclickOnWarmupCompleted = DERConstructedSet.onNavigationEvent.onWarmupCompleted(this.onWarmupCompleted, this.onNavigationEvent);
        }
        return ondisclaimerclickOnWarmupCompleted != null && Intrinsics.areEqual(ondisclaimerclickOnWarmupCompleted.onExtraCallbackWithResult(), str);
    }

    public final boolean IAuthTabCallback(@NotNull String str) {
        onDisclaimerClick ondisclaimerclickIAuthTabCallback;
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.areEqual(this.onWarmupCompleted, checkNavigationBarByWindowManagerService.TOSS.getCode())) {
            ondisclaimerclickIAuthTabCallback = DERConstructedSet.IAuthTabCallback(this.onNavigationEvent);
        } else {
            ondisclaimerclickIAuthTabCallback = DERConstructedSet.IAuthTabCallback(this.IAuthTabCallback);
        }
        return ondisclaimerclickIAuthTabCallback != null && Intrinsics.areEqual(ondisclaimerclickIAuthTabCallback.onExtraCallbackWithResult(), str);
    }
}
