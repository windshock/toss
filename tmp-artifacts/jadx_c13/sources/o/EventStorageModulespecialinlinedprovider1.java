package o;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import o.EventStorageModule;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class EventStorageModulespecialinlinedprovider1<K, V> extends EventStorageModule<K, V, onNavigationEvent<K>> {
    private final boolean onExtraCallback;
    private final Thread onWarmupCompleted;
    private static final ThreadLocal<onNavigationEvent<?>> onNavigationEvent = new ThreadLocal<onNavigationEvent<?>>() { // from class: o.EventStorageModulespecialinlinedprovider1.3
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public onNavigationEvent<?> initialValue() {
            return new onNavigationEvent<>();
        }
    };
    private static final AtomicLong IAuthTabCallback = new AtomicLong();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.EventStorageModule
    public /* bridge */ /* synthetic */ Object IAuthTabCallback(Object obj) {
        return super.IAuthTabCallback(obj);
    }

    @Override // o.EventStorageModule, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.EventStorageModule
    public /* bridge */ /* synthetic */ Object onExtraCallbackWithResult(Object obj) {
        return super.onExtraCallbackWithResult(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.EventStorageModule
    public /* bridge */ /* synthetic */ Object onExtraCallbackWithResult(Object obj, Object obj2) {
        return super.onExtraCallbackWithResult(obj, obj2);
    }

    @Override // o.EventStorageModule
    public /* bridge */ /* synthetic */ void onExtraCallbackWithResult() {
        super.onExtraCallbackWithResult();
    }

    @Override // o.EventStorageModule, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    @Override // o.EventStorageModule
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public EventStorageModulespecialinlinedprovider1(boolean z) {
        this(z, onWarmupCompleted(onNavigationEvent.class.getClassLoader()));
    }

    private static boolean onWarmupCompleted(ClassLoader classLoader) {
        if (classLoader == null) {
            return true;
        }
        try {
            if (classLoader != ClassLoader.getSystemClassLoader()) {
                return classLoader == ClassLoader.getSystemClassLoader().getParent();
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public EventStorageModulespecialinlinedprovider1(boolean z, boolean z2) {
        this(z, z2, new ConcurrentHashMap());
    }

    public EventStorageModulespecialinlinedprovider1(boolean z, boolean z2, ConcurrentMap<EventStorageModule.onWarmupCompleted<K>, V> concurrentMap) {
        super(concurrentMap);
        this.onExtraCallback = z2;
        if (z) {
            Thread thread = new Thread(this);
            this.onWarmupCompleted = thread;
            thread.setName("weak-ref-cleaner-" + IAuthTabCallback.getAndIncrement());
            thread.setPriority(1);
            thread.setDaemon(true);
            thread.start();
            return;
        }
        this.onWarmupCompleted = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.EventStorageModule
    /* renamed from: asBinder, reason: merged with bridge method [inline-methods] */
    public onNavigationEvent<K> onExtraCallback(K k) {
        onNavigationEvent<?> onnavigationevent;
        if (this.onExtraCallback) {
            onnavigationevent = onNavigationEvent.get();
        } else {
            onnavigationevent = new onNavigationEvent<>();
        }
        return onnavigationevent.onExtraCallbackWithResult(k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.EventStorageModule
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(onNavigationEvent<K> onnavigationevent) {
        onnavigationevent.onExtraCallback();
    }

    static final class onNavigationEvent<K> {
        private K onExtraCallbackWithResult;
        private int onNavigationEvent;

        onNavigationEvent() {
        }

        onNavigationEvent<K> onExtraCallbackWithResult(K k) {
            this.onExtraCallbackWithResult = k;
            this.onNavigationEvent = System.identityHashCode(k);
            return this;
        }

        void onExtraCallback() {
            this.onExtraCallbackWithResult = null;
            this.onNavigationEvent = 0;
        }

        public boolean equals(Object obj) {
            return obj instanceof onNavigationEvent ? ((onNavigationEvent) obj).onExtraCallbackWithResult == this.onExtraCallbackWithResult : ((EventStorageModule.onWarmupCompleted) obj).get() == this.onExtraCallbackWithResult;
        }

        public int hashCode() {
            return this.onNavigationEvent;
        }
    }
}
