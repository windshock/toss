package o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getWidgetLayoutParams<K, V> extends setXRound<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    private final SerialDescriptor onNavigationEvent;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Map<K, V> onNavigationEvent(@NotNull HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public void onNavigationEvent(@NotNull HashMap<K, V> map, int i) {
        Intrinsics.checkNotNullParameter(map, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getWidgetLayoutParams(@NotNull KSerializer<K> kSerializer, @NotNull KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(kSerializer2, "");
        this.onNavigationEvent = new eazb(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // o.setXRound, kotlinx.serialization.KSerializer, o.py, o.jp
    public SerialDescriptor getDescriptor() {
        return this.onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int onExtraCallback(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    public Iterator<Map.Entry<K, V>> onExtraCallbackWithResult(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> onExtraCallbackWithResult() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int onWarmupCompleted(@NotNull HashMap<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return map.size() << 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.wk
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public HashMap<K, V> IAuthTabCallback(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap<K, V> map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap<>(map) : map2;
    }
}
