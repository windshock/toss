package o;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class getAddress extends AtomicReference<Future<?>> implements deserializeUriNullableCollection {
    protected static final FutureTask<Void> IAuthTabCallback;
    protected static final FutureTask<Void> onExtraCallbackWithResult;
    private static final long serialVersionUID = 1811839108042568751L;
    protected final Runnable runnable;
    protected Thread runner;

    static {
        Runnable runnable = doubleExponent.onTransact;
        IAuthTabCallback = new FutureTask<>(runnable, null);
        onExtraCallbackWithResult = new FutureTask<>(runnable, null);
    }

    getAddress(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // o.deserializeUriNullableCollection
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == IAuthTabCallback || future == (futureTask = onExtraCallbackWithResult) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.runner != Thread.currentThread());
    }

    @Override // o.deserializeUriNullableCollection
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == IAuthTabCallback || future == onExtraCallbackWithResult;
    }

    public final void onNavigationEvent(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == IAuthTabCallback) {
                return;
            }
            if (future2 == onExtraCallbackWithResult) {
                future.cancel(this.runner != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
