package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import o.access6300;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access6300<K, V> implements Map<K, V>, KMappedMarker {
    public static final onExtraCallback Companion = new onExtraCallback(null);
    private volatile Set<? extends K> onExtraCallbackWithResult;
    private volatile Collection<? extends V> onWarmupCompleted;

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract Set<Map.Entry<K, V>> onExtraCallbackWithResult();

    @Override // java.util.Map
    public V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return onExtraCallbackWithResult();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return IAuthTabCallbackStub();
    }

    @Override // java.util.Map
    public final int size() {
        return asBinder();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return access000();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return onWarmupCompleted(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean IAuthTabCallback(@Nullable Map.Entry<?, ?> entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        Intrinsics.checkNotNull(this, "");
        V v = get(key);
        if (!Intrinsics.areEqual(value, v)) {
            return false;
        }
        if (v != null) {
            return true;
        }
        Intrinsics.checkNotNull(this, "");
        return containsKey(key);
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!IAuthTabCallback((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        Map.Entry<K, V> entryOnWarmupCompleted = onWarmupCompleted(obj);
        if (entryOnWarmupCompleted != null) {
            return entryOnWarmupCompleted.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public int asBinder() {
        return entrySet().size();
    }

    public static final class IAuthTabCallback extends access6700<K> {
        final /* synthetic */ access6300<K, V> onNavigationEvent;

        /* JADX WARN: Multi-variable type inference failed */
        IAuthTabCallback(access6300<K, ? extends V> access6300Var) {
            this.onNavigationEvent = access6300Var;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.onNavigationEvent.containsKey(obj);
        }

        public static final class onNavigationEvent implements Iterator<K>, KMappedMarker {
            final /* synthetic */ Iterator<Map.Entry<K, V>> IAuthTabCallback;

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.IAuthTabCallback = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.IAuthTabCallback.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                return this.IAuthTabCallback.next().getKey();
            }
        }

        @Override // o.access6700, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new onNavigationEvent(this.onNavigationEvent.entrySet().iterator());
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onNavigationEvent.size();
        }
    }

    public Set<K> IAuthTabCallbackStub() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = new IAuthTabCallback(this);
        }
        Set<? extends K> set = this.onExtraCallbackWithResult;
        Intrinsics.checkNotNull(set);
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onNavigationEvent(access6300 access6300Var, Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "");
        return access6300Var.onExtraCallbackWithResult(entry);
    }

    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(entrySet(), ", ", "{", "}", 0, null, new Function1() { // from class: kotlin.collections.AbstractMap$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return access6300.onNavigationEvent(this.f$0, (Map.Entry) obj);
            }
        }, 24, null);
    }

    private final String onExtraCallbackWithResult(Map.Entry<? extends K, ? extends V> entry) {
        return onExtraCallbackWithResult(entry.getKey()) + '=' + onExtraCallbackWithResult(entry.getValue());
    }

    private final String onExtraCallbackWithResult(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    public static final class onWarmupCompleted extends AbstractCollection<V> {
        final /* synthetic */ access6300<K, V> onExtraCallbackWithResult;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(access6300<K, ? extends V> access6300Var) {
            this.onExtraCallbackWithResult = access6300Var;
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.onExtraCallbackWithResult.containsValue(obj);
        }

        public static final class onNavigationEvent implements Iterator<V>, KMappedMarker {
            final /* synthetic */ Iterator<Map.Entry<K, V>> onWarmupCompleted;

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            /* JADX WARN: Multi-variable type inference failed */
            onNavigationEvent(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
                this.onWarmupCompleted = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.onWarmupCompleted.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                return this.onWarmupCompleted.next().getValue();
            }
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new onNavigationEvent(this.onExtraCallbackWithResult.entrySet().iterator());
        }

        @Override // kotlin.collections.AbstractCollection
        public int getSize() {
            return this.onExtraCallbackWithResult.size();
        }
    }

    public Collection<V> access000() {
        if (this.onWarmupCompleted == null) {
            this.onWarmupCompleted = new onWarmupCompleted(this);
        }
        Collection<? extends V> collection = this.onWarmupCompleted;
        Intrinsics.checkNotNull(collection);
        return collection;
    }

    private final Map.Entry<K, V> onWarmupCompleted(K k) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Map.Entry) next).getKey(), k)) {
                break;
            }
        }
        return (Map.Entry) next;
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
