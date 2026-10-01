package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.UpdatePackageStrategy;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class djExternalSyntheticApiModelOutline4<T> implements UpdatePackageStrategy<T> {
    private final T IAuthTabCallback;
    private final CoroutineContext.onExtraCallback<?> onExtraCallbackWithResult;
    private final ThreadLocal<T> onWarmupCompleted;

    public djExternalSyntheticApiModelOutline4(T t, @NotNull ThreadLocal<T> threadLocal) {
        this.IAuthTabCallback = t;
        this.onWarmupCompleted = threadLocal;
        this.onExtraCallbackWithResult = new ycxsya(threadLocal);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) UpdatePackageStrategy.onExtraCallbackWithResult.onExtraCallbackWithResult(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return UpdatePackageStrategy.onExtraCallbackWithResult.IAuthTabCallback(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.onExtraCallback<?> getKey() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.UpdatePackageStrategy
    public T onWarmupCompleted(@NotNull CoroutineContext coroutineContext) {
        T t = this.onWarmupCompleted.get();
        this.onWarmupCompleted.set(this.IAuthTabCallback);
        return t;
    }

    @Override // o.UpdatePackageStrategy
    public void onExtraCallbackWithResult(@NotNull CoroutineContext coroutineContext, T t) {
        this.onWarmupCompleted.set(t);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        return Intrinsics.areEqual(getKey(), onextracallback) ? access13600.IAuthTabCallback : this;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
        if (!Intrinsics.areEqual(getKey(), onextracallback)) {
            return null;
        }
        Intrinsics.checkNotNull(this, "");
        return this;
    }

    public String toString() {
        return "ThreadLocal(value=" + this.IAuthTabCallback + ", threadLocal = " + this.onWarmupCompleted + ')';
    }
}
