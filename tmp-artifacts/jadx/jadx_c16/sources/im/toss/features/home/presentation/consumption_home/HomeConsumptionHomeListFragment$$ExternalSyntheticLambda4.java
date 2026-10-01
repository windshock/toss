package im.toss.features.home.presentation.consumption_home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeListFragment$$ExternalSyntheticLambda4 implements Function1 {
    private static int onExtraCallback = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ HomeConsumptionHomeListFragment f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ HomeConsumptionHomeListFragment$$ExternalSyntheticLambda4(HomeConsumptionHomeListFragment homeConsumptionHomeListFragment, String str) {
        this.f$0 = homeConsumptionHomeListFragment;
        this.f$1 = str;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = HomeConsumptionHomeListFragment.onExtraCallback(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i4 = onWarmupCompleted + 123;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }
}
