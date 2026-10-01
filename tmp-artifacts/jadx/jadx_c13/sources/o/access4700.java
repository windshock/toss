package o;

import java.lang.Comparable;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface access4700<T extends Comparable<? super T>> {
    boolean contains(@NotNull T t);

    T getEndExclusive();

    T getStart();
}
