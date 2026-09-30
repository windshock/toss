package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getBuildId<T> extends setPc<T, Boolean> {
    final deserializeLongCollection<? super T> IAuthTabCallback;

    public getBuildId(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        super(serializeraw);
        this.IAuthTabCallback = deserializelongcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super Boolean> writequoted) {
        this.onWarmupCompleted.subscribe(new onExtraCallbackWithResult(writequoted, this.IAuthTabCallback));
    }

    static final class onExtraCallbackWithResult<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        boolean IAuthTabCallback;
        final writeQuoted<? super Boolean> onExtraCallback;
        final deserializeLongCollection<? super T> onExtraCallbackWithResult;
        deserializeUriNullableCollection onNavigationEvent;

        onExtraCallbackWithResult(writeQuoted<? super Boolean> writequoted, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onExtraCallback = writequoted;
            this.onExtraCallbackWithResult = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onNavigationEvent, deserializeurinullablecollection)) {
                this.onNavigationEvent = deserializeurinullablecollection;
                this.onExtraCallback.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.IAuthTabCallback) {
                return;
            }
            try {
                if (this.onExtraCallbackWithResult.test(t)) {
                    return;
                }
                this.IAuthTabCallback = true;
                this.onNavigationEvent.dispose();
                this.onExtraCallback.onExtraCallback(Boolean.FALSE);
                this.onExtraCallback.onExtraCallback();
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
                this.onExtraCallback.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.onExtraCallback.onExtraCallback(Boolean.TRUE);
            this.onExtraCallback.onExtraCallback();
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
