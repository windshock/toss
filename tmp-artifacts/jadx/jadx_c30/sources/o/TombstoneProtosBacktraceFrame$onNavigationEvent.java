package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class TombstoneProtosBacktraceFrame$onNavigationEvent extends TombstoneProtosBacktraceFrame$onExtraCallback {
    private static final long serialVersionUID = 2587302975077663557L;
    final deserializeShortCollection<? super Integer> downstream;

    TombstoneProtosBacktraceFrame$onNavigationEvent(deserializeShortCollection<? super Integer> deserializeshortcollection, int i, int i2) {
        super(i, i2);
        this.downstream = deserializeshortcollection;
    }

    @Override // o.TombstoneProtosBacktraceFrame$onExtraCallback
    void onNavigationEvent() {
        int i = this.end;
        deserializeShortCollection<? super Integer> deserializeshortcollection = this.downstream;
        for (int i2 = this.index; i2 != i; i2++) {
            if (this.cancelled) {
                return;
            }
            deserializeshortcollection.onExtraCallback(Integer.valueOf(i2));
        }
        if (this.cancelled) {
            return;
        }
        deserializeshortcollection.onExtraCallbackWithResult();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
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
        deserializeShortCollection<? super Integer> deserializeshortcollection = this.downstream;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j || i2 == i) {
                    if (i2 == i) {
                        if (this.cancelled) {
                            return;
                        }
                        deserializeshortcollection.onExtraCallbackWithResult();
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
                    if (deserializeshortcollection.onExtraCallback(Integer.valueOf(i2))) {
                        j2++;
                    }
                    i2++;
                }
            }
        } while (j != 0);
    }
}
