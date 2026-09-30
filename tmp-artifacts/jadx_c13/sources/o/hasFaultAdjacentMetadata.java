package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class hasFaultAdjacentMetadata<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.onExtraCallback<E> {
    private final CoroutineContext.onExtraCallback<?> IAuthTabCallback;
    private final Function1<CoroutineContext.Element, E> onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.CoroutineContext$onExtraCallback<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public hasFaultAdjacentMetadata(@NotNull CoroutineContext.onExtraCallback<B> onextracallback, @NotNull Function1<? super CoroutineContext.Element, ? extends E> function1) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = function1;
        this.IAuthTabCallback = onextracallback instanceof hasFaultAdjacentMetadata ? (CoroutineContext.onExtraCallback<B>) ((hasFaultAdjacentMetadata) onextracallback).IAuthTabCallback : onextracallback;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    public final CoroutineContext.Element onNavigationEvent(@NotNull CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(element, "");
        return (CoroutineContext.Element) this.onExtraCallback.invoke(element);
    }

    public final boolean onExtraCallback(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return onextracallback == this || this.IAuthTabCallback == onextracallback;
    }
}
