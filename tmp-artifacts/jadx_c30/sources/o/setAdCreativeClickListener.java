package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public interface setAdCreativeClickListener {
    Object onExtraCallbackWithResult(uh2 uh2Var);

    default void onExtraCallback(uh2 uh2Var, Object obj) {
        if (uh2Var.IAuthTabCallbackDefault()) {
            throw new IllegalStateException("Not implemented in " + getClass().getName());
        }
        throw new uh16("Unexpected recursive structure for Node: " + uh2Var);
    }
}
