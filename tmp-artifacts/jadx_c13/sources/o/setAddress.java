package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.clearDeallocationBacktrace;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setAddress<T, R> extends writeRaw<R> {
    final deserializeIp<? extends T>[] onNavigationEvent;
    final deserializeIntNullableCollection<? super Object[], ? extends R> onWarmupCompleted;

    public setAddress(deserializeIp<? extends T>[] deserializeipArr, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection) {
        this.onNavigationEvent = deserializeipArr;
        this.onWarmupCompleted = deserializeintnullablecollection;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super R> deserializeipnullablecollection) {
        deserializeIp<? extends T>[] deserializeipArr = this.onNavigationEvent;
        int length = deserializeipArr.length;
        if (length == 1) {
            deserializeipArr[0].IAuthTabCallback(new clearDeallocationBacktrace.IAuthTabCallback(deserializeipnullablecollection, new onWarmupCompleted()));
            return;
        }
        onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(deserializeipnullablecollection, length, this.onWarmupCompleted);
        deserializeipnullablecollection.IAuthTabCallback(onextracallbackwithresult);
        for (int i = 0; i < length && !onextracallbackwithresult.isDisposed(); i++) {
            deserializeIp<? extends T> deserializeip = deserializeipArr[i];
            if (deserializeip == null) {
                onextracallbackwithresult.IAuthTabCallback(new NullPointerException("One of the sources is null"), i);
                return;
            }
            deserializeip.IAuthTabCallback(onextracallbackwithresult.observers[i]);
        }
    }

    static final class onExtraCallbackWithResult<T, R> extends AtomicInteger implements deserializeUriNullableCollection {
        private static final long serialVersionUID = -5556924161382950569L;
        final deserializeIpNullableCollection<? super R> downstream;
        final onNavigationEvent<T>[] observers;
        final Object[] values;
        final deserializeIntNullableCollection<? super Object[], ? extends R> zipper;

        onExtraCallbackWithResult(deserializeIpNullableCollection<? super R> deserializeipnullablecollection, int i, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection) {
            super(i);
            this.downstream = deserializeipnullablecollection;
            this.zipper = deserializeintnullablecollection;
            onNavigationEvent<T>[] onnavigationeventArr = new onNavigationEvent[i];
            for (int i2 = 0; i2 < i; i2++) {
                onnavigationeventArr[i2] = new onNavigationEvent<>(this, i2);
            }
            this.observers = onnavigationeventArr;
            this.values = new Object[i];
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return get() <= 0;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (onNavigationEvent<T> onnavigationevent : this.observers) {
                    onnavigationevent.onWarmupCompleted();
                }
            }
        }

        void onWarmupCompleted(T t, int i) {
            this.values[i] = t;
            if (decrementAndGet() == 0) {
                try {
                    this.downstream.onNavigationEvent(floatExponent.onExtraCallbackWithResult(this.zipper.apply(this.values), "The zipper returned a null value"));
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    this.downstream.onExtraCallbackWithResult(th);
                }
            }
        }

        void onExtraCallback(int i) {
            onNavigationEvent<T>[] onnavigationeventArr = this.observers;
            int length = onnavigationeventArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                onnavigationeventArr[i2].onWarmupCompleted();
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    onnavigationeventArr[i].onWarmupCompleted();
                }
            }
        }

        void IAuthTabCallback(Throwable th, int i) {
            if (getAndSet(0) > 0) {
                onExtraCallback(i);
                this.downstream.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }
    }

    static final class onNavigationEvent<T> extends AtomicReference<deserializeUriNullableCollection> implements deserializeIpNullableCollection<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final onExtraCallbackWithResult<T, ?> parent;

        onNavigationEvent(onExtraCallbackWithResult<T, ?> onextracallbackwithresult, int i) {
            this.parent = onextracallbackwithresult;
            this.index = i;
        }

        public void onWarmupCompleted() {
            deserializeNumber.dispose(this);
        }

        @Override // o.deserializeIpNullableCollection
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            deserializeNumber.setOnce(this, deserializeurinullablecollection);
        }

        @Override // o.deserializeIpNullableCollection
        public void onNavigationEvent(T t) {
            this.parent.onWarmupCompleted(t, this.index);
        }

        @Override // o.deserializeIpNullableCollection
        public void onExtraCallbackWithResult(Throwable th) {
            this.parent.IAuthTabCallback(th, this.index);
        }
    }

    final class onWarmupCompleted implements deserializeIntNullableCollection<T, R> {
        onWarmupCompleted() {
        }

        @Override // o.deserializeIntNullableCollection
        public R apply(T t) throws Exception {
            return (R) floatExponent.onExtraCallbackWithResult(setAddress.this.onWarmupCompleted.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }
}
