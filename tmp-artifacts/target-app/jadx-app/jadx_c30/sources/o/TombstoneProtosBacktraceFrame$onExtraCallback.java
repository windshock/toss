package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class TombstoneProtosBacktraceFrame$onExtraCallback extends clearName<Integer> {
    private static final long serialVersionUID = -2252972430506210021L;
    volatile boolean cancelled;
    final int end;
    int index;

    abstract void onNavigationEvent();

    abstract void onNavigationEvent(long j);

    public final int requestFusion(int i) {
        return i & 1;
    }

    TombstoneProtosBacktraceFrame$onExtraCallback(int i, int i2) {
        this.index = i;
        this.end = i2;
    }

    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public final Integer poll() {
        int i = this.index;
        if (i == this.end) {
            return null;
        }
        this.index = i + 1;
        return Integer.valueOf(i);
    }

    public final boolean isEmpty() {
        return this.index == this.end;
    }

    public final void clear() {
        this.index = this.end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void request(long j) {
        if (setLogs.validate(j) && TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                onNavigationEvent();
            } else {
                onNavigationEvent(j);
            }
        }
    }

    public final void cancel() {
        this.cancelled = true;
    }
}
