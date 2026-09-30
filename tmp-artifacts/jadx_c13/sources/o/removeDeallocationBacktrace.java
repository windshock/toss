package o;

import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class removeDeallocationBacktrace<T> extends writeRaw<T> {
    final deserializeIntNullableCollection<? super Throwable, ? extends deserializeIp<? extends T>> onExtraCallbackWithResult;
    final deserializeIp<? extends T> onNavigationEvent;

    public removeDeallocationBacktrace(deserializeIp<? extends T> deserializeip, deserializeIntNullableCollection<? super Throwable, ? extends deserializeIp<? extends T>> deserializeintnullablecollection) {
        this.onNavigationEvent = deserializeip;
        this.onExtraCallbackWithResult = deserializeintnullablecollection;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onNavigationEvent.IAuthTabCallback(new IAuthTabCallback(deserializeipnullablecollection, this.onExtraCallbackWithResult));
    }

    static final class IAuthTabCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -5314538511045349925L;
        final deserializeIpNullableCollection<? super T> downstream;
        final deserializeIntNullableCollection<? super Throwable, ? extends deserializeIp<? extends T>> nextFunction;

        IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, deserializeIntNullableCollection<? super Throwable, ? extends deserializeIp<? extends T>> deserializeintnullablecollection) {
            this.downstream = deserializeipnullablecollection;
            this.nextFunction = deserializeintnullablecollection;
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
                this.downstream.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            this.downstream.onNavigationEvent(t);
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            try {
                ((deserializeIp) floatExponent.onExtraCallbackWithResult(this.nextFunction.apply(th), "The nextFunction returned a null SingleSource.")).IAuthTabCallback(new ResumeSingleObserver(this, this.downstream));
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.downstream.onExtraCallbackWithResult(new deserializeDecimal(th, th2));
            }
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
}
