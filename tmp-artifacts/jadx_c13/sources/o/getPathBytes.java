package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getPathBytes<T> extends writeRaw<T> {
    final serializeRaw<? extends T> IAuthTabCallback;
    final T onExtraCallback;

    public getPathBytes(serializeRaw<? extends T> serializeraw, T t) {
        this.IAuthTabCallback = serializeraw;
        this.onExtraCallback = t;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        this.IAuthTabCallback.subscribe(new IAuthTabCallback(deserializeipnullablecollection, this.onExtraCallback));
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        deserializeUriNullableCollection IAuthTabCallback;
        final deserializeIpNullableCollection<? super T> onExtraCallback;
        T onExtraCallbackWithResult;
        final T onNavigationEvent;
        boolean onWarmupCompleted;

        IAuthTabCallback(deserializeIpNullableCollection<? super T> deserializeipnullablecollection, T t) {
            this.onExtraCallback = deserializeipnullablecollection;
            this.onNavigationEvent = t;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.IAuthTabCallback, deserializeurinullablecollection)) {
                this.IAuthTabCallback = deserializeurinullablecollection;
                this.onExtraCallback.IAuthTabCallback(this);
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
            if (this.onWarmupCompleted) {
                return;
            }
            if (this.onExtraCallbackWithResult != null) {
                this.onWarmupCompleted = true;
                this.IAuthTabCallback.dispose();
                this.onExtraCallback.onExtraCallbackWithResult(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.onExtraCallbackWithResult = t;
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (this.onWarmupCompleted) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.onWarmupCompleted = true;
                this.onExtraCallback.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (this.onWarmupCompleted) {
                return;
            }
            this.onWarmupCompleted = true;
            T t = this.onExtraCallbackWithResult;
            this.onExtraCallbackWithResult = null;
            if (t == null) {
                t = this.onNavigationEvent;
            }
            if (t != null) {
                this.onExtraCallback.onNavigationEvent(t);
            } else {
                this.onExtraCallback.onExtraCallbackWithResult(new NoSuchElementException());
            }
        }
    }
}
