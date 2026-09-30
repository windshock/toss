package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface AppSetIdAndScope1 {
    boolean IAuthTabCallback();

    boolean asInterface();

    boolean onExtraCallback();

    String onExtraCallbackWithResult();

    boolean onNavigationEvent();

    boolean onWarmupCompleted();

    default boolean onWarmupCompleted(ea8 ea8Var) {
        int i = ea8Var.toInt();
        if (i == 0) {
            return onNavigationEvent();
        }
        if (i == 10) {
            return onExtraCallback();
        }
        if (i == 20) {
            return IAuthTabCallback();
        }
        if (i == 30) {
            return asInterface();
        }
        if (i == 40) {
            return onWarmupCompleted();
        }
        throw new IllegalArgumentException("Level [" + ea8Var + "] not recognized.");
    }
}
