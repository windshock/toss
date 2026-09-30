package o;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface FragmentStateAdapter4 {
    default void onExtraCallback(@NotNull Context context, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    default Object onNavigationEvent(@NotNull access13800<? super String> access13800Var) {
        int i = 2 % 2;
        return onWarmupCompleted(this, access13800Var);
    }

    default String onWarmupCompleted() {
        int i = 2 % 2;
        return null;
    }

    static /* synthetic */ Object onWarmupCompleted(FragmentStateAdapter4 fragmentStateAdapter4, access13800<? super String> access13800Var) {
        int i = 2 % 2;
        return "";
    }

    default String onNavigationEvent() {
        int i = 2 % 2;
        return "";
    }
}
