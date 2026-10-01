package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setFunctionName$onWarmupCompleted<T, R> extends AtomicInteger implements deserializeUriNullableCollection {
    private static final long serialVersionUID = -5556924161382950569L;
    final ensureCapacity<? super R> downstream;
    final setFunctionName$onExtraCallback<T>[] observers;
    final Object[] values;
    final deserializeIntNullableCollection<? super Object[], ? extends R> zipper;

    setFunctionName$onWarmupCompleted(ensureCapacity<? super R> ensurecapacity, int i, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection) {
        super(i);
        this.downstream = ensurecapacity;
        this.zipper = deserializeintnullablecollection;
        setFunctionName$onExtraCallback<T>[] setfunctionname_onextracallbackArr = new setFunctionName$onExtraCallback[i];
        for (int i2 = 0; i2 < i; i2++) {
            setfunctionname_onextracallbackArr[i2] = new setFunctionName$onExtraCallback<>(this, i2);
        }
        this.observers = setfunctionname_onextracallbackArr;
        this.values = new Object[i];
    }

    public boolean isDisposed() {
        return get() <= 0;
    }

    public void dispose() {
        if (getAndSet(0) > 0) {
            for (setFunctionName$onExtraCallback<T> setfunctionname_onextracallback : this.observers) {
                setfunctionname_onextracallback.onWarmupCompleted();
            }
        }
    }

    void onNavigationEvent(T t, int i) {
        this.values[i] = t;
        if (decrementAndGet() == 0) {
            try {
                this.downstream.onNavigationEvent(floatExponent.onExtraCallbackWithResult(this.zipper.apply(this.values), "The zipper returned a null value"));
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.downstream.onExtraCallbackWithResult(th);
            }
        }
    }

    void onExtraCallback(int i) {
        setFunctionName$onExtraCallback<T>[] setfunctionname_onextracallbackArr = this.observers;
        int length = setfunctionname_onextracallbackArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            setfunctionname_onextracallbackArr[i2].onWarmupCompleted();
        }
        while (true) {
            i++;
            if (i >= length) {
                return;
            } else {
                setfunctionname_onextracallbackArr[i].onWarmupCompleted();
            }
        }
    }

    void onNavigationEvent(Throwable th, int i) {
        if (getAndSet(0) > 0) {
            onExtraCallback(i);
            this.downstream.onExtraCallbackWithResult(th);
        } else {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }

    void onNavigationEvent(int i) {
        if (getAndSet(0) > 0) {
            onExtraCallback(i);
            this.downstream.onExtraCallback();
        }
    }
}
