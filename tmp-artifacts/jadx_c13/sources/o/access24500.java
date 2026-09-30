package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access24500<T> extends setPc<T, T> {
    final deserializeIntNullableCollection<? super Throwable, ? extends T> IAuthTabCallback;

    public access24500(serializeRaw<T> serializeraw, deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection) {
        super(serializeraw);
        this.IAuthTabCallback = deserializeintnullablecollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onExtraCallback(writequoted, this.IAuthTabCallback));
    }

    static final class onExtraCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        deserializeUriNullableCollection IAuthTabCallback;
        final deserializeIntNullableCollection<? super Throwable, ? extends T> onExtraCallbackWithResult;
        final writeQuoted<? super T> onNavigationEvent;

        onExtraCallback(writeQuoted<? super T> writequoted, deserializeIntNullableCollection<? super Throwable, ? extends T> deserializeintnullablecollection) {
            this.onNavigationEvent = writequoted;
            this.onExtraCallbackWithResult = deserializeintnullablecollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallback, deserializeurinullablecollection)) {
                this.IAuthTabCallback = deserializeurinullablecollection;
                this.onNavigationEvent.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.onNavigationEvent.onExtraCallback(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            try {
                T tApply = this.onExtraCallbackWithResult.apply(th);
                if (tApply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.onNavigationEvent.onExtraCallbackWithResult(nullPointerException);
                } else {
                    this.onNavigationEvent.onExtraCallback(tApply);
                    this.onNavigationEvent.onExtraCallback();
                }
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.onNavigationEvent.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.onNavigationEvent.onExtraCallback();
        }
    }
}
