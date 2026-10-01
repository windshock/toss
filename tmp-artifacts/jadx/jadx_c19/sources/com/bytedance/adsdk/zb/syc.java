package com.bytedance.adsdk.zb;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
abstract class syc<K, V> {
    syc<K, V>.zb zb;

    protected abstract void sya();

    protected abstract int ycx();

    protected abstract int ycx(Object obj);

    protected abstract Object ycx(int i2, int i3);

    protected abstract void ycx(int i2);

    protected abstract Map<K, V> zb();

    syc() {
    }

    final class ycx<T> implements Iterator<T> {
        boolean dj = false;
        int sya;
        final int ycx;
        int zb;

        ycx(int i2) {
            this.ycx = i2;
            this.zb = syc.this.ycx();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.sya < this.zb;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) syc.this.ycx(this.sya, this.ycx);
            this.sya++;
            this.dj = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.dj) {
                throw new IllegalStateException();
            }
            int i2 = this.sya - 1;
            this.sya = i2;
            this.zb--;
            this.dj = false;
            syc.this.ycx(i2);
        }
    }

    final class zb implements Set<K> {
        zb() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            syc.this.sya();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return syc.this.ycx(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return syc.ycx(syc.this.zb(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return syc.this.ycx() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new ycx(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iYcx = syc.this.ycx(obj);
            if (iYcx < 0) {
                return false;
            }
            syc.this.ycx(iYcx);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return syc.zb(syc.this.zb(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return syc.sya(syc.this.zb(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return syc.this.ycx();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return syc.this.zb(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) syc.this.ycx(tArr, 0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return syc.ycx(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iYcx = syc.this.ycx() - 1; iYcx >= 0; iYcx--) {
                Object objYcx = syc.this.ycx(iYcx, 0);
                iHashCode += objYcx == null ? 0 : objYcx.hashCode();
            }
            return iHashCode;
        }
    }

    public static <K, V> boolean ycx(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean zb(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean sya(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public Object[] zb(int i2) {
        int iYcx = ycx();
        Object[] objArr = new Object[iYcx];
        for (int i3 = 0; i3 < iYcx; i3++) {
            objArr[i3] = ycx(i3, i2);
        }
        return objArr;
    }

    public <T> T[] ycx(T[] tArr, int i2) {
        int iYcx = ycx();
        if (tArr.length < iYcx) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iYcx));
        }
        for (int i3 = 0; i3 < iYcx; i3++) {
            tArr[i3] = ycx(i3, i2);
        }
        if (tArr.length > iYcx) {
            tArr[iYcx] = null;
        }
        return tArr;
    }

    public static <T> boolean ycx(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public Set<K> dj() {
        if (this.zb == null) {
            this.zb = new zb();
        }
        return this.zb;
    }
}
