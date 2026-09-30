package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class stopScrollersInternal extends RuntimeException {
    private int reason;

    public stopScrollersInternal(Throwable th, int i2) {
        super(th);
        this.reason = i2;
    }

    public stopScrollersInternal(int i2) {
        this.reason = i2;
    }

    public int onExtraCallbackWithResult() {
        return this.reason;
    }

    public boolean onWarmupCompleted() {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        return iOnExtraCallbackWithResult == 1 || iOnExtraCallbackWithResult == 2 || iOnExtraCallbackWithResult == 3;
    }
}
