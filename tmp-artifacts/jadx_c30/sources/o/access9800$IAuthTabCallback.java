package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access9800$IAuthTabCallback<T> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
    final deserializeDecimalCollection onExtraCallback;
    final deserializeIpNullableCollection<? super T> onNavigationEvent;
    deserializeUriNullableCollection onWarmupCompleted;

    access9800$IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, deserializeDecimalCollection deserializedecimalcollection) {
        this.onNavigationEvent = deserializeipnullablecollection;
        this.onExtraCallback = deserializedecimalcollection;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.onWarmupCompleted, deserializeurinullablecollection)) {
            this.onWarmupCompleted = deserializeurinullablecollection;
            this.onNavigationEvent.IAuthTabCallback(this);
        }
    }

    public void onNavigationEvent(T t) {
        this.onNavigationEvent.onNavigationEvent(t);
        IAuthTabCallback();
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.onNavigationEvent.onExtraCallbackWithResult(th);
        IAuthTabCallback();
    }

    public void dispose() {
        this.onWarmupCompleted.dispose();
    }

    public boolean isDisposed() {
        return this.onWarmupCompleted.isDisposed();
    }

    private void IAuthTabCallback() {
        try {
            this.onExtraCallback.run();
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }
}
