package o;

import io.reactivex.internal.disposables.ResettableConnectable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearTag<T> extends access26800<T> implements ResettableConnectable {
    final serializeRaw<T> IAuthTabCallback;
    final AtomicReference<IAuthTabCallback<T>> onWarmupCompleted = new AtomicReference<>();

    public clearTag(serializeRaw<T> serializeraw) {
        this.IAuthTabCallback = serializeraw;
    }

    @Override // o.access26800
    public void asInterface(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
        IAuthTabCallback<T> iAuthTabCallback;
        while (true) {
            iAuthTabCallback = this.onWarmupCompleted.get();
            if (iAuthTabCallback != null && !iAuthTabCallback.isDisposed()) {
                break;
            }
            IAuthTabCallback<T> iAuthTabCallback2 = new IAuthTabCallback<>(this.onWarmupCompleted);
            if (setSupportImageTintList.onNavigationEvent(this.onWarmupCompleted, iAuthTabCallback, iAuthTabCallback2)) {
                iAuthTabCallback = iAuthTabCallback2;
                break;
            }
        }
        boolean z = false;
        if (!iAuthTabCallback.connect.get() && iAuthTabCallback.connect.compareAndSet(false, true)) {
            z = true;
        }
        try {
            deserializefloat.accept(iAuthTabCallback);
            if (z) {
                this.IAuthTabCallback.subscribe(iAuthTabCallback);
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            throw access26100.onExtraCallback(th);
        }
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        IAuthTabCallback<T> iAuthTabCallback;
        while (true) {
            iAuthTabCallback = this.onWarmupCompleted.get();
            if (iAuthTabCallback != null) {
                break;
            }
            IAuthTabCallback<T> iAuthTabCallback2 = new IAuthTabCallback<>(this.onWarmupCompleted);
            if (setSupportImageTintList.onNavigationEvent(this.onWarmupCompleted, iAuthTabCallback, iAuthTabCallback2)) {
                iAuthTabCallback = iAuthTabCallback2;
                break;
            }
        }
        onExtraCallback<T> onextracallback = new onExtraCallback<>(writequoted, iAuthTabCallback);
        writequoted.IAuthTabCallback(onextracallback);
        if (iAuthTabCallback.onWarmupCompleted(onextracallback)) {
            if (onextracallback.isDisposed()) {
                iAuthTabCallback.onExtraCallbackWithResult(onextracallback);
            }
        } else {
            Throwable th = iAuthTabCallback.error;
            if (th != null) {
                writequoted.onExtraCallbackWithResult(th);
            } else {
                writequoted.onExtraCallback();
            }
        }
    }

    @Override // io.reactivex.internal.disposables.ResettableConnectable
    public void onWarmupCompleted(deserializeUriNullableCollection deserializeurinullablecollection) {
        setSupportImageTintList.onNavigationEvent(this.onWarmupCompleted, (IAuthTabCallback) deserializeurinullablecollection, (Object) null);
    }

    static final class IAuthTabCallback<T> extends AtomicReference<onExtraCallback<T>[]> implements writeQuoted<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -3251430252873581268L;
        final AtomicReference<IAuthTabCallback<T>> current;
        Throwable error;
        static final onExtraCallback[] onExtraCallbackWithResult = new onExtraCallback[0];
        static final onExtraCallback[] IAuthTabCallback = new onExtraCallback[0];
        final AtomicBoolean connect = new AtomicBoolean();
        final AtomicReference<deserializeUriNullableCollection> upstream = new AtomicReference<>();

        IAuthTabCallback(AtomicReference<IAuthTabCallback<T>> atomicReference) {
            this.current = atomicReference;
            lazySet(onExtraCallbackWithResult);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            getAndSet(IAuthTabCallback);
            setSupportImageTintList.onNavigationEvent(this.current, this, (Object) null);
            deserializeNumber.dispose(this.upstream);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == IAuthTabCallback;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.upstream, deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            for (onExtraCallback<T> onextracallback : get()) {
                onextracallback.downstream.onExtraCallback(t);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            this.error = th;
            this.upstream.lazySet(deserializeNumber.DISPOSED);
            for (onExtraCallback<T> onextracallback : getAndSet(IAuthTabCallback)) {
                onextracallback.downstream.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            this.upstream.lazySet(deserializeNumber.DISPOSED);
            for (onExtraCallback<T> onextracallback : getAndSet(IAuthTabCallback)) {
                onextracallback.downstream.onExtraCallback();
            }
        }

        public boolean onWarmupCompleted(onExtraCallback<T> onextracallback) {
            onExtraCallback<T>[] onextracallbackArr;
            onExtraCallback[] onextracallbackArr2;
            do {
                onextracallbackArr = get();
                if (onextracallbackArr == IAuthTabCallback) {
                    return false;
                }
                int length = onextracallbackArr.length;
                onextracallbackArr2 = new onExtraCallback[length + 1];
                System.arraycopy(onextracallbackArr, 0, onextracallbackArr2, 0, length);
                onextracallbackArr2[length] = onextracallback;
            } while (!compareAndSet(onextracallbackArr, onextracallbackArr2));
            return true;
        }

        public void onExtraCallbackWithResult(onExtraCallback<T> onextracallback) {
            onExtraCallback<T>[] onextracallbackArr;
            onExtraCallback[] onextracallbackArr2;
            do {
                onextracallbackArr = get();
                int length = onextracallbackArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (onextracallbackArr[i] == onextracallback) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                onextracallbackArr2 = onExtraCallbackWithResult;
                if (length != 1) {
                    onextracallbackArr2 = new onExtraCallback[length - 1];
                    System.arraycopy(onextracallbackArr, 0, onextracallbackArr2, 0, i);
                    System.arraycopy(onextracallbackArr, i + 1, onextracallbackArr2, i, (length - i) - 1);
                }
            } while (!compareAndSet(onextracallbackArr, onextracallbackArr2));
        }
    }

    static final class onExtraCallback<T> extends AtomicReference<IAuthTabCallback<T>> implements deserializeUriNullableCollection {
        private static final long serialVersionUID = 7463222674719692880L;
        final writeQuoted<? super T> downstream;

        onExtraCallback(writeQuoted<? super T> writequoted, IAuthTabCallback<T> iAuthTabCallback) {
            this.downstream = writequoted;
            lazySet(iAuthTabCallback);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            IAuthTabCallback<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.onExtraCallbackWithResult(this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == null;
        }
    }
}
