package o;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class wwx<T> extends getRipple<T> {
    private final Function2<ok<? super T>, access13800<? super Unit>, Object> onWarmupCompleted;

    static final class onNavigationEvent extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ wwx<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(wwx<T> wwxVar, access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
            this.this$0 = wwxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onExtraCallback(null, this);
        }
    }

    public /* synthetic */ wwx(Function2 function2, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? access13600.IAuthTabCallback : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? CloseableUtils.SUSPEND : closeableUtils);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wwx(@NotNull Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(function2, coroutineContext, i, closeableUtils);
        this.onWarmupCompleted = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.getRipple, o.sz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onExtraCallback(@NotNull ok<? super T> okVar, @NotNull access13800<? super Unit> access13800Var) {
        onNavigationEvent onnavigationevent;
        if (access13800Var instanceof onNavigationEvent) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i = onnavigationevent.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(this, access13800Var);
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i2 = onnavigationevent.label;
        if (i2 == 0) {
            ResultKt.onNavigationEvent(obj);
            onnavigationevent.L$0 = okVar;
            onnavigationevent.label = 1;
            if (super.onExtraCallback(okVar, onnavigationevent) == objOnExtraCallback) {
                return objOnExtraCallback;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            okVar = (ok) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
        }
        if (!okVar.IAuthTabCallback()) {
            throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        }
        return Unit.INSTANCE;
    }

    @Override // o.getRipple, o.sz
    public sz<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return new wwx(this.onWarmupCompleted, coroutineContext, i, closeableUtils);
    }
}
