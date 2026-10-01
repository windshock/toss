package o;

import java.util.Optional;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ry6 extends getLoadingProgressBar {
    private final uh31 onNavigationEvent;

    public ry6(uh31 uh31Var) {
        this.onNavigationEvent = uh31Var;
    }

    @Override // o.setAdCreativeClickListener
    public Object onExtraCallbackWithResult(uh2 uh2Var) {
        if (uh2Var.onExtraCallbackWithResult() != uh22.SCALAR) {
            throw new sya9("while constructing Optional", Optional.empty(), "found non scalar node", uh2Var.onNavigationEvent());
        }
        String strOnExtraCallback = onExtraCallback(uh2Var);
        if (this.onNavigationEvent.onExtraCallbackWithResult(strOnExtraCallback, Boolean.TRUE).equals(uh25.asInterface)) {
            return Optional.empty();
        }
        return Optional.of(strOnExtraCallback);
    }
}
