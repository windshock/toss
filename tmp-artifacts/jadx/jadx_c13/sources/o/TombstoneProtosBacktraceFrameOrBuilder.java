package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TombstoneProtosBacktraceFrameOrBuilder<T, U> extends setPc<T, U> {
    final Callable<? extends U> onExtraCallbackWithResult;
    final deserializeDouble<? super U, ? super T> onNavigationEvent;

    public TombstoneProtosBacktraceFrameOrBuilder(serializeRaw<T> serializeraw, Callable<? extends U> callable, deserializeDouble<? super U, ? super T> deserializedouble) {
        super(serializeraw);
        this.onExtraCallbackWithResult = callable;
        this.onNavigationEvent = deserializedouble;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super U> writequoted) {
        try {
            this.onWarmupCompleted.subscribe(new onWarmupCompleted(writequoted, floatExponent.onExtraCallbackWithResult(this.onExtraCallbackWithResult.call(), "The initialSupplier returned a null value"), this.onNavigationEvent));
        } catch (Throwable th) {
            deserializeShort.error(th, writequoted);
        }
    }

    static final class onWarmupCompleted<T, U> implements writeQuoted<T>, deserializeUriNullableCollection {
        final U IAuthTabCallback;
        boolean onExtraCallback;
        deserializeUriNullableCollection onExtraCallbackWithResult;
        final writeQuoted<? super U> onNavigationEvent;
        final deserializeDouble<? super U, ? super T> onWarmupCompleted;

        onWarmupCompleted(writeQuoted<? super U> writequoted, U u, deserializeDouble<? super U, ? super T> deserializedouble) {
            this.onNavigationEvent = writequoted;
            this.onWarmupCompleted = deserializedouble;
            this.IAuthTabCallback = u;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallbackWithResult, deserializeurinullablecollection)) {
                this.onExtraCallbackWithResult = deserializeurinullablecollection;
                this.onNavigationEvent.IAuthTabCallback(this);
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
            if (this.onExtraCallback) {
                return;
            }
            try {
                this.onWarmupCompleted.accept(this.IAuthTabCallback, t);
            } catch (Throwable th) {
                this.onExtraCallbackWithResult.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onExtraCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onExtraCallback = true;
                this.onNavigationEvent.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = true;
            this.onNavigationEvent.onExtraCallback(this.IAuthTabCallback);
            this.onNavigationEvent.onExtraCallback();
        }
    }
}
