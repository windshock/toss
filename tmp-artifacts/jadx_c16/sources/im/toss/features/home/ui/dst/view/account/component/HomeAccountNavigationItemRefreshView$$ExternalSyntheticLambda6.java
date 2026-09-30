package im.toss.features.home.ui.dst.view.account.component;

import im.toss.features.home.ui.dst.view.account.component.HomeAccountNavigationItemRefreshView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.runOnUiThreadDelayed;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountNavigationItemRefreshView$$ExternalSyntheticLambda6 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;
    public final /* synthetic */ HomeAccountNavigationItemRefreshView f$0;
    public final /* synthetic */ HomeAccountNavigationItemRefreshView.onWarmupCompleted f$1;
    public final /* synthetic */ runOnUiThreadDelayed f$2;

    public /* synthetic */ HomeAccountNavigationItemRefreshView$$ExternalSyntheticLambda6(HomeAccountNavigationItemRefreshView homeAccountNavigationItemRefreshView, HomeAccountNavigationItemRefreshView.onWarmupCompleted onwarmupcompleted, runOnUiThreadDelayed runonuithreaddelayed) {
        this.f$0 = homeAccountNavigationItemRefreshView;
        this.f$1 = onwarmupcompleted;
        this.f$2 = runonuithreaddelayed;
    }

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            HomeAccountNavigationItemRefreshView.onWarmupCompleted(this.f$0, this.f$1, this.f$2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnWarmupCompleted = HomeAccountNavigationItemRefreshView.onWarmupCompleted(this.f$0, this.f$1, this.f$2);
        int i3 = onExtraCallback + 19;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        return unitOnWarmupCompleted;
    }
}
