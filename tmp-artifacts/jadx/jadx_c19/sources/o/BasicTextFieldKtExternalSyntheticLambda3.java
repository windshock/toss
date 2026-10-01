package o;

import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BasicTextFieldKtExternalSyntheticLambda3 extends UnspecifiedConstraintsNodeExternalSyntheticLambda0 {
    private RulerAlignmentKtExternalSyntheticLambda5 onNavigationEvent = RulerAlignmentKtExternalSyntheticLambda5.Companion;

    public void IAuthTabCallback(@NotNull RulerAlignmentKtExternalSyntheticLambda5 rulerAlignmentKtExternalSyntheticLambda5) {
        this.onNavigationEvent = rulerAlignmentKtExternalSyntheticLambda5;
    }

    public RulerAlignmentKtExternalSyntheticLambda5 onExtraCallbackWithResult() {
        return this.onNavigationEvent;
    }

    public RulerAlignmentKtExternalSyntheticLambda1 onNavigationEvent() {
        BasicTextFieldKtExternalSyntheticLambda3 basicTextFieldKtExternalSyntheticLambda3 = new BasicTextFieldKtExternalSyntheticLambda3();
        basicTextFieldKtExternalSyntheticLambda3.IAuthTabCallback(onExtraCallbackWithResult());
        basicTextFieldKtExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallbackStub());
        basicTextFieldKtExternalSyntheticLambda3.onExtraCallback(onWarmupCompleted());
        basicTextFieldKtExternalSyntheticLambda3.onNavigationEvent(IAuthTabCallback());
        return basicTextFieldKtExternalSyntheticLambda3;
    }

    public String toString() {
        return "EmittableText(" + IAuthTabCallbackStub() + ", style=" + onWarmupCompleted() + ", modifier=" + onExtraCallbackWithResult() + ", maxLines=" + IAuthTabCallback() + ')';
    }
}
