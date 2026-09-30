package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setFaultAdjacentMetadata<V> extends TombstoneProtosSignal<V> implements Collection<V>, KMutableCollection {
    private final setCodeNameBytes<?, V> onNavigationEvent;

    public setFaultAdjacentMetadata(@NotNull setCodeNameBytes<?, V> setcodenamebytes) {
        Intrinsics.checkNotNullParameter(setcodenamebytes, "");
        this.onNavigationEvent = setcodenamebytes;
    }

    @Override // o.TombstoneProtosSignal
    public int IAuthTabCallback() {
        return this.onNavigationEvent.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.onNavigationEvent.isEmpty();
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
    public boolean addAll(@NotNull Collection<? extends V> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.onNavigationEvent.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return this.onNavigationEvent.IAuthTabCallbackStubProxy();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.onNavigationEvent.onWarmupCompleted((setCodeNameBytes<?, V>) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.onNavigationEvent.onWarmupCompleted();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.onNavigationEvent.onWarmupCompleted();
        return super.retainAll(collection);
    }
}
