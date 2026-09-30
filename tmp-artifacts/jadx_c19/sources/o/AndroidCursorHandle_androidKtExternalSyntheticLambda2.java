package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidCursorHandle_androidKtExternalSyntheticLambda2 implements RulerAlignmentKtExternalSyntheticLambda1 {
    private RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult = RulerAlignmentKtExternalSyntheticLambda5.Companion;

    public void IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        this.onExtraCallbackWithResult = rulerAlignmentKtExternalSyntheticLambda5;
    }

    public RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public RulerAlignmentKtExternalSyntheticLambda1 onNavigationEvent() {
        AndroidCursorHandle_androidKtExternalSyntheticLambda2 androidCursorHandle_androidKtExternalSyntheticLambda2 = new AndroidCursorHandle_androidKtExternalSyntheticLambda2();
        androidCursorHandle_androidKtExternalSyntheticLambda2.IAuthTabCallback(onExtraCallbackWithResult());
        return androidCursorHandle_androidKtExternalSyntheticLambda2;
    }

    public String toString() {
        return "EmittableSpacer(modifier=" + onExtraCallbackWithResult() + ')';
    }
}
