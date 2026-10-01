package o;

import androidx.media3.exoplayer.Renderer;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AndroidSelectionHandles_androidKtExternalSyntheticLambda1 implements PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 {
    private final SelectionContainerKtExternalSyntheticLambda5 IAuthTabCallback;
    private PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 onExtraCallback;
    private final onWarmupCompleted onExtraCallbackWithResult;
    private Renderer onNavigationEvent;
    private boolean onTransact;
    private boolean onWarmupCompleted = true;

    public interface onWarmupCompleted {
        void onExtraCallbackWithResult(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
    }

    public AndroidSelectionHandles_androidKtExternalSyntheticLambda1(onWarmupCompleted onwarmupcompleted, TextFieldDecoratorModifierNodeExternalSyntheticLambda0 textFieldDecoratorModifierNodeExternalSyntheticLambda0) {
        this.onExtraCallbackWithResult = onwarmupcompleted;
        this.IAuthTabCallback = new SelectionContainerKtExternalSyntheticLambda5(textFieldDecoratorModifierNodeExternalSyntheticLambda0);
    }

    public void onExtraCallback() {
        this.onTransact = true;
        this.IAuthTabCallback.onExtraCallback();
    }

    public void onWarmupCompleted() {
        this.onTransact = false;
        this.IAuthTabCallback.onWarmupCompleted();
    }

    public void onWarmupCompleted(long j) {
        this.IAuthTabCallback.onExtraCallbackWithResult(j);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o.AndroidSelectionHandles_androidKtExternalSyntheticLambda4 */
    public void onExtraCallback(Renderer renderer) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 platformSelectionBehaviors_androidKtExternalSyntheticLambda0;
        PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 platformSelectionBehaviors_androidKtExternalSyntheticLambda0IAuthTabCallbackDefault = renderer.IAuthTabCallbackDefault();
        if (platformSelectionBehaviors_androidKtExternalSyntheticLambda0IAuthTabCallbackDefault == null || platformSelectionBehaviors_androidKtExternalSyntheticLambda0IAuthTabCallbackDefault == (platformSelectionBehaviors_androidKtExternalSyntheticLambda0 = this.onExtraCallback)) {
            return;
        }
        if (platformSelectionBehaviors_androidKtExternalSyntheticLambda0 != null) {
            throw AndroidSelectionHandles_androidKtExternalSyntheticLambda4.onExtraCallback(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.onExtraCallback = platformSelectionBehaviors_androidKtExternalSyntheticLambda0IAuthTabCallbackDefault;
        this.onNavigationEvent = renderer;
        platformSelectionBehaviors_androidKtExternalSyntheticLambda0IAuthTabCallbackDefault.IAuthTabCallback(this.IAuthTabCallback.onNavigationEvent());
    }

    public void IAuthTabCallback(Renderer renderer) {
        if (renderer == this.onNavigationEvent) {
            this.onExtraCallback = null;
            this.onNavigationEvent = null;
            this.onWarmupCompleted = true;
        }
    }

    public long IAuthTabCallback(boolean z) {
        onExtraCallback(z);
        return IAuthTabCallback();
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public long IAuthTabCallback() {
        if (this.onWarmupCompleted) {
            return this.IAuthTabCallback.IAuthTabCallback();
        }
        return ((PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).IAuthTabCallback();
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public boolean onExtraCallbackWithResult() {
        if (this.onWarmupCompleted) {
            return this.IAuthTabCallback.onExtraCallbackWithResult();
        }
        return ((PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback)).onExtraCallbackWithResult();
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public void IAuthTabCallback(AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1) {
        PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 platformSelectionBehaviors_androidKtExternalSyntheticLambda0 = this.onExtraCallback;
        if (platformSelectionBehaviors_androidKtExternalSyntheticLambda0 != null) {
            platformSelectionBehaviors_androidKtExternalSyntheticLambda0.IAuthTabCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
            androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 = this.onExtraCallback.onNavigationEvent();
        }
        this.IAuthTabCallback.IAuthTabCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1);
    }

    @Override // o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0
    public AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 onNavigationEvent() {
        PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 platformSelectionBehaviors_androidKtExternalSyntheticLambda0 = this.onExtraCallback;
        if (platformSelectionBehaviors_androidKtExternalSyntheticLambda0 != null) {
            return platformSelectionBehaviors_androidKtExternalSyntheticLambda0.onNavigationEvent();
        }
        return this.IAuthTabCallback.onNavigationEvent();
    }

    private void onExtraCallback(boolean z) {
        if (onWarmupCompleted(z)) {
            this.onWarmupCompleted = true;
            if (this.onTransact) {
                this.IAuthTabCallback.onExtraCallback();
                return;
            }
            return;
        }
        PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0 platformSelectionBehaviors_androidKtExternalSyntheticLambda0 = (PlatformSelectionBehaviors_androidKtExternalSyntheticLambda0) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallback);
        long jIAuthTabCallback = platformSelectionBehaviors_androidKtExternalSyntheticLambda0.IAuthTabCallback();
        if (this.onWarmupCompleted) {
            if (jIAuthTabCallback < this.IAuthTabCallback.IAuthTabCallback()) {
                this.IAuthTabCallback.onWarmupCompleted();
                return;
            } else {
                this.onWarmupCompleted = false;
                if (this.onTransact) {
                    this.IAuthTabCallback.onExtraCallback();
                }
            }
        }
        this.IAuthTabCallback.onExtraCallbackWithResult(jIAuthTabCallback);
        AndroidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1 androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnNavigationEvent = platformSelectionBehaviors_androidKtExternalSyntheticLambda0.onNavigationEvent();
        if (androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnNavigationEvent.equals(this.IAuthTabCallback.onNavigationEvent())) {
            return;
        }
        this.IAuthTabCallback.IAuthTabCallback(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnNavigationEvent);
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(androidTextInputSession_androidKtplatformSpecificTextInputSession3ExternalSyntheticLambda1OnNavigationEvent);
    }

    private boolean onWarmupCompleted(boolean z) {
        Renderer renderer = this.onNavigationEvent;
        if (renderer == null || renderer.prefetch()) {
            return true;
        }
        if (z && this.onNavigationEvent.getInterfaceDescriptor() != 2) {
            return true;
        }
        if (this.onNavigationEvent.newAuthTabSession()) {
            return false;
        }
        return z || this.onNavigationEvent.extraCallback();
    }
}
