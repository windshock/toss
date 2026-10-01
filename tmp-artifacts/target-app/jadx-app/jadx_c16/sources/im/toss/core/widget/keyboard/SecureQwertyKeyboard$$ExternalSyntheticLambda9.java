package im.toss.core.widget.keyboard;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda9 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ SecureQwertyKeyboard f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SecureQwertyKeyboard secureQwertyKeyboard = this.f$0;
        if (i3 == 0) {
            return SecureQwertyKeyboard.onNavigationEvent(secureQwertyKeyboard);
        }
        SecureQwertyKeyboard.onNavigationEvent(secureQwertyKeyboard);
        throw null;
    }
}
