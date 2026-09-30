package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda2 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MyWalletActivity.IAuthTabCallback(this.f$0, ((Boolean) obj).booleanValue());
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        return unitIAuthTabCallback;
    }
}
