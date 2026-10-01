package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setHasFaultAddress<E> extends access6800<E> implements Set<E>, KMutableSet {
    private final setCodeNameBytes<E, ?> onExtraCallback;

    public setHasFaultAddress(@NotNull setCodeNameBytes<E, ?> setcodenamebytes) {
        Intrinsics.checkNotNullParameter(setcodenamebytes, "");
        this.onExtraCallback = setcodenamebytes;
    }

    @Override // o.access6800
    public int onExtraCallback() {
        return this.onExtraCallback.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.onExtraCallback.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.onExtraCallback.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.onExtraCallback.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.onExtraCallback.IAuthTabCallback((setCodeNameBytes<E, ?>) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return this.onExtraCallback.access100();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.onExtraCallback.onWarmupCompleted();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.onExtraCallback.onWarmupCompleted();
        return super.retainAll(collection);
    }
}
