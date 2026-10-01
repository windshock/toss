package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class NumberConverter17$onExtraCallback extends AtomicInteger implements JsonReaderDoublePrecision {
    private static final long serialVersionUID = -7965400327305809232L;
    final JsonReaderDoublePrecision downstream;
    final deserializeShortArray sd = new deserializeShortArray();
    final Iterator<? extends JsonReaderErrorInfo> sources;

    NumberConverter17$onExtraCallback(JsonReaderDoublePrecision jsonReaderDoublePrecision, Iterator<? extends JsonReaderErrorInfo> it) {
        this.downstream = jsonReaderDoublePrecision;
        this.sources = it;
    }

    public void IAuthTabCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
        this.sd.IAuthTabCallback(deserializeurinullablecollection);
    }

    public void onExtraCallbackWithResult(Throwable th) {
        this.downstream.onExtraCallbackWithResult(th);
    }

    public void onExtraCallback() {
        onWarmupCompleted();
    }

    void onWarmupCompleted() {
        if (this.sd.isDisposed() || getAndIncrement() != 0) {
            return;
        }
        Iterator<? extends JsonReaderErrorInfo> it = this.sources;
        while (!this.sd.isDisposed()) {
            try {
                if (!it.hasNext()) {
                    this.downstream.onExtraCallback();
                    return;
                }
                try {
                    ((JsonReaderErrorInfo) floatExponent.onExtraCallbackWithResult(it.next(), "The CompletableSource returned is null")).onExtraCallbackWithResult(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } catch (Throwable th) {
                    NumberConverter.onWarmupCompleted(th);
                    this.downstream.onExtraCallbackWithResult(th);
                    return;
                }
            } catch (Throwable th2) {
                NumberConverter.onWarmupCompleted(th2);
                this.downstream.onExtraCallbackWithResult(th2);
                return;
            }
        }
    }
}
