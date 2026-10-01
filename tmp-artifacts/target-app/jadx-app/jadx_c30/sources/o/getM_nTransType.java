package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getM_nTransType {
    private final boolean onExtraCallback;
    private final boolean onWarmupCompleted;

    public getM_nTransType(boolean z, boolean z2) {
        this.onWarmupCompleted = z;
        this.onExtraCallback = z2;
    }

    public boolean onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public boolean IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public String toString() {
        return "implicit=[" + this.onWarmupCompleted + ", " + this.onExtraCallback + "]";
    }
}
