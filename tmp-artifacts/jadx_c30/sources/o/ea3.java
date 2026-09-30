package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ea3 {
    private final jc2 IAuthTabCallback;
    private final String onExtraCallbackWithResult;

    public ea3(String str, jc2 jc2Var) {
        this.onExtraCallbackWithResult = str;
        this.IAuthTabCallback = jc2Var;
    }

    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public jc2 onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ea3 ea3Var = (ea3) obj;
        if (onExtraCallback() == null ? ea3Var.onExtraCallback() == null : onExtraCallback().equals(ea3Var.onExtraCallback())) {
            return onWarmupCompleted() == null ? ea3Var.onWarmupCompleted() == null : onWarmupCompleted().equals(ea3Var.onWarmupCompleted());
        }
        return false;
    }

    public int hashCode() {
        return ((onExtraCallback() != null ? onExtraCallback().hashCode() : 0) * 31) + (onWarmupCompleted() != null ? onWarmupCompleted().hashCode() : 0);
    }
}
