package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class PAGBiddingRequest extends createOpenAdLoader {
    private int IAuthTabCallback;
    private final ISDKTypeFactory asInterface;
    public String onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private int onWarmupCompleted;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.asInterface.equals(((PAGBiddingRequest) obj).asInterface);
        }
        return false;
    }

    private void onExtraCallbackWithResult() {
        this.onNavigationEvent = true;
        this.onWarmupCompleted = this.asInterface.hashCode();
    }

    public String onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public int hashCode() {
        if (!this.onNavigationEvent) {
            onExtraCallbackWithResult();
        }
        return this.onWarmupCompleted;
    }

    @Override // o.createNativeAdLoader
    protected void onExtraCallback(createRewardAdLoader createrewardadloader) {
        super.onExtraCallback(createrewardadloader);
        this.IAuthTabCallback = createrewardadloader.IAuthTabCallback(this.asInterface);
    }

    public String toString() {
        return "Class: " + onWarmupCompleted();
    }
}
