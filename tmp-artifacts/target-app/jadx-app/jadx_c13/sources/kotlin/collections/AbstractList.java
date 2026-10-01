package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>, KMappedMarker {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);

    @Override // java.util.List
    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public abstract E get(int i);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.List
    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new IAuthTabCallback();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new onWarmupCompleted(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return new onWarmupCompleted(i);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return new onNavigationEvent(this, i, i2);
    }

    static final class onNavigationEvent<E> extends AbstractList<E> implements RandomAccess {
        private int IAuthTabCallback;
        private final int onExtraCallback;
        private final AbstractList<E> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        public onNavigationEvent(@NotNull AbstractList<? extends E> abstractList, int i, int i2) {
            Intrinsics.checkNotNullParameter(abstractList, "");
            this.onExtraCallbackWithResult = abstractList;
            this.onExtraCallback = i;
            AbstractList.Companion.onNavigationEvent(i, i2, abstractList.size());
            this.IAuthTabCallback = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i) {
            AbstractList.Companion.onExtraCallbackWithResult(i, this.IAuthTabCallback);
            return this.onExtraCallbackWithResult.get(this.onExtraCallback + i);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int getSize() {
            return this.IAuthTabCallback;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public List<E> subList(int i, int i2) {
            AbstractList.Companion.onNavigationEvent(i, i2, this.IAuthTabCallback);
            AbstractList<E> abstractList = this.onExtraCallbackWithResult;
            int i3 = this.onExtraCallback;
            return new onNavigationEvent(abstractList, i + i3, i3 + i2);
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return Companion.IAuthTabCallback(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return Companion.onExtraCallbackWithResult(this);
    }

    class IAuthTabCallback implements Iterator<E>, KMappedMarker {
        private int onExtraCallbackWithResult;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public IAuthTabCallback() {
        }

        protected final int IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }

        protected final void onExtraCallbackWithResult(int i) {
            this.onExtraCallbackWithResult = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallbackWithResult < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            int i = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = i + 1;
            return abstractList.get(i);
        }
    }

    class onWarmupCompleted extends AbstractList<E>.IAuthTabCallback implements ListIterator<E>, KMappedMarker {
        @Override // java.util.ListIterator
        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public onWarmupCompleted(int i) {
            super();
            AbstractList.Companion.onNavigationEvent(i, AbstractList.this.size());
            onExtraCallbackWithResult(i);
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return IAuthTabCallback() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return IAuthTabCallback();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            onExtraCallbackWithResult(IAuthTabCallback() - 1);
            return abstractList.get(IAuthTabCallback());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return IAuthTabCallback() - 1;
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int onWarmupCompleted(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 <= 0) {
                return i3;
            }
            if (i2 > 2147483639) {
                return IntCompanionObject.MAX_VALUE;
            }
            return 2147483639;
        }

        private onExtraCallbackWithResult() {
        }

        public final void onExtraCallbackWithResult(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void onNavigationEvent(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void onNavigationEvent(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        public final void onWarmupCompleted(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }

        public final int onExtraCallbackWithResult(@NotNull Collection<?> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public final boolean IAuthTabCallback(@NotNull Collection<?> collection, @NotNull Collection<?> collection2) {
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(collection2, "");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.areEqual(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
}
