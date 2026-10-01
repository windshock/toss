package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class removeLogs<T> extends AtomicInteger implements parsePositiveInt<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final ycxExternalSyntheticLambda0<? super T> subscriber;
    final T value;

    @Override // o.parseFloatGeneric
    public int requestFusion(int i) {
        return i & 1;
    }

    public removeLogs(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0, T t) {
        this.subscriber = ycxexternalsyntheticlambda0;
        this.value = t;
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        if (setLogs.validate(j) && compareAndSet(0, 1)) {
            ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.subscriber;
            ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) this.value);
            if (get() != 2) {
                ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        lazySet(2);
    }

    @Override // o.parsePositiveDecimal
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // o.parsePositiveDecimal
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // o.parsePositiveDecimal
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // o.parsePositiveDecimal
    public void clear() {
        lazySet(1);
    }
}
