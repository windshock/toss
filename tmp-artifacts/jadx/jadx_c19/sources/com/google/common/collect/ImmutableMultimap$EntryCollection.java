package com.google.common.collect;

import java.util.Map;
import javax.annotation.CheckForNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
class ImmutableMultimap$EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
    private static final long serialVersionUID = 0;
    final ImmutableMultimap<K, V> multimap;

    ImmutableMultimap$EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
        this.multimap = immutableMultimap;
    }

    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public UnmodifiableIterator<Map.Entry<K, V>> m61iterator() {
        return this.multimap.entryIterator();
    }

    boolean isPartialView() {
        return this.multimap.isPartialView();
    }

    public int size() {
        return this.multimap.size();
    }

    public boolean contains(@CheckForNull Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.multimap.containsEntry(entry.getKey(), entry.getValue());
    }

    Object writeReplace() {
        return super.writeReplace();
    }
}
