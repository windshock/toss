package im.toss.features.home.feature.cashflow;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class CashflowSelectCategoryActivity$$ExternalSyntheticLambda1 implements Function0 {
    private static int onExtraCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ CashflowSelectCategoryActivity f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = CashflowSelectCategoryActivity.onWarmupCompleted(this.f$0);
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
