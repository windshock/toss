package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
final class getDeallocationBacktraceList implements Callable<Void>, deserializeUriNullableCollection {
    static final FutureTask<Void> IAuthTabCallback = new FutureTask<>(doubleExponent.onTransact, null);
    final Runnable IAuthTabCallbackDefault;
    Thread onNavigationEvent;
    final ExecutorService onWarmupCompleted;
    final AtomicReference<Future<?>> onExtraCallbackWithResult = new AtomicReference<>();
    final AtomicReference<Future<?>> onExtraCallback = new AtomicReference<>();

    getDeallocationBacktraceList(Runnable runnable, ExecutorService executorService) {
        this.IAuthTabCallbackDefault = runnable;
        this.onWarmupCompleted = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public Void call() throws Exception {
        this.onNavigationEvent = Thread.currentThread();
        try {
            this.IAuthTabCallbackDefault.run();
            IAuthTabCallback(this.onWarmupCompleted.submit(this));
            this.onNavigationEvent = null;
        } catch (Throwable th) {
            this.onNavigationEvent = null;
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
        return null;
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        AtomicReference<Future<?>> atomicReference = this.onExtraCallbackWithResult;
        FutureTask<Void> futureTask = IAuthTabCallback;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.onNavigationEvent != Thread.currentThread());
        }
        Future<?> andSet2 = this.onExtraCallback.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.onNavigationEvent != Thread.currentThread());
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this.onExtraCallbackWithResult.get() == IAuthTabCallback;
    }

    void onExtraCallback(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.onExtraCallbackWithResult.get();
            if (future2 == IAuthTabCallback) {
                future.cancel(this.onNavigationEvent != Thread.currentThread());
                return;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onExtraCallbackWithResult, future2, future));
    }

    void IAuthTabCallback(Future<?> future) {
        Future<?> future2;
        do {
            future2 = this.onExtraCallback.get();
            if (future2 == IAuthTabCallback) {
                future.cancel(this.onNavigationEvent != Thread.currentThread());
                return;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onExtraCallback, future2, future));
    }
}
