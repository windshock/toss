package o;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class getRipple<T> extends sz<T> {
    private final Function2<ok<? super T>, access13800<? super Unit>, Object> onWarmupCompleted;

    @Override // o.sz
    public Object onExtraCallback(@NotNull ok<? super T> okVar, @NotNull access13800<? super Unit> access13800Var) {
        return onWarmupCompleted(this, okVar, access13800Var);
    }

    public /* synthetic */ getRipple(Function2 function2, CoroutineContext coroutineContext, int i, CloseableUtils closeableUtils, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i2 & 2) != 0 ? access13600.IAuthTabCallback : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? CloseableUtils.SUSPEND : closeableUtils);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getRipple(@NotNull Function2<? super ok<? super T>, ? super access13800<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        super(coroutineContext, i, closeableUtils);
        this.onWarmupCompleted = function2;
    }

    @Override // o.sz
    public sz<T> onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, int i, @NotNull CloseableUtils closeableUtils) {
        return new getRipple(this.onWarmupCompleted, coroutineContext, i, closeableUtils);
    }

    static /* synthetic */ <T> Object onWarmupCompleted(getRipple<T> getripple, ok<? super T> okVar, access13800<? super Unit> access13800Var) {
        Object objInvoke = ((getRipple) getripple).onWarmupCompleted.invoke(okVar, access13800Var);
        return objInvoke == access14100.onExtraCallback() ? objInvoke : Unit.INSTANCE;
    }

    @Override // o.sz
    public String toString() {
        return "block[" + this.onWarmupCompleted + "] -> " + super.toString();
    }
}
