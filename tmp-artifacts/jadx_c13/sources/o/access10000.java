package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access10000<T> extends setPc<T, T> {
    final deserializeLongCollection<? super T> IAuthTabCallback;

    public access10000(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        super(serializeraw);
        this.IAuthTabCallback = deserializelongcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new IAuthTabCallback(writequoted, this.IAuthTabCallback));
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final deserializeLongCollection<? super T> IAuthTabCallback;
        boolean onExtraCallbackWithResult;
        final writeQuoted<? super T> onNavigationEvent;
        deserializeUriNullableCollection onWarmupCompleted;

        IAuthTabCallback(writeQuoted<? super T> writequoted, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onNavigationEvent = writequoted;
            this.IAuthTabCallback = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onWarmupCompleted, deserializeurinullablecollection)) {
                this.onWarmupCompleted = deserializeurinullablecollection;
                this.onNavigationEvent.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.onWarmupCompleted.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onWarmupCompleted.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onExtraCallbackWithResult) {
                return;
            }
            this.onNavigationEvent.onExtraCallback(t);
            try {
                if (this.IAuthTabCallback.test(t)) {
                    this.onExtraCallbackWithResult = true;
                    this.onWarmupCompleted.dispose();
                    this.onNavigationEvent.onExtraCallback();
                }
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onWarmupCompleted.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (!this.onExtraCallbackWithResult) {
                this.onExtraCallbackWithResult = true;
                this.onNavigationEvent.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onExtraCallbackWithResult) {
                return;
            }
            this.onExtraCallbackWithResult = true;
            this.onNavigationEvent.onExtraCallback();
        }
    }
}
