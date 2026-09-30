package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class setCornerTopLeftRadius {
    private final int IAuthTabCallback;
    private final int IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final int asInterface;
    private final int onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private final int onNavigationEvent;
    private final int onTransact;
    private final int onWarmupCompleted;

    public boolean onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    public int onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public int onNavigationEvent() {
        return this.onExtraCallback;
    }

    public int onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public int IAuthTabCallback() {
        return this.IAuthTabCallback;
    }

    public int onTransact() {
        return this.asInterface;
    }

    public int IAuthTabCallbackStub() {
        return this.onTransact;
    }

    public int asBinder() {
        return this.IAuthTabCallbackStub;
    }

    public int asInterface() {
        return this.IAuthTabCallbackDefault;
    }
}
