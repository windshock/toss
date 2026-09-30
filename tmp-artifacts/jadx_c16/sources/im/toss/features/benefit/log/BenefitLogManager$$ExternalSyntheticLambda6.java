package im.toss.features.benefit.log;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.SetDetectableSize;
import o.TinyAppHostApduService1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitLogManager$$ExternalSyntheticLambda6 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 61;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = TinyAppHostApduService1.IAuthTabCallback((SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 107;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }
}
