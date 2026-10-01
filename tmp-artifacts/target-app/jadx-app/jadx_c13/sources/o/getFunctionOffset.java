package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getFunctionOffset<T> extends writeRaw<Boolean> implements parseNegativeDecimal<Boolean> {
    final serializeRaw<T> IAuthTabCallback;
    final deserializeLongCollection<? super T> onExtraCallback;

    public getFunctionOffset(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        this.IAuthTabCallback = serializeraw;
        this.onExtraCallback = deserializelongcollection;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super Boolean> deserializeipnullablecollection) {
        this.IAuthTabCallback.subscribe(new IAuthTabCallback(deserializeipnullablecollection, this.onExtraCallback));
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<Boolean> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new getBuildId(this.IAuthTabCallback, this.onExtraCallback));
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        boolean IAuthTabCallback;
        final deserializeIpNullableCollection<? super Boolean> onExtraCallbackWithResult;
        deserializeUriNullableCollection onNavigationEvent;
        final deserializeLongCollection<? super T> onWarmupCompleted;

        IAuthTabCallback(deserializeIpNullableCollection<? super Boolean> deserializeipnullablecollection, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onExtraCallbackWithResult = deserializeipnullablecollection;
            this.onWarmupCompleted = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onNavigationEvent, deserializeurinullablecollection)) {
                this.onNavigationEvent = deserializeurinullablecollection;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.IAuthTabCallback) {
                return;
            }
            try {
                if (this.onWarmupCompleted.test(t)) {
                    return;
                }
                this.IAuthTabCallback = true;
                this.onNavigationEvent.dispose();
                this.onExtraCallbackWithResult.onNavigationEvent(Boolean.FALSE);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onNavigationEvent.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.IAuthTabCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.IAuthTabCallback = true;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.onExtraCallbackWithResult.onNavigationEvent(Boolean.TRUE);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onNavigationEvent.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onNavigationEvent.isDisposed();
        }
    }
}
