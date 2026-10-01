package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.MapConverter;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access10600$onExtraCallback<T> extends AtomicInteger implements writeQuoted<T>, deserializeUriNullableCollection, Runnable {
    private static final long serialVersionUID = -8296689127439125014L;
    volatile boolean cancelled;
    volatile boolean done;
    final writeQuoted<? super T> downstream;
    final boolean emitLast;
    Throwable error;
    final AtomicReference<T> latest = new AtomicReference<>();
    final long timeout;
    volatile boolean timerFired;
    boolean timerRunning;
    final TimeUnit unit;
    deserializeUriNullableCollection upstream;
    final MapConverter.onNavigationEvent worker;

    access10600$onExtraCallback(writeQuoted<? super T> writequoted, long j, TimeUnit timeUnit, MapConverter.onNavigationEvent onnavigationevent, boolean z) {
        this.downstream = writequoted;
        this.timeout = j;
        this.unit = timeUnit;
        this.worker = onnavigationevent;
        this.emitLast = z;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.validate(this.upstream, deserializeurinullablecollection)) {
            this.upstream = deserializeurinullablecollection;
            this.downstream.IAuthTabCallback(this);
        }
    }

    public void onExtraCallback(T t) {
        this.latest.set(t);
        IAuthTabCallback();
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.error = th;
        this.done = true;
        IAuthTabCallback();
    }

    public void onExtraCallback() {
        this.done = true;
        IAuthTabCallback();
    }

    public void dispose() {
        this.cancelled = true;
        this.upstream.dispose();
        this.worker.dispose();
        if (getAndIncrement() == 0) {
            this.latest.lazySet(null);
        }
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.timerFired = true;
        IAuthTabCallback();
    }

    void IAuthTabCallback() {
        if (getAndIncrement() == 0) {
            AtomicReference<T> atomicReference = this.latest;
            writeQuoted<? super T> writequoted = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z = this.done;
                if (z && this.error != null) {
                    atomicReference.lazySet(null);
                    writequoted.onExtraCallbackWithResult(this.error);
                    this.worker.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    T andSet = atomicReference.getAndSet(null);
                    if (!z2 && this.emitLast) {
                        writequoted.onExtraCallback(andSet);
                    }
                    writequoted.onExtraCallback();
                    this.worker.dispose();
                    return;
                }
                if (z2) {
                    if (this.timerFired) {
                        this.timerRunning = false;
                        this.timerFired = false;
                    }
                } else if (!this.timerRunning || this.timerFired) {
                    writequoted.onExtraCallback(atomicReference.getAndSet(null));
                    this.timerFired = false;
                    this.timerRunning = true;
                    this.worker.onNavigationEvent(this, this.timeout, this.unit);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }
    }
}
