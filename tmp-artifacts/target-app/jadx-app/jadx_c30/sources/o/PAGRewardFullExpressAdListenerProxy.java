package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class PAGRewardFullExpressAdListenerProxy {
    private long onExtraCallback;
    private int onExtraCallbackWithResult;
    private long onNavigationEvent;
    private int onWarmupCompleted;

    public void onNavigationEvent() {
        synchronized (this) {
            int i = this.onExtraCallbackWithResult;
            this.onWarmupCompleted = i;
            this.onExtraCallback += i;
            this.onNavigationEvent++;
            this.onExtraCallbackWithResult = 0;
            notifyAll();
        }
    }
}
