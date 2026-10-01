package o;

import io.reactivex.internal.disposables.ResettableConnectable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getFd<T> extends getByteBuffer<T> {
    final int IAuthTabCallback;
    final TimeUnit asBinder;
    onExtraCallbackWithResult onExtraCallback;
    final long onExtraCallbackWithResult;
    final MapConverter onNavigationEvent;
    final access26800<T> onWarmupCompleted;

    public getFd(access26800<T> access26800Var) {
        this(access26800Var, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    public getFd(access26800<T> access26800Var, int i, long j, TimeUnit timeUnit, MapConverter mapConverter) {
        this.onWarmupCompleted = access26800Var;
        this.IAuthTabCallback = i;
        this.onExtraCallbackWithResult = j;
        this.asBinder = timeUnit;
        this.onNavigationEvent = mapConverter;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        onExtraCallbackWithResult onextracallbackwithresult;
        boolean z;
        deserializeUriNullableCollection deserializeurinullablecollection;
        synchronized (this) {
            onextracallbackwithresult = this.onExtraCallback;
            if (onextracallbackwithresult == null) {
                onextracallbackwithresult = new onExtraCallbackWithResult(this);
                this.onExtraCallback = onextracallbackwithresult;
            }
            long j = onextracallbackwithresult.subscriberCount;
            if (j == 0 && (deserializeurinullablecollection = onextracallbackwithresult.timer) != null) {
                deserializeurinullablecollection.dispose();
            }
            long j2 = j + 1;
            onextracallbackwithresult.subscriberCount = j2;
            if (onextracallbackwithresult.connected || j2 != this.IAuthTabCallback) {
                z = false;
            } else {
                z = true;
                onextracallbackwithresult.connected = true;
            }
        }
        this.onWarmupCompleted.subscribe(new onWarmupCompleted(writequoted, this, onextracallbackwithresult));
        if (z) {
            this.onWarmupCompleted.asInterface(onextracallbackwithresult);
        }
    }

    void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
        synchronized (this) {
            onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallback;
            if (onextracallbackwithresult2 == null || onextracallbackwithresult2 != onextracallbackwithresult) {
                return;
            }
            long j = onextracallbackwithresult.subscriberCount - 1;
            onextracallbackwithresult.subscriberCount = j;
            if (j == 0 && onextracallbackwithresult.connected) {
                if (this.onExtraCallbackWithResult == 0) {
                    onExtraCallback(onextracallbackwithresult);
                    return;
                }
                deserializeShortArray deserializeshortarray = new deserializeShortArray();
                onextracallbackwithresult.timer = deserializeshortarray;
                deserializeshortarray.IAuthTabCallback(this.onNavigationEvent.onNavigationEvent(onextracallbackwithresult, this.onExtraCallbackWithResult, this.asBinder));
            }
        }
    }

    void onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult) {
        synchronized (this) {
            if (this.onWarmupCompleted instanceof setFd) {
                onExtraCallbackWithResult onextracallbackwithresult2 = this.onExtraCallback;
                if (onextracallbackwithresult2 != null && onextracallbackwithresult2 == onextracallbackwithresult) {
                    this.onExtraCallback = null;
                    onNavigationEvent(onextracallbackwithresult);
                }
                long j = onextracallbackwithresult.subscriberCount - 1;
                onextracallbackwithresult.subscriberCount = j;
                if (j == 0) {
                    IAuthTabCallback(onextracallbackwithresult);
                }
            } else {
                onExtraCallbackWithResult onextracallbackwithresult3 = this.onExtraCallback;
                if (onextracallbackwithresult3 != null && onextracallbackwithresult3 == onextracallbackwithresult) {
                    onNavigationEvent(onextracallbackwithresult);
                    long j2 = onextracallbackwithresult.subscriberCount - 1;
                    onextracallbackwithresult.subscriberCount = j2;
                    if (j2 == 0) {
                        this.onExtraCallback = null;
                        IAuthTabCallback(onextracallbackwithresult);
                    }
                }
            }
        }
    }

    void onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) {
        deserializeUriNullableCollection deserializeurinullablecollection = onextracallbackwithresult.timer;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
            onextracallbackwithresult.timer = null;
        }
    }

    void IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        access26800<T> access26800Var = this.onWarmupCompleted;
        if (access26800Var instanceof deserializeUriNullableCollection) {
            ((deserializeUriNullableCollection) access26800Var).dispose();
        } else if (access26800Var instanceof ResettableConnectable) {
            ((ResettableConnectable) access26800Var).onWarmupCompleted(onextracallbackwithresult.get());
        }
    }

    void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult) {
        synchronized (this) {
            if (onextracallbackwithresult.subscriberCount == 0 && onextracallbackwithresult == this.onExtraCallback) {
                this.onExtraCallback = null;
                deserializeUriNullableCollection deserializeurinullablecollection = onextracallbackwithresult.get();
                deserializeNumber.dispose(onextracallbackwithresult);
                access26800<T> access26800Var = this.onWarmupCompleted;
                if (access26800Var instanceof deserializeUriNullableCollection) {
                    ((deserializeUriNullableCollection) access26800Var).dispose();
                } else if (access26800Var instanceof ResettableConnectable) {
                    if (deserializeurinullablecollection == null) {
                        onextracallbackwithresult.disconnectedEarly = true;
                    } else {
                        ((ResettableConnectable) access26800Var).onWarmupCompleted(deserializeurinullablecollection);
                    }
                }
            }
        }
    }

    static final class onExtraCallbackWithResult extends AtomicReference<deserializeUriNullableCollection> implements Runnable, deserializeFloat<deserializeUriNullableCollection> {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final getFd<?> parent;
        long subscriberCount;
        deserializeUriNullableCollection timer;

        onExtraCallbackWithResult(getFd<?> getfd) {
            this.parent = getfd;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.parent.onExtraCallback(this);
        }

        @Override // o.deserializeFloat
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public void accept(deserializeUriNullableCollection deserializeurinullablecollection) throws Exception {
            deserializeNumber.replace(this, deserializeurinullablecollection);
            synchronized (this.parent) {
                if (this.disconnectedEarly) {
                    ((ResettableConnectable) this.parent.onWarmupCompleted).onWarmupCompleted(deserializeurinullablecollection);
                }
            }
        }
    }

    static final class onWarmupCompleted<T> extends AtomicBoolean implements writeQuoted<T>, deserializeUriNullableCollection {
        private static final long serialVersionUID = -7419642935409022375L;
        final onExtraCallbackWithResult connection;
        final writeQuoted<? super T> downstream;
        final getFd<T> parent;
        deserializeUriNullableCollection upstream;

        onWarmupCompleted(writeQuoted<? super T> writequoted, getFd<T> getfd, onExtraCallbackWithResult onextracallbackwithresult) {
            this.downstream = writequoted;
            this.parent = getfd;
            this.connection = onextracallbackwithresult;
        }

        @Override // o.writeQuoted
        public void onExtraCallback(T t) {
            this.downstream.onExtraCallback(t);
        }

        @Override // o.writeQuoted
        public void onExtraCallbackWithResult(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.onExtraCallbackWithResult(this.connection);
                this.downstream.onExtraCallbackWithResult(th);
            } else {
                RxJavaPlugins.onExtraCallbackWithResult(th);
            }
        }

        @Override // o.writeQuoted
        public void onExtraCallback() {
            if (compareAndSet(false, true)) {
                this.parent.onExtraCallbackWithResult(this.connection);
                this.downstream.onExtraCallback();
            }
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            this.upstream.dispose();
            if (compareAndSet(false, true)) {
                this.parent.onWarmupCompleted(this.connection);
            }
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // o.writeQuoted
        public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
                this.upstream = deserializeurinullablecollection;
                this.downstream.IAuthTabCallback(this);
            }
        }
    }
}
