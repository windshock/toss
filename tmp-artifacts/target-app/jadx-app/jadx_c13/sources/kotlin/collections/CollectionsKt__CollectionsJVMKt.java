package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import o.mergeFaultAdjacentMetadata;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CollectionsKt__CollectionsJVMKt {
    public static <T> List<T> listOf(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "");
        return listSingletonList;
    }

    private static final <T> ArrayList<T> asArrayList(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return new ArrayList<>(CollectionsKt__CollectionsKt.asCollection(tArr, true));
    }

    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        List listCreateListBuilder = createListBuilder();
        function1.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    private static final <E> List<E> buildListInternal(int i, Function1<? super List<E>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        List listCreateListBuilder = createListBuilder(i);
        function1.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    public static <E> List<E> createListBuilder() {
        return new mergeFaultAdjacentMetadata(0, 1, null);
    }

    public static <E> List<E> createListBuilder(int i) {
        return new mergeFaultAdjacentMetadata(i);
    }

    public static <E> List<E> build(@NotNull List<E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return ((mergeFaultAdjacentMetadata) list).onWarmupCompleted();
    }

    private static final <T> List<T> toList(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "");
        ArrayList list = Collections.list(enumeration);
        Intrinsics.checkNotNullExpressionValue(list, "");
        return list;
    }

    public static <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    public static final <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(random, "");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }

    private static final Object[] collectionToArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return CollectionToArray.toArray(collection);
    }

    private static final <T> T[] collectionToArray(Collection<?> collection, T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) CollectionToArray.toArray(collection, tArr);
    }

    public static <T> T[] terminateCollectionToArray(int i, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }

    public static final <T> Object[] copyToArrayOfAny(@NotNull T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (z && Intrinsics.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        return objArrCopyOf;
    }

    private static final int checkIndexOverflow(int i) {
        if (i < 0) {
            CollectionsKt__CollectionsKt.throwIndexOverflow();
        }
        return i;
    }

    private static final int checkCountOverflow(int i) {
        if (i < 0) {
            CollectionsKt__CollectionsKt.throwCountOverflow();
        }
        return i;
    }
}
