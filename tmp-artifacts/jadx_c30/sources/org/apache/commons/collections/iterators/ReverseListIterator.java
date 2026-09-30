package org.apache.commons.collections.iterators;

import java.util.ListIterator;
import org.apache.commons.collections.ResettableListIterator;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class ReverseListIterator implements ResettableListIterator {
    private ListIterator onExtraCallbackWithResult;
    private boolean onNavigationEvent;

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.onExtraCallbackWithResult.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        Object objPrevious = this.onExtraCallbackWithResult.previous();
        this.onNavigationEvent = true;
        return objPrevious;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.onExtraCallbackWithResult.previousIndex();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.onExtraCallbackWithResult.hasNext();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        Object next = this.onExtraCallbackWithResult.next();
        this.onNavigationEvent = true;
        return next;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.onExtraCallbackWithResult.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (!this.onNavigationEvent) {
            throw new IllegalStateException("Cannot remove from list until next() or previous() called");
        }
        this.onExtraCallbackWithResult.remove();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        if (!this.onNavigationEvent) {
            throw new IllegalStateException("Cannot set to list until next() or previous() called");
        }
        this.onExtraCallbackWithResult.set(obj);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        if (!this.onNavigationEvent) {
            throw new IllegalStateException("Cannot add to list until next() or previous() called");
        }
        this.onNavigationEvent = false;
        this.onExtraCallbackWithResult.add(obj);
        this.onExtraCallbackWithResult.previous();
    }
}
