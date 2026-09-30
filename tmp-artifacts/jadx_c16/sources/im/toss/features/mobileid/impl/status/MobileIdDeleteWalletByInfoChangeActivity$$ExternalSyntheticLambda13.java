package im.toss.features.mobileid.impl.status;

import kotlin.jvm.functions.Function1;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdDeleteWalletByInfoChangeActivity$$ExternalSyntheticLambda13 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ MobileIdDeleteWalletByInfoChangeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MobileIdDeleteWalletByInfoChangeActivity mobileIdDeleteWalletByInfoChangeActivity = this.f$0;
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) obj;
        if (i3 != 0) {
            return MobileIdDeleteWalletByInfoChangeActivity.onExtraCallback(mobileIdDeleteWalletByInfoChangeActivity, onnavigationevent);
        }
        MobileIdDeleteWalletByInfoChangeActivity.onExtraCallback(mobileIdDeleteWalletByInfoChangeActivity, onnavigationevent);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
