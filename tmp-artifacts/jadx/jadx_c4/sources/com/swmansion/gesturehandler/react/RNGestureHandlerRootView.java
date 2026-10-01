package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.isTmpDetached;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RNGestureHandlerRootView extends ReactViewGroup {
    public static final Companion Companion = new Companion(null);
    private boolean onExtraCallback;
    private boolean onExtraCallbackWithResult;
    private RNGestureHandlerRootHelper onNavigationEvent;

    public RNGestureHandlerRootView(@Nullable Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = this.onExtraCallbackWithResult || !Companion.onWarmupCompleted(this);
        this.onExtraCallback = z;
        if (z && this.onNavigationEvent == null) {
            ReactContext context = getContext();
            Intrinsics.checkNotNull(context, "");
            this.onNavigationEvent = new RNGestureHandlerRootHelper(context, this);
        }
    }

    public final void onNavigationEvent() {
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.onNavigationEvent;
        if (rNGestureHandlerRootHelper != null) {
            rNGestureHandlerRootHelper.onNavigationEvent();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.onExtraCallback) {
            RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.onNavigationEvent;
            Intrinsics.checkNotNull(rNGestureHandlerRootHelper);
            if (rNGestureHandlerRootHelper.onWarmupCompleted(motionEvent)) {
                return true;
            }
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchGenericMotionEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.onExtraCallback && isTmpDetached.onExtraCallbackWithResult(motionEvent)) {
            RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.onNavigationEvent;
            Intrinsics.checkNotNull(rNGestureHandlerRootHelper);
            if (rNGestureHandlerRootHelper.onWarmupCompleted(motionEvent)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.onExtraCallback) {
            RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.onNavigationEvent;
            Intrinsics.checkNotNull(rNGestureHandlerRootHelper);
            rNGestureHandlerRootHelper.IAuthTabCallback();
        }
        super/*android.view.ViewGroup*/.requestDisallowInterceptTouchEvent(z);
    }

    public final void onExtraCallback(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper = this.onNavigationEvent;
        if (rNGestureHandlerRootHelper != null) {
            rNGestureHandlerRootHelper.onWarmupCompleted(view);
        }
    }

    public final boolean onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public final void setUnstableForceActive(boolean z) {
        this.onExtraCallbackWithResult = z;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean onWarmupCompleted(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof RNGestureHandlerEnabledRootView) || (parent instanceof RNGestureHandlerRootView)) {
                    return true;
                }
                if (parent instanceof RootView) {
                    return false;
                }
            }
            return false;
        }
    }
}
