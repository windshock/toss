package o;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access6600<T> implements Collection<T>, KMappedMarker {
    private final T[] IAuthTabCallback;
    private final boolean onExtraCallbackWithResult;

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    public access6600(@NotNull T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "");
        this.IAuthTabCallback = tArr;
        this.onExtraCallbackWithResult = z;
    }

    @Override // java.util.Collection
    public final int size() {
        return onExtraCallbackWithResult();
    }

    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallback.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.IAuthTabCallback.length == 0;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return ArraysKt___ArraysKt.contains(this.IAuthTabCallback, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Collection<?> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return ArrayIteratorKt.iterator(this.IAuthTabCallback);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionsKt__CollectionsJVMKt.copyToArrayOfAny(this.IAuthTabCallback, this.onExtraCallbackWithResult);
    }
}
