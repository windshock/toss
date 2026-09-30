package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionContainerKtExternalSyntheticLambda5 implements PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 {
    private boolean IAuthTabCallback;
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda0 onNavigationEvent;
    private AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onWarmupCompleted = AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.IAuthTabCallback;

    public SelectionContainerKtExternalSyntheticLambda5(TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda0;
    }

    public void onExtraCallback() {
        if (this.IAuthTabCallback) {
            return;
        }
        this.onExtraCallbackWithResult = this.onNavigationEvent.IAuthTabCallback();
        this.IAuthTabCallback = true;
    }

    public void onWarmupCompleted() {
        if (this.IAuthTabCallback) {
            onExtraCallbackWithResult(IAuthTabCallback());
            this.IAuthTabCallback = false;
        }
    }

    public void onExtraCallbackWithResult(long j) {
        this.onExtraCallback = j;
        if (this.IAuthTabCallback) {
            this.onExtraCallbackWithResult = this.onNavigationEvent.IAuthTabCallback();
        }
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public long IAuthTabCallback() {
        long jOnWarmupCompleted;
        long j = this.onExtraCallback;
        if (!this.IAuthTabCallback) {
            return j;
        }
        long jIAuthTabCallback = this.onNavigationEvent.IAuthTabCallback() - this.onExtraCallbackWithResult;
        AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 = this.onWarmupCompleted;
        if (androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onExtraCallbackWithResult == 1.0f) {
            jOnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(jIAuthTabCallback);
        } else {
            jOnWarmupCompleted = androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1.onWarmupCompleted(jIAuthTabCallback);
        }
        return j + jOnWarmupCompleted;
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public void IAuthTabCallback(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        if (this.IAuthTabCallback) {
            onExtraCallbackWithResult(IAuthTabCallback());
        }
        this.onWarmupCompleted = androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1;
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onNavigationEvent() {
        return this.onWarmupCompleted;
    }
}
