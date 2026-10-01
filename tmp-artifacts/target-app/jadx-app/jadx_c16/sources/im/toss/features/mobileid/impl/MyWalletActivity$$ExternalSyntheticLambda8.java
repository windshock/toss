package im.toss.features.mobileid.impl;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MyWalletActivity$$ExternalSyntheticLambda8 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MyWalletActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 1;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MyWalletActivity.IAuthTabCallback(this.f$0, (List) obj);
        int i4 = onNavigationEvent + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return unitIAuthTabCallback;
    }
}
