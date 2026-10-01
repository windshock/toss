package io.realm;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class RealmMap<K, V> implements Map<K, V> {
    protected final MapStrategy<K, V> IAuthTabCallback = new UnmanagedMapStrategy();

    protected RealmMap() {
    }

    @Override // java.util.Map
    public int size() {
        return this.IAuthTabCallback.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.IAuthTabCallback.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return this.IAuthTabCallback.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return this.IAuthTabCallback.containsValue(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.IAuthTabCallback.get(obj);
    }

    @Override // java.util.Map
    public V put(K k, @Nullable V v) {
        return this.IAuthTabCallback.put(k, v);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.IAuthTabCallback.remove(obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.IAuthTabCallback.putAll(map);
    }

    @Override // java.util.Map
    public void clear() {
        this.IAuthTabCallback.clear();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.IAuthTabCallback.keySet();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.IAuthTabCallback.values();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.IAuthTabCallback.entrySet();
    }

    static abstract class MapStrategy<K, V> implements Map<K, V> {
        abstract V IAuthTabCallback(K k, @Nullable V v);

        MapStrategy() {
        }

        @Override // java.util.Map
        public V put(K k, V v) {
            onNavigationEvent(k);
            return IAuthTabCallback(k, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected void onNavigationEvent(K k) {
            if (k == 0) {
                throw new NullPointerException("Null keys are not allowed.");
            }
            if (k.getClass() == String.class) {
                String str = (String) k;
                if (str.contains(".") || str.contains("$")) {
                    throw new IllegalArgumentException("Keys containing dots ('.') or dollar signs ('$') are not allowed.");
                }
            }
        }
    }

    static class UnmanagedMapStrategy<K, V> extends MapStrategy<K, V> {
        private final Map<K, V> onExtraCallback;

        private UnmanagedMapStrategy() {
            this.onExtraCallback = new HashMap();
        }

        @Override // java.util.Map
        public int size() {
            return this.onExtraCallback.size();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.onExtraCallback.isEmpty();
        }

        @Override // java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return this.onExtraCallback.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return this.onExtraCallback.containsValue(obj);
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.onExtraCallback.get(obj);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            return this.onExtraCallback.remove(obj);
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.onExtraCallback.putAll(map);
        }

        @Override // java.util.Map
        public void clear() {
            this.onExtraCallback.clear();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return this.onExtraCallback.keySet();
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return this.onExtraCallback.values();
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return this.onExtraCallback.entrySet();
        }

        @Override // io.realm.RealmMap.MapStrategy
        protected V IAuthTabCallback(K k, @Nullable V v) {
            return this.onExtraCallback.put(k, v);
        }
    }
}
