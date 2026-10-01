package o;

import java.nio.ByteBuffer;
import java.util.Arrays;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MinimumInteractiveModifierNodeExternalSyntheticLambda0 extends MenuKtExternalSyntheticLambda6 {
    @Override // o.MenuKtExternalSyntheticLambda6
    public HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallbackWithResult(MenuKtExternalSyntheticLambda5 menuKtExternalSyntheticLambda5, ByteBuffer byteBuffer) {
        return new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{onWarmupCompleted(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(byteBuffer.array(), byteBuffer.limit()))});
    }

    public MenuKtExternalSyntheticLambda3 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        return new MenuKtExternalSyntheticLambda3((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult()), (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult()), textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject(), Arrays.copyOfRange(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult()));
    }
}
