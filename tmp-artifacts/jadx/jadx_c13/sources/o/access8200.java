package o;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class access8200 extends access8300 {
    public static int onNavigationEvent(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : IntCompanionObject.MAX_VALUE;
    }

    public static <K, V> Map<K, V> IAuthTabCallback(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "");
        return mapSingletonMap;
    }

    public static <K, V> Map<K, V> onExtraCallbackWithResult() {
        return new setCodeNameBytes();
    }

    public static <K, V> Map<K, V> onExtraCallbackWithResult(int i) {
        return new setCodeNameBytes(i);
    }

    public static <K, V> Map<K, V> asBinder(@NotNull Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return ((setCodeNameBytes) map).onExtraCallback();
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> IAuthTabCallbackDefault(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new TreeMap(map);
    }

    public static <K, V> SortedMap<K, V> onExtraCallbackWithResult(@NotNull Map<? extends K, ? extends V> map, @NotNull Comparator<? super K> comparator) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static <K extends Comparable<? super K>, V> SortedMap<K, V> asBinder(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "");
        TreeMap treeMap = new TreeMap();
        access8000.IAuthTabCallback((Map) treeMap, (Pair[]) pairArr);
        return treeMap;
    }

    public static final <K, V> Map<K, V> IAuthTabCallbackStub(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "");
        return mapSingletonMap;
    }
}
