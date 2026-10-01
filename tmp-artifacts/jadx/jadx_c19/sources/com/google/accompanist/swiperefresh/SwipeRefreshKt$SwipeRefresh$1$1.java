package com.google.accompanist.swiperefresh;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SwipeRefreshKt$SwipeRefresh$1$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshKt$SwipeRefresh$1$1(SwipeRefreshState swipeRefreshState, access13800<? super SwipeRefreshKt$SwipeRefresh$1$1> access13800Var) {
        super(2, access13800Var);
        this.$state = swipeRefreshState;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        return new SwipeRefreshKt$SwipeRefresh$1$1(this.$state, access13800Var);
    }

    public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            if (!this.$state.isSwipeInProgress()) {
                SwipeRefreshState swipeRefreshState = this.$state;
                this.label = 1;
                if (swipeRefreshState.animateOffsetTo$swiperefresh_release(0.0f, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
        }
        return Unit.INSTANCE;
    }
}
