package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosLogBuffer extends MapConverter {
    static final ScheduledExecutorService onExtraCallback;
    static final RxThreadFactory onExtraCallbackWithResult;
    final ThreadFactory IAuthTabCallbackStub;
    final AtomicReference<ScheduledExecutorService> onNavigationEvent;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        onExtraCallback = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        onExtraCallbackWithResult = new RxThreadFactory("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public TombstoneProtosLogBuffer() {
        this(onExtraCallbackWithResult);
    }

    public TombstoneProtosLogBuffer(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.onNavigationEvent = atomicReference;
        this.IAuthTabCallbackStub = threadFactory;
        atomicReference.lazySet(onExtraCallbackWithResult(threadFactory));
    }

    static ScheduledExecutorService onExtraCallbackWithResult(ThreadFactory threadFactory) {
        return access25100.onNavigationEvent(threadFactory);
    }

    @Override // o.MapConverter
    public void onExtraCallback() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorServiceOnExtraCallbackWithResult = null;
        do {
            scheduledExecutorService = this.onNavigationEvent.get();
            if (scheduledExecutorService != onExtraCallback) {
                if (scheduledExecutorServiceOnExtraCallbackWithResult != null) {
                    scheduledExecutorServiceOnExtraCallbackWithResult.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorServiceOnExtraCallbackWithResult == null) {
                scheduledExecutorServiceOnExtraCallbackWithResult = onExtraCallbackWithResult(this.IAuthTabCallbackStub);
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onNavigationEvent, scheduledExecutorService, scheduledExecutorServiceOnExtraCallbackWithResult));
    }

    @Override // o.MapConverter
    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new onExtraCallback(this.onNavigationEvent.get());
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        getDeallocationTid getdeallocationtid = new getDeallocationTid(RxJavaPlugins.onNavigationEvent(runnable));
        try {
            if (j <= 0) {
                futureSchedule = this.onNavigationEvent.get().submit(getdeallocationtid);
            } else {
                futureSchedule = this.onNavigationEvent.get().schedule(getdeallocationtid, j, timeUnit);
            }
            getdeallocationtid.onNavigationEvent(futureSchedule);
            return getdeallocationtid;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onExtraCallbackWithResult(e);
            return deserializeShort.INSTANCE;
        }
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onExtraCallbackWithResult(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> futureSchedule;
        Runnable runnableOnNavigationEvent = RxJavaPlugins.onNavigationEvent(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.onNavigationEvent.get();
            getDeallocationBacktraceList getdeallocationbacktracelist = new getDeallocationBacktraceList(runnableOnNavigationEvent, scheduledExecutorService);
            try {
                if (j <= 0) {
                    futureSchedule = scheduledExecutorService.submit(getdeallocationbacktracelist);
                } else {
                    futureSchedule = scheduledExecutorService.schedule(getdeallocationbacktracelist, j, timeUnit);
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
            tombstoneProtosHeapObjectOrBuilder.onNavigationEvent(this.onNavigationEvent.get().scheduleAtFixedRate(tombstoneProtosHeapObjectOrBuilder, j, j2, timeUnit));
            return tombstoneProtosHeapObjectOrBuilder;
        } catch (RejectedExecutionException e2) {
            RxJavaPlugins.onExtraCallbackWithResult(e2);
            return deserializeShort.INSTANCE;
        }
    }

    static final class onExtraCallback extends MapConverter.onNavigationEvent {
        final ScheduledExecutorService IAuthTabCallback;
        final deserializeUriCollection onExtraCallbackWithResult = new deserializeUriCollection();
        volatile boolean onWarmupCompleted;

        onExtraCallback(ScheduledExecutorService scheduledExecutorService) {
            this.IAuthTabCallback = scheduledExecutorService;
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> futureSchedule;
            if (this.onWarmupCompleted) {
                return deserializeShort.INSTANCE;
            }
            access25000 access25000Var = new access25000(RxJavaPlugins.onNavigationEvent(runnable), this.onExtraCallbackWithResult);
            this.onExtraCallbackWithResult.onNavigationEvent(access25000Var);
            try {
                if (j <= 0) {
                    futureSchedule = this.IAuthTabCallback.submit((Callable) access25000Var);
                } else {
                    futureSchedule = this.IAuthTabCallback.schedule((Callable) access25000Var, j, timeUnit);
                }
                access25000Var.onWarmupCompleted(futureSchedule);
                return access25000Var;
            } catch (RejectedExecutionException e) {
                dispose();
                RxJavaPlugins.onExtraCallbackWithResult(e);
                return deserializeShort.INSTANCE;
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.onWarmupCompleted) {
                return;
            }
            this.onWarmupCompleted = true;
            this.onExtraCallbackWithResult.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted;
        }
    }
}
