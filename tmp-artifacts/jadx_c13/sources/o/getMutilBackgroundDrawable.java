package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getMutilBackgroundDrawable<K, V> extends setXRound<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    private final SerialDescriptor onNavigationEvent;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public Map<K, V> onNavigationEvent(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public void onNavigationEvent(@NotNull LinkedHashMap<K, V> linkedHashMap, int i) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMutilBackgroundDrawable(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        this.onNavigationEvent = new getImageObjectFit(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // o.setXRound, kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> onExtraCallbackWithResult(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> onExtraCallbackWithResult() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public int onWarmupCompleted(@NotNull LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        return linkedHashMap.size() << 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public LinkedHashMap<K, V> IAuthTabCallback(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }
}
