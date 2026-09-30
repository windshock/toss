package o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class clearLogs<T> extends AtomicInteger implements JsonReaderReadObject<T>, ycxExternalSyntheticLambda1 {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final ycxExternalSyntheticLambda0<? super T> downstream;
    final getLogsOrBuilder error = new getLogsOrBuilder();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<ycxExternalSyntheticLambda1> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public clearLogs(ycxExternalSyntheticLambda0<? super T> ycxexternalsyntheticlambda0) {
        this.downstream = ycxexternalsyntheticlambda0;
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void request(long j) {
        if (j <= 0) {
            cancel();
            onWarmupCompleted((Throwable) new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j));
            return;
        }
        setLogs.deferredRequest(this.upstream, this.requested, j);
    }

    @Override // o.ycxExternalSyntheticLambda1
    public void cancel() {
        if (this.done) {
            return;
        }
        setLogs.cancel(this.upstream);
    }

    @Override // o.JsonReaderReadObject, o.ycxExternalSyntheticLambda0
    public void onExtraCallback(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onExtraCallback(this);
            setLogs.deferredSetOnce(this.upstream, this.requested, ycxexternalsyntheticlambda1);
        } else {
            ycxexternalsyntheticlambda1.cancel();
            cancel();
            onWarmupCompleted((Throwable) new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(T t) {
        TombstoneProtosLogMessage.onNavigationEvent(this.downstream, t, this, this.error);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onWarmupCompleted(Throwable th) {
        this.done = true;
        TombstoneProtosLogMessage.onNavigationEvent((ycxExternalSyntheticLambda0<?>) this.downstream, th, (AtomicInteger) this, this.error);
    }

    @Override // o.ycxExternalSyntheticLambda0
    public void onExtraCallbackWithResult() {
        this.done = true;
        TombstoneProtosLogMessage.onNavigationEvent(this.downstream, this, this.error);
    }
}
