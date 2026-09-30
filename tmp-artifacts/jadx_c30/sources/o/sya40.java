package o;

import java.util.Objects;
import java.util.Optional;
import o.sya43;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya40 extends sya43 {
    private final String IAuthTabCallback;
    private final sya17 onExtraCallback;

    public sya40(sya17 sya17Var, String str, Optional<sya8> optional, Optional<sya8> optional2) {
        super(optional, optional2);
        Objects.requireNonNull(sya17Var);
        this.onExtraCallback = sya17Var;
        Objects.requireNonNull(str);
        this.IAuthTabCallback = str;
    }

    public String IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public sya17 onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public sya43.IAuthTabCallback onNavigationEvent() {
        return sya43.IAuthTabCallback.Comment;
    }

    public String toString() {
        return "=COM " + this.onExtraCallback + " " + this.IAuthTabCallback;
    }
}
