package o;

import java.util.ArrayList;
import java.util.Collection;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class getProxyAuthenticatorokhttp<T> extends ArrayList<T> {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private int mExactSize = 0;

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 25;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return Integer.MAX_VALUE;
        }
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T get(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 39;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.mExactSize;
        return (T) super.get(i4 != 0 ? i >>> i5 : i % i5);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 45;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.mExactSize++;
        boolean zAdd = super.add(t);
        int i4 = onNavigationEvent + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zAdd;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        super.add(i, t);
        this.mExactSize++;
        int i5 = onWarmupCompleted + 117;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends T> collection) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.mExactSize += collection.size();
        boolean zAddAll = super.addAll(collection);
        int i4 = onWarmupCompleted + 59;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zAddAll;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        this.mExactSize += collection.size();
        boolean zAddAll = super.addAll(i, collection);
        int i5 = onWarmupCompleted + 57;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 59;
        onWarmupCompleted = i3 % 128;
        this.mExactSize = i3 % 2 != 0 ? this.mExactSize << 1 : this.mExactSize - 1;
        return (T) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        this.mExactSize = i2 % 2 == 0 ? this.mExactSize >> 1 : this.mExactSize - 1;
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        this.mExactSize -= collection.size();
        boolean zRemoveAll = super.removeAll(collection);
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return zRemoveAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int i;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 41;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            super.clear();
            i = 1;
        } else {
            super.clear();
            i = 0;
        }
        this.mExactSize = i;
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }
}
