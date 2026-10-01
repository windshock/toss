package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface drawProgressReverse<T> {
    void onExtraCallbackWithResult(@NotNull String str, T t, boolean z);

    T onNavigationEvent(@NotNull String str, @Nullable T t);
}
