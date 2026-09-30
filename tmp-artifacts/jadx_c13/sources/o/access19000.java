package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access19000<T> extends advance<T> {
    final enlargeOrFlush<T> IAuthTabCallback;

    public access19000(enlargeOrFlush<T> enlargeorflush) {
        this.IAuthTabCallback = enlargeorflush;
    }

    @Override // o.advance
    public void onNavigationEvent(ensureCapacity<? super T> ensurecapacity) {
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(ensurecapacity);
        ensurecapacity.IAuthTabCallback(onextracallbackwithresult);
        try {
            this.IAuthTabCallback.subscribe(onextracallbackwithresult);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            onextracallbackwithresult.IAuthTabCallback(th);
        }
    }

    static final class onExtraCallbackWithResult<T> extends AtomicReference<deserializeUriNullableCollection> implements flushed<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -2467358622224974244L;
        final ensureCapacity<? super T> downstream;

        onExtraCallbackWithResult(ensureCapacity<? super T> ensurecapacity) {
            this.downstream = ensurecapacity;
        }

        @Override // o.flushed
        public void onExtraCallbackWithResult(T t) {
            deserializeUriNullableCollection andSet;
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || (andSet = getAndSet(deserializenumber)) == deserializenumber) {
                return;
            }
            try {
                if (t == null) {
                    this.downstream.onExtraCallbackWithResult(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.downstream.onNavigationEvent(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        public void IAuthTabCallback(Throwable th) {
            if (onExtraCallback(th)) {
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.flushed
        public boolean onExtraCallback(Throwable th) {
            deserializeUriNullableCollection andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || (andSet = getAndSet(deserializenumber)) == deserializenumber) {
                return false;
            }
            try {
                this.downstream.onExtraCallbackWithResult(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // o.flushed
        public void onExtraCallback() {
            deserializeUriNullableCollection andSet;
            deserializeUriNullableCollection deserializeurinullablecollection = get();
            deserializeNumber deserializenumber = deserializeNumber.DISPOSED;
            if (deserializeurinullablecollection == deserializenumber || (andSet = getAndSet(deserializenumber)) == deserializenumber) {
                return;
            }
            try {
                this.downstream.onExtraCallback();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.set(this, deserializeurinullablecollection);
        }

        @Override // o.flushed
        public void IAuthTabCallback(deserializeFloatArray deserializefloatarray) {
            IAuthTabCallback(new deserializeLongNullableCollection(deserializefloatarray));
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", onExtraCallbackWithResult.class.getSimpleName(), super.toString());
        }
    }
}
