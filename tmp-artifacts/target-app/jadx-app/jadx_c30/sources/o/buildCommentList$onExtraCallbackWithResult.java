package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
abstract class buildCommentList$onExtraCallbackWithResult<T> extends clearName<T> {
    private static final long serialVersionUID = -2252972430506210021L;
    final T[] array;
    volatile boolean cancelled;
    int index;

    abstract void IAuthTabCallback(long j);

    abstract void onNavigationEvent();

    public final int requestFusion(int i) {
        return i & 1;
    }

    buildCommentList$onExtraCallbackWithResult(T[] tArr) {
        this.array = tArr;
    }

    public final T poll() {
        int i = this.index;
        T[] tArr = this.array;
        if (i == tArr.length) {
            return null;
        }
        this.index = i + 1;
        return (T) floatExponent.onExtraCallbackWithResult(tArr[i], "array element is null");
    }

    public final boolean isEmpty() {
        return this.index == this.array.length;
    }

    public final void clear() {
        this.index = this.array.length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void request(long j) {
        if (setLogs.validate(j) && TombstoneProtosLogBufferBuilder.onWarmupCompleted(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                onNavigationEvent();
            } else {
                IAuthTabCallback(j);
            }
        }
    }

    public final void cancel() {
        this.cancelled = true;
    }
}
