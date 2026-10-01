package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTRewardVideoActivity2 {
    public static final TTRewardVideoActivity2 onExtraCallbackWithResult = new TTRewardVideoActivity2(Integer.MAX_VALUE, false, false);
    private final boolean IAuthTabCallback;
    private final int onNavigationEvent;
    private final boolean onWarmupCompleted;

    private TTRewardVideoActivity2(int i, boolean z, boolean z2) {
        this.onNavigationEvent = i;
        this.IAuthTabCallback = z;
        this.onWarmupCompleted = z2;
    }

    public int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public boolean onExtraCallback() {
        return this.IAuthTabCallback;
    }
}
