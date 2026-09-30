package o;

import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10;
import o.TextFieldStateKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BottomSheetScaffoldKtExternalSyntheticLambda0 extends BackdropScaffoldStateExternalSyntheticLambda2 {
    private final TextFieldStateKtExternalSyntheticLambda0 onNavigationEvent;

    public BottomSheetScaffoldKtExternalSyntheticLambda0(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10, TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0) {
        super(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        this.onNavigationEvent = textFieldStateKtExternalSyntheticLambda0;
    }

    @Override // o.BackdropScaffoldStateExternalSyntheticLambda2
    public CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10.IAuthTabCallback iAuthTabCallback, long j) {
        super.onWarmupCompleted(i2, iAuthTabCallback, j);
        TextFieldStateKtExternalSyntheticLambda0 textFieldStateKtExternalSyntheticLambda0 = this.onNavigationEvent;
        iAuthTabCallback.IAuthTabCallbackStubProxy = textFieldStateKtExternalSyntheticLambda0;
        TextFieldStateKtExternalSyntheticLambda0.IAuthTabCallbackDefault iAuthTabCallbackDefault = textFieldStateKtExternalSyntheticLambda0.onExtraCallbackWithResult;
        iAuthTabCallback.IAuthTabCallback_Parcel = iAuthTabCallbackDefault != null ? iAuthTabCallbackDefault.onTransact : null;
        return iAuthTabCallback;
    }
}
