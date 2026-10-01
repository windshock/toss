package im.toss.core.widget.keyboard;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda5 implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ SecureQwertyKeyboard f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ SecureQwertyKeyboard$$ExternalSyntheticLambda5(SecureQwertyKeyboard secureQwertyKeyboard, int i) {
        this.f$0 = secureQwertyKeyboard;
        this.f$1 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 101;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        SecureQwertyKeyboard secureQwertyKeyboard = this.f$0;
        if (i3 == 0) {
            SecureQwertyKeyboard.onExtraCallback(secureQwertyKeyboard, this.f$1, view);
        } else {
            SecureQwertyKeyboard.onExtraCallback(secureQwertyKeyboard, this.f$1, view);
            int i4 = 8 / 0;
        }
    }
}
