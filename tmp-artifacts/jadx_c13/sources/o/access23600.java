package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class access23600<F, S> {
    public F onNavigationEvent;
    public S onWarmupCompleted;

    public access23600(F f, S s) {
        this.onNavigationEvent = f;
        this.onWarmupCompleted = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof access23600)) {
            return false;
        }
        access23600 access23600Var = (access23600) obj;
        return onWarmupCompleted(access23600Var.onNavigationEvent, this.onNavigationEvent) && onWarmupCompleted(access23600Var.onWarmupCompleted, this.onWarmupCompleted);
    }

    private boolean onWarmupCompleted(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public int hashCode() {
        F f = this.onNavigationEvent;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.onWarmupCompleted;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.onNavigationEvent) + " " + String.valueOf(this.onWarmupCompleted) + "}";
    }
}
