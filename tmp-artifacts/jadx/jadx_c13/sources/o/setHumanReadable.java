package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setHumanReadable<T> extends writeRaw<T> implements parseNegativeDecimal<T> {
    final long IAuthTabCallback;
    final serializeRaw<T> onExtraCallbackWithResult;
    final T onWarmupCompleted;

    public setHumanReadable(serializeRaw<T> serializeraw, long j, T t) {
        this.onExtraCallbackWithResult = serializeraw;
        this.IAuthTabCallback = j;
        this.onWarmupCompleted = t;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.onExtraCallbackWithResult.subscribe(new onExtraCallbackWithResult(deserializeipnullablecollection, this.IAuthTabCallback, this.onWarmupCompleted));
    }

    @Override // o.parseNegativeDecimal
    public getByteBuffer<T> onWarmupCompleted() {
        return RxJavaPlugins.onExtraCallback(new clearHumanReadable(this.onExtraCallbackWithResult, this.IAuthTabCallback, this.onWarmupCompleted, true));
    }

    static final class onExtraCallbackWithResult<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        final long IAuthTabCallback;
        deserializeUriNullableCollection IAuthTabCallbackStub;
        final T onExtraCallback;
        final deserializeIpNullableCollection<? super T> onExtraCallbackWithResult;
        long onNavigationEvent;
        boolean onWarmupCompleted;

        onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, long j, T t) {
            this.onExtraCallbackWithResult = deserializeipnullablecollection;
            this.IAuthTabCallback = j;
            this.onExtraCallback = t;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallbackStub, deserializeurinullablecollection)) {
                this.IAuthTabCallbackStub = deserializeurinullablecollection;
                this.onExtraCallbackWithResult.IAuthTabCallback(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.IAuthTabCallbackStub.dispose();
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.IAuthTabCallbackStub.isDisposed();
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            if (this.onWarmupCompleted) {
                return;
            }
            long j = this.onNavigationEvent;
            if (j == this.IAuthTabCallback) {
                this.onWarmupCompleted = true;
                this.IAuthTabCallbackStub.dispose();
                this.onExtraCallbackWithResult.onNavigationEvent(t);
                return;
            }
            this.onNavigationEvent = j + 1;
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onWarmupCompleted) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onWarmupCompleted = true;
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onWarmupCompleted) {
                return;
            }
            this.onWarmupCompleted = true;
            T t = this.onExtraCallback;
            if (t != null) {
                this.onExtraCallbackWithResult.onNavigationEvent(t);
            } else {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(new NoSuchElementException());
            }
        }
    }
}
