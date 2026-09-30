package im.toss.features.mobileid.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AnrPluginExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda7 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MyWalletActivity.IAuthTabCallback(this.f$0, (AnrPluginExternalSyntheticLambda1) obj);
        int i4 = onWarmupCompleted + 49;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
