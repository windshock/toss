package o;

import android.app.Activity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface r8lambdaaZKH_2ZQsFPHT4kgqGn6Y7ANGvE {
    default void IAuthTabCallback() {
        int i = 2 % 2;
    }

    void IAuthTabCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    default void onExtraCallback(@Nullable Activity activity, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
    }

    void onExtraCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map);

    default void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
    }
}
