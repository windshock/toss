package im.toss.features.benefit.test;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitTestActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = BenefitTestActivity.onNavigationEvent((CommonModule_setLeftEdgeTouchEnabled) obj);
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return unitOnNavigationEvent;
    }
}
