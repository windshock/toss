package im.toss.features.home.ui.dst.view.account.component;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class HomeAccountNavigationItemRefreshView$$ExternalSyntheticLambda4 implements Function0 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ HomeAccountNavigationItemRefreshView f$0;

    public final Object invoke() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            HomeAccountNavigationItemRefreshView.onExtraCallback(this.f$0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = HomeAccountNavigationItemRefreshView.onExtraCallback(this.f$0);
        int i3 = onNavigationEvent + 73;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }
}
