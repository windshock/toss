package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AbstractCoroutineContextElement implements CoroutineContext.Element {
    private final CoroutineContext.onExtraCallback<?> onExtraCallbackWithResult;

    public AbstractCoroutineContextElement(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onExtraCallbackWithResult = onextracallback;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.onNavigationEvent.onExtraCallback(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
        return (E) CoroutineContext.Element.onNavigationEvent.onExtraCallback(this, onextracallback);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        return CoroutineContext.Element.onNavigationEvent.onNavigationEvent(this, onextracallback);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.onNavigationEvent.onExtraCallbackWithResult(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.onExtraCallback<?> getKey() {
        return this.onExtraCallbackWithResult;
    }
}
