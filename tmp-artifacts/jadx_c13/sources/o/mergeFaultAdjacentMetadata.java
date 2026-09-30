package o;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class mergeFaultAdjacentMetadata<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
    private static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static final mergeFaultAdjacentMetadata onNavigationEvent;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    public mergeFaultAdjacentMetadata() {
        this(0, 1, null);
    }

    public mergeFaultAdjacentMetadata(int i) {
        this.backing = (E[]) setFaultAddress.onExtraCallback(i);
    }

    public /* synthetic */ mergeFaultAdjacentMetadata(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static {
        mergeFaultAdjacentMetadata mergefaultadjacentmetadata = new mergeFaultAdjacentMetadata(0);
        mergefaultadjacentmetadata.isReadOnly = true;
        onNavigationEvent = mergefaultadjacentmetadata;
    }

    public final List<E> onWarmupCompleted() {
        onNavigationEvent();
        this.isReadOnly = true;
        return this.length > 0 ? this : onNavigationEvent;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new setHasSender(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.onExtraCallbackWithResult(i, this.length);
        return this.backing[i];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        onNavigationEvent();
        AbstractList.Companion.onExtraCallbackWithResult(i, this.length);
        E[] eArr = this.backing;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.areEqual(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.areEqual(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i) {
        AbstractList.Companion.onNavigationEvent(i, this.length);
        return new onExtraCallbackWithResult(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        onNavigationEvent();
        onNavigationEvent(this.length, e);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        onNavigationEvent();
        AbstractList.Companion.onNavigationEvent(i, this.length);
        onNavigationEvent(i, e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        onNavigationEvent();
        int size = collection.size();
        onWarmupCompleted(this.length, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        onNavigationEvent();
        AbstractList.Companion.onNavigationEvent(i, this.length);
        int size = collection.size();
        onWarmupCompleted(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        onNavigationEvent();
        onWarmupCompleted(0, this.length);
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        onNavigationEvent();
        AbstractList.Companion.onExtraCallbackWithResult(i, this.length);
        return onExtraCallbackWithResult(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        onNavigationEvent();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        onNavigationEvent();
        return onWarmupCompleted(0, this.length, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        onNavigationEvent();
        return onWarmupCompleted(0, this.length, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i, int i2) {
        AbstractList.Companion.onNavigationEvent(i, i2, this.length);
        return new IAuthTabCallback(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        int i = this.length;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(this.backing, 0, i, tArr.getClass());
            Intrinsics.checkNotNullExpressionValue(tArr2, "");
            return tArr2;
        }
        ArraysKt___ArraysJvmKt.copyInto(this.backing, tArr, 0, 0, i);
        return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(this.length, tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return ArraysKt___ArraysJvmKt.copyOfRange(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof List) && onNavigationEvent((List<?>) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return setFaultAddress.onExtraCallbackWithResult(this.backing, 0, this.length);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return setFaultAddress.onExtraCallbackWithResult((Object[]) this.backing, 0, this.length, (Collection) this);
    }

    private final void onExtraCallbackWithResult() {
        ((java.util.AbstractList) this).modCount++;
    }

    private final void onNavigationEvent() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final void IAuthTabCallback(int i) {
        onExtraCallback(this.length + i);
    }

    private final void onExtraCallback(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i > eArr.length) {
            this.backing = (E[]) setFaultAddress.onWarmupCompleted(this.backing, AbstractList.Companion.onWarmupCompleted(eArr.length, i));
        }
    }

    private final boolean onNavigationEvent(List<?> list) {
        return setFaultAddress.onExtraCallbackWithResult((Object[]) this.backing, 0, this.length, (List<?>) list);
    }

    private final void onExtraCallback(int i, int i2) {
        IAuthTabCallback(i2);
        E[] eArr = this.backing;
        ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i + i2, i, this.length);
        this.length += i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent(int i, E e) {
        onExtraCallbackWithResult();
        onExtraCallback(i, 1);
        this.backing[i] = e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(int i, Collection<? extends E> collection, int i2) {
        onExtraCallbackWithResult();
        onExtraCallback(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E onExtraCallbackWithResult(int i) {
        onExtraCallbackWithResult();
        E[] eArr = this.backing;
        E e = eArr[i];
        ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i, i + 1, this.length);
        setFaultAddress.onExtraCallbackWithResult(this.backing, this.length - 1);
        this.length--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWarmupCompleted(int i, int i2) {
        if (i2 > 0) {
            onExtraCallbackWithResult();
        }
        E[] eArr = this.backing;
        ArraysKt___ArraysJvmKt.copyInto(eArr, eArr, i, i + i2, this.length);
        E[] eArr2 = this.backing;
        int i3 = this.length;
        setFaultAddress.onWarmupCompleted(eArr2, i3 - i2, i3);
        this.length -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int onWarmupCompleted(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.backing[i5]) == z) {
                E[] eArr = this.backing;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.backing;
        ArraysKt___ArraysJvmKt.copyInto(eArr2, eArr2, i4 + i, i2 + i, this.length);
        E[] eArr3 = this.backing;
        int i7 = this.length;
        setFaultAddress.onWarmupCompleted(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            onExtraCallbackWithResult();
        }
        this.length -= i6;
        return i6;
    }

    static final class onExtraCallbackWithResult<E> implements ListIterator<E>, KMutableListIterator {
        private final mergeFaultAdjacentMetadata<E> onExtraCallback;
        private int onExtraCallbackWithResult;
        private int onNavigationEvent;
        private int onWarmupCompleted;

        public onExtraCallbackWithResult(@NotNull mergeFaultAdjacentMetadata<E> mergefaultadjacentmetadata, int i) {
            Intrinsics.checkNotNullParameter(mergefaultadjacentmetadata, "");
            this.onExtraCallback = mergefaultadjacentmetadata;
            this.onWarmupCompleted = i;
            this.onNavigationEvent = -1;
            this.onExtraCallbackWithResult = ((java.util.AbstractList) mergefaultadjacentmetadata).modCount;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.onWarmupCompleted > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.onWarmupCompleted < ((mergeFaultAdjacentMetadata) this.onExtraCallback).length;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.onWarmupCompleted - 1;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.onWarmupCompleted;
        }

        @Override // java.util.ListIterator
        public E previous() {
            IAuthTabCallback();
            int i = this.onWarmupCompleted;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.onWarmupCompleted = i2;
            this.onNavigationEvent = i2;
            return (E) ((mergeFaultAdjacentMetadata) this.onExtraCallback).backing[this.onNavigationEvent];
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            IAuthTabCallback();
            if (this.onWarmupCompleted >= ((mergeFaultAdjacentMetadata) this.onExtraCallback).length) {
                throw new NoSuchElementException();
            }
            int i = this.onWarmupCompleted;
            this.onWarmupCompleted = i + 1;
            this.onNavigationEvent = i;
            return (E) ((mergeFaultAdjacentMetadata) this.onExtraCallback).backing[this.onNavigationEvent];
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            IAuthTabCallback();
            int i = this.onNavigationEvent;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.onExtraCallback.set(i, e);
        }

        @Override // java.util.ListIterator
        public void add(E e) {
            IAuthTabCallback();
            mergeFaultAdjacentMetadata<E> mergefaultadjacentmetadata = this.onExtraCallback;
            int i = this.onWarmupCompleted;
            this.onWarmupCompleted = i + 1;
            mergefaultadjacentmetadata.add(i, e);
            this.onNavigationEvent = -1;
            this.onExtraCallbackWithResult = ((java.util.AbstractList) this.onExtraCallback).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            IAuthTabCallback();
            int i = this.onNavigationEvent;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.onExtraCallback.removeAt(i);
            this.onWarmupCompleted = this.onNavigationEvent;
            this.onNavigationEvent = -1;
            this.onExtraCallbackWithResult = ((java.util.AbstractList) this.onExtraCallback).modCount;
        }

        private final void IAuthTabCallback() {
            if (((java.util.AbstractList) this.onExtraCallback).modCount != this.onExtraCallbackWithResult) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public static final class IAuthTabCallback<E> extends AbstractMutableList<E> implements List<E>, RandomAccess, Serializable, KMutableList {
        private E[] backing;
        private int length;
        private final int offset;
        private final IAuthTabCallback<E> parent;
        private final mergeFaultAdjacentMetadata<E> root;

        public IAuthTabCallback(@NotNull E[] eArr, int i, int i2, @Nullable IAuthTabCallback<E> iAuthTabCallback, @NotNull mergeFaultAdjacentMetadata<E> mergefaultadjacentmetadata) {
            Intrinsics.checkNotNullParameter(eArr, "");
            Intrinsics.checkNotNullParameter(mergefaultadjacentmetadata, "");
            this.backing = eArr;
            this.offset = i;
            this.length = i2;
            this.parent = iAuthTabCallback;
            this.root = mergefaultadjacentmetadata;
            ((java.util.AbstractList) this).modCount = ((java.util.AbstractList) mergefaultadjacentmetadata).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (IAuthTabCallback()) {
                return new setHasSender(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        @Override // kotlin.collections.AbstractMutableList
        public int getSize() {
            onNavigationEvent();
            return this.length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            onNavigationEvent();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            onNavigationEvent();
            AbstractList.Companion.onExtraCallbackWithResult(i, this.length);
            return this.backing[this.offset + i];
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            onExtraCallbackWithResult();
            onNavigationEvent();
            AbstractList.Companion.onExtraCallbackWithResult(i, this.length);
            E[] eArr = this.backing;
            int i2 = this.offset + i;
            E e2 = eArr[i2];
            eArr[i2] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            onNavigationEvent();
            for (int i = 0; i < this.length; i++) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            onNavigationEvent();
            for (int i = this.length - 1; i >= 0; i--) {
                if (Intrinsics.areEqual(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<E> listIterator(int i) {
            onNavigationEvent();
            AbstractList.Companion.onNavigationEvent(i, this.length);
            return new C0037IAuthTabCallback(this, i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e) {
            onExtraCallbackWithResult();
            onNavigationEvent();
            onWarmupCompleted(this.offset + this.length, e);
            return true;
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            onExtraCallbackWithResult();
            onNavigationEvent();
            AbstractList.Companion.onNavigationEvent(i, this.length);
            onWarmupCompleted(this.offset + i, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            onExtraCallbackWithResult();
            onNavigationEvent();
            int size = collection.size();
            onNavigationEvent(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, @NotNull Collection<? extends E> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            onExtraCallbackWithResult();
            onNavigationEvent();
            AbstractList.Companion.onNavigationEvent(i, this.length);
            int size = collection.size();
            onNavigationEvent(this.offset + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            onExtraCallbackWithResult();
            onNavigationEvent();
            IAuthTabCallback(this.offset, this.length);
        }

        @Override // kotlin.collections.AbstractMutableList
        public E removeAt(int i) {
            onExtraCallbackWithResult();
            onNavigationEvent();
            AbstractList.Companion.onExtraCallbackWithResult(i, this.length);
            return onExtraCallback(this.offset + i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            onExtraCallbackWithResult();
            onNavigationEvent();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                removeAt(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            onExtraCallbackWithResult();
            onNavigationEvent();
            return IAuthTabCallback(this.offset, this.length, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            onExtraCallbackWithResult();
            onNavigationEvent();
            return IAuthTabCallback(this.offset, this.length, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<E> subList(int i, int i2) {
            AbstractList.Companion.onNavigationEvent(i, i2, this.length);
            return new IAuthTabCallback(this.backing, this.offset + i, i2 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(@NotNull T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "");
            onNavigationEvent();
            int length = tArr.length;
            int i = this.length;
            if (length < i) {
                E[] eArr = this.backing;
                int i2 = this.offset;
                T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
                Intrinsics.checkNotNullExpressionValue(tArr2, "");
                return tArr2;
            }
            E[] eArr2 = this.backing;
            int i3 = this.offset;
            ArraysKt___ArraysJvmKt.copyInto(eArr2, tArr, 0, i3, i + i3);
            return (T[]) CollectionsKt__CollectionsJVMKt.terminateCollectionToArray(this.length, tArr);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            onNavigationEvent();
            E[] eArr = this.backing;
            int i = this.offset;
            return ArraysKt___ArraysJvmKt.copyOfRange(eArr, i, this.length + i);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object obj) {
            onNavigationEvent();
            if (obj != this) {
                return (obj instanceof List) && IAuthTabCallback((List<?>) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            onNavigationEvent();
            return setFaultAddress.onExtraCallbackWithResult(this.backing, this.offset, this.length);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            onNavigationEvent();
            return setFaultAddress.onExtraCallbackWithResult((Object[]) this.backing, this.offset, this.length, (Collection) this);
        }

        private final void onWarmupCompleted() {
            ((java.util.AbstractList) this).modCount++;
        }

        private final void onNavigationEvent() {
            if (((java.util.AbstractList) this.root).modCount != ((java.util.AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void onExtraCallbackWithResult() {
            if (IAuthTabCallback()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean IAuthTabCallback() {
            return ((mergeFaultAdjacentMetadata) this.root).isReadOnly;
        }

        private final boolean IAuthTabCallback(List<?> list) {
            return setFaultAddress.onExtraCallbackWithResult((Object[]) this.backing, this.offset, this.length, (List<?>) list);
        }

        private final void onWarmupCompleted(int i, E e) {
            onWarmupCompleted();
            IAuthTabCallback<E> iAuthTabCallback = this.parent;
            if (iAuthTabCallback == null) {
                this.root.onNavigationEvent(i, e);
            } else {
                iAuthTabCallback.onWarmupCompleted(i, e);
            }
            this.backing = (E[]) ((mergeFaultAdjacentMetadata) this.root).backing;
            this.length++;
        }

        private final void onNavigationEvent(int i, Collection<? extends E> collection, int i2) {
            onWarmupCompleted();
            IAuthTabCallback<E> iAuthTabCallback = this.parent;
            if (iAuthTabCallback == null) {
                this.root.onWarmupCompleted(i, collection, i2);
            } else {
                iAuthTabCallback.onNavigationEvent(i, collection, i2);
            }
            this.backing = (E[]) ((mergeFaultAdjacentMetadata) this.root).backing;
            this.length += i2;
        }

        private final E onExtraCallback(int i) {
            E eOnExtraCallback;
            onWarmupCompleted();
            IAuthTabCallback<E> iAuthTabCallback = this.parent;
            if (iAuthTabCallback == null) {
                eOnExtraCallback = (E) this.root.onExtraCallbackWithResult(i);
            } else {
                eOnExtraCallback = iAuthTabCallback.onExtraCallback(i);
            }
            this.length--;
            return eOnExtraCallback;
        }

        private final void IAuthTabCallback(int i, int i2) {
            if (i2 > 0) {
                onWarmupCompleted();
            }
            IAuthTabCallback<E> iAuthTabCallback = this.parent;
            if (iAuthTabCallback == null) {
                this.root.onWarmupCompleted(i, i2);
            } else {
                iAuthTabCallback.IAuthTabCallback(i, i2);
            }
            this.length -= i2;
        }

        private final int IAuthTabCallback(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iOnWarmupCompleted;
            IAuthTabCallback<E> iAuthTabCallback = this.parent;
            if (iAuthTabCallback == null) {
                iOnWarmupCompleted = this.root.onWarmupCompleted(i, i2, collection, z);
            } else {
                iOnWarmupCompleted = iAuthTabCallback.IAuthTabCallback(i, i2, collection, z);
            }
            if (iOnWarmupCompleted > 0) {
                onWarmupCompleted();
            }
            this.length -= iOnWarmupCompleted;
            return iOnWarmupCompleted;
        }

        /* renamed from: o.mergeFaultAdjacentMetadata$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        static final class C0037IAuthTabCallback<E> implements ListIterator<E>, KMutableListIterator {
            private int IAuthTabCallback;
            private int onExtraCallback;
            private final IAuthTabCallback<E> onNavigationEvent;
            private int onWarmupCompleted;

            public C0037IAuthTabCallback(@NotNull IAuthTabCallback<E> iAuthTabCallback, int i) {
                Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
                this.onNavigationEvent = iAuthTabCallback;
                this.onExtraCallback = i;
                this.IAuthTabCallback = -1;
                this.onWarmupCompleted = ((java.util.AbstractList) iAuthTabCallback).modCount;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.onExtraCallback > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.onExtraCallback < ((IAuthTabCallback) this.onNavigationEvent).length;
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.onExtraCallback - 1;
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.onExtraCallback;
            }

            @Override // java.util.ListIterator
            public E previous() {
                onExtraCallback();
                int i = this.onExtraCallback;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.onExtraCallback = i2;
                this.IAuthTabCallback = i2;
                return (E) ((IAuthTabCallback) this.onNavigationEvent).backing[((IAuthTabCallback) this.onNavigationEvent).offset + this.IAuthTabCallback];
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                onExtraCallback();
                if (this.onExtraCallback >= ((IAuthTabCallback) this.onNavigationEvent).length) {
                    throw new NoSuchElementException();
                }
                int i = this.onExtraCallback;
                this.onExtraCallback = i + 1;
                this.IAuthTabCallback = i;
                return (E) ((IAuthTabCallback) this.onNavigationEvent).backing[((IAuthTabCallback) this.onNavigationEvent).offset + this.IAuthTabCallback];
            }

            @Override // java.util.ListIterator
            public void set(E e) {
                onExtraCallback();
                int i = this.IAuthTabCallback;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.onNavigationEvent.set(i, e);
            }

            @Override // java.util.ListIterator
            public void add(E e) {
                onExtraCallback();
                IAuthTabCallback<E> iAuthTabCallback = this.onNavigationEvent;
                int i = this.onExtraCallback;
                this.onExtraCallback = i + 1;
                iAuthTabCallback.add(i, e);
                this.IAuthTabCallback = -1;
                this.onWarmupCompleted = ((java.util.AbstractList) this.onNavigationEvent).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                onExtraCallback();
                int i = this.IAuthTabCallback;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.onNavigationEvent.removeAt(i);
                this.onExtraCallback = this.IAuthTabCallback;
                this.IAuthTabCallback = -1;
                this.onWarmupCompleted = ((java.util.AbstractList) this.onNavigationEvent).modCount;
            }

            private final void onExtraCallback() {
                if (((java.util.AbstractList) ((IAuthTabCallback) this.onNavigationEvent).root).modCount != this.onWarmupCompleted) {
                    throw new ConcurrentModificationException();
                }
            }
        }
    }
}
