package o;

import java.util.concurrent.CountDownLatch;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class write4<T> extends CountDownLatch implements deserializeIpNullableCollection<T>, JsonReaderDoublePrecision, ensureCapacity<T> {
    deserializeUriNullableCollection IAuthTabCallback;
    volatile boolean onExtraCallback;
    Throwable onNavigationEvent;
    T onWarmupCompleted;

    public write4() {
        super(1);
    }

    void onWarmupCompleted() {
        this.onExtraCallback = true;
        deserializeUriNullableCollection deserializeurinullablecollection = this.IAuthTabCallback;
        if (deserializeurinullablecollection != null) {
            deserializeurinullablecollection.dispose();
        }
    }

    @Override // o.deserializeIpNullableCollection
    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        this.IAuthTabCallback = deserializeurinullablecollection;
        if (this.onExtraCallback) {
            deserializeurinullablecollection.dispose();
        }
    }

    @Override // o.deserializeIpNullableCollection
    public void onNavigationEvent(T t) {
        this.onWarmupCompleted = t;
        countDown();
    }

    @Override // o.deserializeIpNullableCollection
    public void onExtraCallbackWithResult(Throwable th) {
        this.onNavigationEvent = th;
        countDown();
    }

    @Override // o.JsonReaderDoublePrecision
    public void onExtraCallback() {
        countDown();
    }

    public T onExtraCallbackWithResult() throws InterruptedException {
        if (getCount() != 0) {
            try {
                getLogsOrBuilderList.onNavigationEvent();
                await();
            } catch (InterruptedException e) {
                onWarmupCompleted();
                throw access26100.onExtraCallback(e);
            }
        }
        Throwable th = this.onNavigationEvent;
        if (th != null) {
            throw access26100.onExtraCallback(th);
        }
        return this.onWarmupCompleted;
    }

    public Throwable IAuthTabCallback() throws InterruptedException {
        if (getCount() != 0) {
            try {
                getLogsOrBuilderList.onNavigationEvent();
                await();
            } catch (InterruptedException e) {
                onWarmupCompleted();
                return e;
            }
        }
        return this.onNavigationEvent;
    }
}
