package im.toss.core.widget.keyboard;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda1 implements View.OnClickListener {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ SecureQwertyKeyboard f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SecureQwertyKeyboard.onExtraCallback(this.f$0, view);
        int i4 = onExtraCallbackWithResult + 39;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }
}
