package im.toss.features.mobileid.impl.status;

import kotlin.jvm.functions.Function1;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdRenewAddressActivity$$ExternalSyntheticLambda4 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    public final /* synthetic */ MobileIdRenewAddressActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        MobileIdRenewAddressActivity mobileIdRenewAddressActivity = this.f$0;
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) obj;
        if (i3 != 0) {
            return MobileIdRenewAddressActivity.onWarmupCompleted(mobileIdRenewAddressActivity, onnavigationevent);
        }
        MobileIdRenewAddressActivity.onWarmupCompleted(mobileIdRenewAddressActivity, onnavigationevent);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
