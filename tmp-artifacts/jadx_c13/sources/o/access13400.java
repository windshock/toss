package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UInt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access13400 implements Collection<UInt>, KMappedMarker {
    private final int[] onExtraCallbackWithResult;

    public static boolean IAuthTabCallback(int[] iArr, Object obj) {
        return (obj instanceof access13400) && Intrinsics.areEqual(iArr, ((access13400) obj).IAuthTabCallback());
    }

    public static String IAuthTabCallbackDefault(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    public static final /* synthetic */ access13400 onExtraCallback(int[] iArr) {
        return new access13400(iArr);
    }

    public static int[] onExtraCallbackWithResult(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return iArr;
    }

    public static int onWarmupCompleted(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    public final /* synthetic */ int[] IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(UInt uInt) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UInt> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return IAuthTabCallback(this.onExtraCallbackWithResult, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return onWarmupCompleted(this.onExtraCallbackWithResult);
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
        return IAuthTabCallbackDefault(this.onExtraCallbackWithResult);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return onNavigationEvent(((UInt) obj).IAuthTabCallback());
        }
        return false;
    }

    private /* synthetic */ access13400(int[] iArr) {
        this.onExtraCallbackWithResult = iArr;
    }

    public static int[] onExtraCallback(int i) {
        return onExtraCallbackWithResult(new int[i]);
    }

    public static final int onExtraCallbackWithResult(int[] iArr, int i) {
        return UInt.m35constructorimpl(iArr[i]);
    }

    public static final void onWarmupCompleted(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static int IAuthTabCallback(int[] iArr) {
        return iArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public int size() {
        return IAuthTabCallback(this.onExtraCallbackWithResult);
    }

    public static Iterator<UInt> asBinder(int[] iArr) {
        return new IAuthTabCallback(iArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<UInt> iterator() {
        return asBinder(this.onExtraCallbackWithResult);
    }

    static final class IAuthTabCallback implements Iterator<UInt>, KMappedMarker {
        private final int[] IAuthTabCallback;
        private int onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public IAuthTabCallback(@NotNull int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "");
            this.IAuthTabCallback = iArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ UInt next() {
            return UInt.onNavigationEvent(onExtraCallbackWithResult());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onWarmupCompleted < this.IAuthTabCallback.length;
        }

        public int onExtraCallbackWithResult() {
            int i = this.onWarmupCompleted;
            int[] iArr = this.IAuthTabCallback;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.onWarmupCompleted));
            }
            this.onWarmupCompleted = i + 1;
            return UInt.m35constructorimpl(iArr[i]);
        }
    }

    public boolean onNavigationEvent(int i) {
        return onNavigationEvent(this.onExtraCallbackWithResult, i);
    }

    public static boolean onNavigationEvent(int[] iArr, int i) {
        return ArraysKt___ArraysKt.contains(iArr, i);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return onExtraCallback(this.onExtraCallbackWithResult, collection);
    }

    public static boolean onExtraCallback(int[] iArr, @NotNull Collection<UInt> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Collection<UInt> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof UInt) || !ArraysKt___ArraysKt.contains(iArr, ((UInt) obj).IAuthTabCallback())) {
                return false;
            }
        }
        return true;
    }

    public static boolean onNavigationEvent(int[] iArr) {
        return iArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return onNavigationEvent(this.onExtraCallbackWithResult);
    }
}
