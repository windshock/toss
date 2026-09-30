package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class MapConverter {
    static boolean onWarmupCompleted = Boolean.getBoolean("rx2.scheduler.use-nanotime");
    static final long IAuthTabCallback = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public void onExtraCallback() {
    }

    public abstract onNavigationEvent onExtraCallbackWithResult();

    static long onWarmupCompleted(TimeUnit timeUnit) {
        if (!onWarmupCompleted) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
        return timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public long onExtraCallbackWithResult(TimeUnit timeUnit) {
        return onWarmupCompleted(timeUnit);
    }

    public deserializeUriNullableCollection onExtraCallback(Runnable runnable) {
        return onNavigationEvent(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit) {
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult();
        onExtraCallback onextracallback = new onExtraCallback(RxJavaPlugins.onNavigationEvent(runnable), onnavigationeventOnExtraCallbackWithResult);
        onnavigationeventOnExtraCallbackWithResult.onNavigationEvent(onextracallback, j, timeUnit);
        return onextracallback;
    }

    public deserializeUriNullableCollection onExtraCallbackWithResult(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        onNavigationEvent onnavigationeventOnExtraCallbackWithResult = onExtraCallbackWithResult();
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(RxJavaPlugins.onNavigationEvent(runnable), onnavigationeventOnExtraCallbackWithResult);
        deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = onnavigationeventOnExtraCallbackWithResult.onExtraCallbackWithResult(onwarmupcompleted, j, j2, timeUnit);
        return deserializeurinullablecollectionOnExtraCallbackWithResult == deserializeShort.INSTANCE ? deserializeurinullablecollectionOnExtraCallbackWithResult : onwarmupcompleted;
    }

    public static abstract class onNavigationEvent implements deserializeUriNullableCollection {
        public abstract deserializeUriNullableCollection onNavigationEvent(Runnable runnable, long j, TimeUnit timeUnit);

        public deserializeUriNullableCollection IAuthTabCallback(Runnable runnable) {
            return onNavigationEvent(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public deserializeUriNullableCollection onExtraCallbackWithResult(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            deserializeShortArray deserializeshortarray = new deserializeShortArray();
            deserializeShortArray deserializeshortarray2 = new deserializeShortArray(deserializeshortarray);
            Runnable runnableOnNavigationEvent = RxJavaPlugins.onNavigationEvent(runnable);
            long nanos = timeUnit.toNanos(j2);
            long jOnNavigationEvent = onNavigationEvent(TimeUnit.NANOSECONDS);
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = onNavigationEvent(new onExtraCallbackWithResult(jOnNavigationEvent + timeUnit.toNanos(j), runnableOnNavigationEvent, jOnNavigationEvent, deserializeshortarray2, nanos), j, timeUnit);
            if (deserializeurinullablecollectionOnNavigationEvent == deserializeShort.INSTANCE) {
                return deserializeurinullablecollectionOnNavigationEvent;
            }
            deserializeshortarray.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent);
            return deserializeshortarray2;
        }

        public long onNavigationEvent(TimeUnit timeUnit) {
            return MapConverter.onWarmupCompleted(timeUnit);
        }

        final class onExtraCallbackWithResult implements Runnable {
            long IAuthTabCallback;
            long asInterface;
            final deserializeShortArray onExtraCallback;
            final Runnable onExtraCallbackWithResult;
            long onNavigationEvent;
            final long onWarmupCompleted;

            onExtraCallbackWithResult(long j, Runnable runnable, long j2, deserializeShortArray deserializeshortarray, long j3) {
                this.onExtraCallbackWithResult = runnable;
                this.onExtraCallback = deserializeshortarray;
                this.onWarmupCompleted = j3;
                this.onNavigationEvent = j2;
                this.asInterface = j;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                long j;
                this.onExtraCallbackWithResult.run();
                if (this.onExtraCallback.isDisposed()) {
                    return;
                }
                onNavigationEvent onnavigationevent = onNavigationEvent.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jOnNavigationEvent = onnavigationevent.onNavigationEvent(timeUnit);
                long j2 = MapConverter.IAuthTabCallback;
                long j3 = this.onNavigationEvent;
                if (jOnNavigationEvent + j2 >= j3) {
                    long j4 = this.onWarmupCompleted;
                    if (jOnNavigationEvent >= j3 + j4 + j2) {
                        long j5 = this.onWarmupCompleted;
                        long j6 = jOnNavigationEvent + j5;
                        long j7 = this.IAuthTabCallback + 1;
                        this.IAuthTabCallback = j7;
                        this.asInterface = j6 - (j5 * j7);
                        j = j6;
                    } else {
                        long j8 = this.asInterface;
                        long j9 = this.IAuthTabCallback + 1;
                        this.IAuthTabCallback = j9;
                        j = j8 + (j9 * j4);
                    }
                }
                this.onNavigationEvent = jOnNavigationEvent;
                this.onExtraCallback.IAuthTabCallback(onNavigationEvent.this.onNavigationEvent(this, j - jOnNavigationEvent, timeUnit));
            }
        }
    }

    static final class onWarmupCompleted implements deserializeUriNullableCollection, Runnable {
        final Runnable IAuthTabCallback;
        final onNavigationEvent onNavigationEvent;
        volatile boolean onWarmupCompleted;

        onWarmupCompleted(Runnable runnable, onNavigationEvent onnavigationevent) {
            this.IAuthTabCallback = runnable;
            this.onNavigationEvent = onnavigationevent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.onWarmupCompleted) {
                return;
            }
            try {
                this.IAuthTabCallback.run();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onNavigationEvent.dispose();
                throw access26100.onExtraCallback(th);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onWarmupCompleted = true;
            this.onNavigationEvent.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted;
        }
    }

    static final class onExtraCallback implements deserializeUriNullableCollection, Runnable {
        final onNavigationEvent IAuthTabCallback;
        final Runnable onExtraCallbackWithResult;
        Thread onNavigationEvent;

        onExtraCallback(Runnable runnable, onNavigationEvent onnavigationevent) {
            this.onExtraCallbackWithResult = runnable;
            this.IAuthTabCallback = onnavigationevent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.onNavigationEvent = Thread.currentThread();
            try {
                this.onExtraCallbackWithResult.run();
            } finally {
                dispose();
                this.onNavigationEvent = null;
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.onNavigationEvent == Thread.currentThread()) {
                onNavigationEvent onnavigationevent = this.IAuthTabCallback;
                if (onnavigationevent instanceof getDeallocationBacktraceOrBuilderList) {
                    ((getDeallocationBacktraceOrBuilderList) onnavigationevent).IAuthTabCallback();
                    return;
                }
            }
            this.IAuthTabCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback.isDisposed();
        }
    }
}
