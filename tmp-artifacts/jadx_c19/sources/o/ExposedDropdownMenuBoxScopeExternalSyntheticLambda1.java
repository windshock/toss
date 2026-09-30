package o;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import o.ModalBottomSheetKtExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenuBoxScopeExternalSyntheticLambda1 {
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onNavigationEvent = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(10);

    public HandwritingHandlerNodeExternalSyntheticLambda0 onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, @Nullable ModalBottomSheetKtExternalSyntheticLambda2.onExtraCallback onextracallback) throws IOException {
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = null;
        int i2 = 0;
        while (true) {
            try {
                drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onNavigationEvent.onExtraCallback(), 0, 10);
                this.onNavigationEvent.asBinder(0);
                if (this.onNavigationEvent.onMessageChannelReady() != 4801587) {
                    break;
                }
                this.onNavigationEvent.IAuthTabCallbackDefault(3);
                int iOnPostMessage = this.onNavigationEvent.onPostMessage();
                int i3 = iOnPostMessage + 10;
                if (handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.onNavigationEvent.onExtraCallback(), 0, bArr, 0, 10);
                    drawerKtExternalSyntheticLambda9.IAuthTabCallback(bArr, 10, iOnPostMessage);
                    handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = new ModalBottomSheetKtExternalSyntheticLambda2(onextracallback).onNavigationEvent(bArr, i3);
                } else {
                    drawerKtExternalSyntheticLambda9.IAuthTabCallback(iOnPostMessage);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(i2);
        return handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent;
    }
}
