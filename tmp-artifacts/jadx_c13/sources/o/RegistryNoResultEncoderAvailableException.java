package o;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RegistryNoResultEncoderAvailableException<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    private final GeneratedAppGlideModule<K, V, Map.Entry<K, V>> onNavigationEvent;

    public RegistryNoResultEncoderAvailableException(@NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        rewind[] rewindVarArr = new rewind[8];
        for (int i = 0; i < 8; i++) {
            rewindVarArr[i] = new ResourceCacheGenerator(this);
        }
        this.onNavigationEvent = new GeneratedAppGlideModule<>(registryNoImageHeaderParserException, rewindVarArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.onNavigationEvent.hasNext();
    }

    @Override // java.util.Iterator
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.onNavigationEvent.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.onNavigationEvent.remove();
    }

    public final void onExtraCallbackWithResult(K k, V v) {
        this.onNavigationEvent.onWarmupCompleted(k, v);
    }
}
