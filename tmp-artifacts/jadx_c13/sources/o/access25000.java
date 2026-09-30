package o;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access25000 extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, deserializeUriNullableCollection {
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;
    static final Object onWarmupCompleted = new Object();
    static final Object onNavigationEvent = new Object();
    static final Object onExtraCallbackWithResult = new Object();
    static final Object onExtraCallback = new Object();

    public access25000(Runnable runnable, deserializeLongArray deserializelongarray) {
        super(3);
        this.actual = runnable;
        lazySet(0, deserializelongarray);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean zCompareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != onWarmupCompleted) {
                    ((deserializeLongArray) obj4).IAuthTabCallback(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 != onNavigationEvent) {
                        return;
                    } else {
                        return;
                    }
                } while (!compareAndSet(1, obj5, onExtraCallback));
            } catch (Throwable th) {
                do {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    }
                } while (!zCompareAndSet);
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != onWarmupCompleted && compareAndSet(0, obj4, onExtraCallback) && obj4 != null) {
            ((deserializeLongArray) obj4).IAuthTabCallback(this);
        }
        do {
            obj5 = get(1);
            if (obj5 != onNavigationEvent || obj5 == onExtraCallbackWithResult) {
                return;
            }
        } while (!compareAndSet(1, obj5, onExtraCallback));
    }

    public void onWarmupCompleted(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == onExtraCallback) {
                return;
            }
            if (obj == onNavigationEvent) {
                future.cancel(false);
                return;
            } else if (obj == onExtraCallbackWithResult) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == onExtraCallback || obj5 == (obj3 = onNavigationEvent) || obj5 == (obj4 = onExtraCallbackWithResult)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == onExtraCallback || obj == (obj2 = onWarmupCompleted) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((deserializeLongArray) obj).IAuthTabCallback(this);
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == onWarmupCompleted || obj == onExtraCallback;
    }
}
