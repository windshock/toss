package im.toss.features.credit.ui.plus.insurance;

import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CreditPlusRequestRewardActivity$$ExternalSyntheticLambda0 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ CreditPlusRequestRewardActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 43;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            CreditPlusRequestRewardActivity.onExtraCallback(this.f$0, (TdsTopV2View) obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = CreditPlusRequestRewardActivity.onExtraCallback(this.f$0, (TdsTopV2View) obj);
        int i3 = onNavigationEvent + 109;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 26 / 0;
        }
        return unitOnExtraCallback;
    }
}
