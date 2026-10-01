package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access8000 extends access8200 {
    public static <K, V> Map<K, V> IAuthTabCallback() {
        access7000 access7000Var = access7000.IAuthTabCallback;
        Intrinsics.checkNotNull(access7000Var, "");
        return access7000Var;
    }

    public static <K, V> Map<K, V> IAuthTabCallbackStub(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        return pairArr.length > 0 ? IAuthTabCallback(pairArr, new LinkedHashMap(access8200.onNavigationEvent(pairArr.length))) : IAuthTabCallback();
    }

    public static <K, V> Map<K, V> IAuthTabCallbackStubProxy(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(access8200.onNavigationEvent(pairArr.length));
        IAuthTabCallback((Map) linkedHashMap, (Pair[]) pairArr);
        return linkedHashMap;
    }

    public static <K, V> HashMap<K, V> IAuthTabCallbackDefault(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        HashMap<K, V> map = new HashMap<>(access8200.onNavigationEvent(pairArr.length));
        IAuthTabCallback((Map) map, (Pair[]) pairArr);
        return map;
    }

    public static <K, V> LinkedHashMap<K, V> onTransact(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        return (LinkedHashMap) IAuthTabCallback(pairArr, new LinkedHashMap(access8200.onNavigationEvent(pairArr.length)));
    }

    public static <K, V> V onExtraCallback(@NotNull Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "");
        return (V) access8300.IAuthTabCallback(map, k);
    }

    public static <K, V> void IAuthTabCallback(@NotNull Map<? super K, ? super V> map, @NotNull Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.onExtraCallbackWithResult(), pair.IAuthTabCallback());
        }
    }

    public static <K, V> void asBinder(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        for (Pair<? extends K, ? extends V> pair : iterable) {
            map.put(pair.onExtraCallbackWithResult(), pair.IAuthTabCallback());
        }
    }

    public static <K, V> void onNavigationEvent(@NotNull Map<? super K, ? super V> map, @NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        Iterator<? extends Pair<? extends K, ? extends V>> itIAuthTabCallback = sequence.IAuthTabCallback();
        while (itIAuthTabCallback.hasNext()) {
            Pair<? extends K, ? extends V> next = itIAuthTabCallback.next();
            map.put(next.onExtraCallbackWithResult(), next.IAuthTabCallback());
        }
    }

    public static <K, V> Map<K, V> onWarmupCompleted(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return IAuthTabCallback();
            }
            if (size != 1) {
                return onExtraCallbackWithResult(iterable, new LinkedHashMap(access8200.onNavigationEvent(collection.size())));
            }
            return access8200.IAuthTabCallback((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        return asInterface(onExtraCallbackWithResult(iterable, new LinkedHashMap()));
    }

    public static <K, V, M extends Map<? super K, ? super V>> M onExtraCallbackWithResult(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable, @NotNull M m) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(m, "");
        asBinder(m, iterable);
        return m;
    }

    public static <K, V> Map<K, V> access000(@NotNull Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        int length = pairArr.length;
        if (length == 0) {
            return IAuthTabCallback();
        }
        if (length == 1) {
            return access8200.IAuthTabCallback(pairArr[0]);
        }
        return IAuthTabCallback(pairArr, new LinkedHashMap(access8200.onNavigationEvent(pairArr.length)));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M IAuthTabCallback(@NotNull Pair<? extends K, ? extends V>[] pairArr, @NotNull M m) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        Intrinsics.checkNotNullParameter(m, "");
        IAuthTabCallback((Map) m, (Pair[]) pairArr);
        return m;
    }

    public static <K, V> Map<K, V> onExtraCallbackWithResult(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return asInterface(onNavigationEvent(sequence, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M onNavigationEvent(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> sequence, @NotNull M m) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(m, "");
        onNavigationEvent((Map) m, (Sequence) sequence);
        return m;
    }

    public static <K, V> Map<K, V> getInterfaceDescriptor(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        int size = map.size();
        if (size == 0) {
            return IAuthTabCallback();
        }
        if (size == 1) {
            return access8200.IAuthTabCallbackStub(map);
        }
        return access100(map);
    }

    public static <K, V> Map<K, V> access100(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new LinkedHashMap(map);
    }

    public static <K, V> Map<K, V> onNavigationEvent(@NotNull Map<? extends K, ? extends V> map, @NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(pair, "");
        if (map.isEmpty()) {
            return access8200.IAuthTabCallback(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> onWarmupCompleted(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        if (map.isEmpty()) {
            return onWarmupCompleted(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        asBinder(linkedHashMap, iterable);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> onExtraCallbackWithResult(@NotNull Map<? extends K, ? extends V> map, @NotNull Map<? extends K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> onNavigationEvent(@NotNull Map<? extends K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "");
        Map mapAccess100 = access100(map);
        mapAccess100.remove(k);
        return asInterface(mapAccess100);
    }

    public static <K, V> Map<K, V> onNavigationEvent(@NotNull Map<? extends K, ? extends V> map, @NotNull Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        Map mapAccess100 = access100(map);
        CollectionsKt__MutableCollectionsKt.removeAll(mapAccess100.keySet(), iterable);
        return asInterface(mapAccess100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> asInterface(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : access8200.IAuthTabCallbackStub(map);
        }
        return IAuthTabCallback();
    }
}
