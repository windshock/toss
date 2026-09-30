package o;

import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class addAllAllocationBacktrace<T> extends writeRaw<T> {
    final Callable<? extends Throwable> onExtraCallbackWithResult;

    public addAllAllocationBacktrace(Callable<? extends Throwable> callable) {
        this.onExtraCallbackWithResult = callable;
    }

    @Override // o.writeRaw
    public void onExtraCallbackWithResult(deserializeIpNullableCollection<? super T> deserializeipnullablecollection) {
        try {
            th = (Throwable) floatExponent.onExtraCallbackWithResult(this.onExtraCallbackWithResult.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            NumberConverter.onWarmupCompleted(th);
        }
        deserializeShort.error(th, deserializeipnullablecollection);
    }
}
