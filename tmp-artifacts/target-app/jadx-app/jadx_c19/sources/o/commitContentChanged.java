package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class commitContentChanged<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final int IAuthTabCallback;
    static final int onExtraCallback;
    static final int onNavigationEvent;
    static final long serialVersionUID = 1;
    transient Collection<V> asInterface;
    final AtomicLong capacity;
    final int concurrencyLevel;
    final ConcurrentMap<K, onTransact<K, V>> data;
    final AtomicReference<onNavigationEvent> drainStatus;
    final abandon<onTransact<K, V>> evictionDeque;
    final Lock evictionLock;
    transient Set<K> onExtraCallbackWithResult;
    transient Set<Map.Entry<K, V>> onWarmupCompleted;
    final AtomicLongArray readBufferDrainAtWriteCount;
    final long[] readBufferReadCount;
    final AtomicLongArray readBufferWriteCount;
    final AtomicReferenceArray<onTransact<K, V>> readBuffers;
    final AtomicLong weightedSize;
    final Queue<Runnable> writeBuffer;

    enum onNavigationEvent {
        IDLE { // from class: o.commitContentChanged.onNavigationEvent.2
            @Override // o.commitContentChanged.onNavigationEvent
            boolean shouldDrainBuffers(boolean z) {
                return !z;
            }
        },
        REQUIRED { // from class: o.commitContentChanged.onNavigationEvent.5
            @Override // o.commitContentChanged.onNavigationEvent
            boolean shouldDrainBuffers(boolean z) {
                return true;
            }
        },
        PROCESSING { // from class: o.commitContentChanged.onNavigationEvent.3
            @Override // o.commitContentChanged.onNavigationEvent
            boolean shouldDrainBuffers(boolean z) {
                return false;
            }
        };

        abstract boolean shouldDrainBuffers(boolean z);
    }

    private static int onNavigationEvent(int i2, int i3) {
        return (i2 << 4) + i3;
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        onExtraCallback = iAvailableProcessors;
        int iMin = Math.min(4, onExtraCallback(iAvailableProcessors));
        onNavigationEvent = iMin;
        IAuthTabCallback = iMin - 1;
    }

    static int onExtraCallback(int i2) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i2 - 1));
    }

    commitContentChanged(onExtraCallback<K, V> onextracallback) {
        int i2 = onextracallback.onNavigationEvent;
        this.concurrencyLevel = i2;
        this.capacity = new AtomicLong(Math.min(onextracallback.IAuthTabCallback, 9223372034707292160L));
        this.data = new ConcurrentHashMap(onextracallback.onExtraCallbackWithResult, 0.75f, i2);
        this.evictionLock = new ReentrantLock();
        this.weightedSize = new AtomicLong();
        this.evictionDeque = new abandon<>();
        this.writeBuffer = new ConcurrentLinkedQueue();
        this.drainStatus = new AtomicReference<>(onNavigationEvent.IDLE);
        int i3 = onNavigationEvent;
        this.readBufferReadCount = new long[i3];
        this.readBufferWriteCount = new AtomicLongArray(i3);
        this.readBufferDrainAtWriteCount = new AtomicLongArray(i3);
        this.readBuffers = new AtomicReferenceArray<>(i3 << 4);
    }

    static void onNavigationEvent(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    static void onWarmupCompleted(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    boolean IAuthTabCallbackDefault() {
        return this.weightedSize.get() > this.capacity.get();
    }

    void IAuthTabCallback() {
        onTransact<K, V> ontransact;
        while (IAuthTabCallbackDefault() && (ontransact = (onTransact) this.evictionDeque.poll()) != null) {
            this.data.remove(ontransact.key, ontransact);
            IAuthTabCallback(ontransact);
        }
    }

    void onExtraCallbackWithResult(onTransact<K, V> ontransact) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        onNavigationEvent(iOnExtraCallbackWithResult, onWarmupCompleted(iOnExtraCallbackWithResult, ontransact));
    }

    static int onExtraCallbackWithResult() {
        return ((int) Thread.currentThread().getId()) & IAuthTabCallback;
    }

    long onWarmupCompleted(int i2, onTransact<K, V> ontransact) {
        long j = this.readBufferWriteCount.get(i2);
        this.readBufferWriteCount.lazySet(i2, serialVersionUID + j);
        this.readBuffers.lazySet(onNavigationEvent(i2, (int) (15 & j)), ontransact);
        return j;
    }

    void onNavigationEvent(int i2, long j) {
        if (this.drainStatus.get().shouldDrainBuffers(j - this.readBufferDrainAtWriteCount.get(i2) < 4)) {
            asBinder();
        }
    }

    void IAuthTabCallback(Runnable runnable) {
        this.writeBuffer.add(runnable);
        this.drainStatus.lazySet(onNavigationEvent.REQUIRED);
        asBinder();
    }

    void asBinder() {
        if (this.evictionLock.tryLock()) {
            try {
                AtomicReference<onNavigationEvent> atomicReference = this.drainStatus;
                onNavigationEvent onnavigationevent = onNavigationEvent.PROCESSING;
                atomicReference.lazySet(onnavigationevent);
                onWarmupCompleted();
                setSupportImageTintList.onNavigationEvent(this.drainStatus, onnavigationevent, onNavigationEvent.IDLE);
                this.evictionLock.unlock();
            } catch (Throwable th) {
                setSupportImageTintList.onNavigationEvent(this.drainStatus, onNavigationEvent.PROCESSING, onNavigationEvent.IDLE);
                this.evictionLock.unlock();
                throw th;
            }
        }
    }

    void onWarmupCompleted() {
        onExtraCallback();
        onNavigationEvent();
    }

    void onExtraCallback() {
        int id = (int) Thread.currentThread().getId();
        int i2 = onNavigationEvent;
        for (int i3 = id; i3 < i2 + id; i3++) {
            onExtraCallbackWithResult(IAuthTabCallback & i3);
        }
    }

    void onExtraCallbackWithResult(int i2) {
        int iOnNavigationEvent;
        onTransact<K, V> ontransact;
        long j = this.readBufferWriteCount.get(i2);
        for (int i3 = 0; i3 < 8 && (ontransact = this.readBuffers.get((iOnNavigationEvent = onNavigationEvent(i2, (int) (this.readBufferReadCount[i2] & 15))))) != null; i3++) {
            this.readBuffers.lazySet(iOnNavigationEvent, null);
            onWarmupCompleted(ontransact);
            long[] jArr = this.readBufferReadCount;
            jArr[i2] = jArr[i2] + serialVersionUID;
        }
        this.readBufferDrainAtWriteCount.lazySet(i2, j);
    }

    void onWarmupCompleted(onTransact<K, V> ontransact) {
        if (this.evictionDeque.onExtraCallback(ontransact)) {
            this.evictionDeque.asBinder(ontransact);
        }
    }

    void onNavigationEvent() {
        Runnable runnablePoll;
        for (int i2 = 0; i2 < 16 && (runnablePoll = this.writeBuffer.poll()) != null; i2++) {
            runnablePoll.run();
        }
    }

    boolean onNavigationEvent(onTransact<K, V> ontransact, access000<V> access000Var) {
        if (access000Var.onWarmupCompleted()) {
            return ontransact.compareAndSet(access000Var, new access000(access000Var.onWarmupCompleted, -access000Var.onExtraCallbackWithResult));
        }
        return false;
    }

    void onExtraCallback(onTransact<K, V> ontransact) {
        access000 access000Var;
        do {
            access000Var = (access000) ontransact.get();
            if (!access000Var.onWarmupCompleted()) {
                return;
            }
        } while (!ontransact.compareAndSet(access000Var, new access000(access000Var.onWarmupCompleted, -access000Var.onExtraCallbackWithResult)));
    }

    void IAuthTabCallback(onTransact<K, V> ontransact) {
        access000 access000Var;
        do {
            access000Var = (access000) ontransact.get();
        } while (!ontransact.compareAndSet(access000Var, new access000(access000Var.onWarmupCompleted, 0)));
        AtomicLong atomicLong = this.weightedSize;
        atomicLong.lazySet(atomicLong.get() - Math.abs(access000Var.onExtraCallbackWithResult));
    }

    final class onExtraCallbackWithResult implements Runnable {
        final onTransact<K, V> IAuthTabCallback;
        final int onWarmupCompleted;

        onExtraCallbackWithResult(onTransact<K, V> ontransact, int i2) {
            this.onWarmupCompleted = i2;
            this.IAuthTabCallback = ontransact;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = commitContentChanged.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.onWarmupCompleted);
            if (((access000) this.IAuthTabCallback.get()).onWarmupCompleted()) {
                commitContentChanged.this.evictionDeque.add(this.IAuthTabCallback);
                commitContentChanged.this.IAuthTabCallback();
            }
        }
    }

    final class IAuthTabCallbackDefault implements Runnable {
        final onTransact<K, V> IAuthTabCallback;

        IAuthTabCallbackDefault(onTransact<K, V> ontransact) {
            this.IAuthTabCallback = ontransact;
        }

        @Override // java.lang.Runnable
        public void run() {
            commitContentChanged.this.evictionDeque.IAuthTabCallback_Parcel(this.IAuthTabCallback);
            commitContentChanged.this.IAuthTabCallback(this.IAuthTabCallback);
        }
    }

    final class IAuthTabCallback_Parcel implements Runnable {
        final onTransact<K, V> onExtraCallback;
        final int onNavigationEvent;

        IAuthTabCallback_Parcel(onTransact<K, V> ontransact, int i2) {
            this.onNavigationEvent = i2;
            this.onExtraCallback = ontransact;
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicLong atomicLong = commitContentChanged.this.weightedSize;
            atomicLong.lazySet(atomicLong.get() + this.onNavigationEvent);
            commitContentChanged.this.onWarmupCompleted(this.onExtraCallback);
            commitContentChanged.this.IAuthTabCallback();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.data.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.evictionLock.lock();
        while (true) {
            try {
                onTransact<K, V> ontransact = (onTransact) this.evictionDeque.poll();
                if (ontransact == null) {
                    break;
                }
                this.data.remove(ontransact.key, ontransact);
                IAuthTabCallback(ontransact);
            } finally {
                this.evictionLock.unlock();
            }
        }
        for (int i2 = 0; i2 < this.readBuffers.length(); i2++) {
            this.readBuffers.lazySet(i2, null);
        }
        while (true) {
            Runnable runnablePoll = this.writeBuffer.poll();
            if (runnablePoll == null) {
                return;
            } else {
                runnablePoll.run();
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.data.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Iterator<onTransact<K, V>> it = this.data.values().iterator();
        while (it.hasNext()) {
            if (it.next().onNavigationEvent().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        onTransact<K, V> ontransact = this.data.get(obj);
        if (ontransact == null) {
            return null;
        }
        onExtraCallbackWithResult(ontransact);
        return ontransact.onNavigationEvent();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        return IAuthTabCallback(k, v, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V putIfAbsent(K k, V v) {
        return IAuthTabCallback(k, v, true);
    }

    V IAuthTabCallback(K k, V v, boolean z) {
        access000 access000Var;
        access000 access000Var2 = new access000(v, 1);
        onTransact<K, V> ontransact = new onTransact<>(k, access000Var2);
        while (true) {
            onTransact<K, V> ontransactPutIfAbsent = this.data.putIfAbsent(ontransact.key, ontransact);
            if (ontransactPutIfAbsent == null) {
                IAuthTabCallback(new onExtraCallbackWithResult(ontransact, 1));
                return null;
            }
            if (z) {
                onExtraCallbackWithResult(ontransactPutIfAbsent);
                return ontransactPutIfAbsent.onNavigationEvent();
            }
            do {
                access000Var = (access000) ontransactPutIfAbsent.get();
                if (access000Var.onWarmupCompleted()) {
                }
            } while (!ontransactPutIfAbsent.compareAndSet(access000Var, access000Var2));
            int i2 = 1 - access000Var.onExtraCallbackWithResult;
            if (i2 == 0) {
                onExtraCallbackWithResult(ontransactPutIfAbsent);
            } else {
                IAuthTabCallback(new IAuthTabCallback_Parcel(ontransactPutIfAbsent, i2));
            }
            return access000Var.onWarmupCompleted;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        onTransact<K, V> ontransactRemove = this.data.remove(obj);
        if (ontransactRemove == null) {
            return null;
        }
        onExtraCallback(ontransactRemove);
        IAuthTabCallback(new IAuthTabCallbackDefault(ontransactRemove));
        return ontransactRemove.onNavigationEvent();
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean remove(Object obj, Object obj2) {
        onTransact<K, V> ontransact = this.data.get(obj);
        if (ontransact == null || obj2 == null) {
            return false;
        }
        access000<V> access000Var = (access000) ontransact.get();
        while (access000Var.onExtraCallback(obj2)) {
            if (onNavigationEvent(ontransact, access000Var)) {
                if (!this.data.remove(obj, ontransact)) {
                    return false;
                }
                IAuthTabCallback(new IAuthTabCallbackDefault(ontransact));
                return true;
            }
            access000Var = (access000) ontransact.get();
            if (!access000Var.onWarmupCompleted()) {
                return false;
            }
        }
        return false;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public V replace(K k, V v) {
        access000 access000Var;
        access000 access000Var2 = new access000(v, 1);
        onTransact<K, V> ontransact = this.data.get(k);
        if (ontransact == null) {
            return null;
        }
        do {
            access000Var = (access000) ontransact.get();
            if (!access000Var.onWarmupCompleted()) {
                return null;
            }
        } while (!ontransact.compareAndSet(access000Var, access000Var2));
        int i2 = 1 - access000Var.onExtraCallbackWithResult;
        if (i2 == 0) {
            onExtraCallbackWithResult(ontransact);
        } else {
            IAuthTabCallback(new IAuthTabCallback_Parcel(ontransact, i2));
        }
        return access000Var.onWarmupCompleted;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public boolean replace(K k, V v, V v2) {
        access000 access000Var;
        access000 access000Var2 = new access000(v2, 1);
        onTransact<K, V> ontransact = this.data.get(k);
        if (ontransact == null) {
            return false;
        }
        do {
            access000Var = (access000) ontransact.get();
            if (!access000Var.onWarmupCompleted() || !access000Var.onExtraCallback(v)) {
                return false;
            }
        } while (!ontransact.compareAndSet(access000Var, access000Var2));
        int i2 = 1 - access000Var.onExtraCallbackWithResult;
        if (i2 == 0) {
            onExtraCallbackWithResult(ontransact);
        } else {
            IAuthTabCallback(new IAuthTabCallback_Parcel(ontransact, i2));
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.onExtraCallbackWithResult;
        if (set != null) {
            return set;
        }
        asInterface asinterface = new asInterface();
        this.onExtraCallbackWithResult = asinterface;
        return asinterface;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.asInterface;
        if (collection != null) {
            return collection;
        }
        getInterfaceDescriptor getinterfacedescriptor = new getInterfaceDescriptor();
        this.asInterface = getinterfacedescriptor;
        return getinterfacedescriptor;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.onWarmupCompleted;
        if (set != null) {
            return set;
        }
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted();
        this.onWarmupCompleted = onwarmupcompleted;
        return onwarmupcompleted;
    }

    static final class access000<V> {
        final int onExtraCallbackWithResult;
        final V onWarmupCompleted;

        access000(V v, int i2) {
            this.onExtraCallbackWithResult = i2;
            this.onWarmupCompleted = v;
        }

        boolean onExtraCallback(Object obj) {
            V v = this.onWarmupCompleted;
            return obj == v || v.equals(obj);
        }

        boolean onWarmupCompleted() {
            return this.onExtraCallbackWithResult > 0;
        }
    }

    static final class onTransact<K, V> extends AtomicReference<access000<V>> implements Loader<onTransact<K, V>> {
        final K key;
        onTransact<K, V> next;
        onTransact<K, V> prev;

        onTransact(K k, access000<V> access000Var) {
            super(access000Var);
            this.key = k;
        }

        @Override // o.Loader
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public onTransact<K, V> onExtraCallback() {
            return this.prev;
        }

        @Override // o.Loader
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public void onNavigationEvent(onTransact<K, V> ontransact) {
            this.prev = ontransact;
        }

        @Override // o.Loader
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public onTransact<K, V> IAuthTabCallback() {
            return this.next;
        }

        @Override // o.Loader
        public void onExtraCallback(onTransact<K, V> ontransact) {
            this.next = ontransact;
        }

        V onNavigationEvent() {
            return ((access000) get()).onWarmupCompleted;
        }
    }

    final class asInterface extends AbstractSet<K> {
        final commitContentChanged<K, V> onExtraCallbackWithResult;

        asInterface() {
            this.onExtraCallbackWithResult = commitContentChanged.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.onExtraCallbackWithResult.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.onExtraCallbackWithResult.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new asBinder();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return commitContentChanged.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return this.onExtraCallbackWithResult.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return this.onExtraCallbackWithResult.data.keySet().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) this.onExtraCallbackWithResult.data.keySet().toArray(tArr);
        }
    }

    final class asBinder implements Iterator<K> {
        final Iterator<K> IAuthTabCallback;
        K onExtraCallbackWithResult;

        asBinder() {
            this.IAuthTabCallback = commitContentChanged.this.data.keySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.IAuthTabCallback.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            K next = this.IAuthTabCallback.next();
            this.onExtraCallbackWithResult = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            commitContentChanged.onWarmupCompleted(this.onExtraCallbackWithResult != null);
            commitContentChanged.this.remove(this.onExtraCallbackWithResult);
            this.onExtraCallbackWithResult = null;
        }
    }

    final class getInterfaceDescriptor extends AbstractCollection<V> {
        getInterfaceDescriptor() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return commitContentChanged.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            commitContentChanged.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new access100();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return commitContentChanged.this.containsValue(obj);
        }
    }

    final class access100 implements Iterator<V> {
        onTransact<K, V> onExtraCallbackWithResult;
        final Iterator<onTransact<K, V>> onNavigationEvent;

        access100() {
            this.onNavigationEvent = commitContentChanged.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onNavigationEvent.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            onTransact<K, V> next = this.onNavigationEvent.next();
            this.onExtraCallbackWithResult = next;
            return next.onNavigationEvent();
        }

        @Override // java.util.Iterator
        public void remove() {
            commitContentChanged.onWarmupCompleted(this.onExtraCallbackWithResult != null);
            commitContentChanged.this.remove(this.onExtraCallbackWithResult.key);
            this.onExtraCallbackWithResult = null;
        }
    }

    final class onWarmupCompleted extends AbstractSet<Map.Entry<K, V>> {
        final commitContentChanged<K, V> onExtraCallback;

        onWarmupCompleted() {
            this.onExtraCallback = commitContentChanged.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.onExtraCallback.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.onExtraCallback.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new IAuthTabCallback();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            onTransact<K, V> ontransact = this.onExtraCallback.data.get(entry.getKey());
            return ontransact != null && ontransact.onNavigationEvent().equals(entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.onExtraCallback.remove(entry.getKey(), entry.getValue());
        }
    }

    final class IAuthTabCallback implements Iterator<Map.Entry<K, V>> {
        final Iterator<onTransact<K, V>> onExtraCallbackWithResult;
        onTransact<K, V> onWarmupCompleted;

        IAuthTabCallback() {
            this.onExtraCallbackWithResult = commitContentChanged.this.data.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.onExtraCallbackWithResult.hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.onWarmupCompleted = this.onExtraCallbackWithResult.next();
            return new IAuthTabCallbackStubProxy(this.onWarmupCompleted);
        }

        @Override // java.util.Iterator
        public void remove() {
            commitContentChanged.onWarmupCompleted(this.onWarmupCompleted != null);
            commitContentChanged.this.remove(this.onWarmupCompleted.key);
            this.onWarmupCompleted = null;
        }
    }

    final class IAuthTabCallbackStubProxy extends AbstractMap.SimpleEntry<K, V> {
        static final long serialVersionUID = 1;

        IAuthTabCallbackStubProxy(onTransact<K, V> ontransact) {
            super(ontransact.key, ontransact.onNavigationEvent());
        }

        @Override // java.util.AbstractMap.SimpleEntry, java.util.Map.Entry
        public V setValue(V v) {
            commitContentChanged.this.put(getKey(), v);
            return (V) super.setValue(v);
        }

        Object writeReplace() {
            return new AbstractMap.SimpleEntry(this);
        }
    }

    Object writeReplace() {
        return new IAuthTabCallbackStub(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

    public static final class onExtraCallback<K, V> {
        long IAuthTabCallback = -1;
        int onExtraCallbackWithResult = 16;
        int onNavigationEvent = 16;

        public onExtraCallback<K, V> onNavigationEvent(int i2) {
            commitContentChanged.onNavigationEvent(i2 >= 0);
            this.onExtraCallbackWithResult = i2;
            return this;
        }

        public onExtraCallback<K, V> onExtraCallbackWithResult(long j) {
            commitContentChanged.onNavigationEvent(j >= 0);
            this.IAuthTabCallback = j;
            return this;
        }

        public onExtraCallback<K, V> onExtraCallbackWithResult(int i2) {
            commitContentChanged.onNavigationEvent(i2 > 0);
            this.onNavigationEvent = i2;
            return this;
        }

        public commitContentChanged<K, V> onNavigationEvent() {
            commitContentChanged.onWarmupCompleted(this.IAuthTabCallback >= 0);
            return new commitContentChanged<>(this);
        }
    }
}
