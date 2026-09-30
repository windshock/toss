package im.toss.features.home.ui.dst.view.account.component;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountNavigationItemRefreshView$$ExternalSyntheticLambda5 implements Function0 {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    public final /* synthetic */ HomeAccountNavigationItemRefreshView f$0;

    public final Object invoke() {
        Unit unitOnNavigationEvent;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            unitOnNavigationEvent = HomeAccountNavigationItemRefreshView.onNavigationEvent(this.f$0);
            int i3 = 42 / 0;
        } else {
            unitOnNavigationEvent = HomeAccountNavigationItemRefreshView.onNavigationEvent(this.f$0);
        }
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }
}
