package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class mergeMemoryError<T> extends advance<T> implements parseNegativeDecimal<T> {
    final serializeRaw<T> onExtraCallbackWithResult;
    final long onNavigationEvent;

    public mergeMemoryError(serializeRaw<T> serializeraw, long j) {
        this.onExtraCallbackWithResult = serializeraw;
        this.onNavigationEvent = j;
    }

    @Override // o.advance
    public void onNavigationEvent(ensureCapacity<? super T> ensurecapacity) {
        this.onExtraCallbackWithResult.subscribe(new onExtraCallbackWithResult(ensurecapacity, this.onNavigationEvent));
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<T> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new clearHumanReadable(this.onExtraCallbackWithResult, this.onNavigationEvent, null, false));
    }

    static final class onExtraCallbackWithResult<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final ensureCapacity<? super T> IAuthTabCallback;
        deserializeUriNullableCollection onExtraCallback;
        long onExtraCallbackWithResult;
        boolean onNavigationEvent;
        final long onWarmupCompleted;

        onExtraCallbackWithResult(ensureCapacity<? super T> ensurecapacity, long j) {
            this.IAuthTabCallback = ensurecapacity;
            this.onWarmupCompleted = j;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallback, deserializeurinullablecollection)) {
                this.onExtraCallback = deserializeurinullablecollection;
                this.IAuthTabCallback.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onExtraCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallback.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onNavigationEvent) {
                return;
            }
            long j = this.onExtraCallbackWithResult;
            if (j == this.onWarmupCompleted) {
                this.onNavigationEvent = true;
                this.onExtraCallback.dispose();
                this.IAuthTabCallback.onNavigationEvent(t);
                return;
            }
            this.onExtraCallbackWithResult = j + 1;
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onNavigationEvent) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onNavigationEvent = true;
                this.IAuthTabCallback.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onNavigationEvent) {
                return;
            }
            this.onNavigationEvent = true;
            this.IAuthTabCallback.onExtraCallback();
        }
    }
}
