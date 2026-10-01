package o;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public class requestCount<K extends Comparable<? super K>, V> implements removeokhttp<K, V> {
    private static int asInterface = 1;
    private static int onTransact;
    private final Collection<V> IAuthTabCallback;
    private final Map<K, V> onExtraCallback;
    private final int onExtraCallbackWithResult;
    private final Set<Map.Entry<K, V>> onNavigationEvent;
    private final Set<K> onWarmupCompleted;

    @Override // java.util.Map
    public void clear() {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        int i = 2 % 2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public requestCount(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.onExtraCallback = map;
        this.onNavigationEvent = map.entrySet();
        this.onWarmupCompleted = map.keySet();
        this.onExtraCallbackWithResult = map.size();
        this.IAuthTabCallback = map.values();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z = obj instanceof Comparable;
            throw null;
        }
        if (!(obj instanceof Comparable)) {
            return false;
        }
        boolean zOnExtraCallback = onExtraCallback((Comparable) obj);
        int i3 = asInterface + 109;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 87 / 0;
        }
        return zOnExtraCallback;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        int i = 2 % 2;
        int i2 = onTransact + 81;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Set<Map.Entry<K, V>> setOnExtraCallback = onExtraCallback();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return setOnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return onNavigationEvent((java.lang.Comparable) r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof java.lang.Comparable) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r5 instanceof java.lang.Comparable)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = r1 + 125;
        o.requestCount.onTransact = r1 % 128;
        r1 = r1 % 2;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V get(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 81;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
    }

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        int i3 = i2 % 128;
        onTransact = i3;
        int i4 = i2 % 2;
        if (!(!(obj instanceof Comparable))) {
            return onExtraCallbackWithResult((Comparable) obj, v);
        }
        int i5 = i3 + 59;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return v;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        Set<K> setOnNavigationEvent = onNavigationEvent();
        int i3 = asInterface + 97;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return setOnNavigationEvent;
        }
        throw null;
    }

    @Override // java.util.Map
    public final int size() {
        int i = 2 % 2;
        int i2 = onTransact + 27;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        onWarmupCompleted();
        throw null;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public requestCount(@NotNull Pair<? extends K, ? extends V>... pairArr) {
        this(getWriteAbortCountokhttp.IAuthTabCallback(pairArr));
        Intrinsics.checkNotNullParameter(pairArr, "");
    }

    public Set<Map.Entry<K, V>> onExtraCallback() {
        Set<Map.Entry<K, V>> set;
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 51;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            set = this.onNavigationEvent;
            int i4 = 90 / 0;
        } else {
            set = this.onNavigationEvent;
        }
        int i5 = i2 + 51;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            return set;
        }
        throw null;
    }

    public Set<K> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact;
        int i3 = i2 + 77;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        Set<K> set = this.onWarmupCompleted;
        int i5 = i2 + 57;
        asInterface = i5 % 128;
        if (i5 % 2 != 0) {
            return set;
        }
        throw null;
    }

    public int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        int i5 = this.onExtraCallbackWithResult;
        int i6 = i3 + 1;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public Collection<V> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        Collection<V> collection = this.IAuthTabCallback;
        int i5 = i3 + 95;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return collection;
    }

    public boolean onExtraCallback(@NotNull K k) {
        int i = 2 % 2;
        int i2 = asInterface + 11;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(k, "");
        boolean zContainsKey = this.onExtraCallback.containsKey(k);
        int i4 = asInterface + 57;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zContainsValue = this.onExtraCallback.containsValue(obj);
        int i4 = asInterface + 87;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zContainsValue;
    }

    @Override // java.util.Map
    public void forEach(@NotNull BiConsumer<? super K, ? super V> biConsumer) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(biConsumer, "");
            this.onExtraCallback.forEach(biConsumer);
            throw null;
        }
        Intrinsics.checkNotNullParameter(biConsumer, "");
        this.onExtraCallback.forEach(biConsumer);
        int i3 = asInterface + 25;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public V onNavigationEvent(@NotNull K k) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(k, "");
        V v = this.onExtraCallback.get(CollectionsKt.first(keySet()));
        Intrinsics.checkNotNull(v);
        V v2 = this.onExtraCallback.get(CollectionsKt.last(keySet()));
        Intrinsics.checkNotNull(v2);
        V vOnExtraCallbackWithResult = onExtraCallbackWithResult(k, v, v2);
        int i4 = asInterface + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return vOnExtraCallbackWithResult;
    }

    public V onExtraCallbackWithResult(@NotNull K k, V v) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(k, "");
        V v2 = this.onExtraCallback.get(k);
        if (v2 != null) {
            int i2 = asInterface + 65;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return v2;
        }
        int i4 = asInterface + 101;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return v;
    }

    public V onExtraCallbackWithResult(@NotNull K k, V v, V v2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(k, "");
        V v3 = this.onExtraCallback.get(k);
        if (v3 != null) {
            return v3;
        }
        int i2 = asInterface + 33;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (k.compareTo(CollectionsKt.first(keySet())) < 0) {
            int i4 = asInterface + 75;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 71 / 0;
            }
            return v;
        }
        if (k.compareTo(CollectionsKt.last(keySet())) > 0) {
            return v2;
        }
        Set<K> setKeySet = keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setKeySet.iterator();
        while (!(!it.hasNext())) {
            Object next = it.next();
            if (((Comparable) next).compareTo(k) < 0) {
                arrayList.add(next);
            }
        }
        V v4 = this.onExtraCallback.get(CollectionsKt.maxOrThrow(arrayList));
        Intrinsics.checkNotNull(v4);
        int i6 = onTransact + 123;
        asInterface = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 94 / 0;
        }
        return v4;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Map<K, V> map = this.onExtraCallback;
        if (i3 == 0) {
            return map.isEmpty();
        }
        map.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
