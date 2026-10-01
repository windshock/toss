package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.LazySaveableStateHolderKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V> extends LinkedHashMap<K, V> {
    private static final LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<?, ?> IAuthTabCallback;
    private boolean isMutable;

    private LazyStaggeredGridItemProviderImplExternalSyntheticLambda0() {
        this.isMutable = true;
    }

    private LazyStaggeredGridItemProviderImplExternalSyntheticLambda0(Map<K, V> map) {
        super(map);
        this.isMutable = true;
    }

    static {
        LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<?, ?> lazyStaggeredGridItemProviderImplExternalSyntheticLambda0 = new LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<>();
        IAuthTabCallback = lazyStaggeredGridItemProviderImplExternalSyntheticLambda0;
        lazyStaggeredGridItemProviderImplExternalSyntheticLambda0.onExtraCallbackWithResult();
    }

    public static <K, V> LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V> onWarmupCompleted() {
        return (LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V>) IAuthTabCallback;
    }

    public void onExtraCallbackWithResult(LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V> lazyStaggeredGridItemProviderImplExternalSyntheticLambda0) {
        IAuthTabCallback();
        if (lazyStaggeredGridItemProviderImplExternalSyntheticLambda0.isEmpty()) {
            return;
        }
        putAll(lazyStaggeredGridItemProviderImplExternalSyntheticLambda0);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        IAuthTabCallback();
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        IAuthTabCallback();
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(k);
        LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        IAuthTabCallback();
        onNavigationEvent((Map<?, ?>) map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        IAuthTabCallback();
        return (V) super.remove(obj);
    }

    private static void onNavigationEvent(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(obj);
            LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent(map.get(obj));
        }
    }

    private static boolean onWarmupCompleted(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    static <K, V> boolean onNavigationEvent(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !onWarmupCompleted(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && onNavigationEvent(this, (Map) obj);
    }

    private static int onNavigationEvent(Object obj) {
        if (obj instanceof byte[]) {
            return LazySaveableStateHolderKtExternalSyntheticLambda1.onNavigationEvent((byte[]) obj);
        }
        if (obj instanceof LazySaveableStateHolderKtExternalSyntheticLambda1.onWarmupCompleted) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    static <K, V> int onExtraCallbackWithResult(Map<K, V> map) {
        int iOnNavigationEvent = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iOnNavigationEvent += onNavigationEvent(entry.getValue()) ^ onNavigationEvent(entry.getKey());
        }
        return iOnNavigationEvent;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return onExtraCallbackWithResult((Map) this);
    }

    public LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<K, V> onNavigationEvent() {
        return isEmpty() ? new LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<>() : new LazyStaggeredGridItemProviderImplExternalSyntheticLambda0<>(this);
    }

    public void onExtraCallbackWithResult() {
        this.isMutable = false;
    }

    public boolean onExtraCallback() {
        return this.isMutable;
    }

    private void IAuthTabCallback() {
        if (!onExtraCallback()) {
            throw new UnsupportedOperationException();
        }
    }
}
