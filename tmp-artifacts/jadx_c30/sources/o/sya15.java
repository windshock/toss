package o;

import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya15 {
    private final Optional<sya8> IAuthTabCallback;
    private final String onExtraCallback;
    private final sya17 onExtraCallbackWithResult;
    private final Optional<sya8> onWarmupCompleted;

    public sya15(sya40 sya40Var) {
        this(sya40Var.asInterface(), sya40Var.IAuthTabCallbackStub(), sya40Var.IAuthTabCallback(), sya40Var.onWarmupCompleted());
    }

    public sya15(Optional<sya8> optional, Optional<sya8> optional2, String str, sya17 sya17Var) {
        Objects.requireNonNull(optional);
        this.onWarmupCompleted = optional;
        Objects.requireNonNull(optional2);
        this.IAuthTabCallback = optional2;
        Objects.requireNonNull(str);
        this.onExtraCallback = str;
        Objects.requireNonNull(sya17Var);
        this.onExtraCallbackWithResult = sya17Var;
    }

    public Optional<sya8> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public sya17 onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public String toString() {
        return "<" + getClass().getName() + " (type=" + onNavigationEvent() + ", value=" + IAuthTabCallback() + ")>";
    }
}
