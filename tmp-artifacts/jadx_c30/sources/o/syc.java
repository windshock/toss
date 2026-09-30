package o;

import com.google.common.util.concurrent.Striped$SmallLazyStriped$;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.RangesKt;
import net.sf.scuba.smartcards.BuildConfig;
import o.syc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class syc<K, V> extends access6200<K, V> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater onExtraCallback = AtomicIntegerFieldUpdater.newUpdater(syc.class, "_size$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater onNavigationEvent = AtomicReferenceFieldUpdater.newUpdater(syc.class, Object.class, "core$volatile");
    private final ReferenceQueue<K> IAuthTabCallback;
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ Object core$volatile;

    public syc() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater asBinder() {
        return onNavigationEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object onExtraCallback(Object obj, Object obj2) {
        return obj;
    }

    public /* synthetic */ syc(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public syc(boolean z) {
        this.core$volatile = new onExtraCallback(16);
        this.IAuthTabCallback = z ? new ReferenceQueue<>() : null;
    }

    public int asInterface() {
        return onExtraCallback.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExtraCallbackWithResult() {
        onExtraCallback.decrementAndGet(this);
    }

    public V get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((onExtraCallback) onNavigationEvent.get(this)).onExtraCallbackWithResult(obj);
    }

    public V put(@NotNull K k, @NotNull V v) {
        V vOnNavigationEvent = (V) onExtraCallback.onExtraCallbackWithResult((onExtraCallback) onNavigationEvent.get(this), k, v, null, 4, null);
        if (vOnNavigationEvent == uh.onExtraCallbackWithResult) {
            vOnNavigationEvent = onNavigationEvent(k, v);
        }
        if (vOnNavigationEvent == null) {
            onExtraCallback.incrementAndGet(this);
        }
        return (V) vOnNavigationEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V remove(@Nullable Object obj) {
        if (obj == 0) {
            return null;
        }
        V vOnNavigationEvent = (V) onExtraCallback.onExtraCallbackWithResult((onExtraCallback) onNavigationEvent.get(this), obj, null, null, 4, null);
        if (vOnNavigationEvent == uh.onExtraCallbackWithResult) {
            vOnNavigationEvent = onNavigationEvent(obj, null);
        }
        if (vOnNavigationEvent != null) {
            onExtraCallback.decrementAndGet(this);
        }
        return (V) vOnNavigationEvent;
    }

    private final V onNavigationEvent(K k, V v) {
        V v2;
        synchronized (this) {
            onExtraCallback onExtraCallback2 = (onExtraCallback) onNavigationEvent.get(this);
            while (true) {
                v2 = (V) onExtraCallback.onExtraCallbackWithResult(onExtraCallback2, k, v, null, 4, null);
                if (v2 == uh.onExtraCallbackWithResult) {
                    onExtraCallback2 = onExtraCallback2.onExtraCallback();
                    onNavigationEvent.set(this, onExtraCallback2);
                }
            }
        }
        return v2;
    }

    public Set<K> onExtraCallback() {
        return (Set<K>) new onWarmupCompleted(new Function2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$$ExternalSyntheticLambda0
            public final Object invoke(Object obj, Object obj2) {
                return syc.onExtraCallback(obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry IAuthTabCallback(Object obj, Object obj2) {
        return new onNavigationEvent(obj, obj2);
    }

    public Set<Map.Entry<K, V>> onNavigationEvent() {
        return (Set<Map.Entry<K, V>>) new onWarmupCompleted(new Function2() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return syc.IAuthTabCallback(obj, obj2);
            }
        });
    }

    public void clear() {
        Iterator it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void IAuthTabCallback() {
        if (this.IAuthTabCallback == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> referenceRemove = this.IAuthTabCallback.remove();
                Intrinsics.checkNotNull(referenceRemove, BuildConfig.FLAVOR);
                onExtraCallback((ul) referenceRemove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    private final void onExtraCallback(ul<?> ulVar) {
        ((onExtraCallback) onNavigationEvent.get(this)).onNavigationEvent(ulVar);
    }

    final class onExtraCallback {
        private static final /* synthetic */ AtomicIntegerFieldUpdater onWarmupCompleted = AtomicIntegerFieldUpdater.newUpdater(onExtraCallback.class, "load$volatile");
        private final int IAuthTabCallback;
        private final int IAuthTabCallbackStub;
        private final /* synthetic */ AtomicReferenceArray asBinder;
        private volatile /* synthetic */ int load$volatile;
        private final int onExtraCallback;
        private final /* synthetic */ AtomicReferenceArray onNavigationEvent;

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray onExtraCallbackWithResult() {
            return this.asBinder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final /* synthetic */ AtomicReferenceArray onWarmupCompleted() {
            return this.onNavigationEvent;
        }

        public onExtraCallback(int i) {
            this.IAuthTabCallback = i;
            this.onExtraCallback = Integer.numberOfLeadingZeros(i) + 1;
            this.IAuthTabCallbackStub = (i << 1) / 3;
            this.onNavigationEvent = new AtomicReferenceArray(i);
            this.asBinder = new AtomicReferenceArray(i);
        }

        private final int onWarmupCompleted(int i) {
            return (i * (-1640531527)) >>> this.onExtraCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V onExtraCallbackWithResult(@NotNull K k) {
            int iOnWarmupCompleted = onWarmupCompleted(k.hashCode());
            while (true) {
                ul ulVar = (ul) onWarmupCompleted().get(iOnWarmupCompleted);
                if (ulVar == null) {
                    return null;
                }
                T t = ulVar.get();
                if (Intrinsics.areEqual(k, t)) {
                    V v = (V) onExtraCallbackWithResult().get(iOnWarmupCompleted);
                    return v instanceof tn ? (V) ((tn) v).onExtraCallback : v;
                }
                if (t == 0) {
                    IAuthTabCallback(iOnWarmupCompleted);
                }
                if (iOnWarmupCompleted == 0) {
                    iOnWarmupCompleted = this.IAuthTabCallback;
                }
                iOnWarmupCompleted--;
            }
        }

        private final void IAuthTabCallback(int i) {
            Object obj;
            do {
                obj = onExtraCallbackWithResult().get(i);
                if (obj == null || (obj instanceof tn)) {
                    return;
                }
            } while (!Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(onExtraCallbackWithResult(), i, obj, (Object) null));
            syc.this.onExtraCallbackWithResult();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object onExtraCallbackWithResult(onExtraCallback onextracallback, Object obj, Object obj2, ul ulVar, int i, Object obj3) {
            if ((i & 4) != 0) {
                ulVar = null;
            }
            return onextracallback.IAuthTabCallback(obj, obj2, ulVar);
        }

        public final Object IAuthTabCallback(@NotNull K k, @Nullable V v, @Nullable ul<K> ulVar) {
            int i;
            Object obj;
            int iOnWarmupCompleted = onWarmupCompleted(k.hashCode());
            boolean z = false;
            while (true) {
                ul ulVar2 = (ul) onWarmupCompleted().get(iOnWarmupCompleted);
                if (ulVar2 != null) {
                    T t = ulVar2.get();
                    if (!Intrinsics.areEqual(k, t)) {
                        if (t == 0) {
                            IAuthTabCallback(iOnWarmupCompleted);
                        }
                        if (iOnWarmupCompleted == 0) {
                            iOnWarmupCompleted = this.IAuthTabCallback;
                        }
                        iOnWarmupCompleted--;
                    } else if (z) {
                        onWarmupCompleted.decrementAndGet(this);
                    }
                } else if (v != null) {
                    if (!z) {
                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = onWarmupCompleted;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.IAuthTabCallbackStub) {
                                return uh.onExtraCallbackWithResult;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (ulVar == null) {
                        ulVar = new ul<>(k, ((syc) syc.this).IAuthTabCallback);
                    }
                    if (Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(onWarmupCompleted(), iOnWarmupCompleted, (Object) null, ulVar)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
            do {
                obj = onExtraCallbackWithResult().get(iOnWarmupCompleted);
                if (obj instanceof tn) {
                    return uh.onExtraCallbackWithResult;
                }
            } while (!Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(onExtraCallbackWithResult(), iOnWarmupCompleted, obj, v));
            return obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final syc<K, V>.onExtraCallback onExtraCallback() {
            int i;
            Object obj;
            while (true) {
                syc<K, V>.onExtraCallback onextracallback = (syc<K, V>.onExtraCallback) syc.this.new onExtraCallback(Integer.highestOneBit(RangesKt.coerceAtLeast(syc.this.size(), 4)) << 2);
                int i2 = this.IAuthTabCallback;
                while (i < i2) {
                    ul ulVar = (ul) onWarmupCompleted().get(i);
                    Object obj2 = ulVar != null ? ulVar.get() : null;
                    if (ulVar != null && obj2 == null) {
                        IAuthTabCallback(i);
                    }
                    while (true) {
                        obj = onExtraCallbackWithResult().get(i);
                        if (!(obj instanceof tn)) {
                            if (Striped$SmallLazyStriped$.ExternalSyntheticBackportWithForwarding0.onExtraCallbackWithResult(onExtraCallbackWithResult(), i, obj, uh.onWarmupCompleted(obj))) {
                                break;
                            }
                        } else {
                            obj = ((tn) obj).onExtraCallback;
                            break;
                        }
                    }
                    i = (obj2 == null || obj == null || onextracallback.IAuthTabCallback(obj2, obj, ulVar) != uh.onExtraCallbackWithResult) ? i + 1 : 0;
                }
                return onextracallback;
            }
        }

        public final void onNavigationEvent(@NotNull ul<?> ulVar) {
            int iOnWarmupCompleted = onWarmupCompleted(ulVar.onNavigationEvent);
            while (true) {
                ul<?> ulVar2 = (ul) onWarmupCompleted().get(iOnWarmupCompleted);
                if (ulVar2 == null) {
                    return;
                }
                if (ulVar2 == ulVar) {
                    IAuthTabCallback(iOnWarmupCompleted);
                    return;
                } else {
                    if (iOnWarmupCompleted == 0) {
                        iOnWarmupCompleted = this.IAuthTabCallback;
                    }
                    iOnWarmupCompleted--;
                }
            }
        }

        public final <E> Iterator<E> onWarmupCompleted(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            return new C0003onExtraCallback(function2);
        }

        /* renamed from: o.syc$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        final class C0003onExtraCallback<E> implements Iterator<E>, KMutableIterator {
            private int IAuthTabCallback = -1;
            private V onExtraCallback;
            private final Function2<K, V, E> onExtraCallbackWithResult;
            private K onNavigationEvent;

            /* JADX WARN: Multi-variable type inference failed */
            public C0003onExtraCallback(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
                this.onExtraCallbackWithResult = function2;
                onExtraCallbackWithResult();
            }

            private final void onExtraCallbackWithResult() {
                K k;
                while (true) {
                    int i = this.IAuthTabCallback + 1;
                    this.IAuthTabCallback = i;
                    if (i >= ((onExtraCallback) onExtraCallback.this).IAuthTabCallback) {
                        return;
                    }
                    ul ulVar = (ul) onExtraCallback.this.onWarmupCompleted().get(this.IAuthTabCallback);
                    if (ulVar != null && (k = (K) ulVar.get()) != null) {
                        this.onNavigationEvent = k;
                        Object obj = (V) onExtraCallback.this.onExtraCallbackWithResult().get(this.IAuthTabCallback);
                        if (obj instanceof tn) {
                            obj = (V) ((tn) obj).onExtraCallback;
                        }
                        if (obj != null) {
                            this.onExtraCallback = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.IAuthTabCallback < ((onExtraCallback) onExtraCallback.this).IAuthTabCallback;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.IAuthTabCallback >= ((onExtraCallback) onExtraCallback.this).IAuthTabCallback) {
                    throw new NoSuchElementException();
                }
                Function2<K, V, E> function2 = this.onExtraCallbackWithResult;
                Object obj = this.onNavigationEvent;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                    obj = Unit.INSTANCE;
                }
                Object obj2 = this.onExtraCallback;
                if (obj2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(BuildConfig.FLAVOR);
                    obj2 = Unit.INSTANCE;
                }
                E e = (E) function2.invoke(obj, obj2);
                onExtraCallbackWithResult();
                return e;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
            @Override // java.util.Iterator
            /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
            public Void remove() throws setWrite {
                uh.IAuthTabCallback();
                throw new setWrite();
            }
        }
    }

    static final class onNavigationEvent<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {
        private final K onExtraCallbackWithResult;
        private final V onNavigationEvent;

        public onNavigationEvent(K k, V v) {
            this.onExtraCallbackWithResult = k;
            this.onNavigationEvent = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.onExtraCallbackWithResult;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.onNavigationEvent;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        @Override // java.util.Map.Entry
        public V setValue(V v) throws setWrite {
            uh.IAuthTabCallback();
            throw new setWrite();
        }
    }

    final class onWarmupCompleted<E> extends access6800<E> {
        private final Function2<K, V, E> onExtraCallback;

        /* JADX WARN: Multi-variable type inference failed */
        public onWarmupCompleted(@NotNull Function2<? super K, ? super V, ? extends E> function2) {
            this.onExtraCallback = function2;
        }

        public int onExtraCallback() {
            return syc.this.size();
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: o.setWrite */
        public boolean add(E e) throws setWrite {
            uh.IAuthTabCallback();
            throw new setWrite();
        }

        public Iterator<E> iterator() {
            return ((onExtraCallback) syc.asBinder().get(syc.this)).onWarmupCompleted(this.onExtraCallback);
        }
    }
}
