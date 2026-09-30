package com.swmansion.gesturehandler.react;

import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.swmansion.gesturehandler.ReactContextExtensionsKt;
import com.swmansion.gesturehandler.ReanimatedEventDispatcher;
import com.swmansion.gesturehandler.react.RNGestureHandlerEvent;
import kotlin.jvm.internal.Intrinsics;
import o.addChangePayload;
import o.getLayoutPosition;
import o.isTmpDetached;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerEventDispatcher implements getLayoutPosition {
    private final ReactApplicationContext onExtraCallback;
    private final ReanimatedEventDispatcher onExtraCallbackWithResult;

    public RNGestureHandlerEventDispatcher(@NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "");
        this.onExtraCallback = reactApplicationContext;
        this.onExtraCallbackWithResult = new ReanimatedEventDispatcher();
    }

    @Override // o.getLayoutPosition
    public <T extends addChangePayload> void onWarmupCompleted(@NotNull T t, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        onWarmupCompleted(t);
    }

    @Override // o.getLayoutPosition
    public <T extends addChangePayload> void onNavigationEvent(@NotNull T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(t, "");
        onWarmupCompleted(t, i, i2);
    }

    @Override // o.getLayoutPosition
    public <T extends addChangePayload> void onNavigationEvent(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        IAuthTabCallback((RNGestureHandlerEventDispatcher) t);
    }

    private final <T extends addChangePayload> void onWarmupCompleted(T t) {
        addChangePayload.IAuthTabCallback<addChangePayload> iAuthTabCallbackOnExtraCallback;
        if (t.onUnminimized() < 0 || t.onRelationshipValidationResult() != 4 || (iAuthTabCallbackOnExtraCallback = RNGestureHandlerFactoryUtil.onExtraCallback.onExtraCallback(t)) == null) {
            return;
        }
        int iAccess100 = t.access100();
        if (iAccess100 == 1) {
            onExtraCallbackWithResult(RNGestureHandlerEvent.Companion.onWarmupCompleted(RNGestureHandlerEvent.Companion, t, iAuthTabCallbackOnExtraCallback.onExtraCallback(t), false, 4, null));
            return;
        }
        if (iAccess100 == 2) {
            IAuthTabCallback(RNGestureHandlerEvent.Companion.onNavigationEvent(t, iAuthTabCallbackOnExtraCallback.onExtraCallback(t), true));
        } else if (iAccess100 == 3) {
            onWarmupCompleted("onGestureHandlerEvent", RNGestureHandlerEvent.Companion.onNavigationEvent(iAuthTabCallbackOnExtraCallback.onExtraCallback(t)));
        } else if (iAccess100 == 4) {
            onWarmupCompleted("onGestureHandlerEvent", RNGestureHandlerEvent.Companion.onNavigationEvent(iAuthTabCallbackOnExtraCallback.onExtraCallback(t)));
        }
    }

    private final <T extends addChangePayload> void onWarmupCompleted(T t, int i, int i2) {
        addChangePayload.IAuthTabCallback<addChangePayload> iAuthTabCallbackOnExtraCallback;
        if (t.onUnminimized() < 0 || (iAuthTabCallbackOnExtraCallback = RNGestureHandlerFactoryUtil.onExtraCallback.onExtraCallback(t)) == null) {
            return;
        }
        int iAccess100 = t.access100();
        if (iAccess100 == 1) {
            onExtraCallbackWithResult(RNGestureHandlerStateChangeEvent.Companion.IAuthTabCallback(t, i, i2, iAuthTabCallbackOnExtraCallback.onExtraCallback(t)));
            return;
        }
        if (iAccess100 == 2 || iAccess100 == 3) {
            onWarmupCompleted("onGestureHandlerStateChange", RNGestureHandlerStateChangeEvent.Companion.onWarmupCompleted(iAuthTabCallbackOnExtraCallback.onExtraCallback(t), i, i2));
        } else {
            if (iAccess100 != 4) {
                return;
            }
            onWarmupCompleted("onGestureHandlerStateChange", RNGestureHandlerStateChangeEvent.Companion.onWarmupCompleted(iAuthTabCallbackOnExtraCallback.onExtraCallback(t), i, i2));
        }
    }

    private final <T extends addChangePayload> void IAuthTabCallback(T t) {
        if (t.onUnminimized() >= 0) {
            if (t.onRelationshipValidationResult() == 2 || t.onRelationshipValidationResult() == 4 || t.onRelationshipValidationResult() == 0 || t.ICustomTabsCallbackStub() != null) {
                int iAccess100 = t.access100();
                if (iAccess100 == 1) {
                    onExtraCallbackWithResult(RNGestureHandlerTouchEvent.Companion.onExtraCallback(t));
                } else {
                    if (iAccess100 != 4) {
                        return;
                    }
                    onWarmupCompleted("onGestureHandlerEvent", RNGestureHandlerTouchEvent.Companion.IAuthTabCallback(t));
                }
            }
        }
    }

    private final <T extends Event<T>> void onExtraCallbackWithResult(T t) {
        this.onExtraCallbackWithResult.onExtraCallback(t, this.onExtraCallback);
    }

    private final void IAuthTabCallback(RNGestureHandlerEvent rNGestureHandlerEvent) {
        ReactContextExtensionsKt.IAuthTabCallback(this.onExtraCallback, rNGestureHandlerEvent);
    }

    private final void onWarmupCompleted(String str, WritableMap writableMap) {
        isTmpDetached.onExtraCallback(this.onExtraCallback).emit(str, writableMap);
    }
}
