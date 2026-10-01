package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class TTVideoLandingPageLink2Activity1 implements Cloneable {
    private int IAuthTabCallback;
    private boolean asBinder;
    private boolean onExtraCallback;
    private int onExtraCallbackWithResult;
    private boolean onNavigationEvent;
    private boolean onWarmupCompleted;

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("GeneralPurposeBit is not Cloneable?", e);
        }
    }

    public void onNavigationEvent(byte[] bArr, int i) {
        dj4.IAuthTabCallback((this.onExtraCallback ? 8 : 0) | (this.onNavigationEvent ? 2048 : 0) | (this.onWarmupCompleted ? 1 : 0) | (this.asBinder ? 64 : 0), bArr, i);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TTVideoLandingPageLink2Activity1)) {
            return false;
        }
        TTVideoLandingPageLink2Activity1 tTVideoLandingPageLink2Activity1 = (TTVideoLandingPageLink2Activity1) obj;
        return tTVideoLandingPageLink2Activity1.onWarmupCompleted == this.onWarmupCompleted && tTVideoLandingPageLink2Activity1.asBinder == this.asBinder && tTVideoLandingPageLink2Activity1.onNavigationEvent == this.onNavigationEvent && tTVideoLandingPageLink2Activity1.onExtraCallback == this.onExtraCallback;
    }

    int onExtraCallback() {
        return this.onExtraCallbackWithResult;
    }

    int onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public int hashCode() {
        return (((((((this.onWarmupCompleted ? 1 : 0) * 17) + (this.asBinder ? 1 : 0)) * 13) + (this.onNavigationEvent ? 1 : 0)) * 7) + (this.onExtraCallback ? 1 : 0)) * 3;
    }

    public void onWarmupCompleted(boolean z) {
        this.onExtraCallback = z;
    }

    public boolean onNavigationEvent() {
        return this.onWarmupCompleted;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.onNavigationEvent = z;
    }
}
