package o;

import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh24 {
    private final uh2 onExtraCallbackWithResult;
    private final uh2 onWarmupCompleted;

    public uh24(uh2 uh2Var, uh2 uh2Var2) {
        Objects.requireNonNull(uh2Var, "keyNode must be provided.");
        Objects.requireNonNull(uh2Var2, "value Node must be provided");
        this.onExtraCallbackWithResult = uh2Var;
        this.onWarmupCompleted = uh2Var2;
    }

    public uh2 onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public uh2 onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "<NodeTuple keyNode=" + this.onExtraCallbackWithResult + "; valueNode=" + this.onWarmupCompleted + ">";
    }
}
