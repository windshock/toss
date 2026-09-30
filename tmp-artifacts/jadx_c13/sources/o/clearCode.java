package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class clearCode extends clearHasFaultAddress {
    public static <K, V> List<Pair<K, V>> IAuthTabCallbackStubProxy(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.size() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsJVMKt.listOf(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static <K, V> Sequence<Map.Entry<K, V>> access000(@NotNull Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return CollectionsKt___CollectionsKt.asSequence(map.entrySet());
    }
}
