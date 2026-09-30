package o;

import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh23 extends uh2 {
    private final sya6 onExtraCallbackWithResult;
    private final String onWarmupCompleted;

    public uh23(uh25 uh25Var, boolean z, String str, sya6 sya6Var, Optional<sya8> optional, Optional<sya8> optional2) {
        super(uh25Var, optional, optional2);
        Objects.requireNonNull(str, "value in a Node is required.");
        this.onWarmupCompleted = str;
        Objects.requireNonNull(sya6Var, "Scalar style must be provided.");
        this.onExtraCallbackWithResult = sya6Var;
        this.IAuthTabCallback = z;
    }

    public sya6 onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.uh2
    public uh22 onExtraCallbackWithResult() {
        return uh22.SCALAR;
    }

    public String onTransact() {
        return this.onWarmupCompleted;
    }

    public String toString() {
        return "<" + getClass().getName() + " (tag=" + onExtraCallback() + ", value=" + onTransact() + ")>";
    }
}
