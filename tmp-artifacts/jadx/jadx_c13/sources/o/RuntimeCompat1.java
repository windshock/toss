package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class RuntimeCompat1<K, V> extends TombstoneProtosTombstoneThreadsDefaultEntryHolder<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final Map<K, ResourceRecycler<V>> onExtraCallbackWithResult;
    private ResourceRecycler<V> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeCompat1(@NotNull Map<K, ResourceRecycler<V>> map, K k, @NotNull ResourceRecycler<V> resourceRecycler) {
        super(k, resourceRecycler.onNavigationEvent());
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(resourceRecycler, "");
        this.onExtraCallbackWithResult = map;
        this.onWarmupCompleted = resourceRecycler;
    }

    @Override // o.TombstoneProtosTombstoneThreadsDefaultEntryHolder, java.util.Map.Entry
    public V getValue() {
        return this.onWarmupCompleted.onNavigationEvent();
    }

    @Override // o.TombstoneProtosTombstoneThreadsDefaultEntryHolder, java.util.Map.Entry
    public V setValue(V v) {
        V vOnNavigationEvent = this.onWarmupCompleted.onNavigationEvent();
        this.onWarmupCompleted = this.onWarmupCompleted.IAuthTabCallback(v);
        this.onExtraCallbackWithResult.put(getKey(), this.onWarmupCompleted);
        return vOnNavigationEvent;
    }
}
