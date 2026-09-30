package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setDeallocationTid<T> extends writeRaw<T> {
    final MapConverter IAuthTabCallback;
    final deserializeIp<T> onExtraCallback;
    final deserializeIp<? extends T> onExtraCallbackWithResult;
    final TimeUnit onNavigationEvent;
    final long onWarmupCompleted;

    public setDeallocationTid(deserializeIp<T> deserializeip, long j, TimeUnit timeUnit, MapConverter mapConverter, deserializeIp<? extends T> deserializeip2) {
        this.onExtraCallback = deserializeip;
        this.onWarmupCompleted = j;
        this.onNavigationEvent = timeUnit;
        this.IAuthTabCallback = mapConverter;
        this.onExtraCallbackWithResult = deserializeip2;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        onExtraCallback onextracallback = new onExtraCallback(deserializeipnullablecollection, this.onExtraCallbackWithResult, this.onWarmupCompleted, this.onNavigationEvent);
        deserializeipnullablecollection.IAuthTabCallback(onextracallback);
        deserializeNumber.replace(onextracallback.task, this.IAuthTabCallback.onNavigationEvent(onextracallback, this.onWarmupCompleted, this.onNavigationEvent));
        this.onExtraCallback.IAuthTabCallback(onextracallback);
    }

    static final class onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, Runnable, deserializeUriNullableCollection {
        private static final long serialVersionUID = 37497744973048446L;
        final deserializeIpNullableCollection<? super T> downstream;
        final IAuthTabCallback<T> fallback;
        deserializeIp<? extends T> other;
        final AtomicReference<deserializeUriNullableCollection> task = new AtomicReference<>();
        final long timeout;
        final TimeUnit unit;

        static final class IAuthTabCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T> {
            private static final long serialVersionUID = 2071387740092105509L;
            final deserializeIpNullableCollection<? super T> downstream;

            IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
                this.downstream = deserializeipnullablecollection;
            }

            @Override // o.deserializeIpNullableCollection
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.setOnce(this, deserializeurinullablecollection);
            }

            @Override // o.deserializeIpNullableCollection
            public void onNavigationEvent(T t) {
                this.downstream.onNavigationEvent(t);
            }

            @Override // o.deserializeIpNullableCollection
            public void onExtraCallbackWithResult(Throwable th) {
                this.downstream.onExtraCallbackWithResult(th);
            }
        }

        onExtraCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, deserializeIp<? extends T> deserializeip, long j, TimeUnit timeUnit) {
            this.downstream = deserializeipnullablecollection;
            this.other = deserializeip;
            this.timeout = j;
            this.unit = timeUnit;
            if (deserializeip != null) {
                this.fallback = new IAuthTabCallback<>(deserializeipnullablecollection);
            } else {
                this.fallback = null;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || !compareAndSet(deserializeurinullablecollection, deserializenumber)) {
                return;
            }
            if (deserializeurinullablecollection != null) {
                deserializeurinullablecollection.dispose();
            }
            deserializeIp<? extends T> deserializeip = this.other;
            if (deserializeip == null) {
                this.downstream.onExtraCallbackWithResult(new TimeoutException(access26100.onNavigationEvent(this.timeout, this.unit)));
            } else {
                this.other = null;
                deserializeip.IAuthTabCallback(this.fallback);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || !compareAndSet(deserializeurinullablecollection, deserializenumber)) {
                return;
            }
            deserializeNumber.dispose(this.task);
            this.downstream.onNavigationEvent(t);
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection != deserializenumber && compareAndSet(deserializeurinullablecollection, deserializenumber)) {
                deserializeNumber.dispose(this.task);
                this.downstream.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
            deserializeNumber.dispose(this.task);
            IAuthTabCallback<T> iAuthTabCallback = this.fallback;
            if (iAuthTabCallback != null) {
                deserializeNumber.dispose(iAuthTabCallback);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }
    }
}
