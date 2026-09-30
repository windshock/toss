package o;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class NumberConverter4$onExtraCallbackWithResult extends AtomicBoolean implements JsonReaderDoublePrecision {
    private static final long serialVersionUID = -7730517613164279224L;
    final JsonReaderDoublePrecision downstream;
    final deserializeUriCollection set;
    final AtomicInteger wip;

    NumberConverter4$onExtraCallbackWithResult(JsonReaderDoublePrecision jsonReaderDoublePrecision, deserializeUriCollection deserializeuricollection, AtomicInteger atomicInteger) {
        this.downstream = jsonReaderDoublePrecision;
        this.set = deserializeuricollection;
        this.wip = atomicInteger;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        this.set.onNavigationEvent(deserializeurinullablecollection);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.set.dispose();
        if (compareAndSet(false, true)) {
            this.downstream.onExtraCallbackWithResult(th);
        } else {
            RxJavaPlugins.onExtraCallbackWithResult(th);
        }
    }

    public void onExtraCallback() {
        if (this.wip.decrementAndGet() == 0 && compareAndSet(false, true)) {
            this.downstream.onExtraCallback();
        }
    }
}
