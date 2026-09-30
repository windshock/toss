package o;

import android.view.MenuItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface TimerCallBack {
    void aS_();

    void onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener);

    void onExtraCallback(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener2);

    default void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
