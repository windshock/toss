package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getFileNameBytes<T> extends setPc<T, Boolean> {
    final deserializeLongCollection<? super T> IAuthTabCallback;

    public getFileNameBytes(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        super(serializeraw);
        this.IAuthTabCallback = deserializelongcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super Boolean> writequoted) {
        this.onWarmupCompleted.subscribe(new onNavigationEvent(writequoted, this.IAuthTabCallback));
    }

    static final class onNavigationEvent<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        boolean IAuthTabCallback;
        deserializeUriNullableCollection onExtraCallback;
        final deserializeLongCollection<? super T> onExtraCallbackWithResult;
        final writeQuoted<? super Boolean> onWarmupCompleted;

        onNavigationEvent(writeQuoted<? super Boolean> writequoted, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onWarmupCompleted = writequoted;
            this.onExtraCallbackWithResult = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallback, deserializeurinullablecollection)) {
                this.onExtraCallback = deserializeurinullablecollection;
                this.onWarmupCompleted.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.IAuthTabCallback) {
                return;
            }
            try {
                if (this.onExtraCallbackWithResult.test(t)) {
                    this.IAuthTabCallback = true;
                    this.onExtraCallback.dispose();
                    this.onWarmupCompleted.onExtraCallback(Boolean.TRUE);
                    this.onWarmupCompleted.onExtraCallback();
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallback.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.IAuthTabCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.IAuthTabCallback = true;
                this.onWarmupCompleted.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.onWarmupCompleted.onExtraCallback(Boolean.FALSE);
            this.onWarmupCompleted.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onExtraCallback.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallback.isDisposed();
        }
    }
}
