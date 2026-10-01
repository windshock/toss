package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
final class clearOwner$onExtraCallbackWithResult extends read2<Integer> {
    private static final long serialVersionUID = 396518478098735504L;
    final writeQuoted<? super Integer> downstream;
    final long end;
    boolean fused;
    long index;

    clearOwner$onExtraCallbackWithResult(writeQuoted<? super Integer> writequoted, long j, long j2) {
        this.downstream = writequoted;
        this.index = j;
        this.end = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void IAuthTabCallback() {
        if (this.fused) {
            return;
        }
        writeQuoted<? super Integer> writequoted = this.downstream;
        long j = this.end;
        for (long j2 = this.index; j2 != j && get() == 0; j2++) {
            writequoted.onExtraCallback(Integer.valueOf((int) j2));
        }
        if (get() == 0) {
            lazySet(1);
            writequoted.onExtraCallback();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public Integer poll() throws Exception {
        long j = this.index;
        if (j != this.end) {
            this.index = 1 + j;
            return Integer.valueOf((int) j);
        }
        lazySet(1);
        return null;
    }

    public boolean isEmpty() {
        return this.index == this.end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void clear() {
        this.index = this.end;
        lazySet(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispose() {
        set(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isDisposed() {
        return get() != 0;
    }

    public int requestFusion(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.fused = true;
        return 1;
    }
}
