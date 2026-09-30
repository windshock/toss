package com.bytedance.sdk.component.ycx;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class wie<K, V> {
    private final Map<K, V> ycx = new HashMap();
    private final Map<V, Set<K>> zb = new HashMap();

    public void ycx(Set<K> set, V v) {
        for (K k : set) {
            if (this.ycx.containsKey(k)) {
                zb(k);
            }
        }
        Set<K> hashSet = this.zb.get(v);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.zb.put(v, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.ycx.put(it.next(), v);
        }
    }

    public V ycx(K k) {
        return this.ycx.get(k);
    }

    public void zb(K k) {
        Set<K> set;
        V vRemove = this.ycx.remove(k);
        if (vRemove == null || (set = this.zb.get(vRemove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.zb.remove(vRemove);
        }
    }

    public void ycx() {
        this.ycx.clear();
        this.zb.clear();
    }
}
