package o;

import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomSheetScaffoldKtExternalSyntheticLambda13 extends BackdropScaffoldStateExternalSyntheticLambda2 {
    private final TextContextMenuHelperApi28ExternalSyntheticLambda7 onNavigationEvent;

    public BottomSheetScaffoldKtExternalSyntheticLambda13(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, TextContextMenuHelperApi28ExternalSyntheticLambda7 textContextMenuHelperApi28ExternalSyntheticLambda7) {
        super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onWarmupCompleted() == 1);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallbackWithResult() == 1);
        this.onNavigationEvent = textContextMenuHelperApi28ExternalSyntheticLambda7;
    }

    @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.onExtraCallback onextracallback, boolean z) {
        this.onExtraCallbackWithResult.IAuthTabCallback(i2, onextracallback, z);
        long j = onextracallback.IAuthTabCallback;
        if (j == -9223372036854775807L) {
            j = this.onNavigationEvent.onExtraCallbackWithResult;
        }
        onextracallback.onWarmupCompleted(onextracallback.onExtraCallback, onextracallback.asBinder, onextracallback.IAuthTabCallbackStub, j, onextracallback.onWarmupCompleted(), this.onNavigationEvent, onextracallback.onWarmupCompleted);
        return onextracallback;
    }
}
