package o;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGRewardFullExpressAdListenerProxy3<I, O> implements triggerUnfinishedFail<I, O> {
    private final ConcurrentMap<I, Future<O>> IAuthTabCallback;
    private final triggerUnfinishedFail<I, O> onExtraCallback;
    private final boolean onNavigationEvent;

    @Override // o.triggerUnfinishedFail
    public O onExtraCallbackWithResult(final I i) throws InterruptedException {
        FutureTask futureTask;
        while (true) {
            Future<O> futurePutIfAbsent = this.IAuthTabCallback.get(i);
            if (futurePutIfAbsent == null && (futurePutIfAbsent = this.IAuthTabCallback.putIfAbsent(i, (futureTask = new FutureTask(new Callable() { // from class: org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.onExtraCallback.onExtraCallbackWithResult(i);
                }
            })))) == null) {
                futureTask.run();
                futurePutIfAbsent = futureTask;
            }
            try {
                continue;
                return futurePutIfAbsent.get();
            } catch (CancellationException unused) {
                this.IAuthTabCallback.remove(i, futurePutIfAbsent);
            } catch (ExecutionException e) {
                if (this.onNavigationEvent) {
                    this.IAuthTabCallback.remove(i, futurePutIfAbsent);
                }
                throw onExtraCallback(e.getCause());
            }
        }
    }

    private RuntimeException onExtraCallback(Throwable th) {
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IllegalStateException("Unchecked exception", th);
    }
}
