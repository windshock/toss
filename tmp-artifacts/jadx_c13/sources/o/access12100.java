package o;

import java.util.concurrent.Callable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access12100<T> extends getByteBuffer<T> {
    final Callable<? extends serializeRaw<? extends T>> IAuthTabCallback;

    public access12100(Callable<? extends serializeRaw<? extends T>> callable) {
        this.IAuthTabCallback = callable;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        try {
            ((serializeRaw) floatExponent.onExtraCallbackWithResult(this.IAuthTabCallback.call(), "null ObservableSource supplied")).subscribe(writequoted);
        } catch (Throwable th) {
            NumberConverter.onWarmupCompleted(th);
            deserializeShort.error(th, writequoted);
        }
    }
}
