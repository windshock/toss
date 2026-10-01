package im.toss.features.home.feature.consumption_category_custom_list;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.IPCParameter1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ConsumptionCategoryCustomListActivity$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ ConsumptionCategoryCustomListActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 11;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = ConsumptionCategoryCustomListActivity.IAuthTabCallback(this.f$0, (IPCParameter1) obj);
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return unitIAuthTabCallback;
    }
}
