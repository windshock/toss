package com.google.accompanist.swiperefresh;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.access13800;
import o.access14300;
import o.findResAndMsg;
import o.getShowText;
import o.getSupportedHighSpeedResolutionsFor;
import o.onItemClicked;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    final /* synthetic */ int $indicatorHeight;
    final /* synthetic */ getSupportedHighSpeedResolutionsFor<Float> $offset$delegate;
    final /* synthetic */ float $refreshingOffsetPx;
    final /* synthetic */ SwipeRefreshState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(SwipeRefreshState swipeRefreshState, int i2, float f, getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor, access13800<? super SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1> access13800Var) {
        super(2, access13800Var);
        this.$state = swipeRefreshState;
        this.$indicatorHeight = i2;
        this.$refreshingOffsetPx = f;
        this.$offset$delegate = getsupportedhighspeedresolutionsfor;
    }

    public final access13800<Unit> create(@Nullable Object obj, @NotNull access13800<?> access13800Var) {
        return new SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1(this.$state, this.$indicatorHeight, this.$refreshingOffsetPx, this.$offset$delegate, access13800Var);
    }

    public final Object invoke(@NotNull findResAndMsg findresandmsg, @Nullable access13800<? super Unit> access13800Var) {
        return create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            float fM26SwipeRefreshIndicator__UAkqwU$lambda4 = SwipeRefreshIndicatorKt.m26SwipeRefreshIndicator__UAkqwU$lambda4(this.$offset$delegate);
            float f = this.$state.isRefreshing() ? this.$indicatorHeight + this.$refreshingOffsetPx : 0.0f;
            final getSupportedHighSpeedResolutionsFor<Float> getsupportedhighspeedresolutionsfor = this.$offset$delegate;
            Function2<Float, Float, Unit> function2 = new Function2<Float, Float, Unit>() { // from class: com.google.accompanist.swiperefresh.SwipeRefreshIndicatorKt$SwipeRefreshIndicator$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2, float f3) {
                    SwipeRefreshIndicatorKt.m27SwipeRefreshIndicator__UAkqwU$lambda5(getsupportedhighspeedresolutionsfor, f2);
                }
            };
            this.label = 1;
            if (getShowText.onWarmupCompleted(fM26SwipeRefreshIndicator__UAkqwU$lambda4, f, 0.0f, (onItemClicked) null, function2, this, 12, (Object) null) == objOnWarmupCompleted) {
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
