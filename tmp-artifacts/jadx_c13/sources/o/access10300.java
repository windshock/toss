package o;

import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access10300<T> extends setPc<T, T> {
    final long onExtraCallbackWithResult;

    public access10300(serializeRaw<T> serializeraw, long j) {
        super(serializeraw);
        this.onExtraCallbackWithResult = j;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(new onWarmupCompleted(writequoted, this.onExtraCallbackWithResult));
    }

    static final class onWarmupCompleted<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        boolean IAuthTabCallback;
        deserializeUriNullableCollection onExtraCallback;
        long onExtraCallbackWithResult;
        final writeQuoted<? super T> onNavigationEvent;

        onWarmupCompleted(writeQuoted<? super T> writequoted, long j) {
            this.onNavigationEvent = writequoted;
            this.onExtraCallbackWithResult = j;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.onExtraCallback, deserializeurinullablecollection)) {
                this.onExtraCallback = deserializeurinullablecollection;
                if (this.onExtraCallbackWithResult == 0) {
                    this.IAuthTabCallback = true;
                    deserializeurinullablecollection.dispose();
                    deserializeShort.complete(this.onNavigationEvent);
                    return;
                }
                this.onNavigationEvent.IAuthTabCallback(this);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.IAuthTabCallback) {
                return;
            }
            long j = this.onExtraCallbackWithResult;
            long j2 = j - 1;
            this.onExtraCallbackWithResult = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.onNavigationEvent.onExtraCallback(t);
                if (z) {
                    onExtraCallback();
                }
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.IAuthTabCallback) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
                return;
            }
            this.IAuthTabCallback = true;
            this.onExtraCallback.dispose();
            this.onNavigationEvent.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.IAuthTabCallback) {
                return;
            }
            this.IAuthTabCallback = true;
            this.onExtraCallback.dispose();
            this.onNavigationEvent.onExtraCallback();
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
