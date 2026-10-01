package o;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getMultiplier<K, V> extends TombstoneProtosTombstoneThreadsDefaultEntryHolder<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
    private final RegistryNoResultEncoderAvailableException<K, V> onExtraCallback;
    private V onWarmupCompleted;

    @Override // o.TombstoneProtosTombstoneThreadsDefaultEntryHolder, java.util.Map.Entry
    public V getValue() {
        return this.onWarmupCompleted;
    }

    public void onWarmupCompleted(V v) {
        this.onWarmupCompleted = v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMultiplier(@NotNull RegistryNoResultEncoderAvailableException<K, V> registryNoResultEncoderAvailableException, K k, V v) {
        super(k, v);
        Intrinsics.checkNotNullParameter(registryNoResultEncoderAvailableException, "");
        this.onExtraCallback = registryNoResultEncoderAvailableException;
        this.onWarmupCompleted = v;
    }

    @Override // o.TombstoneProtosTombstoneThreadsDefaultEntryHolder, java.util.Map.Entry
    public V setValue(V v) {
        V value = getValue();
        onWarmupCompleted(v);
        this.onExtraCallback.onExtraCallbackWithResult(getKey(), v);
        return value;
    }
}
