package im.toss.core.widget.keyboard;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AppManagerImpl2;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class SecureQwertyKeyboard$$ExternalSyntheticLambda11 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 43;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = SecureQwertyKeyboard.IAuthTabCallback((AppManagerImpl2) obj);
        int i4 = onExtraCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
        return unitIAuthTabCallback;
    }
}
