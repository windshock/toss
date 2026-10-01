package o;

import androidx.annotation.Nullable;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import o.BottomDrawerStateExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public abstract class ComposableSingletonsAppBarKtExternalSyntheticLambda0 {
    private ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 onNavigationEvent;
    private IAuthTabCallback onWarmupCompleted;

    public interface IAuthTabCallback {
        default void onExtraCallback(Renderer renderer) {
        }

        void onTrackSelectionsInvalidated();
    }

    public RendererCapabilities.Listener onExtraCallback() {
        return null;
    }

    public boolean onExtraCallbackWithResult() {
        return false;
    }

    public abstract ComposableSingletonsBackdropScaffoldKtExternalSyntheticLambda0 onNavigationEvent(RendererCapabilities[] rendererCapabilitiesArr, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4;

    public abstract void onNavigationEvent(@Nullable Object obj);

    public void onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) {
    }

    public void onWarmupCompleted(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
    }

    public void onExtraCallbackWithResult(IAuthTabCallback iAuthTabCallback, ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onWarmupCompleted == null);
        this.onWarmupCompleted = iAuthTabCallback;
        this.onNavigationEvent = composableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2;
    }

    public void IAuthTabCallbackStub() {
        this.onWarmupCompleted = null;
        this.onNavigationEvent = null;
    }

    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 onNavigationEvent() {
        return CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3.IAuthTabCallback;
    }

    protected final void onTransact() {
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onTrackSelectionsInvalidated();
        }
    }

    protected final void IAuthTabCallback(Renderer renderer) {
        IAuthTabCallback iAuthTabCallback = this.onWarmupCompleted;
        if (iAuthTabCallback != null) {
            iAuthTabCallback.onExtraCallback(renderer);
        }
    }

    protected final ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2 IAuthTabCallbackDefault() {
        return (ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda2) RecordingInputConnection_androidKt.onWarmupCompleted(this.onNavigationEvent);
    }
}
