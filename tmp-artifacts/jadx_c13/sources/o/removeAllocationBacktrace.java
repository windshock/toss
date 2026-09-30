package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class removeAllocationBacktrace<T> extends writeRaw<T> {
    final deserializeIp<? extends T> IAuthTabCallback;
    final MapConverter onNavigationEvent;

    public removeAllocationBacktrace(deserializeIp<? extends T> deserializeip, MapConverter mapConverter) {
        this.IAuthTabCallback = deserializeip;
        this.onNavigationEvent = mapConverter;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(deserializeipnullablecollection, this.IAuthTabCallback);
        deserializeipnullablecollection.IAuthTabCallback(onwarmupcompleted);
        onwarmupcompleted.task.IAuthTabCallback(this.onNavigationEvent.onExtraCallback(onwarmupcompleted));
    }

    static final class onWarmupCompleted<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        final deserializeIpNullableCollection<? super T> downstream;
        final deserializeIp<? extends T> source;
        final deserializeShortArray task = new deserializeShortArray();

        onWarmupCompleted(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, deserializeIp<? extends T> deserializeip) {
            this.downstream = deserializeipnullablecollection;
            this.source = deserializeip;
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

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
            this.task.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.IAuthTabCallback(this);
        }
    }
}
