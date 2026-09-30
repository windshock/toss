package o;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access8800<T, U extends Collection<? super T>> extends setPc<T, U> {
    final Callable<U> onNavigationEvent;

    public access8800(serializeRaw<T> serializeraw, Callable<U> callable) {
        super(serializeraw);
        this.onNavigationEvent = callable;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super U> writequoted) {
        try {
            this.onWarmupCompleted.subscribe(new onExtraCallback(writequoted, (Collection) floatExponent.onExtraCallbackWithResult(this.onNavigationEvent.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            deserializeShort.error(th, writequoted);
        }
    }

    static final class onExtraCallback<T, U extends Collection<? super T>> implements writeQuoted<T>, deserializeUriNullableCollection {
        deserializeUriNullableCollection IAuthTabCallback;
        U onNavigationEvent;
        final writeQuoted<? super U> onWarmupCompleted;

        onExtraCallback(writeQuoted<? super U> writequoted, U u) {
            this.onWarmupCompleted = writequoted;
            this.onNavigationEvent = u;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallback, deserializeurinullablecollection)) {
                this.IAuthTabCallback = deserializeurinullablecollection;
                this.onWarmupCompleted.IAuthTabCallback(this);
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
            this.onNavigationEvent.add(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.onNavigationEvent = null;
            this.onWarmupCompleted.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            U u = this.onNavigationEvent;
            this.onNavigationEvent = null;
            this.onWarmupCompleted.onExtraCallback(u);
            this.onWarmupCompleted.onExtraCallback();
        }
    }
}
