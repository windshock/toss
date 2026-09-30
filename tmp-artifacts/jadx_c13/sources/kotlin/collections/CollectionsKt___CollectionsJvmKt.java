package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
    public static <R> List<R> filterIsInstance(@NotNull Iterable<?> iterable, @NotNull Class<R> cls) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (List) filterIsInstanceTo(iterable, new ArrayList(), cls);
    }

    public static final <C extends Collection<? super R>, R> C filterIsInstanceTo(@NotNull Iterable<?> iterable, @NotNull C c, @NotNull Class<R> cls) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(cls, "");
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    public static <T> void reverse(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Collections.reverse(list);
    }

    public static final <T extends Comparable<? super T>> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return (SortedSet) CollectionsKt___CollectionsKt.toCollection(iterable, new TreeSet());
    }

    public static final <T> SortedSet<T> toSortedSet(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return (SortedSet) CollectionsKt___CollectionsKt.toCollection(iterable, new TreeSet(comparator));
    }

    @Deprecated
    @DeprecatedSinceKotlin
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Double m114max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return CollectionsKt___CollectionsKt.m122maxOrNull((Iterable<Double>) iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    /* renamed from: max, reason: collision with other method in class */
    public static final /* synthetic */ Float m115max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return CollectionsKt___CollectionsKt.m123maxOrNull((Iterable<Float>) iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Comparable max(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return CollectionsKt___CollectionsKt.maxOrNull(iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Object maxWith(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return CollectionsKt___CollectionsKt.maxWithOrNull(iterable, comparator);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Double m116min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return CollectionsKt___CollectionsKt.m130minOrNull((Iterable<Double>) iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    /* renamed from: min, reason: collision with other method in class */
    public static final /* synthetic */ Float m117min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return CollectionsKt___CollectionsKt.m131minOrNull((Iterable<Float>) iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Comparable min(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return CollectionsKt___CollectionsKt.minOrNull(iterable);
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ Object minWith(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return CollectionsKt___CollectionsKt.minWithOrNull(iterable, comparator);
    }

    private static final <T> BigDecimal sumOfBigDecimal(Iterable<? extends T> iterable, Function1<? super T, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(it.next()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final <T> BigInteger sumOfBigInteger(Iterable<? extends T> iterable, Function1<? super T, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(it.next()));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T maxBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = function1.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = function1.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Deprecated
    @DeprecatedSinceKotlin
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T minBy(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = function1.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = function1.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }
}
