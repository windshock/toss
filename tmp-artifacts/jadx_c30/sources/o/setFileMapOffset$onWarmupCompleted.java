package o;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setFileMapOffset$onWarmupCompleted<T> implements ensureCapacity<T>, deserializeUriNullableCollection {
    final deserializeIpNullableCollection<? super T> onExtraCallback;
    deserializeUriNullableCollection onExtraCallbackWithResult;
    final T onWarmupCompleted;

    setFileMapOffset$onWarmupCompleted(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, T t) {
        this.onExtraCallback = deserializeipnullablecollection;
        this.onWarmupCompleted = t;
    }

    public void dispose() {
        this.onExtraCallbackWithResult.dispose();
        this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
    }

    public boolean isDisposed() {
        return this.onExtraCallbackWithResult.isDisposed();
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.onExtraCallbackWithResult, deserializeurinullablecollection)) {
            this.onExtraCallbackWithResult = deserializeurinullablecollection;
            this.onExtraCallback.IAuthTabCallback(this);
        }
    }

    public void onNavigationEvent(T t) {
        this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
        this.onExtraCallback.onNavigationEvent(t);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
        this.onExtraCallback.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        this.onExtraCallbackWithResult = deserializeNumber.DISPOSED;
        T t = this.onWarmupCompleted;
        if (t != null) {
            this.onExtraCallback.onNavigationEvent(t);
        } else {
            this.onExtraCallback.onExtraCallbackWithResult(new NoSuchElementException("The MaybeSource is empty"));
        }
    }
}
