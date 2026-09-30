package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class writeBuf<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = -7012088219455310787L;
    final deserializeFloat<? super Throwable> onError;
    final deserializeFloat<? super T> onSuccess;

    public writeBuf(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2) {
        this.onSuccess = deserializefloat;
        this.onError = deserializefloat2;
    }

    @Override // o.deserializeIpNullableCollection
    public void onExtraCallbackWithResult(Throwable th) {
        lazySet(deserializeNumber.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            NumberConverter.onWarmupCompleted(th2);
            RxJavaPlugins.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
        }
    }

    @Override // o.deserializeIpNullableCollection
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this, deserializeurinullablecollection);
    }

    @Override // o.deserializeIpNullableCollection
    public void onNavigationEvent(T t) {
        lazySet(deserializeNumber.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        deserializeNumber.dispose(this);
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return get() == deserializeNumber.DISPOSED;
    }
}
