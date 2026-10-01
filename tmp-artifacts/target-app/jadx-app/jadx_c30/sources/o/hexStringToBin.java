package o;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class hexStringToBin implements StreamParsingException {
    private boolean onExtraCallback;
    private boolean onWarmupCompleted;

    public boolean onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public void onNavigationEvent(boolean z) {
        this.onWarmupCompleted = z;
    }

    public boolean IAuthTabCallbackStub() {
        return this.onExtraCallback;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.onExtraCallback = z;
    }
}
