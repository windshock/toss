package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class clearSenderUid extends clearNumber {
    public static <T> Set<T> onNavigationEvent(@NotNull Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet(access8200.onNavigationEvent(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> onNavigationEvent(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        Collection<?> collectionConvertToListIfNotCollection = CollectionsKt__MutableCollectionsKt.convertToListIfNotCollection(iterable);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return CollectionsKt___CollectionsKt.toSet(set);
        }
        if (!(collectionConvertToListIfNotCollection instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionConvertToListIfNotCollection);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t : set) {
            if (!((Set) collectionConvertToListIfNotCollection).contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }

    public static <T> Set<T> onWarmupCompleted(@NotNull Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet(access8200.onNavigationEvent(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static <T> Set<T> onExtraCallback(@NotNull Set<? extends T> set, @NotNull Iterable<? extends T> iterable) {
        int size;
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        Integer numCollectionSizeOrNull = CollectionsKt__IterablesKt.collectionSizeOrNull(iterable);
        if (numCollectionSizeOrNull != null) {
            size = set.size() + numCollectionSizeOrNull.intValue();
        } else {
            size = set.size() << 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(access8200.onNavigationEvent(size));
        linkedHashSet.addAll(set);
        CollectionsKt__MutableCollectionsKt.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }
}
