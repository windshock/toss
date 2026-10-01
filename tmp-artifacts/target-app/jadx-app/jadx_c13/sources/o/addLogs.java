package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class addLogs<T> extends addAllLogs<T> {
    private static final long serialVersionUID = -2151279923272604993L;
    public final ycxExternalSyntheticLambda0<? super T> downstream;
    public T value;

    public addLogs(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.downstream = ycxexternalsyntheticlambda0;
    }

    @Override // o.ycxExternalSyntheticLambda1
    public final void request(long j) {
        T t;
        if (setLogs.validate(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (t = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
                    ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                    if (get() != 4) {
                        ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void IAuthTabCallback(T t) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0 = this.downstream;
                ycxexternalsyntheticlambda0.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
                if (get() != 4) {
                    ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                    return;
                }
                return;
            }
            this.value = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i = get();
            if (i == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t;
        lazySet(16);
        ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda02 = this.downstream;
        ycxexternalsyntheticlambda02.onWarmupCompleted((ycxExternalSyntheticLambda0<? super T>) t);
        if (get() != 4) {
            ycxexternalsyntheticlambda02.onExtraCallbackWithResult();
        }
    }

    @Override // o.parseFloatGeneric
    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // o.parsePositiveDecimal
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.value;
        this.value = null;
        return t;
    }

    @Override // o.parsePositiveDecimal
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // o.parsePositiveDecimal
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public void cancel() {
        set(4);
        this.value = null;
    }

    public final boolean onWarmupCompleted() {
        return get() == 4;
    }
}
