package o;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access13600 implements CoroutineContext, Serializable {
    public static final access13600 IAuthTabCallback = new access13600();
    private static final long serialVersionUID = 0;

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        return r;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.onExtraCallback<E> onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(@NotNull CoroutineContext.onExtraCallback<?> onextracallback) {
        Intrinsics.checkNotNullParameter(onextracallback, "");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        return coroutineContext;
    }

    private access13600() {
    }

    private final Object readResolve() {
        return IAuthTabCallback;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
