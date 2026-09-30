package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.Deprecated;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt {
    @Deprecated
    private static final <T> void sort(List<T> list, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated
    private static final <T> void sort(List<T> list, Function2<? super T, ? super T, Integer> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        throw new NotImplementedError(null, 1, null);
    }

    public static <T extends Comparable<? super T>> void sort(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void sortWith(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    private static final <T> void fill(List<T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "");
        Collections.fill(list, t);
    }

    private static final <T> void shuffle(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Collections.shuffle(list);
    }

    private static final <T> void shuffle(List<T> list, Random random) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(random, "");
        Collections.shuffle(list, random);
    }
}
