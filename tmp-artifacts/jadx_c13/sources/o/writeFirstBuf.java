package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class writeFirstBuf<T> implements writeQuoted<T>, deserializeUriNullableCollection {
    final deserializeFloat<? super deserializeUriNullableCollection> IAuthTabCallback;
    deserializeUriNullableCollection onExtraCallbackWithResult;
    final writeQuoted<? super T> onNavigationEvent;
    final deserializeDecimalCollection onWarmupCompleted;

    public writeFirstBuf(writeQuoted<? super T> writequoted, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat, deserializeDecimalCollection deserializedecimalcollection) {
        this.onNavigationEvent = writequoted;
        this.IAuthTabCallback = deserializefloat;
        this.onWarmupCompleted = deserializedecimalcollection;
    }

    @Override // o.writeQuoted
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        try {
            this.IAuthTabCallback.accept(deserializeurinullablecollection);
            if (deserializeNumber.validate(this.onExtraCallbackWithResult, deserializeurinullablecollection)) {
                this.onExtraCallbackWithResult = deserializeurinullablecollection;
                this.onNavigationEvent.IAuthTabCallback(this);
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            deserializeurinullablecollection.dispose();
            this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
            deserializeShort.error(th, this.onNavigationEvent);
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback(T t) {
        this.onNavigationEvent.onExtraCallback(t);
    }

    @Override // o.writeQuoted
    public void onExtraCallbackWithResult(Throwable th) {
        deserializeUriNullableCollection deserializeurinullablecollection = this.onExtraCallbackWithResult;
        deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
        if (deserializeurinullablecollection != deserializenumber) {
            this.onExtraCallbackWithResult = deserializenumber;
            this.onNavigationEvent.onExtraCallbackWithResult(th);
        } else {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback() {
        deserializeUriNullableCollection deserializeurinullablecollection = this.onExtraCallbackWithResult;
        deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
        if (deserializeurinullablecollection != deserializenumber) {
            this.onExtraCallbackWithResult = deserializenumber;
            this.onNavigationEvent.onExtraCallback();
        }
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        deserializeUriNullableCollection deserializeurinullablecollection = this.onExtraCallbackWithResult;
        deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
        if (deserializeurinullablecollection != deserializenumber) {
            this.onExtraCallbackWithResult = deserializenumber;
            try {
                this.onWarmupCompleted.run();
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
            deserializeurinullablecollection.dispose();
        }
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return this.onExtraCallbackWithResult.isDisposed();
    }
}
