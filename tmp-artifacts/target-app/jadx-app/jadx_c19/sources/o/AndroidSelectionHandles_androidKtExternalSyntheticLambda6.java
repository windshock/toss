package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidSelectionHandles_androidKtExternalSyntheticLambda6 extends RuntimeException {
    public final int timeoutOperation;

    public AndroidSelectionHandles_androidKtExternalSyntheticLambda6(int i2) {
        super(IAuthTabCallback(i2));
        this.timeoutOperation = i2;
    }

    private static String IAuthTabCallback(int i2) {
        if (i2 == 1) {
            return "Player release timed out.";
        }
        if (i2 == 2) {
            return "Setting foreground mode timed out.";
        }
        if (i2 == 3) {
            return "Detaching surface timed out.";
        }
        return "Undefined timeout.";
    }
}
