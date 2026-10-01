package o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access9300$IAuthTabCallback<T, R> extends AtomicInteger implements deserializeUriNullableCollection {
    private static final long serialVersionUID = 2983708048395377667L;
    volatile boolean cancelled;
    final boolean delayError;
    final writeQuoted<? super R> downstream;
    final access9300$onWarmupCompleted<T, R>[] observers;
    final T[] row;
    final deserializeIntNullableCollection<? super Object[], ? extends R> zipper;

    access9300$IAuthTabCallback(writeQuoted<? super R> writequoted, deserializeIntNullableCollection<? super Object[], ? extends R> deserializeintnullablecollection, int i, boolean z) {
        this.downstream = writequoted;
        this.zipper = deserializeintnullablecollection;
        this.observers = new access9300$onWarmupCompleted[i];
        this.row = (T[]) new Object[i];
        this.delayError = z;
    }

    public void onWarmupCompleted(serializeRaw<? extends T>[] serializerawArr, int i) {
        access9300$onWarmupCompleted<T, R>[] access9300_onwarmupcompletedArr = this.observers;
        int length = access9300_onwarmupcompletedArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            access9300_onwarmupcompletedArr[i2] = new access9300$onWarmupCompleted<>(this, i);
        }
        lazySet(0);
        this.downstream.IAuthTabCallback(this);
        for (int i3 = 0; i3 < length && !this.cancelled; i3++) {
            serializerawArr[i3].subscribe(access9300_onwarmupcompletedArr[i3]);
        }
    }

    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        onExtraCallback();
        if (getAndIncrement() == 0) {
            onNavigationEvent();
        }
    }

    public boolean isDisposed() {
        return this.cancelled;
    }

    void IAuthTabCallback() {
        onNavigationEvent();
        onExtraCallback();
    }

    void onExtraCallback() {
        for (access9300$onWarmupCompleted<T, R> access9300_onwarmupcompleted : this.observers) {
            access9300_onwarmupcompleted.onNavigationEvent();
        }
    }

    void onNavigationEvent() {
        for (access9300$onWarmupCompleted<T, R> access9300_onwarmupcompleted : this.observers) {
            access9300_onwarmupcompleted.IAuthTabCallback.clear();
        }
    }

    public void onWarmupCompleted() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        access9300$onWarmupCompleted<T, R>[] access9300_onwarmupcompletedArr = this.observers;
        writeQuoted<? super R> writequoted = this.downstream;
        T[] tArr = this.row;
        boolean z = this.delayError;
        int iAddAndGet = 1;
        while (true) {
            int i = 0;
            int i2 = 0;
            for (access9300$onWarmupCompleted<T, R> access9300_onwarmupcompleted : access9300_onwarmupcompletedArr) {
                if (tArr[i2] == null) {
                    boolean z2 = access9300_onwarmupcompleted.onNavigationEvent;
                    Object objPoll = access9300_onwarmupcompleted.IAuthTabCallback.poll();
                    boolean z3 = objPoll == null;
                    if (onWarmupCompleted(z2, z3, writequoted, z, access9300_onwarmupcompleted)) {
                        return;
                    }
                    if (z3) {
                        i++;
                    } else {
                        tArr[i2] = objPoll;
                    }
                } else if (access9300_onwarmupcompleted.onNavigationEvent && !z && (th = access9300_onwarmupcompleted.onWarmupCompleted) != null) {
                    this.cancelled = true;
                    IAuthTabCallback();
                    writequoted.onExtraCallbackWithResult(th);
                    return;
                }
                i2++;
            }
            if (i == 0) {
                try {
                    writequoted.onExtraCallback(floatExponent.onExtraCallbackWithResult(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                    Arrays.fill(tArr, (Object) null);
                } catch (Throwable th2) {
                    NumberConverter.onWarmupCompleted(th2);
                    IAuthTabCallback();
                    writequoted.onExtraCallbackWithResult(th2);
                    return;
                }
            } else {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    boolean onWarmupCompleted(boolean z, boolean z2, writeQuoted<? super R> writequoted, boolean z3, access9300$onWarmupCompleted<?, ?> access9300_onwarmupcompleted) {
        if (this.cancelled) {
            IAuthTabCallback();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            Throwable th = access9300_onwarmupcompleted.onWarmupCompleted;
            this.cancelled = true;
            IAuthTabCallback();
            if (th != null) {
                writequoted.onExtraCallbackWithResult(th);
            } else {
                writequoted.onExtraCallback();
            }
            return true;
        }
        Throwable th2 = access9300_onwarmupcompleted.onWarmupCompleted;
        if (th2 != null) {
            this.cancelled = true;
            IAuthTabCallback();
            writequoted.onExtraCallbackWithResult(th2);
            return true;
        }
        if (!z2) {
            return false;
        }
        this.cancelled = true;
        IAuthTabCallback();
        writequoted.onExtraCallback();
        return true;
    }
}
