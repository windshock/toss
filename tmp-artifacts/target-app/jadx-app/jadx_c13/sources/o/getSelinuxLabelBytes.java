package o;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class getSelinuxLabelBytes<E> implements ListIterator<E>, KMappedMarker {
    private int IAuthTabCallback;
    private int onExtraCallback;

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public getSelinuxLabelBytes(int i, int i2) {
        this.onExtraCallback = i;
        this.IAuthTabCallback = i2;
    }

    public final int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public final int onExtraCallback() {
        return this.onExtraCallback;
    }

    public final void onNavigationEvent(int i) {
        this.onExtraCallback = i;
    }

    public final void onWarmupCompleted(int i) {
        this.IAuthTabCallback = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.onExtraCallback < this.IAuthTabCallback;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.onExtraCallback > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.onExtraCallback;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.onExtraCallback - 1;
    }

    public final void onNavigationEvent() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void onWarmupCompleted() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }
}
