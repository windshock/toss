package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.lud;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final /* synthetic */ class setWindowVisibilityChangedListener {

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super lud<? extends Unit>>, Object> {
        final /* synthetic */ E $element;
        final /* synthetic */ lt<E> $this_trySendBlocking;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallback(lt<? super E> ltVar, E e, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$this_trySendBlocking = ltVar;
            this.$element = e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            onExtraCallback onextracallback = new onExtraCallback(this.$this_trySendBlocking, this.$element, access13800Var);
            onextracallback.L$0 = obj;
            return onextracallback;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super lud<Unit>> access13800Var) {
            return ((onExtraCallback) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM31constructorimpl;
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    lt<E> ltVar = this.$this_trySendBlocking;
                    E e = this.$element;
                    Result.Companion companion = Result.Companion;
                    this.label = 1;
                    if (ltVar.onExtraCallback(e, this) == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
            }
            return lud.onExtraCallback(Result.onNavigationEvent(objM31constructorimpl) ? lud.Companion.onNavigationEvent(Unit.INSTANCE) : lud.Companion.onExtraCallback(Result.m32exceptionOrNullimpl(objM31constructorimpl)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object onExtraCallbackWithResult(@NotNull lt<? super E> ltVar, E e) {
        Object objIAuthTabCallback = ltVar.IAuthTabCallback(e);
        if (objIAuthTabCallback instanceof lud.onExtraCallback) {
            return ((lud) onLoadCleared.onExtraCallback(null, new onExtraCallback(ltVar, e, null), 1, null)).onExtraCallback();
        }
        return lud.Companion.onNavigationEvent(Unit.INSTANCE);
    }
}
