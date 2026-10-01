package o;

import java.util.Objects;
import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class uh20<T> extends uh2 {
    private sya19 onWarmupCompleted;

    public uh20(uh25 uh25Var, sya19 sya19Var, Optional<sya8> optional, Optional<sya8> optional2) {
        super(uh25Var, optional, optional2);
        onNavigationEvent(sya19Var);
    }

    public void onNavigationEvent(sya19 sya19Var) {
        Objects.requireNonNull(sya19Var, "Flow style must be provided.");
        this.onWarmupCompleted = sya19Var;
    }

    public void onExtraCallback(Optional<sya8> optional) {
        this.onNavigationEvent = optional;
    }
}
