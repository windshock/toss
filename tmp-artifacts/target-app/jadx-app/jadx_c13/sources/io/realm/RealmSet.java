package io.realm;

import io.realm.internal.OsSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class RealmSet<E> implements Set<E>, RealmCollection<E> {
    protected final SetStrategy<E> onWarmupCompleted = new UnmanagedSetStrategy();

    @Override // io.realm.RealmCollection
    public boolean onExtraCallbackWithResult() {
        return true;
    }

    @Override // io.realm.RealmCollection
    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted.IAuthTabCallback();
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.onWarmupCompleted.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.onWarmupCompleted.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        return this.onWarmupCompleted.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.onWarmupCompleted.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.onWarmupCompleted.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.onWarmupCompleted.toArray(tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(@Nullable E e) {
        return this.onWarmupCompleted.add(e);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        return this.onWarmupCompleted.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.onWarmupCompleted.containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.onWarmupCompleted.addAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.onWarmupCompleted.retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.onWarmupCompleted.removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.onWarmupCompleted.clear();
    }

    public OsSet onExtraCallback() {
        return this.onWarmupCompleted.onWarmupCompleted();
    }

    static abstract class SetStrategy<E> implements Set<E>, RealmCollection<E> {
        abstract OsSet onWarmupCompleted();

        private SetStrategy() {
        }
    }

    static class UnmanagedSetStrategy<E> extends SetStrategy<E> {
        private final Set<E> onWarmupCompleted;

        @Override // io.realm.RealmCollection
        public boolean IAuthTabCallback() {
            return false;
        }

        @Override // io.realm.RealmCollection
        public boolean onExtraCallbackWithResult() {
            return true;
        }

        UnmanagedSetStrategy() {
            super();
            this.onWarmupCompleted = new HashSet();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.onWarmupCompleted.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.onWarmupCompleted.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(@Nullable Object obj) {
            return this.onWarmupCompleted.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return this.onWarmupCompleted.iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return this.onWarmupCompleted.toArray();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.onWarmupCompleted.toArray(tArr);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(@Nullable E e) {
            return this.onWarmupCompleted.add(e);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(@Nullable Object obj) {
            return this.onWarmupCompleted.remove(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return this.onWarmupCompleted.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            return this.onWarmupCompleted.addAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return this.onWarmupCompleted.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return this.onWarmupCompleted.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            this.onWarmupCompleted.clear();
        }

        @Override // io.realm.RealmSet.SetStrategy
        OsSet onWarmupCompleted() {
            throw new UnsupportedOperationException("Unmanaged RealmSets do not have a representation in native code.");
        }
    }
}
