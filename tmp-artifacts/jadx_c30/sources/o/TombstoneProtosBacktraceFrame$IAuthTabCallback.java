package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TombstoneProtosBacktraceFrame$IAuthTabCallback extends TombstoneProtosBacktraceFrame$onExtraCallback {
    private static final long serialVersionUID = 2587302975077663557L;
    final ycxExternalSyntheticLambda0<? super Integer> downstream;

    TombstoneProtosBacktraceFrame$IAuthTabCallback(ycxExternalSyntheticLambda0<? super Integer> ycxexternalsyntheticlambda0, int i, int i2) {
        super(i, i2);
        this.downstream = ycxexternalsyntheticlambda0;
    }

    @Override // o.TombstoneProtosBacktraceFrame$onExtraCallback
    void onNavigationEvent() {
        int i = this.end;
        ycxExternalSyntheticLambda0<? super Integer> ycxexternalsyntheticlambda0 = this.downstream;
        for (int i2 = this.index; i2 != i; i2++) {
            if (this.cancelled) {
                return;
            }
            ycxexternalsyntheticlambda0.onWarmupCompleted(Integer.valueOf(i2));
        }
        if (this.cancelled) {
            return;
        }
        ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r9.index = r1;
        r10 = addAndGet(-r5);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.TombstoneProtosBacktraceFrame$onExtraCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void onNavigationEvent(long j) {
        int i = this.end;
        int i2 = this.index;
        ycxExternalSyntheticLambda0<? super Integer> ycxexternalsyntheticlambda0 = this.downstream;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i2 == i) {
                    if (i2 == i) {
                        if (this.cancelled) {
                            return;
                        }
                        ycxexternalsyntheticlambda0.onExtraCallbackWithResult();
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    }
                } else {
                    if (this.cancelled) {
                        return;
                    }
                    ycxexternalsyntheticlambda0.onWarmupCompleted(Integer.valueOf(i2));
                    j2++;
                    i2++;
                }
            }
        } while (j != 0);
    }
}
