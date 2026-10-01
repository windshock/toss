package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class addAllLogs<T> extends AtomicInteger implements parsePositiveInt<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // o.parsePositiveDecimal
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
