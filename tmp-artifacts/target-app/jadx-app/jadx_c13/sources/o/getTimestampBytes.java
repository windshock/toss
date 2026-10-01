package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getTimestampBytes<T> extends setTimestampBytes<T> {
    static final onNavigationEvent[] IAuthTabCallback = new onNavigationEvent[0];
    static final onNavigationEvent[] onNavigationEvent = new onNavigationEvent[0];
    Throwable onExtraCallback;
    final AtomicReference<onNavigationEvent<T>[]> onExtraCallbackWithResult = new AtomicReference<>(onNavigationEvent);

    public static <T> getTimestampBytes<T> IAuthTabCallback() {
        return new getTimestampBytes<>();
    }

    getTimestampBytes() {
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        onNavigationEvent<T> onnavigationevent = new onNavigationEvent<>(writequoted, this);
        writequoted.IAuthTabCallback(onnavigationevent);
        if (onExtraCallbackWithResult((onNavigationEvent) onnavigationevent)) {
            if (onnavigationevent.isDisposed()) {
                onExtraCallback((onNavigationEvent) onnavigationevent);
            }
        } else {
            Throwable th = this.onExtraCallback;
            if (th != null) {
                writequoted.onExtraCallbackWithResult(th);
            } else {
                writequoted.onExtraCallback();
            }
        }
    }

    boolean onExtraCallbackWithResult(onNavigationEvent<T> onnavigationevent) {
        onNavigationEvent<T>[] onnavigationeventArr;
        onNavigationEvent[] onnavigationeventArr2;
        do {
            onnavigationeventArr = this.onExtraCallbackWithResult.get();
            if (onnavigationeventArr == IAuthTabCallback) {
                return false;
            }
            int length = onnavigationeventArr.length;
            onnavigationeventArr2 = new onNavigationEvent[length + 1];
            System.arraycopy(onnavigationeventArr, 0, onnavigationeventArr2, 0, length);
            onnavigationeventArr2[length] = onnavigationevent;
        } while (!setSupportImageTintList.onNavigationEvent(this.onExtraCallbackWithResult, onnavigationeventArr, onnavigationeventArr2));
        return true;
    }

    void onExtraCallback(onNavigationEvent<T> onnavigationevent) {
        onNavigationEvent<T>[] onnavigationeventArr;
        onNavigationEvent[] onnavigationeventArr2;
        do {
            onnavigationeventArr = this.onExtraCallbackWithResult.get();
            if (onnavigationeventArr == IAuthTabCallback || onnavigationeventArr == onNavigationEvent) {
                return;
            }
            int length = onnavigationeventArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (onnavigationeventArr[i] == onnavigationevent) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                onnavigationeventArr2 = onNavigationEvent;
            } else {
                onNavigationEvent[] onnavigationeventArr3 = new onNavigationEvent[length - 1];
                System.arraycopy(onnavigationeventArr, 0, onnavigationeventArr3, 0, i);
                System.arraycopy(onnavigationeventArr, i + 1, onnavigationeventArr3, i, (length - i) - 1);
                onnavigationeventArr2 = onnavigationeventArr3;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onExtraCallbackWithResult, onnavigationeventArr, onnavigationeventArr2));
    }

    @Override // o.writeQuoted
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (this.onExtraCallbackWithResult.get() == IAuthTabCallback) {
            deserializeurinullablecollection.dispose();
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (onNavigationEvent<T> onnavigationevent : this.onExtraCallbackWithResult.get()) {
            onnavigationevent.onExtraCallback(t);
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallbackWithResult(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        onNavigationEvent<T>[] onnavigationeventArr = this.onExtraCallbackWithResult.get();
        onNavigationEvent<T>[] onnavigationeventArr2 = IAuthTabCallback;
        if (onnavigationeventArr == onnavigationeventArr2) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        this.onExtraCallback = th;
        for (onNavigationEvent<T> onnavigationevent : this.onExtraCallbackWithResult.getAndSet(onnavigationeventArr2)) {
            onnavigationevent.onWarmupCompleted(th);
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback() {
        onNavigationEvent<T>[] onnavigationeventArr = this.onExtraCallbackWithResult.get();
        onNavigationEvent<T>[] onnavigationeventArr2 = IAuthTabCallback;
        if (onnavigationeventArr != onnavigationeventArr2) {
            for (onNavigationEvent<T> onnavigationevent : this.onExtraCallbackWithResult.getAndSet(onnavigationeventArr2)) {
                onnavigationevent.onExtraCallback();
            }
        }
    }

    public boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult.get().length != 0;
    }

    public boolean onNavigationEvent() {
        return this.onExtraCallbackWithResult.get() == IAuthTabCallback && this.onExtraCallback == null;
    }

    static final class onNavigationEvent<T> extends AtomicBoolean implements deserializeUriNullableCollection {
        private static final long serialVersionUID = 3562861878281475070L;
        final writeQuoted<? super T> downstream;
        final getTimestampBytes<T> parent;

        onNavigationEvent(writeQuoted<? super T> writequoted, getTimestampBytes<T> gettimestampbytes) {
            this.downstream = writequoted;
            this.parent = gettimestampbytes;
        }

        public void onExtraCallback(T t) {
            if (get()) {
                return;
            }
            this.downstream.onExtraCallback(t);
        }

        public void onWarmupCompleted(Throwable th) {
            if (get()) {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            } else {
                this.downstream.onExtraCallbackWithResult(th);
            }
        }

        public void onExtraCallback() {
            if (get()) {
                return;
            }
            this.downstream.onExtraCallback();
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.onExtraCallback((onNavigationEvent) this);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get();
        }
    }
}
