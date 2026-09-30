package com.alibaba.ariver.kernel.common.immutable;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ImmutableCollection<E> implements Iterable<E> {
    private static Iterator sEmptyIterator = new Iterator() { // from class: com.alibaba.ariver.kernel.common.immutable.ImmutableCollection.1
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("removing is unsupported");
        }
    };
    protected Collection<E> immutableCollection;

    static class ImmutableIterator implements Iterator {
        private Iterator immutableIterator;

        public ImmutableIterator(Iterator it) {
            this.immutableIterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Iterator it = this.immutableIterator;
            return it != null && it.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Iterator it = this.immutableIterator;
            if (it != null) {
                return it.next();
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("removing is unsupported");
        }
    }

    public ImmutableCollection(Collection<E> collection) {
        this.immutableCollection = collection;
    }

    public ImmutableCollection() {
    }

    public int size() {
        Collection<E> collection = this.immutableCollection;
        if (collection != null) {
            return collection.size();
        }
        return 0;
    }

    public boolean isEmpty() {
        Collection<E> collection = this.immutableCollection;
        return collection == null || collection.isEmpty();
    }

    public boolean contains(Object obj) {
        Collection<E> collection = this.immutableCollection;
        return collection != null && collection.contains(obj);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Collection<E> collection = this.immutableCollection;
        if (collection == null) {
            return sEmptyIterator;
        }
        return new ImmutableIterator(collection.iterator());
    }

    public Object[] toArray() {
        Collection<E> collection = this.immutableCollection;
        if (collection != null) {
            return collection.toArray();
        }
        return null;
    }

    public boolean containsAll(Collection<?> collection) {
        Collection<E> collection2 = this.immutableCollection;
        return collection2 != null && collection2.containsAll(collection);
    }
}
