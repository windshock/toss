package im.toss.features.benefit.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.TinyAppHostApduService1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitLogManager$$ExternalSyntheticLambda3 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = TinyAppHostApduService1.onExtraCallback((SetDetectableSize) obj);
        int i4 = onWarmupCompleted + 23;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
