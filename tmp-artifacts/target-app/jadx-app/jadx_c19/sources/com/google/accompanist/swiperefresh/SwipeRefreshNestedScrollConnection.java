package com.google.accompanist.swiperefresh;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.RequestOptionConfig1;
import o.access13800;
import o.findResAndMsg;
import o.getBacktraceNoteBytes;
import o.isUseCaseAttached;
import o.maybeUpdateAnimatable;
import o.reverseSize;
import o.setRandomHost;
import o.setUseCaseAttached;
import o.sizeToRectF;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SwipeRefreshNestedScrollConnection implements reverseSize {
    private final findResAndMsg coroutineScope;
    private boolean enabled;
    private final Function0<Unit> onRefresh;
    private float refreshTrigger;
    private final SwipeRefreshState state;

    public SwipeRefreshNestedScrollConnection(@NotNull SwipeRefreshState swipeRefreshState, @NotNull findResAndMsg findresandmsg, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(swipeRefreshState, "");
        Intrinsics.checkNotNullParameter(findresandmsg, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.state = swipeRefreshState;
        this.coroutineScope = findresandmsg;
        this.onRefresh = function0;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final float getRefreshTrigger() {
        return this.refreshTrigger;
    }

    public final void setRefreshTrigger(float f) {
        this.refreshTrigger = f;
    }

    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long m47onPreScrollOzD1aCk(long j, int i2) {
        if (this.enabled && !this.state.isRefreshing()) {
            return (!sizeToRectF.onExtraCallback(i2, sizeToRectF.Companion.onWarmupCompleted()) || setUseCaseAttached.onTransact(j) >= 0.0f) ? setUseCaseAttached.Companion.IAuthTabCallback() : m44onScrollMKHz9U(j);
        }
        return setUseCaseAttached.Companion.IAuthTabCallback();
    }

    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long m45onPostScrollDzOQY0M(long j, long j2, int i2) {
        if (this.enabled && !this.state.isRefreshing()) {
            return (!sizeToRectF.onExtraCallback(i2, sizeToRectF.Companion.onWarmupCompleted()) || setUseCaseAttached.onTransact(j2) <= 0.0f) ? setUseCaseAttached.Companion.IAuthTabCallback() : m44onScrollMKHz9U(j2);
        }
        return setUseCaseAttached.Companion.IAuthTabCallback();
    }

    /* renamed from: onScroll-MK-Hz9U, reason: not valid java name */
    private final long m44onScrollMKHz9U(long j) {
        if (setUseCaseAttached.onTransact(j) > 0.0f) {
            this.state.setSwipeInProgress$swiperefresh_release(true);
        } else if (getBacktraceNoteBytes.onExtraCallback(this.state.getIndicatorOffset()) == 0) {
            this.state.setSwipeInProgress$swiperefresh_release(false);
        }
        float fCoerceAtLeast = RangesKt.coerceAtLeast((setUseCaseAttached.onTransact(j) * 0.5f) + this.state.getIndicatorOffset(), 0.0f) - this.state.getIndicatorOffset();
        if (Math.abs(fCoerceAtLeast) >= 0.5f) {
            maybeUpdateAnimatable.onNavigationEvent(this.coroutineScope, (CoroutineContext) null, (setRandomHost) null, new SwipeRefreshNestedScrollConnection$onScroll$1(this, fCoerceAtLeast, null), 3, (Object) null);
            return isUseCaseAttached.onNavigationEvent(0.0f, fCoerceAtLeast / 0.5f);
        }
        return setUseCaseAttached.Companion.IAuthTabCallback();
    }

    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object m46onPreFlingQWom1Mo(long j, @NotNull access13800<? super RequestOptionConfig1> access13800Var) {
        if (!this.state.isRefreshing() && this.state.getIndicatorOffset() >= this.refreshTrigger) {
            this.onRefresh.invoke();
        }
        this.state.setSwipeInProgress$swiperefresh_release(false);
        return RequestOptionConfig1.onExtraCallbackWithResult(RequestOptionConfig1.Companion.onExtraCallback());
    }
}
