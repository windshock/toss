package o;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda6 implements ExposedDropdownMenu_androidKtExternalSyntheticLambda5 {
    private final byte[] IAuthTabCallback = new byte[4096];

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public void onExtraCallback(long j, int i2, int i3, int i4, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public int IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, int i2, boolean z, int i3) throws IOException {
        int iOnWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda0.onWarmupCompleted(this.IAuthTabCallback, 0, Math.min(this.IAuthTabCallback.length, i2));
        if (iOnWarmupCompleted != -1) {
            return iOnWarmupCompleted;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(i2);
    }
}
