package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class clearFileMapOffset$onExtraCallback<T, R> extends AtomicReference<deserializeUriNullableCollection> implements ensureCapacity<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 4375739915521278546L;
    final ensureCapacity<? super R> downstream;
    final deserializeIntNullableCollection<? super T, ? extends writeAscii<? extends R>> mapper;
    deserializeUriNullableCollection upstream;

    clearFileMapOffset$onExtraCallback(ensureCapacity<? super R> ensurecapacity, deserializeIntNullableCollection<? super T, ? extends writeAscii<? extends R>> deserializeintnullablecollection) {
        this.downstream = ensurecapacity;
        this.mapper = deserializeintnullablecollection;
    }

    public void dispose() {
        deserializeNumber.dispose(this);
        this.upstream.dispose();
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
            this.upstream = deserializeurinullablecollection;
            this.downstream.IAuthTabCallback(this);
        }
    }

    public void onNavigationEvent(T t) {
        try {
            writeAscii writeascii = (writeAscii) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null MaybeSource");
            if (isDisposed()) {
                return;
            }
            writeascii.onExtraCallback(new onExtraCallbackWithResult());
        } catch (Exception e) {
            NumberConverter.onWarmupCompleted(e);
            this.downstream.onExtraCallbackWithResult(e);
        }
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.downstream.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        this.downstream.onExtraCallback();
    }

    final class onExtraCallbackWithResult implements ensureCapacity<R> {
        onExtraCallbackWithResult() {
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(clearFileMapOffset$onExtraCallback.this, deserializeurinullablecollection);
        }

        public void onNavigationEvent(R r) {
            clearFileMapOffset$onExtraCallback.this.downstream.onNavigationEvent(r);
        }

        public void onExtraCallbackWithResult(Throwable th) {
            clearFileMapOffset$onExtraCallback.this.downstream.onExtraCallbackWithResult(th);
        }

        public void onExtraCallback() {
            clearFileMapOffset$onExtraCallback.this.downstream.onExtraCallback();
        }
    }
}
