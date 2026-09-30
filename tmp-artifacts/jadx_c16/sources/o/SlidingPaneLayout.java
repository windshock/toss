package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public interface SlidingPaneLayout {
    void onExtraCallback();

    void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2);

    void onNavigationEvent(boolean z);
}
