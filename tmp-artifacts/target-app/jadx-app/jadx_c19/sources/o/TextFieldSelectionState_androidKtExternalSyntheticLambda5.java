package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class TextFieldSelectionState_androidKtExternalSyntheticLambda5 {
    private int onWarmupCompleted;

    public void onNavigationEvent() {
        this.onWarmupCompleted = 0;
    }

    public final boolean onWarmupCompleted() {
        return onExtraCallback(134217728);
    }

    public final boolean IAuthTabCallback() {
        return onExtraCallback(4);
    }

    public final boolean ac_() {
        return onExtraCallback(1);
    }

    public final boolean asBinder() {
        return onExtraCallback(536870912);
    }

    public final boolean onExtraCallback() {
        return onExtraCallback(268435456);
    }

    public final boolean IAuthTabCallbackStub() {
        return onExtraCallback(67108864);
    }

    public final void onNavigationEvent(int i2) {
        this.onWarmupCompleted = i2;
    }

    public final void onWarmupCompleted(int i2) {
        this.onWarmupCompleted = i2 | this.onWarmupCompleted;
    }

    protected final boolean onExtraCallback(int i2) {
        return (this.onWarmupCompleted & i2) == i2;
    }
}
