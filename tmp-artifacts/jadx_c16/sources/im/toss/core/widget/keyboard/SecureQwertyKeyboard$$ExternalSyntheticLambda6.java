package im.toss.core.widget.keyboard;

import android.view.View;
import android.widget.TextView;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda6 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ SecureQwertyKeyboard f$0;
    public final /* synthetic */ TextView f$1;

    public /* synthetic */ SecureQwertyKeyboard$$ExternalSyntheticLambda6(SecureQwertyKeyboard secureQwertyKeyboard, TextView textView) {
        this.f$0 = secureQwertyKeyboard;
        this.f$1 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            SecureQwertyKeyboard.onNavigationEvent(this.f$0, this.f$1, view);
            int i3 = 20 / 0;
        } else {
            SecureQwertyKeyboard.onNavigationEvent(this.f$0, this.f$1, view);
        }
        int i4 = onExtraCallbackWithResult + 111;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 52 / 0;
        }
    }
}
