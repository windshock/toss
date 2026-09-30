package o;

import android.util.SparseArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AlertDialogKtExternalSyntheticLambda2 {
    private final SparseArray<TextFieldDecoratorModifierNodeExternalSyntheticLambda24> onExtraCallback = new SparseArray<>();

    public TextFieldDecoratorModifierNodeExternalSyntheticLambda24 onExtraCallback(int i2) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24 = this.onExtraCallback.get(i2);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda24 != null) {
            return textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda242 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda24(9223372036854775806L);
        this.onExtraCallback.put(i2, textFieldDecoratorModifierNodeExternalSyntheticLambda242);
        return textFieldDecoratorModifierNodeExternalSyntheticLambda242;
    }

    public void IAuthTabCallback() {
        this.onExtraCallback.clear();
    }
}
