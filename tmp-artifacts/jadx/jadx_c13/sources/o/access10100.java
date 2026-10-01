package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access10100<T> extends setPc<T, T> {
    final deserializeLongCollection<? super T> onExtraCallback;

    public access10100(serializeRaw<T> serializeraw, deserializeLongCollection<? super T> deserializelongcollection) {
        super(serializeraw);
        this.onExtraCallback = deserializelongcollection;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onNavigationEvent(writequoted, this.onExtraCallback));
    }

    static final class onNavigationEvent<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        deserializeUriNullableCollection onExtraCallback;
        boolean onExtraCallbackWithResult;
        final writeQuoted<? super T> onNavigationEvent;
        final deserializeLongCollection<? super T> onWarmupCompleted;

        onNavigationEvent(writeQuoted<? super T> writequoted, deserializeLongCollection<? super T> deserializelongcollection) {
            this.onNavigationEvent = writequoted;
            this.onWarmupCompleted = deserializelongcollection;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallback, deserializeurinullablecollection)) {
                this.onExtraCallback = deserializeurinullablecollection;
                this.onNavigationEvent.IAuthTabCallback(this);
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
            if (this.onExtraCallbackWithResult) {
                return;
            }
            try {
                if (!this.onWarmupCompleted.test(t)) {
                    this.onExtraCallbackWithResult = true;
                    this.onExtraCallback.dispose();
                    this.onNavigationEvent.onExtraCallback();
                    return;
                }
                this.onNavigationEvent.onExtraCallback(t);
            } catch (Throwable th) {
                NumberConverter.onWarmupCompleted(th);
                this.onExtraCallback.dispose();
                onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onExtraCallbackWithResult) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onExtraCallbackWithResult = true;
                this.onNavigationEvent.onExtraCallbackWithResult(th);
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
