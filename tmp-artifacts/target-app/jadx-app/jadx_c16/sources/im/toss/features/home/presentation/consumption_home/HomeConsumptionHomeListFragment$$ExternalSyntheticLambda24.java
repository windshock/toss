package im.toss.features.home.presentation.consumption_home;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.LocalAuthPermissionManager2;
import o.SetDetectableSize;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeConsumptionHomeListFragment$$ExternalSyntheticLambda24 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeConsumptionHomeListFragment f$0;
    public final /* synthetic */ LocalAuthPermissionManager2 f$1;

    public /* synthetic */ HomeConsumptionHomeListFragment$$ExternalSyntheticLambda24(HomeConsumptionHomeListFragment homeConsumptionHomeListFragment, LocalAuthPermissionManager2 localAuthPermissionManager2) {
        this.f$0 = homeConsumptionHomeListFragment;
        this.f$1 = localAuthPermissionManager2;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = HomeConsumptionHomeListFragment.onExtraCallbackWithResult(this.f$0, this.f$1, (SetDetectableSize) obj);
        int i4 = IAuthTabCallback + 81;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }
}
