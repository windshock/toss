package im.toss.features.home.presentation.consumption_home;

import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeActivity$$ExternalSyntheticLambda3 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeConsumptionHomeActivity f$0;

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        HomeConsumptionHomeActivity homeConsumptionHomeActivity = this.f$0;
        int iIntValue = ((Integer) obj).intValue();
        if (i3 == 0) {
            return HomeConsumptionHomeActivity.onNavigationEvent(homeConsumptionHomeActivity, iIntValue);
        }
        HomeConsumptionHomeActivity.onNavigationEvent(homeConsumptionHomeActivity, iIntValue);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
