package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getDividerDrawableVertical<T> implements setRipple<T> {
    private final CoroutineContext IAuthTabCallback;
    private final Function2<T, access13800<? super Unit>, Object> onExtraCallback;
    private final Object onWarmupCompleted;

    public getDividerDrawableVertical(@NotNull setRipple<? super T> setripple, @NotNull CoroutineContext coroutineContext) {
        this.IAuthTabCallback = coroutineContext;
        this.onWarmupCompleted = getViewPager.onExtraCallback(coroutineContext);
        this.onExtraCallback = new onNavigationEvent(setripple, null);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<T, access13800<? super Unit>, Object> {
        final /* synthetic */ setRipple<T> $downstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(setRipple<? super T> setripple, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$downstream = setripple;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t, access13800<? super Unit> access13800Var) {
            return ((onNavigationEvent) create(t, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$downstream, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                Object obj2 = this.L$0;
                setRipple<T> setripple = this.$downstream;
                this.label = 1;
                if (setripple.emit(obj2, this) == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.setRipple
    public Object emit(T t, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = ycx11.onExtraCallback(this.IAuthTabCallback, t, this.onWarmupCompleted, this.onExtraCallback, access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }
}
