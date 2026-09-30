package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt20 {
    private static final sz1 onWarmupCompleted;

    static {
        sz1 sz1Var = new sz1("DNS Opcode", 2);
        onWarmupCompleted = sz1Var;
        sz1Var.onNavigationEvent(15);
        sz1Var.onWarmupCompleted("RESERVED");
        sz1Var.onWarmupCompleted(true);
        sz1Var.IAuthTabCallback(0, "QUERY");
        sz1Var.IAuthTabCallback(1, "IQUERY");
        sz1Var.IAuthTabCallback(2, "STATUS");
        sz1Var.IAuthTabCallback(4, "NOTIFY");
        sz1Var.IAuthTabCallback(5, "UPDATE");
        sz1Var.IAuthTabCallback(6, "DSO");
    }

    public static String IAuthTabCallback(int i) {
        return onWarmupCompleted.IAuthTabCallback(i);
    }
}
