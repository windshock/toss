package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class ensureDeallocationBacktraceIsMutable<T> extends writeRaw<T> {
    final deserializeIp<? extends T> onExtraCallback;
    final deserializeIntNullableCollection<? super Throwable, ? extends T> onExtraCallbackWithResult;
    final T onNavigationEvent;

    public ensureDeallocationBacktraceIsMutable(deserializeIp<? extends T> deserializeip, deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection, T t) {
        this.onExtraCallback = deserializeip;
        this.onExtraCallbackWithResult = deserializeintnullablecollection;
        this.onNavigationEvent = t;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onExtraCallback.IAuthTabCallback(new IAuthTabCallback(deserializeipnullablecollection));
    }

    final class IAuthTabCallback implements deserializeIpNullableCollection<T> {
        private final deserializeIpNullableCollection<? super T> onWarmupCompleted;

        IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
            this.onWarmupCompleted = deserializeipnullablecollection;
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            T tApply;
            ensureDeallocationBacktraceIsMutable ensuredeallocationbacktraceismutable = ensureDeallocationBacktraceIsMutable.this;
            deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection = ensuredeallocationbacktraceismutable.onExtraCallbackWithResult;
            if (deserializeintnullablecollection != null) {
                try {
                    tApply = deserializeintnullablecollection.apply(th);
                } catch (Throwable th2) {
                    NumberConverter.onWarmupCompleted(th2);
                    this.onWarmupCompleted.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
                    return;
                }
            } else {
                tApply = ensuredeallocationbacktraceismutable.onNavigationEvent;
            }
            if (tApply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.onWarmupCompleted.onExtraCallbackWithResult(nullPointerException);
                return;
            }
            this.onWarmupCompleted.onNavigationEvent(tApply);
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            this.onWarmupCompleted.IAuthTabCallback(deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            this.onWarmupCompleted.onNavigationEvent(t);
        }
    }
}
