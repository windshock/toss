package o;

import io.realm.internal.ObservableMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class getMetadataCase<K, V> implements Map<K, V>, ObservableMap {
    protected final getRegisterNameBytes<K, V> IAuthTabCallback;

    abstract boolean IAuthTabCallback(@Nullable Object obj);

    @Override // java.util.Map
    public abstract Set<Map.Entry<K, V>> entrySet();

    @Override // java.util.Map
    public abstract V put(@Nullable K k, @Nullable V v);

    @Override // java.util.Map
    public V remove(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed.");
        }
        V vOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(obj);
        this.IAuthTabCallback.onExtraCallbackWithResult(obj);
        return vOnNavigationEvent;
    }

    @Override // java.util.Map
    public int size() {
        return this.IAuthTabCallback.IAuthTabCallback();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.IAuthTabCallback.onExtraCallback();
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return IAuthTabCallback(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return this.IAuthTabCallback.onWarmupCompleted(obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.IAuthTabCallback.IAuthTabCallback((Map) map);
    }

    @Override // java.util.Map
    public void clear() {
        this.IAuthTabCallback.onExtraCallbackWithResult();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.IAuthTabCallback.onNavigationEvent();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.IAuthTabCallback.onWarmupCompleted();
    }
}
