package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestCoordinatorRequestState {
    public static final RequestCoordinatorRequestState onExtraCallback = new RequestCoordinatorRequestState();

    private RequestCoordinatorRequestState() {
    }

    public final <K, V> boolean IAuthTabCallback(@NotNull Map<K, ? extends V> map, @NotNull Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(entry, "");
        V v = map.get(entry.getKey());
        return v != null ? Intrinsics.areEqual(v, entry.getValue()) : entry.getValue() == null && map.containsKey(entry.getKey());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> boolean onExtraCallback(@NotNull Map<K, ? extends V> map, @NotNull Map<?, ?> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        if (map.size() != map2.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (map2.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<?, ?>> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            if (!onExtraCallback.IAuthTabCallback(map, it.next())) {
                return false;
            }
        }
        return true;
    }

    public final <K, V> int onNavigationEvent(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.entrySet().hashCode();
    }
}
