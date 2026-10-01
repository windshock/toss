package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.isScrap;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerEvent extends Event<RNGestureHandlerEvent> {
    public static final Companion Companion = new Companion(null);
    private static final Pools.onExtraCallbackWithResult<RNGestureHandlerEvent> onNavigationEvent = new Pools.onExtraCallbackWithResult<>(7);
    private short IAuthTabCallback;
    private isScrap<?> onExtraCallback;
    private boolean onExtraCallbackWithResult;

    public /* synthetic */ RNGestureHandlerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean canCoalesce() {
        return true;
    }

    private RNGestureHandlerEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends addChangePayload> void IAuthTabCallback(T t, isScrap<T> isscrap, boolean z) {
        View viewICustomTabsCallbackStub = t.ICustomTabsCallbackStub();
        Intrinsics.checkNotNull(viewICustomTabsCallbackStub);
        super.init(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(viewICustomTabsCallbackStub), viewICustomTabsCallbackStub.getId());
        this.onExtraCallback = isscrap;
        this.onExtraCallbackWithResult = z;
        this.IAuthTabCallback = t.extraCallbackWithResult();
    }

    public void onDispose() {
        this.onExtraCallback = null;
        onNavigationEvent.onWarmupCompleted(this);
    }

    public String getEventName() {
        if (this.onExtraCallbackWithResult) {
            return "topGestureHandlerEvent";
        }
        return "onGestureHandlerEvent";
    }

    public short getCoalescingKey() {
        return this.IAuthTabCallback;
    }

    public WritableMap getEventData() {
        Companion companion = Companion;
        isScrap<?> isscrap = this.onExtraCallback;
        Intrinsics.checkNotNull(isscrap);
        return companion.onNavigationEvent(isscrap);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ RNGestureHandlerEvent onWarmupCompleted(Companion companion, addChangePayload addchangepayload, isScrap isscrap, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.onNavigationEvent(addchangepayload, isscrap, z);
        }

        public final <T extends addChangePayload> RNGestureHandlerEvent onNavigationEvent(@NotNull T t, @NotNull isScrap<T> isscrap, boolean z) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(isscrap, "");
            RNGestureHandlerEvent rNGestureHandlerEvent = (RNGestureHandlerEvent) RNGestureHandlerEvent.onNavigationEvent.onNavigationEvent();
            if (rNGestureHandlerEvent == null) {
                rNGestureHandlerEvent = new RNGestureHandlerEvent(null);
            }
            rNGestureHandlerEvent.IAuthTabCallback(t, isscrap, z);
            return rNGestureHandlerEvent;
        }

        public final WritableMap onNavigationEvent(@NotNull isScrap<?> isscrap) {
            Intrinsics.checkNotNullParameter(isscrap, "");
            WritableMap writableMapCreateMap = Arguments.createMap();
            isscrap.onNavigationEvent(writableMapCreateMap);
            return writableMapCreateMap;
        }
    }
}
