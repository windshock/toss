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
public final class TombstoneProtosRegisterBuilder implements Collection<getU64>, KMappedMarker {
    private final short[] onExtraCallback;

    public static short[] IAuthTabCallback(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return sArr;
    }

    public static String IAuthTabCallbackDefault(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    public static boolean onExtraCallbackWithResult(short[] sArr, Object obj) {
        return (obj instanceof TombstoneProtosRegisterBuilder) && Intrinsics.areEqual(sArr, ((TombstoneProtosRegisterBuilder) obj).onWarmupCompleted());
    }

    public static int onNavigationEvent(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    public static final /* synthetic */ TombstoneProtosRegisterBuilder onWarmupCompleted(short[] sArr) {
        return new TombstoneProtosRegisterBuilder(sArr);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(getU64 getu64) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends getU64> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return onExtraCallbackWithResult(this.onExtraCallback, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return onNavigationEvent(this.onExtraCallback);
    }

    public final /* synthetic */ short[] onWarmupCompleted() {
        return this.onExtraCallback;
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
        return IAuthTabCallbackDefault(this.onExtraCallback);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof getU64) {
            return IAuthTabCallback(((getU64) obj).onExtraCallbackWithResult());
        }
        return false;
    }

    private /* synthetic */ TombstoneProtosRegisterBuilder(short[] sArr) {
        this.onExtraCallback = sArr;
    }

    public static short[] onExtraCallback(int i) {
        return IAuthTabCallback(new short[i]);
    }

    public static final short onWarmupCompleted(short[] sArr, int i) {
        return getU64.onNavigationEvent(sArr[i]);
    }

    public static final void onNavigationEvent(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    public static int onExtraCallbackWithResult(short[] sArr) {
        return sArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int size() {
        return onExtraCallbackWithResult(this.onExtraCallback);
    }

    public static Iterator<getU64> onTransact(short[] sArr) {
        return new onNavigationEvent(sArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<getU64> iterator() {
        return onTransact(this.onExtraCallback);
    }

    static final class onNavigationEvent implements Iterator<getU64>, KMappedMarker {
        private final short[] IAuthTabCallback;
        private int onExtraCallback;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public onNavigationEvent(@NotNull short[] sArr) {
            Intrinsics.checkNotNullParameter(sArr, "");
            this.IAuthTabCallback = sArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ getU64 next() {
            return getU64.onExtraCallback(onExtraCallbackWithResult());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallback < this.IAuthTabCallback.length;
        }

        public short onExtraCallbackWithResult() {
            int i = this.onExtraCallback;
            short[] sArr = this.IAuthTabCallback;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.onExtraCallback));
            }
            this.onExtraCallback = i + 1;
            return getU64.onNavigationEvent(sArr[i]);
        }
    }

    public boolean IAuthTabCallback(short s) {
        return IAuthTabCallback(this.onExtraCallback, s);
    }

    public static boolean IAuthTabCallback(short[] sArr, short s) {
        return ArraysKt___ArraysKt.contains(sArr, s);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return onExtraCallback(this.onExtraCallback, collection);
    }

    public static boolean onExtraCallback(short[] sArr, @NotNull Collection<getU64> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Collection<getU64> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof getU64) || !ArraysKt___ArraysKt.contains(sArr, ((getU64) obj).onExtraCallbackWithResult())) {
                return false;
            }
        }
        return true;
    }

    public static boolean onExtraCallback(short[] sArr) {
        return sArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return onExtraCallback(this.onExtraCallback);
    }
}
