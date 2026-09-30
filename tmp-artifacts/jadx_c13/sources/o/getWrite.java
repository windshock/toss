package o;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getWrite {
    public static final <A, B> Pair<A, B> IAuthTabCallback(A a, B b) {
        return new Pair<>(a, b);
    }

    public static final <T> List<T> IAuthTabCallback(@NotNull Pair<? extends T, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return CollectionsKt__CollectionsKt.listOf(pair.getFirst(), pair.getSecond());
    }
}
