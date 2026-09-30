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
public final class RNGestureHandlerStateChangeEvent extends Event<RNGestureHandlerStateChangeEvent> {
    public static final Companion Companion = new Companion(null);
    private static final Pools.onExtraCallbackWithResult<RNGestureHandlerStateChangeEvent> onExtraCallbackWithResult = new Pools.onExtraCallbackWithResult<>(7);
    private int IAuthTabCallback;
    private isScrap<?> onNavigationEvent;
    private int onWarmupCompleted;

    public /* synthetic */ RNGestureHandlerStateChangeEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean canCoalesce() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    private RNGestureHandlerStateChangeEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends addChangePayload> void IAuthTabCallback(T t, int i, int i2, isScrap<T> isscrap) {
        View viewICustomTabsCallbackStub = t.ICustomTabsCallbackStub();
        Intrinsics.checkNotNull(viewICustomTabsCallbackStub);
        super.init(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(viewICustomTabsCallbackStub), viewICustomTabsCallbackStub.getId());
        this.onNavigationEvent = isscrap;
        this.onWarmupCompleted = i;
        this.IAuthTabCallback = i2;
    }

    public void onDispose() {
        this.onNavigationEvent = null;
        this.onWarmupCompleted = 0;
        this.IAuthTabCallback = 0;
        onExtraCallbackWithResult.onWarmupCompleted(this);
    }

    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    public WritableMap getEventData() {
        Companion companion = Companion;
        isScrap<?> isscrap = this.onNavigationEvent;
        Intrinsics.checkNotNull(isscrap);
        return companion.onWarmupCompleted(isscrap, this.onWarmupCompleted, this.IAuthTabCallback);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends addChangePayload> RNGestureHandlerStateChangeEvent IAuthTabCallback(@NotNull T t, int i, int i2, @NotNull isScrap<T> isscrap) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(isscrap, "");
            RNGestureHandlerStateChangeEvent rNGestureHandlerStateChangeEvent = (RNGestureHandlerStateChangeEvent) RNGestureHandlerStateChangeEvent.onExtraCallbackWithResult.onNavigationEvent();
            if (rNGestureHandlerStateChangeEvent == null) {
                rNGestureHandlerStateChangeEvent = new RNGestureHandlerStateChangeEvent(null);
            }
            rNGestureHandlerStateChangeEvent.IAuthTabCallback(t, i, i2, isscrap);
            return rNGestureHandlerStateChangeEvent;
        }

        public final WritableMap onWarmupCompleted(@NotNull isScrap<?> isscrap, int i, int i2) {
            Intrinsics.checkNotNullParameter(isscrap, "");
            WritableMap writableMapCreateMap = Arguments.createMap();
            isscrap.onNavigationEvent(writableMapCreateMap);
            writableMapCreateMap.putInt("state", i);
            writableMapCreateMap.putInt("oldState", i2);
            return writableMapCreateMap;
        }
    }
}
