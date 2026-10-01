package o;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt71<T> implements ltlud<T> {
    private final List<Pair<Function1<T, Boolean>, ltlud<T>>> onExtraCallbackWithResult;

    /* JADX WARN: Multi-variable type inference failed */
    public lt71(@NotNull List<? extends Pair<? extends Function1<? super T, Boolean>, ? extends ltlud<? super T>>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallbackWithResult = list;
    }
}
