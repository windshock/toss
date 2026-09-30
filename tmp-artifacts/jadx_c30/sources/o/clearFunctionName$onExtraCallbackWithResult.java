package o;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class clearFunctionName$onExtraCallbackWithResult<T, R> extends AtomicReference<deserializeUriNullableCollection> implements ensureCapacity<T>, deserializeUriNullableCollection {
    private static final long serialVersionUID = 4827726964688405508L;
    final deserializeIpNullableCollection<? super R> downstream;
    final deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> mapper;

    clearFunctionName$onExtraCallbackWithResult(deserializeIpNullableCollection<? super R> deserializeipnullablecollection, deserializeIntNullableCollection<? super T, ? extends deserializeIp<? extends R>> deserializeintnullablecollection) {
        this.downstream = deserializeipnullablecollection;
        this.mapper = deserializeintnullablecollection;
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
        try {
            deserializeIp deserializeip = (deserializeIp) floatExponent.onExtraCallbackWithResult(this.mapper.apply(t), "The mapper returned a null SingleSource");
            if (isDisposed()) {
                return;
            }
            final deserializeIpNullableCollection<? super R> deserializeipnullablecollection = this.downstream;
            deserializeip.IAuthTabCallback(new deserializeIpNullableCollection<R>(this, deserializeipnullablecollection) { // from class: o.clearFunctionName$onExtraCallback
                final deserializeIpNullableCollection<? super R> onExtraCallbackWithResult;
                final AtomicReference<deserializeUriNullableCollection> onNavigationEvent;

                {
                    this.onNavigationEvent = this;
                    this.onExtraCallbackWithResult = deserializeipnullablecollection;
                }

                public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
                    deserializeNumber.replace(this.onNavigationEvent, deserializeurinullablecollection);
                }

                public void onNavigationEvent(R r) {
                    this.onExtraCallbackWithResult.onNavigationEvent(r);
                }

                public void onExtraCallbackWithResult(Throwable th) {
                    this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
                }
            });
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            onExtraCallbackWithResult(th);
        }
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.downstream.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        this.downstream.onExtraCallbackWithResult(new NoSuchElementException());
    }
}
