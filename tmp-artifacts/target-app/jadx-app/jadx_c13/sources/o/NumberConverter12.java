package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter12 extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, deserializeUriNullableCollection {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        deserializeNumber.dispose(this);
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return get() == deserializeNumber.DISPOSED;
    }

    @Override // o.JsonReaderDoublePrecision
    public void onExtraCallback() {
        lazySet(deserializeNumber.DISPOSED);
    }

    @Override // o.JsonReaderDoublePrecision
    public void onExtraCallbackWithResult(Throwable th) {
        lazySet(deserializeNumber.DISPOSED);
        RxJavaPlugins.onExtraCallbackWithResult(new approximateDouble(th));
    }

    @Override // o.JsonReaderDoublePrecision
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this, deserializeurinullablecollection);
    }
}
