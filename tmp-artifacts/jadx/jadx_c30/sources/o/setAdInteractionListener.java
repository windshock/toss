package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class setAdInteractionListener implements onAdShowFailed {
    public static final String[] IAuthTabCallback = {"Class", "Field", "Method", "Code"};
    private final String IAuthTabCallbackStub;
    private final int onExtraCallback;
    private long onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final String onWarmupCompleted;

    public int hashCode() {
        String str = this.IAuthTabCallbackStub;
        int iHashCode = str != null ? str.hashCode() + 31 : 1;
        String str2 = this.onWarmupCompleted;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        return (((iHashCode * 31) + this.onExtraCallback) * 31) + this.onNavigationEvent;
    }

    @Override // o.onAdShowFailed
    public boolean onExtraCallbackWithResult(long j) {
        return (j & this.onExtraCallbackWithResult) != 0;
    }

    public String toString() {
        return IAuthTabCallback[this.onNavigationEvent] + ": " + this.IAuthTabCallbackStub;
    }
}
