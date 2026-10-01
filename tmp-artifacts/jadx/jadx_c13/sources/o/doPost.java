package o;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class doPost<T> extends ycx4<T> {
    private final ThreadLocal<Pair<CoroutineContext, Object>> onExtraCallbackWithResult;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public doPost(@NotNull CoroutineContext coroutineContext, @NotNull access13800<? super T> access13800Var) {
        IStatisticMonitor iStatisticMonitor = IStatisticMonitor.onWarmupCompleted;
        super(coroutineContext.get(iStatisticMonitor) == null ? coroutineContext.plus(iStatisticMonitor) : coroutineContext, access13800Var);
        this.onExtraCallbackWithResult = new ThreadLocal<>();
        if (access13800Var.getContext().get(access13700.onWarmupCompleted) instanceof GeckoHubImp) {
            return;
        }
        Object objOnNavigationEvent = getViewPager.onNavigationEvent(coroutineContext, (Object) null);
        getViewPager.onExtraCallbackWithResult(coroutineContext, objOnNavigationEvent);
        onWarmupCompleted(coroutineContext, objOnNavigationEvent);
    }

    public final void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        this.threadLocalIsSet = true;
        this.onExtraCallbackWithResult.set(getWrite.IAuthTabCallback(coroutineContext, obj));
    }

    public final boolean onActivityLayout() {
        boolean z = this.threadLocalIsSet && this.onExtraCallbackWithResult.get() == null;
        this.onExtraCallbackWithResult.remove();
        return !z;
    }

    @Override // o.ycx4
    public void onTransact() {
        onPostMessage();
    }

    @Override // o.ycx4, o.RequestCoordinator
    public void onNavigationEvent(@Nullable Object obj) {
        onPostMessage();
        Object objOnExtraCallbackWithResult = InterceptorModel.onExtraCallbackWithResult(obj, this.IAuthTabCallback);
        access13800<T> access13800Var = this.IAuthTabCallback;
        CoroutineContext context = access13800Var.getContext();
        Object objOnNavigationEvent = getViewPager.onNavigationEvent(context, (Object) null);
        doPost<?> dopostOnWarmupCompleted = objOnNavigationEvent != getViewPager.IAuthTabCallback ? StatisticData.onWarmupCompleted(access13800Var, context, objOnNavigationEvent) : null;
        try {
            this.IAuthTabCallback.resumeWith(objOnExtraCallbackWithResult);
            Unit unit = Unit.INSTANCE;
            if (dopostOnWarmupCompleted == null || dopostOnWarmupCompleted.onActivityLayout()) {
                getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent);
            }
        } catch (Throwable th) {
            if (dopostOnWarmupCompleted == null || dopostOnWarmupCompleted.onActivityLayout()) {
                getViewPager.onExtraCallbackWithResult(context, objOnNavigationEvent);
            }
            throw th;
        }
    }

    private final void onPostMessage() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.onExtraCallbackWithResult.get();
            if (pair != null) {
                getViewPager.onExtraCallbackWithResult(pair.onExtraCallbackWithResult(), pair.IAuthTabCallback());
            }
            this.onExtraCallbackWithResult.remove();
        }
    }
}
