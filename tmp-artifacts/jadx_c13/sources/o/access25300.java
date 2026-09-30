package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access25300 extends MapConverter {
    private static final access25300 onExtraCallback = new access25300();

    public static access25300 onWarmupCompleted() {
        return onExtraCallback;
    }

    @Override // o.MapConverter
    public MapConverter.onNavigationEvent onExtraCallbackWithResult() {
        return new onNavigationEvent();
    }

    access25300() {
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onExtraCallback(Runnable runnable) {
        RxJavaPlugins.onNavigationEvent(runnable).run();
        return deserializeShort.INSTANCE;
    }

    @Override // o.MapConverter
    public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) throws InterruptedException {
        try {
            timeUnit.sleep(j);
            RxJavaPlugins.onNavigationEvent(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onExtraCallbackWithResult(e);
        }
        return deserializeShort.INSTANCE;
    }

    static final class onNavigationEvent extends MapConverter.onNavigationEvent {
        volatile boolean onExtraCallback;
        final PriorityBlockingQueue<onExtraCallbackWithResult> IAuthTabCallback = new PriorityBlockingQueue<>();
        private final AtomicInteger onWarmupCompleted = new AtomicInteger();
        final AtomicInteger onNavigationEvent = new AtomicInteger();

        onNavigationEvent() {
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection IAuthTabCallback(Runnable runnable) {
            return onExtraCallback(runnable, onNavigationEvent(TimeUnit.MILLISECONDS));
        }

        @Override // o.MapConverter.onNavigationEvent
        public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
            long jOnNavigationEvent = onNavigationEvent(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return onExtraCallback(new onExtraCallback(runnable, this, jOnNavigationEvent), jOnNavigationEvent);
        }

        deserializeUriNullableCollection onExtraCallback(Runnable runnable, long j) {
            if (this.onExtraCallback) {
                return deserializeShort.INSTANCE;
            }
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(runnable, Long.valueOf(j), this.onNavigationEvent.incrementAndGet());
            this.IAuthTabCallback.add(onextracallbackwithresult);
            if (this.onWarmupCompleted.getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.onExtraCallback) {
                    onExtraCallbackWithResult onextracallbackwithresultPoll = this.IAuthTabCallback.poll();
                    if (onextracallbackwithresultPoll != null) {
                        if (!onextracallbackwithresultPoll.IAuthTabCallback) {
                            onextracallbackwithresultPoll.onExtraCallbackWithResult.run();
                        }
                    } else {
                        iAddAndGet = this.onWarmupCompleted.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return deserializeShort.INSTANCE;
                        }
                    }
                }
                this.IAuthTabCallback.clear();
                return deserializeShort.INSTANCE;
            }
            return bigDecimalOrDouble.onExtraCallback(new onExtraCallback(onextracallbackwithresult));
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onExtraCallback = true;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallback;
        }

        final class onExtraCallback implements Runnable {
            final onExtraCallbackWithResult onWarmupCompleted;

            onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
                this.onWarmupCompleted = onextracallbackwithresult;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.onWarmupCompleted.IAuthTabCallback = true;
                onNavigationEvent.this.IAuthTabCallback.remove(this.onWarmupCompleted);
            }
        }
    }

    static final class onExtraCallbackWithResult implements Comparable<onExtraCallbackWithResult> {
        volatile boolean IAuthTabCallback;
        final Runnable onExtraCallbackWithResult;
        final int onNavigationEvent;
        final long onWarmupCompleted;

        onExtraCallbackWithResult(Runnable runnable, Long l, int i) {
            this.onExtraCallbackWithResult = runnable;
            this.onWarmupCompleted = l.longValue();
            this.onNavigationEvent = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public int compareTo(onExtraCallbackWithResult onextracallbackwithresult) {
            int iIAuthTabCallback = floatExponent.IAuthTabCallback(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted);
            return iIAuthTabCallback == 0 ? floatExponent.onExtraCallback(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) : iIAuthTabCallback;
        }
    }

    static final class onExtraCallback implements Runnable {
        private final Runnable onExtraCallback;
        private final onNavigationEvent onNavigationEvent;
        private final long onWarmupCompleted;

        onExtraCallback(Runnable runnable, onNavigationEvent onnavigationevent, long j) {
            this.onExtraCallback = runnable;
            this.onNavigationEvent = onnavigationevent;
            this.onWarmupCompleted = j;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            if (this.onNavigationEvent.onExtraCallback) {
                return;
            }
            long jOnNavigationEvent = this.onNavigationEvent.onNavigationEvent(TimeUnit.MILLISECONDS);
            long j = this.onWarmupCompleted;
            if (j > jOnNavigationEvent) {
                try {
                    Thread.sleep(j - jOnNavigationEvent);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.onExtraCallbackWithResult(e);
                    return;
                }
            }
            if (this.onNavigationEvent.onExtraCallback) {
                return;
            }
            this.onExtraCallback.run();
        }
    }
}
