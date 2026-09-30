package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class syalud implements CoroutineContext {
    private final /* synthetic */ CoroutineContext IAuthTabCallback;
    public final Throwable onExtraCallback;

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) this.IAuthTabCallback.fold(r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
        return (E) this.IAuthTabCallback.get(onextracallback);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        return this.IAuthTabCallback.minusKey(onextracallback);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return this.IAuthTabCallback.plus(coroutineContext);
    }

    public syalud(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        this.IAuthTabCallback = coroutineContext;
        this.onExtraCallback = th;
    }
}
