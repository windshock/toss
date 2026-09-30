package im.toss.features.mobileid.impl.view;

import kotlin.jvm.functions.Function1;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdCommonDeleteWalletErrorActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    public final /* synthetic */ MobileIdCommonDeleteWalletErrorActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        MobileIdCommonDeleteWalletErrorActivity mobileIdCommonDeleteWalletErrorActivity = this.f$0;
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) obj;
        if (i3 != 0) {
            return MobileIdCommonDeleteWalletErrorActivity.onNavigationEvent(mobileIdCommonDeleteWalletErrorActivity, onnavigationevent);
        }
        MobileIdCommonDeleteWalletErrorActivity.onNavigationEvent(mobileIdCommonDeleteWalletErrorActivity, onnavigationevent);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
