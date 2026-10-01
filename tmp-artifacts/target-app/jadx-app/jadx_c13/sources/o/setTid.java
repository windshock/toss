package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.ensureLogsIsMutable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setTid<T> extends setTimestampBytes<T> {
    final Lock IAuthTabCallback;
    final AtomicReference<onExtraCallback<T>[]> IAuthTabCallbackDefault;
    final Lock IAuthTabCallbackStub;
    final AtomicReference<Object> asInterface;
    long onExtraCallback;
    final AtomicReference<Throwable> onTransact;
    final ReadWriteLock onWarmupCompleted;
    private static final Object[] asBinder = new Object[0];
    static final onExtraCallback[] onNavigationEvent = new onExtraCallback[0];
    static final onExtraCallback[] onExtraCallbackWithResult = new onExtraCallback[0];

    public static <T> setTid<T> onNavigationEvent() {
        return new setTid<>();
    }

    public static <T> setTid<T> IAuthTabCallbackDefault(T t) {
        return new setTid<>(t);
    }

    setTid() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.onWarmupCompleted = reentrantReadWriteLock;
        this.IAuthTabCallback = reentrantReadWriteLock.readLock();
        this.IAuthTabCallbackStub = reentrantReadWriteLock.writeLock();
        this.IAuthTabCallbackDefault = new AtomicReference<>(onNavigationEvent);
        this.asInterface = new AtomicReference<>();
        this.onTransact = new AtomicReference<>();
    }

    setTid(T t) {
        this();
        this.asInterface.lazySet(floatExponent.onExtraCallbackWithResult((Object) t, "defaultValue is null"));
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        onExtraCallback<T> onextracallback = new onExtraCallback<>(writequoted, this);
        writequoted.IAuthTabCallback(onextracallback);
        if (IAuthTabCallback((onExtraCallback) onextracallback)) {
            if (onextracallback.onExtraCallback) {
                onWarmupCompleted((onExtraCallback) onextracallback);
                return;
            } else {
                onextracallback.onExtraCallback();
                return;
            }
        }
        Throwable th = this.onTransact.get();
        if (th == access26100.IAuthTabCallback) {
            writequoted.onExtraCallback();
        } else {
            writequoted.onExtraCallbackWithResult(th);
        }
    }

    @Override // o.writeQuoted
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (this.onTransact.get() != null) {
            deserializeurinullablecollection.dispose();
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.onTransact.get() == null) {
            Object next = access26200.next(t);
            asBinder(next);
            for (onExtraCallback<T> onextracallback : this.IAuthTabCallbackDefault.get()) {
                onextracallback.onWarmupCompleted(next, this.onExtraCallback);
            }
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallbackWithResult(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!setSupportImageTintList.onNavigationEvent(this.onTransact, (Object) null, th)) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        Object objError = access26200.error(th);
        for (onExtraCallback<T> onextracallback : onTransact(objError)) {
            onextracallback.onWarmupCompleted(objError, this.onExtraCallback);
        }
    }

    @Override // o.writeQuoted
    public void onExtraCallback() {
        if (setSupportImageTintList.onNavigationEvent(this.onTransact, (Object) null, access26100.IAuthTabCallback)) {
            Object objComplete = access26200.complete();
            for (onExtraCallback<T> onextracallback : onTransact(objComplete)) {
                onextracallback.onWarmupCompleted(objComplete, this.onExtraCallback);
            }
        }
    }

    public T onWarmupCompleted() {
        Object obj = this.asInterface.get();
        if (access26200.isComplete(obj) || access26200.isError(obj)) {
            return null;
        }
        return (T) access26200.getValue(obj);
    }

    public boolean IAuthTabCallback() {
        return access26200.isComplete(this.asInterface.get());
    }

    public boolean onExtraCallbackWithResult() {
        return access26200.isError(this.asInterface.get());
    }

    public boolean ICustomTabsCallback() {
        Object obj = this.asInterface.get();
        return (obj == null || access26200.isComplete(obj) || access26200.isError(obj)) ? false : true;
    }

    boolean IAuthTabCallback(onExtraCallback<T> onextracallback) {
        onExtraCallback<T>[] onextracallbackArr;
        onExtraCallback[] onextracallbackArr2;
        do {
            onextracallbackArr = this.IAuthTabCallbackDefault.get();
            if (onextracallbackArr == onExtraCallbackWithResult) {
                return false;
            }
            int length = onextracallbackArr.length;
            onextracallbackArr2 = new onExtraCallback[length + 1];
            System.arraycopy(onextracallbackArr, 0, onextracallbackArr2, 0, length);
            onextracallbackArr2[length] = onextracallback;
        } while (!setSupportImageTintList.onNavigationEvent(this.IAuthTabCallbackDefault, onextracallbackArr, onextracallbackArr2));
        return true;
    }

    void onWarmupCompleted(onExtraCallback<T> onextracallback) {
        onExtraCallback<T>[] onextracallbackArr;
        onExtraCallback[] onextracallbackArr2;
        do {
            onextracallbackArr = this.IAuthTabCallbackDefault.get();
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
            if (length == 1) {
                onextracallbackArr2 = onNavigationEvent;
            } else {
                onExtraCallback[] onextracallbackArr3 = new onExtraCallback[length - 1];
                System.arraycopy(onextracallbackArr, 0, onextracallbackArr3, 0, i);
                System.arraycopy(onextracallbackArr, i + 1, onextracallbackArr3, i, (length - i) - 1);
                onextracallbackArr2 = onextracallbackArr3;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.IAuthTabCallbackDefault, onextracallbackArr, onextracallbackArr2));
    }

    onExtraCallback<T>[] onTransact(Object obj) {
        AtomicReference<onExtraCallback<T>[]> atomicReference = this.IAuthTabCallbackDefault;
        onExtraCallback<T>[] onextracallbackArr = onExtraCallbackWithResult;
        onExtraCallback<T>[] andSet = atomicReference.getAndSet(onextracallbackArr);
        if (andSet != onextracallbackArr) {
            asBinder(obj);
        }
        return andSet;
    }

    void asBinder(Object obj) {
        this.IAuthTabCallbackStub.lock();
        this.onExtraCallback++;
        this.asInterface.lazySet(obj);
        this.IAuthTabCallbackStub.unlock();
    }

    static final class onExtraCallback<T> implements deserializeUriNullableCollection, ensureLogsIsMutable.onExtraCallbackWithResult<Object> {
        long IAuthTabCallback;
        ensureLogsIsMutable<Object> IAuthTabCallbackDefault;
        final setTid<T> IAuthTabCallbackStub;
        boolean asInterface;
        volatile boolean onExtraCallback;
        boolean onExtraCallbackWithResult;
        boolean onNavigationEvent;
        final writeQuoted<? super T> onWarmupCompleted;

        onExtraCallback(writeQuoted<? super T> writequoted, setTid<T> settid) {
            this.onWarmupCompleted = writequoted;
            this.IAuthTabCallbackStub = settid;
        }

        @Override // o.deserializeUriNullableCollection
        public void dispose() {
            if (this.onExtraCallback) {
                return;
            }
            this.onExtraCallback = true;
            this.IAuthTabCallbackStub.onWarmupCompleted((onExtraCallback) this);
        }

        @Override // o.deserializeUriNullableCollection
        public boolean isDisposed() {
            return this.onExtraCallback;
        }

        void onExtraCallback() {
            if (this.onExtraCallback) {
                return;
            }
            synchronized (this) {
                if (this.onExtraCallback) {
                    return;
                }
                if (this.asInterface) {
                    return;
                }
                setTid<T> settid = this.IAuthTabCallbackStub;
                Lock lock = settid.IAuthTabCallback;
                lock.lock();
                this.IAuthTabCallback = settid.onExtraCallback;
                Object obj = settid.asInterface.get();
                lock.unlock();
                this.onExtraCallbackWithResult = obj != null;
                this.asInterface = true;
                if (obj == null || test(obj)) {
                    return;
                }
                onWarmupCompleted();
            }
        }

        void onWarmupCompleted(Object obj, long j) {
            if (this.onExtraCallback) {
                return;
            }
            if (!this.onNavigationEvent) {
                synchronized (this) {
                    if (this.onExtraCallback) {
                        return;
                    }
                    if (this.IAuthTabCallback == j) {
                        return;
                    }
                    if (this.onExtraCallbackWithResult) {
                        ensureLogsIsMutable<Object> ensurelogsismutable = this.IAuthTabCallbackDefault;
                        if (ensurelogsismutable == null) {
                            ensurelogsismutable = new ensureLogsIsMutable<>(4);
                            this.IAuthTabCallbackDefault = ensurelogsismutable;
                        }
                        ensurelogsismutable.onNavigationEvent(obj);
                        return;
                    }
                    this.asInterface = true;
                    this.onNavigationEvent = true;
                }
            }
            test(obj);
        }

        @Override // o.ensureLogsIsMutable.onExtraCallbackWithResult, o.deserializeLongCollection
        public boolean test(Object obj) {
            return this.onExtraCallback || access26200.accept(obj, this.onWarmupCompleted);
        }

        void onWarmupCompleted() {
            ensureLogsIsMutable<Object> ensurelogsismutable;
            while (!this.onExtraCallback) {
                synchronized (this) {
                    ensurelogsismutable = this.IAuthTabCallbackDefault;
                    if (ensurelogsismutable == null) {
                        this.onExtraCallbackWithResult = false;
                        return;
                    }
                    this.IAuthTabCallbackDefault = null;
                }
                ensurelogsismutable.onExtraCallbackWithResult((ensureLogsIsMutable.onExtraCallbackWithResult<? super Object>) this);
            }
        }
    }
}
