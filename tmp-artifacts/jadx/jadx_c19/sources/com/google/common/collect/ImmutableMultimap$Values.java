package com.google.common.collect;

import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ImmutableMultimap$Values<K, V> extends ImmutableCollection<V> {
    private static final long serialVersionUID = 0;
    private final transient ImmutableMultimap<K, V> multimap;

    boolean isPartialView() {
        return true;
    }

    ImmutableMultimap$Values(ImmutableMultimap<K, V> immutableMultimap) {
        this.multimap = immutableMultimap;
    }

    public boolean contains(@CheckForNull Object obj) {
        return this.multimap.containsValue(obj);
    }

    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator<V> m62iterator() {
        return this.multimap.valueIterator();
    }

    int copyIntoArray(Object[] objArr, int i2) {
        UnmodifiableIterator it = this.multimap.map.values().iterator();
        while (it.hasNext()) {
            i2 = ((ImmutableCollection) it.next()).copyIntoArray(objArr, i2);
        }
        return i2;
    }

    public int size() {
        return this.multimap.size();
    }

    Object writeReplace() {
        return super.writeReplace();
    }
}
