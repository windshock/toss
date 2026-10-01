package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getFunctionNameBytes<T> extends writeRaw<Boolean> implements parseNegativeDecimal<Boolean> {
    final serializeRaw<T> onExtraCallbackWithResult;
    final deserializeLongCollection<? super T> onNavigationEvent;

    public getFunctionNameBytes(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        this.onExtraCallbackWithResult = serializeraw;
        this.onNavigationEvent = deserializelongcollection;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super Boolean> deserializeipnullablecollection) {
        this.onExtraCallbackWithResult.subscribe(new onExtraCallback(deserializeipnullablecollection, this.onNavigationEvent));
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<Boolean> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new getFileNameBytes(this.onExtraCallbackWithResult, this.onNavigationEvent));
    }

    static final class onExtraCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final deserializeLongCollection<? super T> IAuthTabCallback;
        final deserializeIpNullableCollection<? super Boolean> onExtraCallback;
        boolean onNavigationEvent;
        deserializeUriNullableCollection onWarmupCompleted;

        onExtraCallback(deserializeIpNullableCollection<? super Boolean> deserializeipnullablecollection, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onExtraCallback = deserializeipnullablecollection;
            this.IAuthTabCallback = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onWarmupCompleted, deserializeurinullablecollection)) {
                this.onWarmupCompleted = deserializeurinullablecollection;
                this.onExtraCallback.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onNavigationEvent) {
                return;
            }
            try {
                if (this.IAuthTabCallback.test(t)) {
                    this.onNavigationEvent = true;
                    this.onWarmupCompleted.dispose();
                    this.onExtraCallback.onNavigationEvent(Boolean.TRUE);
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onWarmupCompleted.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onNavigationEvent) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onNavigationEvent = true;
                this.onExtraCallback.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onNavigationEvent) {
                return;
            }
            this.onNavigationEvent = true;
            this.onExtraCallback.onNavigationEvent(Boolean.FALSE);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onWarmupCompleted.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted.isDisposed();
        }
    }
}
