package im.toss.features.benefit.ui;

import kotlin.jvm.functions.Function1;
import o.ShakeMonitorBridgeExtension$onExtraCallback;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda25 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Boolean.valueOf(getNameByOperatorName.onNavigationEvent(this.f$0, (ShakeMonitorBridgeExtension$onExtraCallback) obj));
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(getNameByOperatorName.onNavigationEvent(this.f$0, (ShakeMonitorBridgeExtension$onExtraCallback) obj));
        int i3 = onWarmupCompleted + 49;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 53 / 0;
        }
        return boolValueOf;
    }
}
