package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access7400 implements List, Serializable, RandomAccess, KMappedMarker {
    public static final access7400 onExtraCallback = new access7400();
    private static final long serialVersionUID = -7390468764508069838L;

    @Override // java.util.List
    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    public int onExtraCallbackWithResult(@NotNull Void r2) {
        Intrinsics.checkNotNullParameter(r2, "");
        return -1;
    }

    public int onNavigationEvent() {
        return 0;
    }

    public int onNavigationEvent(@NotNull Void r2) {
        Intrinsics.checkNotNullParameter(r2, "");
        return -1;
    }

    public boolean onWarmupCompleted(@NotNull Void r2) {
        Intrinsics.checkNotNullParameter(r2, "");
        return false;
    }

    @Override // java.util.List
    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    private access7400() {
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            return onWarmupCompleted((Void) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Void) {
            return onNavigationEvent((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return onExtraCallbackWithResult((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return onNavigationEvent();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public String toString() {
        return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return collection.isEmpty();
    }

    @Override // java.util.List
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return access7300.onWarmupCompleted;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return access7300.onWarmupCompleted;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        if (i != 0) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        return access7300.onWarmupCompleted;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    private final Object readResolve() {
        return onExtraCallback;
    }
}
