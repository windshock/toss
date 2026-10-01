package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class RequestManager<K, V> extends TombstoneProtosSignal<V> implements Collection<V>, KMutableCollection {
    private final RegistryNoImageHeaderParserException<K, V> onNavigationEvent;

    public RequestManager(@NotNull RegistryNoImageHeaderParserException<K, V> registryNoImageHeaderParserException) {
        Intrinsics.checkNotNullParameter(registryNoImageHeaderParserException, "");
        this.onNavigationEvent = registryNoImageHeaderParserException;
    }

    @Override // o.TombstoneProtosSignal
    public int IAuthTabCallback() {
        return this.onNavigationEvent.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.onNavigationEvent.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.onNavigationEvent.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new hasAlpha(this.onNavigationEvent);
    }
}
