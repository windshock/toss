package im.toss.features.home.presentation.consumption_home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeConsumptionHomeActivity$onExtraCallback f$0;
    public final /* synthetic */ HomeConsumptionHomeActivity f$1;

    public /* synthetic */ HomeConsumptionHomeActivity$$ExternalSyntheticLambda5(HomeConsumptionHomeActivity$onExtraCallback homeConsumptionHomeActivity$onExtraCallback, HomeConsumptionHomeActivity homeConsumptionHomeActivity) {
        this.f$0 = homeConsumptionHomeActivity$onExtraCallback;
        this.f$1 = homeConsumptionHomeActivity;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = HomeConsumptionHomeActivity.IAuthTabCallback(this.f$0, this.f$1, ((Integer) obj).intValue());
        int i4 = onNavigationEvent + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
