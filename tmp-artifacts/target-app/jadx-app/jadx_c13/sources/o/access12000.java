package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12000<T> extends getByteBuffer<T> {
    final serializeObject<T> IAuthTabCallback;

    public access12000(serializeObject<T> serializeobject) {
        this.IAuthTabCallback = serializeobject;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(writequoted);
        writequoted.IAuthTabCallback(iAuthTabCallback);
        try {
            this.IAuthTabCallback.subscribe(iAuthTabCallback);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            iAuthTabCallback.onExtraCallback(th);
        }
    }

    static final class IAuthTabCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements writeBinary<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -3434801548987643227L;
        final writeQuoted<? super T> observer;

        IAuthTabCallback(writeQuoted<? super T> writequoted) {
            this.observer = writequoted;
        }

        @Override // o.JsonReaderReadJsonObject
        public void IAuthTabCallback(T t) {
            if (t == null) {
                onExtraCallback(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.observer.onExtraCallback(t);
            }
        }

        @Override // o.JsonReaderReadJsonObject
        public void onExtraCallback(Throwable th) {
            if (onNavigationEvent(th)) {
                return;
            }
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }

        @Override // o.writeBinary
        public boolean onNavigationEvent(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.observer.onExtraCallbackWithResult(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        @Override // o.JsonReaderReadJsonObject
        public void onNavigationEvent() {
            if (isDisposed()) {
                return;
            }
            try {
                this.observer.onExtraCallback();
            } finally {
                dispose();
            }
        }

        @Override // o.writeBinary
        public void onNavigationEvent(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.set(this, deserializeurinullablecollection);
        }

        @Override // o.writeBinary
        public void onWarmupCompleted(deserializeFloatArray deserializefloatarray) {
            onNavigationEvent(new deserializeLongNullableCollection(deserializefloatarray));
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            deserializeNumber.dispose(this);
        }

        @Override // o.writeBinary, o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return deserializeNumber.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", IAuthTabCallback.class.getSimpleName(), super.toString());
        }
    }
}
