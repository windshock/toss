package com.google.accompanist.swiperefresh;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.access13800;
import o.access14000;
import o.access14300;
import o.isQueryRefinementEnabled;
import o.onActionViewCollapsed;
import o.onItemClicked;
import o.onSuggestionsKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SwipeRefreshState$animateOffsetTo$2 extends SuspendLambda implements Function1<access13800<? super onActionViewCollapsed<Float, onSuggestionsKey>>, Object> {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ SwipeRefreshState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshState$animateOffsetTo$2(SwipeRefreshState swipeRefreshState, float f, access13800<? super SwipeRefreshState$animateOffsetTo$2> access13800Var) {
        super(1, access13800Var);
        this.this$0 = swipeRefreshState;
        this.$offset = f;
    }

    public final access13800<Unit> create(@NotNull access13800<?> access13800Var) {
        return new SwipeRefreshState$animateOffsetTo$2(this.this$0, this.$offset, access13800Var);
    }

    public final Object invoke(@Nullable access13800<? super onActionViewCollapsed<Float, onSuggestionsKey>> access13800Var) {
        return create(access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
        ResultKt.onNavigationEvent(obj);
        isQueryRefinementEnabled isqueryrefinementenabled = this.this$0._indicatorOffset;
        Float fOnExtraCallbackWithResult = access14000.onExtraCallbackWithResult(this.$offset);
        this.label = 1;
        Object objOnWarmupCompleted2 = isQueryRefinementEnabled.onWarmupCompleted(isqueryrefinementenabled, fOnExtraCallbackWithResult, (onItemClicked) null, (Object) null, (Function1) null, this, 14, (Object) null);
        return objOnWarmupCompleted2 == objOnWarmupCompleted ? objOnWarmupCompleted : objOnWarmupCompleted2;
    }
}
