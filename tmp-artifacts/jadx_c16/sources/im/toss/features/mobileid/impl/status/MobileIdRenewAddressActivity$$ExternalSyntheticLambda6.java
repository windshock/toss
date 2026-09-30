package im.toss.features.mobileid.impl.status;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.initSDK;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MobileIdRenewAddressActivity$$ExternalSyntheticLambda6 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ MobileIdRenewAddressActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = MobileIdRenewAddressActivity.onExtraCallbackWithResult(this.f$0, (initSDK.onNavigationEvent) obj);
        int i4 = onExtraCallbackWithResult + 19;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
