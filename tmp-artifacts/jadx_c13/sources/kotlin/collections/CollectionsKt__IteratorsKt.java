package kotlin.collections;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.access7700;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class CollectionsKt__IteratorsKt extends CollectionsKt__IteratorsJVMKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Iterator<T> iterator(Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "");
        return it;
    }

    public static final <T> Iterator<IndexedValue<T>> withIndex(@NotNull Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "");
        return new access7700(it);
    }

    public static final <T> void forEach(@NotNull Iterator<? extends T> it, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(it, "");
        Intrinsics.checkNotNullParameter(function1, "");
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }
}
