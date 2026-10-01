package o;

import java.util.Objects;
import java.util.Optional;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class djycx2 extends ycx41 {
    private final String onExtraCallback;
    private final sya6 onExtraCallbackWithResult;
    private final boolean onNavigationEvent;

    public djycx2(String str, boolean z, Optional<sya8> optional, Optional<sya8> optional2) {
        this(str, z, sya6.PLAIN, optional, optional2);
    }

    public djycx2(String str, boolean z, sya6 sya6Var, Optional<sya8> optional, Optional<sya8> optional2) {
        super(optional, optional2);
        Objects.requireNonNull(str);
        this.onExtraCallback = str;
        this.onNavigationEvent = z;
        Objects.requireNonNull(sya6Var);
        this.onExtraCallbackWithResult = sya6Var;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public String IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public sya6 onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public ycx41.IAuthTabCallback onNavigationEvent() {
        return ycx41.IAuthTabCallback.Scalar;
    }

    public String toString() {
        return onNavigationEvent().toString() + " plain=" + this.onNavigationEvent + " style=" + this.onExtraCallbackWithResult + " value=" + this.onExtraCallback;
    }
}
