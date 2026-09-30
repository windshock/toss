package com.swmansion.rnscreens.events;

import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ScreenEventEmitter {
    private final Screen screen;

    public ScreenEventEmitter(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "");
        this.screen = screen;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final EventDispatcher getReactEventDispatcher() {
        return this.screen.getReactEventDispatcher();
    }

    public final int getReactSurfaceId() {
        return r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(this.screen);
    }

    public final Unit dispatchOnWillAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.onWarmupCompleted(new ScreenWillAppearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnAppear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.onWarmupCompleted(new ScreenAppearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnWillDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.onWarmupCompleted(new ScreenWillDisappearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnDisappear() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.onWarmupCompleted(new ScreenDisappearEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final Unit dispatchOnDismissed() {
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher == null) {
            return null;
        }
        reactEventDispatcher.onWarmupCompleted(new ScreenDismissedEvent(getReactSurfaceId(), this.screen.getId()));
        return Unit.INSTANCE;
    }

    public final void dispatchTransitionProgress(float f, boolean z, boolean z2) {
        float fCoerceIn = RangesKt.coerceIn(f, 0.0f, 1.0f);
        short coalescingKey = ScreenFragment.Companion.getCoalescingKey(fCoerceIn);
        EventDispatcher reactEventDispatcher = getReactEventDispatcher();
        if (reactEventDispatcher != null) {
            reactEventDispatcher.onWarmupCompleted(new ScreenTransitionProgressEvent(getReactSurfaceId(), this.screen.getId(), fCoerceIn, z, z2, coalescingKey));
        }
    }
}
