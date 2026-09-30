package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearFd<T> extends access26800<T> implements setFd<T> {
    final serializeRaw<T> onExtraCallbackWithResult;
    final AtomicReference<IAuthTabCallback<T>> onNavigationEvent;
    final serializeRaw<T> onWarmupCompleted;

    public static <T> access26800<T> asInterface(serializeRaw<T> serializeraw) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onNavigationEvent(new clearFd(new onWarmupCompleted(atomicReference), serializeraw, atomicReference));
    }

    private clearFd(serializeRaw<T> serializeraw, serializeRaw<T> serializeraw2, AtomicReference<IAuthTabCallback<T>> atomicReference) {
        this.onWarmupCompleted = serializeraw;
        this.onExtraCallbackWithResult = serializeraw2;
        this.onNavigationEvent = atomicReference;
    }

    @Override // o.setFd
    public serializeRaw<T> onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        this.onWarmupCompleted.subscribe(writequoted);
    }

    @Override // o.access26800
    public void asInterface(deserializeFloat<? super deserializeUriNullableCollection> deserializefloat) {
        IAuthTabCallback<T> iAuthTabCallback;
        while (true) {
            iAuthTabCallback = this.onNavigationEvent.get();
            if (iAuthTabCallback != null && !iAuthTabCallback.isDisposed()) {
                break;
            }
            IAuthTabCallback<T> iAuthTabCallback2 = new IAuthTabCallback<>(this.onNavigationEvent);
            if (setSupportImageTintList.onNavigationEvent(this.onNavigationEvent, iAuthTabCallback, iAuthTabCallback2)) {
                iAuthTabCallback = iAuthTabCallback2;
                break;
            }
        }
        boolean z = false;
        if (!iAuthTabCallback.onWarmupCompleted.get() && iAuthTabCallback.onWarmupCompleted.compareAndSet(false, true)) {
            z = true;
        }
        try {
            deserializefloat.accept(iAuthTabCallback);
            if (z) {
                this.onExtraCallbackWithResult.subscribe(iAuthTabCallback);
            }
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            throw access26100.onExtraCallback(th);
        }
    }

    static final class IAuthTabCallback<T> implements writeQuoted<T>, deserializeUriNullableCollection {
        static final onNavigationEvent[] IAuthTabCallback = new onNavigationEvent[0];
        static final onNavigationEvent[] onExtraCallbackWithResult = new onNavigationEvent[0];
        final AtomicReference<IAuthTabCallback<T>> onExtraCallback;
        final AtomicReference<deserializeUriNullableCollection> asBinder = new AtomicReference<>();
        final AtomicReference<onNavigationEvent<T>[]> onNavigationEvent = new AtomicReference<>(IAuthTabCallback);
        final AtomicBoolean onWarmupCompleted = new AtomicBoolean();

        IAuthTabCallback(AtomicReference<IAuthTabCallback<T>> atomicReference) {
            this.onExtraCallback = atomicReference;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            AtomicReference<onNavigationEvent<T>[]> atomicReference = this.onNavigationEvent;
            onNavigationEvent<T>[] onnavigationeventArr = onExtraCallbackWithResult;
            if (atomicReference.getAndSet(onnavigationeventArr) != onnavigationeventArr) {
                setSupportImageTintList.onNavigationEvent(this.onExtraCallback, this, (Object) null);
                deserializeNumber.dispose(this.asBinder);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onNavigationEvent.get() == onExtraCallbackWithResult;
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this.asBinder, deserializeurinullablecollection);
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            for (onNavigationEvent<T> onnavigationevent : this.onNavigationEvent.get()) {
                onnavigationevent.child.onExtraCallback(t);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            setSupportImageTintList.onNavigationEvent(this.onExtraCallback, this, (Object) null);
            onNavigationEvent<T>[] andSet = this.onNavigationEvent.getAndSet(onExtraCallbackWithResult);
            if (andSet.length != 0) {
                for (onNavigationEvent<T> onnavigationevent : andSet) {
                    onnavigationevent.child.onExtraCallbackWithResult(th);
                }
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            setSupportImageTintList.onNavigationEvent(this.onExtraCallback, this, (Object) null);
            for (onNavigationEvent<T> onnavigationevent : this.onNavigationEvent.getAndSet(onExtraCallbackWithResult)) {
                onnavigationevent.child.onExtraCallback();
            }
        }

        boolean onExtraCallback(onNavigationEvent<T> onnavigationevent) {
            onNavigationEvent<T>[] onnavigationeventArr;
            onNavigationEvent[] onnavigationeventArr2;
            do {
                onnavigationeventArr = this.onNavigationEvent.get();
                if (onnavigationeventArr == onExtraCallbackWithResult) {
                    return false;
                }
                int length = onnavigationeventArr.length;
                onnavigationeventArr2 = new onNavigationEvent[length + 1];
                System.arraycopy(onnavigationeventArr, 0, onnavigationeventArr2, 0, length);
                onnavigationeventArr2[length] = onnavigationevent;
            } while (!setSupportImageTintList.onNavigationEvent(this.onNavigationEvent, onnavigationeventArr, onnavigationeventArr2));
            return true;
        }

        void onNavigationEvent(onNavigationEvent<T> onnavigationevent) {
            onNavigationEvent<T>[] onnavigationeventArr;
            onNavigationEvent[] onnavigationeventArr2;
            do {
                onnavigationeventArr = this.onNavigationEvent.get();
                int length = onnavigationeventArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (onnavigationeventArr[i].equals(onnavigationevent)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    onnavigationeventArr2 = IAuthTabCallback;
                } else {
                    onNavigationEvent[] onnavigationeventArr3 = new onNavigationEvent[length - 1];
                    System.arraycopy(onnavigationeventArr, 0, onnavigationeventArr3, 0, i);
                    System.arraycopy(onnavigationeventArr, i + 1, onnavigationeventArr3, i, (length - i) - 1);
                    onnavigationeventArr2 = onnavigationeventArr3;
                }
            } while (!setSupportImageTintList.onNavigationEvent(this.onNavigationEvent, onnavigationeventArr, onnavigationeventArr2));
        }
    }

    static final class onNavigationEvent<T> extends AtomicReference<Object> implements deserializeUriNullableCollection {
        private static final long serialVersionUID = -1100270633763673112L;
        final writeQuoted<? super T> child;

        onNavigationEvent(writeQuoted<? super T> writequoted) {
            this.child = writequoted;
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == this;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((IAuthTabCallback) andSet).onNavigationEvent(this);
        }

        void onExtraCallbackWithResult(IAuthTabCallback<T> iAuthTabCallback) {
            if (compareAndSet(null, iAuthTabCallback)) {
                return;
            }
            iAuthTabCallback.onNavigationEvent(this);
        }
    }

    static final class onWarmupCompleted<T> implements serializeRaw<T> {
        private final AtomicReference<IAuthTabCallback<T>> onExtraCallback;

        onWarmupCompleted(AtomicReference<IAuthTabCallback<T>> atomicReference) {
            this.onExtraCallback = atomicReference;
        }

        @Override // o.serializeRaw
        public void subscribe(writeQuoted<? super T> writequoted) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(writequoted);
            writequoted.IAuthTabCallback(onnavigationevent);
            while (true) {
                IAuthTabCallback<T> iAuthTabCallback = this.onExtraCallback.get();
                if (iAuthTabCallback == null || iAuthTabCallback.isDisposed()) {
                    IAuthTabCallback<T> iAuthTabCallback2 = new IAuthTabCallback<>(this.onExtraCallback);
                    if (setSupportImageTintList.onNavigationEvent(this.onExtraCallback, iAuthTabCallback, iAuthTabCallback2)) {
                        iAuthTabCallback = iAuthTabCallback2;
                    } else {
                        continue;
                    }
                }
                if (iAuthTabCallback.onExtraCallback(onnavigationevent)) {
                    onnavigationevent.onExtraCallbackWithResult(iAuthTabCallback);
                    return;
                }
            }
        }
    }
}
