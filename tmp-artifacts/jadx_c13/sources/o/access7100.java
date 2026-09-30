package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access7100 implements Set, Serializable, KMappedMarker {
    public static final access7100 onExtraCallback = new access7100();
    private static final long serialVersionUID = 3406603774387020532L;

    public int IAuthTabCallback() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    public boolean onExtraCallbackWithResult(@NotNull Void r2) {
        Intrinsics.checkNotNullParameter(r2, "");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    private access7100() {
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Void) {
            return onExtraCallbackWithResult((Void) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return IAuthTabCallback();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public String toString() {
        return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return collection.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return access7300.onWarmupCompleted;
    }

    private final Object readResolve() {
        return onExtraCallback;
    }
}
