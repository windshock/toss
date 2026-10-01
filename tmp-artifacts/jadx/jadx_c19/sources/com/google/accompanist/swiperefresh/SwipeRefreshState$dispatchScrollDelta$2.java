package com.google.accompanist.swiperefresh;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.isQueryRefinementEnabled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SwipeRefreshState$dispatchScrollDelta$2 extends SuspendLambda implements Function1<access13800<? super Unit>, Object> {
    final /* synthetic */ float $delta;
    int label;
    final /* synthetic */ SwipeRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshState$dispatchScrollDelta$2(SwipeRefreshState swipeRefreshState, float f, access13800<? super SwipeRefreshState$dispatchScrollDelta$2> access13800Var) {
        super(1, access13800Var);
        this.this$0 = swipeRefreshState;
        this.$delta = f;
    }

    public final access13800<Unit> create(@NotNull access13800<?> access13800Var) {
        return new SwipeRefreshState$dispatchScrollDelta$2(this.this$0, this.$delta, access13800Var);
    }

    public final Object invoke(@Nullable access13800<? super Unit> access13800Var) {
        return create(access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            isQueryRefinementEnabled isqueryrefinementenabled = this.this$0._indicatorOffset;
            Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(((Number) this.this$0._indicatorOffset.IAuthTabCallback()).floatValue() + this.$delta);
            this.label = 1;
            if (isqueryrefinementenabled.onWarmupCompleted(fOnExtraCallbackWithResult, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
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
