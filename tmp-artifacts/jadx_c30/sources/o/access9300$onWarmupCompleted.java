package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class access9300$onWarmupCompleted<T, R> implements writeQuoted<T> {
    final getAllocationBacktraceOrBuilder<T> IAuthTabCallback;
    final access9300$IAuthTabCallback<T, R> onExtraCallback;
    final AtomicReference<deserializeUriNullableCollection> onExtraCallbackWithResult = new AtomicReference<>();
    volatile boolean onNavigationEvent;
    Throwable onWarmupCompleted;

    access9300$onWarmupCompleted(access9300$IAuthTabCallback<T, R> access9300_iauthtabcallback, int i) {
        this.onExtraCallback = access9300_iauthtabcallback;
        this.IAuthTabCallback = new getAllocationBacktraceOrBuilder<>(i);
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this.onExtraCallbackWithResult, deserializeurinullablecollection);
    }

    public void onExtraCallback(T t) {
        this.IAuthTabCallback.offer(t);
        this.onExtraCallback.onWarmupCompleted();
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.onWarmupCompleted = th;
        this.onNavigationEvent = true;
        this.onExtraCallback.onWarmupCompleted();
    }

    public void onExtraCallback() {
        this.onNavigationEvent = true;
        this.onExtraCallback.onWarmupCompleted();
    }

    public void onNavigationEvent() {
        deserializeNumber.dispose(this.onExtraCallbackWithResult);
    }
}
