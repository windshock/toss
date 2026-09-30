package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.LongCompanionObject;
import o.ensureLogsIsMutable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access27100<T> extends access27300<T> {
    final ReadWriteLock IAuthTabCallback;
    final Lock IAuthTabCallbackDefault;
    final Lock IAuthTabCallbackStub;
    final AtomicReference<Object> asBinder;
    final AtomicReference<Throwable> asInterface;
    long onNavigationEvent;
    final AtomicReference<onExtraCallbackWithResult<T>[]> onTransact;
    static final Object[] onWarmupCompleted = new Object[0];
    static final onExtraCallbackWithResult[] onExtraCallbackWithResult = new onExtraCallbackWithResult[0];
    static final onExtraCallbackWithResult[] onExtraCallback = new onExtraCallbackWithResult[0];

    public static <T> access27100<T> ICustomTabsCallback() {
        return new access27100<>();
    }

    public static <T> access27100<T> IAuthTabCallback(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "defaultValue is null");
        return new access27100<>(t);
    }

    access27100() {
        this.asBinder = new AtomicReference<>();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.IAuthTabCallback = reentrantReadWriteLock;
        this.IAuthTabCallbackStub = reentrantReadWriteLock.readLock();
        this.IAuthTabCallbackDefault = reentrantReadWriteLock.writeLock();
        this.onTransact = new AtomicReference<>(onExtraCallbackWithResult);
        this.asInterface = new AtomicReference<>();
    }

    access27100(T t) {
        this();
        this.asBinder.lazySet(floatExponent.onExtraCallbackWithResult((Object) t, "defaultValue is null"));
    }

    @Override // o.JsonReaderUnknownNumberParsing
    public void onNavigationEvent(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        onExtraCallbackWithResult<T> onextracallbackwithresult = new onExtraCallbackWithResult<>(ycxexternalsyntheticlambda0, this);
        ycxexternalsyntheticlambda0.onExtraCallback(onextracallbackwithresult);
        if (onNavigationEvent((onExtraCallbackWithResult) onextracallbackwithresult)) {
            if (onextracallbackwithresult.cancelled) {
                onWarmupCompleted((onExtraCallbackWithResult) onextracallbackwithresult);
                return;
            } else {
                onextracallbackwithresult.onNavigationEvent();
                return;
            }
        }
        Throwable th = this.asInterface.get();
        if (th == access26100.IAuthTabCallback) {
            ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
        } else {
            ycxexternalsyntheticlambda0.onWarmupCompleted(th);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (this.asInterface.get() != null) {
            ycxexternalsyntheticlambda1.cancel();
        } else {
            ycxexternalsyntheticlambda1.request(LongCompanionObject.MAX_VALUE);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        floatExponent.onExtraCallbackWithResult((Object) t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.asInterface.get() == null) {
            Object next = access26200.next(t);
            onNavigationEvent(next);
            for (onExtraCallbackWithResult<T> onextracallbackwithresult : this.onTransact.get()) {
                onextracallbackwithresult.onNavigationEvent(next, this.onNavigationEvent);
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        floatExponent.onExtraCallbackWithResult(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!setSupportImageTintList.onNavigationEvent(this.asInterface, (Object) null, th)) {
            RxJavaPlugins.onExtraCallbackWithResult(th);
            return;
        }
        Object objError = access26200.error(th);
        for (onExtraCallbackWithResult<T> onextracallbackwithresult : onExtraCallbackWithResult(objError)) {
            onextracallbackwithresult.onNavigationEvent(objError, this.onNavigationEvent);
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        if (setSupportImageTintList.onNavigationEvent(this.asInterface, (Object) null, access26100.IAuthTabCallback)) {
            Object objComplete = access26200.complete();
            for (onExtraCallbackWithResult<T> onextracallbackwithresult : onExtraCallbackWithResult(objComplete)) {
                onextracallbackwithresult.onNavigationEvent(objComplete, this.onNavigationEvent);
            }
        }
    }

    public T readTypedObject() {
        Object obj = this.asBinder.get();
        if (access26200.isComplete(obj) || access26200.isError(obj)) {
            return null;
        }
        return (T) access26200.getValue(obj);
    }

    boolean onNavigationEvent(onExtraCallbackWithResult<T> onextracallbackwithresult) {
        onExtraCallbackWithResult<T>[] onextracallbackwithresultArr;
        onExtraCallbackWithResult[] onextracallbackwithresultArr2;
        do {
            onextracallbackwithresultArr = this.onTransact.get();
            if (onextracallbackwithresultArr == onExtraCallback) {
                return false;
            }
            int length = onextracallbackwithresultArr.length;
            onextracallbackwithresultArr2 = new onExtraCallbackWithResult[length + 1];
            System.arraycopy(onextracallbackwithresultArr, 0, onextracallbackwithresultArr2, 0, length);
            onextracallbackwithresultArr2[length] = onextracallbackwithresult;
        } while (!setSupportImageTintList.onNavigationEvent(this.onTransact, onextracallbackwithresultArr, onextracallbackwithresultArr2));
        return true;
    }

    void onWarmupCompleted(onExtraCallbackWithResult<T> onextracallbackwithresult) {
        onExtraCallbackWithResult<T>[] onextracallbackwithresultArr;
        onExtraCallbackWithResult[] onextracallbackwithresultArr2;
        do {
            onextracallbackwithresultArr = this.onTransact.get();
            int length = onextracallbackwithresultArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (onextracallbackwithresultArr[i] == onextracallbackwithresult) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                onextracallbackwithresultArr2 = onExtraCallbackWithResult;
            } else {
                onExtraCallbackWithResult[] onextracallbackwithresultArr3 = new onExtraCallbackWithResult[length - 1];
                System.arraycopy(onextracallbackwithresultArr, 0, onextracallbackwithresultArr3, 0, i);
                System.arraycopy(onextracallbackwithresultArr, i + 1, onextracallbackwithresultArr3, i, (length - i) - 1);
                onextracallbackwithresultArr2 = onextracallbackwithresultArr3;
            }
        } while (!setSupportImageTintList.onNavigationEvent(this.onTransact, onextracallbackwithresultArr, onextracallbackwithresultArr2));
    }

    onExtraCallbackWithResult<T>[] onExtraCallbackWithResult(Object obj) {
        onExtraCallbackWithResult<T>[] andSet = this.onTransact.get();
        onExtraCallbackWithResult<T>[] onextracallbackwithresultArr = onExtraCallback;
        if (andSet != onextracallbackwithresultArr && (andSet = this.onTransact.getAndSet(onextracallbackwithresultArr)) != onextracallbackwithresultArr) {
            onNavigationEvent(obj);
        }
        return andSet;
    }

    void onNavigationEvent(Object obj) {
        Lock lock = this.IAuthTabCallbackDefault;
        lock.lock();
        this.onNavigationEvent++;
        this.asBinder.lazySet(obj);
        lock.unlock();
    }

    static final class onExtraCallbackWithResult<T> extends AtomicLong implements ycxExternalSyntheticLambda1, ensureLogsIsMutable.onExtraCallbackWithResult<Object> {
        private static final long serialVersionUID = 3293175281126227086L;
        volatile boolean cancelled;
        final ycxExternalSyntheticLambda0<? super T> downstream;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        ensureLogsIsMutable<Object> queue;
        final access27100<T> state;

        onExtraCallbackWithResult(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, access27100<T> access27100Var) {
            this.downstream = ycxexternalsyntheticlambda0;
            this.state = access27100Var;
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void request(long j) {
            if (setLogs.validate(j)) {
                TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j);
            }
        }

        @Override // o.ycxExternalSyntheticLambda1
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.onWarmupCompleted((onExtraCallbackWithResult) this);
        }

        void onNavigationEvent() {
            if (this.cancelled) {
                return;
            }
            synchronized (this) {
                if (this.cancelled) {
                    return;
                }
                if (this.next) {
                    return;
                }
                access27100<T> access27100Var = this.state;
                Lock lock = access27100Var.IAuthTabCallbackStub;
                lock.lock();
                this.index = access27100Var.onNavigationEvent;
                Object obj = access27100Var.asBinder.get();
                lock.unlock();
                this.emitting = obj != null;
                this.next = true;
                if (obj == null || test(obj)) {
                    return;
                }
                onWarmupCompleted();
            }
        }

        void onNavigationEvent(Object obj, long j) {
            if (this.cancelled) {
                return;
            }
            if (!this.fastPath) {
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    if (this.index == j) {
                        return;
                    }
                    if (this.emitting) {
                        ensureLogsIsMutable<Object> ensurelogsismutable = this.queue;
                        if (ensurelogsismutable == null) {
                            ensurelogsismutable = new ensureLogsIsMutable<>(4);
                            this.queue = ensurelogsismutable;
                        }
                        ensurelogsismutable.onNavigationEvent(obj);
                        return;
                    }
                    this.next = true;
                    this.fastPath = true;
                }
            }
            test(obj);
        }

        @Override // o.ensureLogsIsMutable.onExtraCallbackWithResult, o.deserializeLongCollection
        public boolean test(Object obj) {
            if (this.cancelled) {
                return true;
            }
            if (access26200.isComplete(obj)) {
                this.downstream.onExtraCallbackWithResult();
                return true;
            }
            if (access26200.isError(obj)) {
                this.downstream.onWarmupCompleted(access26200.getError(obj));
                return true;
            }
            long j = get();
            if (j != 0) {
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) access26200.getValue(obj));
                if (j == LongCompanionObject.MAX_VALUE) {
                    return false;
                }
                decrementAndGet();
                return false;
            }
            cancel();
            this.downstream.onWarmupCompleted((Throwable) new NetConverter4("Could not deliver value due to lack of requests"));
            return true;
        }

        void onWarmupCompleted() {
            ensureLogsIsMutable<Object> ensurelogsismutable;
            while (!this.cancelled) {
                synchronized (this) {
                    ensurelogsismutable = this.queue;
                    if (ensurelogsismutable == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                }
                ensurelogsismutable.onExtraCallbackWithResult((ensureLogsIsMutable.onExtraCallbackWithResult<? super Object>) this);
            }
        }
    }
}
