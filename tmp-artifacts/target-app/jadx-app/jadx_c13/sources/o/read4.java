package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class read4<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 4943102778943297569L;
    final deserializeDouble<? super T, ? super Throwable> onCallback;

    public read4(deserializeDouble<? super T, ? super Throwable> deserializedouble) {
        this.onCallback = deserializedouble;
    }

    @Override // o.deserializeIpNullableCollection
    public void onExtraCallbackWithResult(Throwable th) {
        try {
            lazySet(deserializeNumber.DISPOSED);
            this.onCallback.accept(null, th);
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
        try {
            lazySet(deserializeNumber.DISPOSED);
            this.onCallback.accept(t, null);
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
