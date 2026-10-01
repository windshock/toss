package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class clearRelPc$onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements ensureCapacity<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 2026620218879969836L;
    final boolean allowFatal;
    final ensureCapacity<? super T> downstream;
    final deserializeIntNullableCollection<? super Throwable, ? extends writeAscii<? extends T>> resumeFunction;

    clearRelPc$onExtraCallback(ensureCapacity<? super T> ensurecapacity, deserializeIntNullableCollection<? super Throwable, ? extends writeAscii<? extends T>> deserializeintnullablecollection, boolean z) {
        this.downstream = ensurecapacity;
        this.resumeFunction = deserializeintnullablecollection;
        this.allowFatal = z;
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
        if (!this.allowFatal && !(th instanceof Exception)) {
            this.downstream.onExtraCallbackWithResult(th);
            return;
        }
        try {
            writeAscii writeascii = (writeAscii) floatExponent.onExtraCallbackWithResult(this.resumeFunction.apply(th), "The resumeFunction returned a null MaybeSource");
            deserializeNumber.replace(this, (deserializeUriNullableCollection) null);
            writeascii.onExtraCallback(new onExtraCallback(this.downstream, this));
        } catch (Throwable th2) {
            NumberConverter.onWarmupCompleted(th2);
            this.downstream.onExtraCallbackWithResult(new deserializeDecimal(new Throwable[]{th, th2}));
        }
    }

    public void onExtraCallback() {
        this.downstream.onExtraCallback();
    }

    static final class onExtraCallback<T> implements ensureCapacity<T> {
        final AtomicReference<deserializeUriNullableCollection> IAuthTabCallback;
        final ensureCapacity<? super T> onExtraCallbackWithResult;

        onExtraCallback(ensureCapacity<? super T> ensurecapacity, AtomicReference<deserializeUriNullableCollection> atomicReference) {
            this.onExtraCallbackWithResult = ensurecapacity;
            this.IAuthTabCallback = atomicReference;
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.IAuthTabCallback, deserializeurinullablecollection);
        }

        public void onNavigationEvent(T t) {
            this.onExtraCallbackWithResult.onNavigationEvent(t);
        }

        public void onExtraCallbackWithResult(Throwable th) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
        }

        public void onExtraCallback() {
            this.onExtraCallbackWithResult.onExtraCallback();
        }
    }
}
