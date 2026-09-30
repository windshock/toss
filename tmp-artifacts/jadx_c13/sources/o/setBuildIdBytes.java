package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setBuildIdBytes<T, R> extends access18900<T, R> {
    final deserializeIntNullableCollection<? super T, ? extends R> onWarmupCompleted;

    public setBuildIdBytes(writeAscii<T> writeascii, deserializeIntNullableCollection<? super T, ? extends R> deserializeintnullablecollection) {
        super(writeascii);
        this.onWarmupCompleted = deserializeintnullablecollection;
    }

    @Override // o.advance
    public void onNavigationEvent(ensureCapacity<? super R> ensurecapacity) {
        this.onExtraCallback.onExtraCallback(new IAuthTabCallback(ensurecapacity, this.onWarmupCompleted));
    }

    static final class IAuthTabCallback<T, R> implements ensureCapacity<T>, deserializeUriNullableCollection {
        final ensureCapacity<? super R> onExtraCallbackWithResult;
        final deserializeIntNullableCollection<? super T, ? extends R> onNavigationEvent;
        deserializeUriNullableCollection onWarmupCompleted;

        IAuthTabCallback(ensureCapacity<? super R> ensurecapacity, deserializeIntNullableCollection<? super T, ? extends R> deserializeintnullablecollection) {
            this.onExtraCallbackWithResult = ensurecapacity;
            this.onNavigationEvent = deserializeintnullablecollection;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeUriNullableCollection deserializeurinullablecollection = this.onWarmupCompleted;
            this.onWarmupCompleted = deserializeNumber.DISPOSED;
            deserializeurinullablecollection.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted.isDisposed();
        }

        @Override // o.ensureCapacity
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onWarmupCompleted, deserializeurinullablecollection)) {
                this.onWarmupCompleted = deserializeurinullablecollection;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
            }
        }

        @Override // o.ensureCapacity
        public void onNavigationEvent(T t) {
            try {
                this.onExtraCallbackWithResult.onNavigationEvent(floatExponent.onExtraCallbackWithResult(this.onNavigationEvent.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.ensureCapacity
        public void onExtraCallbackWithResult(Throwable th) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
        }

        @Override // o.ensureCapacity
        public void onExtraCallback() {
            this.onExtraCallbackWithResult.onExtraCallback();
        }
    }
}
