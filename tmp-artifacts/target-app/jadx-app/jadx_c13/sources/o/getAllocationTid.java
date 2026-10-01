package o;

import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAllocationTid extends MapConverter {
    static boolean asBinder = false;
    static final RxThreadFactory asInterface;
    static final onExtraCallbackWithResult onExtraCallback;
    static final RxThreadFactory onExtraCallbackWithResult;
    static final onWarmupCompleted onNavigationEvent;
    final ThreadFactory IAuthTabCallbackDefault;
    final AtomicReference<onWarmupCompleted> IAuthTabCallbackStub;
    private static final TimeUnit IAuthTabCallback_Parcel = TimeUnit.SECONDS;
    private static final long onTransact = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        onExtraCallback = onextracallbackwithresult;
        onextracallbackwithresult.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax);
        asInterface = rxThreadFactory;
        onExtraCallbackWithResult = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax);
        asBinder = Boolean.getBoolean("rx2.io-scheduled-release");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(0L, null, rxThreadFactory);
        onNavigationEvent = onwarmupcompleted;
        onwarmupcompleted.onExtraCallbackWithResult();
    }

    static final class onWarmupCompleted implements Runnable {
        final deserializeUriCollection IAuthTabCallback;
        private final ThreadFactory IAuthTabCallbackDefault;
        private final ScheduledExecutorService onExtraCallback;
        private final long onExtraCallbackWithResult;
        private final ConcurrentLinkedQueue<onExtraCallbackWithResult> onNavigationEvent;
        private final Future<?> onWarmupCompleted;

        onWarmupCompleted(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.onExtraCallbackWithResult = nanos;
            this.onNavigationEvent = new ConcurrentLinkedQueue<>();
            this.IAuthTabCallback = new deserializeUriCollection();
            this.IAuthTabCallbackDefault = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, getAllocationTid.onExtraCallbackWithResult);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.onExtraCallback = scheduledExecutorServiceNewScheduledThreadPool;
            this.onWarmupCompleted = scheduledFutureScheduleWithFixedDelay;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAuthTabCallback();
        }

        onExtraCallbackWithResult onWarmupCompleted() {
            if (this.IAuthTabCallback.isDisposed()) {
                return getAllocationTid.onExtraCallback;
            }
            while (!this.onNavigationEvent.isEmpty()) {
                onExtraCallbackWithResult onextracallbackwithresultPoll = this.onNavigationEvent.poll();
                if (onextracallbackwithresultPoll != null) {
                    return onextracallbackwithresultPoll;
                }
            }
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
            this.IAuthTabCallback.onNavigationEvent(onextracallbackwithresult);
            return onextracallbackwithresult;
        }

        void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
            onextracallbackwithresult.IAuthTabCallback(onExtraCallback() + this.onExtraCallbackWithResult);
            this.onNavigationEvent.offer(onextracallbackwithresult);
        }

        void IAuthTabCallback() {
            if (this.onNavigationEvent.isEmpty()) {
                return;
            }
            long jOnExtraCallback = onExtraCallback();
            Iterator<onExtraCallbackWithResult> it = this.onNavigationEvent.iterator();
            while (it.hasNext()) {
                onExtraCallbackWithResult next = it.next();
                if (next.onExtraCallback() > jOnExtraCallback) {
                    return;
                }
                if (this.onNavigationEvent.remove(next)) {
                    this.IAuthTabCallback.onExtraCallbackWithResult(next);
                }
            }
        }

        long onExtraCallback() {
            return System.nanoTime();
        }

        void onExtraCallbackWithResult() {
            this.IAuthTabCallback.dispose();
            Future<?> future = this.onWarmupCompleted;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.onExtraCallback;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    public getAllocationTid() {
        this(asInterface);
    }

    public getAllocationTid(ThreadFactory threadFactory) {
        this.IAuthTabCallbackDefault = threadFactory;
        this.IAuthTabCallbackStub = new AtomicReference<>(onNavigationEvent);
        onExtraCallback();
    }

    @Override // o.MapConverter
    public void onExtraCallback() {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(onTransact, IAuthTabCallback_Parcel, this.IAuthTabCallbackDefault);
        if (setSupportImageTintList.onNavigationEvent(this.IAuthTabCallbackStub, onNavigationEvent, onwarmupcompleted)) {
            return;
        }
        onwarmupcompleted.onExtraCallbackWithResult();
    }

    @Override // o.MapConverter
    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new IAuthTabCallback(this.IAuthTabCallbackStub.get());
    }

    static final class IAuthTabCallback extends MapConverter.onNavigationEvent implements Runnable {
        private final onWarmupCompleted IAuthTabCallback;
        private final onExtraCallbackWithResult onNavigationEvent;
        final AtomicBoolean onWarmupCompleted = new AtomicBoolean();
        private final deserializeUriCollection onExtraCallback = new deserializeUriCollection();

        IAuthTabCallback(onWarmupCompleted onwarmupcompleted) {
            this.IAuthTabCallback = onwarmupcompleted;
            this.onNavigationEvent = onwarmupcompleted.onWarmupCompleted();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.onWarmupCompleted.compareAndSet(false, true)) {
                this.onExtraCallback.dispose();
                if (getAllocationTid.asBinder) {
                    this.onNavigationEvent.IAuthTabCallback(this, 0L, TimeUnit.NANOSECONDS, null);
                } else {
                    this.IAuthTabCallback.onExtraCallback(this.onNavigationEvent);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.IAuthTabCallback.onExtraCallback(this.onNavigationEvent);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted.get();
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.onExtraCallback.isDisposed()) {
                return deserializeShort.INSTANCE;
            }
            return this.onNavigationEvent.IAuthTabCallback(runnable, j, timeUnit, this.onExtraCallback);
        }
    }

    static final class onExtraCallbackWithResult extends getDeallocationBacktraceOrBuilderList {
        private long onWarmupCompleted;

        onExtraCallbackWithResult(ThreadFactory threadFactory) {
            super(threadFactory);
            this.onWarmupCompleted = 0L;
        }

        public long onExtraCallback() {
            return this.onWarmupCompleted;
        }

        public void IAuthTabCallback(long j) {
            this.onWarmupCompleted = j;
        }
    }
}
