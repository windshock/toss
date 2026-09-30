package io.reactivex.disposables;

import java.util.concurrent.atomic.AtomicReference;
import o.deserializeUriNullableCollection;
import o.floatExponent;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class ReferenceDisposable<T> extends AtomicReference<T> implements deserializeUriNullableCollection {
    private static final long serialVersionUID = 6537757548749041217L;

    protected abstract void IAuthTabCallback(T t);

    public ReferenceDisposable(T t) {
        super(floatExponent.onExtraCallbackWithResult((Object) t, "value is null"));
    }

    @Override // o.deserializeUriNullableCollection
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        IAuthTabCallback(andSet);
    }

    @Override // o.deserializeUriNullableCollection
    public final boolean isDisposed() {
        return get() == null;
    }
}
