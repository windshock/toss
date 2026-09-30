package kotlin.collections;

import android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Pair;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__AppendableKt;
import o.access13000;
import o.access7200;
import o.access7800;
import o.access8200;
import o.clearCodeName;
import o.clearFaultAddress;
import o.clearHasSender;
import o.clearNumber;
import o.ensureCausesIsMutable;
import o.getBacktraceNote;
import o.getFaultAddress;
import o.getWrite;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class CollectionsKt___CollectionsKt extends CollectionsKt___CollectionsJvmKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Iterable<T> asIterable(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class IAuthTabCallback<T> implements Sequence<T> {
        final /* synthetic */ Iterable onNavigationEvent;

        public IAuthTabCallback(Iterable iterable) {
            this.onNavigationEvent = iterable;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> IAuthTabCallback() {
            return this.onNavigationEvent.iterator();
        }
    }

    private static final <T> T component1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.get(0);
    }

    private static final <T> T component2(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.get(1);
    }

    private static final <T> T component3(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.get(2);
    }

    private static final <T> T component4(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.get(3);
    }

    private static final <T> T component5(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.get(4);
    }

    public static <T> boolean contains(@NotNull Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return indexOf(iterable, t) >= 0;
    }

    public static <T> T elementAt(@NotNull Iterable<? extends T> iterable, final int i) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i);
        }
        return (T) elementAtOrElse(iterable, i, new Function1() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CollectionsKt___CollectionsKt.elementAt$lambda$0$CollectionsKt___CollectionsKt(i, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object elementAt$lambda$0$CollectionsKt___CollectionsKt(int i, int i2) {
        throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + i + '.');
    }

    private static final <T> T elementAt(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.get(i);
    }

    public static final <T> T elementAtOrElse(@NotNull Iterable<? extends T> iterable, int i, @NotNull Function1<? super Integer, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i >= list.size()) ? function1.invoke(Integer.valueOf(i)) : (T) list.get(i);
        }
        if (i < 0) {
            return function1.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i == i2) {
                return t;
            }
            i2++;
        }
        return function1.invoke(Integer.valueOf(i));
    }

    private static final <T> T elementAtOrElse(List<? extends T> list, int i, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return (i < 0 || i >= list.size()) ? function1.invoke(Integer.valueOf(i)) : list.get(i);
    }

    public static <T> T elementAtOrNull(@NotNull Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            return (T) getOrNull((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i == i2) {
                return t;
            }
            i2++;
        }
        return null;
    }

    private static final <T> T elementAtOrNull(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return (T) getOrNull(list, i);
    }

    public static <T> T first(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            return (T) first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return it.next();
    }

    public static <T> T first(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T first(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static final <T, R> R firstNotNullOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        R rInvoke;
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = function1.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    private static final <T, R> R firstNotNullOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = function1.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    public static <T> T firstOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static <T> T firstOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T firstOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    private static final <T> T getOrElse(List<? extends T> list, int i, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return (i < 0 || i >= list.size()) ? function1.invoke(Integer.valueOf(i)) : list.get(i);
    }

    public static <T> T getOrNull(@NotNull List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static <T> int indexOf(@NotNull Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> int indexOf(@NotNull List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.indexOf(t);
    }

    public static final <T> int indexOfFirst(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(t).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i = -1;
        int i2 = 0;
        for (T t : iterable) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function1.invoke(t).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    public static final <T> int indexOfLast(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (function1.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static <T> T last(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            return (T) last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T last(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(CollectionsKt__CollectionsKt.getLastIndex(list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T last(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (function1.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T last(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (function1.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(@NotNull Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t);
        }
        int i = -1;
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t, t2)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    public static final <T> int lastIndexOf(@NotNull List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.lastIndexOf(t);
    }

    public static <T> T lastOrNull(@NotNull Iterable<? extends T> iterable) {
        T next;
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T lastOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    public static final <T> T lastOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        T t = null;
        for (T t2 : iterable) {
            if (function1.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T lastOrNull(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (function1.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    private static final <T> T random(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return (T) random(collection, Random.onNavigationEvent);
    }

    public static <T> T random(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) elementAt(collection, random.onExtraCallbackWithResult(collection.size()));
    }

    private static final <T> T randomOrNull(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return (T) randomOrNull(collection, Random.onNavigationEvent);
    }

    public static <T> T randomOrNull(@NotNull Collection<? extends T> collection, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) elementAt(collection, random.onExtraCallbackWithResult(collection.size()));
    }

    public static <T> T single(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T single(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final <T> T single(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (function1.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static <T> T singleOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T singleOrNull(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    public static final <T> T singleOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean z = false;
        T t = null;
        for (T t2 : iterable) {
            if (function1.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    public static <T> List<T> drop(@NotNull Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return toList(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (size == 1) {
                return CollectionsKt__CollectionsJVMKt.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> dropLast(@NotNull List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        return take(list, RangesKt___RangesKt.coerceAtLeast(list.size() - i, 0));
    }

    public static final <T> List<T> dropLastWhile(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!function1.invoke(listIterator.previous()).booleanValue()) {
                    return take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public static final <T> List<T> dropWhile(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (T t : iterable) {
            if (z) {
                arrayList.add(t);
            } else if (!function1.invoke(t).booleanValue()) {
                arrayList.add(t);
                z = true;
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filter(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function2.invoke(Integer.valueOf(i), t).booleanValue()) {
                arrayList.add(t);
            }
            i++;
        }
        return arrayList;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> iterable, C c) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        for (Object obj : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final <T> List<T> filterNot(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> List<T> filterNotNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    public static <C extends Collection<? super T>, T> C filterNotNullTo(@NotNull Iterable<? extends T> iterable, @NotNull C c) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (T t : iterable) {
            if (!function1.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> List<T> slice(@NotNull List<? extends T> list, @NotNull IntRange intRange) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(intRange, "");
        return intRange.isEmpty() ? CollectionsKt__CollectionsKt.emptyList() : toList(list.subList(intRange.getStart().intValue(), intRange.getEndInclusive().intValue() + 1));
    }

    public static final <T> List<T> slice(@NotNull List<? extends T> list, @NotNull Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    public static <T> List<T> take(@NotNull Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i == 1) {
                return CollectionsKt__CollectionsJVMKt.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> takeLast(@NotNull List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int size = list.size();
        if (i >= size) {
            return toList(list);
        }
        if (i == 1) {
            return CollectionsKt__CollectionsJVMKt.listOf(last((List) list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(@NotNull List<? extends T> list, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!function1.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt__CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return toList(list);
    }

    public static final <T> List<T> takeWhile(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!function1.invoke(t).booleanValue()) {
                break;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    public static <T> List<T> reversed(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        CollectionsKt___CollectionsJvmKt.reverse(mutableList);
        return mutableList;
    }

    public static final <T> void shuffle(@NotNull List<T> list, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(random, "");
        for (int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list); lastIndex > 0; lastIndex--) {
            int iOnExtraCallbackWithResult = random.onExtraCallbackWithResult(lastIndex + 1);
            list.set(iOnExtraCallbackWithResult, list.set(lastIndex, list.get(iOnExtraCallbackWithResult)));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(@NotNull List<T> list, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new getFaultAddress.onExtraCallbackWithResult(function1));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(@NotNull List<T> list, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new getFaultAddress.onNavigationEvent(function1));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        CollectionsKt__MutableCollectionsJVMKt.sortWith(list, getFaultAddress.onNavigationEvent());
    }

    public static <T extends Comparable<? super T>> List<T> sorted(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return toList(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            ArraysKt___ArraysJvmKt.sort(array);
            return ArraysKt___ArraysJvmKt.asList(array);
        }
        List<T> mutableList = toMutableList(iterable);
        CollectionsKt__MutableCollectionsJVMKt.sort(mutableList);
        return mutableList;
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return sortedWith(iterable, new getFaultAddress.onExtraCallbackWithResult(function1));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return sortedWith(iterable, new getFaultAddress.onNavigationEvent(function1));
    }

    public static <T extends Comparable<? super T>> List<T> sortedDescending(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return sortedWith(iterable, getFaultAddress.onNavigationEvent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> sortedWith(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return toList(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            ArraysKt___ArraysJvmKt.sortWith(array, comparator);
            return ArraysKt___ArraysJvmKt.asList(array);
        }
        List<T> mutableList = toMutableList(iterable);
        CollectionsKt__MutableCollectionsJVMKt.sortWith(mutableList, comparator);
        return mutableList;
    }

    public static boolean[] toBooleanArray(@NotNull Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    public static byte[] toByteArray(@NotNull Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    public static final char[] toCharArray(@NotNull Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr[i] = it.next().charValue();
            i++;
        }
        return cArr;
    }

    public static double[] toDoubleArray(@NotNull Collection<Double> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = it.next().doubleValue();
            i++;
        }
        return dArr;
    }

    public static float[] toFloatArray(@NotNull Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] toIntArray(@NotNull Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public static long[] toLongArray(@NotNull Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    public static final short[] toShortArray(@NotNull Collection<Short> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            sArr[i] = it.next().shortValue();
            i++;
        }
        return sArr;
    }

    public static final <T, K, V> Map<K, V> associate(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(it.next());
            linkedHashMap.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return linkedHashMap;
    }

    public static final <T, K> Map<K, T> associateBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t : iterable) {
            linkedHashMap.put(function1.invoke(t), t);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, V> associateBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function12) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t : iterable) {
            linkedHashMap.put(function1.invoke(t), function12.invoke(t));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (T t : iterable) {
            m.put(function1.invoke(t), t);
        }
        return m;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function12) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        for (T t : iterable) {
            m.put(function1.invoke(t), function12.invoke(t));
        }
        return m;
    }

    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull Function1<? super T, ? extends Pair<? extends K, ? extends V>> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Pair<? extends K, ? extends V> pairInvoke = function1.invoke(it.next());
            m.put(pairInvoke.getFirst(), pairInvoke.getSecond());
        }
        return m;
    }

    public static final <K, V> Map<K, V> associateWith(@NotNull Iterable<? extends K> iterable, @NotNull Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (K k : iterable) {
            linkedHashMap.put(k, function1.invoke(k));
        }
        return linkedHashMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(@NotNull Iterable<? extends K> iterable, @NotNull M m, @NotNull Function1<? super K, ? extends V> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (K k : iterable) {
            m.put(k, function1.invoke(k));
        }
        return m;
    }

    public static <T, C extends Collection<? super T>> C toCollection(@NotNull Iterable<? extends T> iterable, @NotNull C c) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    public static <T> HashSet<T> toHashSet(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return (HashSet) toCollection(iterable, new HashSet(access8200.onNavigationEvent(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 12))));
    }

    public static <T> List<T> toList(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (size != 1) {
                return toMutableList(collection);
            }
            return CollectionsKt__CollectionsJVMKt.listOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        return CollectionsKt__CollectionsKt.optimizeReadOnlyList(toMutableList(iterable));
    }

    public static final <T> List<T> toMutableList(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            return toMutableList((Collection) iterable);
        }
        return (List) toCollection(iterable, new ArrayList());
    }

    public static <T> List<T> toMutableList(@NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return new ArrayList(collection);
    }

    public static <T> Set<T> toSet(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return clearNumber.onNavigationEvent();
            }
            if (size != 1) {
                return (Set) toCollection(iterable, new LinkedHashSet(access8200.onNavigationEvent(collection.size())));
            }
            return clearFaultAddress.onNavigationEvent(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        return clearNumber.IAuthTabCallback((Set) toCollection(iterable, new LinkedHashSet()));
    }

    public static final <T, R> List<R> flatMap(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> flatMapSequence(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, function1.invoke(it.next()));
        }
        return arrayList;
    }

    private static final <T, R> List<R> flatMapIndexedIterable(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, function2.invoke(Integer.valueOf(i), t));
            i++;
        }
        return arrayList;
    }

    private static final <T, R> List<R> flatMapIndexedSequence(Iterable<? extends T> iterable, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, function2.invoke(Integer.valueOf(i), t));
            i++;
        }
        return arrayList;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedIterableTo(Iterable<? extends T> iterable, C c, Function2<? super Integer, ? super T, ? extends Iterable<? extends R>> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(c, function2.invoke(Integer.valueOf(i), t));
            i++;
        }
        return c;
    }

    private static final <T, R, C extends Collection<? super R>> C flatMapIndexedSequenceTo(Iterable<? extends T> iterable, C c, Function2<? super Integer, ? super T, ? extends Sequence<? extends R>> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt__MutableCollectionsKt.addAll(c, function2.invoke(Integer.valueOf(i), t));
            i++;
        }
        return c;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function1<? super T, ? extends Iterable<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(c, function1.invoke(it.next()));
        }
        return c;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(c, function1.invoke(it.next()));
        }
        return c;
    }

    public static final <T, K> Map<K, List<T>> groupBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : iterable) {
            K kInvoke = function1.invoke(t);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return linkedHashMap;
    }

    public static final <T, K, V> Map<K, List<V>> groupBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function12) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : iterable) {
            K kInvoke = function1.invoke(t);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(function12.invoke(t));
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (T t : iterable) {
            K kInvoke = function1.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(@NotNull Iterable<? extends T> iterable, @NotNull M m, @NotNull Function1<? super T, ? extends K> function1, @NotNull Function1<? super T, ? extends V> function12) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        for (T t : iterable) {
            K kInvoke = function1.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(function12.invoke(t));
        }
        return m;
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    public static final class onWarmupCompleted<K, T> implements access7200<T, K> {
        final /* synthetic */ Function1<T, K> onNavigationEvent;
        final /* synthetic */ Iterable<T> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted(Iterable<? extends T> iterable, Function1<? super T, ? extends K> function1) {
            this.onWarmupCompleted = iterable;
            this.onNavigationEvent = function1;
        }

        @Override // o.access7200
        public Iterator<T> sourceIterator() {
            return this.onWarmupCompleted.iterator();
        }

        @Override // o.access7200
        public K keyOf(T t) {
            return this.onNavigationEvent.invoke(t);
        }
    }

    public static final <T, K> access7200<T, K> groupingBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new onWarmupCompleted(iterable, function1);
    }

    public static final <T, R> List<R> map(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(function2.invoke(Integer.valueOf(i), t));
            i++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = function2.invoke(Integer.valueOf(i), t);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i++;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            c.add(function2.invoke(Integer.valueOf(i), t));
            i++;
        }
        return c;
    }

    public static final <T, R> List<R> mapNotNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = function1.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(function1.invoke(it.next()));
        }
        return c;
    }

    public static <T> Iterable<IndexedValue<T>> withIndex(@NotNull final Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return new access7800(new Function0() { // from class: kotlin.collections.CollectionsKt___CollectionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return iterable.iterator();
            }
        });
    }

    public static <T> List<T> distinct(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return toList(toMutableSet(iterable));
    }

    public static final <T, K> List<T> distinctBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (hashSet.add(function1.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> Set<T> intersect(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        Collection collectionConvertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : iterable) {
            if (collectionConvertToListIfNotCollection.contains(t)) {
                linkedHashSet.add(t);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> subtract(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        Collection collectionConvertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : iterable) {
            if (!collectionConvertToListIfNotCollection.contains(t)) {
                linkedHashSet.add(t);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> toMutableSet(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> union(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        Set<T> mutableSet = toMutableSet(iterable);
        CollectionsKt__MutableCollectionsKt.addAll(mutableSet, iterable2);
        return mutableSet;
    }

    public static final <T> boolean all(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!function1.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final <T> boolean any(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static <T> int count(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    private static final <T> int count(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return collection.size();
    }

    public static final <T> int count(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        int i = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public static final <T, R> R fold(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = function2.invoke(r, it.next());
        }
        return r;
    }

    public static final <T, R> R foldIndexed(@NotNull Iterable<? extends T> iterable, R r, @NotNull getBacktraceNote<? super Integer, ? super R, ? super T, ? extends R> getbacktracenote) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            r = getbacktracenote.invoke(Integer.valueOf(i), r, t);
            i++;
        }
        return r;
    }

    public static final <T, R> R foldRight(@NotNull List<? extends T> list, R r, @NotNull Function2<? super T, ? super R, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = function2.invoke(listIterator.previous(), r);
            }
        }
        return r;
    }

    public static final <T, R> R foldRightIndexed(@NotNull List<? extends T> list, R r, @NotNull getBacktraceNote<? super Integer, ? super T, ? super R, ? extends R> getbacktracenote) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = getbacktracenote.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r);
            }
        }
        return r;
    }

    public static final <T> void forEach(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function2.invoke(Integer.valueOf(i), t);
            i++;
        }
    }

    public static final double maxOrThrow(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m124maxOrThrow(@NotNull Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static <T extends Comparable<? super T>> T m125maxOrThrow(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
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
    public static final <T, R extends Comparable<? super R>> T maxByOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
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

    private static final <T> double maxOf(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, function1.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T> float m118maxOf(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, function1.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    /* renamed from: maxOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m119maxOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = function1.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Double m120maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = function1.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, function1.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* renamed from: maxOfOrNull, reason: collision with other method in class */
    private static final <T> Float m121maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = function1.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, function1.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    private static final <T, R extends Comparable<? super R>> R maxOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = function1.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = function1.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> R maxOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) function1.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) function1.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> R maxOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) function1.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) function1.invoke((T) it.next());
            if (comparator.compare(obj, obj2) < 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m122maxOrNull(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static Float m123maxOrNull(@NotNull Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T extends Comparable<? super T>> T maxOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T maxWithOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T maxWithOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final double minOrThrow(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m132minOrThrow(@NotNull Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static <T extends Comparable<? super T>> T m133minOrThrow(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final <T, R extends Comparable<? super R>> T minByOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
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

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [T] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final <T, R extends Comparable<? super R>> T minByOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, ? extends R> function1) {
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

    private static final <T> double minOf(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = function1.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, function1.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T> float m126minOf(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = function1.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, function1.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    /* renamed from: minOf, reason: collision with other method in class */
    private static final <T, R extends Comparable<? super R>> R m127minOf(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = function1.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = function1.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Double m128minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = function1.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, function1.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* renamed from: minOfOrNull, reason: collision with other method in class */
    private static final <T> Float m129minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, Float> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = function1.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, function1.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    private static final <T, R extends Comparable<? super R>> R minOfOrNull(Iterable<? extends T> iterable, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = function1.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = function1.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> R minOfWith(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (R) function1.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) function1.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> R minOfWithOrNull(Iterable<? extends T> iterable, Comparator<? super R> comparator, Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (R) function1.invoke((T) it.next());
        while (it.hasNext()) {
            Object obj2 = (R) function1.invoke((T) it.next());
            if (comparator.compare(obj, obj2) > 0) {
                obj = (R) obj2;
            }
        }
        return (R) obj;
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m130minOrNull(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static Float m131minOrNull(@NotNull Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T extends Comparable<? super T>> T minOrNull(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T minWithOrThrow(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T minWithOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T> boolean none(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static final <T> boolean none(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T, C extends Iterable<? extends T>> C onEach(@NotNull C c, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
        return c;
    }

    public static final <S, T extends S> S reduce(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = function2.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(@NotNull Iterable<? extends T> iterable, @NotNull getBacktraceNote<? super Integer, ? super S, ? super T, ? extends S> getbacktracenote) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = getbacktracenote.invoke(Integer.valueOf(i), next, it.next());
            i++;
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(@NotNull Iterable<? extends T> iterable, @NotNull getBacktraceNote<? super Integer, ? super S, ? super T, ? extends S> getbacktracenote) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            next = getbacktracenote.invoke(Integer.valueOf(i), next, it.next());
            i++;
        }
        return next;
    }

    public static final <S, T extends S> S reduceOrNull(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = function2.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceRight(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super S, ? extends S> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = function2.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexed(@NotNull List<? extends T> list, @NotNull getBacktraceNote<? super Integer, ? super T, ? super S, ? extends S> getbacktracenote) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = getbacktracenote.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexedOrNull(@NotNull List<? extends T> list, @NotNull getBacktraceNote<? super Integer, ? super T, ? super S, ? extends S> getbacktracenote) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = getbacktracenote.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <S, T extends S> S reduceRightOrNull(@NotNull List<? extends T> list, @NotNull Function2<? super T, ? super S, ? extends S> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = function2.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <T, R> List<R> runningFold(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = function2.invoke(r, it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    public static final <T, R> List<R> runningFoldIndexed(@NotNull Iterable<? extends T> iterable, R r, @NotNull getBacktraceNote<? super Integer, ? super R, ? super T, ? extends R> getbacktracenote) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            r = getbacktracenote.invoke(Integer.valueOf(i), r, it.next());
            arrayList.add(r);
            i++;
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduce(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super S, ? super T, ? extends S> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = function2.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduceIndexed(@NotNull Iterable<? extends T> iterable, @NotNull getBacktraceNote<? super Integer, ? super S, ? super T, ? extends S> getbacktracenote) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i = 1;
        while (it.hasNext()) {
            next = getbacktracenote.invoke(Integer.valueOf(i), next, it.next());
            arrayList.add(next);
            i++;
        }
        return arrayList;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final <T> int sumBy(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Integer> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += function1.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @Deprecated
    @DeprecatedSinceKotlin
    public static final <T> double sumByDouble(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Double> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += function1.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    private static final <T> double sumOfDouble(Iterable<? extends T> iterable, Function1<? super T, Double> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += function1.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    private static final <T> int sumOfInt(Iterable<? extends T> iterable, Function1<? super T, Integer> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += function1.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    private static final <T> long sumOfLong(Iterable<? extends T> iterable, Function1<? super T, Long> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += function1.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    private static final <T> int sumOfUInt(Iterable<? extends T> iterable, Function1<? super T, UInt> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        int iM35constructorimpl = 0;
        while (it.hasNext()) {
            iM35constructorimpl = UInt.m35constructorimpl(iM35constructorimpl + function1.invoke(it.next()).IAuthTabCallback());
        }
        return iM35constructorimpl;
    }

    private static final <T> long sumOfULong(Iterable<? extends T> iterable, Function1<? super T, access13000> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        long jOnExtraCallback = 0;
        while (it.hasNext()) {
            jOnExtraCallback = access13000.onExtraCallback(jOnExtraCallback + function1.invoke(it.next()).onExtraCallback());
        }
        return jOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Iterable<T> requireNoNulls(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> requireNoNulls(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    public static <T> List<List<T>> chunked(@NotNull Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return windowed(iterable, i, i, true);
    }

    public static final <T, R> List<R> chunked(@NotNull Iterable<? extends T> iterable, int i, @NotNull Function1<? super List<? extends T>, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return windowed(iterable, i, i, true, function1);
    }

    public static <T> List<T> minus(@NotNull Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(@NotNull Iterable<? extends T> iterable, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length == 0) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!ArraysKt___ArraysKt.contains(tArr, t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> List<T> minus(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        Collection collectionConvertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable2);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!collectionConvertToListIfNotCollection.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> minus(@NotNull Iterable<? extends T> iterable, @NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        List listOnRelationshipValidationResult = ensureCausesIsMutable.onRelationshipValidationResult(sequence);
        if (listOnRelationshipValidationResult.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!listOnRelationshipValidationResult.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static final <T> List<T> minusElement(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return minus(iterable, t);
    }

    public static final <T> Pair<List<T>, List<T>> partition(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    public static final <T> List<T> plus(@NotNull Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object) t);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    public static <T> List<T> plus(@NotNull Collection<? extends T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> plus(@NotNull Iterable<? extends T> iterable, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object[]) tArr);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr);
        return arrayList;
    }

    public static <T> List<T> plus(@NotNull Collection<? extends T> collection, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, tArr);
        return arrayList;
    }

    public static <T> List<T> plus(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Iterable) iterable2);
        }
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable2);
        return arrayList;
    }

    public static <T> List<T> plus(@NotNull Collection<? extends T> collection, @NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> plus(@NotNull Iterable<? extends T> iterable, @NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, iterable);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, sequence);
        return arrayList;
    }

    public static final <T> List<T> plus(@NotNull Collection<? extends T> collection, @NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, sequence);
        return arrayList;
    }

    private static final <T> List<T> plusElement(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return plus(iterable, t);
    }

    private static final <T> List<T> plusElement(Collection<? extends T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "");
        return plus((Collection) collection, (Object) t);
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(iterable, i, i2, z);
    }

    public static <T> List<List<T>> windowed(@NotNull Iterable<? extends T> iterable, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(iterable, "");
        clearHasSender.IAuthTabCallback(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            int i3 = 0;
            while (i3 >= 0 && i3 < size) {
                int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(i, size - i3);
                if (iCoerceAtMost < i && !z) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList(iCoerceAtMost);
                for (int i4 = 0; i4 < iCoerceAtMost; i4++) {
                    arrayList2.add(list.get(i4 + i3));
                }
                arrayList.add(arrayList2);
                i3 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator itOnExtraCallbackWithResult = clearHasSender.onExtraCallbackWithResult(iterable.iterator(), i, i2, z, false);
        while (itOnExtraCallbackWithResult.hasNext()) {
            arrayList3.add((List) itOnExtraCallbackWithResult.next());
        }
        return arrayList3;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i, int i2, boolean z, Function1 function1, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return windowed(iterable, i, i2, z, function1);
    }

    public static <T, R> List<R> windowed(@NotNull Iterable<? extends T> iterable, int i, int i2, boolean z, @NotNull Function1<? super List<? extends T>, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        clearHasSender.IAuthTabCallback(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i3 = 0;
            ArrayList arrayList = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
            clearCodeName clearcodename = new clearCodeName(list);
            while (i3 >= 0 && i3 < size) {
                int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(i, size - i3);
                if (!z && iCoerceAtMost < i) {
                    return arrayList;
                }
                clearcodename.onExtraCallbackWithResult(i3, iCoerceAtMost + i3);
                arrayList.add(function1.invoke(clearcodename));
                i3 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itOnExtraCallbackWithResult = clearHasSender.onExtraCallbackWithResult(iterable.iterator(), i, i2, z, true);
        while (itOnExtraCallbackWithResult.hasNext()) {
            arrayList2.add(function1.invoke((List) itOnExtraCallbackWithResult.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R, V> List<V> zip(@NotNull Iterable<? extends T> iterable, @NotNull R[] rArr, @NotNull Function2<? super T, ? super R, ? extends V> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(rArr, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(function2.invoke(t, rArr[i]));
            i++;
        }
        return arrayList;
    }

    public static final <T, R, V> List<V> zip(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2, @NotNull Function2<? super T, ? super R, ? extends V> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(function2.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> zipWithNext(@NotNull Iterable<? extends T> iterable, @NotNull Function2<? super T, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        R.color next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(function2.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static /* synthetic */ Appendable joinTo$default(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5 = (i2 & 2) != 0 ? ", " : charSequence;
        int i3 = i2 & 4;
        CharSequence charSequence6 = _UrlKt.FRAGMENT_ENCODE_SET;
        CharSequence charSequence7 = i3 != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence6 = charSequence3;
        }
        return joinTo(iterable, appendable, charSequence5, charSequence7, charSequence6, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : function1);
    }

    public static final <T, A extends Appendable> A joinTo(@NotNull Iterable<? extends T> iterable, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(a, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            StringsKt__AppendableKt.appendElement(a, t, function1);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        int i3 = i2 & 2;
        CharSequence charSequence5 = _UrlKt.FRAGMENT_ENCODE_SET;
        CharSequence charSequence6 = i3 != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i4 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return joinToString(iterable, charSequence, charSequence6, charSequence5, i4, charSequence7, function1);
    }

    public static final <T> String joinToString(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        return ((StringBuilder) joinTo(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, function1)).toString();
    }

    public static <T> Sequence<T> asSequence(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return new IAuthTabCallback(iterable);
    }

    public static final double averageOfByte(@NotNull Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dByteValue += it.next().byteValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dByteValue / i;
    }

    public static final double averageOfShort(@NotNull Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dShortValue += it.next().shortValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dShortValue / i;
    }

    public static final double averageOfInt(@NotNull Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dIntValue += it.next().intValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / i;
    }

    public static double averageOfLong(@NotNull Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / i;
    }

    public static double averageOfFloat(@NotNull Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += it.next().floatValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / i;
    }

    public static double averageOfDouble(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwCountOverflow();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / i;
    }

    public static final int sumOfByte(@NotNull Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    public static final int sumOfShort(@NotNull Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    public static int sumOfInt(@NotNull Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static long sumOfLong(@NotNull Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    public static final float sumOfFloat(@NotNull Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    public static final double sumOfDouble(@NotNull Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    private static final <T> T find(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    private static final <T> T findLast(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        T t = null;
        for (T t2 : iterable) {
            if (function1.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    private static final <T> T findLast(List<? extends T> list, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (function1.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function2<? super Integer, ? super T, Boolean> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (function2.invoke(Integer.valueOf(i), t).booleanValue()) {
                c.add(t);
            }
            i++;
        }
        return c;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function2<? super Integer, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            R rInvoke = function2.invoke(Integer.valueOf(i), t);
            if (rInvoke != null) {
                c.add(rInvoke);
            }
            i++;
        }
        return c;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(@NotNull Iterable<? extends T> iterable, @NotNull C c, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = function1.invoke(it.next());
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(@NotNull C c, @NotNull Function2<? super Integer, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(c, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int i = 0;
        for (T t : c) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            function2.invoke(Integer.valueOf(i), t);
            i++;
        }
        return c;
    }

    public static final <T, R> List<R> scan(@NotNull Iterable<? extends T> iterable, R r, @NotNull Function2<? super R, ? super T, ? extends R> function2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function2, "");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = function2.invoke(r, it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    public static final <T, R> List<R> scanIndexed(@NotNull Iterable<? extends T> iterable, R r, @NotNull getBacktraceNote<? super Integer, ? super R, ? super T, ? extends R> getbacktracenote) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        int iCollectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return CollectionsKt__CollectionsJVMKt.listOf(r);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            r = getbacktracenote.invoke(Integer.valueOf(i), r, it.next());
            arrayList.add(r);
            i++;
        }
        return arrayList;
    }

    public static final <T, R> List<Pair<T, R>> zip(@NotNull Iterable<? extends T> iterable, @NotNull R[] rArr) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(rArr, "");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(getWrite.IAuthTabCallback(t, rArr[i]));
            i++;
        }
        return arrayList;
    }

    public static <T, R> List<Pair<T, R>> zip(@NotNull Iterable<? extends T> iterable, @NotNull Iterable<? extends R> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(iterable2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(getWrite.IAuthTabCallback(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> List<Pair<T, T>> zipWithNext(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(getWrite.IAuthTabCallback(next, next2));
            next = next2;
        }
        return arrayList;
    }
}
