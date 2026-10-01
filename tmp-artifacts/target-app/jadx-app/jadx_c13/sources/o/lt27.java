package o;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class lt27 {
    private static final String[] onExtraCallbackWithResult;
    private static final String[] onNavigationEvent;
    private static final sz1 onWarmupCompleted;

    static {
        sz1 sz1Var = new sz1("Message Section", 3);
        onWarmupCompleted = sz1Var;
        onExtraCallbackWithResult = new String[]{"QUESTIONS", "ANSWERS", "AUTHORITY RECORDS", "ADDITIONAL RECORDS"};
        onNavigationEvent = new String[]{"ZONE", "PREREQUISITES", "UPDATE RECORDS", "ADDITIONAL RECORDS"};
        sz1Var.onNavigationEvent(3);
        sz1Var.onWarmupCompleted(true);
        sz1Var.IAuthTabCallback(0, "qd");
        sz1Var.IAuthTabCallback(1, "an");
        sz1Var.IAuthTabCallback(2, "au");
        sz1Var.IAuthTabCallback(3, "ad");
    }

    public static String onExtraCallback(int i) {
        return onWarmupCompleted.IAuthTabCallback(i);
    }

    public static String IAuthTabCallback(int i) {
        onWarmupCompleted.onExtraCallbackWithResult(i);
        return onExtraCallbackWithResult[i];
    }

    public static String onWarmupCompleted(int i) {
        onWarmupCompleted.onExtraCallbackWithResult(i);
        return onNavigationEvent[i];
    }

    public static void onNavigationEvent(int i) {
        onWarmupCompleted.onExtraCallbackWithResult(i);
    }
}
