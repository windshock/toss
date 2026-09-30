package o;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class EventStorageModule<K, V, L> extends ReferenceQueue<K> implements Runnable, Iterable<Map.Entry<K, V>> {
    final ConcurrentMap<onWarmupCompleted<K>, V> onExtraCallbackWithResult;

    protected abstract L onExtraCallback(K k);

    protected abstract void onNavigationEvent(L l);

    protected V onWarmupCompleted(K k) {
        return null;
    }

    protected EventStorageModule() {
        this(new ConcurrentHashMap());
    }

    protected EventStorageModule(ConcurrentMap<onWarmupCompleted<K>, V> concurrentMap) {
        this.onExtraCallbackWithResult = concurrentMap;
    }

    public V onExtraCallbackWithResult(K k) {
        V vPutIfAbsent;
        L lOnExtraCallback = onExtraCallback(k);
        try {
            V v = this.onExtraCallbackWithResult.get(lOnExtraCallback);
            if (v != null) {
                return v;
            }
            V vOnWarmupCompleted = onWarmupCompleted(k);
            return (vOnWarmupCompleted == null || (vPutIfAbsent = this.onExtraCallbackWithResult.putIfAbsent(new onWarmupCompleted<>(k, this), vOnWarmupCompleted)) == null) ? vOnWarmupCompleted : vPutIfAbsent;
        } finally {
            onNavigationEvent(lOnExtraCallback);
        }
    }

    public V onExtraCallbackWithResult(K k, V v) {
        if (k == null || v == null) {
            throw null;
        }
        return this.onExtraCallbackWithResult.put(new onWarmupCompleted<>(k, this), v);
    }

    public V IAuthTabCallback(K k) {
        L lOnExtraCallback = onExtraCallback(k);
        try {
            return this.onExtraCallbackWithResult.remove(lOnExtraCallback);
        } finally {
            onNavigationEvent(lOnExtraCallback);
        }
    }

    public void onExtraCallbackWithResult() {
        while (true) {
            Reference<? extends K> referencePoll = poll();
            if (referencePoll == null) {
                return;
            } else {
                this.onExtraCallbackWithResult.remove(referencePoll);
            }
        }
    }

    public void run() {
        while (!Thread.interrupted()) {
            try {
                this.onExtraCallbackWithResult.remove(remove());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new onExtraCallback(this.onExtraCallbackWithResult.entrySet().iterator());
    }

    public String toString() {
        return this.onExtraCallbackWithResult.toString();
    }

    public static final class onWarmupCompleted<K> extends WeakReference<K> {
        private final int IAuthTabCallback;

        onWarmupCompleted(K k, ReferenceQueue<? super K> referenceQueue) {
            super(k, referenceQueue);
            this.IAuthTabCallback = System.identityHashCode(k);
        }

        public int hashCode() {
            return this.IAuthTabCallback;
        }

        public boolean equals(Object obj) {
            if (obj instanceof onWarmupCompleted) {
                return ((onWarmupCompleted) obj).get() == get();
            }
            return obj.equals(this);
        }

        public String toString() {
            return String.valueOf(get());
        }
    }

    class onExtraCallback implements Iterator<Map.Entry<K, V>> {
        private final Iterator<Map.Entry<onWarmupCompleted<K>, V>> IAuthTabCallback;
        private Map.Entry<onWarmupCompleted<K>, V> onExtraCallback;
        private K onExtraCallbackWithResult;

        private onExtraCallback(Iterator<Map.Entry<onWarmupCompleted<K>, V>> it) {
            this.IAuthTabCallback = it;
            onExtraCallbackWithResult();
        }

        private void onExtraCallbackWithResult() {
            while (this.IAuthTabCallback.hasNext()) {
                Map.Entry<onWarmupCompleted<K>, V> next = this.IAuthTabCallback.next();
                this.onExtraCallback = next;
                K k = next.getKey().get();
                this.onExtraCallbackWithResult = k;
                if (k != null) {
                    return;
                }
            }
            this.onExtraCallback = null;
            this.onExtraCallbackWithResult = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallbackWithResult != null;
        }

        @Override // java.util.Iterator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            K k = this.onExtraCallbackWithResult;
            if (k == null) {
                throw new NoSuchElementException();
            }
            try {
                return new onExtraCallbackWithResult(k, this.onExtraCallback);
            } finally {
                onExtraCallbackWithResult();
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class onExtraCallbackWithResult implements Map.Entry<K, V> {
        private final K IAuthTabCallback;
        final Map.Entry<onWarmupCompleted<K>, V> onWarmupCompleted;

        private onExtraCallbackWithResult(K k, Map.Entry<onWarmupCompleted<K>, V> entry) {
            this.IAuthTabCallback = k;
            this.onWarmupCompleted = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.IAuthTabCallback;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.onWarmupCompleted.getValue();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            return this.onWarmupCompleted.setValue(v);
        }
    }
}
