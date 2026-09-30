package im.toss.features.benefit.ui.data;

import kotlin.jvm.functions.Function1;
import o.SensorBridgeExtension3;
import o.SensorBridgeExtension4;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class MissionSlotItem$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ SensorBridgeExtension4 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.valueOf(SensorBridgeExtension4.onExtraCallbackWithResult(this.f$0, (SensorBridgeExtension3) obj));
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(SensorBridgeExtension4.onExtraCallbackWithResult(this.f$0, (SensorBridgeExtension3) obj));
        int i3 = onWarmupCompleted + 87;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 56 / 0;
        }
        return boolValueOf;
    }
}
