package o;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access6200<K, V> extends AbstractMap<K, V> implements Map<K, V>, KMutableMap {
    public abstract Set<Map.Entry<K, V>> onNavigationEvent();

    public Collection<Object> IAuthTabCallbackDefault() {
        return super.values();
    }

    public int asInterface() {
        return super.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return onNavigationEvent();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return (Set<K>) onExtraCallback();
    }

    public Set<Object> onExtraCallback() {
        return super.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return asInterface();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return (Collection<V>) IAuthTabCallbackDefault();
    }
}
