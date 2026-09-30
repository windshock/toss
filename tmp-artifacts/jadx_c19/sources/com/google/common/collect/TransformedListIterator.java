package com.google.common.collect;

import java.util.ListIterator;

@ElementTypesAreNonnullByDefault
/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    TransformedListIterator(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> backingIterator() {
        return (ListIterator) ((TransformedIterator) this).backingIterator;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return backingIterator().hasPrevious();
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final T previous() {
        return (T) transform(backingIterator().previous());
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return backingIterator().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return backingIterator().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@ParametricNullness T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void add(@ParametricNullness T t) {
        throw new UnsupportedOperationException();
    }
}
