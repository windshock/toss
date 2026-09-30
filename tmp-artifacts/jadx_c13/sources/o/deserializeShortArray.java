package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class deserializeShortArray extends AtomicReference<deserializeUriNullableCollection> implements deserializeUriNullableCollection {
    private static final long serialVersionUID = -754898800686245608L;

    public deserializeShortArray() {
    }

    public deserializeShortArray(deserializeUriNullableCollection deserializeurinullablecollection) {
        lazySet(deserializeurinullablecollection);
    }

    public boolean onExtraCallbackWithResult(deserializeUriNullableCollection deserializeurinullablecollection) {
        return deserializeNumber.set(this, deserializeurinullablecollection);
    }

    public boolean IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        return deserializeNumber.replace(this, deserializeurinullablecollection);
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        deserializeNumber.dispose(this);
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }
}
