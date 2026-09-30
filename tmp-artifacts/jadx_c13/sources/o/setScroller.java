package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setScroller<T> extends setLineSpacing<T, T> {
    public /* synthetic */ setScroller(IAnimation iAnimation, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iAnimation, (i2 & 2) != 0 ? access13600.IAuthTabCallback : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? CloseableUtils.SUSPEND : closeableUtils);
    }

    public setScroller(@NotNull IAnimation<? extends T> iAnimation, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(iAnimation, coroutineContext, i, closeableUtils);
    }

    @Override // o.sz
    protected sz<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return new setScroller(this.onWarmupCompleted, coroutineContext, i, closeableUtils);
    }

    @Override // o.sz
    public IAnimation<T> onWarmupCompleted() {
        return (IAnimation<T>) this.onWarmupCompleted;
    }

    @Override // o.setLineSpacing
    protected Object onExtraCallback(@NotNull setRipple<? super T> setripple, @NotNull access13800<? super Unit> access13800Var) {
        Object objCollect = this.onWarmupCompleted.collect(setripple, access13800Var);
        return objCollect == access14100.onExtraCallback() ? objCollect : Unit.INSTANCE;
    }
}
