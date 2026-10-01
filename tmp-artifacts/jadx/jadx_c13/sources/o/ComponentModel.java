package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ResumeUndispatchedRunnable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ComponentModel extends ComponentModela implements BufferOutputStream {
    private final Executor onExtraCallback;

    public ComponentModel(@NotNull Executor executor) {
        this.onExtraCallback = executor;
        getShowDividerVertical.onExtraCallbackWithResult(onExtraCallbackWithResult());
    }

    @Override // o.ComponentModela
    public Executor onExtraCallbackWithResult() {
        return this.onExtraCallback;
    }

    @Override // o.GeckoHubImp
    public void onWarmupCompleted(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableIAuthTabCallback;
        try {
            Executor executorOnExtraCallbackWithResult = onExtraCallbackWithResult();
            ResourceDecoderRegistryEntry resourceDecoderRegistryEntry = ResourceEncoderRegistryEntry.IAuthTabCallback;
            if (resourceDecoderRegistryEntry == null || (runnableIAuthTabCallback = resourceDecoderRegistryEntry.IAuthTabCallback(runnable)) == null) {
                runnableIAuthTabCallback = runnable;
            }
            executorOnExtraCallbackWithResult.execute(runnableIAuthTabCallback);
        } catch (RejectedExecutionException e) {
            onWarmupCompleted(coroutineContext, e);
            putChannelInfo.IAuthTabCallback().onWarmupCompleted(coroutineContext, runnable);
        }
    }

    @Override // o.BufferOutputStream
    public void onWarmupCompleted(long j, @NotNull maybeRemoveAttachStateListener<? super Unit> mayberemoveattachstatelistener) {
        Executor executorOnExtraCallbackWithResult = onExtraCallbackWithResult();
        ScheduledExecutorService scheduledExecutorService = executorOnExtraCallbackWithResult instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorOnExtraCallbackWithResult : null;
        ScheduledFuture<?> scheduledFutureOnExtraCallbackWithResult = scheduledExecutorService != null ? onExtraCallbackWithResult(scheduledExecutorService, new ResumeUndispatchedRunnable(this, mayberemoveattachstatelistener), mayberemoveattachstatelistener.getContext(), j) : null;
        if (scheduledFutureOnExtraCallbackWithResult != null) {
            maybeAddAttachStateListener.IAuthTabCallback(mayberemoveattachstatelistener, new setResource(scheduledFutureOnExtraCallbackWithResult));
        } else {
            GeckoHubImpa.onExtraCallback.onWarmupCompleted(j, mayberemoveattachstatelistener);
        }
    }

    @Override // o.BufferOutputStream
    public setDeployments onWarmupCompleted(long j, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        Executor executorOnExtraCallbackWithResult = onExtraCallbackWithResult();
        ScheduledExecutorService scheduledExecutorService = executorOnExtraCallbackWithResult instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorOnExtraCallbackWithResult : null;
        ScheduledFuture<?> scheduledFutureOnExtraCallbackWithResult = scheduledExecutorService != null ? onExtraCallbackWithResult(scheduledExecutorService, runnable, coroutineContext, j) : null;
        if (scheduledFutureOnExtraCallbackWithResult != null) {
            return new setCustom(scheduledFutureOnExtraCallbackWithResult);
        }
        return GeckoHubImpa.onExtraCallback.onWarmupCompleted(j, runnable, coroutineContext);
    }

    private final ScheduledFuture<?> onExtraCallbackWithResult(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            onWarmupCompleted(coroutineContext, e);
            return null;
        }
    }

    private final void onWarmupCompleted(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        getFullPackage.onWarmupCompleted(coroutineContext, getUniversalStrategies.onExtraCallbackWithResult("The task was rejected", rejectedExecutionException));
    }

    @Override // o.ComponentModela, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorOnExtraCallbackWithResult = onExtraCallbackWithResult();
        ExecutorService executorService = executorOnExtraCallbackWithResult instanceof ExecutorService ? (ExecutorService) executorOnExtraCallbackWithResult : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o.GeckoHubImp
    public String toString() {
        return onExtraCallbackWithResult().toString();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ComponentModel) && ((ComponentModel) obj).onExtraCallbackWithResult() == onExtraCallbackWithResult();
    }

    public int hashCode() {
        return System.identityHashCode(onExtraCallbackWithResult());
    }
}
