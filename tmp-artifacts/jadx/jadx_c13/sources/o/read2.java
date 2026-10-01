package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class read2<T> extends AtomicInteger implements parseDoubleGeneric<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // o.parsePositiveDecimal
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
