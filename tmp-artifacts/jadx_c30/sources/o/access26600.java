package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class access26600<T> implements writeQuoted<T>, deserializeUriNullableCollection {
    final AtomicReference<deserializeUriNullableCollection> onWarmupCompleted = new AtomicReference<>();

    public final void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        getLogsList.onExtraCallbackWithResult(this.onWarmupCompleted, deserializeurinullablecollection, getClass());
    }

    public final boolean isDisposed() {
        return this.onWarmupCompleted.get() == deserializeNumber.DISPOSED;
    }

    public final void dispose() {
        deserializeNumber.dispose(this.onWarmupCompleted);
    }
}
