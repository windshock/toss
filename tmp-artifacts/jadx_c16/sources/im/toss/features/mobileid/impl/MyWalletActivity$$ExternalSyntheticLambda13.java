package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda13 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke() {
        Unit unitIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitIAuthTabCallback = MyWalletActivity.IAuthTabCallback(this.f$0);
            int i3 = 80 / 0;
        } else {
            unitIAuthTabCallback = MyWalletActivity.IAuthTabCallback(this.f$0);
        }
        int i4 = IAuthTabCallback + 119;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
