package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access14200 {
    public static <R, T> Object onWarmupCompleted(@NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2, R r, @NotNull access13800<? super T> access13800Var) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(access13800Var, "");
        return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, onWarmupCompleted(access14600.onExtraCallback(access13800Var)));
    }

    public static <R, P, T> Object onExtraCallbackWithResult(@NotNull getBacktraceNote<? super R, ? super P, ? super access13800<? super T>, ? extends Object> getbacktracenote, R r, P p, @NotNull access13800<? super T> access13800Var) {
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Intrinsics.checkNotNullParameter(access13800Var, "");
        return ((getBacktraceNote) TypeIntrinsics.beforeCheckcastToFunctionOfArity(getbacktracenote, 3)).invoke(r, p, onWarmupCompleted(access14600.onExtraCallback(access13800Var)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> access13800<Unit> onNavigationEvent(@NotNull Function1<? super access13800<? super T>, ? extends Object> function1, @NotNull access13800<? super T> access13800Var) {
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(access13800Var, "");
        access13800<?> access13800VarOnExtraCallback = access14600.onExtraCallback(access13800Var);
        if (function1 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function1).create(access13800VarOnExtraCallback);
        }
        CoroutineContext context = access13800VarOnExtraCallback.getContext();
        if (context == access13600.IAuthTabCallback) {
            return new IAuthTabCallback(access13800VarOnExtraCallback, function1);
        }
        return new onWarmupCompleted(access13800VarOnExtraCallback, context, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> access13800<Unit> onNavigationEvent(@NotNull Function2<? super R, ? super access13800<? super T>, ? extends Object> function2, R r, @NotNull access13800<? super T> access13800Var) {
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(access13800Var, "");
        access13800<?> access13800VarOnExtraCallback = access14600.onExtraCallback(access13800Var);
        if (function2 instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) function2).create(r, access13800VarOnExtraCallback);
        }
        CoroutineContext context = access13800VarOnExtraCallback.getContext();
        if (context == access13600.IAuthTabCallback) {
            return new onExtraCallbackWithResult(access13800VarOnExtraCallback, function2, r);
        }
        return new onNavigationEvent(access13800VarOnExtraCallback, context, function2, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> access13800<T> onExtraCallbackWithResult(@NotNull access13800<? super T> access13800Var) {
        access13800<T> access13800Var2;
        Intrinsics.checkNotNullParameter(access13800Var, "");
        ContinuationImpl continuationImpl = access13800Var instanceof ContinuationImpl ? (ContinuationImpl) access13800Var : null;
        return (continuationImpl == null || (access13800Var2 = (access13800<T>) continuationImpl.intercepted()) == null) ? access13800Var : access13800Var2;
    }

    public static final class IAuthTabCallback extends RestrictedContinuationImpl {
        final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IAuthTabCallback(access13800 access13800Var, Function1 function1) {
            super(access13800Var);
            this.$this_createCoroutineUnintercepted$inlined = function1;
            Intrinsics.checkNotNull(access13800Var, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                ResultKt.onNavigationEvent(obj);
                Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "");
                return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
            }
            if (i == 1) {
                this.label = 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
    }

    public static final class onExtraCallbackWithResult extends RestrictedContinuationImpl {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(access13800 access13800Var, Function2 function2, Object obj) {
            super(access13800Var);
            this.$this_createCoroutineUnintercepted$inlined = function2;
            this.$receiver$inlined = obj;
            Intrinsics.checkNotNull(access13800Var, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                ResultKt.onNavigationEvent(obj);
                Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "");
                return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            }
            if (i == 1) {
                this.label = 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
    }

    public static final class onNavigationEvent extends ContinuationImpl {
        final /* synthetic */ Object $receiver$inlined;
        final /* synthetic */ Function2 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onNavigationEvent(access13800 access13800Var, CoroutineContext coroutineContext, Function2 function2, Object obj) {
            super(access13800Var, coroutineContext);
            this.$this_createCoroutineUnintercepted$inlined = function2;
            this.$receiver$inlined = obj;
            Intrinsics.checkNotNull(access13800Var, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                ResultKt.onNavigationEvent(obj);
                Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "");
                return ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 2)).invoke(this.$receiver$inlined, this);
            }
            if (i == 1) {
                this.label = 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
    }

    public static final class onWarmupCompleted extends ContinuationImpl {
        final /* synthetic */ Function1 $this_createCoroutineUnintercepted$inlined;
        private int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onWarmupCompleted(access13800 access13800Var, CoroutineContext coroutineContext, Function1 function1) {
            super(access13800Var, coroutineContext);
            this.$this_createCoroutineUnintercepted$inlined = function1;
            Intrinsics.checkNotNull(access13800Var, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                this.label = 1;
                ResultKt.onNavigationEvent(obj);
                Intrinsics.checkNotNull(this.$this_createCoroutineUnintercepted$inlined, "");
                return ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1)).invoke(this);
            }
            if (i == 1) {
                this.label = 2;
                ResultKt.onNavigationEvent(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
    }

    private static final <T> access13800<T> onWarmupCompleted(access13800<? super T> access13800Var) {
        CoroutineContext context = access13800Var.getContext();
        if (context == access13600.IAuthTabCallback) {
            return new onExtraCallback(access13800Var);
        }
        return new asInterface(access13800Var, context);
    }

    public static final class onExtraCallback extends RestrictedContinuationImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(access13800<? super T> access13800Var) {
            super(access13800Var);
            Intrinsics.checkNotNull(access13800Var, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object obj) {
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
    }

    public static final class asInterface extends ContinuationImpl {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asInterface(access13800<? super T> access13800Var, CoroutineContext coroutineContext) {
            super(access13800Var, coroutineContext);
            Intrinsics.checkNotNull(access13800Var, "");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public Object invokeSuspend(Object obj) {
            ResultKt.onNavigationEvent(obj);
            return obj;
        }
    }
}
