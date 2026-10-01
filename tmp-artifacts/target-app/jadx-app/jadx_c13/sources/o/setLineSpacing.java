package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.access13700;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class setLineSpacing<S, T> extends sz<T> {
    protected final IAnimation<S> onWarmupCompleted;

    @Override // o.sz, o.IAnimation
    public Object collect(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) {
        return onWarmupCompleted((setLineSpacing) this, (setRipple) setripple, access13800Var);
    }

    @Override // o.sz
    protected Object onExtraCallback(@NotNull ok<? super T> okVar, @NotNull access13800<? super Unit> access13800Var) {
        return IAuthTabCallback(this, okVar, access13800Var);
    }

    protected abstract Object onExtraCallback(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var);

    /* JADX WARN: Multi-variable type inference failed */
    public setLineSpacing(@NotNull IAnimation<? extends S> iAnimation, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(coroutineContext, i, closeableUtils);
        this.onWarmupCompleted = iAnimation;
    }

    private final Object onNavigationEvent(setRipple<? super T> setripple, CoroutineContext coroutineContext, access13800<? super Unit> access13800Var) {
        return ycx11.IAuthTabCallback(coroutineContext, ycx11.IAuthTabCallback(setripple, access13800Var.getContext()), null, new onNavigationEvent(this, null), access13800Var, 4, null);
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<setRipple<? super T>, access13800<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ setLineSpacing<S, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(setLineSpacing<S, T> setlinespacing, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.this$0 = setlinespacing;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.this$0, access13800Var);
            onnavigationevent.L$0 = obj;
            return onnavigationevent;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Object invoke(setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
            return ((onNavigationEvent) create(setripple, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                setRipple<? super T> setripple = (setRipple) this.L$0;
                setLineSpacing<S, T> setlinespacing = this.this$0;
                this.label = 1;
                if (setlinespacing.onExtraCallback(setripple, this) == objOnExtraCallback) {
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

    static /* synthetic */ <S, T> Object IAuthTabCallback(setLineSpacing<S, T> setlinespacing, ok<? super T> okVar, access13800<? super Unit> access13800Var) {
        Object objOnExtraCallback = setlinespacing.onExtraCallback(new getAlignItems(okVar), access13800Var);
        return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
    }

    static /* synthetic */ <S, T> Object onWarmupCompleted(setLineSpacing<S, T> setlinespacing, setRipple<? super T> setripple, access13800<? super Unit> access13800Var) {
        if (setlinespacing.onExtraCallbackWithResult == -3) {
            CoroutineContext context = access13800Var.getContext();
            CoroutineContext coroutineContextIAuthTabCallback = StatisticData.IAuthTabCallback(context, setlinespacing.onNavigationEvent);
            if (Intrinsics.areEqual(coroutineContextIAuthTabCallback, context)) {
                Object objOnExtraCallback = setlinespacing.onExtraCallback(setripple, access13800Var);
                return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
            }
            access13700.onWarmupCompleted onwarmupcompleted = access13700.onWarmupCompleted;
            if (Intrinsics.areEqual(coroutineContextIAuthTabCallback.get(onwarmupcompleted), context.get(onwarmupcompleted))) {
                Object objOnNavigationEvent = setlinespacing.onNavigationEvent(setripple, coroutineContextIAuthTabCallback, access13800Var);
                return objOnNavigationEvent == access14100.onExtraCallback() ? objOnNavigationEvent : Unit.INSTANCE;
            }
        }
        Object objCollect = super.collect(setripple, access13800Var);
        return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
    }

    @Override // o.sz
    public String toString() {
        return this.onWarmupCompleted + " -> " + super.toString();
    }
}
