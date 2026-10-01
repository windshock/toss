package im.toss.features.mobileid.impl;

import im.toss.features.mobileid.impl.wallet.MyWalletFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.endPrefixMapping;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda3 implements Function2 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MyWalletFragment f$0;
    public final /* synthetic */ MyWalletActivity f$1;

    public /* synthetic */ MyWalletActivity$$ExternalSyntheticLambda3(MyWalletFragment myWalletFragment, MyWalletActivity myWalletActivity) {
        this.f$0 = myWalletFragment;
        this.f$1 = myWalletActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            MyWalletActivity.IAuthTabCallback(this.f$0, this.f$1, (endPrefixMapping) obj, ((Integer) obj2).intValue());
            throw null;
        }
        Unit unitIAuthTabCallback = MyWalletActivity.IAuthTabCallback(this.f$0, this.f$1, (endPrefixMapping) obj, ((Integer) obj2).intValue());
        int i3 = onNavigationEvent + 113;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return unitIAuthTabCallback;
    }
}
