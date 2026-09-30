package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access13200 implements Collection<UByte>, KMappedMarker {
    private final byte[] IAuthTabCallback;

    public static int IAuthTabCallback(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    public static final /* synthetic */ access13200 onExtraCallback(byte[] bArr) {
        return new access13200(bArr);
    }

    public static boolean onExtraCallbackWithResult(byte[] bArr, Object obj) {
        return (obj instanceof access13200) && Intrinsics.areEqual(bArr, ((access13200) obj).onWarmupCompleted());
    }

    public static byte[] onExtraCallbackWithResult(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr;
    }

    public static String onTransact(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean add(UByte uByte) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends UByte> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return onExtraCallbackWithResult(this.IAuthTabCallback, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return IAuthTabCallback(this.IAuthTabCallback);
    }

    public final /* synthetic */ byte[] onWarmupCompleted() {
        return this.IAuthTabCallback;
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
        return onTransact(this.IAuthTabCallback);
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return onNavigationEvent(((UByte) obj).onWarmupCompleted());
        }
        return false;
    }

    private /* synthetic */ access13200(byte[] bArr) {
        this.IAuthTabCallback = bArr;
    }

    public static byte[] onExtraCallback(int i) {
        return onExtraCallbackWithResult(new byte[i]);
    }

    public static final byte onExtraCallback(byte[] bArr, int i) {
        return UByte.m34constructorimpl(bArr[i]);
    }

    public static final void onExtraCallback(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    public static int onWarmupCompleted(byte[] bArr) {
        return bArr.length;
    }

    @Override // java.util.Collection
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public int size() {
        return onWarmupCompleted(this.IAuthTabCallback);
    }

    public static Iterator<UByte> IAuthTabCallbackStub(byte[] bArr) {
        return new onNavigationEvent(bArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<UByte> iterator() {
        return IAuthTabCallbackStub(this.IAuthTabCallback);
    }

    static final class onNavigationEvent implements Iterator<UByte>, KMappedMarker {
        private int onNavigationEvent;
        private final byte[] onWarmupCompleted;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public onNavigationEvent(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            this.onWarmupCompleted = bArr;
        }

        @Override // java.util.Iterator
        public /* synthetic */ UByte next() {
            return UByte.m33boximpl(onWarmupCompleted());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onNavigationEvent < this.onWarmupCompleted.length;
        }

        public byte onWarmupCompleted() {
            int i = this.onNavigationEvent;
            byte[] bArr = this.onWarmupCompleted;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.onNavigationEvent));
            }
            this.onNavigationEvent = i + 1;
            return UByte.m34constructorimpl(bArr[i]);
        }
    }

    public boolean onNavigationEvent(byte b) {
        return IAuthTabCallback(this.IAuthTabCallback, b);
    }

    public static boolean IAuthTabCallback(byte[] bArr, byte b) {
        return ArraysKt___ArraysKt.contains(bArr, b);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return onExtraCallbackWithResult(this.IAuthTabCallback, (Collection<UByte>) collection);
    }

    public static boolean onExtraCallbackWithResult(byte[] bArr, @NotNull Collection<UByte> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        Collection<UByte> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!(obj instanceof UByte) || !ArraysKt___ArraysKt.contains(bArr, ((UByte) obj).onWarmupCompleted())) {
                return false;
            }
        }
        return true;
    }

    public static boolean onNavigationEvent(byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return onNavigationEvent(this.IAuthTabCallback);
    }
}
