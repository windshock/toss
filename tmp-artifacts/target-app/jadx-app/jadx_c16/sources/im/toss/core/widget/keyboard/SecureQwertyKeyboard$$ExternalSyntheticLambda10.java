package im.toss.core.widget.keyboard;

import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda10 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ SecureQwertyKeyboard f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        SecureQwertyKeyboard secureQwertyKeyboard = this.f$0;
        if (i3 == 0) {
            return SecureQwertyKeyboard.onWarmupCompleted(secureQwertyKeyboard);
        }
        SecureQwertyKeyboard.onWarmupCompleted(secureQwertyKeyboard);
        throw null;
    }
}
