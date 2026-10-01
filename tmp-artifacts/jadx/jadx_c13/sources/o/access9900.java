package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access9900<T, R> extends writeRaw<R> {
    final deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> onExtraCallback;
    final deserializeIp<? extends T> onNavigationEvent;

    public access9900(deserializeIp<? extends T> deserializeip, deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection) {
        this.onExtraCallback = deserializeintnullablecollection;
        this.onNavigationEvent = deserializeip;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super R> deserializeipnullablecollection) {
        this.onNavigationEvent.IAuthTabCallback(new onExtraCallbackWithResult(deserializeipnullablecollection, this.onExtraCallback));
    }

    static final class onExtraCallbackWithResult<T, R> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = 3258103020495908596L;
        final deserializeIpNullableCollection<? super R> downstream;
        final deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> mapper;

        onExtraCallbackWithResult(deserializeIpNullableCollection<? super R> deserializeipnullablecollection, deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection) {
            this.downstream = deserializeipnullablecollection;
            this.mapper = deserializeintnullablecollection;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            try {
                deserializeIp deserializeip = (deserializeIp) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The single returned by the mapper is null");
                if (isDisposed()) {
                    return;
                }
                deserializeip.IAuthTabCallback(new C0024onExtraCallbackWithResult(this, this.downstream));
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.downstream.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.downstream.onExtraCallbackWithResult(th);
        }

        /* renamed from: o.access9900$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        static final class C0024onExtraCallbackWithResult<R> implements deserializeIpNullableCollection<R> {
            final deserializeIpNullableCollection<? super R> IAuthTabCallback;
            final AtomicReference<deserializeUriNullableCollection> onNavigationEvent;

            C0024onExtraCallbackWithResult(AtomicReference<deserializeUriNullableCollection> atomicReference, deserializeIpNullableCollection<? super R> deserializeipnullablecollection) {
                this.onNavigationEvent = atomicReference;
                this.IAuthTabCallback = deserializeipnullablecollection;
            }

            @Override // o.deserializeIpNullableCollection
            public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                deserializeNumber.replace(this.onNavigationEvent, deserializeurinullablecollection);
            }

            @Override // o.deserializeIpNullableCollection
            public void onNavigationEvent(R r) {
                this.IAuthTabCallback.onNavigationEvent(r);
            }

            @Override // o.deserializeIpNullableCollection
            public void onExtraCallbackWithResult(Throwable th) {
                this.IAuthTabCallback.onExtraCallbackWithResult(th);
            }
        }
    }
}
