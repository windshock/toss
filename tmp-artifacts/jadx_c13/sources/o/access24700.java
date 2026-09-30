package o;

import o.getOwner;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access24700<T> extends getByteBuffer<T> implements parseNegativeNumber<T> {
    private final T onWarmupCompleted;

    public access24700(T t) {
        this.onWarmupCompleted = t;
    }

    @Override // o.getByteBuffer
    public void IAuthTabCallback(writeQuoted<? super T> writequoted) {
        getOwner.onWarmupCompleted onwarmupcompleted = new getOwner.onWarmupCompleted(writequoted, this.onWarmupCompleted);
        writequoted.IAuthTabCallback(onwarmupcompleted);
        onwarmupcompleted.run();
    }

    @Override // o.parseNegativeNumber, java.util.concurrent.Callable
    public T call() {
        return this.onWarmupCompleted;
    }
}
