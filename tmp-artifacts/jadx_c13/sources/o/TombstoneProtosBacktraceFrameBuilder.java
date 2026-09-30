package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosBacktraceFrameBuilder<T, U> extends writeRaw<U> implements parseNegativeDecimal<U> {
    final serializeRaw<T> IAuthTabCallback;
    final deserializeDouble<? super U, ? super T> onNavigationEvent;
    final Callable<? extends U> onWarmupCompleted;

    public TombstoneProtosBacktraceFrameBuilder(serializeRaw<T> serializeraw, Callable<? extends U> callable, deserializeDouble<? super U, ? super T> deserializedouble) {
        this.IAuthTabCallback = serializeraw;
        this.onWarmupCompleted = callable;
        this.onNavigationEvent = deserializedouble;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super U> deserializeipnullablecollection) {
        try {
            this.IAuthTabCallback.subscribe(new onWarmupCompleted(deserializeipnullablecollection, floatExponent.onExtraCallbackWithResult(this.onWarmupCompleted.call(), "The initialSupplier returned a null value"), this.onNavigationEvent));
        } catch (Throwable th) {
            deserializeShort.error(th, deserializeipnullablecollection);
        }
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<U> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new TombstoneProtosBacktraceFrameOrBuilder(this.IAuthTabCallback, this.onWarmupCompleted, this.onNavigationEvent));
    }

    static final class onWarmupCompleted<T, U> implements writeQuoted<T>, deserializeUriNullableCollection {
        deserializeUriNullableCollection IAuthTabCallback;
        final U onExtraCallback;
        final deserializeIpNullableCollection<? super U> onExtraCallbackWithResult;
        final deserializeDouble<? super U, ? super T> onNavigationEvent;
        boolean onWarmupCompleted;

        onWarmupCompleted(deserializeIpNullableCollection<? super U> deserializeipnullablecollection, U u, deserializeDouble<? super U, ? super T> deserializedouble) {
            this.onExtraCallbackWithResult = deserializeipnullablecollection;
            this.onNavigationEvent = deserializedouble;
            this.onExtraCallback = u;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallback, deserializeurinullablecollection)) {
                this.IAuthTabCallback = deserializeurinullablecollection;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallback.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onWarmupCompleted) {
                return;
            }
            try {
                this.onNavigationEvent.accept(this.onExtraCallback, t);
            } catch (Throwable th) {
                this.IAuthTabCallback.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onWarmupCompleted) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onWarmupCompleted = true;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onWarmupCompleted) {
                return;
            }
            this.onWarmupCompleted = true;
            this.onExtraCallbackWithResult.onNavigationEvent(this.onExtraCallback);
        }
    }
}
