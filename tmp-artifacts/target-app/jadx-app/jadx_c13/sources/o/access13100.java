package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access13100 implements Collection<access13000>, KMappedMarker {
    private final long[] onWarmupCompleted;

    public static boolean onExtraCallback(long[] jArr, Object obj) {
        return (obj instanceof access13100) && Intrinsics.areEqual(jArr, ((access13100) obj).onWarmupCompleted());
    }

    public static long[] onExtraCallback(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return jArr;
    }

    public static final /* synthetic */ access13100 onExtraCallbackWithResult(long[] jArr) {
        return new access13100(jArr);
    }

    public static int onNavigationEvent(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    public static String onTransact(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(access13000 access13000Var) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends access13000> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return onExtraCallback(this.onWarmupCompleted, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return onNavigationEvent(this.onWarmupCompleted);
    }

    public final /* synthetic */ long[] onWarmupCompleted() {
        return this.onWarmupCompleted;
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
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    public String toString() {
        return onTransact(this.onWarmupCompleted);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof access13000) {
            return onExtraCallback(((access13000) obj).onExtraCallback());
        }
        return false;
    }

    private /* synthetic */ access13100(long[] jArr) {
        this.onWarmupCompleted = jArr;
    }

    public static long[] IAuthTabCallback(int i) {
        return onExtraCallback(new long[i]);
    }

    public static final long onWarmupCompleted(long[] jArr, int i) {
        return access13000.onExtraCallback(jArr[i]);
    }

    public static final void onExtraCallbackWithResult(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static int onWarmupCompleted(long[] jArr) {
        return jArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public int size() {
        return onWarmupCompleted(this.onWarmupCompleted);
    }

    public static Iterator<access13000> asInterface(long[] jArr) {
        return new onExtraCallback(jArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<access13000> iterator() {
        return asInterface(this.onWarmupCompleted);
    }

    static final class onExtraCallback implements Iterator<access13000>, KMappedMarker {
        private final long[] onExtraCallback;
        private int onNavigationEvent;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public onExtraCallback(@NotNull long[] jArr) {
            Intrinsics.checkNotNullParameter(jArr, "");
            this.onExtraCallback = jArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ access13000 next() {
            return access13000.onNavigationEvent(onExtraCallback());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onNavigationEvent < this.onExtraCallback.length;
        }

        public long onExtraCallback() {
            int i = this.onNavigationEvent;
            long[] jArr = this.onExtraCallback;
            if (i >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.onNavigationEvent));
            }
            this.onNavigationEvent = i + 1;
            return access13000.onExtraCallback(jArr[i]);
        }
    }

    public boolean onExtraCallback(long j) {
        return onWarmupCompleted(this.onWarmupCompleted, j);
    }

    public static boolean onWarmupCompleted(long[] jArr, long j) {
        return ArraysKt___ArraysKt.contains(jArr, j);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return onWarmupCompleted(this.onWarmupCompleted, (Collection<access13000>) collection);
    }

    public static boolean onWarmupCompleted(long[] jArr, @NotNull Collection<access13000> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Collection<access13000> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof access13000) || !ArraysKt___ArraysKt.contains(jArr, ((access13000) obj).onExtraCallback())) {
                return false;
            }
        }
        return true;
    }

    public static boolean IAuthTabCallback(long[] jArr) {
        return jArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return IAuthTabCallback(this.onWarmupCompleted);
    }
}
