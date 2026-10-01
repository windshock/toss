package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerTouchEvent extends Event<RNGestureHandlerTouchEvent> {
    public static final Companion Companion = new Companion(null);
    private static final Pools.onExtraCallbackWithResult<RNGestureHandlerTouchEvent> onWarmupCompleted = new Pools.onExtraCallbackWithResult<>(7);
    private WritableMap onExtraCallback;
    private short onNavigationEvent;

    public /* synthetic */ RNGestureHandlerTouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public boolean canCoalesce() {
        return true;
    }

    private RNGestureHandlerTouchEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends addChangePayload> void onWarmupCompleted(T t) {
        View viewICustomTabsCallbackStub = t.ICustomTabsCallbackStub();
        Intrinsics.checkNotNull(viewICustomTabsCallbackStub);
        super.init(r8lambdaCACpOq66L91F0lQtuSOLzOdwRnI.onExtraCallback(viewICustomTabsCallbackStub), viewICustomTabsCallbackStub.getId());
        this.onExtraCallback = Companion.IAuthTabCallback(t);
        this.onNavigationEvent = t.extraCallbackWithResult();
    }

    public void onDispose() {
        this.onExtraCallback = null;
        onWarmupCompleted.onWarmupCompleted(this);
    }

    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    public short getCoalescingKey() {
        return this.onNavigationEvent;
    }

    public WritableMap getEventData() {
        return this.onExtraCallback;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends addChangePayload> RNGestureHandlerTouchEvent onExtraCallback(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            RNGestureHandlerTouchEvent rNGestureHandlerTouchEvent = (RNGestureHandlerTouchEvent) RNGestureHandlerTouchEvent.onWarmupCompleted.onNavigationEvent();
            if (rNGestureHandlerTouchEvent == null) {
                rNGestureHandlerTouchEvent = new RNGestureHandlerTouchEvent(null);
            }
            rNGestureHandlerTouchEvent.onWarmupCompleted(t);
            return rNGestureHandlerTouchEvent;
        }

        public final <T extends addChangePayload> WritableMap IAuthTabCallback(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("handlerTag", t.onUnminimized());
            writableMapCreateMap.putInt("state", t.onRelationshipValidationResult());
            writableMapCreateMap.putInt("numberOfTouches", t.ICustomTabsCallbackStubProxy());
            writableMapCreateMap.putInt("eventType", t.ICustomTabsCallbackDefault());
            writableMapCreateMap.putInt("pointerType", t.onMinimized());
            WritableArray writableArrayIAuthTabCallbackDefault = t.IAuthTabCallbackDefault();
            if (writableArrayIAuthTabCallbackDefault != null) {
                writableMapCreateMap.putArray("changedTouches", writableArrayIAuthTabCallbackDefault);
            }
            WritableArray writableArrayAsBinder = t.asBinder();
            if (writableArrayAsBinder != null) {
                writableMapCreateMap.putArray("allTouches", writableArrayAsBinder);
            }
            if (t.mayLaunchUrl() && t.onRelationshipValidationResult() == 4) {
                writableMapCreateMap.putInt("state", 2);
            }
            return writableMapCreateMap;
        }
    }
}
