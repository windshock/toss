package o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class setNameBytes extends AtomicInteger implements ycxExternalSyntheticLambda1 {
    private static final long serialVersionUID = -2189523197179400958L;
    ycxExternalSyntheticLambda1 actual;
    final boolean cancelOnReplace;
    volatile boolean cancelled;
    long requested;
    protected boolean unbounded;
    final AtomicReference<ycxExternalSyntheticLambda1> missedSubscription = new AtomicReference<>();
    final AtomicLong missedRequested = new AtomicLong();
    final AtomicLong missedProduced = new AtomicLong();

    public setNameBytes(boolean z) {
        this.cancelOnReplace = z;
    }

    public final void onWarmupCompleted(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        if (this.cancelled) {
            ycxexternalsyntheticlambda1.cancel();
            return;
        }
        floatExponent.onExtraCallbackWithResult(ycxexternalsyntheticlambda1, "s is null");
        if (get() == 0 && compareAndSet(0, 1)) {
            ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda12 = this.actual;
            if (ycxexternalsyntheticlambda12 != null && this.cancelOnReplace) {
                ycxexternalsyntheticlambda12.cancel();
            }
            this.actual = ycxexternalsyntheticlambda1;
            long j = this.requested;
            if (decrementAndGet() != 0) {
                IAuthTabCallback();
            }
            if (j != 0) {
                ycxexternalsyntheticlambda1.request(j);
                return;
            }
            return;
        }
        ycxExternalSyntheticLambda1 andSet = this.missedSubscription.getAndSet(ycxexternalsyntheticlambda1);
        if (andSet != null && this.cancelOnReplace) {
            andSet.cancel();
        }
        onNavigationEvent();
    }

    @Override // o.ycxExternalSyntheticLambda1
    public final void request(long j) {
        if (!setLogs.validate(j) || this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.requested;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                long jOnNavigationEvent = TombstoneProtosLogBufferBuilder.onNavigationEvent(j2, j);
                this.requested = jOnNavigationEvent;
                if (jOnNavigationEvent == LongCompanionObject.MAX_VALUE) {
                    this.unbounded = true;
                }
            }
            ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = this.actual;
            if (decrementAndGet() != 0) {
                IAuthTabCallback();
            }
            if (ycxexternalsyntheticlambda1 != null) {
                ycxexternalsyntheticlambda1.request(j);
                return;
            }
            return;
        }
        TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.missedRequested, j);
        onNavigationEvent();
    }

    public final void onWarmupCompleted(long j) {
        if (this.unbounded) {
            return;
        }
        if (get() == 0 && compareAndSet(0, 1)) {
            long j2 = this.requested;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                long j3 = j2 - j;
                if (j3 < 0) {
                    setLogs.reportMoreProduced(j3);
                    j3 = 0;
                }
                this.requested = j3;
            }
            if (decrementAndGet() == 0) {
                return;
            }
            IAuthTabCallback();
            return;
        }
        TombstoneProtosLogBufferBuilder.onWarmupCompleted(this.missedProduced, j);
        onNavigationEvent();
    }

    public void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        onNavigationEvent();
    }

    final void onNavigationEvent() {
        if (getAndIncrement() != 0) {
            return;
        }
        IAuthTabCallback();
    }

    final void IAuthTabCallback() {
        int iAddAndGet = 1;
        long jOnNavigationEvent = 0;
        ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1 = null;
        do {
            ycxExternalSyntheticLambda1 andSet = this.missedSubscription.get();
            if (andSet != null) {
                andSet = this.missedSubscription.getAndSet(null);
            }
            long andSet2 = this.missedRequested.get();
            if (andSet2 != 0) {
                andSet2 = this.missedRequested.getAndSet(0L);
            }
            long andSet3 = this.missedProduced.get();
            if (andSet3 != 0) {
                andSet3 = this.missedProduced.getAndSet(0L);
            }
            ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda12 = this.actual;
            if (this.cancelled) {
                if (ycxexternalsyntheticlambda12 != null) {
                    ycxexternalsyntheticlambda12.cancel();
                    this.actual = null;
                }
                if (andSet != null) {
                    andSet.cancel();
                }
            } else {
                long jOnNavigationEvent2 = this.requested;
                if (jOnNavigationEvent2 != LongCompanionObject.MAX_VALUE) {
                    jOnNavigationEvent2 = TombstoneProtosLogBufferBuilder.onNavigationEvent(jOnNavigationEvent2, andSet2);
                    if (jOnNavigationEvent2 != LongCompanionObject.MAX_VALUE) {
                        jOnNavigationEvent2 -= andSet3;
                        if (jOnNavigationEvent2 < 0) {
                            setLogs.reportMoreProduced(jOnNavigationEvent2);
                            jOnNavigationEvent2 = 0;
                        }
                    }
                    this.requested = jOnNavigationEvent2;
                }
                if (andSet != null) {
                    if (ycxexternalsyntheticlambda12 != null && this.cancelOnReplace) {
                        ycxexternalsyntheticlambda12.cancel();
                    }
                    this.actual = andSet;
                    if (jOnNavigationEvent2 != 0) {
                        jOnNavigationEvent = TombstoneProtosLogBufferBuilder.onNavigationEvent(jOnNavigationEvent, jOnNavigationEvent2);
                        ycxexternalsyntheticlambda1 = andSet;
                    }
                } else if (ycxexternalsyntheticlambda12 != null && andSet2 != 0) {
                    jOnNavigationEvent = TombstoneProtosLogBufferBuilder.onNavigationEvent(jOnNavigationEvent, andSet2);
                    ycxexternalsyntheticlambda1 = ycxexternalsyntheticlambda12;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jOnNavigationEvent != 0) {
            ycxexternalsyntheticlambda1.request(jOnNavigationEvent);
        }
    }

    public final boolean onWarmupCompleted() {
        return this.cancelled;
    }
}
