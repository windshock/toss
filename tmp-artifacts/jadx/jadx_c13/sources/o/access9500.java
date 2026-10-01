package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access9500<T> extends writeRaw<T> {
    final deserializeFloat<? super Throwable> onExtraCallbackWithResult;
    final deserializeIp<T> onWarmupCompleted;

    public access9500(deserializeIp<T> deserializeip, deserializeFloat<? super Throwable> deserializefloat) {
        this.onWarmupCompleted = deserializeip;
        this.onExtraCallbackWithResult = deserializefloat;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onWarmupCompleted.IAuthTabCallback(new onWarmupCompleted(deserializeipnullablecollection));
    }

    final class onWarmupCompleted implements deserializeIpNullableCollection<T> {
        private final deserializeIpNullableCollection<? super T> onExtraCallback;

        onWarmupCompleted(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
            this.onExtraCallback = deserializeipnullablecollection;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onExtraCallback.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            this.onExtraCallback.onNavigationEvent(t);
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            try {
                access9500.this.onExtraCallbackWithResult.accept(th);
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                th = new deserializeDecimal(th, th2);
            }
            this.onExtraCallback.onExtraCallbackWithResult(th);
        }
    }
}
