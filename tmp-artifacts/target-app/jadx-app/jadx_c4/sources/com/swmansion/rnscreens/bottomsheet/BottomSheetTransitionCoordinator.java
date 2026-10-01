package com.swmansion.rnscreens.bottomsheet;

import com.swmansion.rnscreens.Screen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class BottomSheetTransitionCoordinator {
    private boolean areInsetsApplied;
    private boolean isLayoutComplete;

    public final void onScreenContainerLayoutChanged$react_native_screens_release(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        this.isLayoutComplete = true;
        triggerSheetEnterTransitionIfReady(screen);
    }

    public final void onScreenContainerInsetsApplied$react_native_screens_release(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        this.areInsetsApplied = true;
        triggerSheetEnterTransitionIfReady(screen);
    }

    private final void triggerSheetEnterTransitionIfReady(Screen screen) {
        if (this.isLayoutComplete && this.areInsetsApplied) {
            screen.requestTriggeringPostponedEnterTransition$react_native_screens_release();
            screen.triggerPostponedEnterTransitionIfNeeded$react_native_screens_release();
        }
    }
}
