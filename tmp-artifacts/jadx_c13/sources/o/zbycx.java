package o;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class zbycx<T> extends sz<T> {
    private final Iterable<IAnimation<T>> onWarmupCompleted;

    public /* synthetic */ zbycx(Iterable iterable, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i2 & 2) != 0 ? access13600.IAuthTabCallback : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? CloseableUtils.SUSPEND : closeableUtils);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zbycx(@NotNull Iterable<? extends IAnimation<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(coroutineContext, i, closeableUtils);
        this.onWarmupCompleted = iterable;
    }

    @Override // o.sz
    protected sz<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return new zbycx(this.onWarmupCompleted, coroutineContext, i, closeableUtils);
    }

    @Override // o.sz
    public ReceiveChannel<T> onNavigationEvent(@NotNull findResAndMsg findresandmsg) {
        return jw.onExtraCallback(findresandmsg, this.onNavigationEvent, this.onExtraCallbackWithResult, onExtraCallbackWithResult());
    }

    @Override // o.sz
    protected Object onExtraCallback(@NotNull ok<? super T> okVar, @NotNull access13800<? super Unit> access13800Var) {
        getAlignItems getalignitems = new getAlignItems(okVar);
        Iterator<IAnimation<T>> it = this.onWarmupCompleted.iterator();
        while (it.hasNext()) {
            onLoadStarted.onExtraCallback(okVar, null, null, new onNavigationEvent(it.next(), getalignitems, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        final /* synthetic */ getAlignItems<T> $collector;
        final /* synthetic */ IAnimation<T> $flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(IAnimation<? extends T> iAnimation, getAlignItems<T> getalignitems, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$flow = iAnimation;
            this.$collector = getalignitems;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            return new onNavigationEvent(this.$flow, this.$collector, access13800Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Object invoke(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            return ((onNavigationEvent) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback = access14100.onExtraCallback();
            int i = this.label;
            if (i == 0) {
                ResultKt.onNavigationEvent(obj);
                IAnimation<T> iAnimation = this.$flow;
                getAlignItems<T> getalignitems = this.$collector;
                this.label = 1;
                if (iAnimation.collect(getalignitems, this) == objOnExtraCallback) {
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
}
