package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ensureAllocationBacktraceIsMutable<T> extends writeRaw<T> {
    final deserializeIp<T> onExtraCallback;
    final MapConverter onWarmupCompleted;

    public ensureAllocationBacktraceIsMutable(deserializeIp<T> deserializeip, MapConverter mapConverter) {
        this.onExtraCallback = deserializeip;
        this.onWarmupCompleted = mapConverter;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onExtraCallback.IAuthTabCallback(new onExtraCallback(deserializeipnullablecollection, this.onWarmupCompleted));
    }

    static final class onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final deserializeIpNullableCollection<? super T> downstream;
        Throwable error;
        final MapConverter scheduler;
        T value;

        onExtraCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, MapConverter mapConverter) {
            this.downstream = deserializeipnullablecollection;
            this.scheduler = mapConverter;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            this.value = t;
            deserializeNumber.replace(this, this.scheduler.onExtraCallback(this));
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.error = th;
            deserializeNumber.replace(this, this.scheduler.onExtraCallback(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onExtraCallbackWithResult(th);
            } else {
                this.downstream.onNavigationEvent(this.value);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }
    }
}
