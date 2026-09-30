package o;

import java.util.Objects;
import java.util.Optional;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class lt32 extends ycx41 {
    private final sya18 IAuthTabCallback;

    public lt32(sya18 sya18Var, Optional<sya8> optional, Optional<sya8> optional2) {
        super(optional, optional2);
        Objects.requireNonNull(sya18Var);
        this.IAuthTabCallback = sya18Var;
    }

    public sya18 onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public ycx41.IAuthTabCallback onNavigationEvent() {
        return ycx41.IAuthTabCallback.Alias;
    }
}
