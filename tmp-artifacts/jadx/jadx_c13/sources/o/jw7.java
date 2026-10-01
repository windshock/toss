package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class jw7<T, E> implements lt5<T> {
    private final Function1<T, E> IAuthTabCallback;
    private final E onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public jw7(E e, @NotNull Function1<? super T, ? extends E> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallback = e;
        this.IAuthTabCallback = function1;
    }

    @Override // o.lt5
    public boolean onExtraCallbackWithResult(T t) {
        return Intrinsics.areEqual(this.IAuthTabCallback.invoke(t), this.onExtraCallback);
    }
}
