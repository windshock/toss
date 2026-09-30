package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya46 {
    private final boolean onExtraCallback;
    private final boolean onWarmupCompleted;

    public sya46(boolean z, boolean z2) {
        this.onWarmupCompleted = z;
        this.onExtraCallback = z2;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public boolean onNavigationEvent() {
        return this.onExtraCallback;
    }

    public boolean IAuthTabCallback() {
        return (this.onWarmupCompleted || this.onExtraCallback) ? false : true;
    }

    public String toString() {
        return "implicit=[" + this.onWarmupCompleted + ", " + this.onExtraCallback + "]";
    }
}
