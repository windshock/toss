package o;

import java.util.Objects;
import java.util.Optional;
import o.ycx41;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class lt34 extends ycx41 {
    private final sya17 onExtraCallback;
    private final String onExtraCallbackWithResult;

    public lt34(sya17 sya17Var, String str, Optional<sya8> optional, Optional<sya8> optional2) {
        super(optional, optional2);
        Objects.requireNonNull(sya17Var);
        this.onExtraCallback = sya17Var;
        Objects.requireNonNull(str);
        this.onExtraCallbackWithResult = str;
    }

    public sya17 IAuthTabCallback() {
        return this.onExtraCallback;
    }

    public String onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    public ycx41.IAuthTabCallback onNavigationEvent() {
        return ycx41.IAuthTabCallback.Comment;
    }
}
