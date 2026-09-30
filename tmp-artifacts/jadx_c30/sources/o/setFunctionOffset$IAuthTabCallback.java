package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setFunctionOffset$IAuthTabCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements ensureCapacity<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = -2223459372976438024L;
    final ensureCapacity<? super T> downstream;
    final writeAscii<? extends T> other;

    setFunctionOffset$IAuthTabCallback(ensureCapacity<? super T> ensurecapacity, writeAscii<? extends T> writeascii) {
        this.downstream = ensurecapacity;
        this.other = writeascii;
    }

    public void dispose() {
        deserializeNumber.dispose(this);
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
            this.downstream.IAuthTabCallback(this);
        }
    }

    public void onNavigationEvent(T t) {
        this.downstream.onNavigationEvent(t);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.downstream.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        deserializeNumber deserializenumber = (deserializeUriNullableCollection) get();
        if (deserializenumber == deserializeNumber.DISPOSED || !compareAndSet(deserializenumber, null)) {
            return;
        }
        this.other.onExtraCallback(new onExtraCallback(this.downstream, this));
    }

    static final class onExtraCallback<T> implements ensureCapacity<T> {
        final AtomicReference<deserializeUriNullableCollection> onExtraCallbackWithResult;
        final ensureCapacity<? super T> onWarmupCompleted;

        onExtraCallback(ensureCapacity<? super T> ensurecapacity, AtomicReference<deserializeUriNullableCollection> atomicReference) {
            this.onWarmupCompleted = ensurecapacity;
            this.onExtraCallbackWithResult = atomicReference;
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.onExtraCallbackWithResult, deserializeurinullablecollection);
        }

        public void onNavigationEvent(T t) {
            this.onWarmupCompleted.onNavigationEvent(t);
        }

        public void onExtraCallbackWithResult(Throwable th) {
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        public void onExtraCallback() {
            this.onWarmupCompleted.onExtraCallback();
        }
    }
}
