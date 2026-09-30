package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access19200<T> extends AtomicReference<deserializeUriNullableCollection> implements ensureCapacity<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = -6076952298809384986L;
    final deserializeDecimalCollection onComplete;
    final deserializeFloat<? super Throwable> onError;
    final deserializeFloat<? super T> onSuccess;

    public access19200(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection) {
        this.onSuccess = deserializefloat;
        this.onError = deserializefloat2;
        this.onComplete = deserializedecimalcollection;
    }

    @Override // o.deserializeUriNullableCollection
    public void dispose() {
        deserializeNumber.dispose(this);
    }

    @Override // o.deserializeUriNullableCollection
    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }

    @Override // o.ensureCapacity
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this, deserializeurinullablecollection);
    }

    @Override // o.ensureCapacity
    public void onNavigationEvent(T t) {
        lazySet(deserializeNumber.DISPOSED);
        try {
            this.onSuccess.accept(t);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }

    @Override // o.ensureCapacity
    public void onExtraCallbackWithResult(Throwable th) {
        lazySet(deserializeNumber.DISPOSED);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            NumberConverter.onWarmupCompleted(th2);
            RxJavaPlugins.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
        }
    }

    @Override // o.ensureCapacity
    public void onExtraCallback() {
        lazySet(deserializeNumber.DISPOSED);
        try {
            this.onComplete.run();
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }
}
