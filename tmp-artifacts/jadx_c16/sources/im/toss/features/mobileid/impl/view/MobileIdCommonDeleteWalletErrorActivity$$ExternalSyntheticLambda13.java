package im.toss.features.mobileid.impl.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda13 implements Function0 {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(this.f$0);
            throw null;
        }
        Unit unitOnExtraCallback = MobileIdCommonDeleteWalletErrorActivity.onExtraCallback(this.f$0);
        int i3 = onNavigationEvent + 59;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
