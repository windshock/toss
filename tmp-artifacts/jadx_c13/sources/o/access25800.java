package o;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class access25800<T, R> extends AtomicLong implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
    private static final long serialVersionUID = 7917814472626990048L;
    public final ycxExternalSyntheticLambda0<? super R> downstream;
    public long produced;
    protected ycxExternalSyntheticLambda1 upstream;
    protected R value;

    public access25800(ycxExternalSyntheticLambda0<? super R> ycxexternalsyntheticlambda0) {
        this.downstream = ycxexternalsyntheticlambda0;
    }

    @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (setLogs.validate(this.upstream, ycxexternalsyntheticlambda1)) {
            this.upstream = ycxexternalsyntheticlambda1;
            this.downstream.onExtraCallback(this);
        }
    }

    public final void onExtraCallbackWithResult(R r) {
        long j = this.produced;
        if (j != 0) {
            TombstoneProtosLogBufferBuilder.onExtraCallbackWithResult(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                return;
            }
            if ((j2 & LongCompanionObject.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) r);
                this.downstream.onExtraCallbackWithResult();
                return;
            } else {
                this.value = r;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    @Override // o.ycxExternalSyntheticLambda1
    public final void request(long j) {
        long j2;
        if (setLogs.validate(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        this.downstream.onWarmupCompleted((ycxExternalSyntheticLambda0<? super R>) this.value);
                        this.downstream.onExtraCallbackWithResult();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, TombstoneProtosLogBufferBuilder.onNavigationEvent(j2, j)));
            this.upstream.request(j);
        }
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        this.upstream.cancel();
    }
}
