package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access10500<T> extends setPc<T, T> {
    final long IAuthTabCallback;
    final MapConverter onExtraCallback;
    final TimeUnit onExtraCallbackWithResult;
    final serializeRaw<? extends T> onNavigationEvent;

    interface IAuthTabCallback {
        void onExtraCallbackWithResult(long j);
    }

    public access10500(getByteBuffer<T> getbytebuffer, long j, TimeUnit timeUnit, MapConverter mapConverter, serializeRaw<? extends T> serializeraw) {
        super(getbytebuffer);
        this.IAuthTabCallback = j;
        this.onExtraCallbackWithResult = timeUnit;
        this.onExtraCallback = mapConverter;
        this.onNavigationEvent = serializeraw;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        if (this.onNavigationEvent == null) {
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(writequoted, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onExtraCallback.onExtraCallbackWithResult());
            writequoted.IAuthTabCallback(onextracallbackwithresult);
            onextracallbackwithresult.onExtraCallback(0L);
            this.onWarmupCompleted.subscribe(onextracallbackwithresult);
            return;
        }
        onExtraCallback onextracallback = new onExtraCallback(writequoted, this.IAuthTabCallback, this.onExtraCallbackWithResult, this.onExtraCallback.onExtraCallbackWithResult(), this.onNavigationEvent);
        writequoted.IAuthTabCallback(onextracallback);
        onextracallback.onExtraCallback(0L);
        this.onWarmupCompleted.subscribe(onextracallback);
    }

    static final class onExtraCallbackWithResult<T> extends AtomicLong implements writeQuoted<T>, deserializeUriNullableCollection, IAuthTabCallback {
        private static final long serialVersionUID = 3764492702657003550L;
        final writeQuoted<? super T> downstream;
        final long timeout;
        final TimeUnit unit;
        final MapConverter.onNavigationEvent worker;
        final deserializeShortArray task = new deserializeShortArray();
        final AtomicReference<deserializeUriNullableCollection> upstream = new AtomicReference<>();

        onExtraCallbackWithResult(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent) {
            this.downstream = writequoted;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = onnavigationevent;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.upstream, deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            long j = get();
            if (j != LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onExtraCallback(t);
                    onExtraCallback(j2);
                }
            }
        }

        void onExtraCallback(long j) {
            this.task.IAuthTabCallback(this.worker.onNavigationEvent(new onWarmupCompleted(j, this), this.timeout, this.unit));
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onExtraCallbackWithResult(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onExtraCallback();
                this.worker.dispose();
            }
        }

        @Override // o.access10500.IAuthTabCallback
        public void onExtraCallbackWithResult(long j) {
            if (compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                deserializeNumber.dispose(this.upstream);
                this.downstream.onExtraCallbackWithResult(new TimeoutException(access26100.onNavigationEvent(this.timeout, this.unit)));
                this.worker.dispose();
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this.upstream);
            this.worker.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(this.upstream.get());
        }
    }

    static final class onWarmupCompleted implements Runnable {
        final long IAuthTabCallback;
        final IAuthTabCallback onNavigationEvent;

        onWarmupCompleted(long j, IAuthTabCallback iAuthTabCallback) {
            this.IAuthTabCallback = j;
            this.onNavigationEvent = iAuthTabCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.onNavigationEvent.onExtraCallbackWithResult(this.IAuthTabCallback);
        }
    }

    static final class onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<T>, deserializeUriNullableCollection, IAuthTabCallback {
        private static final long serialVersionUID = 3764492702657003550L;
        final writeQuoted<? super T> downstream;
        serializeRaw<? extends T> fallback;
        final long timeout;
        final TimeUnit unit;
        final MapConverter.onNavigationEvent worker;
        final deserializeShortArray task = new deserializeShortArray();
        final AtomicLong index = new AtomicLong();
        final AtomicReference<deserializeUriNullableCollection> upstream = new AtomicReference<>();

        onExtraCallback(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent, serializeRaw<? extends T> serializeraw) {
            this.downstream = writequoted;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = onnavigationevent;
            this.fallback = serializeraw;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.upstream, deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            long j = this.index.get();
            if (j != LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    this.task.get().dispose();
                    this.downstream.onExtraCallback(t);
                    onExtraCallback(j2);
                }
            }
        }

        void onExtraCallback(long j) {
            this.task.IAuthTabCallback(this.worker.onNavigationEvent(new onWarmupCompleted(j, this), this.timeout, this.unit));
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.index.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onExtraCallbackWithResult(th);
                this.worker.dispose();
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.index.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onExtraCallback();
                this.worker.dispose();
            }
        }

        @Override // o.access10500.IAuthTabCallback
        public void onExtraCallbackWithResult(long j) {
            if (this.index.compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                deserializeNumber.dispose(this.upstream);
                serializeRaw<? extends T> serializeraw = this.fallback;
                this.fallback = null;
                serializeraw.subscribe(new onNavigationEvent(this.downstream, this));
                this.worker.dispose();
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this.upstream);
            deserializeNumber.dispose(this);
            this.worker.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }
    }

    static final class onNavigationEvent<T> implements writeQuoted<T> {
        final AtomicReference<deserializeUriNullableCollection> onExtraCallback;
        final writeQuoted<? super T> onWarmupCompleted;

        onNavigationEvent(writeQuoted<? super T> writequoted, AtomicReference<deserializeUriNullableCollection> atomicReference) {
            this.onWarmupCompleted = writequoted;
            this.onExtraCallback = atomicReference;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.replace(this.onExtraCallback, deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.onWarmupCompleted.onExtraCallback(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.onWarmupCompleted.onExtraCallback();
        }
    }
}
