package o;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ltdj<T> implements ltlud<T> {
    private final List<ltlud<T>> onExtraCallback;

    /* JADX WARN: Multi-variable type inference failed */
    public ltdj(@NotNull List<? extends ltlud<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onExtraCallback = list;
    }
}
