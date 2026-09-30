package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setPathBytes<T> extends setPc<T, T> {
    final MapConverter IAuthTabCallback;
    final TimeUnit onExtraCallback;
    final boolean onExtraCallbackWithResult;
    final long onNavigationEvent;

    public setPathBytes(serializeRaw<T> serializeraw, long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        super(serializeraw);
        this.onNavigationEvent = j;
        this.onExtraCallback = timeUnit;
        this.IAuthTabCallback = mapConverter;
        this.onExtraCallbackWithResult = z;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        access26900 access26900Var = new access26900(writequoted);
        if (this.onExtraCallbackWithResult) {
            this.onWarmupCompleted.subscribe(new onWarmupCompleted(access26900Var, this.onNavigationEvent, this.onExtraCallback, this.IAuthTabCallback));
        } else {
            this.onWarmupCompleted.subscribe(new onNavigationEvent(access26900Var, this.onNavigationEvent, this.onExtraCallback, this.IAuthTabCallback));
        }
    }

    static abstract class IAuthTabCallback<T> extends AtomicReference<T> implements writeQuoted<T>, deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final writeQuoted<? super T> downstream;
        final long period;
        final MapConverter scheduler;
        final AtomicReference<deserializeUriNullableCollection> timer = new AtomicReference<>();
        final TimeUnit unit;
        deserializeUriNullableCollection upstream;

        abstract void IAuthTabCallback();

        IAuthTabCallback(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter mapConverter) {
            this.downstream = writequoted;
            this.period = j;
            this.unit = timeUnit;
            this.scheduler = mapConverter;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
                MapConverter mapConverter = this.scheduler;
                long j = this.period;
                deserializeNumber.replace(this.timer, mapConverter.onExtraCallbackWithResult(this, j, j, this.unit));
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            lazySet(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            onNavigationEvent();
            this.downstream.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            onNavigationEvent();
            IAuthTabCallback();
        }

        void onNavigationEvent() {
            deserializeNumber.dispose(this.timer);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            onNavigationEvent();
            this.upstream.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        void onWarmupCompleted() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                this.downstream.onExtraCallback(andSet);
            }
        }
    }

    static final class onNavigationEvent<T> extends IAuthTabCallback<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        onNavigationEvent(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter mapConverter) {
            super(writequoted, j, timeUnit, mapConverter);
        }

        @Override // o.setPathBytes.IAuthTabCallback
        void IAuthTabCallback() {
            this.downstream.onExtraCallback();
        }

        @Override // java.lang.Runnable
        public void run() {
            onWarmupCompleted();
        }
    }

    static final class onWarmupCompleted<T> extends IAuthTabCallback<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final AtomicInteger wip;

        onWarmupCompleted(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter mapConverter) {
            super(writequoted, j, timeUnit, mapConverter);
            this.wip = new AtomicInteger(1);
        }

        @Override // o.setPathBytes.IAuthTabCallback
        void IAuthTabCallback() {
            onWarmupCompleted();
            if (this.wip.decrementAndGet() == 0) {
                this.downstream.onExtraCallback();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wip.incrementAndGet() == 2) {
                onWarmupCompleted();
                if (this.wip.decrementAndGet() == 0) {
                    this.downstream.onExtraCallback();
                }
            }
        }
    }
}
