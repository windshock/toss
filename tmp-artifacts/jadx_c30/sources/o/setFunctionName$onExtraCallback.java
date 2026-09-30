package o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class setFunctionName$onExtraCallback<T> extends AtomicReference<deserializeUriNullableCollection> implements ensureCapacity<T> {
    private static final long serialVersionUID = 3323743579927613702L;
    final int index;
    final setFunctionName$onWarmupCompleted<T, ?> parent;

    setFunctionName$onExtraCallback(setFunctionName$onWarmupCompleted<T, ?> setfunctionname_onwarmupcompleted, int i) {
        this.parent = setfunctionname_onwarmupcompleted;
        this.index = i;
    }

    public void onWarmupCompleted() {
        deserializeNumber.dispose(this);
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        deserializeNumber.setOnce(this, deserializeurinullablecollection);
    }

    public void onNavigationEvent(T t) {
        this.parent.onNavigationEvent((setFunctionName$onWarmupCompleted<T, ?>) t, this.index);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.parent.onNavigationEvent(th, this.index);
    }

    public void onExtraCallback() {
        this.parent.onNavigationEvent(this.index);
    }
}
