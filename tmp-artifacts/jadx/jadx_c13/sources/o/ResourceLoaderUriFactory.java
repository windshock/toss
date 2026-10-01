package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ResourceLoaderUriFactory<K, V> extends TombstoneProtosSignal<V> implements Collection<V>, KMutableCollection {
    private final ResourceLoader<K, V> IAuthTabCallback;

    public ResourceLoaderUriFactory(@NotNull ResourceLoader<K, V> resourceLoader) {
        Intrinsics.checkNotNullParameter(resourceLoader, "");
        this.IAuthTabCallback = resourceLoader;
    }

    @Override // o.TombstoneProtosSignal
    public int IAuthTabCallback() {
        return this.IAuthTabCallback.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.IAuthTabCallback.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.IAuthTabCallback.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new RecyclableBufferedInputStream(this.IAuthTabCallback);
    }
}
