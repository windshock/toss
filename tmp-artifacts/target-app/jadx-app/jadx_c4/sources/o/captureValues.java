package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class captureValues<V> implements Map<Class<?>, V> {
    private final Map<String, V> onExtraCallbackWithResult;

    public static <V> Map<Class<?>, V> onNavigationEvent(Map<String, V> map) {
        return new captureValues(map);
    }

    private captureValues(Map<String, V> map) {
        this.onExtraCallbackWithResult = map;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.onExtraCallbackWithResult.get(((Class) obj).getName());
    }

    @Override // java.util.Map
    public Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.onExtraCallbackWithResult.values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.onExtraCallbackWithResult.isEmpty();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.onExtraCallbackWithResult.containsKey(((Class) obj).getName());
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.onExtraCallbackWithResult.containsValue(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.onExtraCallbackWithResult.size();
    }

    @Override // java.util.Map
    public Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public V put(Class<?> cls, V v) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }
}
