package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class uh18 extends uh2 {
    private final uh2 onExtraCallbackWithResult;

    public uh18(uh2 uh2Var) {
        super(uh2Var.onExtraCallback(), uh2Var.onNavigationEvent(), uh2Var.IAuthTabCallback());
        this.onExtraCallbackWithResult = uh2Var;
    }

    @Override // o.uh2
    public uh22 onExtraCallbackWithResult() {
        return uh22.ANCHOR;
    }
}
