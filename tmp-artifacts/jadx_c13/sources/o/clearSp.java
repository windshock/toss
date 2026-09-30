package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearSp<T> extends access18900<T, T> {
    final deserializeDecimalCollection IAuthTabCallback;
    final deserializeFloat<? super deserializeUriNullableCollection> asBinder;
    final deserializeDecimalCollection onExtraCallbackWithResult;
    final deserializeFloat<? super Throwable> onNavigationEvent;
    final deserializeFloat<? super T> onTransact;
    final deserializeDecimalCollection onWarmupCompleted;

    public clearSp(writeAscii<T> writeascii, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat, deserializeFloat<? super T> deserializefloat2, deserializeFloat<? super Throwable> deserializefloat3, deserializeDecimalCollection deserializedecimalcollection, deserializeDecimalCollection deserializedecimalcollection2, deserializeDecimalCollection deserializedecimalcollection3) {
        super(writeascii);
        this.asBinder = deserializefloat;
        this.onTransact = deserializefloat2;
        this.onNavigationEvent = deserializefloat3;
        this.IAuthTabCallback = deserializedecimalcollection;
        this.onExtraCallbackWithResult = deserializedecimalcollection2;
        this.onWarmupCompleted = deserializedecimalcollection3;
    }

    @Override // o.advance
    public void onNavigationEvent(ensureCapacity<? super T> ensurecapacity) {
        this.onExtraCallback.onExtraCallback(new onExtraCallbackWithResult(ensurecapacity, this));
    }

    static final class onExtraCallbackWithResult<T> implements ensureCapacity<T>, deserializeUriNullableCollection {
        final clearSp<T> IAuthTabCallback;
        final ensureCapacity<? super T> onExtraCallback;
        deserializeUriNullableCollection onExtraCallbackWithResult;

        onExtraCallbackWithResult(ensureCapacity<? super T> ensurecapacity, clearSp<T> clearsp) {
            this.onExtraCallback = ensurecapacity;
            this.IAuthTabCallback = clearsp;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            try {
                this.IAuthTabCallback.onWarmupCompleted.run();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
            this.onExtraCallbackWithResult.dispose();
            this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallbackWithResult.isDisposed();
        }

        @Override // o.ensureCapacity
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallbackWithResult, deserializeurinullablecollection)) {
                try {
                    this.IAuthTabCallback.asBinder.accept(deserializeurinullablecollection);
                    this.onExtraCallbackWithResult = deserializeurinullablecollection;
                    this.onExtraCallback.IAuthTabCallback(this);
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    deserializeurinullablecollection.dispose();
                    this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
                    deserializeShort.error(th, this.onExtraCallback);
                }
            }
        }

        @Override // o.ensureCapacity
        public void onNavigationEvent(T t) {
            deserializeUriNullableCollection deserializeurinullablecollection = this.onExtraCallbackWithResult;
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber) {
                return;
            }
            try {
                this.IAuthTabCallback.onTransact.accept(t);
                this.onExtraCallbackWithResult = deserializenumber;
                this.onExtraCallback.onNavigationEvent(t);
                onWarmupCompleted();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                onWarmupCompleted(th);
            }
        }

        @Override // o.ensureCapacity
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onExtraCallbackWithResult == deserializeNumber.DISPOSED) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                onWarmupCompleted(th);
            }
        }

        void onWarmupCompleted(Throwable th) {
            try {
                this.IAuthTabCallback.onNavigationEvent.accept(th);
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                th = new deserializeDecimal(th, th2);
            }
            this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
            this.onExtraCallback.onExtraCallbackWithResult(th);
            onWarmupCompleted();
        }

        @Override // o.ensureCapacity
        public void onExtraCallback() {
            deserializeUriNullableCollection deserializeurinullablecollection = this.onExtraCallbackWithResult;
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber) {
                return;
            }
            try {
                this.IAuthTabCallback.IAuthTabCallback.run();
                this.onExtraCallbackWithResult = deserializenumber;
                this.onExtraCallback.onExtraCallback();
                onWarmupCompleted();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                onWarmupCompleted(th);
            }
        }

        void onWarmupCompleted() {
            try {
                this.IAuthTabCallback.onExtraCallbackWithResult.run();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }
    }
}
