package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class NumberConverter1<T> extends AtomicReference<deserializeUriNullableCollection> implements writeQuoted<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = -7251123623727029452L;
    final deserializeDecimalCollection onComplete;
    final deserializeFloat<? super Throwable> onError;
    final deserializeFloat<? super T> onNext;
    final deserializeFloat<? super deserializeUriNullableCollection> onSubscribe;

    public NumberConverter1(deserializeFloat<? super T> deserializefloat, deserializeFloat<? super Throwable> deserializefloat2, deserializeDecimalCollection deserializedecimalcollection, deserializeFloat<? super deserializeUriNullableCollection> deserializefloat3) {
        this.onNext = deserializefloat;
        this.onError = deserializefloat2;
        this.onComplete = deserializedecimalcollection;
        this.onSubscribe = deserializefloat3;
    }

    @Override // o.writeQuoted
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                deserializeurinullablecollection.dispose();
                onExtraCallbackWithResult(th);
            }
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback(T t) {
        if (isDisposed()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            get().dispose();
            onExtraCallbackWithResult(th);
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallbackWithResult(Throwable th) {
        if (!isDisposed()) {
            lazySet(deserializeNumber.DISPOSED);
            try {
                this.onError.accept(th);
                return;
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                RxJavaPlugins.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
                return;
            }
        }
        RxJavaPlugins.onExtraCallbackWithResult(th);
    }

    @Override // o.writeQuoted
    public void onExtraCallback() {
        if (isDisposed()) {
            return;
        }
        lazySet(deserializeNumber.DISPOSED);
        try {
            this.onComplete.run();
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
