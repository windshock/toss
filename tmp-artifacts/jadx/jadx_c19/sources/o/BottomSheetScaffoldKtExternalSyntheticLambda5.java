package o;

import java.util.NoSuchElementException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class BottomSheetScaffoldKtExternalSyntheticLambda5 implements BottomSheetScaffoldKtExternalSyntheticLambda6 {
    private long IAuthTabCallback;
    private final long onExtraCallback;
    private final long onWarmupCompleted;

    public BottomSheetScaffoldKtExternalSyntheticLambda5(long j, long j2) {
        this.onWarmupCompleted = j;
        this.onExtraCallback = j2;
        asInterface();
    }

    public boolean IAuthTabCallback() {
        return this.IAuthTabCallback > this.onExtraCallback;
    }

    @Override // o.BottomSheetScaffoldKtExternalSyntheticLambda6
    public boolean IAuthTabCallbackDefault() {
        this.IAuthTabCallback++;
        return !IAuthTabCallback();
    }

    public void asInterface() {
        this.IAuthTabCallback = this.onWarmupCompleted - 1;
    }

    public final void onNavigationEvent() {
        long j = this.IAuthTabCallback;
        if (j < this.onWarmupCompleted || j > this.onExtraCallback) {
            throw new NoSuchElementException();
        }
    }

    public final long onWarmupCompleted() {
        return this.IAuthTabCallback;
    }
}
