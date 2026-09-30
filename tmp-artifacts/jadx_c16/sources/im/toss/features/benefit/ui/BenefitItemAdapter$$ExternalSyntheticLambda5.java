package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.ShakeMonitorBridgeExtension$onExtraCallback;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda5 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ShakeMonitorBridgeExtension$onExtraCallback f$0;

    public final Object invoke(Object obj) {
        Unit unitOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
            int i3 = 17 / 0;
        } else {
            unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted(this.f$0, (SetDetectableSize) obj);
        }
        int i4 = onWarmupCompleted + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }
}
