package im.toss.compose.v1.stepper;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.resumeAnimation;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class TdsStepperRowV1RightScope$$ExternalSyntheticLambda1 implements Function0 {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = resumeAnimation.onNavigationEvent();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return unitOnNavigationEvent;
    }
}
