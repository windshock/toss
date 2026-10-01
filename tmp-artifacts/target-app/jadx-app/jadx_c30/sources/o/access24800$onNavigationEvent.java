package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access24800$onNavigationEvent<T, R> implements writeQuoted<T> {
    final AtomicReference<deserializeUriNullableCollection> onExtraCallback;
    final getTimestampBytes<T> onNavigationEvent;

    access24800$onNavigationEvent(getTimestampBytes<T> gettimestampbytes, AtomicReference<deserializeUriNullableCollection> atomicReference) {
        this.onNavigationEvent = gettimestampbytes;
        this.onExtraCallback = atomicReference;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this.onExtraCallback, deserializeurinullablecollection);
    }

    public void onExtraCallback(T t) {
        this.onNavigationEvent.onExtraCallback(t);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.onNavigationEvent.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        this.onNavigationEvent.onExtraCallback();
    }
}
