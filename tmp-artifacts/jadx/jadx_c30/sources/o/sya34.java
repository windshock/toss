package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class sya34 {
    private final boolean IAuthTabCallback;
    private final String IAuthTabCallbackDefault;
    private final boolean asBinder;
    private final boolean onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final boolean onWarmupCompleted;

    public sya34(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.IAuthTabCallbackDefault = str;
        this.IAuthTabCallback = z;
        this.asBinder = z2;
        this.onNavigationEvent = z3;
        this.onExtraCallback = z4;
        this.onExtraCallbackWithResult = z5;
        this.onWarmupCompleted = z6;
    }

    public String onNavigationEvent() {
        return this.IAuthTabCallbackDefault;
    }

    public boolean IAuthTabCallbackStub() {
        return this.IAuthTabCallback;
    }

    public boolean asBinder() {
        return this.asBinder;
    }

    public boolean onExtraCallback() {
        return this.onNavigationEvent;
    }

    public boolean onWarmupCompleted() {
        return this.onExtraCallback;
    }

    public boolean onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public boolean IAuthTabCallback() {
        return this.onWarmupCompleted;
    }
}
