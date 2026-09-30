package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ReanimatedEventDispatcher {
    public final <T extends Event<T>> void onExtraCallback(@NotNull T t, @NotNull ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(reactContext, "");
    }
}
