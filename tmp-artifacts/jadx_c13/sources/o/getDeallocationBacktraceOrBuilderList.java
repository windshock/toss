package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class getDeallocationBacktraceOrBuilderList extends MapConverter.onNavigationEvent {
    private final ScheduledExecutorService IAuthTabCallback;
    volatile boolean onExtraCallbackWithResult;

    public getDeallocationBacktraceOrBuilderList(ThreadFactory threadFactory) {
        this.IAuthTabCallback = access25100.onNavigationEvent(threadFactory);
    }

    @Override // o.MapConverter.onNavigationEvent
    public deserializeUriNullableCollection IAuthTabCallback(Runnable runnable) {
        return onNavigationEvent(runnable, 0L, null);
    }

    @Override // o.MapConverter.onNavigationEvent
    public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.onExtraCallbackWithResult) {
            return deserializeShort.INSTANCE;
        }
        return IAuthTabCallback(runnable, j, timeUnit, null);
    }

    public deserializeUriNullableCollection onExtraCallbackWithResult(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        getDeallocationTid getdeallocationtid = new getDeallocationTid(RxJavaPlugins.onNavigationEvent(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.IAuthTabCallback.submit(getdeallocationtid);
            } else {
                futureSchedule = this.IAuthTabCallback.schedule(getdeallocationtid, j, timeUnit);
            }
            getdeallocationtid.onNavigationEvent(futureSchedule);
            return getdeallocationtid;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onExtraCallbackWithResult(e);
            return deserializeShort.INSTANCE;
        }
    }

    public deserializeUriNullableCollection onWarmupCompleted(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableOnNavigationEvent = RxJavaPlugins.onNavigationEvent(runnable);
        if (j2 <= 0) {
            getDeallocationBacktraceList getdeallocationbacktracelist = new getDeallocationBacktraceList(runnableOnNavigationEvent, this.IAuthTabCallback);
            try {
                if (j <= 0) {
                    futureSchedule = this.IAuthTabCallback.submit(getdeallocationbacktracelist);
                } else {
                    futureSchedule = this.IAuthTabCallback.schedule(getdeallocationbacktracelist, j, timeUnit);
                }
                getdeallocationbacktracelist.onExtraCallback(futureSchedule);
                return getdeallocationbacktracelist;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onExtraCallbackWithResult(e);
                return deserializeShort.INSTANCE;
            }
        }
        TombstoneProtosHeapObjectOrBuilder tombstoneProtosHeapObjectOrBuilder = new TombstoneProtosHeapObjectOrBuilder(runnableOnNavigationEvent);
        try {
            tombstoneProtosHeapObjectOrBuilder.onNavigationEvent(this.IAuthTabCallback.scheduleAtFixedRate(tombstoneProtosHeapObjectOrBuilder, j, j2, timeUnit));
            return tombstoneProtosHeapObjectOrBuilder;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onExtraCallbackWithResult(e2);
            return deserializeShort.INSTANCE;
        }
    }

    public access25000 IAuthTabCallback(Runnable runnable, long j, TimeUnit timeUnit, deserializeLongArray deserializelongarray) {
        Future<?> futureSchedule;
        access25000 access25000Var = new access25000(RxJavaPlugins.onNavigationEvent(runnable), deserializelongarray);
        if (deserializelongarray != null && !deserializelongarray.onNavigationEvent(access25000Var)) {
            return access25000Var;
        }
        try {
            if (j <= 0) {
                futureSchedule = this.IAuthTabCallback.submit((Callable) access25000Var);
            } else {
                futureSchedule = this.IAuthTabCallback.schedule((Callable) access25000Var, j, timeUnit);
            }
            access25000Var.onWarmupCompleted(futureSchedule);
            return access25000Var;
        } catch (RejectedExecutionException e) {
            if (deserializelongarray != null) {
                deserializelongarray.onExtraCallbackWithResult(access25000Var);
            }
            RxJavaPlugins.onExtraCallbackWithResult(e);
            return access25000Var;
        }
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        this.IAuthTabCallback.shutdownNow();
    }

    public void IAuthTabCallback() {
        if (this.onExtraCallbackWithResult) {
            return;
        }
        this.onExtraCallbackWithResult = true;
        this.IAuthTabCallback.shutdown();
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this.onExtraCallbackWithResult;
    }
}
