package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class ReversedList<T> extends AbstractMutableList<T> {
    private final List<T> onNavigationEvent;

    public ReversedList(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent = list;
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.onNavigationEvent.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.onNavigationEvent.get(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.onNavigationEvent.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    public T removeAt(int i) {
        return this.onNavigationEvent.remove(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        return this.onNavigationEvent.set(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i), t);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        this.onNavigationEvent.add(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    /* renamed from: kotlin.collections.ReversedList$listIterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements ListIterator<T>, KMutableListIterator {
        private final ListIterator<T> onExtraCallbackWithResult;
        final /* synthetic */ ReversedList<T> onNavigationEvent;

        AnonymousClass1(ReversedList<T> reversedList, int i) {
            this.onNavigationEvent = reversedList;
            this.onExtraCallbackWithResult = ((ReversedList) reversedList).onNavigationEvent.listIterator(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedList, i));
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallbackWithResult.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.onExtraCallbackWithResult.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.onExtraCallbackWithResult.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.onNavigationEvent, this.onExtraCallbackWithResult.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.onExtraCallbackWithResult.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.onNavigationEvent, this.onExtraCallbackWithResult.nextIndex());
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.onExtraCallbackWithResult.add(t);
            this.onExtraCallbackWithResult.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.onExtraCallbackWithResult.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.onExtraCallbackWithResult.set(t);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i) {
        return new AnonymousClass1(this, i);
    }
}
