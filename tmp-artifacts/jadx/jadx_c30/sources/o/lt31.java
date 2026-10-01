package o;

import java.util.Objects;
import java.util.Optional;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class lt31 extends ycx41 {
    private final sya18 onNavigationEvent;

    public lt31(sya18 sya18Var, Optional<sya8> optional, Optional<sya8> optional2) {
        super(optional, optional2);
        Objects.requireNonNull(sya18Var);
        this.onNavigationEvent = sya18Var;
    }

    public sya18 onWarmupCompleted() {
        return this.onNavigationEvent;
    }

    public ycx41.IAuthTabCallback onNavigationEvent() {
        return ycx41.IAuthTabCallback.Anchor;
    }
}
