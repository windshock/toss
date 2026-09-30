package com.google.accompanist.swiperefresh;

import kotlin.Unit;
import o.CameraPresenceProviderExternalSyntheticLambda0;
import o.CameraPresenceProviderExternalSyntheticLambda2;
import o.access13800;
import o.access14300;
import o.getSupportedHighSpeedResolutionsFor;
import o.inflateMenu;
import o.isIconified;
import o.isOverflowMenuShowing;
import o.isQueryRefinementEnabled;
import o.onSuggestionsKey;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SwipeRefreshState {
    private final getSupportedHighSpeedResolutionsFor isRefreshing$delegate;
    private final isQueryRefinementEnabled<Float, onSuggestionsKey> _indicatorOffset = isIconified.onWarmupCompleted(0.0f, 0.0f, 2, (Object) null);
    private final inflateMenu mutatorMutex = new inflateMenu();
    private final getSupportedHighSpeedResolutionsFor isSwipeInProgress$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);

    public SwipeRefreshState(boolean z) {
        this.isRefreshing$delegate = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.valueOf(z), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
    }

    public final boolean isRefreshing() {
        return ((Boolean) this.isRefreshing$delegate.onExtraCallbackWithResult()).booleanValue();
    }

    public final void setRefreshing(boolean z) {
        this.isRefreshing$delegate.IAuthTabCallback(Boolean.valueOf(z));
    }

    public final boolean isSwipeInProgress() {
        return ((Boolean) this.isSwipeInProgress$delegate.onExtraCallbackWithResult()).booleanValue();
    }

    public final void setSwipeInProgress$swiperefresh_release(boolean z) {
        this.isSwipeInProgress$delegate.IAuthTabCallback(Boolean.valueOf(z));
    }

    public final float getIndicatorOffset() {
        return ((Number) this._indicatorOffset.IAuthTabCallback()).floatValue();
    }

    public final Object animateOffsetTo$swiperefresh_release(float f, @NotNull access13800<? super Unit> access13800Var) {
        Object objIAuthTabCallback = inflateMenu.IAuthTabCallback(this.mutatorMutex, (isOverflowMenuShowing) null, new SwipeRefreshState$animateOffsetTo$2(this, f, null), access13800Var, 1, (Object) null);
        return objIAuthTabCallback == access14300.onWarmupCompleted() ? objIAuthTabCallback : Unit.INSTANCE;
    }

    public final Object dispatchScrollDelta$swiperefresh_release(float f, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult = this.mutatorMutex.onExtraCallbackWithResult(isOverflowMenuShowing.UserInput, new SwipeRefreshState$dispatchScrollDelta$2(this, f, null), access13800Var);
        return objOnExtraCallbackWithResult == access14300.onWarmupCompleted() ? objOnExtraCallbackWithResult : Unit.INSTANCE;
    }
}
