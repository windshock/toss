package o;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setShadowDrawableRight {
    private static setShadowDrawable onNavigationEvent;
    public static final setShadowDrawableRight onExtraCallbackWithResult = new setShadowDrawableRight();
    private static final WeakHashMap<View, SlidingPaneLayout> onExtraCallback = new WeakHashMap<>();

    private setShadowDrawableRight() {
    }

    public final setShadowDrawable onWarmupCompleted() {
        return onNavigationEvent;
    }

    public final void onExtraCallback(@NotNull setShadowDrawable setshadowdrawable) {
        Intrinsics.checkNotNullParameter(setshadowdrawable, "");
        onNavigationEvent = setshadowdrawable;
    }

    public final void onNavigationEvent(@NotNull SlidingPaneLayout slidingPaneLayout, @NotNull View view) {
        Intrinsics.checkNotNullParameter(slidingPaneLayout, "");
        Intrinsics.checkNotNullParameter(view, "");
        onExtraCallback.put(view, slidingPaneLayout);
    }

    public final SlidingPaneLayout onWarmupCompleted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return onExtraCallback.get(view);
    }

    public final void onExtraCallbackWithResult(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        onExtraCallback.remove(view);
    }
}
