package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access24800$onWarmupCompleted<T, R> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<R>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 854110278590336484L;
    final writeQuoted<? super R> downstream;
    deserializeUriNullableCollection upstream;

    access24800$onWarmupCompleted(writeQuoted<? super R> writequoted) {
        this.downstream = writequoted;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
            this.upstream = deserializeurinullablecollection;
            this.downstream.IAuthTabCallback(this);
        }
    }

    public void onExtraCallback(R r) {
        this.downstream.onExtraCallback(r);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        deserializeNumber.dispose(this);
        this.downstream.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        deserializeNumber.dispose(this);
        this.downstream.onExtraCallback();
    }

    public void dispose() {
        this.upstream.dispose();
        deserializeNumber.dispose(this);
    }

    public boolean isDisposed() {
        return this.upstream.isDisposed();
    }
}
