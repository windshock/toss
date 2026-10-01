package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class TombstoneProtosTombstoneThreadsDefaultEntryHolder<K, V> implements Map.Entry<K, V>, KMappedMarker {
    private final K IAuthTabCallback;
    private final V onExtraCallback;

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public TombstoneProtosTombstoneThreadsDefaultEntryHolder(K k, V v) {
        this.IAuthTabCallback = k;
        this.onExtraCallback = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.IAuthTabCallback;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.onExtraCallback;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
