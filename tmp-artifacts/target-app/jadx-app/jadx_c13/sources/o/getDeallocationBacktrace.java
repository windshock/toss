package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getDeallocationBacktrace extends MapConverter {
    static final MapConverter onExtraCallback = clearTid.onExtraCallbackWithResult();
    final Executor onExtraCallbackWithResult;
    final boolean onNavigationEvent;

    public getDeallocationBacktrace(Executor executor, boolean z) {
        this.onExtraCallbackWithResult = executor;
        this.onNavigationEvent = z;
    }

    @Override // o.MapConverter
    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new onWarmupCompleted(this.onExtraCallbackWithResult, this.onNavigationEvent);
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onExtraCallback(Runnable runnable) {
        Runnable runnableOnNavigationEvent = RxJavaPlugins.onNavigationEvent(runnable);
        try {
            if (this.onExtraCallbackWithResult instanceof ExecutorService) {
                getDeallocationTid getdeallocationtid = new getDeallocationTid(runnableOnNavigationEvent);
                getdeallocationtid.onNavigationEvent(((ExecutorService) this.onExtraCallbackWithResult).submit(getdeallocationtid));
                return getdeallocationtid;
            }
            if (this.onNavigationEvent) {
                onWarmupCompleted.onNavigationEvent onnavigationevent = new onWarmupCompleted.onNavigationEvent(runnableOnNavigationEvent, null);
                this.onExtraCallbackWithResult.execute(onnavigationevent);
                return onnavigationevent;
            }
            onWarmupCompleted.RunnableC0032onWarmupCompleted runnableC0032onWarmupCompleted = new onWarmupCompleted.RunnableC0032onWarmupCompleted(runnableOnNavigationEvent);
            this.onExtraCallbackWithResult.execute(runnableC0032onWarmupCompleted);
            return runnableC0032onWarmupCompleted;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onExtraCallbackWithResult(e);
            return deserializeShort.INSTANCE;
        }
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableOnNavigationEvent = RxJavaPlugins.onNavigationEvent(runnable);
        if (this.onExtraCallbackWithResult instanceof ScheduledExecutorService) {
            try {
                getDeallocationTid getdeallocationtid = new getDeallocationTid(runnableOnNavigationEvent);
                getdeallocationtid.onNavigationEvent(((ScheduledExecutorService) this.onExtraCallbackWithResult).schedule(getdeallocationtid, j, timeUnit));
                return getdeallocationtid;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onExtraCallbackWithResult(e);
                return deserializeShort.INSTANCE;
            }
        }
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(runnableOnNavigationEvent);
        iAuthTabCallback.timed.IAuthTabCallback(onExtraCallback.onNavigationEvent(new onNavigationEvent(iAuthTabCallback), j, timeUnit));
        return iAuthTabCallback;
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onExtraCallbackWithResult(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (this.onExtraCallbackWithResult instanceof ScheduledExecutorService) {
            try {
                TombstoneProtosHeapObjectOrBuilder tombstoneProtosHeapObjectOrBuilder = new TombstoneProtosHeapObjectOrBuilder(RxJavaPlugins.onNavigationEvent(runnable));
                tombstoneProtosHeapObjectOrBuilder.onNavigationEvent(((ScheduledExecutorService) this.onExtraCallbackWithResult).scheduleAtFixedRate(tombstoneProtosHeapObjectOrBuilder, j, j2, timeUnit));
                return tombstoneProtosHeapObjectOrBuilder;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onExtraCallbackWithResult(e);
                return deserializeShort.INSTANCE;
            }
        }
        return super.onExtraCallbackWithResult(runnable, j, j2, timeUnit);
    }

    public static final class onWarmupCompleted extends MapConverter.onNavigationEvent implements Runnable {
        final boolean IAuthTabCallback;
        volatile boolean onExtraCallback;
        final Executor onWarmupCompleted;
        final AtomicInteger IAuthTabCallbackStub = new AtomicInteger();
        final deserializeUriCollection onNavigationEvent = new deserializeUriCollection();
        final getAllocationBacktrace<Runnable> onExtraCallbackWithResult = new getAllocationBacktrace<>();

        public onWarmupCompleted(Executor executor, boolean z) {
            this.onWarmupCompleted = executor;
            this.IAuthTabCallback = z;
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection IAuthTabCallback(Runnable runnable) {
            deserializeUriNullableCollection runnableC0032onWarmupCompleted;
            if (this.onExtraCallback) {
                return deserializeShort.INSTANCE;
            }
            Runnable runnableOnNavigationEvent = RxJavaPlugins.onNavigationEvent(runnable);
            if (this.IAuthTabCallback) {
                runnableC0032onWarmupCompleted = new onNavigationEvent(runnableOnNavigationEvent, this.onNavigationEvent);
                this.onNavigationEvent.onNavigationEvent(runnableC0032onWarmupCompleted);
            } else {
                runnableC0032onWarmupCompleted = new RunnableC0032onWarmupCompleted(runnableOnNavigationEvent);
            }
            this.onExtraCallbackWithResult.offer(runnableC0032onWarmupCompleted);
            if (this.IAuthTabCallbackStub.getAndIncrement() != 0) {
                return runnableC0032onWarmupCompleted;
            }
            try {
                this.onWarmupCompleted.execute(this);
                return runnableC0032onWarmupCompleted;
            } catch (RejectedExecutionException e) {
                this.onExtraCallback = true;
                this.onExtraCallbackWithResult.clear();
                RxJavaPlugins.onExtraCallbackWithResult(e);
                return deserializeShort.INSTANCE;
            }
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return IAuthTabCallback(runnable);
            }
            if (this.onExtraCallback) {
                return deserializeShort.INSTANCE;
            }
            deserializeShortArray deserializeshortarray = new deserializeShortArray();
            deserializeShortArray deserializeshortarray2 = new deserializeShortArray(deserializeshortarray);
            access25000 access25000Var = new access25000(new onExtraCallbackWithResult(deserializeshortarray2, RxJavaPlugins.onNavigationEvent(runnable)), this.onNavigationEvent);
            this.onNavigationEvent.onNavigationEvent(access25000Var);
            Executor executor = this.onWarmupCompleted;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    access25000Var.onWarmupCompleted(((ScheduledExecutorService) executor).schedule((Callable) access25000Var, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.onExtraCallback = true;
                    RxJavaPlugins.onExtraCallbackWithResult(e);
                    return deserializeShort.INSTANCE;
                }
            } else {
                access25000Var.onWarmupCompleted(new getDeallocationBacktraceCount(getDeallocationBacktrace.onExtraCallback.onNavigationEvent(access25000Var, j, timeUnit)));
            }
            deserializeshortarray.IAuthTabCallback(access25000Var);
            return deserializeshortarray2;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = true;
            this.onNavigationEvent.dispose();
            if (this.IAuthTabCallbackStub.getAndIncrement() == 0) {
                this.onExtraCallbackWithResult.clear();
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            getAllocationBacktrace<Runnable> getallocationbacktrace = this.onExtraCallbackWithResult;
            int iAddAndGet = 1;
            while (!this.onExtraCallback) {
                do {
                    Runnable runnablePoll = getallocationbacktrace.poll();
                    if (runnablePoll != null) {
                        runnablePoll.run();
                    } else if (this.onExtraCallback) {
                        getallocationbacktrace.clear();
                        return;
                    } else {
                        iAddAndGet = this.IAuthTabCallbackStub.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.onExtraCallback);
                getallocationbacktrace.clear();
                return;
            }
            getallocationbacktrace.clear();
        }

        /* renamed from: o.getDeallocationBacktrace$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        static final class RunnableC0032onWarmupCompleted extends AtomicBoolean implements Runnable, deserializeUriNullableCollection {
            private static final long serialVersionUID = -2421395018820541164L;
            final Runnable actual;

            RunnableC0032onWarmupCompleted(Runnable runnable) {
                this.actual = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.actual.run();
                } finally {
                    lazySet(true);
                }
            }

            @Override // o.deserializeUriNullableCollection
            public void dispose() {
                lazySet(true);
            }

            @Override // o.deserializeUriNullableCollection
            public boolean isDisposed() {
                return get();
            }
        }

        final class onExtraCallbackWithResult implements Runnable {
            private final Runnable IAuthTabCallback;
            private final deserializeShortArray onNavigationEvent;

            onExtraCallbackWithResult(deserializeShortArray deserializeshortarray, Runnable runnable) {
                this.onNavigationEvent = deserializeshortarray;
                this.IAuthTabCallback = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.onNavigationEvent.IAuthTabCallback(onWarmupCompleted.this.IAuthTabCallback(this.IAuthTabCallback));
            }
        }

        static final class onNavigationEvent extends AtomicInteger implements Runnable, deserializeUriNullableCollection {
            private static final long serialVersionUID = -3603436687413320876L;

            /* renamed from: run, reason: collision with root package name */
            final Runnable f11run;
            final deserializeLongArray tasks;
            volatile Thread thread;

            onNavigationEvent(Runnable runnable, deserializeLongArray deserializelongarray) {
                this.f11run = runnable;
                this.tasks = deserializelongarray;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.thread = Thread.currentThread();
                    if (compareAndSet(0, 1)) {
                        try {
                            this.f11run.run();
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                onNavigationEvent();
                                return;
                            }
                            while (get() == 3) {
                                Thread.yield();
                            }
                            Thread.interrupted();
                            return;
                        } catch (Throwable th) {
                            this.thread = null;
                            if (compareAndSet(1, 2)) {
                                onNavigationEvent();
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th;
                        }
                    }
                    this.thread = null;
                }
            }

            @Override // o.deserializeUriNullableCollection
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            onNavigationEvent();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.thread;
                        if (thread != null) {
                            thread.interrupt();
                            this.thread = null;
                        }
                        set(4);
                        onNavigationEvent();
                        return;
                    }
                }
            }

            void onNavigationEvent() {
                deserializeLongArray deserializelongarray = this.tasks;
                if (deserializelongarray != null) {
                    deserializelongarray.IAuthTabCallback(this);
                }
            }

            @Override // o.deserializeUriNullableCollection
            public boolean isDisposed() {
                return get() >= 2;
            }
        }
    }

    static final class IAuthTabCallback extends AtomicReference<Runnable> implements Runnable, deserializeUriNullableCollection {
        private static final long serialVersionUID = -4101336210206799084L;
        final deserializeShortArray direct;
        final deserializeShortArray timed;

        IAuthTabCallback(Runnable runnable) {
            super(runnable);
            this.timed = new deserializeShortArray();
            this.direct = new deserializeShortArray();
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = get();
            if (runnable != null) {
                try {
                    runnable.run();
                    lazySet(null);
                    deserializeShortArray deserializeshortarray = this.timed;
                    deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
                    deserializeshortarray.lazySet(deserializenumber);
                    this.direct.lazySet(deserializenumber);
                } catch (Throwable th) {
                    lazySet(null);
                    this.timed.lazySet(deserializeNumber.DISPOSED);
                    this.direct.lazySet(deserializeNumber.DISPOSED);
                    throw th;
                }
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (getAndSet(null) != null) {
                this.timed.dispose();
                this.direct.dispose();
            }
        }
    }

    final class onNavigationEvent implements Runnable {
        private final IAuthTabCallback IAuthTabCallback;

        onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
            this.IAuthTabCallback = iAuthTabCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback;
            iAuthTabCallback.direct.IAuthTabCallback(getDeallocationBacktrace.this.onExtraCallback(iAuthTabCallback));
        }
    }
}
