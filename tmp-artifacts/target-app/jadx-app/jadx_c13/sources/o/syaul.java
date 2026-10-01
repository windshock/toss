package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syaul {
    public static final <R> Object onExtraCallback(@NotNull Function2<? super findResAndMsg, ? super access13800<? super R>, ? extends Object> function2, @NotNull access13800<? super R> access13800Var) {
        syaul1 syaul1Var = new syaul1(access13800Var.getContext(), access13800Var);
        Object objOnWarmupCompleted = fromInt.onWarmupCompleted(syaul1Var, syaul1Var, function2);
        if (objOnWarmupCompleted == access14100.onExtraCallback()) {
            access14600.IAuthTabCallback(access13800Var);
        }
        return objOnWarmupCompleted;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getBacktraceNote<findResAndMsg, setRipple<? super R>, access13800<? super Unit>, Object> $block;
        final /* synthetic */ setRipple<R> $this_flow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(getBacktraceNote<? super findResAndMsg, ? super setRipple<? super R>, ? super access13800<? super Unit>, ? extends Object> getbacktracenote, setRipple<? super R> setripple, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$block = getbacktracenote;
            this.$this_flow = setripple;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$block, this.$this_flow, access13800Var);
            onwarmupcompleted.L$0 = obj;
            return onwarmupcompleted;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onWarmupCompleted) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                getBacktraceNote<findResAndMsg, setRipple<? super R>, access13800<? super Unit>, Object> getbacktracenote = this.$block;
                Object obj2 = this.$this_flow;
                this.label = 1;
                if (getbacktracenote.invoke(findresandmsg, obj2, this) == objOnExtraCallback) {
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

    public static final <R> IAnimation<R> onWarmupCompleted(@NotNull getBacktraceNote<? super findResAndMsg, ? super setRipple<? super R>, ? super access13800<? super Unit>, ? extends Object> getbacktracenote) {
        return new onExtraCallbackWithResult(getbacktracenote);
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    public static final class onExtraCallbackWithResult<R> implements IAnimation<R> {
        final /* synthetic */ getBacktraceNote IAuthTabCallback;

        public onExtraCallbackWithResult(getBacktraceNote getbacktracenote) {
            this.IAuthTabCallback = getbacktracenote;
        }

        @Override // o.IAnimation
        public Object collect(setRipple<? super R> setripple, access13800<? super Unit> access13800Var) {
            Object objOnExtraCallback = syaul.onExtraCallback(new onWarmupCompleted(this.IAuthTabCallback, setripple, null), access13800Var);
            return objOnExtraCallback == access14100.onExtraCallback() ? objOnExtraCallback : Unit.INSTANCE;
        }
    }
}
