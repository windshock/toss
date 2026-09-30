package kotlin.jvm.internal;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ArrayIteratorKt {
    public static final <T> Iterator<T> iterator(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return new ArrayIterator(tArr);
    }
}
