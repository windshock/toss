package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setFileNameBytes$onNavigationEvent<R> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<R>, JsonReaderDoublePrecision, deserializeUriNullableCollection {
    private static final long serialVersionUID = -8948264376121066672L;
    final writeQuoted<? super R> downstream;
    serializeRaw<? extends R> other;

    setFileNameBytes$onNavigationEvent(writeQuoted<? super R> writequoted, serializeRaw<? extends R> serializeraw) {
        this.other = serializeraw;
        this.downstream = writequoted;
    }

    public void onExtraCallback(R r) {
        this.downstream.onExtraCallback(r);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.downstream.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        serializeRaw<? extends R> serializeraw = this.other;
        if (serializeraw == null) {
            this.downstream.onExtraCallback();
        } else {
            this.other = null;
            serializeraw.subscribe(this);
        }
    }

    public void dispose() {
        deserializeNumber.dispose(this);
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.replace(this, deserializeurinullablecollection);
    }
}
