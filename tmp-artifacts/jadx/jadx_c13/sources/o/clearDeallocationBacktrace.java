package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearDeallocationBacktrace<T, R> extends writeRaw<R> {
    final deserializeIp<? extends T> IAuthTabCallback;
    final deserializeIntNullableCollection<? super T, ? extends R> onNavigationEvent;

    public clearDeallocationBacktrace(deserializeIp<? extends T> deserializeip, deserializeIntNullableCollection<? super T, ? extends R> deserializeintnullablecollection) {
        this.IAuthTabCallback = deserializeip;
        this.onNavigationEvent = deserializeintnullablecollection;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super R> deserializeipnullablecollection) {
        this.IAuthTabCallback.IAuthTabCallback(new IAuthTabCallback(deserializeipnullablecollection, this.onNavigationEvent));
    }

    static final class IAuthTabCallback<T, R> implements deserializeIpNullableCollection<T> {
        final deserializeIntNullableCollection<? super T, ? extends R> IAuthTabCallback;
        final deserializeIpNullableCollection<? super R> onNavigationEvent;

        IAuthTabCallback(deserializeIpNullableCollection<? super R> deserializeipnullablecollection, deserializeIntNullableCollection<? super T, ? extends R> deserializeintnullablecollection) {
            this.onNavigationEvent = deserializeipnullablecollection;
            this.IAuthTabCallback = deserializeintnullablecollection;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onNavigationEvent.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            try {
                this.onNavigationEvent.onNavigationEvent(floatExponent.onExtraCallbackWithResult(this.IAuthTabCallback.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.onNavigationEvent.onExtraCallbackWithResult(th);
        }
    }
}
