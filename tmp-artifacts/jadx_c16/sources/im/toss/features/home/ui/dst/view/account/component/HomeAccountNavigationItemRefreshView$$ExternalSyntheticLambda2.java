package im.toss.features.home.ui.dst.view.account.component;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountNavigationItemRefreshView$$ExternalSyntheticLambda2 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = HomeAccountNavigationItemRefreshView.onWarmupCompleted();
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        return unitOnWarmupCompleted;
    }
}
