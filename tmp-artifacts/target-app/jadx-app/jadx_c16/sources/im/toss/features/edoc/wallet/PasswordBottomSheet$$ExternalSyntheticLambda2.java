package im.toss.features.edoc.wallet;

import im.toss.uikit.widget.textField.TextFieldLine;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class PasswordBottomSheet$$ExternalSyntheticLambda2 implements Runnable {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ TextFieldLine f$0;

    @Override // java.lang.Runnable
    public final void run() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        PasswordBottomSheet.IAuthTabCallback(this.f$0);
        int i4 = onWarmupCompleted + 27;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
