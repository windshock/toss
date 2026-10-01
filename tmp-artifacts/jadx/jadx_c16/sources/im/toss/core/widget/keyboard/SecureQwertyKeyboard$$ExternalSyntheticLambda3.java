package im.toss.core.widget.keyboard;

import android.view.View;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda3 implements View.OnClickListener {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ SecureQwertyKeyboard f$0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            SecureQwertyKeyboard.onNavigationEvent(this.f$0, view);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SecureQwertyKeyboard.onNavigationEvent(this.f$0, view);
        int i3 = onWarmupCompleted + 89;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
    }
}
