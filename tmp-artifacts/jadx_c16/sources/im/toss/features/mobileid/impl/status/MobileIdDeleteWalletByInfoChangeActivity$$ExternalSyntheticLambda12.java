package im.toss.features.mobileid.impl.status;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdDeleteWalletByInfoChangeActivity$$ExternalSyntheticLambda12 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdDeleteWalletByInfoChangeActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 77;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = MobileIdDeleteWalletByInfoChangeActivity.IAuthTabCallback(this.f$0);
        int i4 = onNavigationEvent + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
