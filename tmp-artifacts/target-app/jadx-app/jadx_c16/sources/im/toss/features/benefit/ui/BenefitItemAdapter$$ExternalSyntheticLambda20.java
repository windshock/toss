package im.toss.features.benefit.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.AppNode;
import o.getNameByOperatorName;
import o.registerShakeListener;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda20 implements Function2 {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;

    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = getNameByOperatorName.onWarmupCompleted((AppNode) obj, (registerShakeListener) obj2);
        int i4 = onWarmupCompleted + 7;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }
}
