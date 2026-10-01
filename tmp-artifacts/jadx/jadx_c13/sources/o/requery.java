package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class requery {
    private static final sz1 onExtraCallback;

    static {
        sz1 sz1Var = new sz1("DNS Header Flag", 3);
        onExtraCallback = sz1Var;
        sz1Var.onNavigationEvent(15);
        sz1Var.onWarmupCompleted("FLAG");
        sz1Var.onWarmupCompleted(true);
        sz1Var.IAuthTabCallback(0, "qr");
        sz1Var.IAuthTabCallback(5, "aa");
        sz1Var.IAuthTabCallback(6, "tc");
        sz1Var.IAuthTabCallback(7, "rd");
        sz1Var.IAuthTabCallback(8, "ra");
        sz1Var.IAuthTabCallback(10, "ad");
        sz1Var.IAuthTabCallback(11, "cd");
    }

    public static String onExtraCallbackWithResult(int i) {
        return onExtraCallback.IAuthTabCallback(i);
    }

    public static boolean onExtraCallback(int i) {
        onExtraCallback.onExtraCallbackWithResult(i);
        return (i <= 0 || i > 4) && i < 12;
    }
}
