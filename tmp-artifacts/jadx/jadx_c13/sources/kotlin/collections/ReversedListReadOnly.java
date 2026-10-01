package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
class ReversedListReadOnly<T> extends AbstractList<T> {
    private final List<T> onWarmupCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public ReversedListReadOnly(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onWarmupCompleted = list;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.onWarmupCompleted.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int i) {
        return this.onWarmupCompleted.get(CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, i));
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    /* renamed from: kotlin.collections.ReversedListReadOnly$listIterator$1, reason: invalid class name */
    public static final class AnonymousClass1 implements ListIterator<T>, KMappedMarker {
        private final ListIterator<T> onExtraCallbackWithResult;
        final /* synthetic */ ReversedListReadOnly<T> onWarmupCompleted;

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ReversedListReadOnly<? extends T> reversedListReadOnly, int i) {
            this.onWarmupCompleted = reversedListReadOnly;
            this.onExtraCallbackWithResult = ((ReversedListReadOnly) reversedListReadOnly).onWarmupCompleted.listIterator(CollectionsKt__ReversedViewsKt.reversePositionIndex$CollectionsKt__ReversedViewsKt(reversedListReadOnly, i));
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
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.onWarmupCompleted, this.onExtraCallbackWithResult.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.onExtraCallbackWithResult.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return CollectionsKt__ReversedViewsKt.reverseIteratorIndex$CollectionsKt__ReversedViewsKt(this.onWarmupCompleted, this.onExtraCallbackWithResult.nextIndex());
        }
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i) {
        return new AnonymousClass1(this, i);
    }
}
