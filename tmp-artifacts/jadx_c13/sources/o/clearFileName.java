package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearFileName<T> extends advance<T> {
    final deserializeLongCollection<? super T> IAuthTabCallback;
    final deserializeIp<T> onNavigationEvent;

    public clearFileName(deserializeIp<T> deserializeip, deserializeLongCollection<? super T> deserializelongcollection) {
        this.onNavigationEvent = deserializeip;
        this.IAuthTabCallback = deserializelongcollection;
    }

    @Override // o.advance
    public void onNavigationEvent(ensureCapacity<? super T> ensurecapacity) {
        this.onNavigationEvent.IAuthTabCallback(new onExtraCallback(ensurecapacity, this.IAuthTabCallback));
    }

    static final class onExtraCallback<T> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
        final ensureCapacity<? super T> onExtraCallbackWithResult;
        deserializeUriNullableCollection onNavigationEvent;
        final deserializeLongCollection<? super T> onWarmupCompleted;

        onExtraCallback(ensureCapacity<? super T> ensurecapacity, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onExtraCallbackWithResult = ensurecapacity;
            this.onWarmupCompleted = deserializelongcollection;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeUriNullableCollection deserializeurinullablecollection = this.onNavigationEvent;
            this.onNavigationEvent = deserializeNumber.DISPOSED;
            deserializeurinullablecollection.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onNavigationEvent.isDisposed();
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onNavigationEvent, deserializeurinullablecollection)) {
                this.onNavigationEvent = deserializeurinullablecollection;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            try {
                if (this.onWarmupCompleted.test(t)) {
                    this.onExtraCallbackWithResult.onNavigationEvent(t);
                } else {
                    this.onExtraCallbackWithResult.onExtraCallback();
                }
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
