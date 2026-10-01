package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Loader;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class abandon<E extends Loader<E>> extends AbstractCollection<E> implements Deque<E> {
    E IAuthTabCallback;
    E onExtraCallback;

    abandon() {
    }

    void IAuthTabCallback(E e) {
        E e2 = this.onExtraCallback;
        this.onExtraCallback = e;
        if (e2 == null) {
            this.IAuthTabCallback = e;
        } else {
            e2.onNavigationEvent(e);
            e.onExtraCallback(e2);
        }
    }

    void onTransact(E e) {
        E e2 = this.IAuthTabCallback;
        this.IAuthTabCallback = e;
        if (e2 == null) {
            this.onExtraCallback = e;
        } else {
            e2.onExtraCallback(e);
            e.onNavigationEvent(e2);
        }
    }

    E access100() {
        E e = this.onExtraCallback;
        E e2 = (E) e.IAuthTabCallback();
        e.onExtraCallback(null);
        this.onExtraCallback = e2;
        if (e2 == null) {
            this.IAuthTabCallback = null;
            return e;
        }
        e2.onNavigationEvent(null);
        return e;
    }

    E extraCallbackWithResult() {
        E e = this.IAuthTabCallback;
        E e2 = (E) e.onExtraCallback();
        e.onNavigationEvent(null);
        this.IAuthTabCallback = e2;
        if (e2 == null) {
            this.onExtraCallback = null;
            return e;
        }
        e2.onExtraCallback(null);
        return e;
    }

    void IAuthTabCallbackStubProxy(E e) {
        E e2 = (E) e.onExtraCallback();
        E e3 = (E) e.IAuthTabCallback();
        if (e2 == null) {
            this.onExtraCallback = e3;
        } else {
            e2.onExtraCallback(e3);
            e.onNavigationEvent(null);
        }
        if (e3 == null) {
            this.IAuthTabCallback = e2;
        } else {
            e3.onNavigationEvent(e2);
            e.onExtraCallback(null);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.onExtraCallback == null;
    }

    void onExtraCallback() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public int size() {
        int i2 = 0;
        for (Loader loaderIAuthTabCallback = this.onExtraCallback; loaderIAuthTabCallback != null; loaderIAuthTabCallback = loaderIAuthTabCallback.IAuthTabCallback()) {
            i2++;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o.Loader] */
    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        E e = this.onExtraCallback;
        while (e != null) {
            ?? IAuthTabCallback = e.IAuthTabCallback();
            e.onNavigationEvent(null);
            e.onExtraCallback(null);
            e = IAuthTabCallback;
        }
        this.IAuthTabCallback = null;
        this.onExtraCallback = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean contains(Object obj) {
        return (obj instanceof Loader) && onExtraCallback((Loader) obj);
    }

    boolean onExtraCallback(Loader<?> loader) {
        return (loader.onExtraCallback() == null && loader.IAuthTabCallback() == null && loader != this.onExtraCallback) ? false : true;
    }

    public void asBinder(E e) {
        if (e != this.IAuthTabCallback) {
            IAuthTabCallbackStubProxy(e);
            onTransact(e);
        }
    }

    @Override // java.util.Deque, java.util.Queue
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public E peek() {
        return (E) peekFirst();
    }

    @Override // java.util.Deque
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public E peekFirst() {
        return this.onExtraCallback;
    }

    @Override // java.util.Deque
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public E peekLast() {
        return this.IAuthTabCallback;
    }

    @Override // java.util.Deque
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public E getFirst() {
        onExtraCallback();
        return (E) peekFirst();
    }

    @Override // java.util.Deque
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public E getLast() {
        onExtraCallback();
        return (E) peekLast();
    }

    @Override // java.util.Deque, java.util.Queue
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public E element() {
        return (E) getFirst();
    }

    @Override // java.util.Deque, java.util.Queue
    /* renamed from: asInterface, reason: merged with bridge method [inline-methods] */
    public boolean offer(E e) {
        return offerLast(e);
    }

    @Override // java.util.Deque
    /* renamed from: IAuthTabCallbackDefault, reason: merged with bridge method [inline-methods] */
    public boolean offerFirst(E e) {
        if (onExtraCallback(e)) {
            return false;
        }
        IAuthTabCallback(e);
        return true;
    }

    @Override // java.util.Deque
    /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
    public boolean offerLast(E e) {
        if (onExtraCallback(e)) {
            return false;
        }
        onTransact(e);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public boolean add(E e) {
        return offerLast(e);
    }

    @Override // java.util.Deque
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public void addFirst(E e) {
        if (!offerFirst(e)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.Deque
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public void addLast(E e) {
        if (!offerLast(e)) {
            throw new IllegalArgumentException();
        }
    }

    @Override // java.util.Deque, java.util.Queue
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public E poll() {
        return (E) pollFirst();
    }

    @Override // java.util.Deque
    /* renamed from: IAuthTabCallbackStub, reason: merged with bridge method [inline-methods] */
    public E pollFirst() {
        if (isEmpty()) {
            return null;
        }
        return (E) access100();
    }

    @Override // java.util.Deque
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return (E) extraCallbackWithResult();
    }

    @Override // java.util.Deque, java.util.Queue
    /* renamed from: IAuthTabCallback_Parcel, reason: merged with bridge method [inline-methods] */
    public E remove() {
        return (E) removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public boolean remove(Object obj) {
        return (obj instanceof Loader) && IAuthTabCallback_Parcel((Loader) obj);
    }

    boolean IAuthTabCallback_Parcel(E e) {
        if (!onExtraCallback(e)) {
            return false;
        }
        IAuthTabCallbackStubProxy(e);
        return true;
    }

    @Override // java.util.Deque
    /* renamed from: access000, reason: merged with bridge method [inline-methods] */
    public E removeFirst() {
        onExtraCallback();
        return (E) pollFirst();
    }

    @Override // java.util.Deque
    public boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    /* renamed from: getInterfaceDescriptor, reason: merged with bridge method [inline-methods] */
    public E removeLast() {
        onExtraCallback();
        return (E) pollLast();
    }

    @Override // java.util.Deque
    public boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    /* renamed from: getInterfaceDescriptor, reason: merged with bridge method [inline-methods] */
    public void push(E e) {
        addFirst(e);
    }

    @Override // java.util.Deque
    /* renamed from: IAuthTabCallbackStubProxy, reason: merged with bridge method [inline-methods] */
    public E pop() {
        return (E) removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public Iterator<E> iterator() {
        return new abandon<E>.onExtraCallback(this.onExtraCallback) { // from class: o.abandon.5
            @Override // o.abandon.onExtraCallback
            E onExtraCallback() {
                return (E) this.onNavigationEvent.IAuthTabCallback();
            }
        };
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return new abandon<E>.onExtraCallback(this.IAuthTabCallback) { // from class: o.abandon.1
            @Override // o.abandon.onExtraCallback
            E onExtraCallback() {
                return (E) this.onNavigationEvent.onExtraCallback();
            }
        };
    }

    abstract class onExtraCallback implements Iterator<E> {
        E onNavigationEvent;

        abstract E onExtraCallback();

        onExtraCallback(E e) {
            this.onNavigationEvent = e;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onNavigationEvent != null;
        }

        @Override // java.util.Iterator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E e = this.onNavigationEvent;
            this.onNavigationEvent = (E) onExtraCallback();
            return e;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
