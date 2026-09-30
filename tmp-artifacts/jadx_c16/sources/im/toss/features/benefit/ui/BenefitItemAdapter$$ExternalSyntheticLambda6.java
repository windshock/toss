package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SensorBridgeExtension4;
import o.SetDetectableSize;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda6 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ SensorBridgeExtension4 f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 5;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = getNameByOperatorName.IAuthTabCallback(this.f$0, (SetDetectableSize) obj);
        int i4 = onNavigationEvent + 29;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
