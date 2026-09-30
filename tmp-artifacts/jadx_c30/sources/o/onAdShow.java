package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class onAdShow extends PAGLoadCallback implements Comparable {
    private int IAuthTabCallback;
    private final PAGConstantPAGPAConsentType onExtraCallbackWithResult;
    private final onRenderFail onNavigationEvent;
    private int onWarmupCompleted;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof onAdShow)) {
            return 0;
        }
        onAdShow onadshow = (onAdShow) obj;
        int iCompareTo = this.onExtraCallbackWithResult.compareTo(onadshow.onExtraCallbackWithResult);
        return iCompareTo == 0 ? this.onNavigationEvent.compareTo(onadshow.onNavigationEvent) : iCompareTo;
    }

    public PAGConstantPAGPAConsentType onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public onRenderFail IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    public int onExtraCallback() {
        return this.IAuthTabCallback;
    }

    public int onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public void onExtraCallbackWithResult(int i) {
        this.IAuthTabCallback = i;
    }

    public void onNavigationEvent(int i) {
        this.onWarmupCompleted = i;
    }

    public String toString() {
        return this.onExtraCallbackWithResult + ": " + this.onNavigationEvent;
    }
}
