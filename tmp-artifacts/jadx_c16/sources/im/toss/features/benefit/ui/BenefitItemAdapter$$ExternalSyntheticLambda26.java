package im.toss.features.benefit.ui;

import im.toss.features.benefit.dto.CardsV2;
import kotlin.jvm.functions.Function2;
import o.ShakeMonitorBridgeExtension$onExtraCallback;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda26 implements Function2 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = this.f$0;
        ShakeMonitorBridgeExtension$onExtraCallback shakeMonitorBridgeExtension$onExtraCallback = (ShakeMonitorBridgeExtension$onExtraCallback) obj;
        CardsV2.PointBackInfo.ChanceExhaustedSheet chanceExhaustedSheet = (CardsV2.PointBackInfo.ChanceExhaustedSheet) obj2;
        if (i3 != 0) {
            return getNameByOperatorName.onExtraCallbackWithResult(getnamebyoperatorname, shakeMonitorBridgeExtension$onExtraCallback, chanceExhaustedSheet);
        }
        getNameByOperatorName.onExtraCallbackWithResult(getnamebyoperatorname, shakeMonitorBridgeExtension$onExtraCallback, chanceExhaustedSheet);
        throw null;
    }
}
