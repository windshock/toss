package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access8700<T, U extends Collection<? super T>> extends writeRaw<U> implements parseNegativeDecimal<U> {
    final Callable<U> onNavigationEvent;
    final serializeRaw<T> onWarmupCompleted;

    public access8700(serializeRaw<T> serializeraw, int i) {
        this.onWarmupCompleted = serializeraw;
        this.onNavigationEvent = doubleExponent.onNavigationEvent(i);
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super U> deserializeipnullablecollection) {
        try {
            this.onWarmupCompleted.subscribe(new onExtraCallback(deserializeipnullablecollection, (Collection) floatExponent.onExtraCallbackWithResult(this.onNavigationEvent.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            deserializeShort.error(th, deserializeipnullablecollection);
        }
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<U> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new access8800(this.onWarmupCompleted, this.onNavigationEvent));
    }

    static final class onExtraCallback<T, U extends Collection<? super T>> implements writeQuoted<T>, deserializeUriNullableCollection {
        U IAuthTabCallback;
        deserializeUriNullableCollection onExtraCallbackWithResult;
        final deserializeIpNullableCollection<? super U> onWarmupCompleted;

        onExtraCallback(deserializeIpNullableCollection<? super U> deserializeipnullablecollection, U u) {
            this.onWarmupCompleted = deserializeipnullablecollection;
            this.IAuthTabCallback = u;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallbackWithResult, deserializeurinullablecollection)) {
                this.onExtraCallbackWithResult = deserializeurinullablecollection;
                this.onWarmupCompleted.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onExtraCallbackWithResult.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallbackWithResult.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.IAuthTabCallback.add(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.IAuthTabCallback = null;
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            U u = this.IAuthTabCallback;
            this.IAuthTabCallback = null;
            this.onWarmupCompleted.onNavigationEvent(u);
        }
    }
}
