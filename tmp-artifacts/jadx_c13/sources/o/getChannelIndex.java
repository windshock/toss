package o;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getChannelIndex {
    public static /* synthetic */ Object onWarmupCompleted(CoroutineContext coroutineContext, Function0 function0, access13800 access13800Var, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = access13600.IAuthTabCallback;
        }
        return onExtraCallbackWithResult(coroutineContext, function0, access13800Var);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class IAuthTabCallback<T> extends SuspendLambda implements Function2<findResAndMsg, access13800<? super T>, Object> {
        final /* synthetic */ Function0<T> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(Function0<? extends T> function0, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$block, access13800Var);
            iAuthTabCallback.L$0 = obj;
            return iAuthTabCallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super T> access13800Var) {
            return ((IAuthTabCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                ResultKt.onNavigationEvent(obj);
                return getChannelIndex.onNavigationEvent(((findResAndMsg) this.L$0).getCoroutineContext(), this.$block);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> Object onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull access13800<? super T> access13800Var) {
        return maybeUpdateAnimatable.onExtraCallback(coroutineContext, new IAuthTabCallback(function0, null), access13800Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T onNavigationEvent(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            setNeedUnzip setneedunzip = new setNeedUnzip();
            setneedunzip.IAuthTabCallback(getFullPackage.onExtraCallback(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                setneedunzip.onExtraCallbackWithResult();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
