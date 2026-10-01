package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addAllDeallocationBacktrace<T> extends writeRaw<T> {
    final deserializeIp<T> onExtraCallback;
    final deserializeFloat<? super T> onExtraCallbackWithResult;

    public addAllDeallocationBacktrace(deserializeIp<T> deserializeip, deserializeFloat<? super T> deserializefloat) {
        this.onExtraCallback = deserializeip;
        this.onExtraCallbackWithResult = deserializefloat;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onExtraCallback.IAuthTabCallback(new IAuthTabCallback(deserializeipnullablecollection));
    }

    final class IAuthTabCallback implements deserializeIpNullableCollection<T> {
        final deserializeIpNullableCollection<? super T> onExtraCallbackWithResult;

        IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
            this.onExtraCallbackWithResult = deserializeipnullablecollection;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onExtraCallbackWithResult.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            try {
                addAllDeallocationBacktrace.this.onExtraCallbackWithResult.accept(t);
                this.onExtraCallbackWithResult.onNavigationEvent(t);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
        }
    }
}
