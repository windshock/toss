package o;

import android.R;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getOwner {
    public static <T, R> boolean onExtraCallback(serializeRaw<T> serializeraw, writeQuoted<? super R> writequoted, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection) {
        if (!(serializeraw instanceof Callable)) {
            return false;
        }
        try {
            R.bool boolVar = (Object) ((Callable) serializeraw).call();
            if (boolVar == null) {
                deserializeShort.complete(writequoted);
                return true;
            }
            try {
                serializeRaw serializeraw2 = (serializeRaw) floatExponent.onExtraCallbackWithResult(deserializeintnullablecollection.apply(boolVar), "The mapper returned a null ObservableSource");
                if (serializeraw2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) serializeraw2).call();
                        if (objCall == null) {
                            deserializeShort.complete(writequoted);
                            return true;
                        }
                        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(writequoted, objCall);
                        writequoted.IAuthTabCallback(onwarmupcompleted);
                        onwarmupcompleted.run();
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        deserializeShort.error(th, writequoted);
                        return true;
                    }
                } else {
                    serializeraw2.subscribe(writequoted);
                }
                return true;
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                deserializeShort.error(th2, writequoted);
                return true;
            }
        } catch (Throwable th3) {
            NumberConverter.onWarmupCompleted(th3);
            deserializeShort.error(th3, writequoted);
            return true;
        }
    }

    public static <T, U> getByteBuffer<U> onExtraCallbackWithResult(T t, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends U>> deserializeintnullablecollection) {
        return RxJavaPlugins.onExtraCallback(new IAuthTabCallback(t, deserializeintnullablecollection));
    }

    static final class IAuthTabCallback<T, R> extends getByteBuffer<R> {
        final T onExtraCallback;
        final deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> onWarmupCompleted;

        IAuthTabCallback(T t, deserializeIntNullableCollection<? super T, ? extends serializeRaw<? extends R>> deserializeintnullablecollection) {
            this.onExtraCallback = t;
            this.onWarmupCompleted = deserializeintnullablecollection;
        }

        @Override // o.getByteBuffer
        public void IAuthTabCallback(writeQuoted<? super R> writequoted) {
            try {
                serializeRaw serializeraw = (serializeRaw) floatExponent.onExtraCallbackWithResult(this.onWarmupCompleted.apply(this.onExtraCallback), "The mapper returned a null ObservableSource");
                if (serializeraw instanceof Callable) {
                    try {
                        Object objCall = ((Callable) serializeraw).call();
                        if (objCall == null) {
                            deserializeShort.complete(writequoted);
                            return;
                        }
                        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(writequoted, objCall);
                        writequoted.IAuthTabCallback(onwarmupcompleted);
                        onwarmupcompleted.run();
                        return;
                    } catch (Throwable th) {
                        NumberConverter.onWarmupCompleted(th);
                        deserializeShort.error(th, writequoted);
                        return;
                    }
                }
                serializeraw.subscribe(writequoted);
            } catch (Throwable th2) {
                deserializeShort.error(th2, writequoted);
            }
        }
    }

    public static final class onWarmupCompleted<T> extends AtomicInteger implements parseDoubleGeneric<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;
        final writeQuoted<? super T> observer;
        final T value;

        public onWarmupCompleted(writeQuoted<? super T> writequoted, T t) {
            this.observer = writequoted;
            this.value = t;
        }

        @Override // o.parsePositiveDecimal
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // o.parsePositiveDecimal
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        @Override // o.parsePositiveDecimal
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // o.parsePositiveDecimal
        public void clear() {
            lazySet(3);
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            set(3);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // o.parseFloatGeneric
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onExtraCallback(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onExtraCallback();
                }
            }
        }
    }
}
