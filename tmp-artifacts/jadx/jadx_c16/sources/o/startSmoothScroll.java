package o;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class startSmoothScroll {
    public String IAuthTabCallback;
    public String IAuthTabCallbackDefault;
    public String asInterface;
    public String onExtraCallback;
    public String onExtraCallbackWithResult;
    public String onNavigationEvent;
    public String onWarmupCompleted;

    public startSmoothScroll IAuthTabCallback(int i) {
        return this;
    }

    public startSmoothScroll IAuthTabCallback(String str) {
        this.onNavigationEvent = str;
        return this;
    }

    public startSmoothScroll IAuthTabCallbackStub(String str) {
        this.onExtraCallbackWithResult = str;
        return this;
    }

    public startSmoothScroll asBinder(String str) {
        this.onWarmupCompleted = str;
        return this;
    }

    public startSmoothScroll onExtraCallback(String str) {
        this.onExtraCallback = str;
        return this;
    }

    public startSmoothScroll onExtraCallbackWithResult(String str) {
        this.IAuthTabCallbackDefault = str;
        return this;
    }

    public startSmoothScroll onNavigationEvent(String str) {
        this.asInterface = str;
        return this;
    }

    public startSmoothScroll onWarmupCompleted(String str) {
        this.IAuthTabCallback = str;
        return this;
    }
}
