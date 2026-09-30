package o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class NumberConverter19$IAuthTabCallback extends AtomicReference<deserializeUriNullableCollection> implements JsonReaderDoublePrecision, Runnable, deserializeUriNullableCollection {
    private static final long serialVersionUID = 465972761105851022L;
    final long delay;
    final boolean delayError;
    final JsonReaderDoublePrecision downstream;
    Throwable error;
    final MapConverter scheduler;
    final TimeUnit unit;

    NumberConverter19$IAuthTabCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision, long j, TimeUnit timeUnit, MapConverter mapConverter, boolean z) {
        this.downstream = jsonReaderDoublePrecision;
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = mapConverter;
        this.delayError = z;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        if (deserializeNumber.setOnce(this, deserializeurinullablecollection)) {
            this.downstream.IAuthTabCallback(this);
        }
    }

    public void onExtraCallback() {
        deserializeNumber.replace(this, this.scheduler.onNavigationEvent(this, this.delay, this.unit));
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.error = th;
        deserializeNumber.replace(this, this.scheduler.onNavigationEvent(this, this.delayError ? this.delay : 0L, this.unit));
    }

    public void dispose() {
        deserializeNumber.dispose(this);
    }

    public boolean isDisposed() {
        return deserializeNumber.isDisposed(get());
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th = this.error;
        this.error = null;
        if (th != null) {
            this.downstream.onExtraCallbackWithResult(th);
        } else {
            this.downstream.onExtraCallback();
        }
    }
}
