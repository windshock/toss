package com.swmansion.rnscreens;

import com.swmansion.rnscreens.ScreenFragment;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public interface ScreenEventDispatcher {
    boolean canDispatchLifecycleEvent(@NotNull ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent);

    void dispatchHeaderBackButtonClickedEvent();

    void dispatchLifecycleEvent(@NotNull ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent, @NotNull ScreenFragmentWrapper screenFragmentWrapper);

    void dispatchLifecycleEventInChildContainers(@NotNull ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent);

    void dispatchTransitionProgressEvent(float f, boolean z);

    void updateLastEventDispatched(@NotNull ScreenFragment.ScreenLifecycleEvent screenLifecycleEvent);
}
