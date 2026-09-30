package o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class getAllocationBacktraceCount<E> extends AtomicReferenceArray<E> implements parseNegativeInt<E> {
    private static final Integer IAuthTabCallback = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    int onExtraCallback(long j, int i) {
        return ((int) j) & i;
    }

    public getAllocationBacktraceCount(int i) {
        super(access26400.onWarmupCompleted(i));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i / 4, IAuthTabCallback.intValue());
    }

    @Override // o.parsePositiveDecimal
    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i = this.mask;
        long j = this.producerIndex.get();
        int iOnExtraCallback = onExtraCallback(j, i);
        if (j >= this.producerLookAhead) {
            long j2 = this.lookAheadStep + j;
            if (onWarmupCompleted(onExtraCallback(j2, i)) == null) {
                this.producerLookAhead = j2;
            } else if (onWarmupCompleted(iOnExtraCallback) != null) {
                return false;
            }
        }
        onExtraCallback(iOnExtraCallback, (int) e);
        onExtraCallbackWithResult(j + 1);
        return true;
    }

    @Override // o.parseNegativeInt, o.parsePositiveDecimal
    public E poll() {
        long j = this.consumerIndex.get();
        int iIAuthTabCallback = IAuthTabCallback(j);
        E eOnWarmupCompleted = onWarmupCompleted(iIAuthTabCallback);
        if (eOnWarmupCompleted == null) {
            return null;
        }
        onExtraCallback(j + 1);
        onExtraCallback(iIAuthTabCallback, (int) null);
        return eOnWarmupCompleted;
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return this.producerIndex.get() == this.consumerIndex.get();
    }

    void onExtraCallbackWithResult(long j) {
        this.producerIndex.lazySet(j);
    }

    void onExtraCallback(long j) {
        this.consumerIndex.lazySet(j);
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    int IAuthTabCallback(long j) {
        return ((int) j) & this.mask;
    }

    void onExtraCallback(int i, E e) {
        lazySet(i, e);
    }

    E onWarmupCompleted(int i) {
        return get(i);
    }
}
