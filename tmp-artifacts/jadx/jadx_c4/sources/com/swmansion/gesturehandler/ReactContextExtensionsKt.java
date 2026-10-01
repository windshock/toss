package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ReactContextExtensionsKt {
    public static final void IAuthTabCallback(@NotNull ReactContext reactContext, @NotNull Event<?> event) {
        Intrinsics.checkNotNullParameter(reactContext, "");
        Intrinsics.checkNotNullParameter(event, "");
        FabricUIManager fabricUIManagerOnExtraCallback = r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(reactContext, 2);
        Intrinsics.checkNotNull(fabricUIManagerOnExtraCallback, "");
        fabricUIManagerOnExtraCallback.getEventDispatcher().onWarmupCompleted(event);
    }
}
