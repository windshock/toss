package o;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearArch<T, K> implements Sequence<T> {
    private final Sequence<T> onExtraCallbackWithResult;
    private final Function1<T, K> onNavigationEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public clearArch(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.onExtraCallbackWithResult = sequence;
        this.onNavigationEvent = function1;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> IAuthTabCallback() {
        return new addCommandLine(this.onExtraCallbackWithResult.IAuthTabCallback(), this.onNavigationEvent);
    }
}
