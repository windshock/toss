package o;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiConsumer;
import o.lt55;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class lt55<T> extends CompletableFuture<T> {
    private static final AppSetIdAndScope1 onExtraCallback = ea10.onWarmupCompleted(lt55.class);

    lt55() {
    }

    public CompletableFuture<T> onNavigationEvent(long j, TimeUnit timeUnit) {
        return IAuthTabCallback(this, j, timeUnit);
    }

    public static <T> CompletableFuture<T> IAuthTabCallback(final CompletableFuture<T> completableFuture, final long j, final TimeUnit timeUnit) {
        if (j <= 0) {
            completableFuture.completeExceptionally(new TimeoutException("timeout is " + j + ", but must be > 0"));
        }
        final ScheduledFuture<?> scheduledFutureSchedule = onNavigationEvent.onExtraCallback.schedule(new Runnable() { // from class: org.xbill.DNS.TimeoutCompletableFuture$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                lt55.onExtraCallbackWithResult(completableFuture, timeUnit, j);
            }
        }, j, timeUnit);
        completableFuture.whenComplete((BiConsumer) new BiConsumer() { // from class: org.xbill.DNS.TimeoutCompletableFuture$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                lt55.onExtraCallback(scheduledFutureSchedule, obj, (Throwable) obj2);
            }
        });
        return completableFuture;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CompletableFuture completableFuture, TimeUnit timeUnit, long j) {
        if (completableFuture.isDone()) {
            return;
        }
        completableFuture.completeExceptionally(new TimeoutException("Timeout of " + timeUnit.toMillis(j) + "ms has elapsed before the task completed"));
    }

    public static /* synthetic */ void onExtraCallback(ScheduledFuture scheduledFuture, Object obj, Throwable th) {
        if (th != null || scheduledFuture.isDone()) {
            return;
        }
        scheduledFuture.cancel(false);
    }

    public static final class onNavigationEvent {
        private static final ScheduledThreadPoolExecutor onExtraCallback;

        static {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: org.xbill.DNS.TimeoutCompletableFuture$TimeoutScheduler$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return lt55.onNavigationEvent.onWarmupCompleted(runnable);
                }
            });
            onExtraCallback = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        }

        public static /* synthetic */ Thread onWarmupCompleted(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            thread.setName("dnsjava AsyncSemaphoreTimeoutScheduler");
            return thread;
        }
    }
}
