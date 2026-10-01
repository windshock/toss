package im.toss.features.benefit.ui;

import kotlin.jvm.functions.Function0;
import o.getNameByOperatorName;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class BenefitItemAdapter$$ExternalSyntheticLambda46 implements Function0 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ getNameByOperatorName f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        getNameByOperatorName getnamebyoperatorname = this.f$0;
        if (i3 != 0) {
            return getNameByOperatorName.onWarmupCompleted(getnamebyoperatorname);
        }
        getNameByOperatorName.onWarmupCompleted(getnamebyoperatorname);
        throw null;
    }
}
